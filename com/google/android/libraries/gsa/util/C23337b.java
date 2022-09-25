package com.google.android.libraries.gsa.util;

import android.os.Binder;
import android.os.Parcel;

/* renamed from: com.google.android.libraries.gsa.util.b */
/* compiled from: PG */
final class C23337b extends Binder {

    /* renamed from: a */
    final /* synthetic */ byte[] f63873a;

    public C23337b(byte[] bArr) {
        this.f63873a = bArr;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt = parcel.readInt() * 65536;
        parcel2.writeByteArray(this.f63873a, readInt, Math.min(this.f63873a.length - readInt, 65536));
        return true;
    }
}
