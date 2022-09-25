package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b;

import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85505a;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.b.c */
/* compiled from: PG */
public final /* synthetic */ class C117891c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C117893e f327216a;

    /* renamed from: b */
    public final /* synthetic */ long f327217b;

    /* renamed from: c */
    public final /* synthetic */ ClientConfig f327218c;

    /* renamed from: d */
    public final /* synthetic */ C85505a f327219d;

    public /* synthetic */ C117891c(C117893e eVar, long j, ClientConfig clientConfig, C85505a aVar) {
        this.f327216a = eVar;
        this.f327217b = j;
        this.f327218c = clientConfig;
        this.f327219d = aVar;
    }

    public final void run() {
        C37478d dVar;
        C37520e eVar;
        C117893e eVar2 = this.f327216a;
        long j = this.f327217b;
        ClientConfig clientConfig = this.f327218c;
        C85505a aVar = this.f327219d;
        if (eVar2.f327223b.mo79746e(C90086ek.f250467dg) && !eVar2.f327227f) {
            eVar2.f327227f = true;
            C37520e eVar3 = C37520e.ROUTE_BLUETOOTH_REQUIRED;
            C37478d dVar2 = C37478d.CONNECTION_TYPE_ANY;
            if (clientConfig != null && clientConfig.mo81872B()) {
                eVar = C37520e.ROUTE_NO_BLUETOOTH;
                dVar = C37478d.CONNECTION_TYPE_NONE;
            } else if (((C89994f) eVar2.f327225d.mo27525b()).mo83869aF()) {
                eVar = C37520e.ROUTE_BLUETOOTH_PREFERRED;
                dVar = C37478d.CONNECTION_TYPE_BVRA;
            } else {
                eVar = C37520e.ROUTE_NO_BLUETOOTH;
                dVar = C37478d.CONNECTION_TYPE_ANY;
            }
            C85505a aVar2 = dVar != C37478d.CONNECTION_TYPE_NONE ? aVar : null;
            eVar2.f327224c.mo79029e(j);
            eVar2.f327224c.mo79033i(eVar, dVar, aVar2, true);
            eVar2.f327229h = clientConfig;
            eVar2.f327230i = aVar;
            eVar2.f327228g = j;
        }
    }
}
