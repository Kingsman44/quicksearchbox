package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124549e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124613af;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124615ah;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124646bl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124713k;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142388dm;
import com.google.android.p10712d.C142390do;
import com.google.android.p10712d.C142407ee;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142531w;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.Function;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.cb */
/* compiled from: PG */
public final class C89490cb implements C124550f, C89492cd, C89495cg, C90991b {

    /* renamed from: a */
    public static final C59071e f242526a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.a.cb");

    /* renamed from: b */
    static final long f242527b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: c */
    public static final C89489ca f242528c = new C89489ca();

    /* renamed from: d */
    public final C21370a f242529d;

    /* renamed from: e */
    final C69464a f242530e;

    /* renamed from: f */
    private final C22871g f242531f;

    /* renamed from: g */
    private final Map f242532g = new ConcurrentHashMap();

    public C89490cb(C69464a aVar, C21370a aVar2, C91022f fVar, C22871g gVar) {
        this.f242530e = aVar;
        this.f242529d = aVar2;
        this.f242531f = gVar;
        fVar.mo85301a(this);
    }

    /* renamed from: e */
    private final C89474bm m145646e() {
        C89474bm bmVar;
        C89489ca caVar = f242528c;
        synchronized (caVar) {
            bmVar = caVar.f242522a;
            caVar.f242524c = this.f242529d.mo26870b();
            if (bmVar == null) {
                C58976aa aaVar = C58975e.f156826a;
                bmVar = (C89474bm) this.f242530e.mo17428b();
                caVar.f242522a = bmVar;
                mo83438c();
            }
        }
        return bmVar;
    }

    /* renamed from: B */
    public final void mo83360B(Set set, C89495cg cgVar) {
        C89489ca caVar = f242528c;
        synchronized (caVar) {
            if (this.f242532g.put(cgVar, set) == null) {
                if (this.f242532g.size() == 1) {
                    m145646e().mo83360B(Collections.emptySet(), this);
                }
                caVar.f242525d++;
            }
        }
    }

    /* renamed from: C */
    public final void mo83361C(String str) {
        m145646e().mo83361C(str);
    }

    /* renamed from: D */
    public final void mo83362D(String str) {
        m145646e().mo83362D(str);
    }

    /* renamed from: E */
    public final void mo83363E(String str) {
        m145646e().mo83363E(str);
    }

    /* renamed from: F */
    public final void mo83364F(String str) {
        m145646e().mo83364F(str);
    }

    /* renamed from: G */
    public final void mo83365G(String str) {
        m145646e().mo83365G(str);
    }

    /* renamed from: I */
    public final void mo83367I(String str, C124711i iVar) {
        m145646e().mo83367I(str, iVar);
    }

    /* renamed from: J */
    public final void mo83368J(String str, C124707e eVar) {
        m145646e().mo83368J(str, eVar);
    }

    /* renamed from: K */
    public final void mo83369K(String str, String str2) {
        m145646e().mo83369K(str, str2);
    }

    /* renamed from: L */
    public final void mo83370L(String str, String str2) {
        m145646e().mo83370L(str, str2);
    }

    /* renamed from: M */
    public final void mo83371M(String str, boolean z) {
        m145646e().mo83371M(str, z);
    }

    /* renamed from: N */
    public final void mo83372N(String str, C63088z zVar) {
        m145646e().mo83372N(str, zVar);
    }

    /* renamed from: O */
    public final void mo83373O(String str, boolean z) {
        m145646e().mo83373O(str, z);
    }

    /* renamed from: P */
    public final void mo83374P(String str) {
        m145646e().mo83374P(str);
    }

    /* renamed from: Q */
    public final void mo83375Q(String str) {
        m145646e().mo83375Q(str);
    }

    /* renamed from: R */
    public final void mo83376R(String str, Map map) {
        m145646e().mo83376R(str, map);
    }

    /* renamed from: S */
    public final void mo83377S(String str, boolean z) {
        m145646e().mo83377S(str, z);
    }

    /* renamed from: T */
    public final void mo83378T(String str, boolean z) {
        m145646e().mo83378T(str, z);
    }

    /* renamed from: U */
    public final void mo83379U(C89495cg cgVar) {
        C89489ca caVar = f242528c;
        synchronized (caVar) {
            if (this.f242532g.remove(cgVar) != null) {
                if (this.f242532g.isEmpty()) {
                    m145646e().mo83379U(this);
                }
                caVar.f242525d--;
                if (!caVar.mo83437a()) {
                    mo83438c();
                }
            }
        }
    }

    /* renamed from: V */
    public final void mo83380V(String str, String str2, Function function) {
        m145646e().mo83380V(str, str2, function);
    }

    /* renamed from: W */
    public final void mo83381W(String str, C142390do doVar) {
        m145646e().mo83381W(str, doVar);
    }

    /* renamed from: X */
    public final void mo83382X(String str, C124713k kVar, Integer num) {
        m145646e().mo83382X(str, kVar, num);
    }

    /* renamed from: Y */
    public final void mo83383Y(String str, String str2, String str3, C124721s sVar, C124719q qVar, String str4, Integer num, Boolean bool, Integer num2, String str5, Integer num3) {
        m145646e().mo83383Y(str, str2, str3, sVar, qVar, str4, num, bool, num2, str5, num3);
    }

    /* renamed from: Z */
    public final void mo83384Z(String str, C124715m mVar) {
        m145646e().mo83384Z(str, mVar);
    }

    /* renamed from: aa */
    public final void mo83385aa(String str, String str2) {
        m145646e().mo83385aa(str, str2);
    }

    /* renamed from: ab */
    public final void mo83386ab(String str, C142324bc bcVar) {
        m145646e().mo83386ab(str, bcVar);
    }

    /* renamed from: ac */
    public final void mo83387ac(String str, C142388dm dmVar, C142407ee eeVar) {
        m145646e().mo83387ac(str, dmVar, eeVar);
    }

    /* renamed from: ad */
    public final void mo83388ad(String str, C124613af afVar) {
        m145646e().mo83388ad(str, afVar);
    }

    /* renamed from: ae */
    public final void mo83389ae(String str, String str2, String str3, Collection collection, String str4, String str5, boolean z) {
        m145646e().mo83389ae(str, str2, str3, collection, str4, str5, z);
    }

    /* renamed from: af */
    public final void mo83390af(String str, C124615ah ahVar) {
        m145646e().mo83390af(str, ahVar);
    }

    /* renamed from: ag */
    public final void mo83391ag(String str) {
        m145646e().mo83391ag(str);
    }

    /* renamed from: ah */
    public final void mo83392ah(String str, Boolean bool) {
        m145646e().mo83392ah(str, bool);
    }

    /* renamed from: ai */
    public final void mo83393ai(String str, C142413ek ekVar) {
        m145646e().mo83393ai(str, ekVar);
    }

    /* renamed from: aj */
    public final void mo83394aj(String str, C124636bb bbVar, C124633az azVar) {
        m145646e().mo83394aj(str, bbVar, azVar);
    }

    /* renamed from: ak */
    public final void mo83395ak(String str, C124629av avVar) {
        m145646e().mo83395ak(str, avVar);
    }

    /* renamed from: al */
    public final void mo83396al(String str, Boolean bool) {
        m145646e().mo83396al(str, bool);
    }

    /* renamed from: am */
    public final void mo83397am(String str, C124646bl blVar) {
        m145646e().mo83397am(str, blVar);
    }

    /* renamed from: ao */
    public final void mo83398ao(boolean z) {
        m145646e().mo83398ao(z);
    }

    /* renamed from: ap */
    public final void mo83399ap(String str, int i, Collection collection, Boolean bool) {
        m145646e().mo83399ap(str, i, collection, bool);
    }

    /* renamed from: aq */
    public final void mo83400aq(String str, int i) {
        m145646e().mo83400aq(str, 3);
    }

    /* renamed from: b */
    public final C124548d mo83401b(String str) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            C60870cx n = m145646e().mo83408n(str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C90476a aVar = C91018d.f254254a;
            return (C124548d) n.get(40, timeUnit);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Throwable th = e;
            while ((th instanceof ExecutionException) && th.getCause() != null) {
                th = th.getCause();
            }
            if (th instanceof C124551g) {
                return null;
            }
            C59104x c = f242526a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDBWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10482)).mo56389s("Can't read device info for %s", str);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo83438c() {
        C89489ca caVar = f242528c;
        synchronized (caVar) {
            C60870cx h = this.f242531f.mo28208h("bisto-db-cleanup", f242527b, new C89487bz(this));
            C60870cx cxVar = caVar.f242523b;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            caVar.f242523b = h;
        }
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        HashSet<C89495cg> hashSet = new HashSet<>();
        for (Map.Entry entry : this.f242532g.entrySet()) {
            if (C89474bm.m145531an(set, (Set) entry.getValue())) {
                hashSet.add((C89495cg) entry.getKey());
            }
        }
        for (C89495cg fW : hashSet) {
            fW.mo17874fW(str, set, j, dVar);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        List<C90752i> l = m145646e().f242496c.mo83433l();
        fVar.mo85291r("BistoDeviceDatabase");
        for (C90752i s : l) {
            fVar.mo85292s(s);
        }
    }

    /* renamed from: i */
    public final C60870cx mo83402i() {
        return m145646e().mo83402i();
    }

    /* renamed from: iq */
    public final void mo83403iq(C89619aq aqVar, boolean z) {
        m145646e().mo83403iq(aqVar, z);
    }

    /* renamed from: j */
    public final C60870cx mo83404j() {
        return m145646e().mo83404j();
    }

    /* renamed from: k */
    public final C60870cx mo83405k(String str) {
        return m145646e().mo83406l(str, "all");
    }

    /* renamed from: l */
    public final C60870cx mo83406l(String str, String str2) {
        return m145646e().mo83406l(str, str2);
    }

    /* renamed from: m */
    public final C60870cx mo83407m(String str) {
        return m145646e().mo83407m(str);
    }

    /* renamed from: n */
    public final C60870cx mo83408n(String str) {
        return m145646e().mo83408n(str);
    }

    /* renamed from: o */
    public final C60870cx mo83409o(String str) {
        return m145646e().mo83409o(str);
    }

    /* renamed from: p */
    public final /* synthetic */ C60870cx mo83410p(String str, C124549e eVar, long j) {
        return C89494cf.m145711a(this, str, eVar, j);
    }

    /* renamed from: q */
    public final C60870cx mo83411q(String str, C124549e eVar, Duration duration) {
        C89474bm e = m145646e();
        return C89501cm.m145720a(e.f242499f, e, str, eVar, duration);
    }

    /* renamed from: r */
    public final void mo83412r(String str, C142531w wVar) {
        m145646e().mo83412r(str, wVar);
    }

    /* renamed from: u */
    public final void mo83415u(String str) {
        m145646e().mo83415u(str);
    }

    /* renamed from: v */
    public final void mo83416v() {
        m145646e().mo83416v();
    }

    /* renamed from: w */
    public final void mo83417w(String str) {
        C89474bm e = m145646e();
        C58976aa aaVar = C58975e.f156826a;
        e.mo83414t(str, false);
    }

    /* renamed from: x */
    public final void mo83418x(String str, String str2, String str3) {
        m145646e().mo83418x(str, str2, str3);
    }

    /* renamed from: y */
    public final void mo83419y(String str) {
        C89474bm e = m145646e();
        C58976aa aaVar = C58975e.f156826a;
        e.mo83414t(str, true);
    }

    /* renamed from: z */
    public final void mo83420z(String str) {
        m145646e().mo83420z(str);
    }
}
