package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class UriData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146392h();

    /* renamed from: a */
    String f395454a;

    /* renamed from: b */
    String f395455b;

    UriData() {
    }

    public UriData(String str, String str2) {
        this.f395454a = str;
        this.f395455b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395454a);
        C143947c.m234106y(parcel, 3, this.f395455b);
        C143947c.m234083b(parcel, a);
    }
}
