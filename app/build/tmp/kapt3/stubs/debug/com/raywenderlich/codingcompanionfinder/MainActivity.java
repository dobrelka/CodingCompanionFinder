package com.raywenderlich.codingcompanionfinder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "petFinderService", "Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "getPetFinderService", "()Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "setPetFinderService", "(Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOnEvent", "idlingEntity", "Lcom/raywenderlich/codingcompanionfinder/testhooks/IdlingEntity;", "onResume", "onStart", "onStop", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService petFinderService;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessToken;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PETFINDER_URI = "petfinder_uri";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PETFINDER_KEY = "petfinder_key";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String API_KEY = "iyL5LNUFawhi9PLDrW5xznlp0Xss2E5BXqdnUcYtEfiD4YrZpU";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String API_SECRET = "CMJIaCwSv0BmjgbDaEgr4KKEWxH74uY4FvYm7YTD";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DEFAULT_PETFINDER_URL = "http://api.petfinder.com/v2/";
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/MainActivity$Companion;", "", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "API_SECRET", "getAPI_SECRET", "DEFAULT_PETFINDER_URL", "getDEFAULT_PETFINDER_URL", "PETFINDER_KEY", "getPETFINDER_KEY", "PETFINDER_URI", "getPETFINDER_URI", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPETFINDER_URI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPETFINDER_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAPI_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAPI_SECRET() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDEFAULT_PETFINDER_URL() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}