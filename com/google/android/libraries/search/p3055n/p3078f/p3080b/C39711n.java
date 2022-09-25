package com.google.android.libraries.search.p3055n.p3078f.p3080b;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.arb;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p3055n.p3078f.C39691a;
import com.google.android.libraries.search.p3055n.p3081g.C39756b;
import com.google.android.libraries.search.p3055n.p3087j.C39806f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66768ai;
import com.google.speech.p5218j.C66843bu;
import com.google.speech.p5218j.C66844bv;
import com.google.speech.p5218j.C66848bz;
import com.google.speech.p5218j.C66857cc;
import com.google.speech.p5218j.C66859ce;
import com.google.speech.p5218j.C66870cp;
import com.google.speech.p5218j.C66872cr;
import com.google.speech.p5218j.C66875cu;
import com.google.speech.p5218j.C66940fc;
import com.google.speech.p5218j.C66942fe;
import com.google.speech.p5218j.C66945fh;
import com.google.speech.p5218j.C66946fi;
import com.google.speech.p5218j.C66948fk;
import com.google.speech.p5218j.C66950fm;
import com.google.speech.p5218j.C66951fn;
import com.google.speech.p5218j.C66952fo;
import com.google.speech.p5218j.p5219a.C66712ap;
import com.google.speech.p5218j.p5219a.C66713aq;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66753t;
import com.google.speech.p5218j.p5219a.C66754u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.f.b.n */
/* compiled from: PG */
public final class C39711n implements C39698a {

    /* renamed from: a */
    public static final C59071e f104491a = C59071e.m91332i("com.google.android.libraries.search.n.f.b.n");

    /* renamed from: n */
    private static final C66713aq f104492n = m69151c("MOBILE_WARM_WORDS");

    /* renamed from: b */
    public final C39691a f104493b;

    /* renamed from: c */
    public final Executor f104494c;

    /* renamed from: d */
    public final C37215b f104495d;

    /* renamed from: e */
    public final C39756b f104496e;

    /* renamed from: f */
    public Optional f104497f = Optional.empty();

    /* renamed from: g */
    public final Context f104498g;

    /* renamed from: h */
    public final C39806f f104499h;

    /* renamed from: i */
    public C66950fm f104500i;

    /* renamed from: j */
    public C66722az f104501j;

    /* renamed from: k */
    public final C47770dh f104502k;

    /* renamed from: l */
    public final C66875cu f104503l;

    /* renamed from: m */
    public final arb f104504m;

    /* renamed from: o */
    private final C66859ce f104505o;

    public C39711n(C39691a aVar, C39756b bVar, Context context, C47770dh dhVar, C60887da daVar, C39806f fVar, arb arb, C37215b bVar2, C66875cu cuVar, C66859ce ceVar) {
        this.f104493b = aVar;
        this.f104496e = bVar;
        this.f104498g = context;
        this.f104502k = dhVar;
        this.f104499h = fVar;
        this.f104494c = new C60904dr(daVar);
        this.f104500i = C66950fm.f181991d;
        this.f104501j = C66722az.f181493f;
        this.f104495d = bVar2;
        this.f104503l = cuVar;
        this.f104505o = ceVar;
        this.f104504m = arb;
    }

    /* renamed from: a */
    public static C66952fo m69150a(C66950fm fmVar, boolean z) {
        C66768ai aiVar;
        C66768ai aiVar2;
        C66951fn fnVar = (C66951fn) C66952fo.f181998c.createBuilder();
        for (C66940fc fcVar : fmVar.f181994b) {
            C66945fh fhVar = (C66945fh) C66946fi.f181970c.createBuilder();
            int i = fcVar.f181952a;
            if (i == 7) {
                C66948fk a = C66948fk.m97389a(((Integer) fcVar.f181953b).intValue());
                if (a == null) {
                    a = C66948fk.QP_UNKNOWN;
                }
                fhVar.copyOnWrite();
                C66946fi fiVar = (C66946fi) fhVar.instance;
                fiVar.f181973b = Integer.valueOf(a.f181990o);
                fiVar.f181972a = 1;
            } else {
                if (i == 8) {
                    aiVar = (C66768ai) fcVar.f181953b;
                } else {
                    aiVar = C66768ai.f181588e;
                }
                if ((aiVar.f181590a & 4) != 0) {
                    if (fcVar.f181952a == 8) {
                        aiVar2 = (C66768ai) fcVar.f181953b;
                    } else {
                        aiVar2 = C66768ai.f181588e;
                    }
                    String str = aiVar2.f181593d;
                    fhVar.copyOnWrite();
                    C66946fi fiVar2 = (C66946fi) fhVar.instance;
                    str.getClass();
                    fiVar2.f181972a = 2;
                    fiVar2.f181973b = str;
                } else {
                    throw new IllegalArgumentException("Quick phrase has neither QuickPhraseType nor CustomQuickPhrase.");
                }
            }
            if (z) {
                fnVar.copyOnWrite();
                C66952fo foVar = (C66952fo) fnVar.instance;
                C66946fi fiVar3 = (C66946fi) fhVar.build();
                fiVar3.getClass();
                C62971cq cqVar = foVar.f182001b;
                if (!cqVar.mo58948c()) {
                    foVar.f182001b = C62942bv.mutableCopy(cqVar);
                }
                foVar.f182001b.add(fiVar3);
            } else {
                C66843bu buVar = (C66843bu) C66844bv.f181759d.createBuilder();
                buVar.copyOnWrite();
                C66844bv bvVar = (C66844bv) buVar.instance;
                C66946fi fiVar4 = (C66946fi) fhVar.build();
                fiVar4.getClass();
                bvVar.f181762b = fiVar4;
                bvVar.f181761a |= 2;
                C66942fe feVar = C66942fe.CONFIG_ERROR_UNKNOWN;
                buVar.copyOnWrite();
                C66844bv bvVar2 = (C66844bv) buVar.instance;
                bvVar2.f181763c = feVar.f181962g;
                bvVar2.f181761a |= 4;
                fnVar.copyOnWrite();
                C66952fo foVar2 = (C66952fo) fnVar.instance;
                C66844bv bvVar3 = (C66844bv) buVar.build();
                bvVar3.getClass();
                C62971cq cqVar2 = foVar2.f182000a;
                if (!cqVar2.mo58948c()) {
                    foVar2.f182000a = C62942bv.mutableCopy(cqVar2);
                }
                foVar2.f182000a.add(bvVar3);
            }
        }
        return (C66952fo) fnVar.build();
    }

    /* renamed from: c */
    private static C66713aq m69151c(String str) {
        C66712ap apVar = (C66712ap) C66713aq.f181479c.createBuilder();
        C66753t tVar = (C66753t) C66754u.f181563b.createBuilder();
        tVar.mo59735b(C63088z.m96143E(str));
        apVar.copyOnWrite();
        C66713aq aqVar = (C66713aq) apVar.instance;
        C66754u uVar = (C66754u) tVar.build();
        uVar.getClass();
        aqVar.f181482b = uVar;
        aqVar.f181481a = 1;
        return (C66713aq) apVar.build();
    }

    /* renamed from: b */
    public final C66722az mo41997b(C66950fm fmVar) {
        C66948fk fkVar;
        HashMap hashMap = new HashMap();
        Iterator it = fmVar.f181994b.iterator();
        while (true) {
            int i = 1;
            if (it.hasNext()) {
                C66940fc fcVar = (C66940fc) it.next();
                if (fcVar.f181952a == 7) {
                    Map unmodifiableMap = Collections.unmodifiableMap(((C66872cr) Map.EL.getOrDefault(Collections.unmodifiableMap(this.f104503l.f181816a), fmVar.f181995c, C66872cr.f181810b)).f181812a);
                    if (fcVar.f181952a == 7) {
                        fkVar = C66948fk.m97389a(((Integer) fcVar.f181953b).intValue());
                        if (fkVar == null) {
                            fkVar = C66948fk.QP_UNKNOWN;
                        }
                    } else {
                        fkVar = C66948fk.QP_UNKNOWN;
                    }
                    int a = C66857cc.m97365a(((C66870cp) Map.EL.getOrDefault(unmodifiableMap, Long.valueOf((long) fkVar.f181990o), C66870cp.f181804c)).f181807b);
                    if (a != 0) {
                        i = a;
                    }
                    java.util.Map unmodifiableMap2 = Collections.unmodifiableMap(this.f104505o.f181782a);
                    Long valueOf = Long.valueOf((long) (i - 1));
                    if (unmodifiableMap2.containsKey(valueOf)) {
                        C66848bz bzVar = (C66848bz) Map.EL.getOrDefault(Collections.unmodifiableMap(this.f104505o.f181782a), valueOf, C66848bz.f181770c);
                        hashMap.put(bzVar.f181772a, m69151c(bzVar.f181773b));
                    }
                }
            } else {
                hashMap.size();
                C66721ay ayVar = (C66721ay) C66722az.f181493f.createBuilder();
                C66714ar arVar = (C66714ar) C66716at.f181484b.createBuilder();
                arVar.mo59713b("client-id", f104492n);
                arVar.mo59712a(hashMap);
                ayVar.copyOnWrite();
                C66722az azVar = (C66722az) ayVar.instance;
                C66716at atVar = (C66716at) arVar.build();
                atVar.getClass();
                azVar.f181497c = atVar;
                azVar.f181495a |= 1;
                return (C66722az) ayVar.build();
            }
        }
    }
}
