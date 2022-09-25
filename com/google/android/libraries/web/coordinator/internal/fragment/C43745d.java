package com.google.android.libraries.web.coordinator.internal.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.profile.Profile;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.d */
/* compiled from: PG */
public final class C43745d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new WebCoordinatorInfoInternal(parcel.readLong(), (WebConfig) parcel.readParcelable(WebCoordinatorInfoInternal.class.getClassLoader()), (Profile) parcel.readParcelable(WebCoordinatorInfoInternal.class.getClassLoader()), parcel.readInt() != 0);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebCoordinatorInfoInternal[i];
    }
}
