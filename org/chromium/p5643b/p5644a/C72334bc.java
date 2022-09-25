package org.chromium.p5643b.p5644a;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.evernote.android.state.BuildConfig;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: org.chromium.b.a.bc */
/* compiled from: PG */
public final class C72334bc extends C8848a implements IInterface {
    public C72334bc(IBinder iBinder) {
        super(iBinder, "org.chromium.weblayer_private.interfaces.IWebLayer");
    }

    /* renamed from: e */
    public final IBinder mo63772e(C72317am amVar, C72317am amVar2) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, amVar);
        C8850c.m23499h(gA, amVar2);
        Parcel gT = mo17261gT(20, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        gT.recycle();
        return readStrongBinder;
    }

    /* renamed from: f */
    public final String mo63773f() {
        Parcel gT = mo17261gT(15, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: g */
    public final String mo63774g() {
        Parcel gT = mo17261gT(29, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72317am mo63775h() {
        /*
            r4 = this;
            r0 = 27
            android.os.Parcel r1 = r4.mo17260gA()
            android.os.Parcel r0 = r4.mo17261gT(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "org.chromium.weblayer_private.interfaces.IObjectWrapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof org.chromium.p5643b.p5644a.C72317am
            if (r3 == 0) goto L_0x0020
            r1 = r2
            org.chromium.b.a.am r1 = (org.chromium.p5643b.p5644a.C72317am) r1
            goto L_0x0026
        L_0x0020:
            org.chromium.b.a.ak r2 = new org.chromium.b.a.ak
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63775h():org.chromium.b.a.am");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72317am mo63776i() {
        /*
            r4 = this;
            r0 = 28
            android.os.Parcel r1 = r4.mo17260gA()
            android.os.Parcel r0 = r4.mo17261gT(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "org.chromium.weblayer_private.interfaces.IObjectWrapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof org.chromium.p5643b.p5644a.C72317am
            if (r3 == 0) goto L_0x0020
            r1 = r2
            org.chromium.b.a.am r1 = (org.chromium.p5643b.p5644a.C72317am) r1
            goto L_0x0026
        L_0x0020:
            org.chromium.b.a.ak r2 = new org.chromium.b.a.ak
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63776i():org.chromium.b.a.am");
    }

    /* renamed from: j */
    public final void mo63777j(C72317am amVar, C72317am amVar2, C72317am amVar3) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, amVar);
        C8850c.m23499h(gA, amVar2);
        C8850c.m23499h(gA, amVar3);
        mo17262he(9, gA);
    }

    /* renamed from: k */
    public final void mo63778k(C72317am amVar, C72317am amVar2) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, amVar);
        C8850c.m23499h(gA, amVar2);
        mo17262he(10, gA);
    }

    /* renamed from: l */
    public final void mo63779l() {
        mo17262he(19, mo17260gA());
    }

    /* renamed from: m */
    public final void mo63780m(C72317am amVar, Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, amVar);
        C8850c.m23497f(gA, intent);
        mo17262he(18, gA);
    }

    /* renamed from: n */
    public final void mo63781n(C72317am amVar, Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, amVar);
        C8850c.m23497f(gA, intent);
        mo17262he(12, gA);
    }

    /* renamed from: o */
    public final void mo63782o(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(24, gA);
    }

    /* renamed from: p */
    public final void mo63783p(C72317am amVar, Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, amVar);
        C8850c.m23497f(gA, intent);
        mo17262he(23, gA);
    }

    /* renamed from: q */
    public final void mo63784q(C72336be beVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, beVar);
        mo17262he(14, gA);
    }

    /* renamed from: r */
    public final void mo63785r(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        mo17262he(6, gA);
    }

    /* renamed from: s */
    public final void mo63786s(int[] iArr) {
        Parcel gA = mo17260gA();
        gA.writeString(BuildConfig.FLAVOR);
        gA.writeIntArray(iArr);
        mo17262he(16, gA);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72346e mo63787t(org.chromium.p5643b.p5644a.C72324at r3, org.chromium.p5643b.p5644a.C72317am r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo17260gA()
            com.google.android.p445a.C8850c.m23499h(r0, r3)
            com.google.android.p445a.C8850c.m23499h(r0, r4)
            r3 = 4
            android.os.Parcel r3 = r2.mo17261gT(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "org.chromium.weblayer_private.interfaces.IBrowserFragment"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof org.chromium.p5643b.p5644a.C72346e
            if (r1 == 0) goto L_0x0025
            r4 = r0
            org.chromium.b.a.e r4 = (org.chromium.p5643b.p5644a.C72346e) r4
            goto L_0x002b
        L_0x0025:
            org.chromium.b.a.e r0 = new org.chromium.b.a.e
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63787t(org.chromium.b.a.at, org.chromium.b.a.am):org.chromium.b.a.e");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72356o mo63788u(org.chromium.p5643b.p5644a.C72317am r3, org.chromium.p5643b.p5644a.C72317am r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo17260gA()
            com.google.android.p445a.C8850c.m23499h(r0, r3)
            com.google.android.p445a.C8850c.m23499h(r0, r4)
            r3 = 11
            android.os.Parcel r3 = r2.mo17261gT(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0018
            r4 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "org.chromium.weblayer_private.interfaces.ICrashReporterController"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof org.chromium.p5643b.p5644a.C72356o
            if (r1 == 0) goto L_0x0026
            r4 = r0
            org.chromium.b.a.o r4 = (org.chromium.p5643b.p5644a.C72356o) r4
            goto L_0x002c
        L_0x0026:
            org.chromium.b.a.o r0 = new org.chromium.b.a.o
            r0.<init>(r4)
            r4 = r0
        L_0x002c:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63788u(org.chromium.b.a.am, org.chromium.b.a.am):org.chromium.b.a.o");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72309ae mo63789v(org.chromium.p5643b.p5644a.C72324at r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo17260gA()
            com.google.android.p445a.C8850c.m23499h(r0, r4)
            r4 = 22
            android.os.Parcel r4 = r3.mo17261gT(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72309ae
            if (r2 == 0) goto L_0x0023
            r0 = r1
            org.chromium.b.a.ae r0 = (org.chromium.p5643b.p5644a.C72309ae) r0
            goto L_0x0029
        L_0x0023:
            org.chromium.b.a.ae r1 = new org.chromium.b.a.ae
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63789v(org.chromium.b.a.at):org.chromium.b.a.ae");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72319ao mo63790w(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo17260gA()
            r0.writeString(r4)
            r4 = 25
            android.os.Parcel r4 = r3.mo17261gT(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "org.chromium.weblayer_private.interfaces.IProfile"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72319ao
            if (r2 == 0) goto L_0x0023
            r0 = r1
            org.chromium.b.a.ao r0 = (org.chromium.p5643b.p5644a.C72319ao) r0
            goto L_0x0029
        L_0x0023:
            org.chromium.b.a.ao r1 = new org.chromium.b.a.ao
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63790w(java.lang.String):org.chromium.b.a.ao");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72319ao mo63791x(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo17260gA()
            r0.writeString(r4)
            r4 = 5
            android.os.Parcel r4 = r3.mo17261gT(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "org.chromium.weblayer_private.interfaces.IProfile"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72319ao
            if (r2 == 0) goto L_0x0022
            r0 = r1
            org.chromium.b.a.ao r0 = (org.chromium.p5643b.p5644a.C72319ao) r0
            goto L_0x0028
        L_0x0022:
            org.chromium.b.a.ao r1 = new org.chromium.b.a.ao
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63791x(java.lang.String):org.chromium.b.a.ao");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72325au mo63792y(org.chromium.p5643b.p5644a.C72324at r3, org.chromium.p5643b.p5644a.C72317am r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo17260gA()
            com.google.android.p445a.C8850c.m23499h(r0, r3)
            com.google.android.p445a.C8850c.m23499h(r0, r4)
            r3 = 26
            android.os.Parcel r3 = r2.mo17261gT(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0018
            r4 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "org.chromium.weblayer_private.interfaces.ISettingsFragment"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof org.chromium.p5643b.p5644a.C72325au
            if (r1 == 0) goto L_0x0026
            r4 = r0
            org.chromium.b.a.au r4 = (org.chromium.p5643b.p5644a.C72325au) r4
            goto L_0x002c
        L_0x0026:
            org.chromium.b.a.au r0 = new org.chromium.b.a.au
            r0.<init>(r4)
            r4 = r0
        L_0x002c:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63792y(org.chromium.b.a.at, org.chromium.b.a.am):org.chromium.b.a.au");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72326av mo63793z(org.chromium.p5643b.p5644a.C72324at r3, org.chromium.p5643b.p5644a.C72317am r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo17260gA()
            com.google.android.p445a.C8850c.m23499h(r0, r3)
            com.google.android.p445a.C8850c.m23499h(r0, r4)
            r3 = 17
            android.os.Parcel r3 = r2.mo17261gT(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0018
            r4 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "org.chromium.weblayer_private.interfaces.ISiteSettingsFragment"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof org.chromium.p5643b.p5644a.C72326av
            if (r1 == 0) goto L_0x0026
            r4 = r0
            org.chromium.b.a.av r4 = (org.chromium.p5643b.p5644a.C72326av) r4
            goto L_0x002c
        L_0x0026:
            org.chromium.b.a.av r0 = new org.chromium.b.a.av
            r0.<init>(r4)
            r4 = r0
        L_0x002c:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72334bc.mo63793z(org.chromium.b.a.at, org.chromium.b.a.am):org.chromium.b.a.av");
    }
}
