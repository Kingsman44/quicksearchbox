package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.aa */
/* compiled from: PG */
public final class C143393aa extends C8848a implements C143394ab {
    public C143393aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    /* renamed from: e */
    public final int mo118568e() {
        Parcel gT = mo17261gT(17, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final int mo118569f() {
        Parcel gT = mo17261gT(18, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p10793f.C144165j mo118570g() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.C143393aa.mo118570g():com.google.android.gms.f.j");
    }

    /* renamed from: h */
    public final String mo118571h() {
        Parcel gT = mo17261gT(3, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: i */
    public final void mo118572i(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(13, gA);
    }

    /* renamed from: j */
    public final boolean mo118573j() {
        Parcel gT = mo17261gT(5, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: k */
    public final boolean mo118574k() {
        Parcel gT = mo17261gT(9, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: l */
    public final void mo118575l() {
        Parcel gA = mo17260gA();
        gA.writeInt(2153);
        mo17262he(15, gA);
    }

    /* renamed from: m */
    public final void mo118576m() {
        Parcel gA = mo17260gA();
        gA.writeInt(2151);
        mo17262he(12, gA);
    }
}
