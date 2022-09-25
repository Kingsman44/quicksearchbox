package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class OpenFileDescriptorRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145573u();

    /* renamed from: a */
    public final Uri f393585a;

    /* renamed from: b */
    public final int f393586b;

    public OpenFileDescriptorRequest(Uri uri, int i) {
        this.f393585a = uri;
        this.f393586b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393585a, i);
        C143947c.m234089h(parcel, 2, this.f393586b);
        C143947c.m234083b(parcel, a);
    }
}
