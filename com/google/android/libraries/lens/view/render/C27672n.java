package com.google.android.libraries.lens.view.render;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.libraries.lens.view.p2146j.C27212a;

/* renamed from: com.google.android.libraries.lens.view.render.n */
/* compiled from: PG */
final class C27672n extends View {

    /* renamed from: a */
    final /* synthetic */ C27673o f75551a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27672n(C27673o oVar, Context context) {
        super(context);
        this.f75551a = oVar;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        C27673o oVar = this.f75551a;
        if (!oVar.f75560i) {
            f = C27673o.f75552a.getInterpolation(Math.min(((float) oVar.mo33163a()) / 248.0f, 1.0f));
        } else {
            f = C27673o.f75552a.getInterpolation(1.0f - Math.min(((float) (oVar.mo33163a() - oVar.f75559h)) / 248.0f, 1.0f)) * oVar.f75561j;
        }
        oVar.f75556e.setAlpha(C27212a.m50467c(f));
        canvas.drawPath(oVar.f75555d, oVar.f75556e);
    }
}
