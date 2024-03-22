package client;

import com.example.grpc.GetNumServiceGrpc;
import com.example.grpc.GetNumServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class AppClient {

    public static void main(String[] args) {
        int currVal = 1;
        int lastValue = 20;
        ManagedChannel channel =
                ManagedChannelBuilder.forTarget("localhost:86").usePlaintext().build();

        GetNumServiceGrpc.GetNumServiceBlockingStub numServiceStub =
                GetNumServiceGrpc.newBlockingStub(channel);

        GetNumServiceOuterClass.getNumRequest getNumRequest =
                GetNumServiceOuterClass.getNumRequest.newBuilder().setFirstValue(currVal).setLastValue(lastValue).build();

        Iterator<GetNumServiceOuterClass.getNumResponse> getNumResponse =
                numServiceStub.getNum(getNumRequest);
        IncrementThread incrementThread = new IncrementThread(currVal);
        incrementThread.start();
        System.out.println("numbers Client is starting...");
        while (getNumResponse.hasNext()) {
            int i = getNumResponse.next().getCurrentValue();
            currVal = incrementThread.getNumber();
            System.out.println("ClientStreamObserver - new value:" + i);
            currVal = currVal + i + 1;
            incrementThread.setNumber(currVal);
        }
        channel.shutdownNow();
        incrementThread.stop();
    }
}


