package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.animation.PathInterpolator;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.n */
/* compiled from: PG */
final class C27172n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ MaterialButton f74263a;

    /* renamed from: b */
    final /* synthetic */ C27177s f74264b;

    public C27172n(C27177s sVar, MaterialButton materialButton) {
        this.f74264b = sVar;
        this.f74263a = materialButton;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C27177s.f74277a.mo56226d()).mo56382g(th)).mo56372aa(49574)).mo56386p("Failed loading rotating icons.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List<Drawable> list = (List) obj;
        C58974d dVar = C27177s.f74277a;
        C27177s sVar = this.f74264b;
        MaterialButton materialButton = this.f74263a;
        int size = list.size();
        C58838bb.m90883r(size >= 2);
        ArrayList arrayList = new ArrayList();
        for (Drawable drawable : list) {
            RotateDrawable rotateDrawable = new RotateDrawable();
            rotateDrawable.setDrawable(drawable);
            arrayList.add(rotateDrawable);
        }
        if (arrayList.isEmpty()) {
            ((C58970a) ((C58970a) C27177s.f74277a.mo56225c()).mo56372aa(49578)).mo56386p("All animating share icons failed to load.");
        } else if (arrayList.size() == 1) {
            ((C58970a) ((C58970a) C27177s.f74277a.mo56225c()).mo56372aa(49577)).mo56386p("Animating share icon failed to load.");
            sVar.mo32609a(materialButton, (Drawable) arrayList.get(0));
        } else {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) arrayList.get(0), (Drawable) arrayList.get(1)});
            sVar.mo32609a(materialButton, layerDrawable);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            C27176r rVar = new C27176r(layerDrawable, arrayList, ofFloat, sVar.f74282f);
            ofFloat.addListener(rVar);
            ofFloat.addUpdateListener(rVar);
            ofFloat.setDuration(800);
            ofFloat.setInterpolator(new PathInterpolator(0.7f, 0.0f, 0.4f, 1.0f));
            ofFloat.setRepeatCount((size * 3) - 1);
            ofFloat.setRepeatMode(2);
            ofFloat.start();
        }
    }
}
