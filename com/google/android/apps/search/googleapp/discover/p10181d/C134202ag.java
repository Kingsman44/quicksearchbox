package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.ag */
/* compiled from: PG */
final class C134202ag {

    /* renamed from: a */
    public final AtomicReference f365554a = new AtomicReference(C134203ah.STARTED);

    /* renamed from: b */
    final /* synthetic */ C134205aj f365555b;

    /* renamed from: c */
    private final UUID f365556c;

    public C134202ag(C134205aj ajVar, UUID uuid, C37258g gVar) {
        C69664n.m101061g(uuid, "requestId");
        C69664n.m101061g(gVar, "event");
        this.f365555b = ajVar;
        this.f365556c = uuid;
        ajVar.f365566b.mo19974a(mo111612a(gVar));
    }

    /* renamed from: a */
    public final C37252a mo111612a(C37258g gVar) {
        return gVar.mo40816j("DISCOVER_NETWORK", this.f365556c.toString());
    }

    /* renamed from: b */
    public final void mo111613b(C62722b bVar) {
        C69664n.m101061g(bVar, "code");
        if (((C134203ah) this.f365554a.getAndSet(C134203ah.FINISHED)) != C134203ah.FINISHED) {
            mo111614c(bVar);
        }
    }

    /* renamed from: c */
    public final void mo111614c(C62722b bVar) {
        C37215b bVar2 = this.f365555b.f365566b;
        C37257f fVar = C37182a.f97817aw;
        C69664n.m101060f(fVar, "DISCOVER_REQUEST_FINISHED");
        bVar2.mo19974a(fVar.mo40808f("DISCOVER_NETWORK", this.f365556c.toString()).mo40781e(bVar));
    }
}
