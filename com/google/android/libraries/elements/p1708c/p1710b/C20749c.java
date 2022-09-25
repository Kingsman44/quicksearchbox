package com.google.android.libraries.elements.p1708c.p1710b;

import android.support.p033v7.widget.C0666ga;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewParent;

/* renamed from: com.google.android.libraries.elements.c.b.c */
/* compiled from: PG */
public final class C20749c extends C0666ga {

    /* renamed from: a */
    private final C20748b f58073a;

    public C20749c(RecyclerView recyclerView) {
        this.f58073a = new C20748b(recyclerView);
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (recyclerView.canScrollHorizontally(-1)) {
            C20748b bVar = this.f58073a;
            ViewParent parent = bVar.f58072c.getParent();
            int action = motionEvent.getAction();
            if (action == 0) {
                bVar.f58070a.set(motionEvent.getX(), motionEvent.getY());
                parent.requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - bVar.f58070a.x);
                float abs2 = Math.abs(motionEvent.getY() - bVar.f58070a.y);
                if (((float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)))) >= bVar.f58071b) {
                    double atan2 = (double) ((float) Math.atan2((double) abs2, (double) abs));
                    Double.isNaN(atan2);
                    if (((float) (atan2 * 57.29577951308232d)) < 40.0f) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    } else {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action != 3) {
                parent.requestDisallowInterceptTouchEvent(false);
            } else {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return false;
    }
}
