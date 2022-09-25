package org.chromium.weblayer;

import android.os.Parcel;
import android.os.RemoteException;
import android.support.p031v4.app.Fragment;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72327aw;
import org.chromium.p5643b.p5644a.C72331b;

/* renamed from: org.chromium.weblayer.d */
/* compiled from: PG */
public final class C72615d {

    /* renamed from: a */
    public Fragment f193178a;

    /* renamed from: b */
    public final C72581aq f193179b;

    /* renamed from: c */
    public final C72581aq f193180c;

    /* renamed from: d */
    public final C72581aq f193181d;

    /* renamed from: e */
    public C72331b f193182e;

    /* renamed from: f */
    private final C72606bo f193183f;

    protected C72615d() {
        this.f193182e = null;
        this.f193179b = null;
        this.f193183f = null;
        this.f193180c = null;
        this.f193181d = null;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72615d(org.chromium.p5643b.p5644a.C72331b r4, android.support.p031v4.app.Fragment r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.f193182e = r4
            r3.f193178a = r5
            org.chromium.weblayer.aq r4 = new org.chromium.weblayer.aq
            r4.<init>()
            r3.f193179b = r4
            org.chromium.weblayer.aq r4 = new org.chromium.weblayer.aq
            r4.<init>()
            r3.f193180c = r4
            org.chromium.weblayer.aq r4 = new org.chromium.weblayer.aq
            r4.<init>()
            r3.f193181d = r4
            org.chromium.b.a.b r4 = r3.f193182e     // Catch:{ RemoteException -> 0x0061 }
            org.chromium.weblayer.c r5 = new org.chromium.weblayer.c     // Catch:{ RemoteException -> 0x0061 }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x0061 }
            android.os.Parcel r0 = r4.mo17260gA()     // Catch:{ RemoteException -> 0x0061 }
            com.google.android.p445a.C8850c.m23499h(r0, r5)     // Catch:{ RemoteException -> 0x0061 }
            r5 = 7
            r4.mo17262he(r5, r0)     // Catch:{ RemoteException -> 0x0061 }
            org.chromium.weblayer.bo r4 = new org.chromium.weblayer.bo     // Catch:{ RemoteException -> 0x0061 }
            org.chromium.b.a.b r5 = r3.f193182e     // Catch:{ RemoteException -> 0x0061 }
            android.os.Parcel r0 = r5.mo17260gA()     // Catch:{ RemoteException -> 0x0061 }
            r1 = 10
            android.os.Parcel r5 = r5.mo17261gT(r1, r0)     // Catch:{ RemoteException -> 0x0061 }
            android.os.IBinder r0 = r5.readStrongBinder()     // Catch:{ RemoteException -> 0x0061 }
            if (r0 != 0) goto L_0x0044
            r0 = 0
            goto L_0x0058
        L_0x0044:
            java.lang.String r1 = "org.chromium.weblayer_private.interfaces.IUrlBarController"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0061 }
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72330az     // Catch:{ RemoteException -> 0x0061 }
            if (r2 == 0) goto L_0x0052
            r0 = r1
            org.chromium.b.a.az r0 = (org.chromium.p5643b.p5644a.C72330az) r0     // Catch:{ RemoteException -> 0x0061 }
            goto L_0x0058
        L_0x0052:
            org.chromium.b.a.az r1 = new org.chromium.b.a.az     // Catch:{ RemoteException -> 0x0061 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0061 }
            r0 = r1
        L_0x0058:
            r5.recycle()     // Catch:{ RemoteException -> 0x0061 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x0061 }
            r3.f193183f = r4     // Catch:{ RemoteException -> 0x0061 }
            return
        L_0x0061:
            r4 = move-exception
            org.chromium.b.a.a r5 = new org.chromium.b.a.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72615d.<init>(org.chromium.b.a.b, android.support.v4.app.Fragment):void");
    }

    /* renamed from: a */
    public final C72601bj mo64482a() {
        C72604bm.m107399a();
        mo64487f();
        try {
            C72331b bVar = this.f193182e;
            Parcel gT = bVar.mo17261gT(5, bVar.mo17260gA());
            int readInt = gT.readInt();
            gT.recycle();
            return C72601bj.m107381e(readInt);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: b */
    public final C72606bo mo64483b() {
        C72604bm.m107399a();
        mo64487f();
        return this.f193183f;
    }

    /* renamed from: c */
    public final void mo64484c(C72601bj bjVar) {
        C72604bm.m107399a();
        mo64487f();
        if (bjVar.mo64473c() == this) {
            try {
                C72331b bVar = this.f193182e;
                C72327aw awVar = bjVar.f193153k;
                Parcel gA = bVar.mo17260gA();
                C8850c.m23499h(gA, awVar);
                bVar.mo17262he(9, gA);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            throw new IllegalStateException("destroyTab() must be called on a Tab in the Browser");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo64485d() {
        this.f193178a = null;
        C72580ap apVar = new C72580ap(this.f193179b);
        while (apVar.hasNext()) {
            ((C72603bl) apVar.next()).mo47094d();
        }
    }

    /* renamed from: e */
    public final void mo64486e(C72601bj bjVar) {
        C72604bm.m107399a();
        mo64487f();
        try {
            if (mo64482a() != bjVar) {
                C72331b bVar = this.f193182e;
                C72327aw awVar = bjVar.f193153k;
                Parcel gA = bVar.mo17260gA();
                C8850c.m23499h(gA, awVar);
                Parcel gT = bVar.mo17261gT(4, gA);
                boolean i = C8850c.m23500i(gT);
                gT.recycle();
                if (!i) {
                    throw new IllegalStateException("attachTab() must be called before setActiveTab");
                }
            }
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: f */
    public final void mo64487f() {
        if (this.f193182e == null) {
            throw new IllegalStateException("Browser can not be used once destroyed");
        }
    }
}
