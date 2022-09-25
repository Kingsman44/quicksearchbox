package com.google.android.libraries.search.p3055n.p3078f.p3080b;

import com.google.android.libraries.search.p3055n.C39658cl;
import com.google.android.libraries.search.p3055n.C39659cm;
import com.google.android.libraries.search.p3055n.p3058b.p3060b.C39280aa;
import com.google.android.libraries.search.p3055n.p3058b.p3060b.C39330e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66767ah;
import com.google.speech.p5218j.C66768ai;
import com.google.speech.p5218j.C66860cf;
import com.google.speech.p5218j.C66861cg;
import com.google.speech.p5218j.C66862ch;
import com.google.speech.p5218j.C66865ck;
import com.google.speech.p5218j.C66870cp;
import com.google.speech.p5218j.C66872cr;
import com.google.speech.p5218j.C66940fc;
import com.google.speech.p5218j.C66948fk;
import com.google.speech.p5218j.C66950fm;
import java.util.Collections;
import p3186j$.util.Collection;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.n.f.b.d */
/* compiled from: PG */
public final /* synthetic */ class C39701d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39711n f104475a;

    /* renamed from: b */
    public final /* synthetic */ C66950fm f104476b;

    public /* synthetic */ C39701d(C39711n nVar, C66950fm fmVar) {
        this.f104475a = nVar;
        this.f104476b = fmVar;
    }

    public final C60870cx apply(Object obj) {
        C39711n nVar = this.f104475a;
        C66950fm fmVar = this.f104476b;
        C39659cm cmVar = (C39659cm) obj;
        C39658cl a = C39658cl.m69121a(cmVar.f104401b);
        if (a == null) {
            a = C39658cl.DEFAULT_UNKNOWN;
        }
        if (a != C39658cl.SUCCESS) {
            C59052c cVar = (C59052c) ((C59052c) C39711n.f104491a.mo56226d()).mo56372aa(53810);
            C39658cl a2 = C39658cl.m69121a(cmVar.f104401b);
            if (a2 == null) {
                a2 = C39658cl.DEFAULT_UNKNOWN;
            }
            cVar.mo56389s("SodaAsrController failed to start. Status: %s", a2.name());
            return C60856cj.m92900i(C39711n.m69150a(fmVar, false));
        }
        C39280aa aaVar = (C39280aa) nVar.f104497f.get();
        C66860cf cfVar = (C66860cf) C66861cg.f181783b.createBuilder();
        for (C66940fc fcVar : fmVar.f181994b) {
            int i = fcVar.f181952a;
            if (i == 7) {
                C66948fk a3 = C66948fk.m97389a(((Integer) fcVar.f181953b).intValue());
                if (a3 == null) {
                    a3 = C66948fk.QP_UNKNOWN;
                }
                cfVar.mo59745a((C58485gu) Collection.EL.stream(((C66870cp) Map.EL.getOrDefault(Collections.unmodifiableMap(((C66872cr) Map.EL.getOrDefault(Collections.unmodifiableMap(nVar.f104503l.f181816a), fmVar.f181995c, C66872cr.f181810b)).f181812a), Long.valueOf((long) a3.f181990o), C66870cp.f181804c)).f181806a).map(new C39708k(a3)).collect(C58370cn.f155946a));
            } else if (i == 8) {
                C66768ai aiVar = (C66768ai) fcVar.f181953b;
                C66862ch chVar = (C66862ch) C66865ck.f181787h.createBuilder();
                int a4 = C66767ah.m97344a(aiVar.f181591b);
                if (a4 == 0) {
                    a4 = 2;
                }
                int i2 = a4 - 1;
                int i3 = i2 != 2 ? i2 != 3 ? 1 : 4 : 2;
                chVar.copyOnWrite();
                C66865ck ckVar = (C66865ck) chVar.instance;
                ckVar.f181792d = i3 - 1;
                ckVar.f181789a |= 1;
                String str = aiVar.f181593d;
                chVar.copyOnWrite();
                C66865ck ckVar2 = (C66865ck) chVar.instance;
                str.getClass();
                ckVar2.f181790b = 8;
                ckVar2.f181791c = str;
                String str2 = aiVar.f181592c;
                chVar.copyOnWrite();
                C66865ck ckVar3 = (C66865ck) chVar.instance;
                str2.getClass();
                ckVar3.f181789a |= 2;
                ckVar3.f181793e = str2;
                cfVar.copyOnWrite();
                C66861cg cgVar = (C66861cg) cfVar.instance;
                C66865ck ckVar4 = (C66865ck) chVar.build();
                ckVar4.getClass();
                cgVar.mo59746a();
                cgVar.f181785a.add(ckVar4);
            }
        }
        return C60922j.m93045h(C60846c.m92879h(aaVar.f103471b.mo51512b(new C39330e(aaVar, (C66861cg) cfVar.build()), aaVar.f103473d), NullPointerException.class, C47810es.m84966f(C39706i.f104485a), nVar.f104494c), C47810es.m84966f(new C39707j(nVar, fmVar)), nVar.f104494c);
    }
}
