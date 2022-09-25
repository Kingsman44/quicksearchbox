package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66624cv;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C98921k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C98932v f276456a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f276457b;

    /* renamed from: c */
    public final /* synthetic */ Query f276458c;

    public /* synthetic */ C98921k(C98932v vVar, Runnable runnable, Query query) {
        this.f276456a = vVar;
        this.f276457b = runnable;
        this.f276458c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C98932v vVar = this.f276456a;
        Runnable runnable = this.f276457b;
        Query query = this.f276458c;
        C66624cv cvVar = (C66624cv) obj;
        C59104x b = C98932v.f276474a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarEngineCallback");
        ((C59052c) ((C59052c) b).mo56372aa(31291)).mo56389s("#onSuccess: %b", Boolean.valueOf(cvVar.f181251b));
        if (cvVar.f181251b) {
            runnable.run();
            return;
        }
        C59104x b2 = C98932v.f276474a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "CarEngineCallback");
        ((C59052c) ((C59052c) b2).mo56372aa(31326)).mo56389s("#suppressMultiDeviceDetection: %b", Boolean.valueOf(query.mo84423dD()));
        vVar.f276486i.f332140a.mo104099k(query);
    }
}
