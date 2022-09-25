package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146482cm();

    /* renamed from: a */
    public final int f395632a;

    /* renamed from: b */
    public final int f395633b;

    public SendMessageResponse(int i, int i2) {
        this.f395632a = i;
        this.f395633b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395632a);
        C143947c.m234089h(parcel, 3, this.f395633b);
        C143947c.m234083b(parcel, a);
    }
}
