package com.solidtime.companyshow.bean;

/**
 * @Author Soulelement99
 * @Date 2019/11/30-9:32
 */
//layui的表格所需的数据格式模型
public class LayuiTableData {
    private int code;
    private String msg;
    private int count;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
