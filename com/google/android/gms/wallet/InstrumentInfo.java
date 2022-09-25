package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146347e();

    /* renamed from: a */
    public String f395284a;

    /* renamed from: b */
    public String f395285b;

    /* renamed from: c */
    private int f395286c;

    private InstrumentInfo() {
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.f395284a = str;
        this.f395285b = str2;
        this.f395286c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395284a);
        C143947c.m234106y(parcel, 3, this.f395285b);
        int i2 = this.f395286c;
        if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
            i2 = 0;
        }
        C143947c.m234089h(parcel, 4, i2);
        C143947c.m234083b(parcel, a);
    }
}
