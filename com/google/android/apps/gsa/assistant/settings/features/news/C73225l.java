package com.google.android.apps.gsa.assistant.settings.features.news;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.news.l */
/* compiled from: PG */
final class C73225l implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C73229p f194044a;

    /* renamed from: b */
    final /* synthetic */ q f194045b;

    public C73225l(q qVar, C73229p pVar) {
        this.f194045b = qVar;
        this.f194044a = pVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.f194045b.a.mo2468k(this.f194044a);
        return false;
    }
}
