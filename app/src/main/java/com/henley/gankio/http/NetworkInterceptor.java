package com.henley.gankio.http;

import androidx.annotation.NonNull;

import com.henley.gankio.GankApplication;
import com.henley.gankio.utils.NetworkHelper;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 网络拦截器
 *
 * @author Henley
 * @date 2018/7/9 11:38
 */
public class NetworkInterceptor implements Interceptor {

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request();
        if (!NetworkHelper.isNetworkAvailable(GankApplication.getApplication())) {
            throw new NetErrorException();
        }
        return chain.proceed(request);
    }

}
