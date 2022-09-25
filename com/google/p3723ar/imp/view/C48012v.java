package com.google.p3723ar.imp.view;

import android.view.MotionEvent;
import com.google.p3723ar.imp.view.input.InputManager;

/* renamed from: com.google.ar.imp.view.v */
/* compiled from: PG */
public final /* synthetic */ class C48012v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47981aa f124249a;

    /* renamed from: b */
    public final /* synthetic */ MotionEvent f124250b;

    public /* synthetic */ C48012v(C47981aa aaVar, MotionEvent motionEvent) {
        this.f124249a = aaVar;
        this.f124250b = motionEvent;
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        C47981aa aaVar = this.f124249a;
        MotionEvent motionEvent = this.f124250b;
        InputManager inputManager = aaVar.f124185b.f124180b;
        int actionMasked = motionEvent.getActionMasked();
        if (InputManager.f124210a.containsKey(Integer.valueOf(actionMasked))) {
            if (actionMasked == 2) {
                i2 = motionEvent.getPointerCount();
                i = 2;
            } else {
                i = actionMasked;
                i2 = 1;
            }
            int[] iArr = new int[i2];
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                if (i == 2) {
                    i3 = i4;
                } else {
                    i3 = motionEvent.getActionIndex();
                }
                iArr[i4] = motionEvent.getPointerId(i3);
                fArr[i4] = motionEvent.getX(i3);
                fArr2[i4] = motionEvent.getY(i3);
            }
            InputManager.nProcessPointerEvent(inputManager.f124211b, ((Integer) InputManager.f124210a.get(Integer.valueOf(i))).intValue(), iArr, fArr, fArr2, motionEvent.getEventTime());
        }
    }
}
