package com.google.android.apps.gsa.staticplugins.p7686co;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.proactive.C84174j;
import com.google.android.apps.gsa.proactive.C84179o;
import com.google.android.apps.gsa.proactive.RequestScheduleEvaluatorReceiver;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91314as;
import com.google.android.apps.gsa.sidekick.main.entry.C91320ay;
import com.google.android.apps.gsa.sidekick.main.entry.C91329bg;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91731a;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98323ae;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98325ag;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98328d;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98396bq;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98411ce;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98413cg;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98414ch;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98436dc;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98437dd;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98444k;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98447n;
import com.google.android.gms.awareness.fence.C142935d;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21507i;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21521w;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21522x;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58839bc;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7625dy;
import com.google.p375ai.p378b.C7641en;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7653ez;
import com.google.p375ai.p378b.C7658fd;
import com.google.p375ai.p378b.C7659fe;
import com.google.p375ai.p378b.C7749in;
import com.google.p375ai.p378b.C7750io;
import com.google.p375ai.p378b.C7957qf;
import com.google.p375ai.p378b.C8142xb;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62963cj;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.af */
/* compiled from: PG */
public final class C98150af implements C84174j, C90991b {

    /* renamed from: a */
    private static final Comparator f274059a = C98483w.f275014a;

    /* renamed from: b */
    private static final C59071e f274060b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.af");

    /* renamed from: c */
    private final AtomicReference f274061c = new AtomicReference((Object) null);

    /* renamed from: d */
    private final C21370a f274062d;

    /* renamed from: e */
    private final Context f274063e;

    /* renamed from: f */
    private final C98312g f274064f;

    /* renamed from: g */
    private final C91320ay f274065g;

    /* renamed from: h */
    private final C91329bg f274066h;

    /* renamed from: i */
    private final C86124t f274067i;

    /* renamed from: j */
    private final C86054o f274068j;

    /* renamed from: k */
    private final Object f274069k = new Object();

    /* renamed from: l */
    private final C98323ae f274070l;

    /* renamed from: m */
    private final Queue f274071m = new C58425eo(10);

    /* renamed from: n */
    private final C98396bq f274072n;

    /* renamed from: o */
    private final C91314as f274073o;

    /* renamed from: p */
    private final C69464a f274074p;

    /* renamed from: q */
    private final C68214a f274075q;

    /* renamed from: r */
    private final C84474e f274076r;

    /* renamed from: s */
    private C98480t f274077s = C98480t.f275000e;

    /* renamed from: t */
    private int f274078t;

    /* renamed from: u */
    private C98484x f274079u = C98484x.NONE;

    /* renamed from: v */
    private boolean f274080v;

    public C98150af(Context context, C21370a aVar, C98312g gVar, C91320ay ayVar, C91329bg bgVar, C86124t tVar, C98396bq bqVar, C86054o oVar, C98323ae aeVar, C91314as asVar, C69464a aVar2, C68214a aVar3, C84474e eVar) {
        this.f274062d = aVar;
        this.f274063e = context;
        this.f274064f = gVar;
        this.f274065g = ayVar;
        this.f274066h = bgVar;
        this.f274067i = tVar;
        this.f274068j = oVar;
        this.f274070l = aeVar;
        this.f274072n = bqVar;
        this.f274073o = asVar;
        this.f274074p = aVar2;
        this.f274075q = aVar3;
        this.f274076r = eVar;
    }

    /* renamed from: g */
    public static C98148ad m162564g(List list) {
        C98148ad adVar = new C98148ad();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C98474n nVar = (C98474n) it.next();
            adVar.put(nVar.f274971c, nVar);
        }
        return adVar;
    }

    /* renamed from: h */
    private final PendingIntent m162565h() {
        Intent intent = new Intent("com.google.android.apps.gsa.kato.ACTION_CONTEXT_FENCE_TRANSITION");
        intent.setClass(this.f274063e, RequestScheduleEvaluatorReceiver.class);
        return PendingIntent.getBroadcast(this.f274063e, 0, intent, true != C1888a.m5149c() ? 134217728 : 167772160);
    }

    /* renamed from: i */
    private final C98149ae m162566i() {
        C98291e eVar;
        synchronized (this.f274069k) {
            if (!this.f274080v) {
                C98480t tVar = (C98480t) ((C58833ax) C60856cj.m92910s(this.f274070l.mo91057k(C98325ag.f274475k, "getRequestScheduleData", C98328d.f274485a))).mo56109e(C98480t.f275000e);
                this.f274077s = tVar;
                this.f274078t = tVar.f275005d;
                if ((tVar.f275002a & 1) != 0) {
                    C98479s sVar = (C98479s) C98480t.f275000e.createBuilder();
                    for (C98474n nVar : this.f274077s.f275003b) {
                        C58976aa aaVar = C58975e.f156826a;
                        int i = nVar.f274971c;
                        C98463k kVar = (C98463k) nVar.toBuilder();
                        String str = this.f274077s.f275004c;
                        kVar.copyOnWrite();
                        C98474n nVar2 = (C98474n) kVar.instance;
                        str.getClass();
                        nVar2.f274969a |= 8;
                        nVar2.f274973e = str;
                        sVar.copyOnWrite();
                        C98480t tVar2 = (C98480t) sVar.instance;
                        C98474n nVar3 = (C98474n) kVar.build();
                        nVar3.getClass();
                        tVar2.mo91131a();
                        tVar2.f275003b.add(nVar3);
                    }
                    this.f274077s = (C98480t) sVar.build();
                }
                this.f274080v = true;
            }
            String k = this.f274065g.mo85621k();
            C7957qf qfVar = null;
            try {
                qfVar = (C7957qf) ((C58833ax) C90877ak.m148472f(this.f274065g.mo85618h())).mo56111f();
            } catch (InterruptedException e) {
                C59104x d = f274060b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ReqSchedEval");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(30427)).mo56386p("Failed to load schedule");
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                C59104x d2 = f274060b.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ReqSchedEval");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(30428)).mo56386p("Failed to load schedule");
            }
            eVar = new C98291e(k, C98154aj.m162585c(qfVar), C58485gu.m89842j(this.f274077s.f275003b), this.f274079u);
            this.f274061c.set(eVar);
        }
        return eVar;
    }

    /* renamed from: j */
    private final void m162567j(String str) {
        if (!str.isEmpty()) {
            try {
                C58976aa aaVar = C58975e.f156826a;
                C98477q a = this.f274064f.mo91045a(str);
                PendingIntent h = m162565h();
                C21521w wVar = a.f274981d;
                C142935d dVar = new C142935d();
                dVar.mo117828c(h);
                C21551h hVar = (C21551h) C90877ak.m148472f(a.mo91130a(C21522x.m40637a(dVar)));
                if (hVar != null) {
                    if (hVar.mo27003f()) {
                        return;
                    }
                }
                C59104x c = f274060b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ReqSchedEval");
                ((C59052c) ((C59052c) c).mo56372aa(30430)).mo56386p("Failed to cancel fence registrations");
            } catch (InterruptedException | ExecutionException e) {
                C59104x c2 = f274060b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "ReqSchedEval");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(30431)).mo56386p("Failed to cancel fence registrations");
            }
        } else {
            C59104x d = f274060b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReqSchedEval");
            ((C59052c) ((C59052c) d).mo56372aa(30433)).mo56386p("Attempting to cancel registrations for empty account");
        }
    }

    /* renamed from: l */
    private final void m162569l(String str, boolean z) {
        C98149ae i = m162566i();
        this.f274072n.mo91071k(str, z);
        C98250c cVar = new C98250c();
        HashSet<String> hashSet = new HashSet<>();
        C58485gu guVar = ((C98291e) i).f274394c;
        int size = guVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            C98474n nVar = (C98474n) guVar.get(i2);
            if (C58890d.m90990e(nVar.f274973e, C58837ba.m90858g(str))) {
                cVar.mo90988c().mo55395g(nVar);
            } else {
                cVar.mo90987b().mo55395g(Integer.valueOf(nVar.f274971c));
                hashSet.add(nVar.f274973e);
            }
        }
        for (String j : hashSet) {
            m162567j(j);
        }
        m162570m(cVar.mo90986a());
    }

    /* renamed from: m */
    private final void m162570m(C98147ac acVar) {
        synchronized (this.f274069k) {
            if (!acVar.mo90990a().isEmpty() || !acVar.mo90992c().isEmpty() || !acVar.mo90991b().isEmpty()) {
                C98148ad g = m162564g(this.f274077s.f275003b);
                C58801sm G = acVar.mo90990a().listIterator(0);
                while (G.hasNext()) {
                    g.delete(((Integer) G.next()).intValue());
                }
                C58801sm G2 = acVar.mo90991b().listIterator(0);
                while (G2.hasNext()) {
                    C98474n nVar = (C98474n) G2.next();
                    if (g.get(nVar.f274971c) == null) {
                        g.put(nVar.f274971c, nVar);
                    }
                }
                C58801sm G3 = acVar.mo90992c().listIterator(0);
                while (G3.hasNext()) {
                    C98474n nVar2 = (C98474n) G3.next();
                    g.put(nVar2.f274971c, nVar2);
                }
                ArrayList arrayList = new ArrayList(g.size());
                for (int i = 0; i < g.size(); i++) {
                    arrayList.add((C98474n) g.valueAt(i));
                }
                Collections.sort(arrayList, f274059a);
                C98479s sVar = (C98479s) C98480t.f275000e.createBuilder();
                int i2 = this.f274078t;
                sVar.copyOnWrite();
                C98480t tVar = (C98480t) sVar.instance;
                tVar.f275002a |= 2;
                tVar.f275005d = i2;
                sVar.copyOnWrite();
                C98480t tVar2 = (C98480t) sVar.instance;
                tVar2.mo91131a();
                C62947c.addAll((Iterable) arrayList, (List) tVar2.f275003b);
                C98480t tVar3 = (C98480t) sVar.build();
                if (tVar3.equals(this.f274077s)) {
                    C58976aa aaVar = C58975e.f156826a;
                    return;
                }
                C58976aa aaVar2 = C58975e.f156826a;
                this.f274077s = tVar3;
                C60856cj.m92910s(this.f274070l.mo91058l(C98325ag.f274475k, tVar3.toByteArray(), 12));
                return;
            }
            C58976aa aaVar3 = C58975e.f156826a;
        }
    }

    /* renamed from: n */
    private static boolean m162571n(C98485y yVar, C7653ez ezVar) {
        C7750io ioVar;
        C7625dy dyVar;
        int a;
        C7750io ioVar2;
        if (ezVar == null) {
            return false;
        }
        if (ezVar.f26567b == 1) {
            ioVar = (C7750io) ezVar.f26568c;
        } else {
            ioVar = C7750io.f27119d;
        }
        if ((ioVar.f27121a & 2) != 0) {
            if (ezVar.f26567b == 1) {
                ioVar2 = (C7750io) ezVar.f26568c;
            } else {
                ioVar2 = C7750io.f27119d;
            }
            dyVar = ioVar2.f27123c;
            if (dyVar == null) {
                dyVar = C7625dy.f26342c;
            }
        } else {
            dyVar = ezVar.f26567b == 2 ? (C7625dy) ezVar.f26568c : null;
        }
        if (dyVar == null) {
            return true;
        }
        C55893j jVar = dyVar.f26345b;
        if (jVar == null) {
            jVar = C55893j.f148728h;
        }
        C98474n nVar = (C98474n) yVar.get(jVar);
        return (nVar == null || (a = C98473m.m163121a(nVar.f274972d)) == 0 || a != 3) ? false : true;
    }

    /* renamed from: o */
    private final boolean m162572o(String str, List list) {
        try {
            C98477q a = this.f274064f.mo91045a(str);
            PendingIntent h = m162565h();
            C21521w wVar = a.f274981d;
            C142935d dVar = new C142935d();
            dVar.mo117828c(h);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C98474n nVar = (C98474n) it.next();
                C55893j jVar = nVar.f274970b;
                if (jVar == null) {
                    jVar = C55893j.f148728h;
                }
                C21507i iVar = a.f274982e;
                ContextFenceStub contextFenceStub = new ContextFenceStub(jVar.toByteArray());
                int i = nVar.f274971c;
                dVar.mo117827b("KATO_REQ_SCHED_" + i, contextFenceStub, h);
            }
            C21551h hVar = (C21551h) C90877ak.m148472f(a.mo91130a(C21522x.m40637a(dVar)));
            if (hVar != null) {
                if (hVar.mo27003f()) {
                    C58976aa aaVar = C58975e.f156826a;
                    return true;
                }
            }
            C59104x c = f274060b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReqSchedEval");
            ((C59052c) ((C59052c) c).mo56372aa(30455)).mo56352E("Failed to update context fence registrations: status (%s) count (%d)", hVar, list.size());
            return false;
        } catch (ExecutionException e) {
            C59104x c2 = f274060b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ReqSchedEval");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(30456)).mo56386p("Failed to update registrations");
            return false;
        } catch (InterruptedException e2) {
            C59104x c3 = f274060b.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "ReqSchedEval");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(30457)).mo56386p("Interrupted while updating registrations");
            Thread.currentThread().interrupt();
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: p */
    private final void m162573p(C7957qf qfVar, String str, C98485y yVar, C58839bc bcVar, boolean z, C98444k kVar) {
        C7653ez ezVar;
        C7641en enVar;
        if (qfVar != null) {
            Iterator it = qfVar.f27955a.iterator();
            while (true) {
                C7641en enVar2 = null;
                if (it.hasNext()) {
                    C7653ez ezVar2 = (C7653ez) it.next();
                    if (bcVar.mo5941a(ezVar2) && m162571n(yVar, ezVar2)) {
                        C58976aa aaVar = C58975e.f156826a;
                        C98411ce ceVar = (C98411ce) C98414ch.f274733s.createBuilder();
                        C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
                        ceVar.copyOnWrite();
                        C98414ch chVar = (C98414ch) ceVar.instance;
                        chVar.f274736b = cgVar.f274731e;
                        chVar.f274735a |= 1;
                        ceVar.copyOnWrite();
                        C98414ch chVar2 = (C98414ch) ceVar.instance;
                        chVar2.f274735a |= 2;
                        chVar2.f274737c = str;
                        ceVar.copyOnWrite();
                        C98414ch chVar3 = (C98414ch) ceVar.instance;
                        chVar3.f274735a |= 16;
                        chVar3.f274744k = z;
                        ceVar.copyOnWrite();
                        C98414ch chVar4 = (C98414ch) ceVar.instance;
                        chVar4.f274735a |= 8;
                        chVar4.f274739e = true;
                        ceVar.mo91080d(C7642eo.REQUEST_SCHEDULE.f26533bC);
                        ceVar.mo91081e(ezVar2.f26570e);
                        ceVar.mo91078b(ezVar2.f26569d);
                        C98414ch chVar5 = (C98414ch) ceVar.build();
                        C98396bq bqVar = this.f274072n;
                        if ((ezVar2.f26566a & 8) != 0 && (enVar2 = ezVar2.f26571f) == null) {
                            enVar2 = C7641en.f26395d;
                        }
                        bqVar.mo91068a(chVar5, C98154aj.m162589g(z, enVar2, kVar));
                        return;
                    }
                } else {
                    for (C7659fe feVar : qfVar.f27956b) {
                        if ((feVar.f26578a & 2) != 0) {
                            ezVar = feVar.f26580c;
                            if (ezVar == null) {
                                ezVar = C7653ez.f26564g;
                            }
                        } else {
                            ezVar = null;
                        }
                        if (bcVar.mo5941a(ezVar) && m162571n(yVar, ezVar)) {
                            C58976aa aaVar2 = C58975e.f156826a;
                            C98411ce ceVar2 = (C98411ce) C98414ch.f274733s.createBuilder();
                            ceVar2.copyOnWrite();
                            C98414ch chVar6 = (C98414ch) ceVar2.instance;
                            chVar6.f274735a |= 2;
                            chVar6.f274737c = str;
                            ceVar2.mo91080d(C7642eo.REQUEST_SCHEDULE.f26533bC);
                            C7653ez ezVar3 = feVar.f26580c;
                            if (ezVar3 == null) {
                                ezVar3 = C7653ez.f26564g;
                            }
                            ceVar2.mo91081e(ezVar3.f26570e);
                            C7653ez ezVar4 = feVar.f26580c;
                            if (ezVar4 == null) {
                                ezVar4 = C7653ez.f26564g;
                            }
                            ceVar2.mo91078b(ezVar4.f26569d);
                            boolean z2 = feVar.f26583g;
                            ceVar2.copyOnWrite();
                            C98414ch chVar7 = (C98414ch) ceVar2.instance;
                            chVar7.f274735a |= 8;
                            chVar7.f274739e = z2;
                            int a = C7658fd.m22798a(feVar.f26579b);
                            if (a == 0) {
                                a = 1;
                            }
                            int i = a - 1;
                            if (i == 2) {
                                C98413cg cgVar2 = C98413cg.REQUEST_TYPE_ENTRY_TYPE_RESTRICT;
                                ceVar2.copyOnWrite();
                                C98414ch chVar8 = (C98414ch) ceVar2.instance;
                                chVar8.f274736b = cgVar2.f274731e;
                                chVar8.f274735a |= 1;
                                ceVar2.mo91079c(new C62963cj(feVar.f26581d, C7659fe.f26575e));
                            } else if (i != 3) {
                                C98413cg cgVar3 = C98413cg.REQUEST_TYPE_FULL;
                                ceVar2.copyOnWrite();
                                C98414ch chVar9 = (C98414ch) ceVar2.instance;
                                chVar9.f274736b = cgVar3.f274731e;
                                chVar9.f274735a |= 1;
                            } else {
                                C98413cg cgVar4 = C98413cg.REQUEST_TYPE_CARD_SELECTOR;
                                ceVar2.copyOnWrite();
                                C98414ch chVar10 = (C98414ch) ceVar2.instance;
                                chVar10.f274736b = cgVar4.f274731e;
                                chVar10.f274735a |= 1;
                                ceVar2.mo91077a(feVar.f26582f);
                            }
                            C98396bq bqVar2 = this.f274072n;
                            C98414ch chVar11 = (C98414ch) ceVar2.build();
                            C7653ez ezVar5 = feVar.f26580c;
                            if (((ezVar5 == null ? C7653ez.f26564g : ezVar5).f26566a & 8) != 0) {
                                if (ezVar5 == null) {
                                    ezVar5 = C7653ez.f26564g;
                                }
                                enVar = ezVar5.f26571f;
                                if (enVar == null) {
                                    enVar = C7641en.f26395d;
                                }
                            } else {
                                enVar = null;
                            }
                            bqVar2.mo91068a(chVar11, C98154aj.m162589g(z, enVar, kVar));
                        }
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: q */
    private final void m162574q(String str, C98484x xVar, C98444k kVar) {
        this.f274071m.add(new C98171b("refresh", this.f274062d.mo26870b()));
        if (str == null) {
            this.f274071m.add(new C98171b("aborted", this.f274062d.mo26870b()));
            C59104x d = f274060b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReqSchedEval");
            ((C59052c) ((C59052c) d).mo56372aa(30449)).mo56386p("No account: dropping request");
        } else {
            C98411ce ceVar = (C98411ce) C98414ch.f274733s.createBuilder();
            C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
            ceVar.copyOnWrite();
            C98414ch chVar = (C98414ch) ceVar.instance;
            chVar.f274736b = cgVar.f274731e;
            chVar.f274735a |= 1;
            ceVar.copyOnWrite();
            C98414ch chVar2 = (C98414ch) ceVar.instance;
            chVar2.f274735a |= 2;
            chVar2.f274737c = str;
            ceVar.copyOnWrite();
            C98414ch chVar3 = (C98414ch) ceVar.instance;
            chVar3.f274735a |= 32;
            chVar3.f274749p = false;
            ceVar.copyOnWrite();
            C98414ch chVar4 = (C98414ch) ceVar.instance;
            chVar4.f274735a |= 16;
            chVar4.f274744k = true;
            ceVar.copyOnWrite();
            C98414ch chVar5 = (C98414ch) ceVar.instance;
            chVar5.f274735a |= 8;
            chVar5.f274739e = true;
            ceVar.mo91080d(xVar.f275020e.f26533bC);
            C98396bq bqVar = this.f274072n;
            C98436dc g = C98437dd.m163018g();
            ((C98447n) g).f274859c = kVar;
            g.mo91103b(true);
            bqVar.mo91068a((C98414ch) ceVar.build(), g.mo91102a());
            C91307al alVar = (C91307al) this.f274074p.mo17428b();
            synchronized (alVar.f254819a) {
                C91731a a = alVar.mo85600a();
                a.copyOnWrite();
                C91732b bVar = (C91732b) a.instance;
                C91732b bVar2 = C91732b.f255833m;
                bVar.f255835a |= 64;
                bVar.f255846l = true;
            }
            this.f274073o.mo85607b(alVar);
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final boolean mo77580a(C7749in inVar) {
        if (inVar == C7749in.NEXT_PAGE) {
            return this.f274067i.mo79746e(C90010bp.f247009u);
        }
        return C98154aj.f274083a.contains(inVar);
    }

    /* renamed from: b */
    public final void mo77581b(C7749in inVar, int i, boolean z, C98444k kVar) {
        C98484x xVar;
        C7749in inVar2 = inVar;
        C98444k kVar2 = kVar;
        C58976aa aaVar = C58975e.f156826a;
        if (!mo77580a(inVar)) {
            C59104x d = f274060b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReqSchedEval");
            ((C59052c) ((C59052c) d).mo56372aa(30439)).mo56389s("Unexpected event: %s", inVar2);
        } else if (!((C84486a) this.f274075q.mo27525b()).mo78201h()) {
            C8142xb a = C8142xb.m22954a(i);
            if (a == null) {
                a = C8142xb.UNKNOWN_SURFACE;
            }
            C8142xb xbVar = a;
            C98149ae i2 = m162566i();
            C98291e eVar = (C98291e) i2;
            m162573p(eVar.f274393b, C58837ba.m90858g(eVar.f274392a), i2.mo90997e(), C98154aj.m162583a(inVar), z, kVar);
            C98484x xVar2 = eVar.f274395d;
            if (this.f274067i.mo79746e(C90010bp.f246921Q) || this.f274076r.mo78136y()) {
                xVar2 = C98484x.NONE;
            } else if (C98154aj.f274084b.contains(inVar2)) {
                boolean k = this.f274066h.mo85651k();
                long b = this.f274062d.mo26870b();
                long b2 = b - this.f274066h.mo85643b();
                long millis = TimeUnit.MINUTES.toMillis(this.f274067i.mo79743a(C90010bp.f246980aw));
                long c = b - this.f274066h.mo85644c();
                long millis2 = TimeUnit.MINUTES.toMillis(this.f274067i.mo79743a(C90010bp.f246981ax));
                if (k) {
                    xVar = C98484x.PUSH_REQUESTED;
                } else {
                    xVar = (b2 <= millis || this.f274066h.mo85643b() <= 0 || c <= millis2) ? C98484x.NONE : C98484x.STALE_FEED;
                }
                this.f274071m.add(new C98044a(xVar, b, k, TimeUnit.MILLISECONDS.toMinutes(b2), TimeUnit.MILLISECONDS.toMinutes(c)));
                if (xbVar != C8142xb.ACETONE_OVERLAY_MOMO || !xVar.f275019d) {
                    xVar2 = xVar;
                } else {
                    m162574q(eVar.f274392a, xVar, kVar2);
                    xVar2 = C98484x.NONE;
                }
            } else if (C98154aj.f274085c.contains(inVar2) && xVar2.f275019d) {
                xVar2 = C98484x.NONE;
                this.f274071m.add(new C98171b("reset", this.f274062d.mo26870b()));
            } else if (inVar2 == C7749in.RENDERING_STOPPED && xVar2.f275019d) {
                m162574q(eVar.f274392a, xVar2, kVar2);
                xVar2 = C98484x.NONE;
            }
            synchronized (this.f274069k) {
                this.f274079u = xVar2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r1 != false) goto L_0x0036;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77635c(com.google.android.apps.gsa.proactive.C84181q r13) {
        /*
            r12 = this;
            boolean r13 = r13.f229131b
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.co.ae r0 = r12.m162566i()
            dagger.a r1 = r12.f274075q
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r1
            boolean r1 = r1.mo78201h()
            r2 = 0
            r3 = 0
            if (r13 == 0) goto L_0x0020
            if (r1 != 0) goto L_0x0036
            com.google.android.apps.gsa.staticplugins.co.i.bq r13 = r12.f274072n
            r13.mo91072l()
            goto L_0x003a
        L_0x0020:
            r13 = r0
            com.google.android.apps.gsa.staticplugins.co.e r13 = (com.google.android.apps.gsa.staticplugins.p7686co.C98291e) r13
            com.google.ai.b.qf r13 = r13.f274393b
            com.google.android.apps.gsa.staticplugins.co.i.bq r4 = r12.f274072n
            if (r13 != 0) goto L_0x002b
            r13 = r2
            goto L_0x0031
        L_0x002b:
            com.google.ai.b.el r13 = r13.f27958d
            if (r13 != 0) goto L_0x0031
            com.google.ai.b.el r13 = com.google.p375ai.p378b.C7639el.f26392b
        L_0x0031:
            r4.mo91073n(r13)
            if (r1 == 0) goto L_0x003a
        L_0x0036:
            r12.m162569l(r2, r3)
            return
        L_0x003a:
            r13 = r0
            com.google.android.apps.gsa.staticplugins.co.e r13 = (com.google.android.apps.gsa.staticplugins.p7686co.C98291e) r13
            java.lang.String r1 = r13.f274392a
            com.google.android.apps.gsa.staticplugins.co.y r0 = r0.mo90997e()
            com.google.android.apps.gsa.staticplugins.co.c r2 = new com.google.android.apps.gsa.staticplugins.co.c
            r2.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.google.common.b.gu r5 = r13.f274394c
            int r6 = r5.size()
            r7 = 0
        L_0x0054:
            if (r7 >= r6) goto L_0x0068
            java.lang.Object r8 = r5.get(r7)
            com.google.android.apps.gsa.staticplugins.co.n r8 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r8
            int r8 = r8.f274971c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r7 = r7 + 1
            goto L_0x0054
        L_0x0068:
            com.google.ai.b.qf r5 = r13.f274393b
            java.lang.Iterable r5 = com.google.android.apps.gsa.staticplugins.p7686co.C98154aj.m162586d(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0072:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0137
            java.lang.Object r6 = r5.next()
            com.google.bj.b.j r6 = (com.google.p4184bj.p4189b.C55893j) r6
            java.lang.Object r8 = r0.get(r6)
            com.google.android.apps.gsa.staticplugins.co.n r8 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r8
            if (r8 != 0) goto L_0x0107
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L_0x00a2
            com.google.common.f.e r6 = f274060b
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "ReqSchedEval"
            r6.mo56378ag(r7, r8)
            java.lang.String r7 = "Cannot register a new fence without an account"
            r8 = 30425(0x76d9, float:4.2635E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)
            goto L_0x0072
        L_0x00a2:
            java.lang.Object r9 = r12.f274069k
            monitor-enter(r9)
            int r8 = r12.f274078t     // Catch:{ all -> 0x0104 }
            int r10 = r8 + 1
            r12.f274078t = r10     // Catch:{ all -> 0x0104 }
            monitor-exit(r9)     // Catch:{ all -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.co.n r9 = com.google.android.apps.gsa.staticplugins.p7686co.C98474n.f274967f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.gsa.staticplugins.co.k r9 = (com.google.android.apps.gsa.staticplugins.p7686co.C98463k) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.gsa.staticplugins.co.n r10 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r10
            r6.getClass()
            r10.f274970b = r6
            int r6 = r10.f274969a
            r6 = r6 | r7
            r10.f274969a = r6
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            com.google.android.apps.gsa.staticplugins.co.n r6 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r6
            int r10 = r6.f274969a
            r10 = r10 | 2
            r6.f274969a = r10
            r6.f274971c = r8
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            com.google.android.apps.gsa.staticplugins.co.n r6 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r6
            r6.f274972d = r7
            int r7 = r6.f274969a
            r7 = r7 | 4
            r6.f274969a = r7
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            com.google.android.apps.gsa.staticplugins.co.n r6 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r6
            r1.getClass()
            int r7 = r6.f274969a
            r7 = r7 | 8
            r6.f274969a = r7
            r6.f274973e = r1
            com.google.protobuf.bv r6 = r9.build()
            com.google.android.apps.gsa.staticplugins.co.n r6 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r6
            com.google.common.b.gp r7 = r2.mo90989d()
            r7.mo55395g(r6)
            goto L_0x0072
        L_0x0104:
            r13 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0104 }
            throw r13
        L_0x0107:
            java.lang.String r6 = r8.f274973e
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0125
            com.google.common.f.e r6 = f274060b
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "ReqSchedEval"
            r6.mo56378ag(r7, r8)
            java.lang.String r7 = "Cannot keep a registration without an account"
            r8 = 30423(0x76d7, float:4.2632E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)
            goto L_0x0072
        L_0x0125:
            com.google.common.b.gp r6 = r2.mo90988c()
            r6.mo55395g(r8)
            int r6 = r8.f274971c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.remove(r6)
            goto L_0x0072
        L_0x0137:
            java.util.Iterator r0 = r4.iterator()
        L_0x013b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x014f
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.google.common.b.gp r4 = r2.mo90987b()
            r4.mo55395g(r1)
            goto L_0x013b
        L_0x014f:
            com.google.android.apps.gsa.staticplugins.co.ac r0 = r2.mo90986a()
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gu r2 = r0.mo90992c()
            r1.mo55396h(r2)
            com.google.common.b.gu r2 = r0.mo90991b()
            r1.mo55396h(r2)
            com.google.common.b.gu r1 = r1.mo55394f()
            java.lang.String r2 = r13.f274392a
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x0186
            com.google.common.f.e r13 = f274060b
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ReqSchedEval"
            r13.mo56378ag(r1, r2)
            java.lang.String r1 = "Unknown account name"
            r2 = 30454(0x76f6, float:4.2675E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r1)
            goto L_0x01e9
        L_0x0186:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.google.common.b.gu r5 = r13.f274394c
            int r6 = r5.size()
            r8 = 0
        L_0x0192:
            if (r8 >= r6) goto L_0x01b0
            java.lang.Object r9 = r5.get(r8)
            com.google.android.apps.gsa.staticplugins.co.n r9 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r9
            java.lang.String r10 = r9.f274973e
            java.lang.String r11 = r13.f274392a
            java.lang.String r11 = com.google.common.base.C58837ba.m90858g(r11)
            boolean r10 = com.google.common.base.C58890d.m90990e(r10, r11)
            if (r10 != 0) goto L_0x01ad
            java.lang.String r9 = r9.f274973e
            r4.add(r9)
        L_0x01ad:
            int r8 = r8 + 1
            goto L_0x0192
        L_0x01b0:
            java.util.Iterator r13 = r4.iterator()
        L_0x01b4:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x01c4
            java.lang.Object r4 = r13.next()
            java.lang.String r4 = (java.lang.String) r4
            r12.m162567j(r4)
            goto L_0x01b4
        L_0x01c4:
            boolean r13 = r12.m162572o(r2, r1)
            if (r13 != 0) goto L_0x01e9
            r13 = r1
            com.google.common.b.pq r13 = (com.google.common.p4522b.C58724pq) r13
            int r13 = r13.f156474d
            if (r13 <= r7) goto L_0x01e9
            com.google.common.b.sm r13 = r1.listIterator(r3)
        L_0x01d5:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x01e9
            java.lang.Object r1 = r13.next()
            com.google.android.apps.gsa.staticplugins.co.n r1 = (com.google.android.apps.gsa.staticplugins.p7686co.C98474n) r1
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r12.m162572o(r2, r1)
            goto L_0x01d5
        L_0x01e9:
            r12.m162570m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.C98150af.mo77635c(com.google.android.apps.gsa.proactive.q):void");
    }

    /* renamed from: e */
    public final void mo77636e(C84179o... oVarArr) {
        int i;
        C84179o[] oVarArr2 = oVarArr;
        C58976aa aaVar = C58975e.f156826a;
        if (oVarArr2 == null) {
            C59104x d = f274060b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReqSchedEval");
            ((C59052c) ((C59052c) d).mo56372aa(30445)).mo56386p("No fence state transitions");
        } else if (!((C84486a) this.f274075q.mo27525b()).mo78201h()) {
            C98149ae i2 = m162566i();
            C98291e eVar = (C98291e) i2;
            C98148ad g = m162564g(eVar.f274394c);
            C98485y e = i2.mo90997e();
            C98250c cVar = new C98250c();
            String str = eVar.f274392a;
            int length = oVarArr2.length;
            int i3 = 0;
            while (i3 < length) {
                C84179o oVar = oVarArr2[i3];
                if (oVar == null) {
                    C59104x d2 = f274060b.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "ReqSchedEval");
                    ((C59052c) ((C59052c) d2).mo56372aa(30443)).mo56386p("Failed to parse registration ID");
                } else {
                    C98474n nVar = (C98474n) g.get(oVar.f229125c);
                    if (nVar == null) {
                        C59104x d3 = f274060b.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "ReqSchedEval");
                        ((C59052c) ((C59052c) d3).mo56372aa(30442)).mo56389s("Couldn't find registration: %s", oVar.f229124b);
                    } else {
                        int i4 = oVar.f229126d ? 3 : 4;
                        int a = C98473m.m163121a(nVar.f274972d);
                        if (a == 0) {
                            a = 1;
                        }
                        if (a != i4) {
                            C98463k kVar = (C98463k) nVar.toBuilder();
                            kVar.copyOnWrite();
                            C98474n nVar2 = (C98474n) kVar.instance;
                            nVar2.f274972d = i4 - 1;
                            nVar2.f274969a = 4 | nVar2.f274969a;
                            C98474n nVar3 = (C98474n) kVar.build();
                            cVar.mo90989d().mo55395g(nVar3);
                            g.put(nVar3.f274971c, nVar3);
                            C55893j jVar = nVar3.f274970b;
                            if (jVar == null) {
                                jVar = C55893j.f148728h;
                            }
                            e.put(jVar, nVar3);
                            if (i4 == 3) {
                                C98444k p = this.f274072n.mo91075p("fence transition");
                                C7957qf qfVar = eVar.f274393b;
                                String g2 = C58837ba.m90858g(str);
                                C55893j jVar2 = nVar3.f274970b;
                                if (jVar2 == null) {
                                    jVar2 = C55893j.f148728h;
                                }
                                i = i3;
                                m162573p(qfVar, g2, e, C98154aj.m162584b(jVar2), false, p);
                                p.mo91113b();
                                i3 = i + 1;
                            }
                        }
                    }
                }
                i = i3;
                i3 = i + 1;
            }
            m162570m(cVar.mo90986a());
        }
    }

    /* renamed from: f */
    public final void mo77637f() {
        C58976aa aaVar = C58975e.f156826a;
        m162569l(this.f274068j.mo79659F(), true);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        List<C7653ez> list;
        List<C7659fe> list2;
        fVar.mo85291r("RequestScheduleEvaluator");
        fVar.mo85279c("type").mo85276a(C90752i.m148229c("ReqSchedEval"));
        C98149ae aeVar = (C98149ae) this.f274061c.get();
        fVar.mo85279c("initialized").mo85276a(C90752i.m148228b(Boolean.valueOf(aeVar != null)));
        fVar.mo85279c("deprecated").mo85276a(C90752i.m148228b(Boolean.valueOf(((C84486a) this.f274075q.mo27525b()).mo78201h())));
        if (aeVar != null) {
            synchronized (this.f274069k) {
                fVar.mo85279c("nextRegistrationId").mo85276a(C90752i.m148230d(Integer.valueOf(this.f274078t)));
            }
            C7957qf c = aeVar.mo90995c();
            C91006f e = fVar.mo85281e((Object) null);
            if (c == null) {
                list = Collections.emptyList();
            } else {
                list = c.f27955a;
            }
            e.mo85291r("refreshConditions");
            e.mo85281e((Object) null).mo85279c("count").mo85276a(C90752i.m148230d(Integer.valueOf(list.size())));
            C98485y e2 = aeVar.mo90997e();
            for (C7653ez k : list) {
                m162568k(e.mo85281e((Object) null), k, e2);
            }
            C91006f e3 = fVar.mo85281e((Object) null);
            if (c == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = c.f27956b;
            }
            e3.mo85291r("conditionalRequests");
            e3.mo85281e((Object) null).mo85279c("count").mo85276a(C90752i.m148230d(Integer.valueOf(list2.size())));
            for (C7659fe feVar : list2) {
                C91006f e4 = e3.mo85281e((Object) null);
                e4.mo85279c("type").mo85276a(C90752i.m148229c("conditional"));
                C91005e c2 = e4.mo85279c("requestType");
                int a = C7658fd.m22798a(feVar.f26579b);
                if (a == 0) {
                    a = 1;
                }
                c2.mo85276a(C90752i.m148229c(C98154aj.m162588f(a)));
                if ((2 & feVar.f26578a) != 0) {
                    C91006f e5 = e4.mo85281e((Object) null);
                    C7653ez ezVar = feVar.f26580c;
                    if (ezVar == null) {
                        ezVar = C7653ez.f26564g;
                    }
                    m162568k(e5, ezVar, e2);
                }
            }
            C91006f e6 = fVar.mo85281e((Object) null);
            e6.mo85291r("registrations");
            C91006f e7 = e6.mo85281e((Object) null);
            e7.mo85279c("count").mo85276a(C90752i.m148230d(Integer.valueOf(e2.f3122d)));
            for (int i = 0; i < e2.f3122d; i++) {
                C98474n nVar = (C98474n) e2.mo3708h(i);
                C90752i[] iVarArr = new C90752i[2];
                iVarArr[0] = C90752i.m148230d(Integer.valueOf(nVar.f274971c));
                int a2 = C98473m.m163121a(nVar.f274972d);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i2 = a2 - 1;
                iVarArr[1] = C90752i.m148229c(i2 != 1 ? i2 != 2 ? i2 != 3 ? "invalid: ".concat(Integer.toString(i2)) : "out" : "in" : "unknown");
                e7.mo85293t("%d: %s", iVarArr);
            }
            C91006f e8 = fVar.mo85281e((Object) null);
            e8.mo85291r("implicitRefresh");
            e8.mo85281e((Object) null).mo85279c("appOpenRefresh").mo85276a(C90752i.m148231e(aeVar.mo90993a()));
            for (C90991b gS : this.f274071m) {
                gS.mo17602gS(e8.mo85281e((Object) null));
            }
        }
    }

    /* renamed from: k */
    private static void m162568k(C91006f fVar, C7653ez ezVar, C98485y yVar) {
        C7625dy dyVar;
        C7750io ioVar;
        C7750io ioVar2;
        C7750io ioVar3;
        int i = ezVar.f26567b;
        C55893j jVar = null;
        String str = "unknown";
        if (i == 1) {
            fVar.mo85279c("type").mo85276a(C90752i.m148229c("event"));
            C91005e c = fVar.mo85279c("event");
            if (ezVar.f26567b == 1) {
                ioVar = (C7750io) ezVar.f26568c;
            } else {
                ioVar = C7750io.f27119d;
            }
            C7749in a = C7749in.m22836a(ioVar.f27122b);
            if (a == null) {
                a = C7749in.INVALID;
            }
            c.mo85276a(C90752i.m148230d(Integer.valueOf(a.f27118h)));
            int i2 = ezVar.f26567b;
            if (i2 == 1) {
                ioVar2 = (C7750io) ezVar.f26568c;
            } else {
                ioVar2 = C7750io.f27119d;
            }
            if ((ioVar2.f27121a & 2) != 0) {
                if (i2 == 1) {
                    ioVar3 = (C7750io) ezVar.f26568c;
                } else {
                    ioVar3 = C7750io.f27119d;
                }
                C7625dy dyVar2 = ioVar3.f27123c;
                if (dyVar2 == null) {
                    dyVar2 = C7625dy.f26342c;
                }
                jVar = dyVar2.f26345b;
                if (jVar == null) {
                    jVar = C55893j.f148728h;
                }
            }
        } else if (i == 2) {
            fVar.mo85279c("type").mo85276a(C90752i.m148229c("fence"));
            if (ezVar.f26567b == 2) {
                dyVar = (C7625dy) ezVar.f26568c;
            } else {
                dyVar = C7625dy.f26342c;
            }
            jVar = dyVar.f26345b;
            if (jVar == null) {
                jVar = C55893j.f148728h;
            }
        } else {
            fVar.mo85279c("type").mo85276a(C90752i.m148229c(str));
        }
        if (jVar != null) {
            C91005e c2 = fVar.mo85279c("fence");
            StringBuilder sb = new StringBuilder();
            C98308f.m162847a(sb, jVar);
            c2.mo85276a(C90752i.m148229c(sb));
            C98474n nVar = (C98474n) yVar.get(jVar);
            fVar.mo85279c("registrationId").mo85276a(C90752i.m148231e(nVar != null ? Integer.valueOf(nVar.f274971c) : str));
            C91005e c3 = fVar.mo85279c("account");
            if (nVar != null) {
                str = nVar.f274973e;
            }
            c3.mo85276a(C90752i.m148233g(str));
        }
        fVar.mo85279c("trace").mo85276a(C90752i.m148230d(Integer.valueOf(ezVar.f26570e)));
    }
}
