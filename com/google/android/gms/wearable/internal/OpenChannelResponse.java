package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146475cf();

    /* renamed from: a */
    public final int f395617a;

    /* renamed from: b */
    public final ChannelImpl f395618b;

    public OpenChannelResponse(int i, ChannelImpl channelImpl) {
        this.f395617a = i;
        this.f395618b = channelImpl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395617a);
        C143947c.m234105x(parcel, 3, this.f395618b, i);
        C143947c.m234083b(parcel, a);
    }
}
