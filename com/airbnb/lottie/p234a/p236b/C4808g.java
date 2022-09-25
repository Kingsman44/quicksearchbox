package com.airbnb.lottie.p234a.p236b;

import com.airbnb.lottie.p245f.C4945b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.g */
/* compiled from: PG */
public final class C4808g extends C4812k {
    public C4808g(List list) {
        super(list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        return Integer.valueOf(mo9745l(aVar, f));
    }

    /* renamed from: k */
    public final int mo9744k() {
        return mo9745l(mo9737d(), mo9735b());
    }

    /* renamed from: l */
    public final int mo9745l(C4956a aVar, float f) {
        Object obj = aVar.f15731b;
        if (obj == null || aVar.f15732c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) aVar.f15732c).intValue();
        C4958c cVar = this.f15301d;
        if (cVar != null) {
            float f2 = aVar.f15736g;
            aVar.f15737h.floatValue();
            mo9736c();
            Integer num = (Integer) cVar.mo9900a();
            if (num != null) {
                return num.intValue();
            }
        }
        return C4945b.m13692a(C4949f.m13708b(f, 0.0f, 1.0f), intValue, intValue2);
    }
}
