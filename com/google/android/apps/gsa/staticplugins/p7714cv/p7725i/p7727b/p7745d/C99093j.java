package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7745d;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66624cv;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.d.j */
/* compiled from: PG */
public final /* synthetic */ class C99093j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99097n f277078a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f277079b;

    /* renamed from: c */
    public final /* synthetic */ Query f277080c;

    public /* synthetic */ C99093j(C99097n nVar, Runnable runnable, Query query) {
        this.f277078a = nVar;
        this.f277079b = runnable;
        this.f277080c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99097n nVar = this.f277078a;
        Runnable runnable = this.f277079b;
        Query query = this.f277080c;
        C66624cv cvVar = (C66624cv) obj;
        C59104x b = C99097n.f277084a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CMEngineCallback");
        ((C59052c) ((C59052c) b).mo56372aa(31494)).mo56389s("#onSuccess: %b", Boolean.valueOf(cvVar.f181251b));
        if (cvVar.f181251b) {
            runnable.run();
            return;
        }
        C59104x b2 = C99097n.f277084a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "CMEngineCallback");
        ((C59052c) ((C59052c) b2).mo56372aa(31528)).mo56389s("#suppressMultiDeviceDetection: %b", Boolean.valueOf(query.mo84423dD()));
        nVar.f277092i.f332140a.mo104099k(query);
    }
}
