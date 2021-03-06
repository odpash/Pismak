package work.lab8FX.common.util.responses;

import work.lab8FX.common.abstractions.AbstractResponse;

public class CheckIdResponse extends AbstractResponse {

    public CheckIdResponse(boolean isSuccess, String message) {
        super(isSuccess, message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
