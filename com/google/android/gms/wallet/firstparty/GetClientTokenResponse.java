package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class GetClientTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146357e();

    /* renamed from: a */
    public byte[] f395367a;

    public GetClientTokenResponse(byte[] bArr) {
        this.f395367a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 2, this.f395367a);
        C143947c.m234083b(parcel, a);
    }

    GetClientTokenResponse() {
        this.f395367a = new byte[0];
    }
}
