package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.e */
/* compiled from: PG */
final class C111260e implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C111262g f309601a;

    /* renamed from: b */
    private int f309602b;

    /* renamed from: c */
    private int f309603c;

    /* renamed from: d */
    private float f309604d;

    /* renamed from: e */
    private float f309605e;

    public C111260e(C111262g gVar) {
        this.f309601a = gVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams layoutParams2 = this.f309601a.f309613f;
        if (layoutParams2 == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                int i = this.f309602b;
                float rawX = motionEvent.getRawX();
                float f = this.f309604d;
                int i2 = this.f309603c;
                float rawY = motionEvent.getRawY();
                float f2 = this.f309605e;
                C111262g gVar = this.f309601a;
                float f3 = (float) (i + ((int) (rawX - f)));
                float f4 = (float) (i2 + ((int) (rawY - f2)));
                if (!(gVar.f309611d == null || gVar.f309612e == null || (layoutParams = gVar.f309613f) == null)) {
                    ((WindowManager.LayoutParams) Objects.requireNonNull(layoutParams)).x = Math.max(Math.min((int) f3, gVar.f309617j), gVar.f309616i);
                    ((WindowManager.LayoutParams) Objects.requireNonNull(gVar.f309613f)).y = Math.max(Math.min((int) f4, gVar.f309619l), gVar.f309618k);
                    gVar.f309611d.updateViewLayout(gVar.f309612e, (ViewGroup.LayoutParams) Objects.requireNonNull(gVar.f309613f));
                }
            }
            return true;
        }
        this.f309602b = layoutParams2.x;
        this.f309603c = layoutParams2.y;
        this.f309604d = motionEvent.getRawX();
        this.f309605e = motionEvent.getRawY();
        return true;
    }
}
