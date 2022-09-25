package com.google.android.material.p3506c;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.google.android.material.c.a */
/* compiled from: PG */
public final class C44580a implements View.OnTouchListener {

    /* renamed from: a */
    private final Dialog f116023a;

    /* renamed from: b */
    private final int f116024b;

    /* renamed from: c */
    private final int f116025c;

    public C44580a(Dialog dialog, Rect rect) {
        this.f116023a = dialog;
        this.f116024b = rect.left;
        this.f116025c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f116024b + findViewById.getLeft();
        int width = findViewById.getWidth();
        int top = this.f116025c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) (left + width), (float) (top + findViewById.getHeight())).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.f116023a.onTouchEvent(obtain);
    }
}
