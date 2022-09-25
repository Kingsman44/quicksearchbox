package com.airbnb.lottie.p238c.p240b;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.b.k */
/* compiled from: PG */
public final class C4868k {

    /* renamed from: a */
    public final List f15504a;

    /* renamed from: b */
    public PointF f15505b;

    /* renamed from: c */
    public boolean f15506c;

    public C4868k() {
        this.f15504a = new ArrayList();
    }

    public final String toString() {
        int size = this.f15504a.size();
        boolean z = this.f15506c;
        return "ShapeData{numCurves=" + size + "closed=" + z + "}";
    }

    public C4868k(PointF pointF, boolean z, List list) {
        this.f15505b = pointF;
        this.f15506c = z;
        this.f15504a = new ArrayList(list);
    }
}
