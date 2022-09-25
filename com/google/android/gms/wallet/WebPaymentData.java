package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class WebPaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146384u();

    /* renamed from: a */
    String f395344a;

    /* renamed from: b */
    Bundle f395345b;

    private WebPaymentData() {
    }

    public WebPaymentData(String str, Bundle bundle) {
        this.f395344a = str;
        this.f395345b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395344a);
        C143947c.m234093l(parcel, 3, this.f395345b);
        C143947c.m234083b(parcel, a);
    }
}
