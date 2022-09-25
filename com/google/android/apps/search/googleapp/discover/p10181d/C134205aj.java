package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.UUID;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.aj */
/* compiled from: PG */
public final class C134205aj {

    /* renamed from: a */
    public static final C59071e f365565a = C59071e.m91331h();

    /* renamed from: b */
    public final C37215b f365566b;

    /* renamed from: c */
    private final ConcurrentHashMap f365567c = new ConcurrentHashMap();

    public C134205aj(C37215b bVar) {
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f365566b = bVar;
    }

    /* renamed from: h */
    private final C134202ag m217702h(UUID uuid) {
        return (C134202ag) this.f365567c.remove(uuid);
    }

    /* renamed from: i */
    private final C134202ag m217703i(UUID uuid) {
        return (C134202ag) this.f365567c.get(uuid);
    }

    /* renamed from: a */
    public final void mo111615a(UUID uuid, C37258g gVar) {
        ConcurrentMap.EL.compute(this.f365567c, uuid, new C134204ai(this, uuid, gVar));
    }

    /* renamed from: b */
    public final void mo111616b(UUID uuid, C62722b bVar) {
        C69664n.m101061g(uuid, "requestId");
        C134202ag h = m217702h(uuid);
        if (h != null) {
            h.mo111613b(bVar);
        }
    }

    /* renamed from: c */
    public final void mo111617c(UUID uuid, Status.Code code) {
        C69664n.m101061g(uuid, "requestId");
        C62722b a = C62722b.m94931a(code.value());
        if (a != null) {
            mo111616b(uuid, a);
        } else {
            mo111621g(uuid);
        }
    }

    /* renamed from: d */
    public final void mo111618d(UUID uuid) {
        C69664n.m101061g(uuid, "requestId");
        C134202ag i = m217703i(uuid);
        if (i != null && C134201af.m217698a(i.f365554a, C134203ah.STARTED, C134203ah.SENT)) {
            C37215b bVar = i.f365555b.f365566b;
            C37258g gVar = C37182a.f97815au;
            C69664n.m101060f(gVar, "DISCOVER_REQUEST_SENT");
            bVar.mo19974a(i.mo111612a(gVar));
        }
    }

    /* renamed from: e */
    public final void mo111619e(UUID uuid) {
        C69664n.m101061g(uuid, "requestId");
        C134202ag h = m217702h(uuid);
        if (h != null && C134201af.m217698a(h.f365554a, C134203ah.RECEIVED, C134203ah.FINISHED)) {
            h.mo111614c(C62722b.OK);
        }
    }

    /* renamed from: f */
    public final void mo111620f(UUID uuid) {
        C69664n.m101061g(uuid, "requestId");
        C134202ag i = m217703i(uuid);
        if (i != null && C134201af.m217698a(i.f365554a, C134203ah.SENT, C134203ah.RECEIVED)) {
            C37215b bVar = i.f365555b.f365566b;
            C37258g gVar = C37182a.f97816av;
            C69664n.m101060f(gVar, "DISCOVER_RESPONSE_RECEIVED");
            bVar.mo19974a(i.mo111612a(gVar));
        }
    }

    /* renamed from: g */
    public final void mo111621g(UUID uuid) {
        C69664n.m101061g(uuid, "requestId");
        C134202ag h = m217702h(uuid);
        if (h != null) {
            h.mo111613b(C62722b.UNKNOWN);
        }
    }
}
