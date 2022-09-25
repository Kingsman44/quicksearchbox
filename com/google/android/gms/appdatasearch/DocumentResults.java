package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DocumentResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142814k();

    /* renamed from: a */
    final String f387437a;

    /* renamed from: b */
    final Bundle f387438b;

    /* renamed from: c */
    final Bundle f387439c;

    /* renamed from: d */
    final Bundle f387440d;

    public DocumentResults(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.f387437a = str;
        this.f387438b = bundle;
        this.f387439c = bundle2;
        this.f387440d = bundle3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387437a);
        C143947c.m234093l(parcel, 2, this.f387438b);
        C143947c.m234093l(parcel, 3, this.f387439c);
        C143947c.m234093l(parcel, 4, this.f387440d);
        C143947c.m234083b(parcel, a);
    }
}
