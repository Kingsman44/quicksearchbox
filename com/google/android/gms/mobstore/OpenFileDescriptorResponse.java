package com.google.android.gms.mobstore;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class OpenFileDescriptorResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145574v();

    /* renamed from: a */
    public final ParcelFileDescriptor f393587a;

    public OpenFileDescriptorResponse(ParcelFileDescriptor parcelFileDescriptor) {
        this.f393587a = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393587a, i | 1);
        C143947c.m234083b(parcel, a);
    }
}
