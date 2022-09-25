package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RenameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145575w();

    /* renamed from: a */
    public final Uri f393588a;

    /* renamed from: b */
    public final Uri f393589b;

    public RenameRequest(Uri uri, Uri uri2) {
        this.f393588a = uri;
        this.f393589b = uri2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393588a, i);
        C143947c.m234105x(parcel, 2, this.f393589b, i);
        C143947c.m234083b(parcel, a);
    }
}
