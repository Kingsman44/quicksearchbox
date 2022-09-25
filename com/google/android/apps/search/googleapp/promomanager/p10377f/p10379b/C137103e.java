package com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.b.e */
/* compiled from: PG */
final class C137103e extends C1770c {

    /* renamed from: a */
    final /* synthetic */ C137105g f373081a;

    /* renamed from: b */
    private final View f373082b;

    /* renamed from: c */
    private final C63932bs f373083c;

    /* renamed from: d */
    private final int f373084d;

    public C137103e(C137105g gVar, View view, C63932bs bsVar, int i) {
        this.f373081a = gVar;
        this.f373082b = view;
        this.f373083c = bsVar;
        this.f373084d = i;
    }

    /* renamed from: f */
    public final boolean mo4958f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f373081a.f373090e;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (C2043bi.m5569aw(this.f373081a.f373088c) && this.f373081a.f373088c.isShown()) {
            C137105g gVar = this.f373081a;
            if (gVar.f373089d != null) {
                Rect a = C137105g.m222808a(gVar.f373088c);
                int[] iArr = new int[2];
                coordinatorLayout.getLocationInWindow(iArr);
                int measuredHeight = this.f373082b.getMeasuredHeight();
                int measuredWidth = this.f373082b.getMeasuredWidth();
                int width = coordinatorLayout.getWidth();
                int paddingLeft = coordinatorLayout.getPaddingLeft();
                int paddingRight = coordinatorLayout.getPaddingRight();
                int centerX = a.centerX() - iArr[0];
                int i2 = a.top - iArr[1];
                int i3 = measuredHeight / 2;
                int i4 = i2 - i3;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                int min = Math.min((width - measuredWidth2) - (this.f373084d + paddingRight), Math.max(this.f373084d + paddingLeft, centerX - (measuredWidth2 / 2)));
                int height = this.f373083c == C63932bs.ABOVE ? (i4 + measuredHeight) - measuredHeight2 : (i4 + a.height()) - i3;
                view.layout(min, height, measuredWidth2 + min, measuredHeight2 + height + measuredHeight);
                View view2 = this.f373082b;
                view2.setTranslationX((float) (((centerX - (measuredWidth / 2)) - min) - view2.getLeft()));
                this.f373081a.f373089d.setVisibility(0);
                return true;
            }
        }
        this.f373081a.mo113524b();
        return false;
    }

    /* renamed from: j */
    public final boolean mo4962j(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return true;
    }

    /* renamed from: k */
    public final boolean mo4963k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f373081a.f373090e;
        if (gestureDetector == null) {
            return true;
        }
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: l */
    public final boolean mo4964l(View view, View view2) {
        return true;
    }

    /* renamed from: p */
    public final void mo4968p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        view.requestLayout();
    }
}
