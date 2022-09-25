package com.airbnb.lottie.p234a.p236b;

import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4958c;
import com.airbnb.lottie.p246g.C4959d;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.p */
/* compiled from: PG */
public final class C4817p extends C4812k {

    /* renamed from: e */
    private final C4959d f15317e = new C4959d(1.0f, 1.0f);

    public C4817p(List list) {
        super(list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        Object obj;
        Object obj2 = aVar.f15731b;
        if (obj2 == null || (obj = aVar.f15732c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C4959d dVar = (C4959d) obj2;
        C4959d dVar2 = (C4959d) obj;
        C4958c cVar = this.f15301d;
        if (cVar != null) {
            float f2 = aVar.f15736g;
            aVar.f15737h.floatValue();
            mo9736c();
            C4959d dVar3 = (C4959d) cVar.mo9900a();
            if (dVar3 != null) {
                return dVar3;
            }
        }
        C4959d dVar4 = this.f15317e;
        float c = C4949f.m13709c(dVar.f15748a, dVar2.f15748a, f);
        float f3 = dVar.f15749b;
        float f4 = dVar2.f15749b;
        dVar4.f15748a = c;
        dVar4.f15749b = C4949f.m13709c(f3, f4, f);
        return this.f15317e;
    }
}
