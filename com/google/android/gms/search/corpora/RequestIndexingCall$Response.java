package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RequestIndexingCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145884h();

    /* renamed from: a */
    public Status f394417a;

    /* renamed from: b */
    public boolean f394418b;

    public RequestIndexingCall$Response() {
    }

    public RequestIndexingCall$Response(Status status, boolean z) {
        this.f394417a = status;
        this.f394418b = z;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394417a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394417a, i);
        C143947c.m234084c(parcel, 2, this.f394418b);
        C143947c.m234083b(parcel, a);
    }
}
