package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.android.libraries.search.p2904c.C37596fh;
import com.google.android.libraries.search.p2904c.C37598fj;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.y.a.a.g */
/* compiled from: PG */
final class C38276g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37493b f101403a;

    /* renamed from: b */
    final /* synthetic */ C37773c f101404b;

    /* renamed from: c */
    final /* synthetic */ C38280k f101405c;

    public C38276g(C38280k kVar, C37493b bVar, C37773c cVar) {
        this.f101405c = kVar;
        this.f101403a = bVar;
        this.f101404b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38280k.f101415b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) d).mo56372aa(53071)).mo56387q("#audio# cannot retrieve audio focus session(token(%d)) acquire status", this.f101403a.f99544b);
        C38280k kVar = this.f101405c;
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        C37338ac a = C37846as.m66795a(C37341af.FAILED_ACQUIRING_ERROR_GETTING_STATUS_FUTURE);
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        a.getClass();
        fjVar.f99916c = a;
        fjVar.f99915b = 5;
        C37493b bVar = this.f101403a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        bVar.getClass();
        fjVar2.f99918e = bVar;
        fjVar2.f99914a |= 512;
        C37773c cVar = this.f101404b;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        cVar.getClass();
        fjVar3.f99919f = cVar;
        fjVar3.f99914a |= 1024;
        kVar.mo41355k((C37598fj) fhVar.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37338ac acVar = (C37338ac) obj;
        C59104x b = C38280k.f101415b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(53072);
        int i = this.f101403a.f99544b;
        C37341af a = C37341af.m66350a(acVar.f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        cVar.mo56395y("#audio# audio focus session(token(%d)) acquire status(%s)", i, a.name());
        C38280k kVar = this.f101405c;
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        acVar.getClass();
        fjVar.f99916c = acVar;
        fjVar.f99915b = 5;
        C37493b bVar = this.f101403a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        bVar.getClass();
        fjVar2.f99918e = bVar;
        fjVar2.f99914a |= 512;
        C37773c cVar2 = this.f101404b;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        cVar2.getClass();
        fjVar3.f99919f = cVar2;
        fjVar3.f99914a |= 1024;
        kVar.mo41355k((C37598fj) fhVar.build());
    }
}
