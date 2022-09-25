package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.g */
/* compiled from: PG */
public final class C97219g {

    /* renamed from: a */
    public static final int[] f271613a = new int[2];

    /* renamed from: a */
    public static C97214b m160925a(DisplayManager displayManager) {
        C97213a aVar = (C97213a) m160926b(displayManager);
        return new C97213a(aVar.f271607a / 2.0f, aVar.f271608b / 2.0f);
    }

    /* renamed from: b */
    public static C97214b m160926b(DisplayManager displayManager) {
        Point point = new Point();
        displayManager.getDisplay(0).getSize(point);
        return new C97213a((float) point.x, (float) point.y);
    }

    /* renamed from: c */
    public static void m160927c(View view, Rect rect) {
        int[] iArr = f271613a;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        rect.set(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }
}
