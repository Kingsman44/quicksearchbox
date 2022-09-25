package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.C66389r;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5183b.p5184a.C66304e;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import com.google.research.p5181a.p5188f.C66377b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.research.a.c.l */
/* compiled from: PG */
public final class C66321l extends C66316g {

    /* renamed from: a */
    public static final long f180334a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    public final int mo59505a() {
        return 2;
    }

    /* renamed from: b */
    public final C66316g mo59506b() {
        return new C66321l();
    }

    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, 2);
        if (aVar2.mo59465h() != null) {
            aVar2.mo59465h().mo59473a();
            C66304e a = aVar2.mo59465h().mo59473a();
            long c = aVar2.mo59467j().mo59503c() - ((C66389r) a.f180313a.instance).f180524b;
            if (!a.mo59475a().isEmpty() && c >= 0 && c <= f180334a) {
                if (a.mo59475a().get(0) == C66377b.WORK) {
                    oVar.f180409c[0] = 1.0d;
                } else if (a.mo59475a().get(0) == C66377b.HOME) {
                    oVar.f180409c[1] = 1.0d;
                }
            }
        }
        return oVar;
    }

    public final /* synthetic */ Object clone() {
        return new C66321l();
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "private_place";
    }
}
