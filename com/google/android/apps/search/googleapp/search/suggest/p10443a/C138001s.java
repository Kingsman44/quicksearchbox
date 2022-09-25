package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138009aa;
import com.google.android.apps.search.googleapp.search.suggest.C138010ab;
import com.google.android.apps.search.googleapp.search.suggest.C138014af;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138130l;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138342q;
import com.google.android.apps.search.googleapp.search.suggest.C138344s;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.apps.search.googleapp.search.suggest.C138681y;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137979e;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138043aa;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138055l;
import com.google.android.apps.search.googleapp.search.suggest.sources.C138366a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.s */
/* compiled from: PG */
public final class C138001s {

    /* renamed from: a */
    public static final C58974d f375429a = C58974d.m91136j();

    /* renamed from: b */
    public static final C58528ij f375430b = C58528ij.m90011K(C138032ax.GEMINI_APP_STRIP, C138032ax.GEMINI_LIGHT);

    /* renamed from: c */
    public final C60887da f375431c;

    /* renamed from: d */
    public final Map f375432d;

    /* renamed from: e */
    public final C137937aw f375433e;

    /* renamed from: f */
    public final C137938ax f375434f;

    /* renamed from: g */
    public final C137979e f375435g;

    /* renamed from: h */
    public final boolean f375436h;

    /* renamed from: i */
    public final boolean f375437i;

    /* renamed from: j */
    public final boolean f375438j;

    /* renamed from: k */
    public final boolean f375439k;

    /* renamed from: l */
    public final C42876ab f375440l;

    /* renamed from: m */
    public final C138043aa f375441m;

    /* renamed from: n */
    public final C137915aa f375442n;

    /* renamed from: o */
    public final boolean f375443o;

    /* renamed from: p */
    public final boolean f375444p;

    /* renamed from: q */
    public final boolean f375445q;

    /* renamed from: r */
    public final boolean f375446r;

    /* renamed from: s */
    private final C138055l f375447s;

    /* renamed from: t */
    private final Set f375448t;

    /* renamed from: u */
    private final C21370a f375449u;

    public C138001s(C138055l lVar, C60887da daVar, Set set, Map map, C137937aw awVar, C137938ax axVar, C137979e eVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C42876ab abVar, C138043aa aaVar, C21370a aVar, C137915aa aaVar2, boolean z8) {
        this.f375447s = lVar;
        this.f375431c = daVar;
        this.f375448t = set;
        this.f375432d = map;
        this.f375433e = awVar;
        this.f375434f = axVar;
        this.f375435g = eVar;
        this.f375436h = z;
        this.f375437i = z2;
        this.f375438j = z3;
        this.f375439k = z4;
        this.f375440l = abVar;
        this.f375441m = aaVar;
        this.f375449u = aVar;
        this.f375442n = aaVar2;
        this.f375443o = z8;
        this.f375444p = z5;
        this.f375445q = z6;
        this.f375446r = z7;
    }

    /* renamed from: b */
    public static void m224318b(C138133o oVar, C138130l lVar, C138009aa aaVar) {
        if (oVar.f375833j) {
            aaVar.copyOnWrite();
            C138010ab abVar = (C138010ab) aaVar.instance;
            C138010ab abVar2 = C138010ab.f375456d;
            abVar.f375460c = 3;
            abVar.f375458a |= 2;
        }
        C138681y yVar = (C138681y) C138015ag.f375479h.createBuilder();
        yVar.copyOnWrite();
        C138015ag agVar = (C138015ag) yVar.instance;
        C138010ab abVar3 = (C138010ab) aaVar.build();
        abVar3.getClass();
        agVar.f375484d = abVar3;
        agVar.f375481a |= 2;
        C138014af afVar = C138014af.HEADER;
        yVar.copyOnWrite();
        C138015ag agVar2 = (C138015ag) yVar.instance;
        agVar2.f375482b = afVar.f375478o;
        agVar2.f375481a |= 1;
        lVar.mo114162a(yVar);
    }

    /* renamed from: c */
    static /* synthetic */ void m224319c(List list, List list2, C138366a aVar, C60870cx cxVar) {
        try {
            if (!cxVar.isDone()) {
                cxVar.cancel(true);
                list.add(m224321e(aVar, 4));
                return;
            }
            list2.add((C138678v) C60856cj.m92909r(cxVar));
            list.add(m224321e(aVar, 2));
        } catch (ExecutionException e) {
            list.add(m224321e(aVar, 3));
            ((C58970a) ((C58970a) ((C58970a) f375429a.mo56226d()).mo56382g(e)).mo56372aa(41073)).mo56384n();
        } catch (CancellationException e2) {
            list.add(m224321e(aVar, 4));
            ((C58970a) ((C58970a) ((C58970a) f375429a.mo56226d()).mo56382g(e2)).mo56372aa(41074)).mo56384n();
        }
    }

    /* renamed from: d */
    public static boolean m224320d(C138030av avVar) {
        C138029au a = C138029au.m224331a(avVar.f375541d);
        if (a == null) {
            a = C138029au.QUERY;
        }
        return a == C138029au.PERSONALIZED_QUERY || new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_PERSONAL);
    }

    /* renamed from: e */
    private static C138344s m224321e(C138366a aVar, int i) {
        C138342q qVar = (C138342q) C138344s.f376381d.createBuilder();
        C138034az a = aVar.mo114248a();
        qVar.copyOnWrite();
        C138344s sVar = (C138344s) qVar.instance;
        sVar.f376384b = a.f375590i;
        sVar.f376383a |= 1;
        qVar.copyOnWrite();
        C138344s sVar2 = (C138344s) qVar.instance;
        sVar2.f376385c = i - 1;
        sVar2.f376383a |= 2;
        return (C138344s) qVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo114072a(C138133o oVar) {
        long c = this.f375449u.mo26871c();
        Map map = (Map) Collection.EL.stream(this.f375448t).filter(new C137992j(oVar)).collect(Collectors.toMap(C137993k.f375419a, new C137994l(oVar), C137995m.f375421a, C137996n.f375422a));
        Set set = (Set) Collection.EL.stream(map.entrySet()).filter(new C137997o()).map(C137998p.f375423a).collect(Collectors.toCollection(C137999q.f375424a));
        if (!map.isEmpty()) {
            this.f375447s.mo114100a();
        }
        return C47638k.m84750a(set).mo51521b(new C138000r(this, map, c, oVar), this.f375431c);
    }
}
