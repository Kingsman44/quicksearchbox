package com.google.android.apps.gsa.search.shared.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87666a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.android.apps.gsa.search.shared.service.x */
/* compiled from: PG */
final class C88503x implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C87673aa f239211a;

    /* renamed from: b */
    private final C88505z f239212b;

    /* renamed from: c */
    private final ClientConfig f239213c;

    public C88503x(C87673aa aaVar, C88505z zVar, ClientConfig clientConfig) {
        this.f239211a = aaVar;
        this.f239212b = zVar;
        this.f239213c = clientConfig;
    }

    /* renamed from: a */
    public final void mo82023a() {
        AttachClientResponse attachClientResponse;
        try {
            C87673aa aaVar = this.f239211a;
            C88495p pVar = aaVar.f236994j;
            if (pVar != null) {
                attachClientResponse = pVar.mo80232a(aaVar.f236988d, this.f239212b, this.f239213c, aaVar.f237001q);
            } else {
                C87666a aVar = aaVar.f236995k;
                if (aVar != null) {
                    attachClientResponse = aVar.mo80239e(aaVar.f236988d, this.f239212b, this.f239213c, aaVar.f237001q);
                } else {
                    return;
                }
            }
            C87673aa aaVar2 = this.f239211a;
            aaVar2.f236996l = attachClientResponse.f236946a;
            aaVar2.f237000p = attachClientResponse.f236947b;
            C88492m mVar = aaVar2.f236996l;
            if (mVar == null) {
                ((C59052c) ((C59052c) C87673aa.f236983a.mo56225c()).mo56372aa(9736)).mo56386p("Attach client call failed!");
                return;
            }
            try {
                for (ClientEventData i : aaVar2.f236989e) {
                    mVar.mo80387i(i);
                }
                aaVar2.f236989e.clear();
                ClientEventData clientEventData = aaVar2.f236999o;
                if (clientEventData != null) {
                    aaVar2.f237002r = false;
                    mVar.mo80387i(clientEventData);
                }
                C87673aa aaVar3 = this.f239211a;
                aaVar3.f236993i.mo82016e(new C87684al(C88244um.ON_SERVICE_CONNECTED).mo81964a());
                if (aaVar3.f236998n && aaVar3.f237000p.f237036b) {
                    aaVar3.mo81947s((Bundle) null);
                }
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) C87673aa.f236983a.mo56225c()).mo56382g(e)).mo56372aa(9760)).mo56386p("flushPendingItems failed");
            }
        } catch (RemoteException e2) {
            ((C59052c) ((C59052c) ((C59052c) C87673aa.f236983a.mo56225c()).mo56382g(e2)).mo56372aa(9735)).mo56386p("setSearchServiceUiCallback() failed");
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        C59071e eVar = C87673aa.f236983a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C87673aa aaVar = this.f239211a;
        aaVar.f236997m = false;
        aaVar.f236996l = null;
        aaVar.mo81936h();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            com.google.common.f.e r3 = com.google.android.apps.gsa.search.shared.service.C87673aa.f236983a
            com.google.common.f.ad r3 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r0 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r3, r0)
            com.google.android.apps.gsa.search.shared.service.aa r3 = r2.f239211a
            com.google.android.apps.gsa.shared.s.a.a r3 = r3.f236987c
            boolean r3 = r3.mo84225b()
            if (r3 == 0) goto L_0x001c
            com.google.android.apps.gsa.search.shared.service.aa r3 = r2.f239211a
            com.google.android.apps.gsa.shared.s.a.a r3 = r3.f236987c
            java.lang.String r0 = "SearchService.onServiceConnected"
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148695a(r0, r3)
        L_0x001c:
            com.google.android.apps.gsa.search.shared.service.aa r3 = r2.f239211a
            if (r4 != 0) goto L_0x0022
            r4 = 0
            goto L_0x0036
        L_0x0022:
            java.lang.String r0 = "com.google.android.apps.gsa.search.shared.service.ISearchServiceBinder"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.apps.gsa.search.shared.service.C88495p
            if (r1 == 0) goto L_0x0030
            r4 = r0
            com.google.android.apps.gsa.search.shared.service.p r4 = (com.google.android.apps.gsa.search.shared.service.C88495p) r4
            goto L_0x0036
        L_0x0030:
            com.google.android.apps.gsa.search.shared.service.n r0 = new com.google.android.apps.gsa.search.shared.service.n
            r0.<init>(r4)
            r4 = r0
        L_0x0036:
            r3.f236994j = r4
            r2.mo82023a()
            com.google.android.apps.gsa.search.shared.service.aa r3 = r2.f239211a
            com.google.android.apps.gsa.shared.s.a.a r3 = r3.f236987c
            boolean r3 = r3.mo84225b()
            if (r3 == 0) goto L_0x004c
            com.google.android.apps.gsa.search.shared.service.aa r3 = r2.f239211a
            com.google.android.apps.gsa.shared.s.a.a r3 = r3.f236987c
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148696b(r3)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.service.C88503x.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59071e eVar = C87673aa.f236983a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C87673aa aaVar = this.f239211a;
        aaVar.f236996l = null;
        aaVar.mo81936h();
    }
}
