package com.raywenderlich.codingcompanionfinder.searchforcompanion;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\'\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/SearchForCompanionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "animals", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/raywenderlich/codingcompanionfinder/models/Animal;", "Lkotlin/collections/ArrayList;", "getAnimals", "()Landroidx/lifecycle/MutableLiveData;", "companionLocation", "getCompanionLocation", "noResultsViewVisiblity", "", "getNoResultsViewVisiblity", "petFinderService", "Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "getPetFinderService", "()Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "setPetFinderService", "(Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;)V", "searchForCompanions", "", "app_debug"})
public final class SearchForCompanionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> noResultsViewVisiblity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> companionLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.raywenderlich.codingcompanionfinder.models.Animal>> animals = null;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String accessToken;
    @org.jetbrains.annotations.NotNull()
    public com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService petFinderService;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNoResultsViewVisiblity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCompanionLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.raywenderlich.codingcompanionfinder.models.Animal>> getAnimals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService getPetFinderService() {
        return null;
    }
    
    public final void setPetFinderService(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService p0) {
    }
    
    public final void searchForCompanions() {
    }
    
    public SearchForCompanionViewModel() {
        super();
    }
}