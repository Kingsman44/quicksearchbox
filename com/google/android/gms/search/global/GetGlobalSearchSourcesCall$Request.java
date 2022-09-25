package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetGlobalSearchSourcesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145903g();

    /* renamed from: a */
    public boolean f394459a;

    public GetGlobalSearchSourcesCall$Request() {
    }

    public GetGlobalSearchSourcesCall$Request(boolean z) {
        this.f394459a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f394459a);
        C143947c.m234083b(parcel, a);
    }
}
