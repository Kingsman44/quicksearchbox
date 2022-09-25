package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import android.os.RemoteException;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.publicsearch.p6481a.C84199a;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a.C106228f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.j */
/* compiled from: PG */
public final class C106309j implements C84199a {

    /* renamed from: a */
    public static final C59071e f296593a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ak.c.d.j");

    /* renamed from: b */
    public final C68214a f296594b;

    /* renamed from: c */
    public final C68214a f296595c;

    /* renamed from: d */
    public final C106304e f296596d;

    /* renamed from: e */
    public final C106317r f296597e;

    /* renamed from: f */
    public final C68214a f296598f;

    /* renamed from: g */
    public final az f296599g;

    /* renamed from: h */
    private C106228f f296600h = null;

    public C106309j(C68214a aVar, C68214a aVar2, C106304e eVar, C106317r rVar, C68214a aVar3, az azVar) {
        this.f296594b = aVar;
        this.f296595c = aVar2;
        this.f296596d = eVar;
        this.f296597e = rVar;
        this.f296598f = aVar3;
        this.f296599g = azVar;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder mo77668a(com.google.common.base.C58833ax r3) {
        /*
            r2 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r3.mo56113h()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r3.mo56107c()
            android.os.IBinder r3 = (android.os.IBinder) r3
            if (r3 != 0) goto L_0x0012
            r3 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.nga.ngaentrypoint.aidl.INgaEntryPointBinderSessionCallback"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a.C106228f
            if (r1 == 0) goto L_0x0020
            r3 = r0
            com.google.android.apps.gsa.staticplugins.opa.ak.c.a.f r3 = (com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a.C106228f) r3
            goto L_0x0026
        L_0x0020:
            com.google.android.apps.gsa.staticplugins.opa.ak.c.a.d r0 = new com.google.android.apps.gsa.staticplugins.opa.ak.c.a.d
            r0.<init>(r3)
            r3 = r0
        L_0x0026:
            r2.f296600h = r3
        L_0x0028:
            com.google.android.apps.gsa.staticplugins.opa.ak.c.d.r r3 = r2.f296597e
            com.google.android.apps.gsa.staticplugins.opa.ak.c.d.f r0 = new com.google.android.apps.gsa.staticplugins.opa.ak.c.d.f
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r3 = r3.f296614d
            r3.set(r0)
            com.google.android.apps.gsa.staticplugins.opa.ak.c.d.e r3 = r2.f296596d
            com.google.android.apps.gsa.staticplugins.opa.ak.c.d.g r0 = new com.google.android.apps.gsa.staticplugins.opa.ak.c.d.g
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r3 = r3.f296583e
            r3.set(r0)
            com.google.android.apps.gsa.staticplugins.opa.ak.c.d.i r3 = new com.google.android.apps.gsa.staticplugins.opa.ak.c.d.i
            r3.<init>(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d.C106309j.mo77668a(com.google.common.base.ax):android.os.IBinder");
    }

    /* renamed from: b */
    public final void mo95485b() {
        C106228f fVar = this.f296600h;
        if (fVar != null) {
            try {
                fVar.mo95459e();
            } catch (RemoteException e) {
                C59104x c = f296593a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NgaEntryPointBinderProv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25231)).mo56386p("error disconnecting binder session.");
            }
        }
    }
}
