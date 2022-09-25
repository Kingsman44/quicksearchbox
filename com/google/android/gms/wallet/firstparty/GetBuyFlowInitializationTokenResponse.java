package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146351b();

    /* renamed from: a */
    byte[] f395363a;

    public GetBuyFlowInitializationTokenResponse(byte[] bArr) {
        this.f395363a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 2, this.f395363a);
        C143947c.m234083b(parcel, a);
    }

    GetBuyFlowInitializationTokenResponse() {
        this.f395363a = new byte[0];
    }
}
