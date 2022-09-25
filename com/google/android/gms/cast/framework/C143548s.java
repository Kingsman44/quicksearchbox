package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.s */
/* compiled from: PG */
public final class C143548s extends C8848a implements C143549t {
    public C143548s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    /* renamed from: e */
    public final Bundle mo118854e() {
        Parcel gT = mo17261gT(1, mo17260gA());
        Bundle bundle = (Bundle) C8850c.m23492a(gT, Bundle.CREATOR);
        gT.recycle();
        return bundle;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.cast.framework.C143553x mo118855f() {
        /*
            r4 = this;
            r0 = 6
            android.os.Parcel r1 = r4.mo17260gA()
            android.os.Parcel r0 = r4.mo17261gT(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.IDiscoveryManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.cast.framework.C143553x
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.cast.framework.x r1 = (com.google.android.gms.cast.framework.C143553x) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.cast.framework.w r2 = new com.google.android.gms.cast.framework.w
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.C143548s.mo118855f():com.google.android.gms.cast.framework.x");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.cast.framework.C143396ad mo118856g() {
        /*
            r4 = this;
            r0 = 5
            android.os.Parcel r1 = r4.mo17260gA()
            android.os.Parcel r0 = r4.mo17261gT(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.ISessionManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.cast.framework.C143396ad
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.cast.framework.ad r1 = (com.google.android.gms.cast.framework.C143396ad) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.cast.framework.ac r2 = new com.google.android.gms.cast.framework.ac
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.C143548s.mo118856g():com.google.android.gms.cast.framework.ad");
    }

    /* renamed from: h */
    public final void mo118857h(C143545p pVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, pVar);
        mo17262he(3, gA);
    }
}
