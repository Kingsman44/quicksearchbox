package com.google.android.apps.gsa.smartspace.p7258b;

import android.util.LruCache;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.smartspace.C92126u;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130913ay;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130917bb;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130918bc;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3886c.C50691ac;
import com.google.assistant.p3886c.C50693ae;
import com.google.assistant.p3886c.C50697ai;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.C50847s;
import com.google.assistant.p3886c.C50849u;
import com.google.assistant.p3886c.C50850v;
import com.google.assistant.p3886c.C50851w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.ajb;
import com.google.common.p4552o.ajg;
import com.google.common.p4552o.akh;
import com.google.common.p4552o.aki;
import com.google.common.p4552o.akk;
import com.google.common.p4552o.akl;
import com.google.common.p4552o.aky;
import com.google.common.p4552o.alf;
import com.google.common.p4552o.ali;
import com.google.common.p4552o.alj;
import com.google.common.p4552o.alk;
import com.google.common.p4552o.all;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4580v.C60950i;
import com.google.common.p4580v.C60951j;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.smartspace.b.ah */
/* compiled from: PG */
public final class C92045ah implements C92125t {

    /* renamed from: a */
    public static final C59071e f256602a = C59071e.m91332i("com.google.android.apps.gsa.smartspace.b.ah");

    /* renamed from: b */
    static final C58495hd f256603b;

    /* renamed from: c */
    static final C58495hd f256604c;

    /* renamed from: d */
    static final C58528ij f256605d = new C58759qy(104336);

    /* renamed from: o */
    private static final Duration f256606o = Duration.ofSeconds(1);

    /* renamed from: p */
    private static final Duration f256607p = Duration.ofSeconds(10);

    /* renamed from: q */
    private static final Duration f256608q = Duration.ofMinutes(10);

    /* renamed from: A */
    private final Map f256609A = new HashMap();

    /* renamed from: e */
    public final C60950i f256610e;

    /* renamed from: f */
    public final C42876ab f256611f;

    /* renamed from: g */
    public final C42876ab f256612g;

    /* renamed from: h */
    public final Executor f256613h;

    /* renamed from: i */
    public final C83794j f256614i;

    /* renamed from: j */
    public C50851w f256615j = C50851w.f132415e;

    /* renamed from: k */
    public final Map f256616k = new HashMap();

    /* renamed from: l */
    public Instant f256617l = Instant.EPOCH;

    /* renamed from: m */
    C28292j f256618m = null;

    /* renamed from: n */
    public final C92057at f256619n;

    /* renamed from: r */
    private final C92126u f256620r;

    /* renamed from: s */
    private final bm f256621s;

    /* renamed from: t */
    private final C60836bq f256622t = new C60836bq();

    /* renamed from: u */
    private final C90021c f256623u;

    /* renamed from: v */
    private final Object f256624v = new Object();

    /* renamed from: w */
    private final Object f256625w = new Object();

    /* renamed from: x */
    private final LruCache f256626x = new LruCache(256);

    /* renamed from: y */
    private final Map f256627y = new HashMap();

    /* renamed from: z */
    private Instant f256628z;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C50794cr.BIRTHDAY, 104352);
        gzVar.mo55429h(C50794cr.CALENDAR, 79169);
        gzVar.mo55429h(C50794cr.COMMUTE_TIME, 79170);
        gzVar.mo55429h(C50794cr.FLIGHT, 79171);
        gzVar.mo55429h(C50794cr.LOCATION_OOBE, 109674);
        gzVar.mo55429h(C50794cr.OOBE, 105420);
        gzVar.mo55429h(C50794cr.REMINDER, 96816);
        gzVar.mo55429h(C50794cr.SPORTS, 94613);
        gzVar.mo55429h(C50794cr.STOCK_PRICE_CHANGE, 114513);
        gzVar.mo55429h(C50794cr.TIPS, 79172);
        gzVar.mo55429h(C50794cr.WEATHER, 79173);
        gzVar.mo55429h(C50794cr.WEATHER_ALERT, 104353);
        gzVar.mo55429h(C50794cr.MEDIA, 104336);
        f256603b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C50701am.AT_TRANSIT_STOP, 93970);
        gzVar2.mo55429h(C50701am.CALL_RECOMMENDATIONS, 93972);
        gzVar2.mo55429h(C50701am.FLIGHT, 93975);
        gzVar2.mo55429h(C50701am.GAS_STATION_PAYMENT, 108858);
        gzVar2.mo55429h(C50701am.HEADPHONE_CONTEXT, 104336);
        gzVar2.mo55429h(C50701am.HOME_CONTEXT, 94612);
        gzVar2.mo55429h(C50701am.HOME_CONTROLS, 93965);
        gzVar2.mo55429h(C50701am.NAVIGATE_TO, 104337);
        gzVar2.mo55429h(C50701am.ORDER_COFFEE, 93966);
        gzVar2.mo55429h(C50701am.PLAY_MEDIA, 93967);
        gzVar2.mo55429h(C50701am.QUERY_SONG, 93974);
        gzVar2.mo55429h(C50701am.RESTAURANT_DEEPLINK, 93971);
        gzVar2.mo55429h(C50701am.RESTAURANT_CONTEXT, 93971);
        gzVar2.mo55429h(C50701am.RIDESHARE, 93968);
        gzVar2.mo55429h(C50701am.SET_ALARM, 93973);
        gzVar2.mo55429h(C50701am.STORE_CONTEXT, 100139);
        f256604c = gzVar2.mo55427f(false);
    }

    public C92045ah(C42876ab abVar, C42876ab abVar2, C60950i iVar, Executor executor, C92126u uVar, bm bmVar, C83794j jVar, C90021c cVar, C92057at atVar) {
        this.f256611f = abVar;
        this.f256612g = abVar2;
        this.f256610e = iVar;
        this.f256613h = executor;
        this.f256620r = uVar;
        this.f256621s = bmVar;
        this.f256614i = jVar;
        this.f256623u = cVar;
        this.f256619n = atVar;
        this.f256628z = iVar.mo57444a();
    }

    /* renamed from: A */
    private final void m151061A(C92044ag agVar, List list) {
        akh akh = (akh) agVar.mo86690b().toBuilder();
        akh.copyOnWrite();
        ((all) akh.instance).f159069b = all.emptyProtobufList();
        akh.mo57014a(list);
        m151069y(m151068x(agVar.mo86689a()), (all) akh.build(), false);
    }

    /* renamed from: B */
    private final void m151062B(ali ali, boolean z) {
        C28293k x = m151068x(108856);
        akh akh = (akh) all.f159065n.createBuilder();
        alj alj = (alj) alk.f159060d.createBuilder();
        alj.copyOnWrite();
        alk alk = (alk) alj.instance;
        alk.f159063b = ali.f159059C;
        alk.f159062a |= 1;
        alj.copyOnWrite();
        alk alk2 = (alk) alj.instance;
        alk2.f159062a |= 2;
        alk2.f159064c = z;
        alk alk3 = (alk) alj.build();
        akh.copyOnWrite();
        all all = (all) akh.instance;
        alk3.getClass();
        all.f159077j = alk3;
        all.f159068a |= 256;
        m151069y(x, (all) akh.build(), true);
    }

    /* renamed from: C */
    private final void m151063C(int i, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj : objArr) {
            if (obj == null) {
                ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12020)).mo56386p("VE child null.");
            } else {
                C28292j jVar = (C28292j) this.f256626x.get(obj);
                if (jVar != null) {
                    arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
                } else {
                    ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12019)).mo56386p("VE child not found in veMap.");
                }
            }
        }
        C60321oe b = C28285c.m52875b(C28293k.m52907d(new C28292j(i), arrayList), 79409);
        if (b == null || b.f163228c.size() == 0) {
            ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12018)).mo56386p("clientVisualElements null");
            return;
        }
        if (this.f256621s.u() && this.f256621s.w()) {
            z = true;
        }
        akh akh = (akh) all.f159065n.createBuilder();
        akh.copyOnWrite();
        all all = (all) akh.instance;
        all.f159068a |= 8;
        all.f159071d = z;
        m151066v(b, (all) akh.build());
    }

    /* renamed from: D */
    private static void m151064D(C60321oe oeVar) {
        if (oeVar != null) {
            C89949q.m146521e(oeVar, false);
        } else {
            ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12021)).mo56386p("clientVisualElements is null in logVes().");
        }
    }

    /* renamed from: E */
    private final boolean m151065E(Instant instant, Duration duration) {
        return instant == null || Duration.between(instant, this.f256610e.mo57444a()).compareTo(duration) > 0;
    }

    /* renamed from: v */
    static final void m151066v(C60321oe oeVar, all all) {
        if (oeVar.f163228c.size() != 0) {
            aqp aqp = (aqp) ((aqs) oeVar.f163228c.get(0)).toBuilder();
            C62940bt btVar = ajg.f158866h;
            ajb ajb = (ajb) ajg.f158865g.createBuilder();
            ajb.copyOnWrite();
            ajg ajg = (ajg) ajb.instance;
            ajg.f158872e = 4;
            ajg.f158868a |= 512;
            aqp.mo58885m(btVar, (ajg) ajb.build());
            aqp.mo58885m(all.f159066o, all);
            C60320od odVar = (C60320od) oeVar.toBuilder();
            odVar.mo57084d(0, (aqs) aqp.build());
            C89949q.m146521e((C60321oe) odVar.build(), false);
        }
    }

    /* renamed from: w */
    private static C92044ag m151067w(C50794cr crVar, boolean z, boolean z2, boolean z3, aky aky) {
        C58495hd hdVar = f256603b;
        if (!hdVar.containsKey(crVar)) {
            ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12012)).mo56386p("CardType not found");
            return null;
        }
        akh akh = (akh) all.f159065n.createBuilder();
        akh.copyOnWrite();
        all all = (all) akh.instance;
        all.f159068a |= 8;
        all.f159071d = z;
        akh.copyOnWrite();
        all all2 = (all) akh.instance;
        all2.f159068a |= 16;
        all2.f159072e = z2;
        akh.copyOnWrite();
        all all3 = (all) akh.instance;
        all3.f159068a |= 32;
        all3.f159073f = z3;
        akh.mo57015b(aky);
        return new C92037a(((Integer) hdVar.get(crVar)).intValue(), BuildConfig.FLAVOR, (all) akh.build());
    }

    /* renamed from: x */
    private static C28293k m151068x(int i) {
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        return C28293k.m52908e(jVar, new C28293k[0]);
    }

    /* renamed from: y */
    private final void m151069y(C28293k kVar, all all, boolean z) {
        if (kVar != null) {
            C28293k d = C28293k.m52907d(new C28292j(79168), C58485gu.m89846n(kVar));
            if (z) {
                this.f256618m = ((C28257a) d).f76908a;
            }
            C60321oe b = C28285c.m52875b(d, 79409);
            if (b != null && b.f163228c.size() != 0) {
                m151066v(b, all);
                if (z) {
                    C28292j jVar = ((C28257a) kVar).f76908a;
                    jVar.getClass();
                    C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
                }
            }
        }
    }

    /* renamed from: z */
    private final void m151070z(C92044ag agVar) {
        if (agVar != null) {
            C92037a aVar = (C92037a) agVar;
            int i = aVar.f256594a;
            synchronized (this.f256625w) {
                Map map = this.f256627y;
                Integer valueOf = Integer.valueOf(i);
                if (map.containsKey(valueOf)) {
                    if (!m151065E((Instant) this.f256627y.get(valueOf), f256606o)) {
                        return;
                    }
                }
                this.f256627y.put(valueOf, this.f256610e.mo57444a());
                m151069y(m151068x(i), aVar.f256595b, true);
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo86696a() {
        C60870cx d = this.f256612g.mo46042d();
        C92078u uVar = new C92078u(this);
        return C47638k.m84751b(mo86716u(), C60922j.m93044g(d, C47810es.m84963c(uVar), this.f256613h)).mo51520a(C92039ab.f256598a, this.f256613h);
    }

    /* renamed from: b */
    public final void mo86697b(C50819dp dpVar) {
        if (this.f256623u.mo79746e(C90017bw.f247949bK)) {
            mo86716u();
        }
        C60870cx a = this.f256619n.mo86723a();
        C92076s sVar = new C92076s(dpVar);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(sVar), this.f256613h);
        C92042ae aeVar = new C92042ae();
        C60856cj.m92911t(g, C47810es.m84974n(aeVar), this.f256613h);
    }

    /* renamed from: c */
    public final void mo86698c(boolean z) {
        m151062B(ali.AMBIENT_MODE, z);
    }

    /* renamed from: d */
    public final void mo86699d(C50794cr crVar, boolean z, boolean z2, boolean z3, List list, C50813dj djVar) {
        if (this.f256623u.mo79746e(C90017bw.f247999cH)) {
            C130917bb f = C130918bc.m213456f();
            f.mo109956b(z);
            f.mo109958d(z2);
            f.mo109957c(z3);
            C130913ay ayVar = (C130913ay) f;
            ayVar.f358218a = C58485gu.m89842j(list);
            if (djVar != null) {
                ayVar.f358219b = Optional.m71637of(djVar);
            }
            C60870cx a = this.f256619n.mo86723a();
            C92079v vVar = new C92079v(crVar, f);
            C60922j.m93044g(a, C47810es.m84963c(vVar), this.f256613h);
            return;
        }
        C92044ag w = m151067w(crVar, z, z2, z3, aky.f158997e);
        if (w != null) {
            synchronized (this.f256624v) {
                this.f256622t.mo57305b(new C92080w(this), this.f256613h);
                this.f256622t.mo57305b(new C92081x(this, w, list), this.f256613h);
                if (this.f256623u.mo79746e(C90017bw.f247949bK)) {
                    this.f256622t.mo57305b(new C92082y(this), this.f256613h);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo86700e(C50794cr crVar, aky aky, boolean z, boolean z2, boolean z3) {
        if (!this.f256623u.mo79746e(C90017bw.f247999cH)) {
            C92044ag w = m151067w(crVar, z, z2, z3, aky);
            if (w != null) {
                C50794cr crVar2 = C50794cr.UNDEFINED;
                m151070z(w);
                return;
            }
            return;
        }
        C60870cx a = this.f256619n.mo86723a();
        C92072o oVar = new C92072o(crVar, z, z2, z3, aky);
        C60922j.m93044g(a, C47810es.m84963c(oVar), this.f256613h);
    }

    /* renamed from: f */
    public final void mo86701f(List list, boolean z, List list2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C83802r rVar = (C83802r) it.next();
            if (rVar.mo77094d().mo56113h()) {
                C50738bc bcVar = (C50738bc) rVar.mo77094d().mo56107c();
                C50701am a = C50701am.m85887a(bcVar.f132040g);
                if (a == null) {
                    a = C50701am.UNKNOWN;
                }
                if (!f256604c.containsKey(a)) {
                    ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12014)).mo56386p("ChipType not found");
                } else {
                    akh akh = (akh) all.f159065n.createBuilder();
                    akh.copyOnWrite();
                    all all = (all) akh.instance;
                    all.f159068a |= 8;
                    all.f159071d = z;
                    akh.copyOnWrite();
                    all all2 = (all) akh.instance;
                    all2.f159068a |= 16;
                    int i = 0;
                    all2.f159072e = false;
                    akh.copyOnWrite();
                    all all3 = (all) akh.instance;
                    all3.f159068a |= 32;
                    all3.f159073f = false;
                    if (C50701am.HEADPHONE_CONTEXT.equals(a)) {
                        ArrayList arrayList2 = new ArrayList();
                        C50706ar arVar = bcVar.f132044k;
                        if (arVar == null) {
                            arVar = C50706ar.f131960a;
                        }
                        C62940bt r7 = C62942bv.checkIsLite(C50693ae.f131889h);
                        arVar.mo58887l(r7);
                        Object l = arVar.f169962ag.mo58854l(r7.f169971d);
                        if (l == null) {
                            obj = r7.f169969b;
                        } else {
                            obj = r7.mo58889c(l);
                        }
                        C50697ai aiVar = ((C50693ae) obj).f131892b;
                        if (aiVar == null) {
                            aiVar = C50697ai.f131903b;
                        }
                        for (C50691ac acVar : aiVar.f131905a) {
                            aki aki = (aki) akl.f158967f.createBuilder();
                            aki.copyOnWrite();
                            akl akl = (akl) aki.instance;
                            akl.f158969a |= 1;
                            akl.f158970b = i;
                            C50690ab a2 = C50690ab.m85884a(acVar.f131886g);
                            if (a2 == null) {
                                a2 = C50690ab.UNSPECIFIED;
                            }
                            int a3 = akk.m92421a(a2.f131877e);
                            aki.copyOnWrite();
                            akl akl2 = (akl) aki.instance;
                            int i2 = a3 - 1;
                            if (a3 != 0) {
                                akl2.f158971c = i2;
                                akl2.f158969a |= 2;
                                String str = acVar.f131883d;
                                aki.copyOnWrite();
                                akl akl3 = (akl) aki.instance;
                                str.getClass();
                                akl3.f158969a |= 4;
                                akl3.f158972d = str;
                                String str2 = acVar.f131885f;
                                aki.copyOnWrite();
                                akl akl4 = (akl) aki.instance;
                                str2.getClass();
                                akl4.f158969a |= 8;
                                akl4.f158973e = str2;
                                arrayList2.add((akl) aki.build());
                                i++;
                            } else {
                                throw null;
                            }
                        }
                        C58485gu j = C58485gu.m89842j(arrayList2);
                        akh.copyOnWrite();
                        all all4 = (all) akh.instance;
                        C62971cq cqVar = all4.f159079l;
                        if (!cqVar.mo58948c()) {
                            all4.f159079l = C62942bv.mutableCopy(cqVar);
                        }
                        C62947c.addAll((Iterable) j, (List) all4.f159079l);
                    }
                    arrayList.add(new C92037a(((Integer) f256604c.get(a)).intValue(), bcVar.f132037d, (all) akh.build()));
                }
            }
        }
        synchronized (this.f256624v) {
            this.f256622t.mo57305b(new C92080w(this), this.f256613h);
            this.f256622t.mo57305b(new C92083z(this, arrayList, list2), this.f256613h);
        }
    }

    /* renamed from: g */
    public final void mo86702g(C50701am amVar, aky aky, boolean z) {
        C92037a aVar;
        C58495hd hdVar = f256604c;
        if (!hdVar.containsKey(amVar)) {
            ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12013)).mo56386p("ChipType not found");
            aVar = null;
        } else {
            int intValue = ((Integer) hdVar.get(amVar)).intValue();
            akh akh = (akh) all.f159065n.createBuilder();
            akh.copyOnWrite();
            all all = (all) akh.instance;
            all.f159068a |= 8;
            all.f159071d = z;
            akh.copyOnWrite();
            all all2 = (all) akh.instance;
            all2.f159068a |= 16;
            all2.f159072e = false;
            akh.copyOnWrite();
            all all3 = (all) akh.instance;
            all3.f159068a |= 32;
            all3.f159073f = false;
            akh.mo57015b(aky);
            aVar = new C92037a(intValue, BuildConfig.FLAVOR, (all) akh.build());
        }
        m151070z(aVar);
    }

    /* renamed from: h */
    public final void mo86703h(View view) {
        C28292j jVar;
        C28293k b = C28295m.m52916b(view);
        if (b == null || (jVar = this.f256618m) == null) {
            ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12015)).mo56386p("triggerNode or rootOfLastFakeImpression is null in logDetailsImpression().");
        } else {
            m151064D(C28285c.m52877d(b, jVar));
        }
    }

    /* renamed from: i */
    public final void mo86704i(Object obj) {
        C28292j jVar = (C28292j) this.f256626x.get(obj);
        if (jVar == null) {
            ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12016)).mo56386p("VE object not found in veMap.");
        } else {
            C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
        }
    }

    /* renamed from: j */
    public final void mo86705j(Object... objArr) {
        m151063C(108863, objArr);
    }

    /* renamed from: k */
    public final void mo86706k(Object... objArr) {
        m151063C(108859, objArr);
    }

    /* renamed from: l */
    public final void mo86707l(C92094j jVar, boolean z) {
        m151062B(this.f256620r.mo86718a(jVar), z);
    }

    /* renamed from: m */
    public final void mo86708m(C50794cr crVar, boolean z) {
        m151062B(this.f256620r.mo86719b(crVar), z);
    }

    /* renamed from: o */
    public final void mo86710o(View view) {
        m151064D(C28285c.m52882i(view, 5, (Integer) null));
    }

    /* renamed from: p */
    public final void mo86711p(View view) {
        C28292j a = C28295m.m52915a(view);
        if (a != null) {
            m151064D(C28285c.m52879f(a, true));
        } else {
            ((C59052c) ((C59052c) f256602a.mo56225c()).mo56372aa(12022)).mo56386p("ve is null in logViewShow().");
        }
    }

    /* renamed from: q */
    public final void mo86712q(Object obj, int i) {
        if (obj != null) {
            LruCache lruCache = this.f256626x;
            C28292j jVar = new C28292j(i);
            jVar.mo33795i(5);
            lruCache.put(obj, jVar);
        }
    }

    /* renamed from: r */
    public final void mo86713r(C50794cr crVar, boolean z, boolean z2, List list) {
        mo86699d(crVar, z, true, z2, list, (C50813dj) null);
    }

    /* renamed from: s */
    public final void mo86714s() {
        C28293k x = m151068x(108855);
        boolean z = this.f256621s.u() && this.f256621s.w();
        akh akh = (akh) all.f159065n.createBuilder();
        akh.copyOnWrite();
        all all = (all) akh.instance;
        all.f159068a |= 8;
        all.f159071d = z;
        m151069y(x, (all) akh.build(), false);
    }

    /* renamed from: t */
    public final C60870cx mo86715t(List list, boolean z, List list2) {
        boolean z2;
        alf alf;
        C50850v vVar;
        alf alf2;
        boolean z3 = z;
        List list3 = list2;
        C50847s sVar = (C50847s) C50851w.f132415e.createBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            C92044ag agVar = (C92044ag) it.next();
            if (((C58759qy) f256605d).f156534a.equals(Integer.valueOf(agVar.mo86689a()))) {
                m151061A(agVar, list3);
            } else {
                if (z3) {
                    arrayList.add(Integer.valueOf(agVar.mo86689a()));
                }
                C63042fg b = C62950b.m95471b(this.f256610e);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = this.f256615j.f132418b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    vVar = (C50850v) it2.next();
                    if (vVar.f132410b != agVar.mo86689a()) {
                        alf2 = alf.NEW_TYPE;
                    } else if (!vVar.f132411c.equals(agVar.mo86691c())) {
                        alf2 = alf.NEW_CONTENT;
                    } else if (m151065E((Instant) this.f256609A.get(Integer.valueOf(agVar.mo86689a())), f256607p)) {
                        alf2 = alf.INVARIANT;
                    } else {
                        alf2 = alf.UNSPECIFIED;
                    }
                    arrayList2.add(alf2);
                    C63042fg fgVar = vVar.f132412d;
                    if (fgVar == null) {
                        fgVar = C63042fg.f170152c;
                    }
                    Instant e = C62950b.m95474e(fgVar);
                    ZoneId zoneId = C60951j.f165070a;
                    if (e.isBefore(this.f256610e.mo57445b(zoneId).atStartOfDay(zoneId).toInstant()) || !(alf2 == alf.INVARIANT || alf2 == alf.UNSPECIFIED)) {
                    }
                }
                C63042fg fgVar2 = vVar.f132412d;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                b = fgVar2;
                z2 = false;
                if (arrayList2.contains(alf.UNSPECIFIED)) {
                    alf = alf.UNSPECIFIED;
                } else if (arrayList2.contains(alf.INVARIANT)) {
                    alf = alf.INVARIANT;
                } else {
                    alf = arrayList2.contains(alf.NEW_CONTENT) ? alf.NEW_CONTENT : alf.NEW_TYPE;
                }
                if (alf != alf.UNSPECIFIED) {
                    int a = agVar.mo86689a();
                    Map map = this.f256616k;
                    Integer valueOf = Integer.valueOf(a);
                    if (map.containsKey(valueOf)) {
                        Map map2 = (Map) this.f256616k.get(valueOf);
                        if (map2 != null) {
                            map2.put(alf, Integer.valueOf((map2.containsKey(alf) ? ((Integer) map2.get(alf)).intValue() : 0) + 1));
                        }
                    } else {
                        EnumMap enumMap = new EnumMap(alf.class);
                        enumMap.put(alf, 1);
                        this.f256616k.put(valueOf, enumMap);
                    }
                    this.f256609A.put(Integer.valueOf(agVar.mo86689a()), this.f256610e.mo57444a());
                }
                if (z2) {
                    m151061A(agVar, list3);
                    z4 = true;
                }
                C50849u uVar = (C50849u) C50850v.f132407g.createBuilder();
                int a2 = agVar.mo86689a();
                uVar.copyOnWrite();
                C50850v vVar2 = (C50850v) uVar.instance;
                vVar2.f132409a |= 1;
                vVar2.f132410b = a2;
                String c = agVar.mo86691c();
                uVar.copyOnWrite();
                C50850v vVar3 = (C50850v) uVar.instance;
                c.getClass();
                vVar3.f132409a |= 2;
                vVar3.f132411c = c;
                uVar.copyOnWrite();
                C50850v vVar4 = (C50850v) uVar.instance;
                b.getClass();
                vVar4.f132412d = b;
                vVar4.f132409a |= 4;
                uVar.copyOnWrite();
                C50850v vVar5 = (C50850v) uVar.instance;
                vVar5.f132409a |= 8;
                vVar5.f132413e = z3;
                sVar.mo53485a((C50850v) uVar.build());
            }
        }
        if (m151065E(this.f256628z, f256608q)) {
            this.f256628z = this.f256610e.mo57444a();
            C60922j.m93044g(this.f256612g.mo46042d(), C47810es.m84963c(new C92041ad(this)), this.f256613h);
        }
        if (!z4) {
            return C60866ct.f164955a;
        }
        for (C50850v vVar6 : this.f256615j.f132418b) {
            if (vVar6.f132413e && !arrayList.contains(Integer.valueOf(vVar6.f132410b))) {
                sVar.mo53485a(vVar6);
            } else if (!vVar6.f132413e && z3) {
                sVar.mo53485a(vVar6);
            }
        }
        this.f256615j = (C50851w) sVar.build();
        return C60922j.m93045h(this.f256611f.mo46039a(new C92074q(this), this.f256613h), C47810es.m84966f(C92075r.f256705a), this.f256613h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C60870cx mo86716u() {
        if (this.f256610e.mo57444a().minus(Duration.ofDays(1)).isBefore(this.f256617l)) {
            return C60866ct.f164955a;
        }
        C60870cx a = this.f256619n.mo86723a();
        C60870cx c = this.f256620r.mo86720c();
        return C47638k.m84751b(a, c).mo51520a(new C92073p(this, c, a), this.f256613h);
    }

    /* renamed from: n */
    public final void mo86709n(View view, View view2) {
        view.getClass();
        m151064D(C28285c.m52881h(4, C28295m.m52916b(view), view2));
    }
}
