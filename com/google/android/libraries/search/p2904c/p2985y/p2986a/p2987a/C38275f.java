package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.android.libraries.search.p2904c.C37596fh;
import com.google.android.libraries.search.p2904c.C37598fj;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.y.a.a.f */
/* compiled from: PG */
final class C38275f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37493b f101400a;

    /* renamed from: b */
    final /* synthetic */ C37773c f101401b;

    /* renamed from: c */
    final /* synthetic */ C38280k f101402c;

    public C38275f(C38280k kVar, C37493b bVar, C37773c cVar) {
        this.f101402c = kVar;
        this.f101400a = bVar;
        this.f101401b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38280k.f101415b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) d).mo56372aa(53069)).mo56387q("#audio# cannot retrieve audio focus session(token(%d)) release status", this.f101400a.f99544b);
        C38280k kVar = this.f101402c;
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        C37348am b = C37846as.m66796b(C37344ai.FAILED_GETTING_STATUS_FUTURE);
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        b.getClass();
        fjVar.f99916c = b;
        fjVar.f99915b = 6;
        C37493b bVar = this.f101400a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        bVar.getClass();
        fjVar2.f99918e = bVar;
        fjVar2.f99914a |= 512;
        C37773c cVar = this.f101401b;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        cVar.getClass();
        fjVar3.f99919f = cVar;
        fjVar3.f99914a |= 1024;
        kVar.mo41355k((C37598fj) fhVar.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37348am amVar = (C37348am) obj;
        C59104x b = C38280k.f101415b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(53070);
        int i = this.f101400a.f99544b;
        C37344ai a = C37344ai.m66353a(amVar.f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        cVar.mo56395y("#audio# audio focus session(token(%d)) release status(%s)", i, a.name());
        C38280k kVar = this.f101402c;
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        amVar.getClass();
        fjVar.f99916c = amVar;
        fjVar.f99915b = 6;
        C37493b bVar = this.f101400a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        bVar.getClass();
        fjVar2.f99918e = bVar;
        fjVar2.f99914a |= 512;
        C37773c cVar2 = this.f101401b;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        cVar2.getClass();
        fjVar3.f99919f = cVar2;
        fjVar3.f99914a |= 1024;
        kVar.mo41355k((C37598fj) fhVar.build());
    }
}
