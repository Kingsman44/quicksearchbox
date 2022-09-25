package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.libraries.r.c.b.o */
/* compiled from: PG */
final class C32111o extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C32112p f86215a;

    public C32111o(C32112p pVar) {
        this.f86215a = pVar;
    }

    public final void getOutline(View view, Outline outline) {
        int a = this.f86215a.mo37908a(view.getWidth(), view.getHeight());
        C32112p pVar = this.f86215a;
        if (pVar.f86218c) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) a);
            return;
        }
        RoundRectShape roundRectShape = new RoundRectShape(C32110n.m59819c((float) a, pVar.f86216a.f153457c, ((Boolean) pVar.f86217b.mo37837a()).booleanValue() ? 1 : 0), (RectF) null, (float[]) null);
        roundRectShape.resize((float) view.getWidth(), (float) view.getHeight());
        roundRectShape.getOutline(outline);
    }
}
