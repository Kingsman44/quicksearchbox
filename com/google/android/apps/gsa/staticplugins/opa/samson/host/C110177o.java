package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.gsa.publicsearch.C84203c;
import com.google.android.apps.gsa.publicsearch.C84205e;
import com.google.android.libraries.assistant.p1356b.p1359b.p1360a.C16920a;
import com.google.android.libraries.assistant.p1356b.p1359b.p1360a.C16922c;
import com.google.android.libraries.assistant.p1356b.p1359b.p1360a.C16924e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.host.o */
/* compiled from: PG */
public abstract class C110177o implements ServiceConnection {

    /* renamed from: a */
    private static final C59071e f307007a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.host.o");

    /* renamed from: b */
    private C16922c f307008b;

    /* renamed from: c */
    private final Context f307009c;

    /* renamed from: d */
    private boolean f307010d;

    /* renamed from: e */
    private final C110163a f307011e;

    public C110177o(Context context, C110163a aVar) {
        this.f307009c = context;
        this.f307011e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C16924e mo98441a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo98442b(C16922c cVar);

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98453c() {
        /*
            r4 = this;
            com.google.android.libraries.assistant.b.b.a.c r0 = r4.f307008b     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ RemoteException -> 0x000d }
            r1.<init>()     // Catch:{ RemoteException -> 0x000d }
            r0.mo23086a(r1)     // Catch:{ RemoteException -> 0x000d }
            goto L_0x000f
        L_0x000d:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0025 }
        L_0x000f:
            boolean r0 = r4.f307010d     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x001b
            android.content.Context r0 = r4.f307009c     // Catch:{ all -> 0x0025 }
            r0.unbindService(r4)     // Catch:{ all -> 0x0025 }
            r0 = 0
            r4.f307010d = r0     // Catch:{ all -> 0x0025 }
        L_0x001b:
            com.google.android.apps.gsa.staticplugins.opa.samson.host.a r0 = r4.f307011e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0024
            com.google.android.apps.gsa.staticplugins.opa.samson.host.f r0 = r0.f306980a     // Catch:{ all -> 0x0025 }
            r0.mo98445c(r4)     // Catch:{ all -> 0x0025 }
        L_0x0024:
            return
        L_0x0025:
            r0 = move-exception
            com.google.common.f.e r1 = f307007a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "OneShotSrvConn"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Exception when trying to unbind"
            r3 = 25741(0x648d, float:3.6071E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.host.C110177o.mo98453c():void");
    }

    public final void onBindingDied(ComponentName componentName) {
        mo98453c();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C84205e eVar;
        C16922c cVar;
        if (iBinder == null) {
            C59104x d = f307007a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OneShotSrvConn");
            ((C59052c) ((C59052c) d).mo56372aa(25740)).mo56386p("binder is null?");
            mo98453c();
            return;
        }
        this.f307010d = true;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
        if (queryLocalInterface instanceof C84205e) {
            eVar = (C84205e) queryLocalInterface;
        } else {
            eVar = new C84203c(iBinder);
        }
        try {
            IBinder e = eVar.mo77677e("opa_ambient_mode", mo98441a(), new Bundle());
            if (e != null) {
                IInterface queryLocalInterface2 = e.queryLocalInterface("com.google.android.libraries.assistant.ambient.dynamic.service.IAmbientModeBinderSession");
                if (queryLocalInterface2 instanceof C16922c) {
                    cVar = (C16922c) queryLocalInterface2;
                } else {
                    cVar = new C16920a(e);
                }
                this.f307008b = cVar;
                mo98442b(cVar);
                return;
            }
            C59104x d2 = f307007a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "OneShotSrvConn");
            ((C59052c) ((C59052c) d2).mo56372aa(25738)).mo56386p("null binder session returned. Disconnecting.");
            mo98453c();
        } catch (RemoteException e2) {
            C59104x d3 = f307007a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "OneShotSrvConn");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e2)).mo56372aa(25739)).mo56386p("Failed to connect");
            mo98453c();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        mo98453c();
    }
}
