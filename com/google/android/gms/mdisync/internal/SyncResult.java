package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145097j();

    /* renamed from: a */
    public final byte[] f392152a;

    public SyncResult(byte[] bArr) {
        this.f392152a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f392152a);
        C143947c.m234083b(parcel, a);
    }
}
