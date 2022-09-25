package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class SetUpBiometricAuthenticationKeysResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146359g();

    /* renamed from: a */
    byte[] f395368a;

    public SetUpBiometricAuthenticationKeysResponse(byte[] bArr) {
        this.f395368a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f395368a);
        C143947c.m234083b(parcel, a);
    }
}
