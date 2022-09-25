package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5183b.p5184a.C66305f;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5187e.C66360j;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.research.a.c.m */
/* compiled from: PG */
public final class C66322m extends C66316g {

    /* renamed from: a */
    public static final long f180335a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    public final int mo59505a() {
        return 125;
    }

    /* renamed from: b */
    public final C66316g mo59506b() {
        return new C66322m();
    }

    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, 125);
        if (aVar2.mo59465h() != null) {
            aVar2.mo59465h().mo59474b();
            C66305f b = aVar2.mo59465h().mo59474b();
            long c = aVar2.mo59467j().mo59503c() - b.mo59476a();
            if (!b.mo59477b().isEmpty() && c >= 0 && c <= f180335a && C66360j.f180446b.containsKey(b.mo59477b())) {
                oVar.f180409c[((Integer) C66360j.f180446b.get(b.mo59477b())).intValue()] = 1.0d;
            }
        }
        return oVar;
    }

    public final /* synthetic */ Object clone() {
        return new C66322m();
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "public_place";
    }
}
