package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146388d();

    /* renamed from: a */
    int f395444a;

    /* renamed from: b */
    String f395445b;

    /* renamed from: c */
    double f395446c;

    /* renamed from: d */
    String f395447d;

    /* renamed from: e */
    long f395448e;

    /* renamed from: f */
    int f395449f;

    LoyaltyPointsBalance() {
        this.f395449f = -1;
        this.f395444a = -1;
        this.f395446c = -1.0d;
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.f395444a = i;
        this.f395445b = str;
        this.f395446c = d;
        this.f395447d = str2;
        this.f395448e = j;
        this.f395449f = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395444a);
        C143947c.m234106y(parcel, 3, this.f395445b);
        C143947c.m234086e(parcel, 4, this.f395446c);
        C143947c.m234106y(parcel, 5, this.f395447d);
        C143947c.m234090i(parcel, 6, this.f395448e);
        C143947c.m234089h(parcel, 7, this.f395449f);
        C143947c.m234083b(parcel, a);
    }
}
