package com.raywenderlich.codingcompanionfinder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\u001bH\u0014J\b\u0010\"\u001a\u00020\u001bH\u0014J\b\u0010#\u001a\u00020\u001bH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006%"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "apiKey", "getApiKey", "setApiKey", "apiSecret", "getApiSecret", "petFinderService", "Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "getPetFinderService", "()Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "setPetFinderService", "(Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;)V", "token", "Lcom/raywenderlich/codingcompanionfinder/models/Token;", "getToken", "()Lcom/raywenderlich/codingcompanionfinder/models/Token;", "setToken", "(Lcom/raywenderlich/codingcompanionfinder/models/Token;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOnEvent", "idlingEntity", "Lcom/raywenderlich/codingcompanionfinder/testhooks/IdlingEntity;", "onResume", "onStart", "onStop", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService petFinderService;
    @org.jetbrains.annotations.NotNull()
    private com.raywenderlich.codingcompanionfinder.models.Token token;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiKey;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apiSecret = "CMJIaCwSv0BmjgbDaEgr4KKEWxH74uY4FvYm7YTD";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessToken;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PETFINDER_URI = "petfinder_uri";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PETFINDER_KEY = "petfinder_key";
    public static final com.raywenderlich.codingcompanionfinder.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService getPetFinderService() {
        return null;
    }
    
    public final void setPetFinderService(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.codingcompanionfinder.models.Token getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.codingcompanionfinder.models.Token p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiKey() {
        return null;
    }
    
    public final void setApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onOnEvent(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.codingcompanionfinder.testhooks.IdlingEntity idlingEntity) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/MainActivity$Companion;", "", "()V", "PETFINDER_KEY", "", "getPETFINDER_KEY", "()Ljava/lang/String;", "PETFINDER_URI", "getPETFINDER_URI", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPETFINDER_URI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPETFINDER_KEY() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}