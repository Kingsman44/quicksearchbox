package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ChannelSendFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146525y();

    /* renamed from: a */
    public final int f395562a;

    public ChannelSendFileResponse(int i) {
        this.f395562a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395562a);
        C143947c.m234083b(parcel, a);
    }
}
