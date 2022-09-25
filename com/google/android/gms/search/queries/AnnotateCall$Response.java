package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class AnnotateCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145935c();

    /* renamed from: a */
    public Status f394484a;

    /* renamed from: b */
    public List f394485b;

    /* renamed from: c */
    public Bundle f394486c;

    public AnnotateCall$Response() {
    }

    public AnnotateCall$Response(Status status, List list, Bundle bundle) {
        this.f394484a = status;
        this.f394485b = list;
        this.f394486c = bundle;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394484a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394484a, i);
        C143947c.m234080C(parcel, 2, this.f394485b);
        C143947c.m234093l(parcel, 3, this.f394486c);
        C143947c.m234083b(parcel, a);
    }
}
