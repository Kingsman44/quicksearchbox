package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetChannelInputStreamResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146431ap();

    /* renamed from: a */
    public final int f395580a;

    /* renamed from: b */
    public final ParcelFileDescriptor f395581b;

    public GetChannelInputStreamResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f395580a = i;
        this.f395581b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395580a);
        C143947c.m234105x(parcel, 3, this.f395581b, i);
        C143947c.m234083b(parcel, a);
    }
}
