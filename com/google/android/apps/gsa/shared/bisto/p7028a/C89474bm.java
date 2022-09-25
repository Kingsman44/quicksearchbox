package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124549e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124544b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124613af;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124615ah;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124616ai;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124617aj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124641bg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124646bl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124713k;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124716n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124717o;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142388dm;
import com.google.android.p10712d.C142390do;
import com.google.android.p10712d.C142407ee;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142531w;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bm */
/* compiled from: PG */
public final class C89474bm implements C124550f, C89492cd {

    /* renamed from: a */
    public static final C59071e f242494a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.a.bm");

    /* renamed from: b */
    public final Context f242495b;

    /* renamed from: c */
    public final C89484bw f242496c;

    /* renamed from: d */
    public final Executor f242497d;

    /* renamed from: e */
    public final Executor f242498e;

    /* renamed from: f */
    public final C60888db f242499f;

    /* renamed from: g */
    public final C21370a f242500g;

    /* renamed from: h */
    BroadcastReceiver f242501h;

    /* renamed from: i */
    private final Executor f242502i;

    /* renamed from: j */
    private final Map f242503j = new ConcurrentHashMap();

    public C89474bm(Context context, Executor executor, Executor executor2, C60888db dbVar, C21370a aVar, C89484bw bwVar) {
        this.f242495b = context;
        this.f242496c = bwVar;
        this.f242497d = executor;
        this.f242498e = executor2;
        this.f242502i = new C60904dr(executor2);
        this.f242499f = dbVar;
        this.f242500g = aVar;
        C58976aa aaVar = C58975e.f156826a;
        C89464bc bcVar = new C89464bc(this);
        this.f242501h = bcVar;
        context.registerReceiver(bcVar, new IntentFilter("BistoDeviceDatabase.device_info_changed"));
    }

    /* renamed from: an */
    static boolean m145531an(Set set, Set set2) {
        return set2.isEmpty() || !Collections.disjoint(set, set2);
    }

    /* renamed from: ar */
    private final C60870cx m145532ar(C89471bj bjVar) {
        Objects.requireNonNull(bjVar);
        return C60856cj.m92904m(new C89461b(bjVar), this.f242502i);
    }

    /* renamed from: c */
    public static C124708f m145533c(C124709g gVar) {
        if (gVar == null) {
            return (C124708f) C124709g.f344049g.createBuilder();
        }
        return (C124708f) gVar.toBuilder();
    }

    /* renamed from: d */
    public static C124716n m145534d(C124621an anVar) {
        C124623ap apVar = (C124623ap) anVar.instance;
        if ((apVar.f343771a & 64) == 0) {
            return (C124716n) C124717o.f344082m.createBuilder();
        }
        C124717o oVar = apVar.f343778h;
        if (oVar == null) {
            oVar = C124717o.f344082m;
        }
        return (C124716n) oVar.toBuilder();
    }

    /* renamed from: e */
    public static C124616ai m145535e(C124708f fVar) {
        C124709g gVar = (C124709g) fVar.instance;
        if ((gVar.f344051a & 8) == 0) {
            return (C124616ai) C124617aj.f343747l.createBuilder();
        }
        C124617aj ajVar = gVar.f344055e;
        if (ajVar == null) {
            ajVar = C124617aj.f343747l;
        }
        return (C124616ai) ajVar.toBuilder();
    }

    /* renamed from: f */
    public static C124621an m145536f(C124708f fVar) {
        C124709g gVar = (C124709g) fVar.instance;
        if ((gVar.f344051a & 1) == 0) {
            return (C124621an) C124623ap.f343769w.createBuilder();
        }
        C124623ap apVar = gVar.f344052b;
        if (apVar == null) {
            apVar = C124623ap.f343769w;
        }
        return (C124621an) apVar.toBuilder();
    }

    /* renamed from: g */
    public static C124641bg m145537g(C124708f fVar) {
        C124709g gVar = (C124709g) fVar.instance;
        if ((gVar.f344051a & 4) == 0) {
            return (C124641bg) C124642bh.f343852o.createBuilder();
        }
        C124642bh bhVar = gVar.f344054d;
        if (bhVar == null) {
            bhVar = C124642bh.f343852o;
        }
        return (C124641bg) bhVar.toBuilder();
    }

    /* renamed from: h */
    public static C124643bi m145538h(C124708f fVar) {
        C124709g gVar = (C124709g) fVar.instance;
        if ((gVar.f344051a & 2) == 0) {
            return (C124643bi) C124644bj.f343868n.createBuilder();
        }
        C124644bj bjVar = gVar.f344053c;
        if (bjVar == null) {
            bjVar = C124644bj.f343868n;
        }
        return (C124643bi) bjVar.toBuilder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo83359A(String str, C89483bv bvVar) {
        mo83366H(new C89584h(this, str, bvVar, this.f242500g.mo26870b()));
    }

    /* renamed from: B */
    public final void mo83360B(Set set, C89495cg cgVar) {
        this.f242503j.put(cgVar, set);
    }

    /* renamed from: C */
    public final void mo83361C(String str) {
        mo83366H(new C89583g(this, str));
    }

    /* renamed from: D */
    public final void mo83362D(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89439ae(this, str));
    }

    /* renamed from: E */
    public final void mo83363E(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89451aq(this, str));
    }

    /* renamed from: F */
    public final void mo83364F(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89446al(this, str));
    }

    /* renamed from: G */
    public final void mo83365G(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89467bf(this, str));
    }

    /* renamed from: H */
    public final void mo83366H(C89472bk bkVar) {
        Executor executor = this.f242502i;
        Objects.requireNonNull(bkVar);
        executor.execute(new C89586j(bkVar));
    }

    /* renamed from: I */
    public final void mo83367I(String str, C124711i iVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89598v(this, str, iVar));
    }

    /* renamed from: J */
    public final void mo83368J(String str, C124707e eVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89440af(this, str, eVar));
    }

    /* renamed from: K */
    public final void mo83369K(String str, String str2) {
        C59104x b = f242494a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
        ((C59052c) ((C59052c) b).mo56372aa(10379)).mo56389s("setCustomGestureTextQuery: %s", str2);
        mo83359A(str, new C89456av(this, str, str2));
    }

    /* renamed from: L */
    public final void mo83370L(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89599w(this, str, str2));
    }

    /* renamed from: M */
    public final void mo83371M(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89448an(this, str, z));
    }

    /* renamed from: N */
    public final void mo83372N(String str, C63088z zVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89453as(this, str, zVar));
    }

    /* renamed from: O */
    public final void mo83373O(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89462ba(this, str, z));
    }

    /* renamed from: P */
    public final void mo83374P(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89447am(this, str));
    }

    /* renamed from: Q */
    public final void mo83375Q(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89595s(this, str));
    }

    /* renamed from: R */
    public final void mo83376R(String str, Map map) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89441ag(this, str, map));
    }

    /* renamed from: S */
    public final void mo83377S(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89452ar(this, str, z));
    }

    /* renamed from: T */
    public final void mo83378T(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89437ac(this, str, z));
    }

    /* renamed from: U */
    public final void mo83379U(C89495cg cgVar) {
        this.f242503j.remove(cgVar);
    }

    /* renamed from: V */
    public final void mo83380V(String str, String str2, Function function) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89457aw(this, str, new C58759qy(34), str2, function));
    }

    /* renamed from: W */
    public final void mo83381W(String str, C142390do doVar) {
        C59104x b = f242494a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
        ((C59052c) ((C59052c) b).mo56372aa(10392)).mo56354G("updateGesture: %s - %s", str, doVar);
        mo83359A(str, new C89460az(this, str, doVar));
    }

    /* renamed from: X */
    public final void mo83382X(String str, C124713k kVar, Integer num) {
        C58976aa aaVar = C58975e.f156826a;
        if (kVar != null || num != null) {
            mo83359A(str, new C89466be(this, str, C58528ij.m90012L(1, 16, 0), num, kVar));
        }
    }

    /* renamed from: Y */
    public final void mo83383Y(String str, String str2, String str3, C124721s sVar, C124719q qVar, String str4, Integer num, Boolean bool, Integer num2, String str5, Integer num3) {
        C58976aa aaVar = C58975e.f156826a;
        if (str2 != null || str3 != null || sVar != null || qVar != null || str4 != null || num != null || bool != null || num2 != null || str5 != null || num3 != null) {
            mo83359A(str, new C89435aa(this, str, C58528ij.m90012L(3, 11, 4), str, sVar, qVar, str4, num, bool, num2, str5, num3, str2, str3));
        }
    }

    /* renamed from: Z */
    public final void mo83384Z(String str, C124715m mVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!mVar.equals(C124715m.UNKNOWN_CONNECTIVITY_STATUS)) {
            mo83359A(str, new C89444aj(this, str, mVar));
        }
    }

    /* renamed from: aa */
    public final void mo83385aa(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89449ao(this, str, str2));
    }

    /* renamed from: ab */
    public final void mo83386ab(String str, C142324bc bcVar) {
        C59104x b = f242494a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
        ((C59052c) ((C59052c) b).mo56372aa(10400)).mo56389s("updateDCI: %s", str);
        mo83366H(new C89587k(this, str, this.f242500g.mo26870b(), bcVar));
    }

    /* renamed from: ac */
    public final void mo83387ac(String str, C142388dm dmVar, C142407ee eeVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89459ay(this, str, dmVar, eeVar));
    }

    /* renamed from: ad */
    public final void mo83388ad(String str, C124613af afVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89442ah(this, str, afVar));
    }

    /* renamed from: ae */
    public final void mo83389ae(String str, String str2, String str3, Collection collection, String str4, String str5, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        String str6 = str;
        mo83359A(str, new C89438ad(this, str, str2, str3, collection, str4, str5, z));
    }

    /* renamed from: af */
    public final void mo83390af(String str, C124615ah ahVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89445ak(this, str, ahVar));
    }

    /* renamed from: ag */
    public final void mo83391ag(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83366H(new C89488c(this, str, this.f242500g.mo26870b()));
    }

    /* renamed from: ah */
    public final void mo83392ah(String str, Boolean bool) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89601y(this, str, bool));
    }

    /* renamed from: ai */
    public final void mo83393ai(String str, C142413ek ekVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89465bd(this, str, ekVar));
    }

    /* renamed from: aj */
    public final void mo83394aj(String str, C124636bb bbVar, C124633az azVar) {
        C59104x b = f242494a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
        ((C59052c) ((C59052c) b).mo56372aa(10410)).mo56359L("updateOpaEnabledAndOobeState: %s - %s %s", str, bbVar, azVar);
        if ((bbVar != null && !bbVar.equals(C124636bb.UNKNOWN_ENABLED_STATE)) || (azVar != null && !azVar.equals(C124633az.OOBE_STATE_UNKNOWN))) {
            mo83359A(str, new C89596t(this, str, C58528ij.m90011K(5, 27), bbVar, azVar));
        }
    }

    /* renamed from: ak */
    public final void mo83395ak(String str, C124629av avVar) {
        mo83359A(str, new C89455au(this, str, C58528ij.m90011K(8, 9), avVar));
    }

    /* renamed from: al */
    public final void mo83396al(String str, Boolean bool) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89600x(this, str, bool));
    }

    /* renamed from: am */
    public final void mo83397am(String str, C124646bl blVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89443ai(this, str, blVar));
    }

    /* renamed from: ao */
    public final void mo83398ao(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A("wired", new C89454at(this, new C58759qy(33), z));
    }

    /* renamed from: ap */
    public final void mo83399ap(String str, int i, Collection collection, Boolean bool) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89436ab(this, str, i, collection, bool));
    }

    /* renamed from: aq */
    public final void mo83400aq(String str, int i) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89597u(this, str, 3));
    }

    /* renamed from: b */
    public final C124548d mo83401b(String str) {
        C124709g c = this.f242496c.mo83429c(str);
        if (c != null) {
            return new C124544b(c);
        }
        return null;
    }

    /* renamed from: i */
    public final C60870cx mo83402i() {
        C89484bw bwVar = this.f242496c;
        Objects.requireNonNull(bwVar);
        return C60922j.m93044g(m145532ar(new C89592p(bwVar)), C89593q.f242659a, C60826bg.f164896a);
    }

    /* renamed from: iq */
    public final void mo83403iq(C89619aq aqVar, boolean z) {
        for (C90752i a : this.f242496c.mo83433l()) {
            Object a2 = a.mo85092a(false);
            if (a2 != null) {
                aqVar.println(a2.toString());
            }
        }
    }

    /* renamed from: j */
    public final C60870cx mo83404j() {
        C89484bw bwVar = this.f242496c;
        Objects.requireNonNull(bwVar);
        return m145532ar(new C89592p(bwVar));
    }

    /* renamed from: k */
    public final C60870cx mo83405k(String str) {
        return mo83406l(str, "all");
    }

    /* renamed from: l */
    public final C60870cx mo83406l(String str, String str2) {
        return m145532ar(new C89588l(this, str, str2));
    }

    /* renamed from: m */
    public final C60870cx mo83407m(String str) {
        return m145532ar(new C89542e(this, str));
    }

    /* renamed from: n */
    public final C60870cx mo83408n(String str) {
        return m145532ar(new C89590n(this, str));
    }

    /* renamed from: o */
    public final C60870cx mo83409o(String str) {
        return m145532ar(new C89515d(this, str));
    }

    /* renamed from: p */
    public final /* synthetic */ C60870cx mo83410p(String str, C124549e eVar, long j) {
        return C89494cf.m145711a(this, str, eVar, j);
    }

    /* renamed from: q */
    public final C60870cx mo83411q(String str, C124549e eVar, Duration duration) {
        return C89501cm.m145720a(this.f242499f, this, str, eVar, duration);
    }

    /* renamed from: r */
    public final void mo83412r(String str, C142531w wVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89450ap(this, str, wVar));
    }

    /* renamed from: s */
    public final void mo83413s(String str, Set set, long j, C124709g gVar, boolean z) {
        if (set.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f242503j.entrySet()) {
            if (m145531an(set, (Set) entry.getValue())) {
                hashSet.add((C89495cg) entry.getKey());
            }
        }
        hashSet.size();
        set.size();
        if (!hashSet.isEmpty()) {
            this.f242497d.execute(new C89585i(gVar, hashSet, str, set, j));
        }
        if (z) {
            Intent intent = new Intent("BistoDeviceDatabase.device_info_changed");
            intent.setPackage(this.f242495b.getPackageName());
            intent.putExtra("BistoDeviceDatabase.instance", System.identityHashCode(this));
            intent.putExtra("key_device_id", str);
            intent.putExtra("BistoDeviceDatabase.timestamp", j);
            int[] iArr = new int[set.size()];
            Iterator it = set.iterator();
            int i = 0;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num != null) {
                    iArr[i] = num.intValue();
                    i++;
                }
            }
            intent.putExtra("BistoDeviceDatabase.what", iArr);
            this.f242495b.sendBroadcast(intent);
        }
    }

    /* renamed from: t */
    public final void mo83414t(String str, boolean z) {
        mo83359A(str, new C89594r(this, str, z));
    }

    /* renamed from: u */
    public final void mo83415u(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89470bi(this, str));
    }

    /* renamed from: v */
    public final void mo83416v() {
        C58976aa aaVar = C58975e.f156826a;
        C60856cj.m92911t(mo83402i(), new C89469bh(this), this.f242498e);
    }

    /* renamed from: w */
    public final void mo83417w(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83414t(str, false);
    }

    /* renamed from: x */
    public final void mo83418x(String str, String str2, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89458ax(this, str, str2, str3));
    }

    /* renamed from: y */
    public final void mo83419y(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83414t(str, true);
    }

    /* renamed from: z */
    public final void mo83420z(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo83359A(str, new C89468bg(this, str));
    }
}
