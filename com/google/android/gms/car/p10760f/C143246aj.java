package com.google.android.gms.car.p10760f;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.aj */
/* compiled from: PG */
public final /* synthetic */ class C143246aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388380a;

    /* renamed from: b */
    public final /* synthetic */ int f388381b;

    /* renamed from: c */
    public final /* synthetic */ MotionEvent f388382c;

    public /* synthetic */ C143246aj(C143268bb bbVar, int i, MotionEvent motionEvent) {
        this.f388380a = bbVar;
        this.f388381b = i;
        this.f388382c = motionEvent;
    }

    public final void run() {
        C143268bb bbVar = this.f388380a;
        int i = this.f388381b;
        MotionEvent motionEvent = this.f388382c;
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
            Object[] objArr = new Object[5];
            SparseArray sparseArray = C143268bb.f388432a;
            objArr[0] = bbVar.f388473v;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = motionEvent;
            objArr[3] = Boolean.valueOf(bbVar.f388461j == null);
            objArr[4] = Boolean.valueOf(bbVar.mo118218d());
            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onTouchEvent(displayId:%d, event:%s) runOnMain [serviceActivityNull:%b, serviceHasWindowFocus:%b]", objArr);
        }
        if (bbVar.f388461j != null && !bbVar.mo118218d()) {
            if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
                C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onInputFocusChange(hasFocus:%b, notInTouchMode:%b, callback:%b)", bbVar.f388473v, true, false, false);
            }
            bbVar.mo118312l(new InputFocusChangedEvent(true, true, -1, (Rect) null), false);
        }
    }
}
