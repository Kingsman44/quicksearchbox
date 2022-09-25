package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.C66309c;
import com.google.research.p5181a.C66328d;
import com.google.research.p5181a.C66384m;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5183b.p5184a.C66301b;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.research.a.c.k */
/* compiled from: PG */
public final class C66320k extends C66316g {

    /* renamed from: a */
    public static final long f180333a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    public final int mo59505a() {
        return 3;
    }

    /* renamed from: b */
    public final C66316g mo59506b() {
        return new C66320k();
    }

    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, 3);
        if (aVar2.mo59465h() == null) {
            return oVar;
        }
        C66328d dVar = ((C66384m) aVar2.mo59465h().f180312a.instance).f180504d;
        if (dVar == null) {
            dVar = C66328d.f180351e;
        }
        C66309c cVar = (C66309c) dVar.toBuilder();
        long c = aVar2.mo59467j().mo59503c() - ((C66328d) cVar.instance).f180353a;
        if (!(C66301b.m96864a(cVar) == 0.0f && C66301b.m96865b(cVar) == 0.0f && C66301b.m96866c(cVar) == 0.0f) && c >= 0 && c <= f180333a) {
            oVar.mo59557g(new float[]{C66301b.m96864a(cVar), C66301b.m96865b(cVar), C66301b.m96866c(cVar)});
        }
        return oVar;
    }

    public final /* synthetic */ Object clone() {
        return new C66320k();
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "lat_lng";
    }
}
