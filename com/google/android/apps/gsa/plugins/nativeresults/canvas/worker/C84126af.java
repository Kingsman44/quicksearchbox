package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.af */
/* compiled from: PG */
final class C84126af implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableFetcherResponse(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableFetcherResponse[i];
    }
}
