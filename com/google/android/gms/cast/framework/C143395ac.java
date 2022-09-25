package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.ac */
/* compiled from: PG */
public final class C143395ac extends C8848a implements C143396ad {
    public C143395ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p10793f.C144165j mo118577e() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.C143395ac.mo118577e():com.google.android.gms.f.j");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p10793f.C144165j mo118578f() {
        /*
            r4 = this;
            r0 = 7
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.C143395ac.mo118578f():com.google.android.gms.f.j");
    }

    /* renamed from: g */
    public final void mo118579g(C143398af afVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, afVar);
        mo17262he(2, gA);
    }

    /* renamed from: h */
    public final void mo118580h(C143398af afVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, afVar);
        mo17262he(3, gA);
    }

    /* renamed from: i */
    public final void mo118581i(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, true);
        C8850c.m23495d(gA, z);
        mo17262he(6, gA);
    }
}
