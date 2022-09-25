package com.google.android.apps.gsa.staticplugins.p7666ci.p7667a;

import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85491h;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.a.i */
/* compiled from: PG */
public final class C97754i implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C87696ae f272939a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f272940b;

    /* renamed from: c */
    final /* synthetic */ C97759n f272941c;

    public C97754i(C97759n nVar, C87696ae aeVar, C58833ax axVar) {
        this.f272941c = nVar;
        this.f272939a = aeVar;
        this.f272940b = axVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C97759n.f272950a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30298)).mo56386p("Unable to check if the request should be throttled.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C97759n nVar = this.f272941c;
            nVar.f272952c.mo79001f(this.f272939a, (C85491h) nVar.f272955f.mo27525b());
            C59104x b = C97759n.f272950a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
            ((C59052c) ((C59052c) b).mo56372aa(30300)).mo56389s("The client sync request %s started.", ((C53306j) this.f272940b.mo56107c()).name());
            return;
        }
        this.f272941c.f272960k.putIfAbsent((C53306j) this.f272940b.mo56107c(), new AtomicLong());
        AtomicLong atomicLong = (AtomicLong) this.f272941c.f272960k.get(this.f272940b.mo56107c());
        atomicLong.getClass();
        long incrementAndGet = atomicLong.incrementAndGet();
        C59104x b2 = C97759n.f272950a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
        ((C59052c) ((C59052c) b2).mo56372aa(30299)).mo56351D("The client sync request %s delayed %s.", incrementAndGet, ((C53306j) this.f272940b.mo56107c()).name());
        if (this.f272941c.f272958i.mo79746e(C90069du.f249733k)) {
            C22871g gVar = this.f272941c.f272951b;
            String format = String.format("Execute delayed {%s} client sync.", new Object[]{Long.valueOf(incrementAndGet)});
            long j = incrementAndGet * this.f272941c.f272957h;
            gVar.mo28208h(format, j, new C97753h(this, this.f272939a, atomicLong, this.f272940b, incrementAndGet));
        }
    }
}
