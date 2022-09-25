package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ClearCorpusCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145878b();

    /* renamed from: a */
    public Status f394406a;

    public ClearCorpusCall$Response() {
    }

    public ClearCorpusCall$Response(Status status) {
        this.f394406a = status;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394406a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394406a, i);
        C143947c.m234083b(parcel, a);
    }
}
