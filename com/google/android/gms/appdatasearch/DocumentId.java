package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DocumentId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142813j();

    /* renamed from: a */
    public final String f387434a;

    /* renamed from: b */
    final String f387435b;

    /* renamed from: c */
    public final String f387436c;

    public DocumentId(String str, String str2, String str3) {
        this.f387434a = str;
        this.f387435b = str2;
        this.f387436c = str3;
    }

    public final String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[]{this.f387434a, this.f387435b, this.f387436c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387434a);
        C143947c.m234106y(parcel, 2, this.f387435b);
        C143947c.m234106y(parcel, 3, this.f387436c);
        C143947c.m234083b(parcel, a);
    }
}
