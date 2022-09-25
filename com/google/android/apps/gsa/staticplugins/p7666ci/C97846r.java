package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.p8839t.C118366g;
import com.google.android.apps.gsa.p8839t.C118451i;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.p8839t.p8845f.C118359a;
import com.google.android.apps.gsa.p8839t.p8845f.C118361c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15378f;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.r */
/* compiled from: PG */
public final class C97846r implements C118549h {

    /* renamed from: a */
    public static final C59071e f273217a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.r");

    /* renamed from: n */
    private static final Duration f273218n = Duration.ofSeconds(10);

    /* renamed from: b */
    public final C60888db f273219b;

    /* renamed from: c */
    public final C118339a f273220c;

    /* renamed from: d */
    public final C15378f f273221d;

    /* renamed from: e */
    public final C18927g f273222e;

    /* renamed from: f */
    public final C18932l f273223f;

    /* renamed from: g */
    public final C86124t f273224g;

    /* renamed from: h */
    public final C60888db f273225h;

    /* renamed from: i */
    public final C60950i f273226i;

    /* renamed from: j */
    public final int f273227j;

    /* renamed from: k */
    public final int f273228k;

    /* renamed from: l */
    public final C39141kp f273229l;

    /* renamed from: m */
    public Instant f273230m = Instant.EPOCH;

    /* renamed from: o */
    private final u f273231o;

    /* renamed from: p */
    private final C118366g f273232p;

    /* renamed from: q */
    private final C118451i f273233q;

    /* renamed from: r */
    private final Duration f273234r;

    /* renamed from: s */
    private final Duration f273235s;

    /* renamed from: t */
    private final C69464a f273236t;

    public C97846r(C60888db dbVar, C118339a aVar, C15378f fVar, C18927g gVar, C18932l lVar, C86124t tVar, u uVar, C118366g gVar2, C118451i iVar, C60888db dbVar2, C60950i iVar2, C39141kp kpVar, C69464a aVar2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f273219b = dbVar;
        this.f273220c = aVar;
        this.f273221d = fVar;
        this.f273222e = gVar;
        this.f273223f = lVar;
        this.f273224g = tVar;
        this.f273231o = uVar;
        this.f273232p = gVar2;
        this.f273233q = iVar;
        this.f273225h = dbVar2;
        this.f273226i = iVar2;
        this.f273227j = C97745a.m162019a(tVar.mo79743a(C90069du.f249744v));
        this.f273228k = C97745a.m162019a(tVar.mo79743a(C90069du.f249708B));
        this.f273234r = Duration.ofSeconds(tVar.mo79743a(C90069du.f249741s));
        this.f273235s = Duration.ofHours(tVar.mo79743a(C90017bw.f247959bU));
        this.f273229l = kpVar;
        this.f273236t = aVar2;
    }

    /* renamed from: e */
    private final C60870cx m162150e(C53306j jVar) {
        return this.f273232p.mo103684b(this.f273233q.mo103705b(C118522by.PROACTIVE_CLIENT_PLATFORM_MEDIA_RECOMMENDATIONS_REFRESH.name(), jVar));
    }

    /* renamed from: f */
    private final C60870cx m162151f(C53306j jVar) {
        return this.f273232p.mo103684b(this.f273233q.mo103706c(C118522by.PROACTIVE_CLIENT_PLATFORM_MEDIA_RECOMMENDATIONS_REFRESH.name(), jVar));
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        Object obj;
        if (!this.f273231o.i() || ((Boolean) this.f273236t.mo17428b()).booleanValue()) {
            cxVar = C118826c.f331423b;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            C62940bt r0 = C62942bv.checkIsLite(C118359a.f328525a);
            akVar.mo58887l(r0);
            Object l = akVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            Optional ofNullable = Optional.ofNullable(C58837ba.m90856e(((C118361c) obj).f328531d));
            boolean isPresent = ofNullable.isPresent();
            C60870cx f = m162151f(C53306j.AMBIENT_ASSISTANT);
            C60870cx e = m162150e(C53306j.AMBIENT_ASSISTANT);
            C60870cx e2 = this.f273231o.e(C92094j.HEADPHONES);
            C60870cx p = C60856cj.m92907p(f, e, e2);
            C97813c cVar = new C97813c(this, e2, f, isPresent, e, ofNullable);
            cxVar = C60922j.m93045h(p, C47810es.m84966f(cVar), this.f273219b);
        }
        if (this.f273224g.mo79746e(C90051dc.f248836ar)) {
            C60870cx b = this.f273232p.mo103684b(this.f273233q.mo103707d(C53306j.MORRIS_DRIVING_SCREEN));
            C60870cx f2 = m162151f(C53306j.MORRIS_DRIVING_SCREEN);
            C60870cx e3 = m162150e(C53306j.MORRIS_DRIVING_SCREEN);
            C60870cx p2 = C60856cj.m92907p(b, f2, e3);
            C97845q qVar = new C97845q(this, b, f2, e3);
            cxVar2 = C60922j.m93045h(p2, C47810es.m84966f(qVar), this.f273219b);
        } else {
            cxVar2 = C118826c.f331423b;
        }
        C60870cx p3 = C60856cj.m92907p(cxVar, cxVar2);
        C97822d dVar = C97822d.f273181a;
        return C60922j.m93044g(p3, C47810es.m84963c(dVar), this.f273219b);
    }

    /* renamed from: b */
    public final C60870cx mo90833b(C53306j jVar, OptionalLong optionalLong) {
        C60870cx cxVar;
        C60870cx c = this.f273232p.mo103685c(this.f273233q.mo103706c(C118522by.PROACTIVE_CLIENT_PLATFORM_MEDIA_RECOMMENDATIONS_REFRESH.name(), jVar), Long.valueOf(this.f273226i.mo57444a().toEpochMilli()));
        if (optionalLong.isPresent()) {
            cxVar = this.f273232p.mo103685c(this.f273233q.mo103705b(C118522by.PROACTIVE_CLIENT_PLATFORM_MEDIA_RECOMMENDATIONS_REFRESH.name(), jVar), Long.valueOf(optionalLong.getAsLong() + 1));
        } else {
            cxVar = C60866ct.f164955a;
        }
        return C47633f.m84733g(C60856cj.m92907p(c, cxVar)).mo51515h(C97824e.f273184a, this.f273225h);
    }

    /* renamed from: c */
    public final boolean mo90834c(long j, Instant instant, Instant instant2) {
        return j != 0 && instant.plus(this.f273235s.multipliedBy((long) Math.pow(2.0d, (double) j))).isAfter(instant2.minus(f273218n));
    }

    /* renamed from: d */
    public final boolean mo90835d(Instant instant, Instant instant2) {
        return instant.plus(this.f273234r).isAfter(instant2);
    }
}
