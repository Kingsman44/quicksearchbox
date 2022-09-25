package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.car.br */
/* compiled from: PG */
public final class C143134br extends C8848a implements IInterface {
    public C143134br(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICar");
    }

    /* renamed from: e */
    public final int mo118062e(String str, int i) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeInt(i);
        Parcel gT = mo17261gT(68, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final CarInfo mo118063f() {
        Parcel gT = mo17261gT(1, mo17260gA());
        CarInfo carInfo = (CarInfo) C8850c.m23492a(gT, CarInfo.CREATOR);
        gT.recycle();
        return carInfo;
    }

    /* renamed from: g */
    public final CarUiInfo mo118064g() {
        Parcel gT = mo17261gT(2, mo17260gA());
        CarUiInfo carUiInfo = (CarUiInfo) C8850c.m23492a(gT, CarUiInfo.CREATOR);
        gT.recycle();
        return carUiInfo;
    }

    /* renamed from: h */
    public final String mo118065h(String str, String str2) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        Parcel gT = mo17261gT(72, gA);
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: i */
    public final void mo118066i(C143147cc ccVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, ccVar);
        mo17262he(5, gA);
    }

    /* renamed from: j */
    public final void mo118067j(C143152ch chVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, chVar);
        mo17262he(65, gA);
    }

    /* renamed from: k */
    public final void mo118068k(C143147cc ccVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, ccVar);
        mo17262he(6, gA);
    }

    /* renamed from: l */
    public final void mo118069l(C143152ch chVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, chVar);
        mo17262he(66, gA);
    }

    /* renamed from: m */
    public final boolean mo118070m(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        Parcel gT = mo17261gT(10, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: n */
    public final boolean mo118071n(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23495d(gA, false);
        Parcel gT = mo17261gT(19, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: o */
    public final boolean mo118072o(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23495d(gA, false);
        Parcel gT = mo17261gT(71, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: p */
    public final List mo118073p(List list) {
        Parcel gA = mo17260gA();
        gA.writeString("car_module_feature_set");
        gA.writeStringList(list);
        Parcel gT = mo17261gT(55, gA);
        ArrayList<String> createStringArrayList = gT.createStringArrayList();
        gT.recycle();
        return createStringArrayList;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.car.display.p10758a.C143190g mo118074q() {
        /*
            r4 = this;
            r0 = 77
            android.os.Parcel r1 = r4.mo17260gA()
            android.os.Parcel r0 = r4.mo17261gT(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.car.display.manager.ICarDisplayManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.car.display.p10758a.C143190g
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.car.display.a.g r1 = (com.google.android.gms.car.display.p10758a.C143190g) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.car.display.a.g r2 = new com.google.android.gms.car.display.a.g
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.C143134br.mo118074q():com.google.android.gms.car.display.a.g");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.car.C143153ci mo118075r() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo17260gA()
            java.lang.String r1 = "com.google.android.projection.protocol.HotwordVendorExtension"
            r0.writeString(r1)
            r1 = 13
            android.os.Parcel r0 = r4.mo17261gT(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0017
            r1 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r2 = "com.google.android.gms.car.ICarVendorExtension"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.car.C143153ci
            if (r3 == 0) goto L_0x0025
            r1 = r2
            com.google.android.gms.car.ci r1 = (com.google.android.gms.car.C143153ci) r1
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.car.ci r2 = new com.google.android.gms.car.ci
            r2.<init>(r1)
            r1 = r2
        L_0x002b:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.C143134br.mo118075r():com.google.android.gms.car.ci");
    }

    /* renamed from: s */
    public final void mo118076s(byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        gA.writeInt(58);
        mo17262he(48, gA);
    }
}
