package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class ContourParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146311a();

    /* renamed from: a */
    public final PointF[] f395184a;

    /* renamed from: b */
    public final int f395185b;

    public ContourParcel(PointF[] pointFArr, int i) {
        this.f395184a = pointFArr;
        this.f395185b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 2, this.f395184a, i);
        C143947c.m234089h(parcel, 3, this.f395185b);
        C143947c.m234083b(parcel, a);
    }
}
