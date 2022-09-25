package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.gsa.nga.engine.am.p.d;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.engine.p6038j.p6039a.C76163a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.C78712r;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.aa */
/* compiled from: PG */
public final class C76164aa implements C75157e, C76188c, C76166ac {

    /* renamed from: a */
    public static final C58974d f211144a = C58974d.m91136j();

    /* renamed from: b */
    public final C75050a f211145b;

    /* renamed from: c */
    public final d f211146c;

    /* renamed from: d */
    public final C91142g f211147d;

    /* renamed from: e */
    public final C78712r f211148e;

    /* renamed from: f */
    public final C76194i f211149f;

    /* renamed from: g */
    public final Executor f211150g;

    /* renamed from: h */
    public final AtomicBoolean f211151h = new AtomicBoolean(false);

    /* renamed from: i */
    public final AtomicBoolean f211152i = new AtomicBoolean(false);

    /* renamed from: j */
    public final AtomicBoolean f211153j = new AtomicBoolean(false);

    /* renamed from: k */
    public C76167ad f211154k;

    /* renamed from: l */
    public final C76163a f211155l;

    public C76164aa(C75050a aVar, d dVar, C78712r rVar, C91142g gVar, C76194i iVar, Executor executor, C76163a aVar2) {
        this.f211145b = aVar;
        this.f211146c = dVar;
        this.f211147d = gVar;
        this.f211148e = rVar;
        this.f211149f = iVar;
        this.f211150g = new C60904dr(executor);
        this.f211155l = aVar2;
    }

    /* renamed from: c */
    public static void m122746c(C60870cx cxVar, String str) {
        C76212z zVar = new C76212z(str);
        C60856cj.m92911t(cxVar, C47810es.m84974n(zVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    private final C60870cx m122747f() {
        C76211y yVar = new C76211y(this);
        return C47633f.m84733g(C60856cj.m92903l(C47810es.m84977q(yVar), this.f211150g)).mo51516i(new C76197k(this), this.f211150g).mo51516i(C76198l.f211204a, this.f211150g).mo51516i(new C76199m(this), this.f211150g);
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (boVar.mo71464h().isPresent()) {
            C59104x b = f211144a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvHandler");
            ((C58970a) ((C58970a) b).mo56372aa(3142)).mo56389s("Utterance Id=%s", boVar.mo71464h().get());
        }
        C58974d dVar = f211144a;
        C59104x b2 = dVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ConvHandler");
        ((C58970a) ((C58970a) b2).mo56372aa(3139)).mo56361N("State changed: %s => %s by %s and %s with %s", boVar2.mo71458b(), boVar.mo71458b(), boVar.mo71460d().name(), boVar.mo71467m().map(C76209w.f211218a).orElse("N/A"), boVar.mo71463g());
        if (!boVar.mo71464h().equals(boVar2.mo71464h()) && boVar2.mo71464h().isPresent() && boVar.mo71464h().isPresent() && this.f211151h.get()) {
            C59104x b3 = dVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "ConvHandler");
            ((C58970a) ((C58970a) b3).mo56372aa(3141)).mo56389s("Cancelling previous utterance: %s", boVar2.mo71464h());
            m122746c(m122747f(), "[NGA] Stop existing interaction");
        } else if (boVar.mo71473s()) {
            if (this.f211151h.get()) {
                C59104x b4 = dVar.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "ConvHandler");
                ((C58970a) ((C58970a) b4).mo56372aa(3140)).mo56389s("stop interaction: %s", boVar2.mo71464h());
                m122746c(m122747f(), "[NGA] Stop existing interaction");
            }
        } else if (boVar.mo71458b().a()) {
            C76205s sVar = new C76205s(this, boVar);
            m122746c(C47633f.m84733g(C60856cj.m92903l(C47810es.m84977q(sVar), this.f211150g)).mo51516i(new C76206t(this), this.f211150g).mo51516i(C76207u.f211216a, this.f211150g).mo51516i(new C76208v(this), this.f211150g), "Start interaction");
        }
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        if (blVar == bl.a) {
            C59104x b = f211144a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvHandler");
            ((C58970a) ((C58970a) b).mo56372aa(3143)).mo56386p("NGA starts FULL_LISTENING");
        }
    }

    /* renamed from: d */
    public final boolean mo72107d() {
        return this.f211152i.get();
    }

    /* renamed from: e */
    public final boolean mo72108e() {
        return this.f211153j.get();
    }
}
