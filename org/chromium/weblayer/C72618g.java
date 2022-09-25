package org.chromium.weblayer;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C2368bp;
import org.chromium.p5643b.p5644a.C72346e;

/* renamed from: org.chromium.weblayer.g */
/* compiled from: PG */
public final class C72618g extends C72590az {

    /* renamed from: a */
    public C72615d f193187a;

    /* renamed from: f */
    private C72611bt f193188f;

    /* renamed from: g */
    private C72346e f193189g;

    /* renamed from: k */
    private final boolean m107440k() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        return arguments.getBoolean("use_view_model", false);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.chromium.p5643b.p5644a.C72322ar mo64438a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Failed to initialize WebLayer"
            android.os.Bundle r1 = r4.getArguments()
            if (r1 == 0) goto L_0x006b
            org.chromium.weblayer.bt r5 = org.chromium.weblayer.C72611bt.m107419g(r5)     // Catch:{ Exception -> 0x0064 }
            r4.f193188f = r5     // Catch:{ Exception -> 0x0064 }
            java.lang.String r5 = "is_incognito"
            r2 = 0
            boolean r5 = r1.getBoolean(r5, r2)
            if (r5 == 0) goto L_0x001c
            java.lang.String r5 = "profile_name"
            r1.getString(r5)
        L_0x001c:
            org.chromium.weblayer.bt r5 = r4.f193188f     // Catch:{ Exception -> 0x005d }
            org.chromium.weblayer.ax r2 = r4.f193130b     // Catch:{ Exception -> 0x005d }
            org.chromium.b.a.bc r5 = r5.f193174f     // Catch:{ RemoteException -> 0x0056 }
            org.chromium.b.a.bj r3 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x0056 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0056 }
            org.chromium.b.a.e r5 = r5.mo63787t(r2, r3)     // Catch:{ RemoteException -> 0x0056 }
            r4.f193189g = r5     // Catch:{ Exception -> 0x005d }
            android.os.Parcel r1 = r5.mo17260gA()     // Catch:{ Exception -> 0x005d }
            r2 = 1
            android.os.Parcel r5 = r5.mo17261gT(r2, r1)     // Catch:{ Exception -> 0x005d }
            android.os.IBinder r1 = r5.readStrongBinder()     // Catch:{ Exception -> 0x005d }
            if (r1 != 0) goto L_0x003e
            r1 = 0
            goto L_0x0052
        L_0x003e:
            java.lang.String r2 = "org.chromium.weblayer_private.interfaces.IRemoteFragment"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ Exception -> 0x005d }
            boolean r3 = r2 instanceof org.chromium.p5643b.p5644a.C72322ar     // Catch:{ Exception -> 0x005d }
            if (r3 == 0) goto L_0x004c
            r1 = r2
            org.chromium.b.a.ar r1 = (org.chromium.p5643b.p5644a.C72322ar) r1     // Catch:{ Exception -> 0x005d }
            goto L_0x0052
        L_0x004c:
            org.chromium.b.a.ar r2 = new org.chromium.b.a.ar     // Catch:{ Exception -> 0x005d }
            r2.<init>(r1)     // Catch:{ Exception -> 0x005d }
            r1 = r2
        L_0x0052:
            r5.recycle()     // Catch:{ Exception -> 0x005d }
            return r1
        L_0x0056:
            r5 = move-exception
            org.chromium.b.a.a r1 = new org.chromium.b.a.a     // Catch:{ Exception -> 0x005d }
            r1.<init>(r5)     // Catch:{ Exception -> 0x005d }
            throw r1     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            r5 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r5)
            throw r1
        L_0x0064:
            r5 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r5)
            throw r1
        L_0x006b:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "BrowserFragment was created without arguments."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72618g.mo64438a(android.content.Context):org.chromium.b.a.ar");
    }

    public final void onAttach(Context context) {
        C72604bm.m107399a();
        C72617f fVar = (C72617f) new C2368bp(this).mo5770a(C72617f.class);
        C72615d dVar = fVar.f193185b;
        if (dVar != null) {
            this.f193130b = fVar.f193128d;
            this.f193130b.f193126a = this;
            this.f193133e = fVar.f193129e;
            this.f193131c = true;
            this.f193187a = dVar;
            this.f193188f = fVar.f193184a;
            this.f193189g = fVar.f193186c;
            this.f193187a.f193178a = this;
        }
        super.onAttach(context);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            org.chromium.weblayer.d r5 = r4.f193187a
            if (r5 != 0) goto L_0x006c
            org.chromium.weblayer.d r5 = new org.chromium.weblayer.d     // Catch:{ RemoteException -> 0x0065 }
            org.chromium.b.a.e r0 = r4.f193189g     // Catch:{ RemoteException -> 0x0065 }
            android.os.Parcel r1 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x0065 }
            r2 = 2
            android.os.Parcel r0 = r0.mo17261gT(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            android.os.IBinder r1 = r0.readStrongBinder()     // Catch:{ RemoteException -> 0x0065 }
            if (r1 != 0) goto L_0x001c
            r1 = 0
            goto L_0x0030
        L_0x001c:
            java.lang.String r2 = "org.chromium.weblayer_private.interfaces.IBrowser"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0065 }
            boolean r3 = r2 instanceof org.chromium.p5643b.p5644a.C72331b     // Catch:{ RemoteException -> 0x0065 }
            if (r3 == 0) goto L_0x002a
            r1 = r2
            org.chromium.b.a.b r1 = (org.chromium.p5643b.p5644a.C72331b) r1     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0030
        L_0x002a:
            org.chromium.b.a.b r2 = new org.chromium.b.a.b     // Catch:{ RemoteException -> 0x0065 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0065 }
            r1 = r2
        L_0x0030:
            r0.recycle()     // Catch:{ RemoteException -> 0x0065 }
            r5.<init>(r1, r4)     // Catch:{ RemoteException -> 0x0065 }
            r4.f193187a = r5     // Catch:{ RemoteException -> 0x0065 }
            boolean r5 = r4.m107440k()
            if (r5 == 0) goto L_0x0064
            androidx.lifecycle.bp r5 = new androidx.lifecycle.bp
            r5.<init>(r4)
            java.lang.Class<org.chromium.weblayer.f> r0 = org.chromium.weblayer.C72617f.class
            androidx.lifecycle.bf r5 = r5.mo5770a(r0)
            org.chromium.weblayer.ay r5 = (org.chromium.weblayer.C72589ay) r5
            r0 = 1
            r4.f193132d = r0
            org.chromium.weblayer.ax r0 = r4.f193130b
            r5.f193128d = r0
            org.chromium.b.a.ar r0 = r4.f193133e
            r5.f193129e = r0
            org.chromium.weblayer.f r5 = (org.chromium.weblayer.C72617f) r5
            org.chromium.b.a.e r0 = r4.f193189g
            r5.f193186c = r0
            org.chromium.weblayer.bt r0 = r4.f193188f
            r5.f193184a = r0
            org.chromium.weblayer.d r0 = r4.f193187a
            r5.f193185b = r0
        L_0x0064:
            return
        L_0x0065:
            r5 = move-exception
            org.chromium.b.a.a r0 = new org.chromium.b.a.a
            r0.<init>(r5)
            throw r0
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72618g.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        C72604bm.m107399a();
        if (m107440k()) {
            C72615d dVar = this.f193187a;
            if (dVar.f193178a == this) {
                dVar.f193178a = null;
            }
            super.onDestroy();
        } else {
            this.f193187a.mo64485d();
            super.onDestroy();
            this.f193187a.f193182e = null;
        }
        this.f193187a = null;
    }
}
