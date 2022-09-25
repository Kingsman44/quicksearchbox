package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a;

import android.graphics.Point;
import android.hardware.display.DisplayManager;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.a.h */
/* compiled from: PG */
public final class C15138h {
    /* renamed from: a */
    public static C15134d m31707a(DisplayManager displayManager) {
        Point point = new Point();
        displayManager.getDisplay(0).getSize(point);
        return new C15133c((float) point.x, (float) point.y);
    }
}
