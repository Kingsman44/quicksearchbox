package com.google.android.libraries.lens.common.p2002e;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.lens.common.e.f */
/* compiled from: PG */
public final class C24112f implements C24113g {

    /* renamed from: a */
    public static final int f65831a = ViewConfiguration.getDoubleTapTimeout();

    /* renamed from: b */
    public static final C58528ij f65832b = C58528ij.m90013M(C24111e.DRAG, C24111e.DRAG_X, C24111e.DRAG_Y, C24111e.FLING);

    /* renamed from: c */
    public final GestureDetector f65833c;

    /* renamed from: d */
    public final GestureDetector f65834d;

    /* renamed from: e */
    public final int f65835e;

    /* renamed from: f */
    public final PointF f65836f = new PointF();

    /* renamed from: g */
    public final ScaleGestureDetector f65837g;

    /* renamed from: h */
    public C24110d f65838h;

    /* renamed from: i */
    public C24111e f65839i;

    /* renamed from: j */
    public C24111e f65840j;

    /* renamed from: k */
    public boolean f65841k = false;

    public C24112f(Context context) {
        this.f65835e = ViewConfiguration.get(context).getScaledTouchSlop();
        C24109c cVar = new C24109c(this);
        GestureDetector gestureDetector = new GestureDetector(context, cVar);
        this.f65834d = gestureDetector;
        gestureDetector.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) null);
        this.f65837g = new ScaleGestureDetector(context, cVar);
        GestureDetector gestureDetector2 = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
        this.f65833c = gestureDetector2;
        gestureDetector2.setOnDoubleTapListener(cVar);
    }

    /* renamed from: a */
    public final float mo29515a(MotionEvent motionEvent, int i) {
        if (i == -1) {
            return (float) Math.hypot((double) (motionEvent.getX() - this.f65836f.x), (double) (motionEvent.getY() - this.f65836f.y));
        }
        if (i != 0) {
            return Math.abs(motionEvent.getY() - this.f65836f.y);
        }
        return Math.abs(motionEvent.getX() - this.f65836f.x);
    }

    /* renamed from: b */
    public final void mo29516b(C24111e eVar) {
        C24111e eVar2;
        C24111e eVar3 = this.f65840j;
        if (eVar3 != eVar) {
            if (!(eVar3 == null || eVar3 == (eVar2 = C24111e.TOUCH))) {
                if (eVar3 == C24111e.FIRST_TAP) {
                    if (eVar == eVar2) {
                        return;
                    }
                } else if (eVar3 != C24111e.DOUBLE_TAP) {
                    int ordinal = eVar.ordinal();
                    if (!(ordinal == 8 || ordinal == 9 || eVar3 == C24111e.LONG_PRESS)) {
                        return;
                    }
                } else if (!(eVar == C24111e.DRAG || eVar == C24111e.DRAG_X || eVar == C24111e.DRAG_Y)) {
                    return;
                }
            }
            this.f65839i = this.f65840j;
            this.f65840j = eVar;
        }
    }

    /* renamed from: c */
    public final boolean mo29517c(C24111e... eVarArr) {
        for (C24111e eVar : eVarArr) {
            if (this.f65840j == eVar) {
                return true;
            }
        }
        return false;
    }
}
