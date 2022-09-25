package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.h */
/* compiled from: PG */
public final class C97220h {
    /* renamed from: a */
    public static void m160928a(View view, boolean z) {
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            view.setLayerType(2, paint);
            return;
        }
        view.setLayerType(0, (Paint) null);
    }
}
