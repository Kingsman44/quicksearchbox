package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81970ag;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.aq */
/* compiled from: PG */
public final /* synthetic */ class C81738aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81772bx f223586a;

    public /* synthetic */ C81738aq(C81772bx bxVar) {
        this.f223586a = bxVar;
    }

    public final void accept(Object obj) {
        C81772bx bxVar = this.f223586a;
        C81722aa aaVar = (C81722aa) obj;
        aaVar.f223559l.mo75226b(bxVar.f223665q);
        aaVar.f223563p.mo75226b(bxVar.f223665q);
        bxVar.f223667s = aaVar;
        View view = aaVar.f223553f;
        Context context = bxVar.f223660l;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int a = C19391a.m36980a(context, 16842801);
        int[] iArr = {C81970ag.m130211a(a, 28), C81970ag.m130211a(a, 247), a};
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.setShaderFactory(new C81771bw(iArr, new float[]{0.0f, 0.37f, 1.0f}));
        view.setBackground(shapeDrawable);
        bxVar.f223651c.mo76663c(bxVar.f223654f, new C83369s(bxVar.f223649a, "onSingleShadowVisibilityChanged", new C81754bf(bxVar, aaVar)));
        bxVar.f223651c.mo76663c(bxVar.f223653e, new C83369s(bxVar.f223649a, "onInputPlateChanged", new C81755bg(bxVar, aaVar)));
        bxVar.f223651c.mo76663c(bxVar.f223650b.mo75155h(), new C81756bh(bxVar, aaVar));
        C81807z zVar = new C81807z(aaVar);
        C83363m mVar = bxVar.f223651c;
        C83358h g = C83349aj.m132652g(bxVar.f223650b.mo75159l(), bxVar.f223650b.mo75165r(), C83349aj.m132658m(bxVar.f223650b.mo75159l(), C81757bi.f223614a), bxVar.f223672x.f223133a, C83349aj.m132658m(bxVar.f223650b.mo75165r(), C81758bj.f223615a), bxVar.f223672x.f223134b, new C81759bk(bxVar));
        C22871g gVar = bxVar.f223649a;
        Objects.requireNonNull(zVar);
        mVar.mo76663c(g, new C83369s(gVar, "onThemeChanged", new C81760bl(zVar)));
        bxVar.f223649a.mo28212l("[NGA] addView", new C81770bv(bxVar, aaVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
