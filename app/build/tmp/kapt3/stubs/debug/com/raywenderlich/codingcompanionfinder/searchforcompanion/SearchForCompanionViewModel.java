package com.raywenderlich.codingcompanionfinder.searchforcompanion;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001b"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/SearchForCompanionViewModel;", "Landroidx/lifecycle/ViewModel;", "petFinderService", "Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "(Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;)V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "animals", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/raywenderlich/codingcompanionfinder/models/Animal;", "Lkotlin/collections/ArrayList;", "getAnimals", "()Landroidx/lifecycle/MutableLiveData;", "companionLocation", "getCompanionLocation", "noResultsViewVisiblity", "", "getNoResultsViewVisiblity", "getPetFinderService", "()Lcom/raywenderlich/codingcompanionfinder/retrofit/PetFinderService;", "searchForCompanions", "", "app_debug"})
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
    private final com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService petFinderService = null;
    
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
    
    public final void searchForCompanions() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService getPetFinderService() {
        return null;
    }
    
    public SearchForCompanionViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService petFinderService) {
        super();
    }
}