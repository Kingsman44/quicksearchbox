package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32052b;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57406cd;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57410ch;

/* renamed from: com.google.android.libraries.r.c.b.d */
/* compiled from: PG */
public final class C32100d extends ShapeDrawable {
    public C32100d(C57410ch chVar, C32052b bVar) {
        int[] iArr = new int[chVar.f153375a.size()];
        float[] fArr = new float[chVar.f153375a.size()];
        for (int i = 0; i < chVar.f153375a.size(); i++) {
            iArr[i] = ((C57406cd) chVar.f153375a.get(i)).f153366a;
            fArr[i] = ((float) ((C57406cd) chVar.f153375a.get(i)).f153367b) / 100.0f;
        }
        setShape(new RectShape());
        setShaderFactory(new C32101e(iArr, fArr, chVar.f153376b, true != chVar.f153377c ? null : bVar));
    }
}
