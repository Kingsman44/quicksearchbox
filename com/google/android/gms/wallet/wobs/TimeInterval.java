package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146391g();

    /* renamed from: a */
    long f395452a;

    /* renamed from: b */
    long f395453b;

    TimeInterval() {
    }

    public TimeInterval(long j, long j2) {
        this.f395452a = j;
        this.f395453b = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 2, this.f395452a);
        C143947c.m234090i(parcel, 3, this.f395453b);
        C143947c.m234083b(parcel, a);
    }
}
