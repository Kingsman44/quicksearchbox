package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146522v();

    /* renamed from: a */
    final ChannelImpl f395554a;

    /* renamed from: b */
    final int f395555b;

    /* renamed from: c */
    final int f395556c;

    /* renamed from: d */
    final int f395557d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.f395554a = channelImpl;
        this.f395555b = i;
        this.f395556c = i2;
        this.f395557d = i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f395554a);
        int i = this.f395555b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.f395556c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.f395557d;
        return "ChannelEventParcelable[, channel=" + valueOf + ", type=" + num + ", closeReason=" + num2 + ", appErrorCode=" + i3 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f395554a, i);
        C143947c.m234089h(parcel, 3, this.f395555b);
        C143947c.m234089h(parcel, 4, this.f395556c);
        C143947c.m234089h(parcel, 5, this.f395557d);
        C143947c.m234083b(parcel, a);
    }
}
