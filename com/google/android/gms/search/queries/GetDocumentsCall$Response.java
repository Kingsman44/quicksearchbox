package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetDocumentsCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145937e();

    /* renamed from: a */
    public Status f394489a;

    /* renamed from: b */
    public DocumentResults f394490b;

    /* renamed from: c */
    public Bundle f394491c;

    public GetDocumentsCall$Response() {
    }

    public GetDocumentsCall$Response(Status status, DocumentResults documentResults, Bundle bundle) {
        this.f394489a = status;
        this.f394490b = documentResults;
        this.f394491c = bundle;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394489a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394489a, i);
        C143947c.m234105x(parcel, 2, this.f394490b, i);
        C143947c.m234093l(parcel, 3, this.f394491c);
        C143947c.m234083b(parcel, a);
    }
}
