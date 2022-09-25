package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.C74276sg;
import com.google.android.apps.gsa.binaries.satin.app.C74277sh;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125131de;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.p9459b.C125907a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126056bu;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126316ay;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C62910ar;
import dagger.p5294a.C68225k;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.av */
/* compiled from: PG */
public final class C126208av {

    /* renamed from: a */
    public static final C59071e f347752a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.q.av");

    /* renamed from: b */
    public final C60888db f347753b;

    /* renamed from: c */
    public final C126057bv f347754c;

    /* renamed from: d */
    public final C126181j f347755d;

    /* renamed from: e */
    public final boolean f347756e;

    /* renamed from: f */
    public final C126278v f347757f;

    /* renamed from: g */
    public final C62910ar f347758g;

    /* renamed from: h */
    public final C126257cq f347759h;

    /* renamed from: i */
    public final C126206at f347760i;

    /* renamed from: j */
    public final long f347761j;

    /* renamed from: k */
    public final C126316ay f347762k;

    /* renamed from: l */
    public final C60870cx f347763l;

    /* renamed from: m */
    public final C2164c f347764m;

    /* renamed from: n */
    public final C125937z f347765n;

    /* renamed from: o */
    public final C61301b f347766o;

    /* renamed from: p */
    public af f347767p;

    /* renamed from: q */
    public C126276t f347768q;

    /* renamed from: r */
    public boolean f347769r = false;

    /* renamed from: s */
    public C17597g f347770s;

    /* renamed from: t */
    public final C126056bu f347771t = new C126281y(this);

    /* renamed from: u */
    public final C74276sg f347772u;

    /* renamed from: v */
    public final C126227bn f347773v;

    /* renamed from: w */
    public final C125907a f347774w;

    /* renamed from: x */
    private final C47632e f347775x = new C47632e();

    public C126208av(long j, C126278v vVar, C126227bn bnVar, C126316ay ayVar, C74276sg sgVar, C126174c cVar, C62910ar arVar, boolean z, C74277sh shVar, C126224bk bkVar, C125937z zVar, C126057bv bvVar, C125907a aVar, C60888db dbVar) {
        C74277sh shVar2 = shVar;
        this.f347753b = dbVar;
        this.f347756e = z;
        this.f347757f = vVar;
        this.f347772u = sgVar;
        this.f347773v = bnVar;
        long andIncrement = bkVar.f347825a.getAndIncrement();
        this.f347761j = andIncrement;
        this.f347758g = arVar;
        this.f347754c = bvVar;
        this.f347774w = aVar;
        C126181j a = cVar.mo107402a(j, andIncrement);
        this.f347755d = a;
        C126204ar arVar2 = new C126204ar(this);
        C62910ar arVar3 = (C62910ar) ((C46897i) shVar2.f207991a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45354849").mo50905d();
        C68225k.m98532d(arVar3);
        this.f347759h = new C126257cq(andIncrement, ayVar, a, arVar2, arVar3, (C60888db) shVar2.f207991a.a.n.mo17428b(), (C126222bi) shVar2.f207991a.c.u.mo17428b());
        this.f347765n = zVar;
        this.f347767p = zVar.mo107203b().f347148c;
        this.f347760i = new C126206at(this);
        this.f347762k = ayVar;
        AtomicReference atomicReference = new AtomicReference();
        this.f347763l = C2169h.m6027a(new C126282z(this, atomicReference));
        C2164c cVar2 = (C2164c) atomicReference.get();
        cVar2.getClass();
        this.f347764m = cVar2;
        this.f347766o = C126290c.m206496a("Oration#" + andIncrement);
    }

    /* renamed from: a */
    public final C60870cx mo107458a() {
        C60870cx b = this.f347775x.mo51512b(new C126199am(this), this.f347753b);
        C126308aq aqVar = new C126308aq(new C126189ac(), new C126190ad(this));
        C60856cj.m92911t(b, C47810es.m84974n(aqVar), this.f347753b);
        return b;
    }

    /* renamed from: b */
    public final void mo107459b(String str, Runnable runnable) {
        C61301b a = C126290c.m206496a(str);
        C46459k.m82829b(this.f347775x.mo51511a(new C126280x(runnable), this.f347753b), "%s in %s FAILED [SD]", a, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo107460c(C125131de deVar) {
        mo107459b("Handling latency event", new C126187aa(this, deVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo107461d(C126207au auVar, Throwable th) {
        C126290c.m206496a(auVar);
        mo107459b("Stopping", new C126196aj(this, auVar, th));
    }

    public final String toString() {
        long j = this.f347761j;
        return "Oration#" + j;
    }
}
