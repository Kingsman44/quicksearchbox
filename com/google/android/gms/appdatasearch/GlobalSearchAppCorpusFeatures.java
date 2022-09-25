package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GlobalSearchAppCorpusFeatures extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142822s();

    /* renamed from: a */
    public final String f387456a;

    /* renamed from: b */
    public final Feature[] f387457b;

    public GlobalSearchAppCorpusFeatures(String str, Feature[] featureArr) {
        this.f387456a = str;
        this.f387457b = featureArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387456a);
        C143947c.m234079B(parcel, 2, this.f387457b, i);
        C143947c.m234083b(parcel, a);
    }
}
