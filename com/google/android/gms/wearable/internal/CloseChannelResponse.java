package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class CloseChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146526z();

    /* renamed from: a */
    public final int f395563a;

    public CloseChannelResponse(int i) {
        this.f395563a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395563a);
        C143947c.m234083b(parcel, a);
    }
}
