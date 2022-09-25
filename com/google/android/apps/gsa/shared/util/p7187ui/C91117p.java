package com.google.android.apps.gsa.shared.util.p7187ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.p */
/* compiled from: PG */
public abstract class C91117p implements View.OnTouchListener {

    /* renamed from: a */
    private final int f254430a;

    /* renamed from: b */
    private float f254431b;

    /* renamed from: c */
    private boolean f254432c;

    public C91117p(Context context) {
        this.f254430a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81834a();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f254431b = motionEvent.getY();
            this.f254432c = false;
        } else if (actionMasked == 2 && !this.f254432c && Math.abs(motionEvent.getY() - this.f254431b) > ((float) this.f254430a)) {
            this.f254432c = true;
            if (motionEvent.getY() < this.f254431b) {
                mo81834a();
            }
        }
        return false;
    }
}
