package com.google.android.libraries.home.coreui.devicetile;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.cd */
/* compiled from: PG */
public final class C23712cd extends TouchDelegate {

    /* renamed from: a */
    private final List f64862a = new ArrayList();

    public C23712cd(View view) {
        super(new Rect(), view);
    }

    /* renamed from: a */
    public final void mo29060a(TouchDelegate touchDelegate) {
        this.f64862a.add(touchDelegate);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C69664n.m101061g(motionEvent, "event");
        Iterator it = this.f64862a.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                motionEvent.setLocation(motionEvent.getX(), motionEvent.getY());
                if (((TouchDelegate) it.next()).onTouchEvent(motionEvent) || z) {
                    z = true;
                }
            }
        }
    }
}
