package com.airbnb.lottie.p238c.p241c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.p234a.p235a.C4786e;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4870m;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.c.h */
/* compiled from: PG */
public final class C4884h extends C4878b {

    /* renamed from: h */
    private final C4786e f15592h;

    public C4884h(C4825ac acVar, C4882f fVar) {
        super(acVar, fVar);
        C4786e eVar = new C4786e(acVar, this, new C4870m("__container", fVar.f15570a, false));
        this.f15592h = eVar;
        eVar.mo9719f(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        super.mo9716c(rectF, matrix, z);
        this.f15592h.mo9716c(rectF, this.f15539a, z);
    }

    /* renamed from: i */
    public final void mo9812i(Canvas canvas, Matrix matrix, int i) {
        this.f15592h.mo9715b(canvas, matrix, i);
    }

    /* renamed from: k */
    public final void mo9814k(C4890e eVar, int i, List list, C4890e eVar2) {
        this.f15592h.mo9718e(eVar, i, list, eVar2);
    }
}
