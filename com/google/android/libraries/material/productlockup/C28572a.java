package com.google.android.libraries.material.productlockup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.material.productlockup.ProductLockupView;

/* renamed from: com.google.android.libraries.material.productlockup.a */
/* compiled from: PG */
final class C28572a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ProductLockupView.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProductLockupView.SavedState[i];
    }
}
