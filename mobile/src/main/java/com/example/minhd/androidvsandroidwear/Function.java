package com.example.minhd.androidvsandroidwear;

public class Function {
    private int mfunctionImage;
    private String mfunctionName;

    public Function(int functionImage, String functionName) {
        this.mfunctionImage = functionImage;
        this.mfunctionName = functionName;
    }

    public int getFunctionImage() {
        return mfunctionImage;
    }

    public void setFunctionImage(int functionImage) {
        this.mfunctionImage = functionImage;
    }

    public String getFunctionName() {
        return mfunctionName;
    }

    public void setFunctionName(String functionName) {
        this.mfunctionName = functionName;
    }
}
