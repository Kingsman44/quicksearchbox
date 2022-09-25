package com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.view.View;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.f.f */
/* compiled from: PG */
public final class C40252f {

    /* renamed from: a */
    public static final int[] f105723a = new int[2];

    /* renamed from: a */
    public static C40248b m69867a(DisplayManager displayManager) {
        C40247a aVar = (C40247a) m69868b(displayManager);
        return new C40247a(aVar.f105717a / 2.0f, aVar.f105718b / 2.0f);
    }

    /* renamed from: b */
    public static C40248b m69868b(DisplayManager displayManager) {
        Point point = new Point();
        displayManager.getDisplay(0).getSize(point);
        return new C40247a((float) point.x, (float) point.y);
    }

    /* renamed from: c */
    public static void m69869c(View view, Rect rect) {
        int[] iArr = f105723a;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        rect.set(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }
}
