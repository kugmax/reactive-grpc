package com.kugmax.learn.rxgrpc.server.endpoint;

import com.kugmax.learn.rxgrpc.HelloRequest;
import com.kugmax.learn.rxgrpc.HelloResponse;
import com.kugmax.learn.rxgrpc.ReactorAPIServiceGrpc;
import com.kugmax.learn.rxgrpc.server.model.Conversation;
import com.kugmax.learn.rxgrpc.server.service.ConversationService;
import com.salesforce.grpc.testing.contrib.NettyGrpcServerRule;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import reactor.core.publisher.Mono;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ApiEndpointTest {

    @Rule
    public NettyGrpcServerRule serverRule = new NettyGrpcServerRule();

    @InjectMocks
    private ApiEndpoint endpoint;

    @Mock
    private ConversationService mockConversationService;


    @After
    public void after() {
        verifyNoMoreInteractions(mockConversationService);
    }

    @Test
    public void greeting() {
        serverRule.getServiceRegistry().addService(endpoint);

        Conversation conversation = new Conversation();
        conversation.setAnswer("it is answer");
        conversation.setGreeding("hi");

        when(mockConversationService.greeting("hi")).thenReturn(Mono.just(conversation));

        ReactorAPIServiceGrpc.ReactorAPIServiceStub stub = ReactorAPIServiceGrpc.newReactorStub(serverRule.getChannel());

        HelloRequest request = HelloRequest.newBuilder().setGreeting("hi").build();

        HelloResponse response = stub.hello(request).block();

        assertEquals("it is answer", response.getAnswer());

        verify(mockConversationService).greeting("hi");

        System.out.println(response);
        System.out.println(response.getAnswer());
    }
}
