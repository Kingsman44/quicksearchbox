package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146481cl();

    /* renamed from: a */
    public final int f395629a;

    /* renamed from: b */
    public final int f395630b;

    /* renamed from: c */
    public final byte[] f395631c;

    public RpcResponse(int i, int i2, byte[] bArr) {
        this.f395629a = i;
        this.f395630b = i2;
        this.f395631c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f395629a);
        C143947c.m234089h(parcel, 2, this.f395630b);
        C143947c.m234094m(parcel, 3, this.f395631c);
        C143947c.m234083b(parcel, a);
    }
}
