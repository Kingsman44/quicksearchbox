package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.r */
/* compiled from: PG */
final class C104354r implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ int f290378a;

    /* renamed from: b */
    final /* synthetic */ int f290379b;

    /* renamed from: c */
    final /* synthetic */ C104356t f290380c;

    public C104354r(C104356t tVar, int i, int i2) {
        this.f290380c = tVar;
        this.f290378a = i;
        this.f290379b = i2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GradientDrawable gradientDrawable;
        int actionMasked = motionEvent.getActionMasked();
        LinearLayout linearLayout = this.f290380c.f290395j;
        if (linearLayout == null || (gradientDrawable = (GradientDrawable) linearLayout.getBackground()) == null) {
            return false;
        }
        if (actionMasked == 0) {
            gradientDrawable.setColor(this.f290378a);
            return false;
        } else if (actionMasked != 1 && actionMasked != 3) {
            return false;
        } else {
            gradientDrawable.setColor(this.f290379b);
            return false;
        }
    }
}
