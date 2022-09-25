package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137032a;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137033b;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137034c;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137035d;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137037f;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137043l;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46786dc;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4880aq.C63718ag;
import com.google.protos.p4880aq.C63721aj;
import com.google.protos.p4880aq.C63728aq;
import com.google.protos.p4880aq.C63734aw;
import com.google.protos.p4880aq.C63744bf;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63908av;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bm */
/* compiled from: PG */
public final class C136958bm implements C136969bx {

    /* renamed from: a */
    static final C46690ah f372733a = new C46885y("PromoManagerMainAppDataSourceKey");

    /* renamed from: b */
    static final C46690ah f372734b = new C46885y("PromoManagerMinusOneDataSourceKey");

    /* renamed from: c */
    static final C46690ah f372735c = new C46885y("PromoManagerGoogleAppBrowserDataSourceKey");

    /* renamed from: d */
    static final C46690ah f372736d = new C46885y("PromoManagerDiscoverTooltipDataSourceKey");

    /* renamed from: e */
    static final C46690ah f372737e = new C46885y("PromoManagerEligibleDiscoverTooltipsDataSourceKey");

    /* renamed from: f */
    static final C46690ah f372738f = new C46885y("PromoManagerAccountMenuDataSourceKey");

    /* renamed from: g */
    public static final C58495hd f372739g;

    /* renamed from: s */
    private static final C58974d f372740s = C58974d.m91135i("PromoManagerDataService");

    /* renamed from: t */
    private static final Duration f372741t = Duration.ofDays(7);

    /* renamed from: u */
    private static final Duration f372742u = Duration.ofDays(28);

    /* renamed from: v */
    private static final Duration f372743v = Duration.ofDays(92);

    /* renamed from: w */
    private static final Duration f372744w = Duration.ofDays(365);

    /* renamed from: x */
    private static final C58495hd f372745x;

    /* renamed from: A */
    private final C42876ab f372746A;

    /* renamed from: B */
    private final Set f372747B;

    /* renamed from: h */
    public final Executor f372748h;

    /* renamed from: i */
    public final C21370a f372749i;

    /* renamed from: j */
    public final C63721aj f372750j;

    /* renamed from: k */
    public final C63728aq f372751k;

    /* renamed from: l */
    public final boolean f372752l;

    /* renamed from: m */
    public final boolean f372753m;

    /* renamed from: n */
    public final C136931am f372754n;

    /* renamed from: o */
    public final C37215b f372755o;

    /* renamed from: p */
    public final C137029x f372756p;

    /* renamed from: q */
    public C60870cx f372757q = C60856cj.m92900i(C137007dh.f372869h);

    /* renamed from: r */
    public C60870cx f372758r = C60856cj.m92900i(C58485gu.m89845m());

    /* renamed from: y */
    private final C46723bg f372759y;

    /* renamed from: z */
    private final C46778cv f372760z;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C139779t.HOME_SCREEN, C63926bm.HOME);
        gzVar.mo55429h(C139779t.SEARCH, C63926bm.SEARCH);
        gzVar.mo55429h(C139779t.COLLECTIONS, C63926bm.COLLECTIONS);
        gzVar.mo55429h(C139779t.TABS, C63926bm.TABS);
        gzVar.mo55429h(C139779t.GOOGLE_APP_BROWSER, C63926bm.GOOGLE_APP_BROWSER);
        f372739g = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C63934bu.TARGET_UNSPECIFIED, C63744bf.TARGET_UNKNOWN);
        gzVar2.mo55429h(C63934bu.LENS_ICON, C63744bf.LENS_ICON);
        gzVar2.mo55429h(C63934bu.VOICE_SEARCH_ICON, C63744bf.VOICE_SEARCH_ICON);
        gzVar2.mo55429h(C63934bu.SEARCH_BOTTOMBAR_ICON, C63744bf.SEARCH_BOTTOMBAR_ICON);
        f372745x = gzVar2.mo55427f(false);
    }

    public C136958bm(C46723bg bgVar, C46778cv cvVar, Executor executor, C21370a aVar, C63721aj ajVar, C63728aq aqVar, boolean z, boolean z2, C42876ab abVar, C136931am amVar, C137029x xVar, C37215b bVar) {
        this.f372759y = bgVar;
        this.f372760z = cvVar;
        this.f372748h = executor;
        this.f372749i = aVar;
        this.f372750j = ajVar;
        this.f372751k = aqVar;
        this.f372753m = z;
        this.f372752l = z2;
        this.f372746A = abVar;
        this.f372754n = amVar;
        this.f372756p = xVar;
        this.f372755o = bVar;
        HashSet hashSet = new HashSet();
        this.f372747B = hashSet;
        hashSet.add(f372733a);
        hashSet.add(f372734b);
        hashSet.add(f372735c);
        hashSet.add(f372738f);
        hashSet.add(f372736d);
        hashSet.add(f372737e);
    }

    /* renamed from: A */
    private final void m222601A(C137009dj djVar) {
        C58970a aVar = (C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40855);
        C63926bm a = C63926bm.m96318a(djVar.f372882b);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        aVar.mo56389s("showPromo[%s]", a.name());
        C60870cx d = this.f372746A.mo46042d();
        C136949bd bdVar = new C136949bd(this, djVar);
        this.f372757q = C60922j.m93045h(d, C47810es.m84966f(bdVar), this.f372748h);
        C60870cx d2 = this.f372746A.mo46042d();
        C136950be beVar = new C136950be(this, djVar);
        this.f372758r = C60922j.m93045h(d2, C47810es.m84966f(beVar), this.f372748h);
        C60870cx cxVar = this.f372757q;
        Object[] objArr = new Object[1];
        C63926bm a2 = C63926bm.m96318a(djVar.f372882b);
        if (a2 == null) {
            a2 = C63926bm.UNSPECIFIED;
        }
        objArr[0] = a2.name();
        C46459k.m82829b(cxVar, "Failed to showPromo[%s]", objArr);
        this.f372760z.mo50787a(C60866ct.f164955a, C46786dc.m83350a(C58528ij.m90006F(this.f372747B)));
    }

    /* renamed from: a */
    public static C137035d m222602a(C137035d dVar, Instant instant, boolean z) {
        C137032a aVar = (C137032a) C137035d.f372929f.createBuilder();
        C137034c cVar = dVar.f372932b;
        if (cVar == null) {
            cVar = C137034c.f372924d;
        }
        C137034c y = m222605y(cVar, f372741t, instant, z);
        aVar.copyOnWrite();
        C137035d dVar2 = (C137035d) aVar.instance;
        y.getClass();
        dVar2.f372932b = y;
        dVar2.f372931a |= 1;
        C137034c cVar2 = dVar.f372933c;
        if (cVar2 == null) {
            cVar2 = C137034c.f372924d;
        }
        C137034c y2 = m222605y(cVar2, f372742u, instant, z);
        aVar.copyOnWrite();
        C137035d dVar3 = (C137035d) aVar.instance;
        y2.getClass();
        dVar3.f372933c = y2;
        dVar3.f372931a |= 2;
        C137034c cVar3 = dVar.f372934d;
        if (cVar3 == null) {
            cVar3 = C137034c.f372924d;
        }
        C137034c y3 = m222605y(cVar3, f372743v, instant, z);
        aVar.copyOnWrite();
        C137035d dVar4 = (C137035d) aVar.instance;
        y3.getClass();
        dVar4.f372934d = y3;
        dVar4.f372931a |= 4;
        C137034c cVar4 = dVar.f372935e;
        if (cVar4 == null) {
            cVar4 = C137034c.f372924d;
        }
        C137034c y4 = m222605y(cVar4, f372744w, instant, z);
        aVar.copyOnWrite();
        C137035d dVar5 = (C137035d) aVar.instance;
        y4.getClass();
        dVar5.f372935e = y4;
        dVar5.f372931a |= 8;
        return (C137035d) aVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.apps.search.googleapp.promomanager.c.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.search.googleapp.promomanager.p10374c.C137043l m222603c(int r3, com.google.android.apps.search.googleapp.promomanager.p10374c.C137037f r4) {
        /*
            com.google.android.apps.search.googleapp.promomanager.c.m r0 = com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m.f372948m
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.promomanager.c.l r0 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137043l) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.googleapp.promomanager.c.m r1 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m) r1
            int r2 = r1.f372950a
            r2 = r2 | 1
            r1.f372950a = r2
            r1.f372951b = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.googleapp.promomanager.c.m r0 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m) r0
            com.google.protobuf.bv r4 = r4.instance
            com.google.android.apps.search.googleapp.promomanager.c.j r4 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j) r4
            com.google.protobuf.dn r4 = r4.f372943c
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = r4.containsKey(r3)
            if (r1 == 0) goto L_0x0038
            java.lang.Object r3 = r4.get(r3)
            r0 = r3
            com.google.android.apps.search.googleapp.promomanager.c.m r0 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m) r0
        L_0x0038:
            com.google.protobuf.bn r3 = r0.toBuilder()
            com.google.android.apps.search.googleapp.promomanager.c.l r3 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137043l) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C136958bm.m222603c(int, com.google.android.apps.search.googleapp.promomanager.c.f):com.google.android.apps.search.googleapp.promomanager.c.l");
    }

    /* renamed from: x */
    private final C137009dj m222604x(C137009dj djVar, C63926bm bmVar) {
        C137008di diVar = (C137008di) djVar.toBuilder();
        diVar.copyOnWrite();
        C137009dj djVar2 = (C137009dj) diVar.instance;
        djVar2.f372882b = bmVar.f172871h;
        djVar2.f372881a |= 1;
        C63042fg i = C62953e.m95484i(this.f372749i.mo26870b());
        diVar.copyOnWrite();
        C137009dj djVar3 = (C137009dj) diVar.instance;
        i.getClass();
        djVar3.f372883c = i;
        djVar3.f372881a |= 2;
        return (C137009dj) diVar.build();
    }

    /* renamed from: y */
    private static C137034c m222605y(C137034c cVar, Duration duration, Instant instant, boolean z) {
        C137033b bVar = (C137033b) cVar.toBuilder();
        C63042fg fgVar = cVar.f372928c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        Instant e = C62950b.m95474e(fgVar);
        if ((cVar.f372926a & 2) == 0 || instant.isAfter(e) || z) {
            C63042fg c = C62950b.m95472c(instant.plus(duration));
            bVar.copyOnWrite();
            C137034c cVar2 = (C137034c) bVar.instance;
            c.getClass();
            cVar2.f372928c = c;
            cVar2.f372926a |= 2;
            bVar.copyOnWrite();
            C137034c cVar3 = (C137034c) bVar.instance;
            cVar3.f372926a |= 1;
            cVar3.f372927b = 0;
        }
        int i = ((C137034c) bVar.instance).f372927b;
        bVar.copyOnWrite();
        C137034c cVar4 = (C137034c) bVar.instance;
        cVar4.f372926a |= 1;
        cVar4.f372927b = i + 1;
        return (C137034c) bVar.build();
    }

    /* renamed from: z */
    private final void m222606z() {
        this.f372757q = C60856cj.m92900i(C137007dh.f372869h);
        this.f372760z.mo50787a(C60866ct.f164955a, C46786dc.m83350a(C58528ij.m90006F(this.f372747B)));
    }

    /* renamed from: b */
    public final C137041j mo113446b(int i, C137037f fVar, C137043l lVar) {
        C62995dn dnVar = this.f372750j.f172283a;
        Integer valueOf = Integer.valueOf(i);
        if (dnVar.containsKey(valueOf)) {
            C63718ag agVar = ((C63734aw) dnVar.get(valueOf)).f172317c;
            if (agVar == null) {
                agVar = C63718ag.f172268k;
            }
            C137044m mVar = (C137044m) lVar.build();
            mVar.getClass();
            fVar.copyOnWrite();
            C137041j jVar = (C137041j) fVar.instance;
            C137041j jVar2 = C137041j.f372939g;
            C62995dn dnVar2 = jVar.f372943c;
            if (!dnVar2.f170058b) {
                jVar.f372943c = dnVar2.mo58980a();
            }
            jVar.f372943c.put(valueOf, mVar);
            if (Collections.unmodifiableList(((C137041j) fVar.instance).f372942b).contains(valueOf)) {
                return (C137041j) fVar.build();
            }
            int i2 = agVar.f172270a;
            boolean z = true;
            boolean z2 = (i2 & 2) != 0 && mVar.f372952c >= agVar.f172272c;
            boolean z3 = (i2 & 8) != 0 && mVar.f372956g >= agVar.f172274e;
            if ((i2 & 32) == 0 || mVar.f372958i < agVar.f172276g) {
                z = false;
            }
            if (z2 || z3 || z) {
                fVar.copyOnWrite();
                C137041j jVar3 = (C137041j) fVar.instance;
                C62961ch chVar = jVar3.f372942b;
                if (!chVar.mo58948c()) {
                    jVar3.f372942b = C62942bv.mutableCopy(chVar);
                }
                jVar3.f372942b.mo58916g(i);
            }
            return (C137041j) fVar.build();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public final C46689ag mo113447d() {
        ((C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40840)).mo56386p("getAccountMenuPromotion");
        return new C46719bc(this.f372759y, new C136934ap(this), f372738f);
    }

    /* renamed from: e */
    public final C46689ag mo113448e() {
        return new C46719bc(this.f372759y, new C136946ba(this), f372737e);
    }

    /* renamed from: f */
    public final C46689ag mo113449f() {
        ((C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40841)).mo56386p("getEmptyPromotion");
        return new C46719bc(this.f372759y, C136953bh.f372721a, f372733a);
    }

    /* renamed from: g */
    public final C46689ag mo113450g() {
        ((C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40842)).mo56386p("getGoogleAppBrowserPromotion");
        return new C46719bc(this.f372759y, new C136944az(this), f372735c);
    }

    /* renamed from: h */
    public final C46689ag mo113451h() {
        ((C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40843)).mo56386p("getMinusOnePromotion");
        return new C46719bc(this.f372759y, new C136942ax(this), f372734b);
    }

    /* renamed from: i */
    public final C46689ag mo113452i(C139779t tVar) {
        ((C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40844)).mo56389s("getPromotion[%s]", tVar.name());
        C60870cx cxVar = this.f372757q;
        C136936ar arVar = new C136936ar(tVar);
        this.f372757q = C60922j.m93044g(cxVar, C47810es.m84963c(arVar), this.f372748h);
        return new C46719bc(this.f372759y, new C136937as(this), f372733a);
    }

    /* renamed from: j */
    public final C46689ag mo113453j(C63934bu buVar, C63926bm bmVar) {
        C63744bf bfVar = (C63744bf) f372745x.getOrDefault(buVar, C63744bf.TARGET_UNKNOWN);
        ((C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40845)).mo56354G("getTooltipPromotion[%s, %s]", bfVar.name(), bfVar.name());
        C46885y yVar = new C46885y(String.format("%s_%s_%s", new Object[]{"PromoManagerToolipDataSourceKey", bmVar.name(), bfVar.name()}));
        this.f372747B.add(yVar);
        return new C46719bc(this.f372759y, new C136955bj(this, bfVar, bmVar), yVar);
    }

    /* renamed from: k */
    public final void mo113454k(C37252a aVar) {
        this.f372755o.mo19974a(aVar);
    }

    /* renamed from: l */
    public final void mo113455l(C137007dh dhVar) {
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172819b;
        C58974d dVar = f372740s;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40846)).mo56387q("#reportAccept[%d]", i);
        m222606z();
        C63909aw awVar2 = dhVar.f372875e;
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        if ((awVar2.f172818a & 1) == 0 || !this.f372750j.mo59234a(i)) {
            C58970a aVar = (C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40847);
            Integer valueOf = Integer.valueOf(i);
            C63909aw awVar3 = dhVar.f372875e;
            Integer valueOf2 = Integer.valueOf((awVar3 == null ? C63909aw.f172816e : awVar3).f172820c);
            if (awVar3 == null) {
                awVar3 = C63909aw.f172816e;
            }
            aVar.mo56360M("#reportAccept for promo with invalid identifier: [campaignId:%d, deploymentId:%d, placementId:%d, exists:%b]", valueOf, valueOf2, Integer.valueOf(awVar3.f172821d), Boolean.valueOf(this.f372750j.mo59234a(i)));
            return;
        }
        C46459k.m82829b(this.f372746A.mo46039a(new C136932an(this, i, dhVar), this.f372748h), "Failed to reportAccept[%d]", Integer.valueOf(i));
    }

    /* renamed from: m */
    public final void mo113456m(C137007dh dhVar) {
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172819b;
        C58974d dVar = f372740s;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40848)).mo56387q("#reportFailure[%d]", i);
        m222606z();
        C63909aw awVar2 = dhVar.f372875e;
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        if ((awVar2.f172818a & 1) == 0 || !this.f372750j.mo59234a(i)) {
            C58970a aVar = (C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40849);
            Integer valueOf = Integer.valueOf(i);
            C63909aw awVar3 = dhVar.f372875e;
            Integer valueOf2 = Integer.valueOf((awVar3 == null ? C63909aw.f172816e : awVar3).f172820c);
            if (awVar3 == null) {
                awVar3 = C63909aw.f172816e;
            }
            aVar.mo56360M("#reportAccept for promo with invalid identifier: [campaignId:%d, deploymentId:%d, placementId:%d, exists:%b]", valueOf, valueOf2, Integer.valueOf(awVar3.f172821d), Boolean.valueOf(this.f372750j.mo59234a(i)));
            return;
        }
        C46459k.m82829b(this.f372746A.mo46039a(new C136951bf(this, i, dhVar), this.f372748h), "Failed to reportFailure[%d]", Integer.valueOf(i));
    }

    /* renamed from: n */
    public final void mo113457n(C137007dh dhVar) {
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172819b;
        C58974d dVar = f372740s;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40850)).mo56387q("#reportIgnored[%d]", i);
        C63909aw awVar2 = dhVar.f372875e;
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        if ((awVar2.f172818a & 1) == 0 || !this.f372750j.mo59234a(i)) {
            C58970a aVar = (C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40851);
            Integer valueOf = Integer.valueOf(i);
            C63909aw awVar3 = dhVar.f372875e;
            Integer valueOf2 = Integer.valueOf((awVar3 == null ? C63909aw.f172816e : awVar3).f172820c);
            if (awVar3 == null) {
                awVar3 = C63909aw.f172816e;
            }
            aVar.mo56360M("#reportAccept for promo with invalid identifier: [campaignId:%d, deploymentId:%d, placementId:%d, exists:%b]", valueOf, valueOf2, Integer.valueOf(awVar3.f172821d), Boolean.valueOf(this.f372750j.mo59234a(i)));
            m222606z();
            return;
        }
        mo113454k(C37182a.f97898cX.mo40779c());
        m222606z();
        mo113466w(C37182a.f97899cY.mo40806d(), dhVar, C137041j.f372939g);
    }

    /* renamed from: o */
    public final void mo113458o(C137007dh dhVar) {
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172819b;
        ((C58970a) ((C58970a) f372740s.mo56224b()).mo56372aa(40852)).mo56387q("#reportImpression[%d]", i);
        if (this.f372750j.mo59234a(i)) {
            C60870cx a = this.f372746A.mo46039a(new C136948bc(this, i, dhVar), this.f372748h);
            this.f372757q = C60856cj.m92900i(C137007dh.f372869h);
            C46459k.m82829b(a, "Failed to reportImpression[%d]", Integer.valueOf(i));
        }
    }

    /* renamed from: p */
    public final void mo113459p(C137007dh dhVar) {
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172819b;
        C58974d dVar = f372740s;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(40853)).mo56387q("#reportReject[%d]", i);
        m222606z();
        C63909aw awVar2 = dhVar.f372875e;
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        if ((awVar2.f172818a & 1) == 0 || !this.f372750j.mo59234a(i)) {
            C58970a aVar = (C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(40854);
            Integer valueOf = Integer.valueOf(i);
            C63909aw awVar3 = dhVar.f372875e;
            Integer valueOf2 = Integer.valueOf((awVar3 == null ? C63909aw.f172816e : awVar3).f172820c);
            if (awVar3 == null) {
                awVar3 = C63909aw.f172816e;
            }
            aVar.mo56360M("#reportAccept for promo with invalid identifier: [campaignId:%d, deploymentId:%d, placementId:%d, exists:%b]", valueOf, valueOf2, Integer.valueOf(awVar3.f172821d), Boolean.valueOf(this.f372750j.mo59234a(i)));
            return;
        }
        C46459k.m82829b(this.f372746A.mo46039a(new C136939au(this, i, dhVar), this.f372748h), "Failed to reportReject[%d]", Integer.valueOf(i));
    }

    /* renamed from: q */
    public final void mo113460q(C137009dj djVar) {
        m222601A(m222604x(djVar, C63926bm.GOOGLE_APP_BROWSER));
    }

    /* renamed from: r */
    public final void mo113461r() {
        m222601A(m222604x(C137009dj.f372879f, C63926bm.MINUS_ONE));
    }

    /* renamed from: s */
    public final void mo113462s(C137009dj djVar) {
        m222601A(m222604x(djVar, C63926bm.SEARCH));
    }

    /* renamed from: t */
    public final void mo113463t(C139779t tVar) {
        if (tVar != C139779t.SEARCH && tVar != C139779t.GOOGLE_APP_BROWSER) {
            m222601A(m222604x(C137009dj.f372879f, (C63926bm) f372739g.getOrDefault(tVar, C63926bm.UNSPECIFIED)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.protos.aq.aw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113464u(com.google.android.apps.search.googleapp.p10527u.C139779t r7, int r8) {
        /*
            r6 = this;
            com.google.common.f.a.d r0 = f372740s
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 40856(0x9f98, float:5.7251E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = "showReactiveOverlay[%s] for tab %s"
            java.lang.String r2 = r7.name()
            r0.mo56395y(r1, r8, r2)
            com.google.protos.aq.aj r0 = r6.f372750j
            com.google.protos.aq.aw r1 = com.google.protos.p4880aq.C63734aw.f172313h
            com.google.protobuf.dn r0 = r0.f172283a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0031
            java.lang.Object r0 = r0.get(r2)
            r1 = r0
            com.google.protos.aq.aw r1 = (com.google.protos.p4880aq.C63734aw) r1
        L_0x0031:
            com.google.common.b.hd r0 = f372739g
            com.google.protos.aw.a.a.a.bm r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.UNSPECIFIED
            java.lang.Object r0 = r0.getOrDefault(r7, r2)
            com.google.protos.aw.a.a.a.bm r0 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm) r0
            com.google.android.apps.search.googleapp.promomanager.b.dj r2 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj.f372879f
            com.google.android.apps.search.googleapp.promomanager.b.dj r2 = r6.m222604x(r2, r0)
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r4 = r1.f172318d
            com.google.protobuf.ci r5 = com.google.protos.p4880aq.C63734aw.f172312e
            r3.<init>(r4, r5)
            com.google.protos.aq.ba r0 = com.google.android.apps.search.googleapp.promomanager.p10372b.C136959bn.m222628a(r0)
            boolean r0 = r3.contains(r0)
            r3 = 1
            if (r0 != 0) goto L_0x005e
            com.google.android.apps.search.googleapp.promomanager.b.dh r8 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh.f372869h
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            r6.f372757q = r8
            goto L_0x0084
        L_0x005e:
            boolean r0 = com.google.android.apps.search.googleapp.promomanager.p10372b.C136959bn.m222629b(r1, r3)
            if (r0 != 0) goto L_0x006d
            com.google.android.apps.search.googleapp.promomanager.b.dh r8 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh.f372869h
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            r6.f372757q = r8
            goto L_0x0084
        L_0x006d:
            com.google.android.libraries.storage.protostore.ab r0 = r6.f372746A
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()
            com.google.android.apps.search.googleapp.promomanager.b.at r4 = new com.google.android.apps.search.googleapp.promomanager.b.at
            r4.<init>(r6, r2, r1, r8)
            java.util.concurrent.Executor r8 = r6.f372748h
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r8)
            r6.f372757q = r8
        L_0x0084:
            com.google.common.util.concurrent.cx r8 = r6.f372757q
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.String r7 = r7.name()
            r0[r1] = r7
            java.lang.String r7 = "Failed to showReactiveOverlay[%s]"
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r8, r7, r0)
            com.google.apps.tiktok.dataservice.cv r7 = r6.f372760z
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a
            java.util.Set r0 = r6.f372747B
            com.google.common.b.ij r0 = com.google.common.p4522b.C58528ij.m90006F(r0)
            com.google.apps.tiktok.dataservice.dc r0 = com.google.apps.tiktok.dataservice.C46786dc.m83350a(r0)
            r7.mo50787a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C136958bm.mo113464u(com.google.android.apps.search.googleapp.u.t, int):void");
    }

    /* renamed from: v */
    public final void mo113465v(C37259h hVar, int i, C137041j jVar) {
        C137005df dfVar = (C137005df) C137007dh.f372869h.createBuilder();
        C63908av avVar = (C63908av) C63909aw.f172816e.createBuilder();
        avVar.copyOnWrite();
        C63909aw awVar = (C63909aw) avVar.instance;
        awVar.f172818a |= 1;
        awVar.f172819b = i;
        C63909aw awVar2 = (C63909aw) avVar.build();
        dfVar.copyOnWrite();
        C137007dh dhVar = (C137007dh) dfVar.instance;
        awVar2.getClass();
        dhVar.f372875e = awVar2;
        dhVar.f372871a |= 8;
        mo113466w(hVar, (C137007dh) dfVar.build(), jVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.protos.aq.aw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113466w(com.google.android.libraries.search.p2871b.p2895i.C37259h r6, com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh r7, com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j r8) {
        /*
            r5 = this;
            com.google.protos.aw.a.a.a.aw r0 = r7.f372875e
            if (r0 != 0) goto L_0x0006
            com.google.protos.aw.a.a.a.aw r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
        L_0x0006:
            int r0 = r0.f172819b
            com.google.protos.aq.aj r1 = r5.f372750j
            com.google.protos.aq.aw r2 = com.google.protos.p4880aq.C63734aw.f172313h
            com.google.protobuf.dn r1 = r1.f172283a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r4 = r1.containsKey(r3)
            if (r4 == 0) goto L_0x001f
            java.lang.Object r1 = r1.get(r3)
            r2 = r1
            com.google.protos.aq.aw r2 = (com.google.protos.p4880aq.C63734aw) r2
        L_0x001f:
            j.a.c.b.b r1 = p5535j.p5536a.p5545c.p5547b.C70971b.f189249k
            com.google.protobuf.bn r1 = r1.createBuilder()
            j.a.c.b.a r1 = (p5535j.p5536a.p5545c.p5547b.C70970a) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            j.a.c.b.b r3 = (p5535j.p5536a.p5545c.p5547b.C70971b) r3
            int r4 = r3.f189252a
            r4 = r4 | 1
            r3.f189252a = r4
            r3.f189253b = r0
            com.google.protos.aw.a.a.a.aw r0 = r7.f372875e
            if (r0 != 0) goto L_0x003d
            com.google.protos.aw.a.a.a.aw r3 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
            goto L_0x003e
        L_0x003d:
            r3 = r0
        L_0x003e:
            int r3 = r3.f172818a
            r3 = r3 & 2
            if (r3 == 0) goto L_0x005a
            if (r0 != 0) goto L_0x0048
            com.google.protos.aw.a.a.a.aw r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
        L_0x0048:
            int r0 = r0.f172820c
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            j.a.c.b.b r3 = (p5535j.p5536a.p5545c.p5547b.C70971b) r3
            int r4 = r3.f189252a
            r4 = r4 | 2
            r3.f189252a = r4
            r3.f189254c = r0
            goto L_0x0071
        L_0x005a:
            int r0 = r2.f172315a
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0071
            int r0 = r2.f172316b
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            j.a.c.b.b r3 = (p5535j.p5536a.p5545c.p5547b.C70971b) r3
            int r4 = r3.f189252a
            r4 = r4 | 2
            r3.f189252a = r4
            r3.f189254c = r0
        L_0x0071:
            int r0 = r7.f372871a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0096
            int r0 = r7.f372874d
            com.google.protos.aw.a.a.a.bm r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.m96318a(r0)
            if (r0 != 0) goto L_0x0081
            com.google.protos.aw.a.a.a.bm r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.UNSPECIFIED
        L_0x0081:
            com.google.protos.aq.ba r0 = com.google.android.apps.search.googleapp.promomanager.p10372b.C136959bn.m222628a(r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            j.a.c.b.b r3 = (p5535j.p5536a.p5545c.p5547b.C70971b) r3
            int r0 = r0.f172434i
            r3.f189256e = r0
            int r0 = r3.f189252a
            r0 = r0 | 8
            r3.f189252a = r0
        L_0x0096:
            int r0 = r7.f372871a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00ae
            boolean r7 = r7.f372876f
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            j.a.c.b.b r0 = (p5535j.p5536a.p5545c.p5547b.C70971b) r0
            int r2 = r0.f189252a
            r2 = r2 | 64
            r0.f189252a = r2
            r0.f189259h = r7
            goto L_0x00c5
        L_0x00ae:
            int r7 = r2.f172315a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00c5
            boolean r7 = r2.f172320g
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            j.a.c.b.b r0 = (p5535j.p5536a.p5545c.p5547b.C70971b) r0
            int r2 = r0.f189252a
            r2 = r2 | 64
            r0.f189252a = r2
            r0.f189259h = r7
        L_0x00c5:
            com.google.protobuf.fg r7 = r8.f372946f
            if (r7 != 0) goto L_0x00cb
            com.google.protobuf.fg r7 = com.google.protobuf.C63042fg.f170152c
        L_0x00cb:
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            j.a.c.b.b r8 = (p5535j.p5536a.p5545c.p5547b.C70971b) r8
            r7.getClass()
            r8.f189260i = r7
            int r7 = r8.f189252a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r8.f189252a = r7
            com.google.net.a.a.b r7 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r6 = r6.mo40781e(r7)
            com.google.protobuf.bt r7 = p5535j.p5536a.p5545c.p5547b.C70971b.f189250l
            com.google.protobuf.bv r8 = r1.build()
            j.a.c.b.b r8 = (p5535j.p5536a.p5545c.p5547b.C70971b) r8
            r0 = r6
            com.google.android.libraries.search.b.i.b r0 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r0
            r0.mo40792p(r7, r8)
            com.google.android.libraries.search.b.b r7 = r5.f372755o
            r7.mo19974a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C136958bm.mo113466w(com.google.android.libraries.search.b.i.h, com.google.android.apps.search.googleapp.promomanager.b.dh, com.google.android.apps.search.googleapp.promomanager.c.j):void");
    }
}
