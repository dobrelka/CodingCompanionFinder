package com.raywenderlich.codingcompanionfinder.databinding;
import com.raywenderlich.codingcompanionfinder.R;
import com.raywenderlich.codingcompanionfinder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchForCompanionBindingImpl extends FragmentSearchForCompanionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchForCompanion, 3);
        sViewsWithIds.put(R.id.searchField, 4);
        sViewsWithIds.put(R.id.searchButton, 5);
        sViewsWithIds.put(R.id.petRecyclerView, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener searchFieldTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchForCompanionViewModel.companionLocation.getValue()
            //         is searchForCompanionViewModel.companionLocation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(searchFieldText);
            // localize variables for thread safety
            // searchForCompanionViewModel
            com.raywenderlich.codingcompanionfinder.searchforcompanion.SearchForCompanionViewModel searchForCompanionViewModel = mSearchForCompanionViewModel;
            // searchForCompanionViewModel.companionLocation != null
            boolean searchForCompanionViewModelCompanionLocationJavaLangObjectNull = false;
            // searchForCompanionViewModel != null
            boolean searchForCompanionViewModelJavaLangObjectNull = false;
            // searchForCompanionViewModel.companionLocation
            androidx.lifecycle.MutableLiveData<java.lang.String> searchForCompanionViewModelCompanionLocation = null;
            // searchForCompanionViewModel.companionLocation.getValue()
            java.lang.String searchForCompanionViewModelCompanionLocationGetValue = null;



            searchForCompanionViewModelJavaLangObjectNull = (searchForCompanionViewModel) != (null);
            if (searchForCompanionViewModelJavaLangObjectNull) {


                searchForCompanionViewModelCompanionLocation = searchForCompanionViewModel.getCompanionLocation();

                searchForCompanionViewModelCompanionLocationJavaLangObjectNull = (searchForCompanionViewModelCompanionLocation) != (null);
                if (searchForCompanionViewModelCompanionLocationJavaLangObjectNull) {




                    searchForCompanionViewModelCompanionLocation.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSearchForCompanionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentSearchForCompanionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.noResults.setTag(null);
        this.searchFieldText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.searchForCompanionViewModel == variableId) {
            setSearchForCompanionViewModel((com.raywenderlich.codingcompanionfinder.searchforcompanion.SearchForCompanionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchForCompanionViewModel(@Nullable com.raywenderlich.codingcompanionfinder.searchforcompanion.SearchForCompanionViewModel SearchForCompanionViewModel) {
        this.mSearchForCompanionViewModel = SearchForCompanionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.searchForCompanionViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchForCompanionViewModelNoResultsViewVisiblity((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeSearchForCompanionViewModelCompanionLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchForCompanionViewModelNoResultsViewVisiblity(androidx.lifecycle.MutableLiveData<java.lang.Integer> SearchForCompanionViewModelNoResultsViewVisiblity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchForCompanionViewModelCompanionLocation(androidx.lifecycle.MutableLiveData<java.lang.String> SearchForCompanionViewModelCompanionLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Integer searchForCompanionViewModelNoResultsViewVisiblityGetValue = null;
        com.raywenderlich.codingcompanionfinder.searchforcompanion.SearchForCompanionViewModel searchForCompanionViewModel = mSearchForCompanionViewModel;
        int androidxDatabindingViewDataBindingSafeUnboxSearchForCompanionViewModelNoResultsViewVisiblityGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> searchForCompanionViewModelNoResultsViewVisiblity = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchForCompanionViewModelCompanionLocation = null;
        java.lang.String searchForCompanionViewModelCompanionLocationGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (searchForCompanionViewModel != null) {
                        // read searchForCompanionViewModel.noResultsViewVisiblity
                        searchForCompanionViewModelNoResultsViewVisiblity = searchForCompanionViewModel.getNoResultsViewVisiblity();
                    }
                    updateLiveDataRegistration(0, searchForCompanionViewModelNoResultsViewVisiblity);


                    if (searchForCompanionViewModelNoResultsViewVisiblity != null) {
                        // read searchForCompanionViewModel.noResultsViewVisiblity.getValue()
                        searchForCompanionViewModelNoResultsViewVisiblityGetValue = searchForCompanionViewModelNoResultsViewVisiblity.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(searchForCompanionViewModel.noResultsViewVisiblity.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSearchForCompanionViewModelNoResultsViewVisiblityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(searchForCompanionViewModelNoResultsViewVisiblityGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (searchForCompanionViewModel != null) {
                        // read searchForCompanionViewModel.companionLocation
                        searchForCompanionViewModelCompanionLocation = searchForCompanionViewModel.getCompanionLocation();
                    }
                    updateLiveDataRegistration(1, searchForCompanionViewModelCompanionLocation);


                    if (searchForCompanionViewModelCompanionLocation != null) {
                        // read searchForCompanionViewModel.companionLocation.getValue()
                        searchForCompanionViewModelCompanionLocationGetValue = searchForCompanionViewModelCompanionLocation.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.noResults.setVisibility(androidxDatabindingViewDataBindingSafeUnboxSearchForCompanionViewModelNoResultsViewVisiblityGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchFieldText, searchForCompanionViewModelCompanionLocationGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.searchFieldText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, searchFieldTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchForCompanionViewModel.noResultsViewVisiblity
        flag 1 (0x2L): searchForCompanionViewModel.companionLocation
        flag 2 (0x3L): searchForCompanionViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}