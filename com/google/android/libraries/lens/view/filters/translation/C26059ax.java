package com.google.android.libraries.lens.view.filters.translation;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.lifecycle.C2332ag;
import com.google.android.gms.languageprofile.C144445e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25985i;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26025a;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26027c;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26030f;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.lens.view.p2059ah.p2060a.C25120b;
import com.google.android.libraries.lens.view.p2067ak.C25211aq;
import com.google.android.libraries.lens.view.p2067ak.C25218ax;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25259ck;
import com.google.android.libraries.lens.view.p2067ak.C25262cn;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.p2093d.C25757f;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2093d.C25764m;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27978a;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27981d;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.android.libraries.lens.view.utils.C28133v;
import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4707j.C62470ct;
import com.google.lens.p4707j.C62471cu;
import com.google.lens.p4711m.C62632i;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56258bl;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56276cc;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56299cz;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ax */
/* compiled from: PG */
public final class C26059ax implements C25985i {

    /* renamed from: O */
    private static final Locale f70783O = Locale.ENGLISH;

    /* renamed from: a */
    public static final Locale f70784a = new Locale("auto");

    /* renamed from: b */
    public static final C58528ij f70785b = C58528ij.m90013M(C25327c.DOWNLOADED, C25327c.QUEUED, C25327c.DOWNLOADING, C25327c.BACKGROUND_QUEUED);

    /* renamed from: c */
    public static final C58974d f70786c = C58974d.m91135i("TranslationController");

    /* renamed from: A */
    public final C25764m f70787A = new C25764m();

    /* renamed from: B */
    public final C25764m f70788B = new C25764m();

    /* renamed from: C */
    public final C25764m f70789C = new C25764m();

    /* renamed from: D */
    public final C25764m f70790D = new C25764m();

    /* renamed from: E */
    public C58833ax f70791E;

    /* renamed from: F */
    public C58833ax f70792F;

    /* renamed from: G */
    public boolean f70793G;

    /* renamed from: H */
    public boolean f70794H;

    /* renamed from: I */
    public boolean f70795I;

    /* renamed from: J */
    public boolean f70796J;

    /* renamed from: K */
    public boolean f70797K;

    /* renamed from: L */
    public boolean f70798L;

    /* renamed from: M */
    public C58833ax f70799M;

    /* renamed from: N */
    public int f70800N;

    /* renamed from: P */
    private final C26217r f70801P;

    /* renamed from: Q */
    private final LensConnectivityManager f70802Q;

    /* renamed from: R */
    private final C58528ij f70803R;

    /* renamed from: S */
    private final C26056au f70804S;

    /* renamed from: T */
    private final C60888db f70805T;

    /* renamed from: U */
    private final C26058aw f70806U;

    /* renamed from: V */
    private final C25989d f70807V;

    /* renamed from: W */
    private final boolean f70808W;

    /* renamed from: X */
    private final boolean f70809X;

    /* renamed from: Y */
    private final long f70810Y;

    /* renamed from: Z */
    private final C26034j f70811Z;

    /* renamed from: aa */
    private boolean f70812aa;

    /* renamed from: ab */
    private final C26027c f70813ab;

    /* renamed from: d */
    public final Context f70814d;

    /* renamed from: e */
    public final Locale f70815e;

    /* renamed from: f */
    public final C25225bd f70816f;

    /* renamed from: g */
    public final C60887da f70817g;

    /* renamed from: h */
    public final C60888db f70818h;

    /* renamed from: i */
    public final C27981d f70819i;

    /* renamed from: j */
    public final C58833ax f70820j;

    /* renamed from: k */
    public final C27232l f70821k;

    /* renamed from: l */
    public final C37215b f70822l;

    /* renamed from: m */
    public final boolean f70823m;

    /* renamed from: n */
    public final boolean f70824n;

    /* renamed from: o */
    public final boolean f70825o;

    /* renamed from: p */
    public final C25758g f70826p;

    /* renamed from: q */
    public final C25758g f70827q;

    /* renamed from: r */
    public final C25758g f70828r = new C25758g(C58485gu.m89845m());

    /* renamed from: s */
    public final C25758g f70829s = new C25758g(C26129l.m48226e().mo31270a());

    /* renamed from: t */
    public final C2332ag f70830t = new C2332ag();

    /* renamed from: u */
    public final C2332ag f70831u = new C2332ag(C58729pv.f156485a);

    /* renamed from: v */
    public final C25764m f70832v = new C25764m();

    /* renamed from: w */
    public final C25764m f70833w = new C25764m();

    /* renamed from: x */
    public final C25764m f70834x = new C25764m();

    /* renamed from: y */
    public final C25764m f70835y = new C25764m();

    /* renamed from: z */
    public final C25757f f70836z = new C25757f();

    public C26059ax(Context context, C26030f fVar, C60887da daVar, C60888db dbVar, C60888db dbVar2, LensConnectivityManager lensConnectivityManager, C27232l lVar, C25225bd bdVar, C26217r rVar, C27981d dVar, C58833ax axVar, C26034j jVar, C26027c cVar, C25989d dVar2, C37215b bVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j) {
        Locale locale;
        C27981d dVar3 = dVar;
        boolean z7 = z;
        C26056au auVar = new C26056au(this);
        this.f70804S = auVar;
        C26058aw awVar = new C26058aw(this);
        this.f70806U = awVar;
        Locale locale2 = f70784a;
        this.f70827q = new C25758g(locale2);
        C58836b bVar2 = C58836b.f156633a;
        this.f70791E = bVar2;
        this.f70792F = bVar2;
        this.f70797K = false;
        this.f70812aa = false;
        this.f70798L = false;
        this.f70799M = bVar2;
        this.f70814d = context;
        this.f70802Q = lensConnectivityManager;
        this.f70816f = bdVar;
        this.f70821k = lVar;
        this.f70801P = rVar;
        C58528ij F = C58528ij.m90006F(fVar.mo31238a());
        this.f70803R = F;
        this.f70807V = dVar2;
        this.f70822l = bVar;
        Locale f = C28122k.m52406f(context);
        if (!z2 || !f.getLanguage().equals("en")) {
            locale = (Locale) C26217r.m48404a(f, F).mo56109e(f70783O);
        } else {
            locale = Locale.forLanguageTag("hi");
        }
        this.f70815e = locale;
        this.f70817g = daVar;
        this.f70805T = dbVar;
        this.f70818h = dbVar2;
        this.f70819i = dVar3;
        this.f70813ab = cVar;
        this.f70820j = axVar;
        this.f70811Z = jVar;
        this.f70823m = z7;
        this.f70808W = z3;
        this.f70824n = z4;
        this.f70825o = z5;
        this.f70809X = z6;
        this.f70810Y = j;
        dVar3.mo33439l(auVar);
        this.f70826p = new C25758g(new C26124g(locale2, locale, false));
        if (z7 && axVar.mo56113h()) {
            ((C58970a) ((C58970a) f70786c.mo56224b()).mo56372aa(49386)).mo56386p("add Bluechip settings sync listener");
            ((C25120b) axVar.mo56107c()).mo30269a(awVar);
        }
    }

    /* renamed from: A */
    private static Locale m48089A(Locale locale, C58833ax axVar) {
        Locale locale2 = f70784a;
        return locale.equals(locale2) ? (Locale) axVar.mo56109e(locale2) : locale;
    }

    /* renamed from: b */
    public static C58495hd m48090b(C58495hd hdVar) {
        if (!hdVar.containsKey(Locale.CHINESE)) {
            return hdVar;
        }
        Object obj = hdVar.get(Locale.CHINESE);
        HashMap hashMap = new HashMap(hdVar);
        hashMap.remove(Locale.CHINESE);
        hashMap.put(Locale.SIMPLIFIED_CHINESE, obj);
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: y */
    private final C60870cx m48091y() {
        C26037ab abVar = C26037ab.f70757a;
        return C60856cj.m92904m(C47810es.m84978r(abVar), this.f70817g);
    }

    /* renamed from: z */
    private final C60870cx m48092z(Locale locale) {
        return C60856cj.m92900i(new C27978a(locale, this.f70811Z.mo31239a(C28136y.m52430a(locale))));
    }

    /* renamed from: a */
    public final C56278ce mo31042a() {
        mo31256k();
        C26116cz czVar = (C26116cz) this.f70826p.mo3842a();
        czVar.getClass();
        String b = C28136y.m52431b(czVar.mo31306a());
        String b2 = C28136y.m52431b(czVar.mo31307b());
        C56258bl blVar = (C56258bl) C56278ce.f149986e.createBuilder();
        C56306df dfVar = C56306df.TRANSLATE;
        blVar.copyOnWrite();
        C56278ce ceVar = (C56278ce) blVar.instance;
        ceVar.f149991d = dfVar.f150068m;
        ceVar.f149988a |= 1;
        C56276cc ccVar = (C56276cc) C56277cd.f149981d.createBuilder();
        ccVar.copyOnWrite();
        C56277cd cdVar = (C56277cd) ccVar.instance;
        b.getClass();
        cdVar.f149983a |= 2;
        cdVar.f149985c = b;
        ccVar.copyOnWrite();
        C56277cd cdVar2 = (C56277cd) ccVar.instance;
        b2.getClass();
        cdVar2.f149983a |= 1;
        cdVar2.f149984b = b2;
        blVar.copyOnWrite();
        C56278ce ceVar2 = (C56278ce) blVar.instance;
        C56277cd cdVar3 = (C56277cd) ccVar.build();
        cdVar3.getClass();
        ceVar2.f149990c = cdVar3;
        ceVar2.f149989b = 3;
        return (C56278ce) blVar.build();
    }

    /* renamed from: c */
    public final Locale mo31248c() {
        return ((C26116cz) this.f70826p.mo3842a()).mo31306a();
    }

    /* renamed from: d */
    public final Locale mo31249d() {
        return ((C26116cz) this.f70826p.mo3842a()).mo31307b();
    }

    /* renamed from: e */
    public final void mo31250e(Locale locale) {
        if (locale != null && !locale.equals(f70784a)) {
            if (locale.equals(Locale.CHINESE)) {
                mo31250e(Locale.TRADITIONAL_CHINESE);
                mo31250e(Locale.SIMPLIFIED_CHINESE);
                return;
            }
            C58485gu guVar = (C58485gu) this.f70828r.mo3842a();
            if (!guVar.contains(locale)) {
                C58480gp e = C58485gu.m89837e();
                e.mo55395g(locale);
                if (guVar.size() < 5) {
                    e.mo55396h(guVar);
                } else {
                    e.mo55396h(C58557jl.m90124e(guVar, new C26040ae((Locale) Collection.EL.stream(guVar.mo55401lD()).filter(new C26039ad(this)).findFirst().get())));
                }
                C25758g gVar = this.f70828r;
                C58485gu f = e.mo55394f();
                f.getClass();
                gVar.mo5708l(f);
            }
        }
    }

    /* renamed from: f */
    public final void mo31251f(Locale locale, boolean z) {
        if (!z || this.f70819i.mo33436i(locale) != C25327c.DOWNLOADED) {
            this.f70819i.mo33441n(C28136y.m52434e(locale));
        } else {
            mo31252g(locale);
        }
    }

    /* renamed from: g */
    public final void mo31252g(Locale locale) {
        this.f70819i.mo33442o(C28136y.m52434e(locale));
    }

    /* renamed from: h */
    public final void mo31253h() {
        this.f70793G = false;
        mo31254i();
    }

    /* renamed from: i */
    public final void mo31254i() {
        this.f70816f.f68662a.mo30363c(new C25211aq());
    }

    /* renamed from: j */
    public final void mo31255j(C58485gu guVar, boolean z) {
        String str;
        NetworkCapabilities networkCapabilities;
        if (!guVar.isEmpty()) {
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                Locale e = C28136y.m52434e((Locale) guVar.get(i2));
                if (z) {
                    this.f70819i.mo33443p(e);
                } else {
                    this.f70819i.mo33440m(e);
                }
            }
            mo31253h();
            if (!mo31264s()) {
                Stream stream = Collection.EL.stream(guVar);
                C26217r rVar = this.f70801P;
                Objects.requireNonNull(rVar);
                String str2 = (String) stream.map(new C26230x(rVar)).sorted().collect(Collectors.joining(", "));
                int i3 = 118316;
                if (!z) {
                    Object systemService = this.f70814d.getSystemService("connectivity");
                    systemService.getClass();
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) {
                        str = this.f70814d.getString(R.string.lens_translate_deferred_download_wifi);
                    } else {
                        str = this.f70814d.getString(R.string.lens_translate_downloading_wifi, new Object[]{str2});
                        this.f70836z.mo5708l(new C26123f(str, i3));
                    }
                } else if (this.f70802Q.mo30907k()) {
                    str = this.f70814d.getString(R.string.lens_translate_downloading, new Object[]{str2});
                    this.f70836z.mo5708l(new C26123f(str, i3));
                } else {
                    str = this.f70814d.getString(R.string.lens_translate_deferred_download);
                }
                i3 = 118314;
                this.f70836z.mo5708l(new C26123f(str, i3));
            }
            this.f70787A.mo5708l((Object) null);
        }
    }

    /* renamed from: k */
    public final void mo31256k() {
        C60870cx cxVar;
        C62470ct ctVar;
        if (!this.f70812aa) {
            this.f70812aa = true;
            this.f70802Q.mo30904h(new C26231y(this), true);
            C25262cn h = this.f70816f.mo30352h();
            Locale c = mo31248c();
            Locale d = mo31249d();
            if ((!this.f70802Q.mo30907k() || this.f70808W) && !h.f68728b.isEmpty()) {
                c = Locale.forLanguageTag(h.f68728b);
            }
            if (this.f70821k.mo32717v().f168678a == 2) {
                C62471cu v = this.f70821k.mo32717v();
                if (v.f168678a == 2) {
                    ctVar = (C62470ct) v.f168679b;
                } else {
                    ctVar = C62470ct.f168670e;
                }
                if ((2 & ctVar.f168672a) != 0) {
                    c = Locale.forLanguageTag(ctVar.f168674c);
                }
                if ((ctVar.f168672a & 1) != 0) {
                    d = Locale.forLanguageTag(ctVar.f168673b);
                }
                mo31263r(c, d);
            } else if (!h.f68727a.isEmpty()) {
                Locale forLanguageTag = Locale.forLanguageTag(h.f68727a);
                this.f70795I = true;
                mo31263r(c, forLanguageTag);
            } else if (this.f70809X) {
                mo31263r(c, d);
                C26027c cVar = this.f70813ab;
                if (!cVar.f70744c) {
                    cxVar = C60856cj.m92900i(C58485gu.m89845m());
                } else {
                    C60870cx b = C43205e.m76192b(cVar.f70743b.mo119924a((String) null, C144445e.m234703a(1)));
                    C26025a aVar = C26025a.f70740a;
                    cxVar = C60922j.m93044g(b, C47810es.m84963c(aVar), cVar.f70742a);
                }
                C60870cx q = C60856cj.m92908q(cxVar, this.f70810Y, TimeUnit.MILLISECONDS, this.f70805T);
                C26045aj ajVar = new C26045aj(this);
                C60856cj.m92911t(q, C47810es.m84974n(ajVar), this.f70818h);
            } else {
                this.f70795I = true;
                this.f70798L = true;
                mo31263r(c, d);
            }
            if (!h.f68729c.isEmpty()) {
                C25758g gVar = this.f70828r;
                Stream map = Collection.EL.stream(h.f68729c).map(C26229w.f71275a);
                C58528ij ijVar = this.f70803R;
                Objects.requireNonNull(ijVar);
                C58485gu guVar = (C58485gu) map.filter(new C26036aa(ijVar)).collect(C58370cn.f155946a);
                guVar.getClass();
                gVar.mo5708l(guVar);
            }
            this.f70793G = true ^ this.f70816f.mo30349e().f68753a;
            this.f70794H = this.f70816f.mo30349e().f68758f;
            this.f70800N = this.f70816f.mo30349e().f68759g;
        }
    }

    /* renamed from: l */
    public final void mo31257l(Locale locale) {
        this.f70792F = C26217r.m48404a(locale, this.f70803R);
        if (mo31265t()) {
            C25758g gVar = this.f70827q;
            Locale A = m48089A(mo31248c(), this.f70792F);
            A.getClass();
            gVar.mo5708l(A);
        }
    }

    /* renamed from: m */
    public final void mo31258m(Locale locale, Locale locale2, boolean z) {
        if (!Objects.equals(mo31248c(), locale) || !Objects.equals(mo31249d(), locale2)) {
            mo31263r(locale, locale2);
            mo31250e((Locale) this.f70827q.mo3842a());
            mo31250e(mo31249d());
            C25225bd bdVar = this.f70816f;
            C25259ck ckVar = (C25259ck) C25262cn.f68725d.createBuilder();
            String b = C28136y.m52431b(mo31248c());
            ckVar.copyOnWrite();
            b.getClass();
            ((C25262cn) ckVar.instance).f68728b = b;
            String b2 = C28136y.m52431b(mo31249d());
            ckVar.copyOnWrite();
            b2.getClass();
            ((C25262cn) ckVar.instance).f68727a = b2;
            Iterable iterable = (Iterable) Collection.EL.stream((C58485gu) this.f70828r.mo3842a()).map(C26044ai.f70766a).collect(C58370cn.f155946a);
            ckVar.copyOnWrite();
            C25262cn cnVar = (C25262cn) ckVar.instance;
            C62971cq cqVar = cnVar.f68729c;
            if (!cqVar.mo58948c()) {
                cnVar.f68729c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) cnVar.f68729c);
            bdVar.f68662a.mo30363c(new C25218ax((C25262cn) ckVar.build()));
            if (z && C62632i.m94823h(this.f70821k.mo32701h()) && this.f70821k.mo32701h().mo56113h()) {
                C28133v.m52420f(this.f70814d, (String) this.f70821k.mo32701h().mo56107c(), locale, locale2);
            }
        }
    }

    /* renamed from: o */
    public final void mo31260o(Locale locale) {
        if (mo31266u(locale)) {
            Locale e = C28136y.m52434e(locale);
            C60870cx y = m48091y();
            C60870cx z = m48092z(C28136y.m52434e(e));
            C60870cx a = C47638k.m84753d(y, z).mo51520a(new C26038ac(z, y), this.f70817g);
            C26049an anVar = new C26049an(this, e);
            C60856cj.m92911t(a, C47810es.m84974n(anVar), this.f70817g);
        }
    }

    /* renamed from: p */
    public final void mo31261p(Locale locale) {
        C60870cx y = m48091y();
        C60870cx z = m48092z(C28136y.m52434e(locale));
        C60870cx a = C47638k.m84753d(y, z).mo51520a(new C26043ah(z, y), this.f70817g);
        C26050ao aoVar = new C26050ao(this);
        C60856cj.m92911t(a, C47810es.m84974n(aoVar), this.f70817g);
    }

    /* renamed from: q */
    public final void mo31262q(boolean z) {
        this.f70789C.mo5708l(Boolean.valueOf(z));
    }

    /* renamed from: r */
    public final void mo31263r(Locale locale, Locale locale2) {
        C26124g gVar = new C26124g((Locale) C26217r.m48404a(locale, this.f70803R).mo56109e(f70784a), (Locale) C26217r.m48404a(locale2, this.f70803R).mo56109e(this.f70815e), this.f70795I);
        if (!((C26116cz) this.f70826p.mo3842a()).equals(gVar)) {
            C25758g gVar2 = this.f70827q;
            Locale A = m48089A(gVar.f70990a, this.f70792F);
            A.getClass();
            gVar2.mo5708l(A);
            this.f70826p.mo5708l(gVar);
            this.f70807V.mo31206e();
        }
    }

    /* renamed from: s */
    public final boolean mo31264s() {
        Boolean bool = (Boolean) this.f70789C.mo3842a();
        return bool != null && bool.booleanValue();
    }

    /* renamed from: t */
    public final boolean mo31265t() {
        return Objects.equals(mo31248c(), f70784a);
    }

    /* renamed from: u */
    public final boolean mo31266u(Locale locale) {
        if (Objects.equals(locale, Locale.CHINESE)) {
            return mo31267v(Locale.SIMPLIFIED_CHINESE, C26041af.f70762a) || mo31267v(Locale.TRADITIONAL_CHINESE, C26041af.f70762a);
        }
        return mo31267v(locale, C26041af.f70762a);
    }

    /* renamed from: v */
    public final boolean mo31267v(Locale locale, Function function) {
        C58495hd hdVar = (C58495hd) this.f70830t.mo3842a();
        return hdVar != null && hdVar.containsKey(locale) && ((Boolean) function.apply((C25327c) hdVar.get(locale))).booleanValue();
    }

    /* renamed from: w */
    public final int mo31268w() {
        C58495hd hdVar = (C58495hd) this.f70830t.mo3842a();
        if (hdVar == null || !hdVar.containsKey(this.f70827q.mo3842a()) || !hdVar.containsKey(mo31249d())) {
            return 3;
        }
        mo31256k();
        Locale locale = (Locale) this.f70827q.mo3842a();
        locale.getClass();
        return (!mo31267v(locale, C26042ag.f70763a) || !mo31267v(mo31249d(), C26042ag.f70763a)) ? 2 : 4;
    }

    /* renamed from: x */
    public final void mo31269x(Locale locale, int i) {
        if (locale.equals(((C26129l) this.f70829s.mo3842a()).mo31287c())) {
            C25758g gVar = this.f70829s;
            C26128k a = ((C26129l) gVar.mo3842a()).mo31285a();
            a.mo31271b(i);
            C26129l a2 = a.mo31270a();
            a2.getClass();
            gVar.mo5706i(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo31259n(C58495hd hdVar, C58495hd hdVar2) {
        if (hdVar == null || hdVar2 == null) {
            ((C58970a) ((C58970a) f70786c.mo56224b()).mo56372aa(49391)).mo56386p("Either download states cannot be null.");
        } else if (hdVar.isEmpty() || hdVar2.isEmpty()) {
            ((C58970a) ((C58970a) f70786c.mo56224b()).mo56372aa(49392)).mo56386p("Either download states cannot be empty.");
        } else {
            C58800sl lA = hdVar.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                Locale locale = (Locale) entry.getKey();
                entry.getValue();
                if (!hdVar2.containsKey(locale)) {
                    ((C58970a) ((C58970a) f70786c.mo56224b()).mo56372aa(49396)).mo56389s("lensStates does not contain %s", locale);
                } else {
                    C56299cz czVar = C56299cz.UNKNOWN;
                    C25327c cVar = C25327c.UNKNOWN;
                    int ordinal = ((C25327c) entry.getValue()).ordinal();
                    if (ordinal == 4 || ordinal == 5) {
                        if (hdVar2.get(locale) == C25327c.DOWNLOADABLE) {
                            ((C58970a) ((C58970a) f70786c.mo56224b()).mo56372aa(49394)).mo56389s("Download locale: %s", locale);
                            this.f70819i.mo33443p(C28136y.m52434e(locale));
                        }
                    } else if (ordinal == 9 && hdVar2.get(locale) == C25327c.DOWNLOADED) {
                        ((C58970a) ((C58970a) f70786c.mo56224b()).mo56372aa(49395)).mo56389s("Delete locale: %s", locale);
                        this.f70819i.mo33442o(C28136y.m52434e(locale));
                    }
                }
            }
        }
    }
}
