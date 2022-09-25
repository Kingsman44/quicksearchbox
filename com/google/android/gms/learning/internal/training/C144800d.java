package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.training.d */
/* compiled from: PG */
public final class C144800d extends C8848a implements C144802f {
    public C144800d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p10793f.C144165j mo120224a(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo17260gA()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo17261gT(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.p10793f.C144165j
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.f.h r1 = new com.google.android.gms.f.h
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.training.C144800d.mo120224a(java.lang.String):com.google.android.gms.f.j");
    }

    /* renamed from: b */
    public final void mo120225b(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        mo17262he(6, gA);
    }

    /* renamed from: c */
    public final boolean mo120226c() {
        Parcel gT = mo17261gT(3, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: d */
    public final boolean mo120227d() {
        Parcel gT = mo17261gT(1, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: e */
    public final boolean mo120228e() {
        Parcel gT = mo17261gT(4, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: f */
    public final boolean mo120229f() {
        Parcel gT = mo17261gT(5, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
