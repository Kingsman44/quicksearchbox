package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66291n;
import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.research.a.c.o */
/* compiled from: PG */
final class C66324o {

    /* renamed from: a */
    long f180336a = 0;

    /* renamed from: b */
    int f180337b = 0;

    /* renamed from: c */
    long f180338c = 0;

    /* renamed from: d */
    int f180339d = 0;

    /* renamed from: e */
    long f180340e = 0;

    /* renamed from: f */
    Map f180341f = new HashMap();

    /* renamed from: g */
    final Map f180342g = new HashMap();

    /* renamed from: a */
    static C66324o m96992a(C66376a aVar) {
        C66324o oVar = new C66324o();
        if (aVar.mo59463f() == 1) {
            oVar.f180337b = 1;
            oVar.f180338c = aVar.mo59458a();
            oVar.f180336a = aVar.mo59467j().mo59503c();
        } else if (C66326q.m96994c(aVar) && C66326q.m96993a(aVar) != -1) {
            int a = C66326q.m96993a(aVar);
            String b = aVar.mo59466i().mo59479b();
            String b2 = C66291n.m96856b((C66307h) aVar.mo59466i().mo59480c().get(a), aVar.mo59466i().mo59478a());
            oVar.f180337b = 1;
            oVar.f180338c = aVar.mo59458a();
            oVar.f180336a = aVar.mo59467j().mo59503c();
            oVar.f180339d = 1;
            oVar.f180340e = aVar.mo59467j().mo59503c();
            oVar.f180342g.put(b, 1);
            HashMap hashMap = new HashMap();
            C66325p pVar = new C66325p();
            pVar.f180344b = 1;
            pVar.f180343a = aVar.mo59467j().mo59503c();
            pVar.f180345c.put(b, 1);
            hashMap.put(b2, pVar);
            oVar.f180341f = hashMap;
        }
        return oVar;
    }
}
