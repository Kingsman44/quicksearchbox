package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146389e();

    /* renamed from: a */
    String f395441a;

    /* renamed from: b */
    LoyaltyPointsBalance f395442b;
    @Deprecated

    /* renamed from: c */
    TimeInterval f395443c;

    LoyaltyPoints() {
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.f395441a = str;
        this.f395442b = loyaltyPointsBalance;
        this.f395443c = timeInterval;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395441a);
        C143947c.m234105x(parcel, 3, this.f395442b, i);
        C143947c.m234105x(parcel, 5, this.f395443c, i);
        C143947c.m234083b(parcel, a);
    }
}
