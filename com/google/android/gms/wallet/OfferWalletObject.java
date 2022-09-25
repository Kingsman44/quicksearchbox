package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* compiled from: PG */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146368i();

    /* renamed from: a */
    public final int f395326a;

    /* renamed from: b */
    String f395327b;

    /* renamed from: c */
    CommonWalletObject f395328c;

    OfferWalletObject() {
        this.f395326a = 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f395326a);
        C143947c.m234106y(parcel, 3, this.f395327b);
        C143947c.m234105x(parcel, 4, this.f395328c, i);
        C143947c.m234083b(parcel, a);
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f395326a = i;
        this.f395327b = str2;
        if (i < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f395417a = str;
            this.f395328c = commonWalletObject2;
            return;
        }
        this.f395328c = commonWalletObject;
    }
}
