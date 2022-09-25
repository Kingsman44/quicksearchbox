package com.google.android.libraries.appactions.serviceengine.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.appactions.serviceengine.impl.ExecutionAccessorImpl;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.e */
/* compiled from: PG */
final class C147912e implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExecutionAccessorImpl.ImplParcelablePart(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExecutionAccessorImpl.ImplParcelablePart[i];
    }
}
