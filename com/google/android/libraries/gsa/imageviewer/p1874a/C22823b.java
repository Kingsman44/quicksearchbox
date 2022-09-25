package com.google.android.libraries.gsa.imageviewer.p1874a;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.google.android.libraries.gsa.imageviewer.a.b */
/* compiled from: PG */
public final class C22823b implements View.OnTouchListener {

    /* renamed from: a */
    private final C22822a[] f62842a;

    /* renamed from: b */
    private boolean f62843b = false;

    /* renamed from: c */
    private float f62844c = -1.0f;

    /* renamed from: d */
    private int f62845d = -1;

    /* renamed from: e */
    private VelocityTracker f62846e;

    /* renamed from: f */
    private View f62847f;

    /* renamed from: g */
    private int f62848g;

    public C22823b(C22822a... aVarArr) {
        this.f62842a = aVarArr;
    }

    /* renamed from: a */
    private final float m42645a(MotionEvent motionEvent) {
        return Math.max(0.0f, (motionEvent.getRawY() - this.f62844c) - ((float) this.f62848g));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f62847f == null) {
            this.f62847f = view;
            this.f62848g = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f62846e = VelocityTracker.obtain();
        }
        if (this.f62847f.getScrollY() > 0) {
            return false;
        }
        boolean z = motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.f62845d);
        if (motionEvent.getActionMasked() == 0) {
            this.f62845d = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f62844c = motionEvent.getRawY();
            this.f62846e.clear();
            this.f62846e.addMovement(motionEvent);
            return false;
        } else if (z && motionEvent.getActionMasked() == 2) {
            float a = m42645a(motionEvent);
            if (a > 0.0f && !this.f62843b) {
                this.f62843b = true;
                C22822a[] aVarArr = this.f62842a;
                for (int i = 0; i <= 0; i++) {
                    aVarArr[i].mo28169c();
                }
            }
            if (this.f62843b) {
                C22822a[] aVarArr2 = this.f62842a;
                for (int i2 = 0; i2 <= 0; i2++) {
                    aVarArr2[i2].mo28167a(this.f62847f, a);
                }
            }
            this.f62846e.addMovement(motionEvent);
            return this.f62843b;
        } else if (!this.f62843b || !z || (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 6)) {
            return false;
        } else {
            this.f62843b = false;
            this.f62846e.addMovement(motionEvent);
            this.f62846e.computeCurrentVelocity(1);
            float yVelocity = this.f62846e.getYVelocity();
            float a2 = m42645a(motionEvent);
            boolean z2 = yVelocity > 2.0f || (yVelocity >= 0.0f && a2 > ((float) this.f62847f.getHeight()) * 0.2f);
            C22822a[] aVarArr3 = this.f62842a;
            for (int i3 = 0; i3 <= 0; i3++) {
                aVarArr3[i3].mo28168b(this.f62847f, a2, z2);
            }
            this.f62845d = -1;
            this.f62843b = false;
            return true;
        }
    }
}
