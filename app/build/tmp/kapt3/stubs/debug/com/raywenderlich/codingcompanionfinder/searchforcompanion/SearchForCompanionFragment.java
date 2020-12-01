package com.raywenderlich.codingcompanionfinder.searchforcompanion;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/SearchForCompanionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "accessToken", "", "companionAdapter", "Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/CompanionAdapter;", "fragmentSearchForCompanionBinding", "Lcom/raywenderlich/codingcompanionfinder/databinding/FragmentSearchForCompanionBinding;", "petRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "searchForCompanionViewModel", "Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/SearchForCompanionViewModel;", "getSearchForCompanionViewModel", "()Lcom/raywenderlich/codingcompanionfinder/searchforcompanion/SearchForCompanionViewModel;", "searchForCompanionViewModel$delegate", "Lkotlin/Lazy;", "viewManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupSearchForCompanions", "app_debug"})
public final class SearchForCompanionFragment extends androidx.fragment.app.Fragment {
    private java.lang.String accessToken;
    private androidx.recyclerview.widget.RecyclerView petRecyclerView;
    private com.raywenderlich.codingcompanionfinder.searchforcompanion.CompanionAdapter companionAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager viewManager;
    private com.raywenderlich.codingcompanionfinder.databinding.FragmentSearchForCompanionBinding fragmentSearchForCompanionBinding;
    private final kotlin.Lazy searchForCompanionViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raywenderlich.codingcompanionfinder.searchforcompanion.SearchForCompanionViewModel getSearchForCompanionViewModel() {
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
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupSearchForCompanions() {
    }
    
    public SearchForCompanionFragment() {
        super();
    }
}