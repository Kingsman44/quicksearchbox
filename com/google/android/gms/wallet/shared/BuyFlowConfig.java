package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C146382d();

    /* renamed from: a */
    public String f395407a;

    /* renamed from: b */
    public ApplicationParameters f395408b;

    /* renamed from: c */
    public String f395409c;

    /* renamed from: d */
    public String f395410d;

    /* renamed from: e */
    String f395411e;

    public BuyFlowConfig() {
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4) {
        this.f395407a = str;
        this.f395408b = applicationParameters;
        this.f395409c = str2;
        this.f395410d = str3;
        this.f395411e = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395407a);
        C143947c.m234105x(parcel, 3, this.f395408b, i);
        C143947c.m234106y(parcel, 4, this.f395409c);
        C143947c.m234106y(parcel, 5, this.f395410d);
        C143947c.m234106y(parcel, 6, this.f395411e);
        C143947c.m234083b(parcel, a);
    }
}
