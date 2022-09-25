package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.content.Context;
import android.databinding.C0118a;
import android.location.Location;
import android.net.Uri;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90994c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91314as;
import com.google.android.apps.gsa.sidekick.main.entry.C91320ay;
import com.google.android.apps.gsa.sidekick.main.entry.C91321az;
import com.google.android.apps.gsa.sidekick.main.entry.C91324bb;
import com.google.android.apps.gsa.sidekick.main.entry.C91325bc;
import com.google.android.apps.gsa.sidekick.main.entry.C91326bd;
import com.google.android.apps.gsa.sidekick.main.entry.C91329bg;
import com.google.android.apps.gsa.sidekick.main.entry.C91336bn;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91388r;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.apps.gsa.sidekick.main.trigger.service.C91637e;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7666fl;
import com.google.p375ai.p378b.C7668fn;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7702gu;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7713he;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7725hq;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7728ht;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.as */
/* compiled from: PG */
public final class C98064as implements C91306ak, C98104ce {

    /* renamed from: a */
    public static final C59071e f273803a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.a.as");

    /* renamed from: A */
    private final C58881cr f273804A;

    /* renamed from: B */
    private C58833ax f273805B;

    /* renamed from: b */
    public final C91314as f273806b;

    /* renamed from: c */
    public final C21370a f273807c;

    /* renamed from: d */
    public final Context f273808d;

    /* renamed from: e */
    public final C74637ae f273809e;

    /* renamed from: f */
    public final C22871g f273810f;

    /* renamed from: g */
    public final C22871g f273811g;

    /* renamed from: h */
    public final C91336bn f273812h;

    /* renamed from: i */
    public final C91637e f273813i;

    /* renamed from: j */
    public final C69464a f273814j;

    /* renamed from: k */
    public final C84160c f273815k;

    /* renamed from: l */
    public final C86124t f273816l;

    /* renamed from: m */
    public final C68214a f273817m;

    /* renamed from: n */
    public final C69464a f273818n;

    /* renamed from: o */
    public final Object f273819o = new Object();

    /* renamed from: p */
    public final C90998g f273820p;

    /* renamed from: q */
    public final C118827a f273821q;

    /* renamed from: r */
    public final C91320ay f273822r;

    /* renamed from: s */
    public final C91324bb f273823s;

    /* renamed from: t */
    public final C98127i f273824t;

    /* renamed from: u */
    private final C22871g f273825u;

    /* renamed from: v */
    private final C91329bg f273826v;

    /* renamed from: w */
    private final C91388r f273827w;

    /* renamed from: x */
    private final Object f273828x = new Object();

    /* renamed from: y */
    private final C90998g f273829y;

    /* renamed from: z */
    private final C90998g f273830z;

    public C98064as(C21370a aVar, Context context, C91320ay ayVar, C91324bb bbVar, C98127i iVar, C74637ae aeVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C91336bn bnVar, C91637e eVar, C69464a aVar2, C84160c cVar, C91329bg bgVar, C91314as asVar, C86124t tVar, C68214a aVar3, C90998g gVar4, C90998g gVar5, C69464a aVar4, C118827a aVar5, C91388r rVar) {
        this.f273807c = aVar;
        this.f273808d = context;
        this.f273822r = ayVar;
        this.f273823s = bbVar;
        this.f273824t = iVar;
        this.f273809e = aeVar;
        this.f273825u = gVar;
        this.f273810f = gVar2;
        this.f273811g = gVar3;
        this.f273812h = bnVar;
        this.f273813i = eVar;
        this.f273806b = asVar;
        this.f273814j = aVar2;
        this.f273815k = cVar;
        this.f273826v = bgVar;
        this.f273805B = C58836b.f156633a;
        this.f273816l = tVar;
        this.f273817m = aVar3;
        this.f273829y = new C90994c(aVar, 20);
        this.f273820p = gVar4;
        this.f273830z = gVar5;
        this.f273818n = aVar4;
        this.f273821q = aVar5;
        this.f273827w = rVar;
        this.f273804A = C58886cw.m90973a(new C98130l(this));
    }

    /* renamed from: A */
    private static void m162360A(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7726hr hrVar = (C7726hr) it.next();
            if ((hrVar.f27010a & 8) != 0) {
                C7718hj hjVar = hrVar.f27016g;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                arrayList.add(hjVar);
            }
            if ((hrVar.f27010a & 2) != 0) {
                C7718hj hjVar2 = hrVar.f27015f;
                if (hjVar2 == null) {
                    hjVar2 = C7718hj.f26927af;
                }
                arrayList.add(hjVar2);
            }
            for (C7718hj add : hrVar.f27013d) {
                arrayList.add(add);
            }
            m162360A(arrayList, hrVar.f27012c);
        }
    }

    /* renamed from: B */
    private final void m162361B(C60870cx cxVar, String str) {
        if (cxVar != null) {
            this.f273811g.mo28211k(cxVar, "EntryProvider", new C98056ak(str));
        }
    }

    /* renamed from: y */
    private static C58485gu m162362y(List list) {
        return C58485gu.m89842j((Collection) Collection.EL.stream(list).map(C98047ab.f273779a).collect(Collectors.toList()));
    }

    /* renamed from: z */
    private final C60870cx m162363z() {
        synchronized (this.f273828x) {
            if (this.f273805B.mo56113h()) {
                C60870cx cxVar = (C60870cx) this.f273805B.mo56107c();
                return cxVar;
            }
            synchronized (this.f273819o) {
                if (this.f273816l.mo79746e(C90010bp.f246923S)) {
                    this.f273805B = C58833ax.m90834k(C118826c.m197212b(C58485gu.m89847o(C118826c.m197213c(this.f273822r.mo85612a()), C118826c.m197213c(this.f273822r.mo85614c(false, C8142xb.UNKNOWN_SURFACE)))));
                } else {
                    this.f273805B = C58833ax.m90834k(C118826c.m197213c(this.f273822r.mo85612a()));
                }
            }
            C60870cx cxVar2 = (C60870cx) this.f273805B.mo56107c();
            return cxVar2;
        }
    }

    /* renamed from: a */
    public final C60870cx mo85589a(Location location, long j, TriggerConditionEvaluator.APriori aPriori) {
        C60870cx b = this.f273810f.mo28202b("evaluateTriggerConditionsAndReschedule$resultFuture", new C98129k(this, location, j, aPriori));
        m162361B(b, "evaluateTriggerConditionsAndReschedule");
        return b;
    }

    /* renamed from: b */
    public final C60870cx mo85590b() {
        return this.f273810f.mo28201a("forceInvalidateAsync", new C98140v(this));
    }

    /* renamed from: c */
    public final C60870cx mo85591c(int i) {
        Map a;
        C60870cx a2;
        synchronized (this.f273819o) {
            a = this.f273824t.mo90982a();
            a2 = this.f273822r.mo85612a();
        }
        return this.f273825u.mo28209i(a2, "EntryProviderImpl.transformEntryTree", new C98050ae(this, a, i));
    }

    /* renamed from: e */
    public final C60870cx mo85592e(java.util.Collection collection) {
        return this.f273825u.mo28210j(m162363z(), "EntryProvider.handleDismissedEntries", new C98052ag(this, collection));
    }

    /* renamed from: f */
    public final C60870cx mo85593f(Uri uri) {
        return this.f273825u.mo28210j(m162363z(), "EntryProvider.handleExpiredNotifications", new C98137s(this, uri));
    }

    /* renamed from: g */
    public final C60870cx mo85594g() {
        return this.f273810f.mo28209i(m162363z(), "EntryProvider.invalidateIfConnectedAsync", new C98143y(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("EntryProvider");
        synchronized (this.f273819o) {
            long longValue = ((Long) C60856cj.m92910s(this.f273822r.mo85616f())).longValue();
            if (longValue > 0) {
                fVar.mo85279c("lastChange").mo85276a(C90752i.m148232f(new Date(longValue)));
            }
            this.f273829y.mo85271g(fVar, "entryProviderVisitors", C98132n.f274038a, false);
            this.f273820p.mo85271g(fVar, "entryProviderEvents", C98133o.f274039a, false);
            this.f273830z.mo85271g(fVar, "nextPageEvents", C98134p.f274040a, false);
        }
    }

    /* renamed from: h */
    public final C60870cx mo85595h() {
        C60870cx j = this.f273810f.mo28210j(m162363z(), "markAllCardsRendered", new C98054ai(this));
        m162361B(j, "markAllCardsRendered");
        return j;
    }

    /* renamed from: i */
    public final C60870cx mo85596i(C7718hj hjVar, java.util.Collection collection) {
        return this.f273825u.mo28210j(m162363z(), "EntryProvider.removeGroupChildEntries", new C98049ad(this, collection, hjVar));
    }

    /* renamed from: j */
    public final C60870cx mo85597j(C91326bd bdVar, boolean z, String str) {
        return this.f273825u.mo28210j(m162363z(), "EntryProvider.updateEntriesModification", new C98131m(this, str, bdVar, z));
    }

    /* renamed from: k */
    public final void mo85598k() {
        mo90925t();
    }

    /* renamed from: l */
    public final void mo85599l(C7669fo foVar) {
        this.f273825u.mo28210j(m162363z(), "EntryProvider.removeNotificationMigratedToChime", new C98139u(this, foVar));
    }

    /* renamed from: m */
    public final long mo90918m() {
        return TimeUnit.MILLISECONDS.toSeconds(this.f273807c.mo26870b());
    }

    /* renamed from: n */
    public final C98059an mo90919n(C91321az azVar, C7744ii iiVar) {
        Set set = azVar.f254868d;
        if (set.isEmpty()) {
            C98099c cVar = new C98099c();
            cVar.mo90910c(false);
            cVar.mo90909b(iiVar);
            return cVar.mo90908a();
        }
        C91307al alVar = (C91307al) this.f273818n.mo17428b();
        C7744ii k = new C91325bc(alVar, set).mo86654k(iiVar);
        this.f273823s.mo85637w(this.f273807c.mo26870b());
        C60856cj.m92910s(this.f273806b.mo85607b(alVar));
        C98099c cVar2 = new C98099c();
        cVar2.mo90910c(true);
        cVar2.mo90909b(k);
        return cVar2.mo90908a();
    }

    /* renamed from: o */
    public final C98063ar mo90920o(C7744ii iiVar, C7702gu guVar, C91307al alVar) {
        int i;
        C98062aq aqVar;
        if (guVar.f26881a.size() > 0) {
            aqVar = new C98062aq(m162362y(guVar.f26881a), alVar, this.f273820p);
            iiVar = aqVar.mo86654k(iiVar);
            i = aqVar.f273802e;
        } else {
            aqVar = null;
            i = 0;
        }
        if (guVar.f26882b.size() > 0) {
            C98062aq aqVar2 = new C98062aq(m162362y(guVar.f26882b), alVar, this.f273820p);
            iiVar = aqVar2.mo86654k(iiVar);
            i += aqVar2.f273802e;
        }
        ArrayList arrayList = new ArrayList();
        if (aqVar != null && !aqVar.f273801d.isEmpty()) {
            for (C7718hj hjVar : aqVar.f273801d) {
                int a = C7713he.m22812a(hjVar.f26985z);
                if (a != 0 && a == 4) {
                    C7666fl flVar = (C7666fl) C7669fo.f26633e.createBuilder();
                    C7668fn fnVar = C7668fn.CLUSTER;
                    flVar.copyOnWrite();
                    C7669fo foVar = (C7669fo) flVar.instance;
                    foVar.f26637c = fnVar.f26632m;
                    foVar.f26635a |= 2;
                    C7669fo foVar2 = hjVar.f26968i;
                    if (foVar2 == null) {
                        foVar2 = C7669fo.f26633e;
                    }
                    String str = foVar2.f26636b;
                    flVar.copyOnWrite();
                    C7669fo foVar3 = (C7669fo) flVar.instance;
                    str.getClass();
                    foVar3.f26635a |= 1;
                    foVar3.f26636b = str;
                    C7669fo foVar4 = hjVar.f26968i;
                    if (foVar4 == null) {
                        foVar4 = C7669fo.f26633e;
                    }
                    long j = foVar4.f26638d;
                    flVar.copyOnWrite();
                    C7669fo foVar5 = (C7669fo) flVar.instance;
                    foVar5.f26635a |= 4;
                    foVar5.f26638d = j;
                    C7669fo foVar6 = (C7669fo) flVar.build();
                    C7725hq hqVar = (C7725hq) C7726hr.f27008i.createBuilder();
                    C7711hc hcVar = (C7711hc) C7718hj.f26927af.createBuilder();
                    C7746ik ikVar = C7746ik.CLUSTER_METADATA;
                    hcVar.copyOnWrite();
                    C7718hj hjVar2 = (C7718hj) hcVar.instance;
                    hjVar2.f26966g = ikVar.f27108J;
                    hjVar2.f26955a |= 1;
                    String str2 = hjVar.f26947S;
                    hcVar.copyOnWrite();
                    C7718hj hjVar3 = (C7718hj) hcVar.instance;
                    str2.getClass();
                    hjVar3.f26961b |= 2048;
                    hjVar3.f26947S = str2;
                    hcVar.copyOnWrite();
                    C7718hj hjVar4 = (C7718hj) hcVar.instance;
                    foVar6.getClass();
                    hjVar4.f26968i = foVar6;
                    hjVar4.f26955a |= 4;
                    hqVar.copyOnWrite();
                    C7726hr hrVar = (C7726hr) hqVar.instance;
                    C7718hj hjVar5 = (C7718hj) hcVar.build();
                    hjVar5.getClass();
                    hrVar.f27016g = hjVar5;
                    hrVar.f27010a |= 8;
                    C7725hq hqVar2 = (C7725hq) C7726hr.f27008i.createBuilder();
                    C7711hc hcVar2 = (C7711hc) hjVar.toBuilder();
                    hcVar2.copyOnWrite();
                    C7718hj hjVar6 = (C7718hj) hcVar2.instance;
                    hjVar6.f26962c = 241;
                    hjVar6.f26963d = true;
                    hcVar2.copyOnWrite();
                    C7718hj hjVar7 = (C7718hj) hcVar2.instance;
                    hjVar7.f26955a |= 16777216;
                    hjVar7.f26933E = false;
                    hqVar2.copyOnWrite();
                    C7726hr hrVar2 = (C7726hr) hqVar2.instance;
                    C7718hj hjVar8 = (C7718hj) hcVar2.build();
                    hjVar8.getClass();
                    hrVar2.mo16951b();
                    hrVar2.f27013d.add(hjVar8);
                    hqVar.copyOnWrite();
                    C7726hr hrVar3 = (C7726hr) hqVar.instance;
                    C7726hr hrVar4 = (C7726hr) hqVar2.build();
                    hrVar4.getClass();
                    hrVar3.mo16950a();
                    hrVar3.f27012c.add(hrVar4);
                    arrayList.add((C7726hr) hqVar.build());
                }
            }
        }
        C7726hr hrVar5 = iiVar.f27057b;
        if (hrVar5 == null) {
            hrVar5 = C7726hr.f27008i;
        }
        C7725hq hqVar3 = (C7725hq) hrVar5.toBuilder();
        if (!arrayList.isEmpty()) {
            ArrayList b = C58597ky.m90211b(Collections.unmodifiableList(((C7726hr) hqVar3.instance).f27012c));
            b.addAll(0, arrayList);
            hqVar3.copyOnWrite();
            ((C7726hr) hqVar3.instance).f27012c = C7726hr.emptyProtobufList();
            hqVar3.mo16948a(b);
        }
        C7728ht htVar = (C7728ht) iiVar.toBuilder();
        htVar.copyOnWrite();
        C7744ii iiVar2 = (C7744ii) htVar.instance;
        C7726hr hrVar6 = (C7726hr) hqVar3.build();
        hrVar6.getClass();
        iiVar2.f27057b = hrVar6;
        iiVar2.f27056a = 1 | iiVar2.f27056a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        m162360A(arrayList2, arrayList);
        return C98063ar.m162353e(i, C58485gu.m89842j(arrayList2), (C7744ii) htVar.build());
    }

    /* renamed from: p */
    public final C60870cx mo90921p(C91953ad adVar, boolean z) {
        C60870cx cxVar;
        if (!this.f273816l.mo79746e(C90010bp.f247004p)) {
            cxVar = this.f273809e.mo71021e(C39226b.TAG_CLASSIC_SEARCH_PROACTIVE_LO);
        } else {
            cxVar = C60866ct.f164955a;
        }
        return this.f273811g.mo28210j(this.f273810f.mo28209i(cxVar, "mutateEntriesAndPersist$transform", new C98135q(this, adVar, z)), "mutateEntriesAndPersist$transformAsync", new C98136r(this));
    }

    /* renamed from: q */
    public final C60870cx mo90922q(C7702gu guVar) {
        C59104x b = f273803a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EntryProvider");
        C0118a.m109q(b, "Step 6: EntryProviderImpl:updateFromPushedEntryChanges", 30527, "NotificationFullFlow", C58975e.f156826a);
        C60870cx j = this.f273811g.mo28210j(m162363z(), "updateFromPushedEntryChanges$transformAsync", new C98144z(this, guVar));
        m162361B(j, "updateFromPushedEntryChanges");
        return j;
    }

    /* renamed from: r */
    public final C60870cx mo90923r(String str, C60870cx cxVar, C91307al alVar) {
        C60870cx j = this.f273811g.mo28210j(cxVar, "waitAndNotify$transformAsync", new C98051af(this, alVar));
        m162361B(j, str);
        return j;
    }

    /* renamed from: s */
    public final C7744ii mo90924s(C7744ii iiVar, C91321az azVar) {
        return mo90919n(azVar, azVar.mo86653j(iiVar)).mo90911a();
    }

    /* renamed from: t */
    public final void mo90925t() {
        this.f273820p.mo85270f("invalidate", C90996e.f254198a);
        this.f273826v.mo85647g();
        synchronized (this.f273819o) {
            this.f273823s.mo85627m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo90926u(C91321az azVar) {
        this.f273825u.mo28212l("Reschedule trigger condition evaluation", new C98138t(this, azVar));
    }

    /* renamed from: v */
    public final void mo90927v(C7744ii iiVar) {
        this.f273823s.mo85631q(iiVar);
        this.f273823s.mo85637w(this.f273807c.mo26870b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.google.ai.b.ii} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013b, code lost:
        mo90926u(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90928w(com.google.p375ai.p378b.C7722hn r15, com.google.android.apps.gsa.sidekick.shared.p7244m.C91762b r16, android.location.Location r17, java.lang.String r18, com.google.android.apps.gsa.sidekick.main.entry.C91307al r19, boolean r20) {
        /*
            r14 = this;
            r1 = r14
            r0 = r15
            r2 = r16
            r3 = r19
            com.google.android.apps.gsa.shared.util.debug.a.b.g r4 = r1.f273820p
            java.lang.String r5 = "updateFromEntryResponse"
            com.google.android.apps.gsa.shared.util.debug.a.b.e r6 = com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e.f254198a
            r4.mo85270f(r5, r6)
            r4 = 0
            if (r17 == 0) goto L_0x0017
            com.google.ai.b.kp r5 = com.google.android.apps.gsa.sidekick.shared.util.C91966aq.m150922b(r17)
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            com.google.android.libraries.f.a r6 = r1.f273807c
            long r6 = r6.mo26870b()
            java.lang.Object r12 = r1.f273819o
            monitor-enter(r12)
            com.google.android.apps.gsa.sidekick.main.entry.bb r8 = r1.f273823s     // Catch:{ all -> 0x013f }
            r9 = r18
            r8.mo85629o(r9)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.entry.bb r8 = r1.f273823s     // Catch:{ all -> 0x013f }
            com.google.protobuf.cq r9 = r0.f26999e     // Catch:{ all -> 0x013f }
            r8.mo85634t(r9)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.entry.bb r8 = r1.f273823s     // Catch:{ all -> 0x013f }
            r8.mo85638x(r5)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.entry.bb r5 = r1.f273823s     // Catch:{ all -> 0x013f }
            int r8 = r0.f26995a     // Catch:{ all -> 0x013f }
            r8 = r8 & 8
            if (r8 == 0) goto L_0x0043
            com.google.bv.e.k r8 = r0.f27000f     // Catch:{ all -> 0x013f }
            if (r8 != 0) goto L_0x0044
            com.google.bv.e.k r8 = com.google.p4283bv.p4354e.C57526k.f153659b     // Catch:{ all -> 0x013f }
            goto L_0x0044
        L_0x0043:
            r8 = r4
        L_0x0044:
            r5.mo85633s(r8)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.entry.bb r5 = r1.f273823s     // Catch:{ all -> 0x013f }
            int r8 = r0.f26995a     // Catch:{ all -> 0x013f }
            r8 = r8 & 32
            if (r8 == 0) goto L_0x0056
            com.google.bv.e.b r8 = r0.f27002h     // Catch:{ all -> 0x013f }
            if (r8 != 0) goto L_0x0057
            com.google.bv.e.b r8 = com.google.p4283bv.p4354e.C57051b.f152305a     // Catch:{ all -> 0x013f }
            goto L_0x0057
        L_0x0056:
            r8 = r4
        L_0x0057:
            r5.mo85632r(r8)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.shared.util.debug.a.b.g r5 = r1.f273830z     // Catch:{ all -> 0x013f }
            int r8 = r0.f26995a     // Catch:{ all -> 0x013f }
            r8 = r8 & 8
            if (r8 == 0) goto L_0x0069
            com.google.bv.e.k r8 = r0.f27000f     // Catch:{ all -> 0x013f }
            if (r8 != 0) goto L_0x006a
            com.google.bv.e.k r8 = com.google.p4283bv.p4354e.C57526k.f153659b     // Catch:{ all -> 0x013f }
            goto L_0x006a
        L_0x0069:
            r8 = r4
        L_0x006a:
            java.lang.String r9 = "EntryResponse token"
            java.lang.String r8 = com.google.android.apps.gsa.sidekick.shared.util.C91955af.m150907d(r8, r9)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.shared.util.debug.a.b.e r9 = com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e.f254198a     // Catch:{ all -> 0x013f }
            r5.mo85270f(r8, r9)     // Catch:{ all -> 0x013f }
            com.google.protobuf.cq r5 = r0.f26996b     // Catch:{ all -> 0x013f }
            int r5 = r5.size()     // Catch:{ all -> 0x013f }
            r13 = 0
            if (r5 <= 0) goto L_0x0087
            com.google.protobuf.cq r0 = r0.f26996b     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x013f }
            r4 = r0
            com.google.ai.b.ii r4 = (com.google.p375ai.p378b.C7744ii) r4     // Catch:{ all -> 0x013f }
        L_0x0087:
            if (r4 != 0) goto L_0x008b
            monitor-exit(r12)     // Catch:{ all -> 0x013f }
            return
        L_0x008b:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x013f }
            long r7 = r0.toSeconds(r6)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator$APriori r9 = new com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator$APriori     // Catch:{ all -> 0x013f }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x013f }
            r9.<init>((java.util.List) r0)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.proactive.b.c r11 = r1.f273815k     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.entry.az r0 = new com.google.android.apps.gsa.sidekick.main.entry.az     // Catch:{ all -> 0x013f }
            r10 = 1
            r5 = r0
            r6 = r17
            r5.<init>(r6, r7, r9, r10, r11)     // Catch:{ all -> 0x013f }
            com.google.ai.b.ii r4 = r14.mo90924s(r4, r0)     // Catch:{ all -> 0x013f }
            r14.mo90927v(r4)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f273816l     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246923S     // Catch:{ all -> 0x013f }
            boolean r5 = r5.mo79746e(r6)     // Catch:{ all -> 0x013f }
            if (r5 == 0) goto L_0x011f
            if (r20 == 0) goto L_0x00d2
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f273816l     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f247005q     // Catch:{ all -> 0x013f }
            boolean r2 = r2.mo79746e(r5)     // Catch:{ all -> 0x013f }
            if (r2 == 0) goto L_0x00d2
            com.google.android.apps.gsa.sidekick.main.f.r r2 = r1.f273827w     // Catch:{ all -> 0x013f }
            boolean r2 = r2.mo85710b()     // Catch:{ all -> 0x013f }
            if (r2 != 0) goto L_0x00d2
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.entry.bb r2 = r1.f273823s     // Catch:{ all -> 0x013f }
            r2.mo85628n()     // Catch:{ all -> 0x013f }
            goto L_0x013a
        L_0x00d2:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.sidekick.main.entry.ay r2 = r1.f273822r     // Catch:{ all -> 0x013f }
            com.google.ai.b.xb r5 = com.google.p375ai.p378b.C8142xb.UNKNOWN_SURFACE     // Catch:{ all -> 0x013f }
            com.google.common.util.concurrent.cx r2 = r2.mo85614c(r13, r5)     // Catch:{ all -> 0x013f }
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92910s(r2)     // Catch:{ all -> 0x013f }
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2     // Catch:{ all -> 0x013f }
            boolean r5 = r2.mo56113h()     // Catch:{ all -> 0x013f }
            if (r5 == 0) goto L_0x013a
            com.google.android.apps.gsa.staticplugins.co.a.ct r5 = new com.google.android.apps.gsa.staticplugins.co.a.ct     // Catch:{ all -> 0x013f }
            r5.<init>()     // Catch:{ all -> 0x013f }
            r5.mo86660l(r4)     // Catch:{ all -> 0x013f }
            java.util.List r4 = r5.f273981a     // Catch:{ all -> 0x013f }
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89842j(r4)     // Catch:{ all -> 0x013f }
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x013f }
            if (r5 != 0) goto L_0x013a
            com.google.android.apps.gsa.sidekick.main.entry.bb r5 = r1.f273823s     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.staticplugins.co.a.av r6 = new com.google.android.apps.gsa.staticplugins.co.a.av     // Catch:{ all -> 0x013f }
            r6.<init>(r4)     // Catch:{ all -> 0x013f }
            java.lang.Object r4 = r2.mo56107c()     // Catch:{ all -> 0x013f }
            com.google.ai.b.ii r4 = (com.google.p375ai.p378b.C7744ii) r4     // Catch:{ all -> 0x013f }
            com.google.ai.b.ii r4 = r6.mo86653j(r4)     // Catch:{ all -> 0x013f }
            r5.mo85635u(r4)     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.staticplugins.co.a.at r4 = new com.google.android.apps.gsa.staticplugins.co.a.at     // Catch:{ all -> 0x013f }
            r4.<init>(r3)     // Catch:{ all -> 0x013f }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x013f }
            com.google.ai.b.ii r2 = (com.google.p375ai.p378b.C7744ii) r2     // Catch:{ all -> 0x013f }
            r4.mo86660l(r2)     // Catch:{ all -> 0x013f }
            goto L_0x013a
        L_0x011f:
            com.google.android.apps.gsa.sidekick.main.entry.bg r5 = r1.f273826v     // Catch:{ all -> 0x013f }
            java.lang.String r6 = com.google.android.apps.gsa.sidekick.shared.util.C91955af.m150906c(r4)     // Catch:{ all -> 0x013f }
            com.google.ai.b.xb r7 = com.google.p375ai.p378b.C8142xb.UNKNOWN_SURFACE     // Catch:{ all -> 0x013f }
            r5.mo85649i(r6, r7)     // Catch:{ all -> 0x013f }
            boolean r5 = r2.f255902c     // Catch:{ all -> 0x013f }
            if (r5 != 0) goto L_0x013a
            boolean r2 = r2.f255903d     // Catch:{ all -> 0x013f }
            if (r2 == 0) goto L_0x013a
            com.google.android.apps.gsa.staticplugins.co.a.at r2 = new com.google.android.apps.gsa.staticplugins.co.a.at     // Catch:{ all -> 0x013f }
            r2.<init>(r3)     // Catch:{ all -> 0x013f }
            r2.mo86660l(r4)     // Catch:{ all -> 0x013f }
        L_0x013a:
            monitor-exit(r12)     // Catch:{ all -> 0x013f }
            r14.mo90926u(r0)
            return
        L_0x013f:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x013f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98064as.mo90928w(com.google.ai.b.hn, com.google.android.apps.gsa.sidekick.shared.m.b, android.location.Location, java.lang.String, com.google.android.apps.gsa.sidekick.main.entry.al, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r15v17, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90929x(com.google.p4283bv.p4354e.C57524i r13, com.google.android.apps.gsa.sidekick.main.entry.C91307al r14, com.google.common.p4552o.p4566l.C60220t r15) {
        /*
            r12 = this;
            com.google.android.apps.gsa.shared.util.debug.a.b.g r0 = r12.f273820p
            java.lang.String r1 = "updateFromNextPageResponse"
            com.google.android.apps.gsa.shared.util.debug.a.b.e r2 = com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e.f254198a
            r0.mo85270f(r1, r2)
            com.google.protobuf.cq r0 = r13.f153655b
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0025
            com.google.common.f.e r0 = f273803a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "EntryProvider"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "No next page response entries"
            r2 = 30534(0x7746, float:4.2787E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0025:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.cq r0 = r13.f153655b
            r0.size()
            com.google.ai.b.ii r0 = com.google.p375ai.p378b.C7744ii.f27054p
            java.lang.Object r1 = r12.f273819o
            monitor-enter(r1)
            com.google.android.apps.gsa.search.core.i.t r2 = r12.f273816l     // Catch:{ all -> 0x0225 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246923S     // Catch:{ all -> 0x0225 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x0225 }
            r3 = 0
            if (r2 == 0) goto L_0x0051
            com.google.android.apps.gsa.sidekick.main.entry.ay r2 = r12.f273822r     // Catch:{ all -> 0x0225 }
            com.google.ai.b.xb r4 = com.google.p375ai.p378b.C8142xb.UNKNOWN_SURFACE     // Catch:{ all -> 0x0225 }
            com.google.common.util.concurrent.cx r2 = r2.mo85614c(r3, r4)     // Catch:{ all -> 0x0225 }
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92910s(r2)     // Catch:{ all -> 0x0225 }
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2     // Catch:{ all -> 0x0225 }
            java.lang.Object r2 = r2.mo56111f()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ii r2 = (com.google.p375ai.p378b.C7744ii) r2     // Catch:{ all -> 0x0225 }
            goto L_0x0063
        L_0x0051:
            com.google.android.apps.gsa.sidekick.main.entry.ay r2 = r12.f273822r     // Catch:{ all -> 0x0225 }
            com.google.common.util.concurrent.cx r2 = r2.mo85612a()     // Catch:{ all -> 0x0225 }
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92910s(r2)     // Catch:{ all -> 0x0225 }
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2     // Catch:{ all -> 0x0225 }
            java.lang.Object r2 = r2.mo56111f()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ii r2 = (com.google.p375ai.p378b.C7744ii) r2     // Catch:{ all -> 0x0225 }
        L_0x0063:
            r4 = 1
            if (r2 == 0) goto L_0x01c0
            com.google.android.apps.gsa.sidekick.main.entry.bi r0 = new com.google.android.apps.gsa.sidekick.main.entry.bi     // Catch:{ all -> 0x0225 }
            r0.<init>(r15)     // Catch:{ all -> 0x0225 }
            com.google.protobuf.cq r15 = r13.f153655b     // Catch:{ all -> 0x0225 }
            com.google.android.apps.gsa.sidekick.shared.util.ac r5 = new com.google.android.apps.gsa.sidekick.shared.util.ac     // Catch:{ all -> 0x0225 }
            r5.<init>(r0)     // Catch:{ all -> 0x0225 }
            java.util.List r15 = com.google.common.p4522b.C58597ky.m90217h(r15, r5)     // Catch:{ all -> 0x0225 }
            com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89842j(r15)     // Catch:{ all -> 0x0225 }
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.hr r5 = r2.f27057b     // Catch:{ all -> 0x0225 }
            if (r5 != 0) goto L_0x0084
            com.google.ai.b.hr r5 = com.google.p375ai.p378b.C7726hr.f27008i     // Catch:{ all -> 0x0225 }
        L_0x0084:
            com.google.protobuf.cq r5 = r5.f27012c     // Catch:{ all -> 0x0225 }
            r0.mo55396h(r5)     // Catch:{ all -> 0x0225 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x0225 }
        L_0x008d:
            boolean r5 = r15.hasNext()     // Catch:{ all -> 0x0225 }
            if (r5 == 0) goto L_0x010d
            java.lang.Object r5 = r15.next()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.hr r5 = (com.google.p375ai.p378b.C7726hr) r5     // Catch:{ all -> 0x0225 }
            int r6 = r5.f27010a     // Catch:{ all -> 0x0225 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00f0
            com.google.ai.b.hj r6 = r5.f27016g     // Catch:{ all -> 0x0225 }
            if (r6 != 0) goto L_0x00a5
            com.google.ai.b.hj r6 = com.google.p375ai.p378b.C7718hj.f26927af     // Catch:{ all -> 0x0225 }
        L_0x00a5:
            r0.mo55395g(r5)     // Catch:{ all -> 0x0225 }
            r14.mo85601b(r6)     // Catch:{ all -> 0x0225 }
            com.google.android.apps.gsa.shared.util.debug.a.b.g r7 = r12.f273830z     // Catch:{ all -> 0x0225 }
            java.lang.String r8 = "Adding node"
            com.google.protobuf.bt r9 = com.google.android.apps.p489g.C9293k.f32260e     // Catch:{ all -> 0x0225 }
            com.google.android.apps.g.k r10 = com.google.android.apps.p489g.C9293k.f32259d     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x0225 }
            com.google.android.apps.g.j r10 = (com.google.android.apps.p489g.C9292j) r10     // Catch:{ all -> 0x0225 }
            com.google.ai.b.fo r6 = r6.f26968i     // Catch:{ all -> 0x0225 }
            if (r6 != 0) goto L_0x00bf
            com.google.ai.b.fo r6 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ all -> 0x0225 }
        L_0x00bf:
            r10.copyOnWrite()     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ all -> 0x0225 }
            com.google.android.apps.g.k r11 = (com.google.android.apps.p489g.C9293k) r11     // Catch:{ all -> 0x0225 }
            r6.getClass()     // Catch:{ all -> 0x0225 }
            r11.f32263b = r6     // Catch:{ all -> 0x0225 }
            int r6 = r11.f32262a     // Catch:{ all -> 0x0225 }
            r6 = r6 | r4
            r11.f32262a = r6     // Catch:{ all -> 0x0225 }
            java.lang.String r5 = com.google.android.apps.gsa.sidekick.shared.util.C91984c.m150953b(r5)     // Catch:{ all -> 0x0225 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r6 = r10.instance     // Catch:{ all -> 0x0225 }
            com.google.android.apps.g.k r6 = (com.google.android.apps.p489g.C9293k) r6     // Catch:{ all -> 0x0225 }
            r5.getClass()     // Catch:{ all -> 0x0225 }
            int r11 = r6.f32262a     // Catch:{ all -> 0x0225 }
            r11 = r11 | 2
            r6.f32262a = r11     // Catch:{ all -> 0x0225 }
            r6.f32264c = r5     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r5 = r10.build()     // Catch:{ all -> 0x0225 }
            com.google.android.apps.g.k r5 = (com.google.android.apps.p489g.C9293k) r5     // Catch:{ all -> 0x0225 }
            r7.mo85269e(r8, r9, r5)     // Catch:{ all -> 0x0225 }
            goto L_0x008d
        L_0x00f0:
            com.google.common.f.e r5 = f273803a     // Catch:{ all -> 0x0225 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0225 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0225 }
            java.lang.String r7 = "EntryProvider"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x0225 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0225 }
            r6 = 30533(0x7745, float:4.2786E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0225 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0225 }
            java.lang.String r6 = "updateFromNextPageResponse: got card with no cluster entry"
            r5.mo56386p(r6)     // Catch:{ all -> 0x0225 }
            goto L_0x008d
        L_0x010d:
            com.google.protobuf.bn r15 = r2.toBuilder()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ht r15 = (com.google.p375ai.p378b.C7728ht) r15     // Catch:{ all -> 0x0225 }
            com.google.protobuf.cq r2 = r2.f27067m     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r5 = r15.instance     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ii r5 = (com.google.p375ai.p378b.C7744ii) r5     // Catch:{ all -> 0x0225 }
            com.google.ai.b.hr r5 = r5.f27057b     // Catch:{ all -> 0x0225 }
            if (r5 != 0) goto L_0x011f
            com.google.ai.b.hr r5 = com.google.p375ai.p378b.C7726hr.f27008i     // Catch:{ all -> 0x0225 }
        L_0x011f:
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.hq r5 = (com.google.p375ai.p378b.C7725hq) r5     // Catch:{ all -> 0x0225 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x0225 }
            com.google.ai.b.hr r6 = (com.google.p375ai.p378b.C7726hr) r6     // Catch:{ all -> 0x0225 }
            com.google.protobuf.cq r7 = com.google.p375ai.p378b.C7726hr.emptyProtobufList()     // Catch:{ all -> 0x0225 }
            r6.f27012c = r7     // Catch:{ all -> 0x0225 }
            com.google.common.b.gu r0 = r0.mo55394f()     // Catch:{ all -> 0x0225 }
            r5.mo16948a(r0)     // Catch:{ all -> 0x0225 }
            r15.copyOnWrite()     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r0 = r15.instance     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ii r0 = (com.google.p375ai.p378b.C7744ii) r0     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.hr r5 = (com.google.p375ai.p378b.C7726hr) r5     // Catch:{ all -> 0x0225 }
            r5.getClass()     // Catch:{ all -> 0x0225 }
            r0.f27057b = r5     // Catch:{ all -> 0x0225 }
            int r5 = r0.f27056a     // Catch:{ all -> 0x0225 }
            r5 = r5 | r4
            r0.f27056a = r5     // Catch:{ all -> 0x0225 }
            r15.copyOnWrite()     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r0 = r15.instance     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ii r0 = (com.google.p375ai.p378b.C7744ii) r0     // Catch:{ all -> 0x0225 }
            com.google.protobuf.cq r5 = com.google.p375ai.p378b.C7744ii.emptyProtobufList()     // Catch:{ all -> 0x0225 }
            r0.f27067m = r5     // Catch:{ all -> 0x0225 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0225 }
            r0.<init>(r2)     // Catch:{ all -> 0x0225 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0225 }
            r5.<init>()     // Catch:{ all -> 0x0225 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0225 }
        L_0x016b:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0225 }
            if (r6 == 0) goto L_0x0181
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ib r6 = (com.google.p375ai.p378b.C7737ib) r6     // Catch:{ all -> 0x0225 }
            com.google.ai.b.fo r6 = r6.f27043b     // Catch:{ all -> 0x0225 }
            if (r6 != 0) goto L_0x017d
            com.google.ai.b.fo r6 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ all -> 0x0225 }
        L_0x017d:
            r5.add(r6)     // Catch:{ all -> 0x0225 }
            goto L_0x016b
        L_0x0181:
            com.google.protobuf.cq r2 = r13.f153657d     // Catch:{ all -> 0x0225 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0225 }
        L_0x0187:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0225 }
            if (r6 == 0) goto L_0x01a3
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0225 }
            com.google.ai.b.ib r6 = (com.google.p375ai.p378b.C7737ib) r6     // Catch:{ all -> 0x0225 }
            com.google.ai.b.fo r7 = r6.f27043b     // Catch:{ all -> 0x0225 }
            if (r7 != 0) goto L_0x0199
            com.google.ai.b.fo r7 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ all -> 0x0225 }
        L_0x0199:
            boolean r7 = r5.contains(r7)     // Catch:{ all -> 0x0225 }
            if (r7 != 0) goto L_0x0187
            r0.add(r6)     // Catch:{ all -> 0x0225 }
            goto L_0x0187
        L_0x01a3:
            r15.mo16952a(r0)     // Catch:{ all -> 0x0225 }
            com.google.protobuf.bv r15 = r15.build()     // Catch:{ all -> 0x0225 }
            r0 = r15
            com.google.ai.b.ii r0 = (com.google.p375ai.p378b.C7744ii) r0     // Catch:{ all -> 0x0225 }
            com.google.android.apps.gsa.search.core.i.t r15 = r12.f273816l     // Catch:{ all -> 0x0225 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246923S     // Catch:{ all -> 0x0225 }
            boolean r15 = r15.mo79746e(r2)     // Catch:{ all -> 0x0225 }
            if (r15 == 0) goto L_0x01bd
            com.google.android.apps.gsa.sidekick.main.entry.bb r15 = r12.f273823s     // Catch:{ all -> 0x0225 }
            r15.mo85635u(r0)     // Catch:{ all -> 0x0225 }
            goto L_0x01c0
        L_0x01bd:
            r12.mo90927v(r0)     // Catch:{ all -> 0x0225 }
        L_0x01c0:
            monitor-exit(r1)     // Catch:{ all -> 0x0225 }
            int r15 = r13.f153654a
            r15 = r15 & r4
            if (r15 != 0) goto L_0x01e0
            int[] r15 = new int[r4]
            r15[r3] = r3
            com.google.android.apps.gsa.staticplugins.co.a.aj r1 = new com.google.android.apps.gsa.staticplugins.co.a.aj
            r1.<init>(r15)
            r1.mo86660l(r0)
            com.google.common.base.cr r0 = r12.f273804A
            java.lang.Object r0 = r0.mo6453a()
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0
            r15 = r15[r3]
            long r1 = (long) r15
            r0.mo104025g(r1)
        L_0x01e0:
            com.google.android.apps.gsa.sidekick.main.entry.as r15 = r12.f273806b
            com.google.common.util.concurrent.cx r14 = r15.mo85607b(r14)
            com.google.common.util.concurrent.C60856cj.m92910s(r14)
            int r14 = r13.f153654a
            r14 = r14 & r4
            r15 = 0
            if (r14 == 0) goto L_0x01f6
            com.google.bv.e.k r14 = r13.f153656c
            if (r14 != 0) goto L_0x01f7
            com.google.bv.e.k r14 = com.google.p4283bv.p4354e.C57526k.f153659b
            goto L_0x01f7
        L_0x01f6:
            r14 = r15
        L_0x01f7:
            com.google.android.apps.gsa.search.core.i.t r0 = r12.f273816l
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246923S
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0207
            com.google.android.apps.gsa.sidekick.main.entry.bb r0 = r12.f273823s
            r0.mo85636v(r14)
            goto L_0x020c
        L_0x0207:
            com.google.android.apps.gsa.sidekick.main.entry.bb r0 = r12.f273823s
            r0.mo85633s(r14)
        L_0x020c:
            com.google.android.apps.gsa.shared.util.debug.a.b.g r14 = r12.f273830z
            int r0 = r13.f153654a
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0219
            com.google.bv.e.k r15 = r13.f153656c
            if (r15 != 0) goto L_0x0219
            com.google.bv.e.k r15 = com.google.p4283bv.p4354e.C57526k.f153659b
        L_0x0219:
            java.lang.String r13 = "NextPageResponse token"
            java.lang.String r13 = com.google.android.apps.gsa.sidekick.shared.util.C91955af.m150907d(r15, r13)
            com.google.android.apps.gsa.shared.util.debug.a.b.e r15 = com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e.f254198a
            r14.mo85270f(r13, r15)
            return
        L_0x0225:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0225 }
            goto L_0x0229
        L_0x0228:
            throw r13
        L_0x0229:
            goto L_0x0228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98064as.mo90929x(com.google.bv.e.i, com.google.android.apps.gsa.sidekick.main.entry.al, com.google.common.o.l.t):void");
    }
}
