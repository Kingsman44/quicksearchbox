package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.aj;
import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.o;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125170s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125171t;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125173v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.p9449a.C125760a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126299ah;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126301aj;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ey */
/* compiled from: PG */
public final class C126141ey implements C126114dy {

    /* renamed from: a */
    public final C125760a f347587a;

    /* renamed from: b */
    public final C60888db f347588b;

    /* renamed from: c */
    public final C126139ew f347589c = new C126139ew();

    /* renamed from: d */
    public final AtomicLong f347590d = new AtomicLong(0);

    /* renamed from: e */
    private final C47632e f347591e;

    /* renamed from: f */
    private final C126174c f347592f;

    /* renamed from: g */
    private final AtomicReference f347593g = new AtomicReference(C126132ep.f347572a);

    public C126141ey(C125760a aVar, C126174c cVar, C60888db dbVar) {
        this.f347587a = aVar;
        this.f347592f = cVar;
        this.f347591e = new C47632e();
        this.f347588b = dbVar;
    }

    /* renamed from: k */
    public static C60870cx m206245k(C60930r rVar) {
        try {
            return rVar.mo18058a();
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: n */
    private final void m206246n(String str, C60870cx cxVar, Consumer consumer) {
        C46459k.m82829b(this.f347591e.mo51512b(new C126138ev(this, cxVar, consumer), this.f347588b), "%s failed [SD]", str);
    }

    /* renamed from: a */
    public final void mo107357a() {
        this.f347590d.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo107358b(C60870cx cxVar) {
        m206246n("sending UI command", cxVar, new C126136et(this));
    }

    /* renamed from: c */
    public final void mo107359c() {
        this.f347590d.incrementAndGet();
        this.f347589c.mo107374a();
    }

    /* renamed from: d */
    public final void mo107360d(C60930r rVar, Duration duration, Function function) {
        C126128el elVar = new C126128el(this, this.f347590d.incrementAndGet(), rVar, function);
        C46459k.m82829b(C126309ar.m206524c(new C126299ah(new C126301aj(elVar)), duration, this.f347588b), "idle UI timer failed [SD]", new Object[0]);
    }

    /* renamed from: e */
    public final void mo107361e(boolean z) {
        mo107378l("sending dictation state", new C126137eu(this, z));
    }

    /* renamed from: f */
    public final void mo107362f(C60870cx cxVar, String str, Duration duration) {
        Optional b = this.f347589c.mo107375b(str);
        if (b.isPresent()) {
            C46459k.m82829b(C126309ar.m206524c(new C126133eq(this, cxVar, b), duration, this.f347588b), "scheduling delayed incremental UI failed [SD]", new Object[0]);
        }
    }

    /* renamed from: g */
    public final void mo107363g(al alVar) {
        this.f347589c.mo107374a();
        mo107378l("sending ordered UI", new C126134er(this, alVar));
    }

    /* renamed from: h */
    public final void mo107364h(C60870cx cxVar) {
        m206246n("sending replacing UI", cxVar, new C126125ei(this, this.f347589c.mo107374a()));
    }

    /* renamed from: i */
    public final void mo107365i(aj ajVar) {
        mo107378l("sending Ui command", new C126123eg(this, ajVar));
    }

    /* renamed from: j */
    public final void mo107366j(C126056bu buVar) {
        this.f347593g.set(buVar);
    }

    /* renamed from: l */
    public final void mo107378l(String str, Runnable runnable) {
        C46459k.m82829b(this.f347591e.mo51511a(new C126131eo(runnable), this.f347588b), "%s failed [SD]", str);
    }

    /* renamed from: m */
    public final void mo107379m(al alVar) {
        C125760a aVar = this.f347587a;
        C69664n.m101061g(alVar, "keyboardUiData");
        C126322bc bcVar = aVar.f346588a;
        C125170s sVar = (C125170s) C125171t.f345314c.createBuilder();
        C69664n.m101060f(sVar, "newBuilder()");
        C125173v a = C69664n.m101061g(sVar, "builder");
        C69664n.m101061g(alVar, "value");
        C125170s sVar2 = a.f345318a;
        sVar2.copyOnWrite();
        C125171t tVar = (C125171t) sVar2.instance;
        alVar.getClass();
        tVar.f345317b = alVar;
        tVar.f345316a = 2;
        bcVar.mo107532b(a.mo106820a());
        C58485gu c = C126111dv.m206216c(alVar);
        C126056bu buVar = (C126056bu) this.f347593g.get();
        if (buVar != null && !c.isEmpty()) {
            buVar.mo107276a(c);
        }
        o oVar = alVar.b;
        if (oVar == null) {
            oVar = o.g;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(oVar.b).map(C126118eb.f347549a).filter(C126119ec.f347550a).map(C126120ed.f347551a).filter(C126121ee.f347552a).collect(C58370cn.f155946a);
        int size = guVar.size();
        boolean anyMatch = Collection.EL.stream(guVar).anyMatch(C126122ef.f347553a);
        if (size != 0) {
            this.f347592f.mo107417p(size, anyMatch);
        }
    }
}
