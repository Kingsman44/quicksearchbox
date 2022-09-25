package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C142821r();

    /* renamed from: a */
    public Status f387453a;

    /* renamed from: b */
    public List f387454b;
    @Deprecated

    /* renamed from: c */
    public String[] f387455c;

    public GetRecentContextCall$Response() {
    }

    public GetRecentContextCall$Response(Status status, List list, String[] strArr) {
        this.f387453a = status;
        this.f387454b = list;
        this.f387455c = strArr;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f387453a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387453a, i);
        C143947c.m234080C(parcel, 2, this.f387454b);
        C143947c.m234107z(parcel, 3, this.f387455c);
        C143947c.m234083b(parcel, a);
    }
}
