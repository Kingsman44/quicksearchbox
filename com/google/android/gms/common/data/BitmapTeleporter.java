package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C143862b();

    /* renamed from: a */
    final int f389958a;

    /* renamed from: b */
    ParcelFileDescriptor f389959b;

    /* renamed from: c */
    final int f389960c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f389958a = i;
        this.f389959b = parcelFileDescriptor;
        this.f389960c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f389959b != null) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 1, this.f389958a);
            C143947c.m234105x(parcel, 2, this.f389959b, i | 1);
            C143947c.m234089h(parcel, 3, this.f389960c);
            C143947c.m234083b(parcel, a);
            this.f389959b = null;
            return;
        }
        C143919bh.m233958a((Object) null);
        throw null;
    }
}
