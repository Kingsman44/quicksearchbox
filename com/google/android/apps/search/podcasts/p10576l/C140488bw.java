package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.apps.gsa.p8867w.p8882j.C118820b;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97903bb;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97904bc;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.podcasts.l.bw */
/* compiled from: PG */
public final class C140488bw implements C140459au {

    /* renamed from: a */
    public static final C59071e f381574a = C59071e.m91332i("com.google.android.apps.search.podcasts.l.bw");

    /* renamed from: b */
    public final C42876ab f381575b;

    /* renamed from: c */
    public final C21370a f381576c;

    /* renamed from: d */
    public final Executor f381577d;

    /* renamed from: e */
    public final C140385d f381578e;

    /* renamed from: f */
    public boolean f381579f = false;

    /* renamed from: g */
    public final C46423aj f381580g;

    /* renamed from: h */
    public final boolean f381581h;

    /* renamed from: i */
    public final boolean f381582i;

    /* renamed from: j */
    public final C118820b f381583j;

    /* renamed from: k */
    private final C47632e f381584k = new C47632e();

    /* renamed from: l */
    private final C140962c f381585l;

    /* renamed from: m */
    private final C46778cv f381586m;

    /* renamed from: n */
    private final C140458at f381587n;

    public C140488bw(C42876ab abVar, C21370a aVar, Executor executor, C140385d dVar, C118820b bVar, C140962c cVar, C46778cv cvVar, C140458at atVar, boolean z, boolean z2) {
        this.f381575b = abVar;
        this.f381576c = aVar;
        this.f381577d = executor;
        this.f381578e = dVar;
        this.f381583j = bVar;
        this.f381585l = cVar;
        this.f381586m = cvVar;
        this.f381587n = atVar;
        Objects.requireNonNull(cVar);
        this.f381580g = new C46423aj(new C140464az(cVar), C60826bg.f164896a);
        this.f381581h = z;
        this.f381582i = z2;
    }

    /* renamed from: v */
    private final C60870cx m228180v(C58817ah ahVar) {
        C60870cx a = this.f381575b.mo46039a(ahVar, C60826bg.f164896a);
        C46459k.m82829b(C47633f.m84733g(this.f381585l.mo116045a()).mo51516i(new C140469bd(this, ahVar), C60826bg.f164896a), "Could not save preferences in classic", new Object[0]);
        return a;
    }

    /* renamed from: a */
    public final C60870cx mo115676a() {
        return this.f381584k.mo51512b(new C140462ax(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo115677b() {
        C60870cx c = mo115678c();
        C140485bt btVar = new C140485bt(this);
        return C60922j.m93044g(c, C47810es.m84963c(btVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo115678c() {
        C60870cx d = this.f381575b.mo46042d();
        C140466ba baVar = new C140466ba(this);
        return C60922j.m93044g(d, C47810es.m84963c(baVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo115679d() {
        return C47633f.m84733g(this.f381575b.mo46042d()).mo51515h(C140483br.f381569a, C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo115680e() {
        return m228180v(C140482bq.f381568a);
    }

    /* renamed from: f */
    public final C60870cx mo115681f(boolean z) {
        C60870cx a = this.f381575b.mo46039a(new C140471bf(this, z), C60826bg.f164896a);
        C47633f g = C47633f.m84733g(a);
        C140487bv bvVar = new C140487bv(this);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(bvVar), this.f381577d);
        return a;
    }

    /* renamed from: g */
    public final C60870cx mo115682g(C140449ak akVar) {
        C60870cx v = m228180v(new C140463ay(akVar));
        this.f381586m.mo50787a(v, C140192a.f380885a);
        C46459k.m82829b(v, "Couldn't set theme setting.", new Object[0]);
        return v;
    }

    /* renamed from: h */
    public final C60870cx mo115683h(Duration duration) {
        C60870cx v = m228180v(new C140474bi(duration));
        this.f381586m.mo50787a(v, C140192a.f380885a);
        C46459k.m82829b(v, "Couldn't save time to remove completed episodes.", new Object[0]);
        return v;
    }

    /* renamed from: i */
    public final C60870cx mo115684i(Duration duration) {
        C60870cx v = m228180v(new C140468bc(duration));
        this.f381586m.mo50787a(v, C140192a.f380885a);
        C46459k.m82829b(v, "Couldn't save time to remove unfinished episodes.", new Object[0]);
        return v;
    }

    /* renamed from: j */
    public final C60870cx mo115685j(List list) {
        C60870cx a = this.f381575b.mo46039a(new C140481bp(this, list), C60826bg.f164896a);
        C47633f g = C47633f.m84733g(a);
        C140486bu buVar = new C140486bu(this);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(buVar), this.f381577d);
        return a;
    }

    /* renamed from: k */
    public final C60870cx mo115686k(C140445ag agVar) {
        return m228180v(new C140475bj(agVar));
    }

    /* renamed from: l */
    public final C60870cx mo115687l(float f) {
        return m228180v(new C140484bs(f));
    }

    /* renamed from: m */
    public final C60870cx mo115688m(Boolean bool) {
        return m228180v(new C140480bo(bool));
    }

    /* renamed from: n */
    public final C60870cx mo115689n(boolean z) {
        return m228180v(new C140461aw(z));
    }

    /* renamed from: o */
    public final void mo115690o(boolean z) {
        C60870cx v = m228180v(new C140476bk(z));
        this.f381586m.mo50787a(v, C140192a.f380885a);
        C46459k.m82829b(v, "Couldn't save auto download setting.", new Object[0]);
    }

    /* renamed from: p */
    public final void mo115691p(boolean z) {
        C60870cx v = m228180v(new C140467bb(z));
        this.f381586m.mo50787a(v, C140192a.f380885a);
        C46459k.m82829b(v, "Couldn't save auto download only on unmetered networks setting.", new Object[0]);
    }

    /* renamed from: q */
    public final void mo115692q(boolean z) {
        C60870cx v = m228180v(new C140473bh(z));
        this.f381586m.mo50787a(v, C140192a.f380885a);
        C46459k.m82829b(v, "Couldn't save autoplay setting.", new Object[0]);
    }

    /* renamed from: r */
    public final void mo115693r(C63111j jVar, C140509u uVar) {
        C46459k.m82829b(this.f381575b.mo46039a(new C140478bm(jVar, uVar), C60826bg.f164896a), "Couldn't save the last played episode to TNG:PDS.", new Object[0]);
        C140458at atVar = this.f381587n;
        C97903bb bbVar = (C97903bb) C97904bc.f273357e.createBuilder();
        C63113l lVar = jVar.f170360k;
        if (lVar == null) {
            lVar = C63113l.f170365p;
        }
        bbVar.copyOnWrite();
        C97904bc bcVar = (C97904bc) bbVar.instance;
        lVar.getClass();
        bcVar.f273360b = lVar;
        bcVar.f273359a |= 1;
        bbVar.copyOnWrite();
        C97904bc bcVar2 = (C97904bc) bbVar.instance;
        jVar.getClass();
        bcVar2.f273361c = jVar;
        bcVar2.f273359a |= 2;
        C46459k.m82829b(atVar.f381536a.mo115422b(bbVar.build()), "Couldn't save the last played episode to classic", new Object[0]);
    }

    /* renamed from: s */
    public final C60870cx mo115694s() {
        return this.f381575b.mo46039a(new C140477bl(), C60826bg.f164896a);
    }

    /* renamed from: t */
    public final void mo115695t() {
        this.f381579f = true;
    }

    /* renamed from: u */
    public final void mo115696u() {
        C46459k.m82829b(this.f381584k.mo51512b(new C140462ax(this), C60826bg.f164896a), "Failed to send a sync preferences request and process the response.", new Object[0]);
    }
}
