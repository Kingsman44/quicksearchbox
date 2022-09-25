package com.airbnb.lottie.p234a.p236b;

import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.j */
/* compiled from: PG */
public final class C4811j extends C4812k {
    public C4811j(List list) {
        super(list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        return Integer.valueOf(mo9747k(aVar, f));
    }

    /* renamed from: k */
    public final int mo9747k(C4956a aVar, float f) {
        if (aVar.f15731b == null || aVar.f15732c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C4958c cVar = this.f15301d;
        if (cVar != null) {
            float f2 = aVar.f15736g;
            aVar.f15737h.floatValue();
            Integer num = (Integer) aVar.f15731b;
            Integer num2 = (Integer) aVar.f15732c;
            mo9736c();
            Integer num3 = (Integer) cVar.mo9900a();
            if (num3 != null) {
                return num3.intValue();
            }
        }
        int i = aVar.f15740k;
        if (i == 784923401) {
            i = ((Integer) aVar.f15731b).intValue();
            aVar.f15740k = i;
        }
        int i2 = aVar.f15741l;
        if (i2 == 784923401) {
            i2 = ((Integer) aVar.f15732c).intValue();
            aVar.f15741l = i2;
        }
        return C4949f.m13711e(i, i2, f);
    }
}
