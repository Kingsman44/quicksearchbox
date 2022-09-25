package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.l.i;
import com.google.android.apps.gsa.assistant.shared.l.m;
import com.google.android.apps.gsa.assistant.shared.l.o;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.opa.C83584ao;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.p8839t.C118366g;
import com.google.android.apps.gsa.p8839t.C118451i;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48678am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53360l;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53371lk;
import com.google.assistant.p3994s.p3995a.C53372ll;
import com.google.assistant.p3994s.p3995a.C53387m;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p3994s.p3995a.C53460p;
import com.google.assistant.p3994s.p3995a.C53461q;
import com.google.assistant.p3994s.p3995a.C53462r;
import com.google.assistant.p3994s.p3995a.C53463s;
import com.google.assistant.p4008y.C53618b;
import com.google.assistant.p4008y.p4013d.C53657i;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63077o;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.bm */
/* compiled from: PG */
public final class C108013bm implements C83581al {

    /* renamed from: a */
    public static final C59071e f300485a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.be.bm");

    /* renamed from: b */
    public final C22871g f300486b;

    /* renamed from: c */
    public final C86124t f300487c;

    /* renamed from: d */
    public final SharedPreferences f300488d;

    /* renamed from: e */
    public final C21370a f300489e;

    /* renamed from: f */
    public final C86054o f300490f;

    /* renamed from: g */
    public final C58833ax f300491g;

    /* renamed from: h */
    public final C85664bo f300492h;

    /* renamed from: i */
    public final C108035q f300493i;

    /* renamed from: j */
    public final C108014bn f300494j;

    /* renamed from: k */
    public final C68214a f300495k;

    /* renamed from: l */
    public final C118366g f300496l;

    /* renamed from: m */
    private final C108020bt f300497m;

    /* renamed from: n */
    private final C9684l f300498n;

    /* renamed from: o */
    private final C118451i f300499o;

    public C108013bm(C22871g gVar, C86124t tVar, SharedPreferences sharedPreferences, C21370a aVar, C108020bt btVar, C86054o oVar, C58833ax axVar, C85664bo boVar, C108035q qVar, C108014bn bnVar, C68214a aVar2, C9684l lVar, C118366g gVar2, C118451i iVar) {
        this.f300486b = gVar;
        this.f300487c = tVar;
        this.f300488d = sharedPreferences;
        this.f300489e = aVar;
        this.f300497m = btVar;
        this.f300490f = oVar;
        this.f300491g = axVar;
        this.f300492h = boVar;
        this.f300493i = qVar;
        this.f300494j = bnVar;
        this.f300495k = aVar2;
        this.f300498n = lVar;
        this.f300496l = gVar2;
        this.f300499o = iVar;
    }

    /* renamed from: M */
    public static boolean m179298M(C53422nh nhVar) {
        C53370lj ljVar = nhVar.f140188e;
        if (ljVar == null) {
            ljVar = C53370lj.f140047c;
        }
        if (!ljVar.f140049a.isEmpty()) {
            return true;
        }
        C53370lj ljVar2 = nhVar.f140188e;
        if (ljVar2 == null) {
            ljVar2 = C53370lj.f140047c;
        }
        return !ljVar2.f140050b.isEmpty();
    }

    /* renamed from: N */
    private final C58833ax m179299N(String str, String str2, C53306j jVar) {
        if (this.f300487c.mo79746e(C90069du.f249716J) && (jVar.equals(C53306j.AUTO_EMBEDDED) || jVar.equals(C53306j.AUTO_PROJECTED) || jVar.equals(C53306j.MORRIS) || jVar.equals(C53306j.MORRIS_DRIVING_SCREEN))) {
            jVar = C53306j.MORRIS;
        }
        return C58833ax.m90834k(String.format("on_device_media_recommendations_%s_%s_%s_%s_%s", new Object[]{str, str2, Integer.valueOf(jVar.f139793X), this.f300490f.mo79659F(), ((bm) this.f300495k.mo27525b()).b()}).getBytes());
    }

    /* renamed from: O */
    private final C60870cx m179300O(Account account, Integer num) {
        C60870cx i = C60856cj.m92900i(false);
        if (account != null) {
            i = this.f300498n.mo17952a(account);
        }
        return this.f300486b.mo28209i(i, "#getProactiveDataSecondaryKey()", new C108008bh(this, num));
    }

    /* renamed from: A */
    public final C60870cx mo96350A() {
        return this.f300493i.mo96376e(15, 31, C58836b.f156633a, C107976ac.f300444a);
    }

    /* renamed from: B */
    public final C60870cx mo96351B() {
        return this.f300493i.mo96376e(15, 23, C58836b.f156633a, C108011bk.f300484a);
    }

    /* renamed from: C */
    public final C60870cx mo96352C(C53422nh nhVar) {
        C22871g gVar = this.f300486b;
        C53306j a = C53306j.m86809a(nhVar.f140193j);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        return gVar.mo28210j(mo76936k(a), "mergeAndPutZeroStateRawResponse", new C107982ai(this, nhVar));
    }

    /* renamed from: D */
    public final C60870cx mo96353D(C53658j jVar) {
        int i = 1;
        long longValue = jVar.f140831b == 1 ? ((Long) jVar.f140832c).longValue() : 0;
        int a = C53657i.m86881a(jVar.f140835f);
        if (a != 0) {
            i = a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(longValue);
        sb.append("_");
        sb.append(i - 1);
        return this.f300493i.mo96378g(5, 6, C58833ax.m90834k(sb.toString().getBytes(StandardCharsets.UTF_8)), jVar.toByteArray(), 0);
    }

    /* renamed from: E */
    public final C60870cx mo96354E(C53618b bVar) {
        return this.f300493i.mo96378g(7, 8, C58836b.f156633a, bVar.toByteArray(), 0);
    }

    /* renamed from: F */
    public final C60870cx mo96355F(C83741am amVar, long j, byte[] bArr, C50794cr crVar) {
        return this.f300493i.mo96379i(18, crVar.f132222T, C108014bn.f300501b, C58833ax.m90834k(bArr), amVar.toByteArray(), j);
    }

    /* renamed from: G */
    public final C60870cx mo96356G(C63088z zVar, C83683b bVar, Duration duration) {
        return this.f300486b.mo28210j(this.f300493i.mo96378g(17, 28, C58833ax.m90834k(zVar.mo59174N()), bVar.toByteArray(), duration.toMinutes()), "updateProactiveApiClientContent", C107983aj.f300452a);
    }

    /* renamed from: H */
    public final C60870cx mo96357H(byte[] bArr, byte[] bArr2, long j) {
        return this.f300486b.mo28210j(this.f300493i.mo96378g(12, 37, C58833ax.m90834k(bArr), bArr2, j), "updateSmartspaceDismissalValidityData", C108039u.f300546a);
    }

    /* renamed from: I */
    public final void mo96358I(C53422nh nhVar) {
        C53372ll llVar;
        if ((nhVar.f140184a & 16) != 0) {
            C53370lj ljVar = nhVar.f140188e;
            if (ljVar == null) {
                ljVar = C53370lj.f140047c;
            }
            for (C53366lf lfVar : ljVar.f140050b) {
                if (lfVar.f140037b == 1) {
                    long b = this.f300489e.mo26870b();
                    C53462r rVar = (C53462r) C53463s.f140317b.createBuilder();
                    C53360l lVar = (C53360l) C53387m.f140090g.createBuilder();
                    C53460p pVar = (C53460p) C53461q.f140313b.createBuilder();
                    pVar.mo53981a("what is my name");
                    pVar.mo53981a("what's my name");
                    lVar.copyOnWrite();
                    C53387m mVar = (C53387m) lVar.instance;
                    C53461q qVar = (C53461q) pVar.build();
                    qVar.getClass();
                    mVar.f140095d = qVar;
                    mVar.f140092a |= 1;
                    C53371lk lkVar = (C53371lk) C53372ll.f140052c.createBuilder();
                    if (lfVar.f140037b == 1) {
                        llVar = (C53372ll) lfVar.f140038c;
                    } else {
                        llVar = C53372ll.f140052c;
                    }
                    String str = llVar.f140055b;
                    lkVar.copyOnWrite();
                    C53372ll llVar2 = (C53372ll) lkVar.instance;
                    str.getClass();
                    llVar2.f140054a = 1 | llVar2.f140054a;
                    llVar2.f140055b = str;
                    lVar.copyOnWrite();
                    C53387m mVar2 = (C53387m) lVar.instance;
                    C53372ll llVar3 = (C53372ll) lkVar.build();
                    llVar3.getClass();
                    mVar2.f140094c = llVar3;
                    mVar2.f140093b = 5;
                    long millis = TimeUnit.HOURS.toMillis(24);
                    lVar.copyOnWrite();
                    C53387m mVar3 = (C53387m) lVar.instance;
                    mVar3.f140092a |= 8;
                    mVar3.f140096e = millis + b;
                    lVar.copyOnWrite();
                    C53387m mVar4 = (C53387m) lVar.instance;
                    mVar4.f140092a |= 16;
                    mVar4.f140097f = b;
                    rVar.copyOnWrite();
                    C53463s sVar = (C53463s) rVar.instance;
                    C53387m mVar5 = (C53387m) lVar.build();
                    mVar5.getClass();
                    C62971cq cqVar = sVar.f140319a;
                    if (!cqVar.mo58948c()) {
                        sVar.f140319a = C62942bv.mutableCopy(cqVar);
                    }
                    sVar.f140319a.add(mVar5);
                    new C90873ag(this.f300493i.mo96378g(3, 11, C58836b.f156633a, ((C53463s) rVar.build()).toByteArray(), TimeUnit.DAYS.toMinutes(30)), this.f300486b, "updateZeroStateEmbeddedAssistantLastUpdatedTimeMillis", C107979af.f300447a).mo85223a(C107980ag.f300448a);
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo96359J() {
        C90875ai.m148465b(C107988ao.f300457a, this.f300493i.mo96378g(15, 31, C58836b.f156633a, C63077o.m96099a(true).toByteArray(), TimeUnit.DAYS.toMinutes(28)), this.f300486b, "updateUpdatesCenterFirstAccess").mo85223a(C107989ap.f300458a);
    }

    /* renamed from: K */
    public final void mo96360K(C50638an anVar) {
        C90875ai.m148465b(C108043y.f300550a, this.f300493i.mo96378g(15, 23, C58836b.f156633a, anVar.toByteArray(), TimeUnit.DAYS.toMinutes(this.f300487c.mo79743a(C90014bt.f247356fc))), this.f300486b, "updateUpdatesCenterQueue").mo85223a(C108044z.f300551a);
    }

    /* renamed from: L */
    public final void mo96361L(C53422nh nhVar) {
        if ((nhVar.f140184a & 512) != 0) {
            C53306j a = C53306j.m86809a(nhVar.f140193j);
            if (a == null) {
                a = C53306j.UNKNOWNN;
            }
            new C90873ag(this.f300493i.mo96378g(3, 4, C58833ax.m90834k(a.name().getBytes()), nhVar.toByteArray(), (long) ((int) this.f300487c.mo79743a(C90014bt.f247826om))), this.f300486b, "updateZeroStateLastUpdatedTimeMillis", new C107999az(this, nhVar)).mo85223a(C108001ba.f300471a);
            return;
        }
        ((C59052c) ((C59052c) f300485a.mo56226d()).mo56372aa(27012)).mo56386p("ZeroStateResponse doesn't have ClientType, do not update cache.");
    }

    /* renamed from: a */
    public final /* synthetic */ C83584ao mo76926a() {
        return this.f300497m;
    }

    /* renamed from: b */
    public final C60870cx mo76927b() {
        return this.f300493i.mo96375d(12, C108041w.f300548a, C108022d.f300521a);
    }

    /* renamed from: c */
    public final C60870cx mo76928c() {
        return this.f300493i.mo96375d(13, C108041w.f300548a, C108022d.f300521a);
    }

    /* renamed from: d */
    public final C60870cx mo76929d(Integer num) {
        return this.f300486b.mo28210j(m179300O(this.f300490f.mo79668a(), num), "#getProactiveDataInternalList()", new C108042x(this));
    }

    /* renamed from: e */
    public final C60870cx mo76930e(String str, String str2, C53306j jVar) {
        return this.f300493i.mo96376e(18, 34, m179299N(str, str2, jVar), C108037s.f300544a);
    }

    /* renamed from: f */
    public final C60870cx mo76931f() {
        return this.f300493i.mo96376e(16, 25, C58836b.f156633a, C107996aw.f300465a);
    }

    /* renamed from: g */
    public final C60870cx mo76932g() {
        return this.f300493i.mo96376e(16, 36, C58836b.f156633a, C108003bc.f300474a);
    }

    /* renamed from: h */
    public final C60870cx mo76933h() {
        return this.f300493i.mo96376e(16, 24, C58836b.f156633a, C108009bi.f300482a);
    }

    /* renamed from: i */
    public final C60870cx mo76934i() {
        return this.f300493i.mo96376e(16, 35, C58836b.f156633a, C108040v.f300547a);
    }

    /* renamed from: j */
    public final C60870cx mo76935j() {
        return this.f300493i.mo96376e(11, 17, C58836b.f156633a, C108010bj.f300483a);
    }

    /* renamed from: k */
    public final C60870cx mo76936k(C53306j jVar) {
        jVar.name();
        return this.f300493i.mo96376e(3, 4, C58833ax.m90834k(jVar.name().getBytes()), C107977ad.f300445a);
    }

    /* renamed from: l */
    public final C60870cx mo76937l(Integer num, C118365g gVar) {
        C60870cx j = this.f300486b.mo28210j(this.f300499o.mo103704a(num.intValue()), "#getProactiveDataPreferenceStoreKey()", new C108002bb(this, this.f300489e.mo26870b()));
        return this.f300486b.mo28210j(C60856cj.m92907p(m179300O(this.f300490f.mo79668a(), num), j), "putProactiveDataList", new C108004bd(this, gVar));
    }

    /* renamed from: m */
    public final C60870cx mo76938m(String str, String str2, C53306j jVar, C123728av avVar) {
        return this.f300493i.mo96378g(18, 34, m179299N(str, str2, jVar), avVar.toByteArray(), this.f300487c.mo79743a(C90014bt.f247826om));
    }

    /* renamed from: n */
    public final C60870cx mo76939n(i iVar) {
        return this.f300493i.mo96378g(16, 25, C58836b.f156633a, iVar.toByteArray(), TimeUnit.DAYS.toMinutes(this.f300487c.mo79743a(C90014bt.f247745mu)));
    }

    /* renamed from: o */
    public final C60870cx mo76940o(C48678am amVar) {
        return this.f300493i.mo96378g(16, 36, C58836b.f156633a, amVar.toByteArray(), TimeUnit.DAYS.toMinutes(this.f300487c.mo79743a(C90063do.f249613go)));
    }

    /* renamed from: p */
    public final C60870cx mo76941p(m mVar) {
        return this.f300493i.mo96378g(16, 24, C58836b.f156633a, mVar.toByteArray(), TimeUnit.DAYS.toMinutes(this.f300487c.mo79743a(C90014bt.f247742mr)));
    }

    /* renamed from: q */
    public final C60870cx mo76942q(o oVar) {
        return this.f300493i.mo96378g(16, 35, C58836b.f156633a, oVar.toByteArray(), TimeUnit.DAYS.toMinutes(this.f300487c.mo79743a(C90063do.f249624gz)));
    }

    /* renamed from: r */
    public final void mo76943r(C123770cj cjVar) {
        this.f300493i.mo96378g(11, 17, C58836b.f156633a, cjVar.toByteArray(), (long) ((int) this.f300487c.mo79743a(C90014bt.f247828oo)));
    }

    /* renamed from: s */
    public final C58833ax mo96362s() {
        if (TextUtils.isEmpty(this.f300490f.mo79659F())) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(TextUtils.concat(new CharSequence[]{this.f300490f.mo79659F(), "_", ((bm) this.f300495k.mo27525b()).b()}).toString().getBytes());
    }

    /* renamed from: t */
    public final C60870cx mo96363t() {
        ((C59052c) ((C59052c) f300485a.mo56226d()).mo56372aa(26961)).mo56386p("#deleteSmartspaceWeatherCard()");
        return this.f300493i.mo96374c(12, 19, C58836b.f156633a);
    }

    /* renamed from: u */
    public final C60870cx mo96364u() {
        return this.f300493i.mo96375d(6, C107978ae.f300446a, C108022d.f300521a);
    }

    /* renamed from: v */
    public final C60870cx mo96365v() {
        return this.f300493i.mo96375d(30, C108036r.f300543a, C108022d.f300521a);
    }

    /* renamed from: w */
    public final C60870cx mo96366w() {
        return this.f300493i.mo96375d(28, C107994au.f300463a, C108022d.f300521a);
    }

    /* renamed from: x */
    public final C60870cx mo96367x() {
        return this.f300493i.mo96376e(4, 5, C58836b.f156633a, C108006bf.f300478a);
    }

    /* renamed from: y */
    public final C60870cx mo96368y() {
        return this.f300493i.mo96376e(9, 14, mo96362s(), C108038t.f300545a);
    }

    /* renamed from: z */
    public final C60870cx mo96369z() {
        return this.f300493i.mo96376e(7, 8, C58836b.f156633a, C107998ay.f300467a);
    }
}
