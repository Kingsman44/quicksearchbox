package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class GlobalSearchCorpusConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142825v();

    /* renamed from: a */
    public final int[] f387469a;

    /* renamed from: b */
    public final Feature[] f387470b;

    public GlobalSearchCorpusConfig(int[] iArr, Feature[] featureArr) {
        this.f387469a = iArr;
        this.f387470b = featureArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalSearchCorpusConfig) {
            GlobalSearchCorpusConfig globalSearchCorpusConfig = (GlobalSearchCorpusConfig) obj;
            return Arrays.equals(this.f387470b, globalSearchCorpusConfig.f387470b) && Arrays.equals(this.f387469a, globalSearchCorpusConfig.f387469a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f387469a)), Integer.valueOf(Arrays.hashCode(this.f387470b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234099r(parcel, 1, this.f387469a);
        C143947c.m234079B(parcel, 2, this.f387470b, i);
        C143947c.m234083b(parcel, a);
    }
}
