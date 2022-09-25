package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10402b;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.b.f */
/* compiled from: PG */
public final class C137349f implements View.OnTouchListener {

    /* renamed from: a */
    private final C137348e[] f373600a;

    /* renamed from: b */
    private boolean f373601b = false;

    /* renamed from: c */
    private float f373602c = -1.0f;

    /* renamed from: d */
    private int f373603d = -1;

    /* renamed from: e */
    private final VelocityTracker f373604e = VelocityTracker.obtain();

    /* renamed from: f */
    private int f373605f = -1;

    public C137349f(C137348e... eVarArr) {
        this.f373600a = eVarArr;
    }

    /* renamed from: a */
    private final float m223168a(MotionEvent motionEvent) {
        return Math.max(0.0f, (motionEvent.getRawY() - this.f373602c) - ((float) this.f373605f));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f373605f == -1) {
            this.f373605f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        }
        if (view.getScrollY() > 0) {
            return false;
        }
        boolean z = motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.f373603d);
        if (motionEvent.getActionMasked() == 0) {
            this.f373603d = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f373602c = motionEvent.getRawY();
            this.f373604e.clear();
            this.f373604e.addMovement(motionEvent);
            return true;
        } else if (z && motionEvent.getActionMasked() == 2) {
            float a = m223168a(motionEvent);
            if (a > 0.0f && !this.f373601b) {
                this.f373601b = true;
                this.f373600a[0].mo113676c();
            }
            if (this.f373601b) {
                this.f373600a[0].mo113674a(view, a);
            }
            this.f373604e.addMovement(motionEvent);
            return this.f373601b;
        } else if (!this.f373601b || !z || (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 6)) {
            return false;
        } else {
            this.f373601b = false;
            this.f373604e.addMovement(motionEvent);
            this.f373604e.computeCurrentVelocity(1);
            float yVelocity = this.f373604e.getYVelocity();
            float a2 = m223168a(motionEvent);
            this.f373600a[0].mo113675b(view, a2, yVelocity > 2.0f || (yVelocity >= 0.0f && a2 > ((float) view.getHeight()) * 0.2f));
            this.f373603d = -1;
            this.f373601b = false;
            return true;
        }
    }
}
