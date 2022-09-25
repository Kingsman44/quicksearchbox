package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: PG */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146370k();

    /* renamed from: a */
    String f395330a;

    /* renamed from: b */
    CardInfo f395331b;

    /* renamed from: c */
    UserAddress f395332c;

    /* renamed from: d */
    PaymentMethodToken f395333d;

    /* renamed from: e */
    String f395334e;

    /* renamed from: f */
    Bundle f395335f;

    /* renamed from: g */
    String f395336g;

    /* renamed from: h */
    Bundle f395337h;

    private PaymentData() {
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f395330a = str;
        this.f395331b = cardInfo;
        this.f395332c = userAddress;
        this.f395333d = paymentMethodToken;
        this.f395334e = str2;
        this.f395335f = bundle;
        this.f395336g = str3;
        this.f395337h = bundle2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395330a);
        C143947c.m234105x(parcel, 2, this.f395331b, i);
        C143947c.m234105x(parcel, 3, this.f395332c, i);
        C143947c.m234105x(parcel, 4, this.f395333d, i);
        C143947c.m234106y(parcel, 5, this.f395334e);
        C143947c.m234093l(parcel, 6, this.f395335f);
        C143947c.m234106y(parcel, 7, this.f395336g);
        C143947c.m234093l(parcel, 8, this.f395337h);
        C143947c.m234083b(parcel, a);
    }
}
