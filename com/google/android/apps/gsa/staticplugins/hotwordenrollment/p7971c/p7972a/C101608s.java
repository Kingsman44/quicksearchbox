package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a;

import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7975c.C101575b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101771k;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102170bn;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import dagger.C68214a;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.s */
/* compiled from: PG */
public final class C101608s implements C101771k {

    /* renamed from: a */
    public static final C59071e f283512a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.s");

    /* renamed from: b */
    public final C68214a f283513b;

    /* renamed from: c */
    public final C101860a f283514c;

    /* renamed from: d */
    public final C86124t f283515d;

    /* renamed from: e */
    public final C101610b f283516e;

    /* renamed from: f */
    public final C68214a f283517f;

    /* renamed from: g */
    public final C101497ae f283518g;

    /* renamed from: h */
    public final boolean f283519h;

    /* renamed from: i */
    public final C102170bn f283520i;

    /* renamed from: j */
    public final C101575b f283521j;

    /* renamed from: k */
    public final C101606q f283522k;

    /* renamed from: l */
    private final C74555u f283523l;

    public C101608s(C101606q qVar, C68214a aVar, C74555u uVar, C101860a aVar2, C68214a aVar3, C86124t tVar, C101610b bVar, C101497ae aeVar, C101575b bVar2, C102170bn bnVar) {
        this.f283522k = qVar;
        this.f283513b = aVar;
        this.f283523l = uVar;
        this.f283514c = aVar2;
        this.f283515d = tVar;
        this.f283516e = bVar;
        this.f283517f = aVar3;
        this.f283518g = aeVar;
        this.f283521j = bVar2;
        this.f283520i = bnVar;
        this.f283519h = C92408n.m151745g(uVar.mo70891j(), aVar2.f284137d.get(), (C92371d) aVar.mo27525b());
    }

    /* renamed from: b */
    public static C101775o m168044b(C101860a aVar) {
        if (aVar.f284140g.get()) {
            return m168045c(aVar);
        }
        return C101775o.m168404f(C101773m.VOICE_MATCH_CONSENT_SCREEN);
    }

    /* renamed from: c */
    public static C101775o m168045c(C101860a aVar) {
        C101773m mVar;
        if (aVar.f284134a.get()) {
            mVar = C101773m.PROGRESS_UPDATE_SCREEN;
        } else {
            mVar = C101773m.FRESH_ENROLL_SCREEN;
        }
        return C101775o.m168407i(mVar);
    }

    /* renamed from: a */
    public final C101775o mo92422a() {
        if (this.f283514c.f284140g.get() || !this.f283516e.mo92421b()) {
            return m168044b(this.f283514c);
        }
        return C101775o.m168404f(C101773m.HOTWORD_SCREEN);
    }

    /* renamed from: d */
    public final void mo92423d() {
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.VOICE_MATCH_SHARED_DEVICE_ENROLLMENT_START;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String c = this.f283514c.mo92638c();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160115b |= 4096;
        cbVar.f160048M = c;
        C9439b a = this.f283523l.mo70883a();
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        cbVar2.f160049N = a.f32835aq;
        cbVar2.f160115b |= 8192;
        ajVar.mo57004a((List) Collection.EL.stream(((C92371d) this.f283513b.mo27525b()).f257559d).map(C101607r.f283511a).collect(Collectors.toList()));
        boolean z = this.f283514c.f284134a.get();
        ajVar.copyOnWrite();
        C59687cb cbVar3 = (C59687cb) ajVar.instance;
        cbVar3.f160115b |= 32768;
        cbVar3.f160051P = z;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f283517f.mo27525b()).mo74236a(fVar.mo83699a());
    }
}
