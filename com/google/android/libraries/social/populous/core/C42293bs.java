package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.social.populous.core.bs */
/* compiled from: PG */
final class C42293bs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C42294bt btVar = new C42294bt();
        btVar.f110919a.mo45219b((C42265ar) parcel.readSerializable());
        return new Experiments(btVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Experiments[i];
    }
}
