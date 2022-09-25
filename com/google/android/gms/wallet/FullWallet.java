package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: PG */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C146346d();

    /* renamed from: a */
    String f395273a;

    /* renamed from: b */
    String f395274b;

    /* renamed from: c */
    ProxyCard f395275c;

    /* renamed from: d */
    String f395276d;

    /* renamed from: e */
    Address f395277e;

    /* renamed from: f */
    Address f395278f;

    /* renamed from: g */
    String[] f395279g;

    /* renamed from: h */
    UserAddress f395280h;

    /* renamed from: i */
    UserAddress f395281i;

    /* renamed from: j */
    InstrumentInfo[] f395282j;

    /* renamed from: k */
    PaymentMethodToken f395283k;

    private FullWallet() {
    }

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.f395273a = str;
        this.f395274b = str2;
        this.f395275c = proxyCard;
        this.f395276d = str3;
        this.f395277e = address;
        this.f395278f = address2;
        this.f395279g = strArr;
        this.f395280h = userAddress;
        this.f395281i = userAddress2;
        this.f395282j = instrumentInfoArr;
        this.f395283k = paymentMethodToken;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395273a);
        C143947c.m234106y(parcel, 3, this.f395274b);
        C143947c.m234105x(parcel, 4, this.f395275c, i);
        C143947c.m234106y(parcel, 5, this.f395276d);
        C143947c.m234105x(parcel, 6, this.f395277e, i);
        C143947c.m234105x(parcel, 7, this.f395278f, i);
        C143947c.m234107z(parcel, 8, this.f395279g);
        C143947c.m234105x(parcel, 9, this.f395280h, i);
        C143947c.m234105x(parcel, 10, this.f395281i, i);
        C143947c.m234079B(parcel, 11, this.f395282j, i);
        C143947c.m234105x(parcel, 12, this.f395283k, i);
        C143947c.m234083b(parcel, a);
    }
}
