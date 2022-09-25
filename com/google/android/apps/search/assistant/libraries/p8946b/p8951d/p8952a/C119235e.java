package com.google.android.apps.search.assistant.libraries.p8946b.p8951d.p8952a;

import com.google.android.libraries.geller.p1820g.C21878a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4985f.p5030q.C65163dx;
import com.google.protos.p4985f.p5030q.C65165dz;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5130a.C65705ad;
import com.google.protos.p5129p.p5130a.C65706ae;
import com.google.protos.p5129p.p5130a.C65707af;
import com.google.protos.p5129p.p5130a.C65708ag;
import com.google.protos.p5129p.p5130a.C65726k;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.d.a.e */
/* compiled from: PG */
public final class C119235e implements C21878a {

    /* renamed from: b */
    private static final C58528ij f332516b = new C58759qy(C65753ak.ASSISTANT_NLU_SERVER_AUX);

    /* renamed from: a */
    public final C65726k f332517a;

    /* renamed from: c */
    private final Map f332518c = new HashMap();

    /* renamed from: d */
    private final Map f332519d = new HashMap();

    /* renamed from: e */
    private final C60887da f332520e;

    /* renamed from: f */
    private boolean f332521f = false;

    public C119235e(C65726k kVar, C60887da daVar) {
        this.f332517a = kVar;
        this.f332520e = daVar;
    }

    /* renamed from: d */
    private final synchronized C60870cx m197921d(Optional... optionalArr) {
        m197924g();
        this.f332521f = true;
        C58485gu guVar = (C58485gu) DesugarArrays.stream((T[]) optionalArr).filter(C119232b.f332513a).map(new C119233c(this)).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return C60866ct.f164955a;
        }
        return C47636i.m84746e(new C60870cx[0]).mo51519b(new C119234d(guVar), this.f332520e);
    }

    /* renamed from: e */
    private final Optional m197922e(C60218r rVar) {
        if (this.f332519d.isEmpty()) {
            return Optional.empty();
        }
        this.f332519d.put(C65753ak.ASSISTANT_ON_DEVICE_ACTIVITY, C58485gu.m89846n(C65768az.f178793f));
        C65705ad adVar = (C65705ad) C65708ag.f178520d.createBuilder();
        adVar.copyOnWrite();
        C65708ag agVar = (C65708ag) adVar.instance;
        agVar.f178522a |= 2;
        agVar.f178524c = false;
        m197923f(adVar, this.f332519d, rVar);
        return Optional.m71637of((C65708ag) adVar.build());
    }

    /* renamed from: f */
    private static void m197923f(C65705ad adVar, Map map, C60218r rVar) {
        for (Map.Entry entry : map.entrySet()) {
            for (C65768az builder : (List) entry.getValue()) {
                C65706ae aeVar = (C65706ae) C65707af.f178514d.createBuilder();
                aeVar.copyOnWrite();
                C65707af afVar = (C65707af) aeVar.instance;
                afVar.f178517b = ((C65753ak) entry.getKey()).f178757bE;
                afVar.f178516a |= 1;
                C65767ay ayVar = (C65767ay) builder.toBuilder();
                C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
                C60220t tVar = rVar.f162928b;
                if (tVar == null) {
                    tVar = C60220t.f162931e;
                }
                long j = tVar.f162934b;
                cVar.copyOnWrite();
                C65139d dVar = (C65139d) cVar.instance;
                dVar.f176309a |= 1;
                dVar.f176310b = j;
                ayVar.copyOnWrite();
                C65768az azVar = (C65768az) ayVar.instance;
                C65139d dVar2 = (C65139d) cVar.build();
                dVar2.getClass();
                azVar.f178796b = dVar2;
                azVar.f178795a |= 1;
                C65768az azVar2 = (C65768az) ayVar.build();
                aeVar.copyOnWrite();
                C65707af afVar2 = (C65707af) aeVar.instance;
                azVar2.getClass();
                afVar2.f178518c = azVar2;
                afVar2.f178516a |= 2;
                adVar.mo59417a(aeVar);
            }
        }
    }

    /* renamed from: g */
    private final void m197924g() {
        if (this.f332521f) {
            throw new IllegalStateException("Cannot issue another write once persist has been issued");
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx mo27171a(C60218r rVar) {
        Optional[] optionalArr;
        Optional optional;
        optionalArr = new Optional[2];
        if (this.f332518c.isEmpty()) {
            optional = Optional.empty();
        } else {
            C65705ad adVar = (C65705ad) C65708ag.f178520d.createBuilder();
            adVar.copyOnWrite();
            C65708ag agVar = (C65708ag) adVar.instance;
            agVar.f178522a = 2 | agVar.f178522a;
            agVar.f178524c = true;
            m197923f(adVar, this.f332518c, rVar);
            optional = Optional.m71637of((C65708ag) adVar.build());
        }
        optionalArr[0] = optional;
        optionalArr[1] = m197922e(rVar);
        return m197921d(optionalArr);
    }

    /* renamed from: b */
    public final synchronized C60870cx mo27172b(C60218r rVar) {
        return m197921d(m197922e(rVar));
    }

    /* renamed from: c */
    public final synchronized void mo27173c(C65163dx dxVar) {
        m197924g();
        for (C65165dz dzVar : dxVar.f176354a) {
            C58528ij ijVar = f332516b;
            C65753ak b = C65753ak.m96797b(dzVar.f176358a);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            if (((C58759qy) ijVar).f156534a.equals(b)) {
                Map map = this.f332519d;
                C65753ak b2 = C65753ak.m96797b(dzVar.f176358a);
                if (b2 == null) {
                    b2 = C65753ak.UNKNOWN;
                }
                List list = (List) Map.EL.getOrDefault(map, b2, new ArrayList());
                list.addAll(dzVar.f176359b);
                java.util.Map map2 = this.f332519d;
                C65753ak b3 = C65753ak.m96797b(dzVar.f176358a);
                if (b3 == null) {
                    b3 = C65753ak.UNKNOWN;
                }
                map2.put(b3, list);
            } else {
                java.util.Map map3 = this.f332518c;
                C65753ak b4 = C65753ak.m96797b(dzVar.f176358a);
                if (b4 == null) {
                    b4 = C65753ak.UNKNOWN;
                }
                List list2 = (List) Map.EL.getOrDefault(map3, b4, new ArrayList());
                list2.addAll(dzVar.f176359b);
                java.util.Map map4 = this.f332518c;
                C65753ak b5 = C65753ak.m96797b(dzVar.f176358a);
                if (b5 == null) {
                    b5 = C65753ak.UNKNOWN;
                }
                map4.put(b5, list2);
            }
        }
    }
}
