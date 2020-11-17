package com.raywenderlich.codingcompanionfinder.searchforcompanion;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/ViewCompanionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "animal", "Lcom/raywenderlich/codingcompanionfinder/models/Animal;", "args", "Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/ViewCompanionFragmentArgs;", "getArgs", "()Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/ViewCompanionFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "petCaroselView", "Lcom/synnapps/carouselview/CarouselView;", "petPhotos", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "viewCompanionFragment", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "populatePet", "populatePhotos", "populateTextField", "id", "", "stringValue", "Companion", "app_debug"})
public final class ViewCompanionFragment extends androidx.fragment.app.Fragment {
    private com.raywenderlich.codingcompanionfinder.models.Animal animal;
    private java.util.ArrayList<java.lang.String> petPhotos;
    private com.synnapps.carouselview.CarouselView petCaroselView;
    private com.raywenderlich.codingcompanionfinder.searchforcompanion.ViewCompanionFragment viewCompanionFragment;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ANIMAL = "ANIMAL";
    public static final com.raywenderlich.codingcompanionfinder.searchforcompanion.ViewCompanionFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.codingcompanionfinder.searchforcompanion.ViewCompanionFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void populatePet() {
    }
    
    private final void populatePhotos() {
    }
    
    private final void populateTextField(int id, java.lang.String stringValue) {
    }
    
    public ViewCompanionFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/ViewCompanionFragment$Companion;", "", "()V", "ANIMAL", "", "getANIMAL", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getANIMAL() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}