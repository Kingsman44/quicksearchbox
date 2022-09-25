package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.p1085a.C14785a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14744n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14212aw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14213ax;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14214ay;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14215az;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14220bd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.x */
/* compiled from: PG */
public final class C14935x implements C14781a {

    /* renamed from: a */
    public static final C59071e f44872a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.x");

    /* renamed from: b */
    public final C37215b f44873b;

    /* renamed from: c */
    public final C60887da f44874c;

    /* renamed from: d */
    public final C60888db f44875d;

    /* renamed from: e */
    public final C14986h f44876e;

    /* renamed from: f */
    public final C69464a f44877f;

    /* renamed from: g */
    final C15763a f44878g = new C14934w(this);

    /* renamed from: h */
    public Optional f44879h = Optional.empty();

    /* renamed from: i */
    C60872cz f44880i = null;

    /* renamed from: j */
    private final C86124t f44881j;

    /* renamed from: k */
    private final C14785a f44882k;

    /* renamed from: l */
    private final AtomicReference f44883l = new AtomicReference(new HashSet());

    /* renamed from: m */
    private C60870cx f44884m = null;

    public C14935x(C37215b bVar, C60887da daVar, C60888db dbVar, C14986h hVar, C86124t tVar, C69464a aVar, C14785a aVar2) {
        this.f44873b = bVar;
        this.f44874c = daVar;
        this.f44875d = dbVar;
        this.f44876e = hVar;
        this.f44881j = tVar;
        this.f44877f = aVar;
        this.f44882k = aVar2;
    }

    /* renamed from: j */
    private final synchronized C60870cx m31440j() {
        if (this.f44884m == null) {
            this.f44873b.mo19974a(C37182a.f97971dr.mo40815i(C62722b.OK));
            C58976aa aaVar = C58975e.f156826a;
            if (this.f44881j.mo79746e(C90051dc.f248868bW)) {
                this.f44882k.mo21735a();
            }
            this.f44884m = C47633f.m84733g((C60870cx) ((Supplier) this.f44877f.mo17428b()).get()).mo51516i(new C14881k(this), this.f44874c).mo51515h(new C14882l(this), this.f44874c);
        }
        return this.f44884m;
    }

    /* renamed from: k */
    private final synchronized void m31441k() {
        C60870cx cxVar = this.f44884m;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f44884m = null;
        }
        C14884n nVar = C14884n.f44781a;
        C46459k.m82829b(C60922j.m93045h((C60870cx) ((Supplier) this.f44877f.mo17428b()).get(), C47810es.m84966f(nVar), this.f44875d), "Failed to unregister Driving Screen destination suggestion display", new Object[0]);
        if (this.f44881j.mo79746e(C90051dc.f248868bW)) {
            this.f44882k.mo21736b();
        }
        this.f44879h = Optional.empty();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        m31441k();
        ((Set) this.f44883l.get()).clear();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final void mo21858f() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44879h = Optional.m71637of(C58485gu.m89845m());
        this.f44876e.mo21875g(C14744n.m31056a());
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C14213ax axVar;
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.CONTEXTUAL_SUGGESTIONS_PCP_REQUEST) {
            if (bcVar.f43038a == 22) {
                axVar = (C14213ax) bcVar.f43039b;
            } else {
                axVar = C14213ax.f42997c;
            }
            int b = C14212aw.m30577b(axVar.f42999a);
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            if (!(i == -1 || i == 0)) {
                if (i != 1) {
                    if (i != 2) {
                        if (!(i == 3 || i == 4 || i == 6)) {
                            if (i != 7) {
                                return C14221be.f43041c;
                            }
                            if (this.f44879h.isEmpty()) {
                                C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
                                C14215az azVar = C14215az.f43002c;
                                bdVar.copyOnWrite();
                                C14221be beVar = (C14221be) bdVar.instance;
                                azVar.getClass();
                                beVar.f43044b = azVar;
                                beVar.f43043a = 14;
                                return (C14221be) bdVar.build();
                            }
                            C14220bd bdVar2 = (C14220bd) C14221be.f43041c.createBuilder();
                            C14214ay ayVar = (C14214ay) C14215az.f43002c.createBuilder();
                            ayVar.copyOnWrite();
                            ((C14215az) ayVar.instance).f43005b = true;
                            ayVar.mo21539a((Iterable) Collection.EL.stream((C58485gu) this.f44879h.get()).filter(C14928q.f44865a).collect(C58370cn.f155946a));
                            bdVar2.copyOnWrite();
                            C14221be beVar2 = (C14221be) bdVar2.instance;
                            C14215az azVar2 = (C14215az) ayVar.build();
                            azVar2.getClass();
                            beVar2.f43044b = azVar2;
                            beVar2.f43043a = 14;
                            return (C14221be) bdVar2.build();
                        }
                    } else if (this.f44879h.isEmpty()) {
                        C14220bd bdVar3 = (C14220bd) C14221be.f43041c.createBuilder();
                        C14215az azVar3 = C14215az.f43002c;
                        bdVar3.copyOnWrite();
                        C14221be beVar3 = (C14221be) bdVar3.instance;
                        azVar3.getClass();
                        beVar3.f43044b = azVar3;
                        beVar3.f43043a = 14;
                        return (C14221be) bdVar3.build();
                    } else {
                        C14220bd bdVar4 = (C14220bd) C14221be.f43041c.createBuilder();
                        C14214ay ayVar2 = (C14214ay) C14215az.f43002c.createBuilder();
                        ayVar2.copyOnWrite();
                        ((C14215az) ayVar2.instance).f43005b = true;
                        ayVar2.mo21539a((Iterable) Collection.EL.stream((C58485gu) this.f44879h.get()).filter(C14886p.f44783a).collect(C58370cn.f155946a));
                        bdVar4.copyOnWrite();
                        C14221be beVar4 = (C14221be) bdVar4.instance;
                        C14215az azVar4 = (C14215az) ayVar2.build();
                        azVar4.getClass();
                        beVar4.f43044b = azVar4;
                        beVar4.f43043a = 14;
                        return (C14221be) bdVar4.build();
                    }
                } else if (this.f44879h.isEmpty()) {
                    C14220bd bdVar5 = (C14220bd) C14221be.f43041c.createBuilder();
                    C14215az azVar5 = C14215az.f43002c;
                    bdVar5.copyOnWrite();
                    C14221be beVar5 = (C14221be) bdVar5.instance;
                    azVar5.getClass();
                    beVar5.f43044b = azVar5;
                    beVar5.f43043a = 14;
                    return (C14221be) bdVar5.build();
                } else {
                    C14220bd bdVar6 = (C14220bd) C14221be.f43041c.createBuilder();
                    C14214ay ayVar3 = (C14214ay) C14215az.f43002c.createBuilder();
                    ayVar3.copyOnWrite();
                    ((C14215az) ayVar3.instance).f43005b = true;
                    ayVar3.mo21539a((Iterable) Collection.EL.stream((C58485gu) this.f44879h.get()).filter(C14885o.f44782a).collect(C58370cn.f155946a));
                    bdVar6.copyOnWrite();
                    C14221be beVar6 = (C14221be) bdVar6.instance;
                    C14215az azVar6 = (C14215az) ayVar3.build();
                    azVar6.getClass();
                    beVar6.f43044b = azVar6;
                    beVar6.f43043a = 14;
                    return (C14221be) bdVar6.build();
                }
            }
            return C14221be.f43041c;
        }
        C59104x d = f44872a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
        ((C59052c) ((C59052c) d).mo56372aa(45512)).mo56389s("getDataForRequest(), request.getRequestCase() should be CONTEXTUAL_SUGGESTIONS_PCP_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
        return C14221be.f43041c;
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        C14213ax axVar;
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.CONTEXTUAL_SUGGESTIONS_PCP_REQUEST) {
            if (bcVar.f43038a == 22) {
                axVar = (C14213ax) bcVar.f43039b;
            } else {
                axVar = C14213ax.f42997c;
            }
            int b = C14212aw.m30577b(axVar.f42999a);
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            if (!(i == -1 || i == 0)) {
                if (!(i == 1 || i == 2)) {
                    if (!(i == 3 || i == 4 || i == 6)) {
                        if (i != 7) {
                            C59104x d = f44872a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
                            ((C59052c) ((C59052c) d).mo56372aa(45513)).mo56386p("fetchAndStoreData(), SuggestionType not handled");
                            return C60856cj.m92900i(C14782b.FAILED);
                        }
                    }
                }
                return m31440j();
            }
            C59104x d2 = f44872a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
            ((C59052c) ((C59052c) d2).mo56372aa(45514)).mo56387q("fetchAndStoreData(), SuggestionType:%d not supported", C14212aw.m30576a(b));
            return C60856cj.m92900i(C14782b.FAILED);
        }
        C59104x d3 = f44872a.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
        ((C59052c) ((C59052c) d3).mo56372aa(45515)).mo56389s("fetchAndStoreData(), request.getRequestCase() should be CONTEXTUAL_SUGGESTIONS_PCP_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
        return C60856cj.m92900i(C14782b.FAILED);
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
        C14213ax axVar;
        C14213ax axVar2;
        C14213ax axVar3;
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.CONTEXTUAL_SUGGESTIONS_PCP_REQUEST) {
            if (bcVar.f43038a == 22) {
                axVar = (C14213ax) bcVar.f43039b;
            } else {
                axVar = C14213ax.f42997c;
            }
            int b = C14212aw.m30577b(axVar.f42999a);
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            if (!(i == -1 || i == 0 || i == 1 || i == 2)) {
                if (i == 3) {
                    m31440j();
                    return;
                } else if (i != 4) {
                    if (i == 6) {
                        int i2 = bcVar.f43038a;
                        if (i2 == 22) {
                            axVar2 = (C14213ax) bcVar.f43039b;
                        } else {
                            axVar2 = C14213ax.f42997c;
                        }
                        if (axVar2.f43000b != null) {
                            if (i2 == 22) {
                                axVar3 = (C14213ax) bcVar.f43039b;
                            } else {
                                axVar3 = C14213ax.f42997c;
                            }
                            C53435nu nuVar = axVar3.f43000b;
                            if (nuVar == null) {
                                nuVar = C53435nu.f140233n;
                            }
                            String str = nuVar.f140239d;
                            if (str.isEmpty()) {
                                C59104x d = f44872a.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
                                ((C59052c) ((C59052c) d).mo56372aa(45519)).mo56386p("Attempted to log impression for blank suggestion id.");
                                return;
                            } else if (((Set) this.f44883l.get()).contains(str)) {
                                C58976aa aaVar = C58975e.f156826a;
                                return;
                            } else {
                                C60922j.m93045h((C60870cx) ((Supplier) this.f44877f.mo17428b()).get(), C47810es.m84966f(new C14883m(str)), this.f44875d);
                                ((Set) this.f44883l.get()).add(str);
                                return;
                            }
                        } else {
                            C59104x d2 = f44872a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
                            ((C59052c) ((C59052c) d2).mo56372aa(45520)).mo56386p("Attempted to log on device suggestion impression, but no suggestion was provided.");
                            return;
                        }
                    } else if (i != 7) {
                        return;
                    }
                } else if (this.f44881j.mo79746e(C90051dc.f248868bW)) {
                    this.f44882k.mo21736b();
                    return;
                } else {
                    return;
                }
            }
            C59104x d3 = f44872a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
            ((C59052c) ((C59052c) d3).mo56372aa(45517)).mo56387q("sendFireAndForgetRequest(), SuggestionType:%d not supported", C14212aw.m30576a(b));
            return;
        }
        C59104x d4 = f44872a.mo56226d();
        d4.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
        ((C59052c) ((C59052c) d4).mo56372aa(45521)).mo56389s("sendFireAndForgetRequest(), request.getRequestCase() should be CONTEXTUAL_SUGGESTIONS_PCP_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
    }
}
