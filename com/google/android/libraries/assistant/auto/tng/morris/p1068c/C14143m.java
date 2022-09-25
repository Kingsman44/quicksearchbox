package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.p4552o.p4566l.C60200dk;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.m */
/* compiled from: PG */
final class C14143m extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C14144n f42860a;

    /* renamed from: b */
    private boolean f42861b = false;

    public C14143m(C14144n nVar) {
        this.f42860a = nVar;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || motionEvent2.getY() - motionEvent.getY() <= 100.0f || Math.abs(f2) <= 50.0f) {
            return false;
        }
        C14144n nVar = this.f42860a;
        C14132bf bfVar = nVar.f42864a;
        View view = nVar.f42866c;
        view.getClass();
        bfVar.mo21448e(view, C60200dk.DOWN);
        this.f42860a.f42865b.mo21463b();
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f42860a.f42865b.mo21465d()) {
            View view = this.f42860a.f42866c;
            view.getClass();
            if (view.getTranslationY() - f2 < 0.0f) {
                View view2 = this.f42860a.f42866c;
                view2.getClass();
                view2.setTranslationY(0.0f);
                return false;
            }
            if (this.f42861b) {
                View view3 = this.f42860a.f42866c;
                view3.getClass();
                view3.setTranslationY(view3.getTranslationY() - f2);
            }
            this.f42861b = !this.f42861b;
            return true;
        } else if (!this.f42860a.f42865b.mo21466e()) {
            return false;
        } else {
            if (this.f42861b) {
                View view4 = this.f42860a.f42866c;
                view4.getClass();
                view4.setTranslationX(view4.getTranslationX() - f);
            }
            this.f42861b = !this.f42861b;
            return true;
        }
    }
}
