package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* renamed from: com.google.android.material.checkbox.c */
/* compiled from: PG */
final class C44589c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MaterialCheckBox.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MaterialCheckBox.SavedState[i];
    }
}
