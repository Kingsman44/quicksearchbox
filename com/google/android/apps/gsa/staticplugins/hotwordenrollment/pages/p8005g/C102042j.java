package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g;

import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a.C101528j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101884a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.g.j */
/* compiled from: PG */
public final class C102042j {

    /* renamed from: a */
    public static final C59071e f284688a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.g.j");

    /* renamed from: b */
    public final C74555u f284689b;

    /* renamed from: c */
    public final C101860a f284690c;

    /* renamed from: d */
    public final String f284691d;

    /* renamed from: e */
    public final C102034b f284692e;

    /* renamed from: f */
    public final C92371d f284693f;

    /* renamed from: g */
    public final C68214a f284694g;

    /* renamed from: h */
    public final C90021c f284695h;

    /* renamed from: i */
    public final C90743b f284696i;

    /* renamed from: j */
    public final C22871g f284697j;

    /* renamed from: k */
    public final C89859i f284698k;

    /* renamed from: l */
    public final C101528j f284699l;

    /* renamed from: m */
    public final C102230s f284700m;

    /* renamed from: n */
    public final C101497ae f284701n;

    /* renamed from: o */
    public final C101884a f284702o;

    /* renamed from: p */
    public C83975q f284703p;

    public C102042j(String str, C74555u uVar, C101860a aVar, C102034b bVar, C92371d dVar, C68214a aVar2, C90021c cVar, C90743b bVar2, C22871g gVar, C101528j jVar, C89859i iVar, C101497ae aeVar, C101884a aVar3, C102230s sVar) {
        C58838bb.m90884s(uVar.mo70884b() != s.a, "Expected Domain.HOME or STRUCTURE but found PHONE");
        this.f284691d = str;
        this.f284689b = uVar;
        this.f284690c = aVar;
        this.f284692e = bVar;
        this.f284693f = dVar;
        this.f284694g = aVar2;
        this.f284695h = cVar;
        this.f284696i = bVar2;
        this.f284697j = gVar;
        this.f284699l = jVar;
        this.f284698k = iVar;
        this.f284700m = sVar;
        this.f284701n = aeVar;
        this.f284702o = aVar3;
    }

    /* renamed from: a */
    public final void mo92809a() {
        C102034b bVar = this.f284692e;
        if (bVar == null || bVar.getView() == null) {
            C59104x c = f284688a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ProgressUpdateFrag");
            C59052c cVar = (C59052c) c;
            cVar.mo56380ai(C58979ad.FULL);
            C59052c cVar2 = (C59052c) cVar.mo56372aa(20527);
            C102034b bVar2 = this.f284692e;
            cVar2.mo56354G("fragment or fragment.getView() is null. Fragment: %s, fragment.getView(): %s", bVar2, bVar2 == null ? null : bVar2.getView());
            return;
        }
        C22871g gVar = this.f284697j;
        Runnable q = C47810es.m84977q(new C102035c(this));
        Objects.requireNonNull(q);
        gVar.mo28212l("Move to next screen", new C102036d(q));
    }
}
