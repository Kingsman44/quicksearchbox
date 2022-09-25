package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146356d();

    /* renamed from: a */
    public WalletCustomTheme f395364a;

    /* renamed from: b */
    public boolean f395365b;

    /* renamed from: c */
    int f395366c;

    public GetClientTokenRequest() {
        this.f395366c = 1;
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z, int i) {
        this.f395364a = walletCustomTheme;
        this.f395365b = z;
        this.f395366c = i;
        if (walletCustomTheme == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f395364a, i);
        C143947c.m234084c(parcel, 3, this.f395365b);
        C143947c.m234089h(parcel, 4, this.f395366c);
        C143947c.m234083b(parcel, a);
    }
}
