package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83799o;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.opa.smartspace.C83806v;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.opa.smartspace.crossprofile.C83754b;
import com.google.android.apps.gsa.opa.smartspace.p6453b.C83743a;
import com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.gsa.shared.p7041h.C89782n;
import com.google.android.apps.gsa.shared.p7041h.C89783o;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.smartspace.C92032ab;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.smartspace.p7259c.C92091g;
import com.google.android.apps.gsa.smartspace.p7259c.C92092h;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110580am;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110582ao;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110630cf;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p.C110886k;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131650d;
import com.google.android.enterprise.connectedapps.C142574h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50748bm;
import com.google.assistant.p3886c.C50749bn;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.bi */
/* compiled from: PG */
public final class C110764bi implements C90991b {

    /* renamed from: a */
    public static final C59071e f308595a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.l.bi");

    /* renamed from: w */
    private static int f308596w = 0;

    /* renamed from: x */
    private static long f308597x = 0;

    /* renamed from: A */
    private final C22871g f308598A;

    /* renamed from: B */
    private final C83806v f308599B;

    /* renamed from: C */
    private final C110766bk f308600C;

    /* renamed from: D */
    private final C83743a f308601D;

    /* renamed from: E */
    private final C110582ao f308602E;

    /* renamed from: F */
    private final C131650d f308603F;

    /* renamed from: G */
    private final List f308604G = new ArrayList();

    /* renamed from: H */
    private final C83807w f308605H;

    /* renamed from: I */
    private final C59407o f308606I;

    /* renamed from: J */
    private String f308607J = BuildConfig.FLAVOR;

    /* renamed from: K */
    private long f308608K = 0;

    /* renamed from: L */
    private final C110630cf f308609L;

    /* renamed from: M */
    private final C83754b f308610M;

    /* renamed from: b */
    public final Set f308611b;

    /* renamed from: c */
    public final C83794j f308612c;

    /* renamed from: d */
    public final C92111g f308613d;

    /* renamed from: e */
    public final C22871g f308614e;

    /* renamed from: f */
    public final Context f308615f;

    /* renamed from: g */
    public final bm f308616g;

    /* renamed from: h */
    public final C92122r f308617h;

    /* renamed from: i */
    public final C92032ab f308618i;

    /* renamed from: j */
    public final C92125t f308619j;

    /* renamed from: k */
    public final C130895ag f308620k;

    /* renamed from: l */
    public final C85664bo f308621l;

    /* renamed from: m */
    public final C83791c f308622m;

    /* renamed from: n */
    public final C58974d f308623n;

    /* renamed from: o */
    public final List f308624o = new ArrayList();

    /* renamed from: p */
    public final C21370a f308625p;

    /* renamed from: q */
    public final ConcurrentHashMap f308626q = new ConcurrentHashMap();

    /* renamed from: r */
    public final C86124t f308627r;

    /* renamed from: s */
    public final C110886k f308628s;

    /* renamed from: t */
    public final C89782n f308629t;

    /* renamed from: u */
    public final C91189au f308630u;

    /* renamed from: v */
    public C58485gu f308631v = C58485gu.m89845m();

    /* renamed from: y */
    private final C110779o f308632y;

    /* renamed from: z */
    private final C110780p f308633z;

    public C110764bi(C110779o oVar, Set set, C83794j jVar, C110780p pVar, C92111g gVar, C22871g gVar2, Context context, bm bmVar, C86124t tVar, C83806v vVar, C110766bk bkVar, C92122r rVar, C83754b bVar, C92032ab abVar, C92125t tVar2, C130895ag agVar, C83743a aVar, C83791c cVar, C110582ao aoVar, C83564a aVar2, C131650d dVar, C91022f fVar, C21370a aVar3, C22871g gVar3, C91189au auVar, C83807w wVar, C85664bo boVar, C110886k kVar, C89783o oVar2, C110630cf cfVar) {
        long j;
        double d;
        C83794j jVar2 = jVar;
        this.f308632y = oVar;
        this.f308615f = context;
        this.f308611b = set;
        this.f308612c = jVar2;
        this.f308633z = pVar;
        this.f308627r = tVar;
        this.f308613d = gVar;
        this.f308598A = gVar2;
        this.f308616g = bmVar;
        this.f308599B = vVar;
        this.f308600C = bkVar;
        this.f308617h = rVar;
        this.f308610M = bVar;
        this.f308618i = abVar;
        this.f308619j = tVar2;
        this.f308620k = agVar;
        this.f308601D = aVar;
        this.f308622m = cVar;
        this.f308602E = aoVar;
        this.f308623n = aVar2.mo76900a("AA.ProactiveServiceManager");
        this.f308603F = dVar;
        this.f308625p = aVar3;
        this.f308614e = gVar3;
        this.f308630u = auVar;
        this.f308621l = boVar;
        this.f308605H = wVar;
        this.f308628s = kVar;
        fVar.mo85301a(this);
        C62910ar arVar = (C62910ar) jVar2.f228394e.mo79754t(C89985ax.f246679aF, C62910ar.f169858c.getParserForType());
        if (arVar == null) {
            C59104x d2 = C83794j.f228388a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "OpaSsSharedUtils");
            ((C59052c) ((C59052c) d2).mo56372aa(6841)).mo56386p("Failed to get weather_background_refresh_delay_seconds flag.");
            j = 3000;
        } else {
            j = C62948a.m95453d(arVar);
        }
        if (jVar2.f228394e.mo79747m(C89985ax.f246681aH) == C59203do.f157270a) {
            C59104x d3 = C83794j.f228388a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "OpaSsSharedUtils");
            ((C59052c) ((C59052c) d3).mo56372aa(6840)).mo56386p("weather_background_refresh_retry_multiplier is 0");
            d = 1.5d;
        } else {
            d = jVar2.f228394e.mo79747m(C89985ax.f246681aH);
        }
        this.f308606I = new C59401i(j, d, (int) jVar2.f228394e.mo79743a(C89985ax.f246682aI));
        this.f308629t = oVar2.mo83625a(C39226b.TAG_CLASSIC_ASSISTANT_AMBIENT_BUG_REPORT);
        this.f308609L = cfVar;
    }

    /* renamed from: A */
    private final void m184466A(C92113i[] iVarArr) {
        C92113i[] iVarArr2 = iVarArr;
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26775)).mo56386p("logCardsSentInAmbientLogs");
        if (C90771bo.m148273b(this.f308615f, UserHandleCompat.m148154a())) {
            ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26777)).mo56386p("sending cards in the work profile.");
        }
        String str = BuildConfig.FLAVOR;
        long j = 0;
        for (C92113i iVar : iVarArr2) {
            C50794cr a = C50794cr.m85938a(iVar.f256820a.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (a == C50794cr.WEATHER) {
                str = str + iVar.f256820a.hashCode();
                C50796ct ctVar = iVar.f256820a.f132320q;
                if (ctVar == null) {
                    ctVar = C50796ct.f132223c;
                }
                if (ctVar.f132226b > j) {
                    C50796ct ctVar2 = iVar.f256820a.f132320q;
                    if (ctVar2 == null) {
                        ctVar2 = C50796ct.f132223c;
                    }
                    j = ctVar2.f132226b;
                }
            }
            C50794cr a2 = C50794cr.m85938a(iVar.f256820a.f132315l);
            if (a2 == null) {
                a2 = C50794cr.UNDEFINED;
            }
            if (a2 == C50794cr.COMMUTE_TIME) {
                this.f308603F.mo110243b(C31164au.m58092b("Smartspace_Commute_Notification_Received"));
            }
            C50794cr a3 = C50794cr.m85938a(iVar.f256820a.f132315l);
            if (a3 == null) {
                a3 = C50794cr.UNDEFINED;
            }
            if (a3 == C50794cr.TIME_TO_LEAVE) {
                this.f308603F.mo110243b(C31164au.m58092b("Smartspace_TimeToLeave_Notification_Received"));
            }
            C58970a aVar = (C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26776);
            C50818do doVar = iVar.f256820a;
            C50794cr a4 = C50794cr.m85938a(doVar.f132315l);
            if (a4 == null) {
                a4 = C50794cr.UNDEFINED;
            }
            C50794cr crVar = a4;
            C50802cz czVar = doVar.f132308e;
            if (czVar == null) {
                czVar = C50802cz.f132236g;
            }
            C50723h hVar = czVar.f132239b;
            if (hVar == null) {
                hVar = C50723h.f131999e;
            }
            String str2 = hVar.f132002b;
            C50818do doVar2 = iVar.f256820a;
            C50802cz czVar2 = doVar2.f132309f;
            if (czVar2 == null) {
                czVar2 = C50802cz.f132236g;
            }
            C50723h hVar2 = czVar2.f132239b;
            if (hVar2 == null) {
                hVar2 = C50723h.f131999e;
            }
            String str3 = hVar2.f132002b;
            C50802cz czVar3 = doVar2.f132310g;
            if (czVar3 == null) {
                czVar3 = C50802cz.f132236g;
            }
            C50723h hVar3 = czVar3.f132239b;
            if (hVar3 == null) {
                hVar3 = C50723h.f131999e;
            }
            String str4 = hVar3.f132002b;
            Long valueOf = Long.valueOf(doVar2.f132318o);
            Long valueOf2 = Long.valueOf(doVar2.f132317n);
            Boolean valueOf3 = Boolean.valueOf(iVar.f256822c);
            Boolean valueOf4 = Boolean.valueOf(doVar2.f132322s);
            C50796ct ctVar3 = doVar2.f132320q;
            if (ctVar3 == null) {
                ctVar3 = C50796ct.f132223c;
            }
            aVar.mo56365R("sending card %s , pre event title : %s, during event title: %s, post event title: %s, event start time: %d, updated at time: %d, isTriggeringUpdate? %b, is from work profile? %b, expirationTimeMillis %d", crVar, str2, str3, str4, valueOf, valueOf2, valueOf3, valueOf4, Long.valueOf(ctVar3.f132226b));
        }
        if (!this.f308607J.equals(str)) {
            this.f308620k.mo109884T(this.f308612c.mo77175m(), !str.isEmpty() && this.f308625p.mo26870b() <= j, C83794j.m133432r(this.f308621l), C83794j.m133428E(this.f308621l), this.f308608K == 0 || this.f308625p.mo26870b() > this.f308608K, this.f308613d.mo86742c(C50794cr.WEATHER));
            this.f308607J = str;
            this.f308608K = j;
        }
    }

    /* renamed from: B */
    private static void m184467B(C58485gu guVar, C58528ij ijVar, Pair pair, String str, C91006f fVar) {
        if (!guVar.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C60922j.m93044g((C60870cx) pair.first, new C110743ao((Map) Collection.EL.stream(guVar).collect(Collectors.groupingBy(C110740al.f308551a, Collectors.mapping(C110742an.f308553a, C58370cn.f155947b))), arrayList, new ArrayList(), arrayList2, fVar, str), C60826bg.f164896a);
            C60922j.m93044g((C60870cx) pair.second, new C110744ap(ijVar, fVar, str), C60826bg.f164896a);
        }
    }

    /* renamed from: C */
    private final void m184468C(List list, List list2) {
        int i = 0;
        while (i < list.size() && i < list2.size()) {
            int i2 = ((C50818do) list.get(i)).f132307d;
            if (i2 != 0) {
                this.f308626q.put(Integer.valueOf(i2), (Bitmap) list2.get(i));
            }
            i++;
        }
    }

    /* renamed from: c */
    public static C50818do m184469c(C50818do doVar) {
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132304a |= C89885b.S3REQUEST_VALUE;
        doVar2.f132322s = true;
        try {
            C50733r rVar = doVar.f132316m;
            if (rVar == null) {
                rVar = C50733r.f132021d;
            }
            Intent parseUri = Intent.parseUri(rVar.f132025c, 1);
            parseUri.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", true);
            C50733r rVar2 = doVar.f132316m;
            if (rVar2 == null) {
                rVar2 = C50733r.f132021d;
            }
            C50732q qVar = (C50732q) rVar2.toBuilder();
            String uri = parseUri.toUri(1);
            qVar.copyOnWrite();
            C50733r rVar3 = (C50733r) qVar.instance;
            uri.getClass();
            rVar3.f132023a |= 2;
            rVar3.f132025c = uri;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            C50733r rVar4 = (C50733r) qVar.build();
            rVar4.getClass();
            doVar3.f132316m = rVar4;
            doVar3.f132304a |= 2048;
        } catch (URISyntaxException e) {
            C59104x c = f308595a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ProactiveServiceManager");
            C59052c cVar = (C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26747);
            C50733r rVar5 = doVar.f132316m;
            if (rVar5 == null) {
                rVar5 = C50733r.f132021d;
            }
            cVar.mo56389s("Invalid intent '%s' found in Smartspace card.", rVar5.f132025c);
        }
        return (C50818do) cnVar.build();
    }

    /* renamed from: x */
    private static C58485gu m184470x(List list) {
        return (C58485gu) Collection.EL.stream(list).map(C110759bd.f308586a).filter(C110760be.f308587a).collect(C58370cn.f155946a);
    }

    /* renamed from: y */
    private static C58528ij m184471y(C58485gu guVar) {
        return (C58528ij) Collection.EL.stream(guVar).map(C110745aq.f308563a).collect(C58370cn.f155947b);
    }

    /* renamed from: z */
    private static C58714pg m184472z(C58485gu guVar) {
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(C110789y.f308692a).collect(C58370cn.f155946a);
        return C58714pg.m90504g(Long.valueOf((((Long) Collections.min(guVar2)).longValue() - 1) * 1000), Long.valueOf((((Long) Collections.max(guVar2)).longValue() + 1) * 1000));
    }

    /* renamed from: a */
    public final Bitmap mo98865a(C50818do doVar) {
        C50794cr crVar = C50794cr.UNDEFINED;
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 2) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.stat_notify_calendar);
        }
        if (ordinal == 3) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.stat_notify_traffic_light);
        }
        if (ordinal == 4) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.stat_notify_flight_depart);
        }
        if (ordinal == 5) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.quantum_ic_cake_white_24);
        }
        if (ordinal == 7) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.ic_smartspace_tips);
        }
        if (ordinal == 8) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.ic_reminder);
        }
        if (ordinal == 10) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.ic_action_alarm_pressed);
        }
        if (ordinal == 14) {
            return BitmapFactory.decodeResource(this.f308615f.getResources(), R.drawable.quantum_gm_ic_warning_amber_white_24);
        }
        if (ordinal == 35) {
            C50729n nVar = doVar.f132314k;
            if (nVar == null) {
                nVar = C50729n.f132007g;
            }
            byte[] N = nVar.f132013e.mo59174N();
            return BitmapFactory.decodeByteArray(N, 0, N.length);
        } else if (this.f308626q.containsKey(Integer.valueOf(doVar.f132307d))) {
            return (Bitmap) this.f308626q.get(Integer.valueOf(doVar.f132307d));
        } else {
            C58970a aVar = (C58970a) ((C58970a) this.f308623n.mo56226d()).mo56372aa(26746);
            C50794cr a2 = C50794cr.m85938a(doVar.f132315l);
            if (a2 == null) {
                a2 = C50794cr.UNDEFINED;
            }
            aVar.mo56387q("cardType: %s has no icon.", a2.f132222T);
            return null;
        }
    }

    /* renamed from: b */
    public final C50818do mo98866b(C50818do doVar) {
        if (this.f308627r.mo79746e(C89985ax.f246718az)) {
            if (C83794j.m133432r(this.f308621l) && (doVar.f132304a & 268435456) != 0) {
                C50790cn cnVar = (C50790cn) doVar.toBuilder();
                cnVar.copyOnWrite();
                C50818do doVar2 = (C50818do) cnVar.instance;
                doVar2.f132304a &= -268435457;
                doVar2.f132297C = C50818do.f132293H.f132297C;
                doVar = (C50818do) cnVar.build();
            }
            this.f308620k.mo109903aa((268435456 & doVar.f132304a) != 0);
        }
        return doVar;
    }

    /* renamed from: e */
    public final C58833ax mo98867e(C83800p pVar) {
        if (this.f308612c.mo77175m() && this.f308612c.mo77161F()) {
            return this.f308622m.mo77140c(pVar);
        }
        if (!pVar.mo77058d().mo56113h()) {
            ((C58970a) ((C58970a) this.f308623n.mo56226d()).mo56372aa(26753)).mo56386p("Weather card is missing from cache.");
            return C58836b.f156633a;
        }
        C50818do doVar = ((C83741am) pVar.mo77058d().mo56107c()).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        if (this.f308613d.mo86741b(doVar)) {
            ((C58970a) ((C58970a) this.f308623n.mo56226d()).mo56372aa(26751)).mo56388r("Weather card is expired, updated time: %s", doVar.f132317n);
            if (doVar.f132317n == 0) {
                ((C58970a) ((C58970a) this.f308623n.mo56226d()).mo56372aa(26752)).mo56386p("Expired weather card with zero update time");
                this.f308620k.mo109905ac();
            }
            return C58836b.f156633a;
        } else if (!this.f308613d.mo86743d(doVar)) {
            C58970a aVar = (C58970a) ((C58970a) this.f308623n.mo56226d()).mo56372aa(26750);
            Boolean valueOf = Boolean.valueOf(doVar.f132305b);
            C92111g gVar = this.f308613d;
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            aVar.mo56361N("Weather card is invalid: shouldDiscard=%s, isEnabled=%s, smartspace_weather_toggle_enabled=%s, isSmartspaceEnabled=%s, isSmartspaceWeatherUpdateEnabled=%s", valueOf, Boolean.valueOf(gVar.mo86742c(a)), Boolean.valueOf(this.f308627r.mo79746e(C89985ax.f246674aA)), Boolean.valueOf(this.f308617h.f256848d.mo86755k()), Boolean.valueOf(this.f308617h.f256848d.mo86765u()));
            return C58836b.f156633a;
        } else {
            C83740al alVar = (C83740al) ((C83741am) pVar.mo77058d().mo56107c()).toBuilder();
            C50818do b = mo98866b(doVar);
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            b.getClass();
            amVar.f228252c = b;
            amVar.f228250a |= 4;
            return C58833ax.m90834k((C83741am) alVar.build());
        }
    }

    /* renamed from: f */
    public final C58833ax mo98868f(C58495hd hdVar, C58833ax axVar) {
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26754)).mo56386p("identifyWorkProfileCard");
        if (!axVar.mo56113h()) {
            return axVar;
        }
        C83741am amVar = (C83741am) axVar.mo56107c();
        if ((!C142574h.m231178b(this.f308610M.mo117178i().f386862c) || !hdVar.containsKey(C83799o.CURRENT) || !((List) hdVar.get(C83799o.CURRENT)).contains(amVar)) && (!hdVar.containsKey(C83799o.OTHER) || !((List) hdVar.get(C83799o.OTHER)).contains(amVar))) {
            return axVar;
        }
        C58970a aVar = (C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26755);
        C50818do doVar = ((C83741am) axVar.mo56107c()).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        aVar.mo56387q("Updating work profile for card: %s", doVar.f132307d);
        C83740al alVar = (C83740al) ((C83741am) axVar.mo56107c()).toBuilder();
        C50818do doVar2 = ((C83741am) axVar.mo56107c()).f228252c;
        if (doVar2 == null) {
            doVar2 = C50818do.f132293H;
        }
        C50818do c = m184469c(doVar2);
        alVar.copyOnWrite();
        C83741am amVar2 = (C83741am) alVar.instance;
        c.getClass();
        amVar2.f228252c = c;
        amVar2.f228250a |= 4;
        return C58833ax.m90834k((C83741am) alVar.build());
    }

    /* renamed from: g */
    public final C60870cx mo98869g(C83800p pVar) {
        C60870cx cxVar;
        if (this.f308612c.mo77172j()) {
            List r = mo98880r(pVar.mo77065i());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(pVar.mo77061f());
            return this.f308598A.mo28210j(this.f308599B.mo77191a(new Pair(arrayList, r)), BuildConfig.FLAVOR, new C110754az(this));
        }
        C22871g gVar = this.f308598A;
        C110779o oVar = this.f308632y;
        C58495hd i = pVar.mo77065i();
        List arrayList2 = new ArrayList();
        if (i.containsKey(C83799o.CURRENT)) {
            arrayList2.addAll((java.util.Collection) i.get(C83799o.CURRENT));
        }
        if (oVar.f308668d.mo77184w() && oVar.f308668d.mo77185x() && oVar.f308668d.mo77183v()) {
            arrayList2 = (List) Collection.EL.stream(arrayList2).filter(new C110775k(oVar)).collect(Collectors.toList());
        }
        if (i.containsKey(C83799o.OTHER) && oVar.f308667c.f256848d.mo86766v()) {
            arrayList2.addAll((java.util.Collection) Collection.EL.stream((List) i.get(C83799o.OTHER)).filter(new C110776l(oVar)).collect(Collectors.toList()));
        }
        if (oVar.f308668d.mo77174l()) {
            cxVar = oVar.f308670f.mo28210j(oVar.f308669e.c(), BuildConfig.FLAVOR, new C110774j(arrayList2));
        } else {
            cxVar = C60856cj.m92900i(arrayList2);
        }
        return gVar.mo28210j(oVar.f308670f.mo28210j(cxVar, BuildConfig.FLAVOR, new C110777m(oVar)), BuildConfig.FLAVOR, C110756ba.f308580a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        Pair pair;
        Pair pair2;
        String str;
        Object obj;
        Pair pair3;
        C58485gu guVar;
        C89776h hVar;
        C89776h hVar2;
        C89776h hVar3;
        C89776h hVar4;
        C89776h hVar5;
        C89776h hVar6;
        C89776h hVar7;
        C123787p pVar;
        C123787p pVar2;
        C123787p pVar3;
        C123787p pVar4;
        C123787p pVar5;
        C123787p pVar6;
        C123787p pVar7;
        C91006f fVar2 = fVar;
        Map map = (Map) Collection.EL.stream(this.f308604G).map(C110731ac.f308531a).filter(C110732ad.f308532a).collect(Collectors.partitioningBy(C110733ae.f308533a));
        C58485gu x = m184470x((List) Map.EL.getOrDefault(map, false, C58485gu.m89845m()));
        C58485gu x2 = m184470x((List) Map.EL.getOrDefault(map, true, C58485gu.m89845m()));
        C58528ij y = m184471y(x);
        C58528ij y2 = m184471y(x2);
        if (x2.isEmpty()) {
            pair = new Pair(C60856cj.m92900i(C58729pv.f156485a), C60856cj.m92900i(C58733pz.f156496a));
        } else {
            pair = new Pair(this.f308609L.mo98822a().mo98778c(m184472z(x2), (C58528ij) Collection.EL.stream(x2).map(C110746ar.f308564a).collect(C58370cn.f155947b)), this.f308609L.mo98822a().mo98776a(y2));
        }
        if (x.isEmpty()) {
            pair2 = new Pair(C60856cj.m92900i(C58729pv.f156485a), C60856cj.m92900i(C58733pz.f156496a));
        } else {
            C58714pg z = m184472z(x);
            pair2 = new Pair(this.f308598A.mo28201a("Check calendar provider instances for dump", new C110749au(this, z, ((Long) z.f156457c.mo55176b()).longValue() - ((Long) z.f156456b.mo55176b()).longValue())), this.f308598A.mo28201a("Check calendar provider calendars for dump", new C110750av(this, y)));
        }
        fVar2.mo85291r("ProactiveServiceManager");
        Iterator it = this.f308604G.iterator();
        while (it.hasNext()) {
            C92113i iVar = (C92113i) it.next();
            C50818do doVar = iVar.f256820a;
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            boolean z2 = iVar.f256821b != null;
            Iterator it2 = it;
            fVar2.mo85279c("CardType").mo85276a(C90752i.m148229c(C92111g.m151146a(a)));
            C91006f e = fVar2.mo85281e((Object) null);
            e.mo85279c("CurrentTimeMillis").mo85276a(C90752i.m148230d(Long.valueOf(this.f308625p.mo26870b())));
            C58528ij ijVar = y;
            C58528ij ijVar2 = y2;
            e.mo85279c("CardUpdateTimeMillis").mo85276a(C90752i.m148230d(Long.valueOf(doVar.f132317n)));
            C91005e c = e.mo85279c("CardExpiryTimeMillis");
            C50796ct ctVar = doVar.f132320q;
            if (ctVar == null) {
                ctVar = C50796ct.f132223c;
            }
            c.mo85276a(C90752i.m148230d(Long.valueOf(ctVar.f132226b)));
            e.mo85279c("isDiscardRequest").mo85276a(C90752i.m148228b(Boolean.valueOf(doVar.f132305b)));
            e.mo85279c("isTriggering").mo85276a(C90752i.m148228b(Boolean.valueOf(iVar.f256822c)));
            e.mo85279c("hasIcon").mo85276a(C90752i.m148228b(Boolean.valueOf(z2)));
            if (a != C50794cr.WEATHER) {
                C91005e c2 = e.mo85279c("Pre event title");
                C50802cz czVar = doVar.f132308e;
                if (czVar == null) {
                    czVar = C50802cz.f132236g;
                }
                C50723h hVar8 = czVar.f132239b;
                if (hVar8 == null) {
                    hVar8 = C50723h.f131999e;
                }
                c2.mo85276a(C90752i.m148233g(hVar8.f132002b));
                C91005e c3 = e.mo85279c("During event title");
                C50802cz czVar2 = doVar.f132309f;
                if (czVar2 == null) {
                    czVar2 = C50802cz.f132236g;
                }
                C50723h hVar9 = czVar2.f132239b;
                if (hVar9 == null) {
                    hVar9 = C50723h.f131999e;
                }
                c3.mo85276a(C90752i.m148233g(hVar9.f132002b));
            } else {
                C91005e c4 = e.mo85279c("Pre event title");
                C50802cz czVar3 = doVar.f132308e;
                if (czVar3 == null) {
                    czVar3 = C50802cz.f132236g;
                }
                C50723h hVar10 = czVar3.f132239b;
                if (hVar10 == null) {
                    hVar10 = C50723h.f131999e;
                }
                c4.mo85276a(C90752i.m148229c(hVar10.f132002b));
                C91005e c5 = e.mo85279c("During event title");
                C50802cz czVar4 = doVar.f132309f;
                if (czVar4 == null) {
                    czVar4 = C50802cz.f132236g;
                }
                C50723h hVar11 = czVar4.f132239b;
                if (hVar11 == null) {
                    hVar11 = C50723h.f131999e;
                }
                c5.mo85276a(C90752i.m148229c(hVar11.f132002b));
            }
            e.mo85279c("workProfile").mo85276a(C90752i.m148228b(Boolean.valueOf(doVar.f132322s)));
            if (a == C50794cr.CALENDAR) {
                C50813dj djVar = doVar.f132329z;
                if (djVar == null) {
                    djVar = C50813dj.f132278a;
                }
                C62940bt r5 = C62942bv.checkIsLite(C50749bn.f132064d);
                djVar.mo58887l(r5);
                Object l = djVar.f169962ag.mo58854l(r5.f169971d);
                if (l == null) {
                    obj = r5.f169969b;
                } else {
                    obj = r5.mo58889c(l);
                }
                C50749bn bnVar = (C50749bn) obj;
                C91006f e2 = fVar2.mo85281e((Object) null);
                e2.mo85291r("Calendar event detail");
                C91005e c6 = e2.mo85279c("Event data case");
                int a2 = C50748bm.m85914a(bnVar.f132066a);
                String str2 = a2 != 1 ? a2 != 2 ? a2 != 3 ? "null" : "EVENTDATA_NOT_SET" : "LOCAL_CALENDAR_DATA" : "CALENDAR_EVENT";
                if (a2 != 0) {
                    c6.mo85276a(C90752i.m148229c(str2));
                    int a3 = C50748bm.m85914a(bnVar.f132066a);
                    int i = a3 - 1;
                    if (a3 != 0) {
                        if (i != 0) {
                            guVar = x;
                            if (i != 1) {
                                y = ijVar;
                                it = it2;
                                y2 = ijVar2;
                                x = guVar;
                            } else {
                                C91005e c7 = e2.mo85279c("Provider ID");
                                if (bnVar.f132066a == 2) {
                                    pVar = (C123787p) bnVar.f132067b;
                                } else {
                                    pVar = C123787p.f341948n;
                                }
                                pair3 = pair2;
                                c7.mo85276a(C90752i.m148230d(Long.valueOf(pVar.f341951b)));
                                C91005e c8 = e2.mo85279c("Title");
                                if (bnVar.f132066a == 2) {
                                    pVar2 = (C123787p) bnVar.f132067b;
                                } else {
                                    pVar2 = C123787p.f341948n;
                                }
                                c8.mo85276a(C90752i.m148233g(pVar2.f341953d));
                                C91005e c9 = e2.mo85279c("Start time");
                                if (bnVar.f132066a == 2) {
                                    pVar3 = (C123787p) bnVar.f132067b;
                                } else {
                                    pVar3 = C123787p.f341948n;
                                }
                                c9.mo85276a(C90752i.m148231e(Instant.ofEpochSecond(pVar3.f341954e)));
                                C91005e c10 = e2.mo85279c("End time");
                                if (bnVar.f132066a == 2) {
                                    pVar4 = (C123787p) bnVar.f132067b;
                                } else {
                                    pVar4 = C123787p.f341948n;
                                }
                                c10.mo85276a(C90752i.m148231e(Instant.ofEpochSecond(pVar4.f341955f)));
                                C91005e c11 = e2.mo85279c("Event ID");
                                if (bnVar.f132066a == 2) {
                                    pVar5 = (C123787p) bnVar.f132067b;
                                } else {
                                    pVar5 = C123787p.f341948n;
                                }
                                c11.mo85276a(C90752i.m148230d(Long.valueOf(pVar5.f341952c)));
                                C91005e c12 = e2.mo85279c("Sync ID");
                                if (bnVar.f132066a == 2) {
                                    pVar6 = (C123787p) bnVar.f132067b;
                                } else {
                                    pVar6 = C123787p.f341948n;
                                }
                                c12.mo85276a(C90752i.m148229c(pVar6.f341960k));
                                C91005e c13 = e2.mo85279c("Calendar ID");
                                if (bnVar.f132066a == 2) {
                                    pVar7 = (C123787p) bnVar.f132067b;
                                } else {
                                    pVar7 = C123787p.f341948n;
                                }
                                c13.mo85276a(C90752i.m148230d(Long.valueOf(pVar7.f341959j)));
                            }
                        } else {
                            guVar = x;
                            pair3 = pair2;
                            C91005e c14 = e2.mo85279c("Provider ID");
                            if (bnVar.f132066a == 1) {
                                hVar = (C89776h) bnVar.f132067b;
                            } else {
                                hVar = C89776h.f242979p;
                            }
                            c14.mo85276a(C90752i.m148230d(Long.valueOf(hVar.f242982b)));
                            C91005e c15 = e2.mo85279c("Title");
                            if (bnVar.f132066a == 1) {
                                hVar2 = (C89776h) bnVar.f132067b;
                            } else {
                                hVar2 = C89776h.f242979p;
                            }
                            c15.mo85276a(C90752i.m148233g(hVar2.f242984d));
                            C91005e c16 = e2.mo85279c("Start time");
                            if (bnVar.f132066a == 1) {
                                hVar3 = (C89776h) bnVar.f132067b;
                            } else {
                                hVar3 = C89776h.f242979p;
                            }
                            c16.mo85276a(C90752i.m148231e(Instant.ofEpochSecond(hVar3.f242985e)));
                            C91005e c17 = e2.mo85279c("End time");
                            if (bnVar.f132066a == 1) {
                                hVar4 = (C89776h) bnVar.f132067b;
                            } else {
                                hVar4 = C89776h.f242979p;
                            }
                            c17.mo85276a(C90752i.m148231e(Instant.ofEpochSecond(hVar4.f242986f)));
                            C91005e c18 = e2.mo85279c("Event ID");
                            if (bnVar.f132066a == 1) {
                                hVar5 = (C89776h) bnVar.f132067b;
                            } else {
                                hVar5 = C89776h.f242979p;
                            }
                            c18.mo85276a(C90752i.m148230d(Long.valueOf(hVar5.f242983c)));
                            C91005e c19 = e2.mo85279c("Sync ID");
                            if (bnVar.f132066a == 1) {
                                hVar6 = (C89776h) bnVar.f132067b;
                            } else {
                                hVar6 = C89776h.f242979p;
                            }
                            c19.mo85276a(C90752i.m148229c(hVar6.f242993m));
                            C91005e c20 = e2.mo85279c("Calendar ID");
                            if (bnVar.f132066a == 1) {
                                hVar7 = (C89776h) bnVar.f132067b;
                            } else {
                                hVar7 = C89776h.f242979p;
                            }
                            c20.mo85276a(C90752i.m148230d(Long.valueOf(hVar7.f242992l)));
                        }
                        y = ijVar;
                        it = it2;
                        y2 = ijVar2;
                        x = guVar;
                        pair2 = pair3;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                Pair pair4 = pair2;
                y = ijVar;
                it = it2;
                y2 = ijVar2;
            }
        }
        C58485gu guVar2 = x;
        C58528ij ijVar3 = y;
        C58528ij ijVar4 = y2;
        Pair pair5 = pair2;
        for (C83802r rVar : this.f308624o) {
            if (rVar.mo77094d().mo56113h() && (((C50738bc) rVar.mo77094d().mo56107c()).f132034a & 8) != 0) {
                C50701am a4 = C50701am.m85887a(((C50738bc) rVar.mo77094d().mo56107c()).f132040g);
                if (a4 == null) {
                    a4 = C50701am.UNKNOWN;
                }
                boolean z3 = (((C50738bc) rVar.mo77094d().mo56107c()).f132034a & 4) != 0;
                C91005e c21 = fVar2.mo85279c("ChipType");
                switch (a4.ordinal()) {
                    case 1:
                        str = "Debug";
                        break;
                    case 2:
                        str = "Home controls";
                        break;
                    case 3:
                        str = "Order coffee";
                        break;
                    case 4:
                        str = "Play media";
                        break;
                    case 5:
                        str = "Rideshare";
                        break;
                    case 6:
                        str = "Shopping list";
                        break;
                    case 7:
                        str = "At transit stop";
                        break;
                    case 8:
                        str = "Restaurant deeplink";
                        break;
                    case 9:
                        str = "Call recommendations";
                        break;
                    case 10:
                        str = "Set alarm";
                        break;
                    case 11:
                        str = "Query song";
                        break;
                    case 12:
                        str = "Flight";
                        break;
                    case 13:
                        str = "Home context";
                        break;
                    case 14:
                        str = "Headphone context";
                        break;
                    case 15:
                        str = "Weather today";
                        break;
                    case 16:
                        str = "Weather next day";
                        break;
                    case 17:
                        str = "Agenda today";
                        break;
                    case 18:
                        str = "Agenda next day";
                        break;
                    case 19:
                        str = "Next stop commute";
                        break;
                    case 20:
                        str = "Night sounds";
                        break;
                    case 21:
                        str = "Do not disturb";
                        break;
                    case 22:
                        str = "Store context";
                        break;
                    case 23:
                        str = "App suggestions";
                        break;
                    case 24:
                        str = "Loyalty card";
                        break;
                    case 25:
                        str = "Gas station payment";
                        break;
                    case 26:
                        str = "Tv remote";
                        break;
                    case 27:
                        str = "Navigate to";
                        break;
                    case 28:
                        str = "Freq home queries";
                        break;
                    case 29:
                        str = "Parking payment";
                        break;
                    case 30:
                        str = "Location feedback";
                        break;
                    case 31:
                        str = "Blocking bt devices";
                        break;
                    case 32:
                        str = "Restaurant context";
                        break;
                    case 33:
                        str = "Work context";
                        break;
                    case 34:
                        str = "Turn off flashlight";
                        break;
                    case 35:
                        str = "Play media active";
                        break;
                    case 36:
                        str = "Adjust alarm";
                        break;
                    case 37:
                        str = "Drive mode";
                        break;
                    default:
                        str = BuildConfig.FLAVOR;
                        break;
                }
                c21.mo85276a(C90752i.m148229c(str));
                C91006f e3 = fVar2.mo85281e((Object) null);
                e3.mo85279c("CurrentTimeMillis").mo85276a(C90752i.m148230d(Long.valueOf(this.f308625p.mo26870b())));
                C91005e c22 = e3.mo85279c("ChipStartTimeMillis");
                C49156z zVar = ((C50738bc) rVar.mo77094d().mo56107c()).f132041h;
                if (zVar == null) {
                    zVar = C49156z.f127111d;
                }
                C63042fg fgVar = zVar.f127114b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                c22.mo85276a(C90752i.m148230d(Long.valueOf(fgVar.f170154a * 1000)));
                C91005e c23 = e3.mo85279c("ChipExpiryTimeMillis");
                C49156z zVar2 = ((C50738bc) rVar.mo77094d().mo56107c()).f132041h;
                if (zVar2 == null) {
                    zVar2 = C49156z.f127111d;
                }
                C63042fg fgVar2 = zVar2.f127115c;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                c23.mo85276a(C90752i.m148230d(Long.valueOf(fgVar2.f170154a * 1000)));
                e3.mo85279c("hasIcon").mo85276a(C90752i.m148228b(Boolean.valueOf(z3)));
                e3.mo85279c("Event title").mo85276a(C90752i.m148233g(((C50738bc) rVar.mo77094d().mo56107c()).f132037d));
            }
        }
        m184467B(x2, ijVar4, pair, "Work", fVar2);
        m184467B(guVar2, ijVar3, pair5, "Personal", fVar2);
    }

    /* renamed from: h */
    public final C60870cx mo98870h(List list) {
        if (list.isEmpty()) {
            return C60856cj.m92899h(new IllegalStateException("No chips present"));
        }
        Stream stream = Collection.EL.stream(list);
        C110766bk bkVar = this.f308600C;
        Objects.requireNonNull(bkVar);
        return C60856cj.m92896e((List) stream.map(new C110753ay(bkVar)).collect(Collectors.toList()));
    }

    /* renamed from: i */
    public final C60870cx mo98871i(C60870cx cxVar) {
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26756)).mo56386p("handleNewCardUpdate");
        return this.f308598A.mo28210j(cxVar, "handleNewCardUpdate", new C110751aw(this));
    }

    /* renamed from: j */
    public final C60870cx mo98872j(C60870cx cxVar) {
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26757)).mo56386p("handleWeatherCardUpdate");
        return this.f308598A.mo28210j(cxVar, "handleWeatherCardUpdate", new C110762bg(this));
    }

    /* renamed from: k */
    public final C60870cx mo98873k(C83800p pVar) {
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26764)).mo56386p("resendCurrentCards");
        if (this.f308612c.mo77175m()) {
            return mo98875m(pVar);
        }
        C58495hd i = pVar.mo77065i();
        return this.f308614e.mo28210j(mo98869g(pVar), BuildConfig.FLAVOR, new C110747as(this, i, pVar));
    }

    /* renamed from: l */
    public final C60870cx mo98874l(C83800p pVar) {
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26765)).mo56386p("resendCurrentCardsForLauncher");
        if (this.f308612c.mo77175m()) {
            return mo98875m(pVar);
        }
        ArrayList arrayList = new ArrayList();
        C58495hd i = pVar.mo77065i();
        return this.f308614e.mo28210j(mo98869g(pVar), BuildConfig.FLAVOR, new C110736ah(this, i, arrayList, pVar));
    }

    /* renamed from: m */
    public final C60870cx mo98875m(C83800p pVar) {
        if (!C142574h.m231178b(this.f308610M.mo117178i().f386862c) || !this.f308627r.mo79746e(C90017bw.f248038o)) {
            if (!this.f308612c.mo77161F() || pVar.mo77056b().f228253d.isEmpty()) {
                C50818do doVar = pVar.mo77056b().f228252c;
                if (doVar == null) {
                    doVar = C50818do.f132293H;
                }
                m184468C(C58485gu.m89846n(doVar), pVar.mo77059e());
            } else {
                m184468C(pVar.mo77056b().f228253d, pVar.mo77059e());
            }
            ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26766)).mo56386p("#sendEchoUpdates");
            List r = mo98880r(pVar.mo77065i());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(pVar.mo77061f());
            return this.f308598A.mo28210j(this.f308598A.mo28210j(this.f308599B.mo77191a(new Pair(arrayList, r)), BuildConfig.FLAVOR, new C110790z(this)), BuildConfig.FLAVOR, new C110761bf(this, pVar));
        }
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26767)).mo56386p("Echo updates in work profile path is not necessary.");
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: n */
    public final C60870cx mo98876n(C92113i[] iVarArr, C60870cx cxVar, C83800p pVar) {
        mo98882t(pVar);
        if (this.f308612c.mo77172j()) {
            return mo98878p(iVarArr, cxVar);
        }
        return mo98877o(iVarArr);
    }

    /* renamed from: o */
    public final C60870cx mo98877o(C92113i[] iVarArr) {
        C58976aa aaVar = C58975e.f156826a;
        mo98883u(iVarArr);
        m184466A(iVarArr);
        ArrayList arrayList = new ArrayList();
        for (C92033ac b : this.f308611b) {
            arrayList.add(b.mo86687b(iVarArr));
        }
        return C118826c.m197212b(arrayList);
    }

    /* renamed from: p */
    public final C60870cx mo98878p(C92113i[] iVarArr, C60870cx cxVar) {
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26769)).mo56386p("transmitSmartspaceContent");
        m184466A(iVarArr);
        return this.f308598A.mo28210j(C60856cj.m92907p(C60856cj.m92900i(iVarArr), cxVar), "transmitSmartspaceContent", new C110748at(this, iVarArr));
    }

    /* renamed from: q */
    public final C60870cx mo98879q(C83800p pVar) {
        ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26770)).mo56386p("updateCurrentCard");
        if (this.f308612c.mo77175m()) {
            return mo98875m(pVar);
        }
        C58495hd i = pVar.mo77065i();
        return this.f308614e.mo28210j(mo98869g(pVar), BuildConfig.FLAVOR, new C110738aj(this, pVar, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final List mo98880r(java.util.Map map) {
        List arrayList = new ArrayList();
        if (map.containsKey(C83799o.CURRENT)) {
            arrayList.addAll((java.util.Collection) map.get(C83799o.CURRENT));
        }
        if (this.f308612c.mo77184w() && this.f308612c.mo77185x() && this.f308612c.mo77183v()) {
            arrayList = (List) Collection.EL.stream(arrayList).filter(new C110787w(this)).collect(Collectors.toList());
        }
        if (map.containsKey(C83799o.OTHER) && this.f308617h.f256848d.mo86766v()) {
            arrayList.addAll((java.util.Collection) Collection.EL.stream((List) map.get(C83799o.OTHER)).filter(new C110788x(this)).collect(Collectors.toList()));
        }
        return arrayList;
    }

    /* renamed from: s */
    public final void mo98881s(C92113i[] iVarArr) {
        for (C92113i iVar : iVarArr) {
            if (iVar.f256822c) {
                C50818do doVar = iVar.f256820a;
                C50794cr crVar = C50794cr.UNDEFINED;
                C50794cr a = C50794cr.m85938a(doVar.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                int ordinal = a.ordinal();
                if (ordinal == 1) {
                    this.f308605H.mo77192a(C118569b.SMARTSPACE_WEATHER_SEND_SURFACE, 1);
                } else if (ordinal == 2) {
                    this.f308605H.mo77192a(C118569b.SMARTSPACE_CALENDAR_SEND_SURFACE, 1);
                    if (doVar.f132322s) {
                        this.f308605H.mo77192a(C118569b.SMARTSPACE_CALENDAR_UPDATE_WORK_PROFILE, 1);
                    }
                    if (doVar.f132323t) {
                        this.f308605H.mo77192a(C118569b.SMARTSPACE_CALENDAR_UPDATE_THIRD_PARTY, 1);
                    }
                }
                C50794cr a2 = C50794cr.m85938a(doVar.f132315l);
                if (a2 == null) {
                    a2 = C50794cr.UNDEFINED;
                }
                C50794cr crVar2 = a2;
                this.f308620k.mo109943p(crVar2, this.f308618i.mo86685b());
                this.f308603F.mo110243b(C31164au.m58091a(C31164au.m58092b("SmartspaceUpdate_"), C31164au.m58093c((String) null, crVar2)));
                boolean z = this.f308616g.u() && this.f308616g.w();
                boolean z2 = doVar.f132323t;
                if (doVar.f132322s) {
                    C60856cj.m92911t(this.f308602E.f308254b.mo98824a().mo98787a(crVar2, z, z2), new C110580am(), C60826bg.f164896a);
                } else {
                    C92125t tVar = this.f308619j;
                    C58485gu a3 = this.f308618i.mo86684a();
                    C50813dj djVar = doVar.f132329z;
                    if (djVar == null) {
                        djVar = C50813dj.f132278a;
                    }
                    tVar.mo86699d(crVar2, z, false, z2, a3, djVar);
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo98882t(C83800p pVar) {
        C50818do doVar;
        long j;
        C58833ax axVar;
        C50818do doVar2;
        long j2;
        C58976aa aaVar = C58975e.f156826a;
        List<C83741am> r = mo98880r(pVar.mo77065i());
        C58833ax e = mo98867e(pVar);
        int i = 0;
        if (!this.f308606I.mo56912b(f308596w)) {
            long j3 = f308597x;
            C62910ar arVar = (C62910ar) this.f308612c.f228394e.mo79754t(C89985ax.f246680aG, C62910ar.f169858c.getParserForType());
            if (arVar == null) {
                C59104x d = C83794j.f228388a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaSsSharedUtils");
                ((C59052c) ((C59052c) d).mo56372aa(6842)).mo56386p("Failed to get weather_background_refresh_param_reset_duration_seconds flag.");
                j2 = 7200000;
            } else {
                j2 = C62948a.m95453d(arVar);
            }
            if (j3 + j2 < this.f308625p.mo26870b()) {
                ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26781)).mo56359L("Reset weather fresh attempts to zero: weatherRefreshAttempts=%d, weatherRefreshFirstAttemptTimeMillis=%d, current time=%d", Integer.valueOf(f308596w), Long.valueOf(f308597x), Long.valueOf(this.f308625p.mo26870b()));
                f308596w = 0;
            }
        }
        this.f308625p.mo26870b();
        this.f308606I.mo56912b(f308596w);
        int i2 = 2;
        if (this.f308606I.mo56912b(f308596w)) {
            C110780p pVar2 = this.f308633z;
            long millis = Duration.ofMillis(this.f308606I.mo56909a(f308596w)).toMillis();
            if (!pVar2.f308674b.mo86742c(C50794cr.WEATHER)) {
                axVar = C58836b.f156633a;
            } else if (!e.mo56113h()) {
                axVar = C58833ax.m90834k(pVar2.mo98889a(millis));
            } else {
                C83741am amVar = (C83741am) e.mo56107c();
                if (!pVar2.f308673a.mo77175m() || !pVar2.f308673a.mo77161F() || amVar.f228253d.isEmpty()) {
                    doVar2 = amVar.f228252c;
                    if (doVar2 == null) {
                        doVar2 = C50818do.f132293H;
                    }
                } else {
                    doVar2 = (C50818do) C58557jl.m90131l(amVar.f228253d);
                }
                C50794cr a = C50794cr.m85938a(doVar2.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                if (a != C50794cr.WEATHER) {
                    ((C58970a) ((C58970a) pVar2.f308675c.mo56226d()).mo56372aa(26741)).mo56386p("Received non-weather card for background weather refresh task");
                    axVar = C58836b.f156633a;
                } else if (pVar2.f308674b.mo86741b(doVar2)) {
                    axVar = C58833ax.m90834k(pVar2.mo98889a(millis));
                } else {
                    axVar = C58836b.f156633a;
                }
            }
            if (axVar.mo56113h()) {
                C110780p pVar3 = this.f308633z;
                long j4 = ((C92092h) axVar.mo56107c()).f256736c;
                int a2 = C92091g.m151125a(((C92092h) axVar.mo56107c()).f256735b);
                if (a2 != 0) {
                    i2 = a2;
                }
                pVar3.mo98890b(j4, i2);
                if (f308596w == 0) {
                    f308597x = this.f308625p.mo26870b();
                }
                ((C58970a) ((C58970a) this.f308623n.mo56224b()).mo56372aa(26780)).mo56359L("Scheduled weather background task: weatherRefreshAttempts=%d, weatherRefreshFirstAttemptTimeMillis=%d, current time=%d", Integer.valueOf(f308596w), Long.valueOf(f308597x), Long.valueOf(this.f308625p.mo26870b()));
                f308596w++;
                this.f308620k.mo109909ag();
                return;
            }
        }
        if (e.mo56113h()) {
            r.add((C83741am) e.mo56107c());
        }
        long j5 = Long.MAX_VALUE;
        for (C83741am amVar2 : r) {
            if (!this.f308612c.mo77175m() || !this.f308612c.mo77161F() || amVar2.f228253d.isEmpty()) {
                doVar = amVar2.f228252c;
                if (doVar == null) {
                    doVar = C50818do.f132293H;
                }
            } else {
                doVar = (C50818do) C58557jl.m90131l(amVar2.f228253d);
            }
            C50794cr a3 = C50794cr.m85938a(doVar.f132315l);
            if (a3 == null) {
                a3 = C50794cr.UNDEFINED;
            }
            if (a3.equals(C50794cr.FLIGHT)) {
                if (doVar.f132318o - this.f308601D.f228268e.mo26870b() > C131179d.f358765a) {
                    j = doVar.f132318o - C131179d.f358765a;
                } else {
                    C50796ct ctVar = doVar.f132320q;
                    if (ctVar == null) {
                        ctVar = C50796ct.f132223c;
                    }
                    j = ctVar.f132226b;
                }
            } else {
                C50796ct ctVar2 = doVar.f132320q;
                if (ctVar2 == null) {
                    ctVar2 = C50796ct.f132223c;
                }
                j = ctVar2.f132226b;
            }
            if (!this.f308613d.mo86741b(doVar)) {
                C50794cr a4 = C50794cr.m85938a(doVar.f132315l);
                if (a4 == null) {
                    a4 = C50794cr.UNDEFINED;
                }
                if (C92111g.m151147e(a4)) {
                    C92111g gVar = this.f308613d;
                    C50794cr a5 = C50794cr.m85938a(doVar.f132315l);
                    if (a5 == null) {
                        a5 = C50794cr.UNDEFINED;
                    }
                    if (gVar.mo86742c(a5) && j < j5) {
                        C50794cr a6 = C50794cr.m85938a(doVar.f132315l);
                        if (a6 == null) {
                            a6 = C50794cr.UNDEFINED;
                        }
                        i = a6 == C50794cr.WEATHER ? 3 : 2;
                        j5 = j;
                    }
                }
            }
        }
        if (i != 0) {
            this.f308633z.mo98890b(j5, i);
        }
    }

    /* renamed from: u */
    public final void mo98883u(C92113i[] iVarArr) {
        this.f308604G.clear();
        Collections.addAll(this.f308604G, iVarArr);
    }

    /* renamed from: v */
    public final boolean mo98884v() {
        return this.f308612c.mo77184w() && this.f308612c.mo77185x() && this.f308612c.mo77186y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.smartspace.C92113i[] mo98885w(com.google.common.base.C58833ax r6, com.google.common.base.C58833ax r7, java.util.List r8, java.util.List r9, boolean r10) {
        /*
            r5 = this;
            r0 = 0
            com.google.android.apps.gsa.smartspace.i[] r1 = new com.google.android.apps.gsa.smartspace.C92113i[r0]
            boolean r2 = r6.mo56113h()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0066
            boolean r2 = r7.mo56113h()
            if (r2 == 0) goto L_0x0066
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0028
            java.lang.Object r8 = r6.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.am r8 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r8
            com.google.assistant.c.do r8 = r8.f228252c
            if (r8 != 0) goto L_0x0023
            com.google.assistant.c.do r8 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x0023:
            android.graphics.Bitmap r8 = r5.mo98865a(r8)
            goto L_0x002e
        L_0x0028:
            java.lang.Object r8 = r8.get(r0)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        L_0x002e:
            r1 = 2
            com.google.android.apps.gsa.smartspace.i[] r1 = new com.google.android.apps.gsa.smartspace.C92113i[r1]
            com.google.android.apps.gsa.smartspace.i r2 = new com.google.android.apps.gsa.smartspace.i
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.am r6 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r6
            com.google.assistant.c.do r6 = r6.f228252c
            if (r6 != 0) goto L_0x003f
            com.google.assistant.c.do r6 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x003f:
            r2.<init>(r6, r8, r4)
            r1[r0] = r2
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            java.lang.Object r6 = r9.get(r0)
            r3 = r6
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L_0x0052:
            com.google.android.apps.gsa.smartspace.i r6 = new com.google.android.apps.gsa.smartspace.i
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.am r7 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r7
            com.google.assistant.c.do r7 = r7.f228252c
            if (r7 != 0) goto L_0x0060
            com.google.assistant.c.do r7 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x0060:
            r6.<init>(r7, r3, r10)
            r1[r4] = r6
            goto L_0x00c8
        L_0x0066:
            boolean r2 = r6.mo56113h()
            if (r2 == 0) goto L_0x009f
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x0083
            java.lang.Object r7 = r6.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.am r7 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r7
            com.google.assistant.c.do r7 = r7.f228252c
            if (r7 != 0) goto L_0x007e
            com.google.assistant.c.do r7 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x007e:
            android.graphics.Bitmap r7 = r5.mo98865a(r7)
            goto L_0x0089
        L_0x0083:
            java.lang.Object r7 = r8.get(r0)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
        L_0x0089:
            com.google.android.apps.gsa.smartspace.i[] r1 = new com.google.android.apps.gsa.smartspace.C92113i[r4]
            com.google.android.apps.gsa.smartspace.i r8 = new com.google.android.apps.gsa.smartspace.i
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.am r6 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r6
            com.google.assistant.c.do r6 = r6.f228252c
            if (r6 != 0) goto L_0x0099
            com.google.assistant.c.do r6 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x0099:
            r8.<init>(r6, r7, r4)
            r1[r0] = r8
            goto L_0x00c8
        L_0x009f:
            boolean r6 = r7.mo56113h()
            if (r6 == 0) goto L_0x00c8
            com.google.android.apps.gsa.smartspace.i[] r1 = new com.google.android.apps.gsa.smartspace.C92113i[r4]
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L_0x00ae
            goto L_0x00b5
        L_0x00ae:
            java.lang.Object r6 = r9.get(r0)
            r3 = r6
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L_0x00b5:
            com.google.android.apps.gsa.smartspace.i r6 = new com.google.android.apps.gsa.smartspace.i
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.am r7 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r7
            com.google.assistant.c.do r7 = r7.f228252c
            if (r7 != 0) goto L_0x00c3
            com.google.assistant.c.do r7 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x00c3:
            r6.<init>(r7, r3, r10)
            r1[r0] = r6
        L_0x00c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi.mo98885w(com.google.common.base.ax, com.google.common.base.ax, java.util.List, java.util.List, boolean):com.google.android.apps.gsa.smartspace.i[]");
    }
}
