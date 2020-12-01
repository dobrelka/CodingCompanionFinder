package com.raywenderlich.codingcompanionfinder.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/retrofit/AuthorizationInterceptor;", "Lokhttp3/Interceptor;", "Lorg/koin/standalone/KoinComponent;", "()V", "petFinderService", "Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "getPetFinderService", "()Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "petFinderService$delegate", "Lkotlin/Lazy;", "token", "Lcom/raywenderlich/codingcompanionfinder/models/Token;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class AuthorizationInterceptor implements okhttp3.Interceptor, org.koin.standalone.KoinComponent {
    private final kotlin.Lazy petFinderService$delegate = null;
    private com.raywenderlich.codingcompanionfinder.models.Token token;
    
    private final com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService getPetFinderService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    public AuthorizationInterceptor() {
        super();
    }
}