package com.google.android.apps.gsa.nowoverlayservice;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bc */
/* compiled from: PG */
final class C83469bc extends View.DragShadowBuilder {
    public C83469bc() {
        super((View) null);
    }

    public final void onDrawShadow(Canvas canvas) {
    }

    public final void onProvideShadowMetrics(Point point, Point point2) {
        point.set(10, 10);
        point2.set(5, 5);
    }
}
