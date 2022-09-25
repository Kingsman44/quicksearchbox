package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.i */
/* compiled from: PG */
final class C138836i extends C138817ad {
    public C138836i() {
        super("THINKING");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        C138818ae.m225496i(bVar);
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        bVar.mo114586c(0.0f, bVar.f377646b);
        C138823a aVar = bVar.f377646b;
        float f = aVar.f377635b.f377588b;
        C138823a aVar2 = bVar.f377647c;
        float f2 = aVar2.f377635b.f377588b;
        float f3 = bVar.f377648d.f377635b.f377588b;
        C138823a aVar3 = bVar.f377649e;
        float f4 = f3 - f2;
        float f5 = aVar3.f377635b.f377588b - f3;
        if (f2 - f > 1.5707964f) {
            bVar.mo114586c(0.0f, aVar2);
        } else if (f4 > 1.5707964f) {
            bVar.mo114586c(1.5707964f, aVar2);
        } else if (f5 > 1.5707964f) {
            bVar.mo114586c(3.1415927f, aVar3);
        } else {
            bVar.mo114586c(4.712389f, aVar);
        }
        bVar.f377646b.f377635b.mo114560c(4.712389f);
        bVar.f377647c.f377635b.mo114560c(0.0f);
        bVar.f377648d.f377635b.mo114560c(1.5707964f);
        bVar.f377649e.f377635b.mo114560c(3.1415927f);
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        float f;
        C138824b bVar2 = bVar;
        float f2 = ((float) (j2 - j)) / 6000.0f;
        float f3 = f2 - ((float) ((int) f2));
        int i = C138818ae.f377619a;
        C138823a aVar = bVar2.f377646b;
        C138823a aVar2 = bVar2.f377647c;
        C138823a aVar3 = bVar2.f377648d;
        C138823a aVar4 = bVar2.f377649e;
        if (f3 < 0.16749999f) {
            aVar.f377635b.mo114560c(4.712389f);
            aVar2.f377635b.mo114560c(0.0f);
            aVar3.f377635b.mo114560c(1.5707964f);
            aVar4.f377635b.mo114560c(3.1415927f);
        } else {
            double d = (double) f3;
            if (d < 0.25d) {
                aVar.f377635b.mo114560c(4.712389f);
                aVar2.f377635b.mo114560c(1.5707964f);
                aVar3.f377635b.mo114560c(2.6179938f);
                aVar4.f377635b.mo114560c(3.6651917f);
            } else if (f3 < 0.4175f) {
                aVar.f377635b.mo114560c(0.0f);
                aVar2.f377635b.mo114560c(1.5707964f);
                aVar3.f377635b.mo114560c(3.1415927f);
                aVar4.f377635b.mo114560c(4.712389f);
            } else if (d < 0.5d) {
                aVar.f377635b.mo114560c(0.5235988f);
                aVar2.f377635b.mo114560c(1.5707964f);
                aVar3.f377635b.mo114560c(4.712389f);
                aVar4.f377635b.mo114560c(5.759587f);
            } else if (f3 < 0.6675f) {
                aVar.f377635b.mo114560c(1.5707964f);
                aVar2.f377635b.mo114560c(3.1415927f);
                aVar3.f377635b.mo114560c(4.712389f);
                aVar4.f377635b.mo114560c(0.0f);
            } else if (d < 0.75d) {
                aVar.f377635b.mo114560c(2.6179938f);
                aVar2.f377635b.mo114560c(3.6651917f);
                aVar3.f377635b.mo114560c(4.712389f);
                aVar4.f377635b.mo114560c(1.5707964f);
            } else if (f3 < 0.9175f) {
                aVar.f377635b.mo114560c(3.1415927f);
                aVar2.f377635b.mo114560c(4.712389f);
                aVar3.f377635b.mo114560c(0.0f);
                aVar4.f377635b.mo114560c(1.5707964f);
            } else if (f3 < 1.0f) {
                aVar.f377635b.mo114560c(4.712389f);
                aVar2.f377635b.mo114560c(5.759587f);
                aVar3.f377635b.mo114560c(0.5235988f);
                aVar4.f377635b.mo114560c(1.5707964f);
            }
            f = 2.0f;
            bVar2.f377652h.mo114592b(f * 3.0f);
            return true;
        }
        f = 1.0f;
        bVar2.f377652h.mo114592b(f * 3.0f);
        return true;
    }
}
