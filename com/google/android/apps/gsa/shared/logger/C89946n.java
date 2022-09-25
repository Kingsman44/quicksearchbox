package com.google.android.apps.gsa.shared.logger;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.shared.logger.n */
/* compiled from: PG */
public final class C89946n implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ View.OnTouchListener f246444a;

    public C89946n(View.OnTouchListener onTouchListener) {
        this.f246444a = onTouchListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C89949q.m146521e(C28285c.m52882i(view, 5, (Integer) null), false);
        return this.f246444a.onTouch(view, motionEvent);
    }
}
