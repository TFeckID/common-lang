package info.fangou.response;

import java.io.Serializable;

public class ResponseResult implements Serializable {

    private static final long serialVersionUID = -2059883780779000599L;

    private final String DEFAULT_SUCCESS_CODE = "20000";

    private final String DEFAULT_SUCCESS_MESSAGE = "success";

    private final String DEFAULT_FAIL_CODE = "50000";

    private final String DEFAULT_FAIL_MESSAGE = "fail";

    /**
     * 业务响应状态码
     */
    private String code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 是否成功
     */
    private boolean isSuccess;

    /**
     * 响应数据
     */
    private Object data;

    public static ResponseResult success(Object data){

        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(responseResult.DEFAULT_SUCCESS_CODE);
        responseResult.setSuccess(true);
        responseResult.setMessage(responseResult.DEFAULT_SUCCESS_MESSAGE);
        responseResult.setData(data);

        return responseResult;
    }

    public static ResponseResult fail(){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(responseResult.DEFAULT_FAIL_CODE);
        responseResult.setSuccess(false);
        responseResult.setMessage(responseResult.DEFAULT_FAIL_MESSAGE);
        responseResult.setData(null);

        return responseResult;
    }

    public static ResponseResult getResponse(String code,String message,boolean isSuccess,Object data){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(code);
        responseResult.setSuccess(isSuccess);
        responseResult.setMessage(message);
        responseResult.setData(data);

        return responseResult;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
