package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class QuerySuggestCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145946n();

    /* renamed from: a */
    public Status f394516a;

    /* renamed from: b */
    public SuggestionResults f394517b;

    /* renamed from: c */
    public Bundle f394518c;

    public QuerySuggestCall$Response() {
    }

    public QuerySuggestCall$Response(Status status, SuggestionResults suggestionResults, Bundle bundle) {
        this.f394516a = status;
        this.f394517b = suggestionResults;
        this.f394518c = bundle;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394516a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394516a, i);
        C143947c.m234105x(parcel, 2, this.f394517b, i);
        C143947c.m234093l(parcel, 3, this.f394518c);
        C143947c.m234083b(parcel, a);
    }
}
