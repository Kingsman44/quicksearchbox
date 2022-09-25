package com.google.android.apps.search.assistant.platform.pcp.p9338h;

import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124057al;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124058am;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124059an;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.assistant.contexttrigger.C17737g;
import com.google.android.libraries.assistant.contexttrigger.C17784j;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3807b.p3808a.C48902d;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.h.k */
/* compiled from: PG */
final class C124039k implements C17737g {

    /* renamed from: a */
    public final C123604t f342600a;

    /* renamed from: b */
    public final C58974d f342601b;

    /* renamed from: c */
    private final C17784j f342602c;

    /* renamed from: d */
    private final Executor f342603d;

    /* renamed from: e */
    private final C123623b f342604e;

    /* renamed from: f */
    private final Executor f342605f;

    /* renamed from: g */
    private final C60950i f342606g;

    /* renamed from: h */
    private final C124059an f342607h;

    /* renamed from: i */
    private final C130895ag f342608i;

    /* renamed from: j */
    private final boolean f342609j;

    public C124039k(C17784j jVar, Executor executor, C123623b bVar, C123604t tVar, Executor executor2, C60950i iVar, C130603a aVar, C124059an anVar, C130895ag agVar, boolean z) {
        this.f342602c = jVar;
        this.f342603d = executor;
        this.f342604e = bVar;
        this.f342600a = tVar;
        this.f342605f = executor2;
        this.f342606g = iVar;
        this.f342601b = aVar.mo109740b(this);
        this.f342607h = anVar;
        this.f342608i = agVar;
        this.f342609j = z;
    }

    /* renamed from: b */
    private final void m203448b(C124038j jVar, boolean z, Instant instant) {
        ((C58970a) ((C58970a) this.f342601b.mo56224b()).mo56372aa(35379)).mo56389s("#changeValidityAndNotifyClientTrigger: %s", Boolean.valueOf(z));
        C60870cx b = this.f342604e.f341550b.mo45938b(new C124035g(C123611ad.m202942a(jVar.mo106236b(), jVar.mo106235a(), jVar.mo106237c(), z, (C53132co) null, (C48952az) null, this.f342606g.mo57444a().toEpochMilli()), jVar));
        C124036h hVar = new C124036h(this, jVar, instant);
        C60922j.m93045h(b, C47810es.m84966f(hVar), this.f342605f);
    }

    /* renamed from: c */
    private final void m203449c(C48919u uVar) {
        C48918t tVar = (C48918t) uVar.toBuilder();
        C39226b bVar = C39226b.TAG_ASSISTANT_PCP;
        tVar.copyOnWrite();
        C48919u uVar2 = (C48919u) tVar.instance;
        uVar2.f126592e = bVar.getNumber();
        uVar2.f126588a |= 8;
        C48919u uVar3 = (C48919u) tVar.build();
        C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
        pVar.copyOnWrite();
        C48915q qVar = (C48915q) pVar.instance;
        uVar3.getClass();
        qVar.f126577b = uVar3;
        qVar.f126576a |= 1;
        C60856cj.m92911t(this.f342602c.mo23442a((C48915q) pVar.build()), C47810es.m84974n(new C124037i(this, uVar3)), this.f342603d);
    }

    /* renamed from: a */
    public final void mo23454a(C48923y yVar) {
        Optional optional;
        Instant a = this.f342606g.mo57444a();
        C48919u uVar = yVar.f126603b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        String str = uVar.f126591d;
        C58970a aVar = (C58970a) ((C58970a) this.f342601b.mo56224b()).mo56372aa(35380);
        C48922x a2 = C48922x.m85306a(yVar.f126605d);
        if (a2 == null) {
            a2 = C48922x.UNKNOWN;
        }
        C48922x a3 = C48922x.m85306a(yVar.f126606e);
        if (a3 == null) {
            a3 = C48922x.UNKNOWN;
        }
        aVar.mo56359L("#onContextTrigger: trigger id %s, current state: %s, previous state: %s", str, a2, a3);
        List i = C124038j.f342599a.mo56155i(str);
        if (i.size() != 3) {
            optional = Optional.empty();
        } else {
            try {
                C53306j a4 = C53306j.m86809a(Integer.parseInt((String) i.get(0)));
                if (a4 == null) {
                    optional = Optional.empty();
                } else {
                    optional = Optional.m71637of(new C124029a(a4, Integer.parseInt((String) i.get(1)), (String) i.get(2)));
                }
            } catch (NumberFormatException unused) {
                optional = Optional.empty();
            }
        }
        if (optional.isEmpty()) {
            ((C58970a) ((C58970a) this.f342601b.mo56226d()).mo56372aa(35381)).mo56389s("Trigger Id %s not valid.", str);
            C48919u uVar2 = yVar.f126603b;
            if (uVar2 == null) {
                uVar2 = C48919u.f126586g;
            }
            m203449c(uVar2);
            return;
        }
        C124038j jVar = (C124038j) optional.get();
        C48922x a5 = C48922x.m85306a(yVar.f126605d);
        if (a5 == null) {
            a5 = C48922x.UNKNOWN;
        }
        if (a5.equals(C48922x.ACTIVE)) {
            C48904f fVar = yVar.f126604c;
            if (fVar == null) {
                fVar = C48904f.f126552a;
            }
            C62940bt r2 = C62942bv.checkIsLite(C48902d.f126550b);
            fVar.mo58887l(r2);
            if (!fVar.f169962ag.mo58857o(r2.f169971d)) {
                m203448b(jVar, true, a);
            } else if (jVar.mo106236b() == C53306j.OPA_SMARTSPACE && jVar.mo106235a() == 100006 && this.f342609j) {
                this.f342608i.mo109948u();
            }
        } else {
            C48922x a6 = C48922x.m85306a(yVar.f126605d);
            if (a6 == null) {
                a6 = C48922x.UNKNOWN;
            }
            if (a6.equals(C48922x.NOT_ACTIVE)) {
                C48922x a7 = C48922x.m85306a(yVar.f126606e);
                if (a7 == null) {
                    a7 = C48922x.UNKNOWN;
                }
                if (a7.equals(C48922x.ACTIVE)) {
                    if (this.f342609j) {
                        C124059an anVar = this.f342607h;
                        C53306j b = jVar.mo106236b();
                        int a8 = jVar.mo106235a();
                        String c = jVar.mo106237c();
                        C48904f fVar2 = yVar.f126604c;
                        if (fVar2 == null) {
                            fVar2 = C48904f.f126552a;
                        }
                        if (b == C53306j.OPA_SMARTSPACE && a8 == 100006) {
                            C62940bt r3 = C62942bv.checkIsLite(C48902d.f126550b);
                            fVar2.mo58887l(r3);
                            if (!fVar2.f169962ag.mo58857o(r3.f169971d)) {
                                C58480gp e = C58485gu.m89837e();
                                C46128f fVar3 = anVar.f342649c;
                                C48919u uVar3 = yVar.f126603b;
                                if (uVar3 == null) {
                                    uVar3 = C48919u.f126586g;
                                }
                                C60870cx c2 = fVar3.mo50216c(uVar3.f126590c);
                                C124057al alVar = new C124057al(anVar, c, e);
                                C60870cx h = C60922j.m93045h(c2, C47810es.m84966f(alVar), anVar.f342651e);
                                C124058am amVar = new C124058am(anVar, e);
                                C60922j.m93045h(h, C47810es.m84966f(amVar), anVar.f342651e);
                            }
                        }
                    }
                    m203448b(jVar, false, a);
                    C48919u uVar4 = yVar.f126603b;
                    if (uVar4 == null) {
                        uVar4 = C48919u.f126586g;
                    }
                    m203449c(uVar4);
                }
            }
        }
    }
}
