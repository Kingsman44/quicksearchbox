package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.gms.common.internal.aq */
/* compiled from: PG */
public final class C143901aq extends C8848a implements C143903as {
    public C143901aq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final int mo119417b() {
        Parcel gT = mo17261gT(2, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p10793f.C144165j mo119418c() {
        /*
            r4 = this;
            r0 = 1
            android.os.Parcel r1 = r4.mo17260gA()
            android.os.Parcel r0 = r4.mo17261gT(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.f.j r1 = (com.google.android.gms.p10793f.C144165j) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C143901aq.mo119418c():com.google.android.gms.f.j");
    }
}
