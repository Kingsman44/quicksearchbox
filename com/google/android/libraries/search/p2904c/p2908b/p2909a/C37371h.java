package com.google.android.libraries.search.p2904c.p2908b.p2909a;

import com.google.android.libraries.search.p2904c.C37508do;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37381e;
import com.google.android.libraries.search.p2904c.p2908b.C37382f;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2908b.C37388l;
import com.google.android.libraries.search.p2904c.p2908b.C37390n;
import com.google.android.libraries.search.p2904c.p2916e.C37539c;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.b.a.h */
/* compiled from: PG */
public final class C37371h implements C37363a {

    /* renamed from: a */
    private static final C59071e f99258a = C59071e.m91331h();

    /* renamed from: b */
    private final C37384h f99259b;

    /* renamed from: c */
    private final C37877c f99260c;

    /* renamed from: d */
    private final C37369f f99261d;

    /* renamed from: e */
    private final C37369f f99262e;

    public C37371h(C37384h hVar, C37877c cVar, C37369f fVar, C37369f fVar2) {
        this.f99259b = hVar;
        this.f99260c = cVar;
        this.f99261d = fVar;
        this.f99262e = fVar2;
    }

    /* renamed from: a */
    private final boolean m66383a() {
        C37539c cVar = (C37539c) this.f99260c.mo41097c().mo56111f();
        if (cVar != null && !this.f99262e.mo40911e(this.f99259b, cVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C58833ax mo24473c(C37388l lVar) {
        C69664n.m101061g(lVar, "params");
        if (this.f99260c.mo41099e().isDone()) {
            C59052c cVar = (C59052c) f99258a.mo56226d();
            String name = this.f99259b.name();
            cVar.mo56379ah(new C59094n(52659));
            cVar.mo56389s("#audio# Failed to start listening (%s), route disconnected", name);
            throw new C37902d(C37846as.m66803i(C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING));
        } else if (!m66383a()) {
            C37363a aVar = (C37363a) this.f99261d.mo40909c(this.f99259b).mo56111f();
            if (aVar != null) {
                C58833ax c = aVar.mo24473c(lVar);
                C69664n.m101060f(c, "audioAdapter.startListening(params)");
                return c;
            }
            C59052c cVar2 = (C59052c) f99258a.mo56226d();
            String name2 = this.f99259b.name();
            cVar2.mo56379ah(new C59094n(52657));
            cVar2.mo56389s("#audio# Failed to start listening (%s), no adapter", name2);
            throw new C37902d(C37846as.m66803i(C37519dz.FAILED_OPENING_NO_AUDIO_ADAPTER_FOUND));
        } else {
            C59052c cVar3 = (C59052c) f99258a.mo56226d();
            String name3 = this.f99259b.name();
            cVar3.mo56379ah(new C59094n(52658));
            cVar3.mo56389s("#audio# Failed to start listening (%s), no connection", name3);
            throw new C37902d(C37846as.m66803i(C37519dz.FAILED_OPENING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND));
        }
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo24474d() {
        return C60856cj.m92900i(C37381e.AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo24475e(boolean z) {
        return C60856cj.m92900i(C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS);
    }

    /* renamed from: f */
    public final C60870cx mo24476f(C37390n nVar) {
        C69664n.m101061g(nVar, "params");
        if (this.f99260c.mo41099e().isDone()) {
            C59052c cVar = (C59052c) f99258a.mo56224b();
            String name = this.f99259b.name();
            cVar.mo56379ah(new C59094n(52662));
            cVar.mo56389s("#audio# Skipping stop listening (%s), route disconnected", name);
            C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
            C69664n.m101060f(dtVar, "newBuilder()");
            C37508do a = C69664n.m101061g(dtVar, "builder");
            a.mo40994b(C37512ds.FAILED_CLOSING_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING);
            return C60856cj.m92900i(a.mo40993a());
        } else if (m66383a()) {
            C59052c cVar2 = (C59052c) f99258a.mo56224b();
            String name2 = this.f99259b.name();
            cVar2.mo56379ah(new C59094n(52661));
            cVar2.mo56389s("#audio# Skipping stop listening (%s), no connection", name2);
            C37513dt dtVar2 = (C37513dt) C37514du.f99629c.createBuilder();
            C69664n.m101060f(dtVar2, "newBuilder()");
            C37508do a2 = C69664n.m101061g(dtVar2, "builder");
            a2.mo40994b(C37512ds.FAILED_CLOSING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND);
            return C60856cj.m92900i(a2.mo40993a());
        } else {
            C37363a aVar = (C37363a) this.f99261d.mo40909c(this.f99259b).mo56111f();
            if (aVar == null) {
                C59052c cVar3 = (C59052c) f99258a.mo56224b();
                String name3 = this.f99259b.name();
                cVar3.mo56379ah(new C59094n(52660));
                cVar3.mo56389s("#audio# Skipping stop listening (%s), no adapter", name3);
                C37513dt dtVar3 = (C37513dt) C37514du.f99629c.createBuilder();
                C69664n.m101060f(dtVar3, "newBuilder()");
                C37508do a3 = C69664n.m101061g(dtVar3, "builder");
                a3.mo40994b(C37512ds.FAILED_CLOSING_NO_AUDIO_ADAPTER_FOUND);
                return C60856cj.m92900i(a3.mo40993a());
            }
            C60870cx f = aVar.mo24476f(nVar);
            C69664n.m101060f(f, "audioAdapter.stopListening(params)");
            return f;
        }
    }
}
