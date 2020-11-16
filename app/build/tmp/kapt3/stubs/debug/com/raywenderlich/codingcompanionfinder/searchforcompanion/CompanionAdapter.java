package com.raywenderlich.codingcompanionfinder.searchforcompanion;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/CompanionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/CompanionViewHolder;", "animals", "Ljava/util/ArrayList;", "Lcom/raywenderlich/codingcompanionfinder/models/Animal;", "Lkotlin/collections/ArrayList;", "fragment", "Landroidx/fragment/app/Fragment;", "(Ljava/util/ArrayList;Landroidx/fragment/app/Fragment;)V", "getAnimals", "()Ljava/util/ArrayList;", "setAnimals", "(Ljava/util/ArrayList;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class CompanionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raywenderlich.codingcompanionfinder.searchforcompanion.CompanionViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.raywenderlich.codingcompanionfinder.models.Animal> animals;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.codingcompanionfinder.searchforcompanion.CompanionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.codingcompanionfinder.searchforcompanion.CompanionViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.raywenderlich.codingcompanionfinder.models.Animal> getAnimals() {
        return null;
    }
    
    public final void setAnimals(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.raywenderlich.codingcompanionfinder.models.Animal> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    public CompanionAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.raywenderlich.codingcompanionfinder.models.Animal> animals, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super();
    }
}