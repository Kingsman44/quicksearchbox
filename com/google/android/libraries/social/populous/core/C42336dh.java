package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import p5602o.p5603a.C71861b;

/* renamed from: com.google.android.libraries.social.populous.core.dh */
/* compiled from: PG */
final class C42336dh implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SocialAffinityAllEventSource(C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()), C71861b.m105226a(parcel.readInt()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SocialAffinityAllEventSource[i];
    }
}
