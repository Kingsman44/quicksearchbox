package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.core.p098j.C2043bi;
import androidx.customview.view.AbsSavedState;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: d */
    private static final int[] f116509d = {16842912};

    /* renamed from: a */
    public boolean f116510a;

    /* renamed from: b */
    public boolean f116511b;

    /* renamed from: c */
    public boolean f116512c;

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo48001a(boolean z) {
        if (this.f116511b != z) {
            this.f116511b = z;
            sendAccessibilityEvent(0);
        }
    }

    public final boolean isChecked() {
        return this.f116510a;
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.f116510a) {
            return mergeDrawableStates(super.onCreateDrawableState(i + 1), f116509d);
        }
        return super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        setChecked(savedState.f116513a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f116513a = this.f116510a;
        return savedState;
    }

    public final void setChecked(boolean z) {
        if (this.f116511b && this.f116510a != z) {
            this.f116510a = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public final void setPressed(boolean z) {
        if (this.f116512c) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.f116510a);
    }

    /* compiled from: PG */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C44744d();

        /* renamed from: a */
        boolean f116513a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f116513a = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeInt(this.f116513a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116511b = true;
        this.f116512c = true;
        C2043bi.m5526T(this, new C44743c(this));
    }
}
