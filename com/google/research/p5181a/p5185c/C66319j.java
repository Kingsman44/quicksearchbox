package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66294q;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;

/* renamed from: com.google.research.a.c.j */
/* compiled from: PG */
public final class C66319j extends C66316g {
    /* renamed from: a */
    public final int mo59505a() {
        return 24;
    }

    /* renamed from: b */
    public final C66316g mo59506b() {
        return new C66319j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, 24);
        int i = C66294q.m96859b(aVar2).get(11);
        oVar.f180409c[i] = 1.0d;
        int i2 = C66294q.m96859b(aVar2).get(12);
        int i3 = 23;
        if (i2 < 30) {
            int i4 = i - 1;
            if (i4 >= 0) {
                i3 = i4;
            }
            oVar.f180409c[i3] = 1.0d;
        } else if (i2 > 30) {
            int i5 = i + 1;
            if (i5 > 23) {
                i5 = 0;
            }
            oVar.f180409c[i5] = 1.0d;
        }
        return oVar;
    }

    public final /* synthetic */ Object clone() {
        return new C66319j();
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "hour_of_day";
    }
}
