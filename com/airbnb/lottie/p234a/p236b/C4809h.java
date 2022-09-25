package com.airbnb.lottie.p234a.p236b;

import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.h */
/* compiled from: PG */
public final class C4809h extends C4812k {
    public C4809h(List list) {
        super(list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        return Float.valueOf(mo9746l(aVar, f));
    }

    /* renamed from: k */
    public final float mo9744k() {
        return mo9746l(mo9737d(), mo9735b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final float mo9746l(C4956a aVar, float f) {
        if (aVar.f15731b == null || aVar.f15732c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C4958c cVar = this.f15301d;
        if (cVar != null) {
            float f2 = aVar.f15736g;
            aVar.f15737h.floatValue();
            Float f3 = (Float) aVar.f15731b;
            Float f4 = (Float) aVar.f15732c;
            mo9736c();
            Float f5 = (Float) cVar.mo9900a();
            if (f5 != null) {
                return f5.floatValue();
            }
        }
        float f6 = aVar.f15738i;
        if (f6 == -3987645.8f) {
            f6 = ((Float) aVar.f15731b).floatValue();
            aVar.f15738i = f6;
        }
        float f7 = aVar.f15739j;
        if (f7 == -3987645.8f) {
            f7 = ((Float) aVar.f15732c).floatValue();
            aVar.f15739j = f7;
        }
        return C4949f.m13709c(f6, f7, f);
    }
}
