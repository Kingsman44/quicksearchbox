package org.chromium.p5643b.p5644a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.List;

/* renamed from: org.chromium.b.a.aw */
/* compiled from: PG */
public final class C72327aw extends C8848a implements IInterface {
    public C72327aw(IBinder iBinder) {
        super(iBinder, "org.chromium.weblayer_private.interfaces.ITab");
    }

    /* renamed from: e */
    public final int mo63734e() {
        Parcel gT = mo17261gT(8, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final String mo63735f() {
        Parcel gT = mo17261gT(14, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo63736g(String str, boolean z) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23495d(gA, z);
        mo17262he(10, gA);
    }

    /* renamed from: h */
    public final void mo63737h(String str, List list, C72339bh bhVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeStringList(list);
        C8850c.m23499h(gA, bhVar);
        mo17262he(20, gA);
    }

    /* renamed from: i */
    public final void mo63738i(C72329ay ayVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, ayVar);
        mo17262he(1, gA);
    }

    /* renamed from: j */
    public final void mo63739j(C72360s sVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, sVar);
        mo17262he(4, gA);
    }

    /* renamed from: k */
    public final void mo63740k(C72367z zVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, zVar);
        mo17262he(5, gA);
    }

    /* renamed from: l */
    public final void mo63741l(C72306ab abVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, abVar);
        mo17262he(24, gA);
    }

    /* renamed from: m */
    public final void mo63742m(C72308ad adVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, adVar);
        mo17262he(15, gA);
    }

    /* renamed from: n */
    public final void mo63743n(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        mo17262he(7, gA);
    }

    /* renamed from: o */
    public final void mo63744o() {
        mo17262he(23, mo17260gA());
    }

    /* renamed from: p */
    public final void mo63745p() {
        mo17262he(16, mo17260gA());
    }

    /* renamed from: q */
    public final boolean mo63746q() {
        Parcel gT = mo17261gT(22, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: r */
    public final boolean mo63747r() {
        Parcel gT = mo17261gT(13, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: s */
    public final boolean mo63748s(C72365x xVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, xVar);
        Parcel gT = mo17261gT(9, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: t */
    public final boolean mo63749t() {
        Parcel gT = mo17261gT(29, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: u */
    public final void mo63750u(C72317am amVar) {
        Parcel gA = mo17260gA();
        gA.writeFloat(1.0f);
        C8850c.m23499h(gA, amVar);
        mo17262he(17, gA);
    }

    /* renamed from: v */
    public final void mo63751v(C72363v vVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, vVar);
        Parcel gT = mo17261gT(25, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.weblayer_private.interfaces.IFaviconFetcher");
            if (queryLocalInterface instanceof C72361t) {
                C72361t tVar = (C72361t) queryLocalInterface;
            }
        }
        gT.recycle();
    }

    /* renamed from: w */
    public final void mo63752w() {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, true);
        mo17262he(27, gA);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72312ah mo63753x(org.chromium.p5643b.p5644a.C72314aj r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo17260gA()
            com.google.android.p445a.C8850c.m23499h(r0, r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo17261gT(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "org.chromium.weblayer_private.interfaces.INavigationController"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72312ah
            if (r2 == 0) goto L_0x0022
            r0 = r1
            org.chromium.b.a.ah r0 = (org.chromium.p5643b.p5644a.C72312ah) r0
            goto L_0x0028
        L_0x0022:
            org.chromium.b.a.ah r1 = new org.chromium.b.a.ah
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72327aw.mo63753x(org.chromium.b.a.aj):org.chromium.b.a.ah");
    }

    /* renamed from: y */
    public final void mo63754y(C72317am amVar) {
        Parcel gA = mo17260gA();
        gA.writeString("JSON.parse(Array.from(document.scripts).filter(script => script.type==\"application/ld+json\")[0].textContent)");
        C8850c.m23495d(gA, false);
        C8850c.m23499h(gA, amVar);
        mo17262he(6, gA);
    }
}
