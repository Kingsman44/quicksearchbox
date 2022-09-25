package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107261c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107272c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3825an.p3830c.p3831a.C49255aa;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.t */
/* compiled from: PG */
final class C107319t implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C107316q f298665a;

    public C107319t(C107316q qVar) {
        this.f298665a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C107316q qVar = this.f298665a;
        qVar.f298656a.setResult(20);
        C107308i iVar = ((C107261c) bVar).f298546a;
        C107272c cVar = (C107272c) C107273d.f298572i.createBuilder();
        Optional h = iVar.mo95857h();
        Objects.requireNonNull(cVar);
        h.ifPresent(new C107311l(cVar));
        Optional f = iVar.mo95855f();
        Objects.requireNonNull(cVar);
        f.ifPresent(new C107312m(cVar));
        Optional o = iVar.mo95865o();
        Objects.requireNonNull(cVar);
        o.ifPresent(new C107313n(cVar));
        Optional j = iVar.mo95860j();
        Objects.requireNonNull(cVar);
        j.ifPresent(new C107314o(cVar));
        Optional i = iVar.mo95859i();
        Objects.requireNonNull(cVar);
        i.ifPresent(new C107315p(cVar));
        int p = iVar.mo95866p();
        cVar.copyOnWrite();
        C107273d dVar = (C107273d) cVar.instance;
        dVar.f298579f = C49255aa.m85392a(p);
        dVar.f298574a |= 16;
        qVar.mo95908b(C107242ak.m178031a((C107273d) cVar.build()));
        return C47392e.f123115a;
    }
}
