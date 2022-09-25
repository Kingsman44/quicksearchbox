package com.airbnb.lottie.p234a.p236b;

import android.graphics.PointF;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.o */
/* compiled from: PG */
public final class C4816o extends C4812k {

    /* renamed from: e */
    private final PointF f15316e = new PointF();

    public C4816o(List list) {
        super(list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        return mo9743j(aVar, f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final PointF mo9743j(C4956a aVar, float f, float f2) {
        Object obj;
        Object obj2 = aVar.f15731b;
        if (obj2 == null || (obj = aVar.f15732c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        C4958c cVar = this.f15301d;
        if (cVar != null) {
            float f3 = aVar.f15736g;
            aVar.f15737h.floatValue();
            mo9736c();
            PointF pointF3 = (PointF) cVar.mo9900a();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.f15316e.set(pointF.x + (f * (pointF2.x - pointF.x)), pointF.y + (f2 * (pointF2.y - pointF.y)));
        return this.f15316e;
    }
}
