package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146319b();

    /* renamed from: a */
    public int f395212a;

    /* renamed from: b */
    public int f395213b;

    /* renamed from: c */
    public int f395214c;

    /* renamed from: d */
    public long f395215d;

    /* renamed from: e */
    public int f395216e;

    public FrameMetadataParcel() {
    }

    public FrameMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.f395212a = i;
        this.f395213b = i2;
        this.f395214c = i3;
        this.f395215d = j;
        this.f395216e = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395212a);
        C143947c.m234089h(parcel, 3, this.f395213b);
        C143947c.m234089h(parcel, 4, this.f395214c);
        C143947c.m234090i(parcel, 5, this.f395215d);
        C143947c.m234089h(parcel, 6, this.f395216e);
        C143947c.m234083b(parcel, a);
    }
}
