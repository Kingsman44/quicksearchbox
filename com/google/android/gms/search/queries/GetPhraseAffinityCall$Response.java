package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetPhraseAffinityCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145940h();

    /* renamed from: a */
    public Status f394495a;

    /* renamed from: b */
    public PhraseAffinityResponse f394496b;

    /* renamed from: c */
    public Bundle f394497c;

    public GetPhraseAffinityCall$Response() {
    }

    public GetPhraseAffinityCall$Response(Status status, PhraseAffinityResponse phraseAffinityResponse, Bundle bundle) {
        this.f394495a = status;
        this.f394496b = phraseAffinityResponse;
        this.f394497c = bundle;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394495a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394495a, i);
        C143947c.m234105x(parcel, 2, this.f394496b, i);
        C143947c.m234093l(parcel, 3, this.f394497c);
        C143947c.m234083b(parcel, a);
    }
}
