package com.google.android.libraries.elements.internal;

import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0666ga;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewParent;

/* renamed from: com.google.android.libraries.elements.internal.at */
/* compiled from: PG */
public final class C21340at extends C0666ga {

    /* renamed from: a */
    private boolean f59704a = false;

    /* renamed from: b */
    private boolean f59705b = false;

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        C0653fo foVar;
        if (!this.f59704a) {
            this.f59704a = true;
            ViewParent parent = recyclerView.getParent();
            while (true) {
                if (parent != null) {
                    if ((parent instanceof RecyclerView) && (foVar = ((RecyclerView) parent).mLayout) != null && foVar.canScrollVertically()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    z = false;
                    break;
                }
            }
            this.f59705b = z;
        }
        if (this.f59705b && motionEvent.getAction() == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
