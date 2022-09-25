package com.airbnb.lottie.p234a.p236b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p245f.C4954k;
import com.airbnb.lottie.p246g.C4956a;

/* renamed from: com.airbnb.lottie.a.b.m */
/* compiled from: PG */
public final class C4814m extends C4956a {

    /* renamed from: a */
    public Path f15310a;

    /* renamed from: o */
    private final C4956a f15311o;

    public C4814m(C4964k kVar, C4956a aVar) {
        super(kVar, (PointF) aVar.f15731b, (PointF) aVar.f15732c, aVar.f15733d, aVar.f15734e, aVar.f15735f, aVar.f15736g, aVar.f15737h);
        this.f15311o = aVar;
        mo9748a();
    }

    /* renamed from: a */
    public final void mo9748a() {
        Object obj;
        Object obj2;
        Object obj3 = this.f15732c;
        boolean z = false;
        if (!(obj3 == null || (obj2 = this.f15731b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.f15732c).y))) {
            z = true;
        }
        Object obj4 = this.f15731b;
        if (obj4 != null && (obj = this.f15732c) != null && !z) {
            C4956a aVar = this.f15311o;
            this.f15310a = C4954k.m13723f((PointF) obj4, (PointF) obj, aVar.f15742m, aVar.f15743n);
        }
    }
}
