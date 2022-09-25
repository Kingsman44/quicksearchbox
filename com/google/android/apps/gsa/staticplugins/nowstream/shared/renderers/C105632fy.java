package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fy */
/* compiled from: PG */
final class C105632fy implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C105638gd f294710a;

    public C105632fy(C105638gd gdVar) {
        this.f294710a = gdVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f294710a.f294728i.getVisibility() != 0) {
            return false;
        }
        ViewGroup viewGroup = this.f294710a.f294728i;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= viewGroup.getX() && x <= viewGroup.getX() + ((float) viewGroup.getWidth()) && y >= viewGroup.getY() && y <= viewGroup.getY() + ((float) viewGroup.getHeight());
    }
}
