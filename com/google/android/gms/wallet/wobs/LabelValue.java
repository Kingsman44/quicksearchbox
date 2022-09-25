package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LabelValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146386b();

    /* renamed from: a */
    String f395436a;

    /* renamed from: b */
    String f395437b;

    LabelValue() {
    }

    public LabelValue(String str, String str2) {
        this.f395436a = str;
        this.f395437b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395436a);
        C143947c.m234106y(parcel, 3, this.f395437b);
        C143947c.m234083b(parcel, a);
    }
}
