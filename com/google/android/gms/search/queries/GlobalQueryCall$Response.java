package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GlobalQueryCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145943k();

    /* renamed from: a */
    public Status f394503a;

    /* renamed from: b */
    public SearchResults f394504b;

    /* renamed from: c */
    public Bundle f394505c;

    public GlobalQueryCall$Response() {
    }

    public GlobalQueryCall$Response(Status status, SearchResults searchResults, Bundle bundle) {
        this.f394503a = status;
        this.f394504b = searchResults;
        this.f394505c = bundle;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394503a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394503a, i);
        C143947c.m234105x(parcel, 2, this.f394504b, i);
        C143947c.m234093l(parcel, 3, this.f394505c);
        C143947c.m234083b(parcel, a);
    }
}
