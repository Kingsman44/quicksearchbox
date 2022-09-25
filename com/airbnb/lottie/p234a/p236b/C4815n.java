package com.airbnb.lottie.p234a.p236b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.n */
/* compiled from: PG */
public final class C4815n extends C4812k {

    /* renamed from: e */
    private final PointF f15312e = new PointF();

    /* renamed from: f */
    private final float[] f15313f = new float[2];

    /* renamed from: g */
    private final PathMeasure f15314g = new PathMeasure();

    /* renamed from: h */
    private C4814m f15315h;

    public C4815n(List list) {
        super(list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        C4814m mVar = (C4814m) aVar;
        Path path = mVar.f15310a;
        if (path == null) {
            return (PointF) aVar.f15731b;
        }
        C4958c cVar = this.f15301d;
        if (cVar != null) {
            float f2 = mVar.f15736g;
            mVar.f15737h.floatValue();
            PointF pointF = (PointF) mVar.f15731b;
            PointF pointF2 = (PointF) mVar.f15732c;
            mo9736c();
            PointF pointF3 = (PointF) cVar.mo9900a();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        if (this.f15315h != mVar) {
            this.f15314g.setPath(path, false);
            this.f15315h = mVar;
        }
        PathMeasure pathMeasure = this.f15314g;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f15313f, (float[]) null);
        PointF pointF4 = this.f15312e;
        float[] fArr = this.f15313f;
        pointF4.set(fArr[0], fArr[1]);
        return this.f15312e;
    }
}
