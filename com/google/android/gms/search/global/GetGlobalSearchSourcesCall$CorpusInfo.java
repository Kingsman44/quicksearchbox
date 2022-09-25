package com.google.android.gms.search.global;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetGlobalSearchSourcesCall$CorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145901e();

    /* renamed from: a */
    public String f394445a;

    /* renamed from: b */
    public Feature[] f394446b;

    /* renamed from: c */
    public boolean f394447c;

    /* renamed from: d */
    public Bundle f394448d;

    public GetGlobalSearchSourcesCall$CorpusInfo() {
    }

    public GetGlobalSearchSourcesCall$CorpusInfo(String str, Feature[] featureArr, boolean z, Bundle bundle) {
        this.f394445a = str;
        this.f394446b = featureArr;
        this.f394447c = z;
        this.f394448d = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394445a);
        C143947c.m234079B(parcel, 2, this.f394446b, i);
        C143947c.m234084c(parcel, 3, this.f394447c);
        C143947c.m234093l(parcel, 4, this.f394448d);
        C143947c.m234083b(parcel, a);
    }
}
