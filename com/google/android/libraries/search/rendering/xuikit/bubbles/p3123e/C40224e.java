package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.e */
/* compiled from: PG */
public final /* synthetic */ class C40224e implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C40230k f105680a;

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f105681b;

    public /* synthetic */ C40224e(C40230k kVar, GestureDetector gestureDetector) {
        this.f105680a = kVar;
        this.f105681b = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C40230k kVar = this.f105680a;
        if (!this.f105681b.onTouchEvent(motionEvent) || kVar.mo42335b(motionEvent)) {
            kVar.mo42334a(motionEvent);
            return true;
        }
        view.performClick();
        kVar.f105688b.mo42277h();
        return true;
    }
}
