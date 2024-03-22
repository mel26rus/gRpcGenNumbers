package server;

import com.example.grpc.GetNumServiceGrpc;
import com.example.grpc.GetNumServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class GetNumServImpl extends GetNumServiceGrpc.GetNumServiceImplBase {
    int currentValue = 0;

    @Override
    public void getNum(GetNumServiceOuterClass.getNumRequest request,
                       StreamObserver<GetNumServiceOuterClass.getNumResponse> responseStreamObserver) {
        System.out.println(request);


        currentValue = request.getFirstValue();
        while (currentValue <= request.getLastValue()) {
            GetNumServiceOuterClass.getNumResponse getNumResponse =
                    GetNumServiceOuterClass.getNumResponse.newBuilder().setCurrentValue(currentValue).build();
            responseStreamObserver.onNext(getNumResponse);
            currentValue++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseStreamObserver.onCompleted();
    }
}

