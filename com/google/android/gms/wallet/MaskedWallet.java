package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: PG */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C146367h();

    /* renamed from: a */
    String f395315a;

    /* renamed from: b */
    String f395316b;

    /* renamed from: c */
    String[] f395317c;

    /* renamed from: d */
    String f395318d;

    /* renamed from: e */
    Address f395319e;

    /* renamed from: f */
    Address f395320f;

    /* renamed from: g */
    LoyaltyWalletObject[] f395321g;

    /* renamed from: h */
    OfferWalletObject[] f395322h;

    /* renamed from: i */
    UserAddress f395323i;

    /* renamed from: j */
    UserAddress f395324j;

    /* renamed from: k */
    InstrumentInfo[] f395325k;

    private MaskedWallet() {
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f395315a = str;
        this.f395316b = str2;
        this.f395317c = strArr;
        this.f395318d = str3;
        this.f395319e = address;
        this.f395320f = address2;
        this.f395321g = loyaltyWalletObjectArr;
        this.f395322h = offerWalletObjectArr;
        this.f395323i = userAddress;
        this.f395324j = userAddress2;
        this.f395325k = instrumentInfoArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395315a);
        C143947c.m234106y(parcel, 3, this.f395316b);
        C143947c.m234107z(parcel, 4, this.f395317c);
        C143947c.m234106y(parcel, 5, this.f395318d);
        C143947c.m234105x(parcel, 6, this.f395319e, i);
        C143947c.m234105x(parcel, 7, this.f395320f, i);
        C143947c.m234079B(parcel, 8, this.f395321g, i);
        C143947c.m234079B(parcel, 9, this.f395322h, i);
        C143947c.m234105x(parcel, 10, this.f395323i, i);
        C143947c.m234105x(parcel, 11, this.f395324j, i);
        C143947c.m234079B(parcel, 12, this.f395325k, i);
        C143947c.m234083b(parcel, a);
    }
}
