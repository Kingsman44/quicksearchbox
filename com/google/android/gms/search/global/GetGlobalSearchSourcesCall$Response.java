package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetGlobalSearchSourcesCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145904h();

    /* renamed from: a */
    public Status f394460a;

    /* renamed from: b */
    public GetGlobalSearchSourcesCall$GlobalSearchSource[] f394461b;

    public GetGlobalSearchSourcesCall$Response() {
    }

    public GetGlobalSearchSourcesCall$Response(Status status, GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.f394460a = status;
        this.f394461b = getGlobalSearchSourcesCall$GlobalSearchSourceArr;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394460a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394460a, i);
        C143947c.m234079B(parcel, 2, this.f394461b, i);
        C143947c.m234083b(parcel, a);
    }
}
