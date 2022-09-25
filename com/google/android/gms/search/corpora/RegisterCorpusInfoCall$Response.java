package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RegisterCorpusInfoCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145883g();

    /* renamed from: a */
    public Status f394415a;

    /* renamed from: b */
    public boolean f394416b;

    public RegisterCorpusInfoCall$Response() {
    }

    public RegisterCorpusInfoCall$Response(Status status, boolean z) {
        this.f394415a = status;
        this.f394416b = z;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394415a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394415a, i);
        C143947c.m234084c(parcel, 2, this.f394416b);
        C143947c.m234083b(parcel, a);
    }
}
