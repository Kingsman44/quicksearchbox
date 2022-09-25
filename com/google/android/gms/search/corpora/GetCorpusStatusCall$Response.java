package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetCorpusStatusCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145882f();

    /* renamed from: a */
    public Status f394413a;

    /* renamed from: b */
    public CorpusStatus f394414b;

    public GetCorpusStatusCall$Response() {
    }

    public GetCorpusStatusCall$Response(Status status, CorpusStatus corpusStatus) {
        this.f394413a = status;
        this.f394414b = corpusStatus;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394413a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394413a, i);
        C143947c.m234105x(parcel, 2, this.f394414b, i);
        C143947c.m234083b(parcel, a);
    }
}
