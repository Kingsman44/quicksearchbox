package com.google.android.setupdesign;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.setupdesign.SetupWizardLayout;

/* renamed from: com.google.android.setupdesign.h */
/* compiled from: PG */
final class C45319h implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SetupWizardLayout.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupWizardLayout.SavedState[i];
    }
}
