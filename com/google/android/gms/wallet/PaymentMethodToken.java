package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146371l();

    /* renamed from: a */
    int f395338a;

    /* renamed from: b */
    String f395339b;

    private PaymentMethodToken() {
    }

    public PaymentMethodToken(int i, String str) {
        this.f395338a = i;
        this.f395339b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395338a);
        C143947c.m234106y(parcel, 3, this.f395339b);
        C143947c.m234083b(parcel, a);
    }
}
