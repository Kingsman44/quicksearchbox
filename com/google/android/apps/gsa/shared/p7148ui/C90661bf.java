package com.google.android.apps.gsa.shared.p7148ui;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;

/* renamed from: com.google.android.apps.gsa.shared.ui.bf */
/* compiled from: PG */
public abstract class C90661bf implements View.OnTouchListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo84957a();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C89932c.f246391b.mo83778h(view, 5);
        }
        return mo84957a();
    }
}
