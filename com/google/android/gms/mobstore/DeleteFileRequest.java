package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DeleteFileRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145552a();

    /* renamed from: a */
    public final Uri f393584a;

    public DeleteFileRequest(Uri uri) {
        this.f393584a = uri;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393584a, i);
        C143947c.m234083b(parcel, a);
    }
}
