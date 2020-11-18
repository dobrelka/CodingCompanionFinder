package com.raywenderlich.codingcompanionfinder.databinding;
import com.raywenderlich.codingcompanionfinder.R;
import com.raywenderlich.codingcompanionfinder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentViewCompanionBindingImpl extends FragmentViewCompanionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.petCarouselView, 11);
        sViewsWithIds.put(R.id.descriptionScroll, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentViewCompanionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentViewCompanionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (com.synnapps.carouselview.CarouselView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.age.setTag(null);
        this.breed.setTag(null);
        this.city.setTag(null);
        this.description.setTag(null);
        this.email.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.meetTitlePlaceholder.setTag(null);
        this.petName.setTag(null);
        this.sex.setTag(null);
        this.size.setTag(null);
        this.telephone.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewCompanionViewModel == variableId) {
            setViewCompanionViewModel((com.raywenderlich.codingcompanionfinder.searchforcompanion.ViewCompanionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewCompanionViewModel(@Nullable com.raywenderlich.codingcompanionfinder.searchforcompanion.ViewCompanionViewModel ViewCompanionViewModel) {
        this.mViewCompanionViewModel = ViewCompanionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewCompanionViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String viewCompanionViewModelSex = null;
        java.lang.String viewCompanionViewModelSize = null;
        java.lang.String viewCompanionViewModelName = null;
        java.lang.String viewCompanionViewModelEmail = null;
        java.lang.String viewCompanionViewModelCity = null;
        com.raywenderlich.codingcompanionfinder.searchforcompanion.ViewCompanionViewModel viewCompanionViewModel = mViewCompanionViewModel;
        java.lang.String viewCompanionViewModelDescription = null;
        java.lang.String viewCompanionViewModelBreed = null;
        java.lang.String viewCompanionViewModelTitle = null;
        java.lang.String viewCompanionViewModelTelephone = null;
        java.lang.String viewCompanionViewModelAge = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewCompanionViewModel != null) {
                    // read viewCompanionViewModel.sex
                    viewCompanionViewModelSex = viewCompanionViewModel.getSex();
                    // read viewCompanionViewModel.size
                    viewCompanionViewModelSize = viewCompanionViewModel.getSize();
                    // read viewCompanionViewModel.name
                    viewCompanionViewModelName = viewCompanionViewModel.getName();
                    // read viewCompanionViewModel.email
                    viewCompanionViewModelEmail = viewCompanionViewModel.getEmail();
                    // read viewCompanionViewModel.city
                    viewCompanionViewModelCity = viewCompanionViewModel.getCity();
                    // read viewCompanionViewModel.description
                    viewCompanionViewModelDescription = viewCompanionViewModel.getDescription();
                    // read viewCompanionViewModel.breed
                    viewCompanionViewModelBreed = viewCompanionViewModel.getBreed();
                    // read viewCompanionViewModel.title
                    viewCompanionViewModelTitle = viewCompanionViewModel.getTitle();
                    // read viewCompanionViewModel.telephone
                    viewCompanionViewModelTelephone = viewCompanionViewModel.getTelephone();
                    // read viewCompanionViewModel.age
                    viewCompanionViewModelAge = viewCompanionViewModel.getAge();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.age, viewCompanionViewModelAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.breed, viewCompanionViewModelBreed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.city, viewCompanionViewModelCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewCompanionViewModelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.email, viewCompanionViewModelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.meetTitlePlaceholder, viewCompanionViewModelTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.petName, viewCompanionViewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sex, viewCompanionViewModelSex);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.size, viewCompanionViewModelSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.telephone, viewCompanionViewModelTelephone);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewCompanionViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}