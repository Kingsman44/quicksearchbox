package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetCorpusInfoCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145881e();

    /* renamed from: a */
    public Status f394411a;

    /* renamed from: b */
    public RegisterCorpusInfo f394412b;

    public GetCorpusInfoCall$Response() {
    }

    public GetCorpusInfoCall$Response(Status status, RegisterCorpusInfo registerCorpusInfo) {
        this.f394411a = status;
        this.f394412b = registerCorpusInfo;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394411a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394411a, i);
        C143947c.m234105x(parcel, 2, this.f394412b, i);
        C143947c.m234083b(parcel, a);
    }
}
