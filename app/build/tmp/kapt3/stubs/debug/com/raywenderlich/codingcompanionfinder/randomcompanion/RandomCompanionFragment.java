package com.raywenderlich.codingcompanionfinder.randomcompanion;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010+\u001a\u00020\"H\u0002J\b\u0010,\u001a\u00020\"H\u0002J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0016j\b\u0012\u0004\u0012\u00020\n`\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00061"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/randomcompanion/RandomCompanionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "animal", "Lcom/raywenderlich/codingcompanionfinder/models/Animal;", "getAnimal", "()Lcom/raywenderlich/codingcompanionfinder/models/Animal;", "setAnimal", "(Lcom/raywenderlich/codingcompanionfinder/models/Animal;)V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "petCaroselView", "Lcom/synnapps/carouselview/CarouselView;", "getPetCaroselView", "()Lcom/synnapps/carouselview/CarouselView;", "setPetCaroselView", "(Lcom/synnapps/carouselview/CarouselView;)V", "petPhotos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getPetPhotos", "()Ljava/util/ArrayList;", "setPetPhotos", "(Ljava/util/ArrayList;)V", "randomCompanionFragment", "getRandomCompanionFragment", "()Lcom/raywenderlich/codingcompanionfinder/randomcompanion/RandomCompanionFragment;", "setRandomCompanionFragment", "(Lcom/raywenderlich/codingcompanionfinder/randomcompanion/RandomCompanionFragment;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "populatePet", "populatePhotos", "populateTextField", "id", "", "stringValue", "app_debug"})
public final class RandomCompanionFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.raywenderlich.codingcompanionfinder.models.Animal animal;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String key;
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<java.lang.String> petPhotos;
    @org.jetbrains.annotations.NotNull()
    public com.synnapps.carouselview.CarouselView petCaroselView;
    @org.jetbrains.annotations.NotNull()
    public com.raywenderlich.codingcompanionfinder.randomcompanion.RandomCompanionFragment randomCompanionFragment;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.codingcompanionfinder.models.Animal getAnimal() {
        return null;
    }
    
    public final void setAnimal(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.codingcompanionfinder.models.Animal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getPetPhotos() {
        return null;
    }
    
    public final void setPetPhotos(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.synnapps.carouselview.CarouselView getPetCaroselView() {
        return null;
    }
    
    public final void setPetCaroselView(@org.jetbrains.annotations.NotNull()
    com.synnapps.carouselview.CarouselView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.codingcompanionfinder.randomcompanion.RandomCompanionFragment getRandomCompanionFragment() {
        return null;
    }
    
    public final void setRandomCompanionFragment(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.codingcompanionfinder.randomcompanion.RandomCompanionFragment p0) {
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
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void populatePet() {
    }
    
    private final void populatePhotos() {
    }
    
    private final void populateTextField(int id, java.lang.String stringValue) {
    }
    
    public RandomCompanionFragment() {
        super();
    }
}