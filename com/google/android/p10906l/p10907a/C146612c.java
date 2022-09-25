package com.google.android.p10906l.p10907a;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

/* renamed from: com.google.android.l.a.c */
/* compiled from: PG */
public class C146612c {
    public C146612c() {
        new RectF();
    }

    /* renamed from: c */
    private final C146616g m238853c(Drawable drawable) {
        if (drawable instanceof C146616g) {
            return (C146616g) drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        int i = 0;
        while (true) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (i >= layerDrawable.getNumberOfLayers()) {
                return null;
            }
            C146616g c = m238853c(layerDrawable.getDrawable(i));
            if (c != null) {
                return c;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final C146616g mo123410a(C146611b bVar) {
        Drawable background = bVar.getBackground();
        C146616g c = m238853c(background);
        if (c != null) {
            return c;
        }
        String valueOf = String.valueOf(background.getClass());
        throw new IllegalStateException("Expected a RoundedRectDrawableWithShadow or a LayerDrawable, but found a " + valueOf + ".");
    }

    /* renamed from: b */
    public final void mo123411b(C146611b bVar) {
        Rect rect = new Rect();
        mo123410a(bVar).getPadding(rect);
        View view = (View) bVar;
        view.setMinimumHeight((int) Math.ceil((double) mo123410a(bVar).mo123412a()));
        view.setMinimumWidth((int) Math.ceil((double) mo123410a(bVar).mo123413b()));
        bVar.mo123404a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
