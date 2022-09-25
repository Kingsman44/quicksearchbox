package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SetExperimentIdsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145909m();

    /* renamed from: a */
    public byte[] f394464a;

    /* renamed from: b */
    public boolean f394465b;

    public SetExperimentIdsCall$Request() {
    }

    public SetExperimentIdsCall$Request(byte[] bArr, boolean z) {
        this.f394464a = bArr;
        this.f394465b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f394464a);
        C143947c.m234084c(parcel, 2, this.f394465b);
        C143947c.m234083b(parcel, a);
    }
}
