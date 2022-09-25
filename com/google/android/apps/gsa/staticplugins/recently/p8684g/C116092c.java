package com.google.android.apps.gsa.staticplugins.recently.p8684g;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.g.c */
/* compiled from: PG */
public final class C116092c extends TouchDelegate {

    /* renamed from: a */
    private final View f321891a;

    /* renamed from: b */
    private final View f321892b;

    public C116092c(View view, View view2) {
        super(new Rect(), view);
        this.f321891a = view;
        this.f321892b = view2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x < ((float) this.f321892b.getPaddingLeft()) || x > ((float) (this.f321892b.getWidth() - this.f321892b.getPaddingRight())) || y < ((float) this.f321892b.getPaddingTop()) || y > ((float) (this.f321892b.getHeight() - this.f321892b.getPaddingBottom()))) {
                return false;
            }
        }
        motionEvent.offsetLocation((float) (-this.f321891a.getLeft()), (float) (-this.f321891a.getTop()));
        return this.f321891a.dispatchTouchEvent(motionEvent);
    }
}
