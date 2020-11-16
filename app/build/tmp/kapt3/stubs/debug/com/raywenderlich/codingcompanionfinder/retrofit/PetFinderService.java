package com.raywenderlich.codingcompanionfinder.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007H\'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "", "getAnimals", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lcom/raywenderlich/codingcompanionfinder/models/AnimalResult;", "accessToken", "", "limit", "", "location", "getToken", "Lretrofit2/Call;", "Lcom/raywenderlich/codingcompanionfinder/models/Token;", "grantType", "clientId", "clientSecret", "app_debug"})
public abstract interface PetFinderService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "oauth2/token")
    public abstract retrofit2.Call<com.raywenderlich.codingcompanionfinder.models.Token> getToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "grant_type")
    java.lang.String grantType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "client_id")
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "client_secret")
    java.lang.String clientSecret);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "animals")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.raywenderlich.codingcompanionfinder.models.AnimalResult>> getAnimals(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String accessToken, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "location")
    java.lang.String location);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}