package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.mdisync.SyncOptions;

/* compiled from: PG */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145096i();

    /* renamed from: a */
    public final byte[] f392149a;

    /* renamed from: b */
    public final SyncOptions f392150b;

    /* renamed from: c */
    public final int f392151c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        int i2;
        int i3 = 1;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 4;
                    if (i != 3) {
                        i2 = i != 4 ? 0 : 5;
                    }
                } else {
                    i2 = 3;
                }
            }
        } else {
            i2 = 1;
        }
        this.f392151c = i2 != 0 ? i2 : i3;
        this.f392149a = bArr;
        this.f392150b = syncOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f392151c - 1);
        C143947c.m234094m(parcel, 2, this.f392149a);
        C143947c.m234105x(parcel, 3, this.f392150b, i);
        C143947c.m234083b(parcel, a);
    }
}
