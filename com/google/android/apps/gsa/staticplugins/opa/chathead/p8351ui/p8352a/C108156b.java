package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.p8352a;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.a.b */
/* compiled from: PG */
public final class C108156b implements View.OnTouchListener {

    /* renamed from: a */
    private final C108155a f300804a;

    /* renamed from: b */
    private final float f300805b;

    /* renamed from: c */
    private float f300806c;

    /* renamed from: d */
    private float f300807d;

    /* renamed from: e */
    private boolean f300808e;

    /* renamed from: f */
    private boolean f300809f;

    public C108156b(C108155a aVar, float f) {
        this.f300804a = aVar;
        this.f300805b = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f300806c = motionEvent.getRawX();
            this.f300807d = motionEvent.getRawY();
            this.f300808e = true;
            this.f300809f = false;
            this.f300804a.mo96495o();
            return true;
        } else if (action == 1) {
            if (this.f300808e || this.f300809f) {
                this.f300804a.mo96494n(true);
                view.performClick();
            }
            return true;
        } else if (action != 2) {
            return false;
        } else {
            float abs = Math.abs(motionEvent.getRawX() - this.f300806c);
            float abs2 = Math.abs(motionEvent.getRawY() - this.f300807d);
            float f = this.f300805b;
            if (abs2 > f) {
                this.f300808e = false;
            }
            if (this.f300808e && abs > f) {
                this.f300808e = false;
                this.f300809f = true;
                this.f300804a.mo96493m(0, 0);
            }
            return true;
        }
    }
}
