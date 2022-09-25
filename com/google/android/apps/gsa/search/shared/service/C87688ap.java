package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.service.ap */
/* compiled from: PG */
final class C87688ap implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new StartActivityForResultEventCompoundParcelable(parcel.readParcelable(getClass().getClassLoader()), parcel.readParcelable(getClass().getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StartActivityForResultEventCompoundParcelable[i];
    }
}
