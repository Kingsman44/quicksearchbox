package com.google.android.libraries.lens.view.gleam;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.lens.view.gleam.ObjectLayerView;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.es */
/* compiled from: PG */
final class C26572es extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ ObjectLayerView f72432a;

    public C26572es(ObjectLayerView objectLayerView) {
        this.f72432a = objectLayerView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return this.f72432a.mo31647c(motionEvent).mo56113h();
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ObjectLayerView objectLayerView = this.f72432a;
        C58833ax c = objectLayerView.mo31647c(motionEvent);
        if (!c.mo56113h()) {
            return false;
        }
        C47393f.m84237h(new ObjectLayerView.C26440a((C26441a) c.mo56107c(), new PointF(motionEvent.getX() / ((float) objectLayerView.getWidth()), motionEvent.getY() / ((float) objectLayerView.getHeight()))), objectLayerView);
        return true;
    }
}
