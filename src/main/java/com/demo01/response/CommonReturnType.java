package com.demo01.response;

/**
 *
 * @author sparks.org.cn
 */
public class CommonReturnType {
    //表明对应请求的返回处理结果"success" 或 "fail"
    private String status;
    //若status=success，则data内返回前端需要的json数据
    //若status=fail，则data内使用通用的错误代码格式
    private Object data;
    // 定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }
    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }
    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
