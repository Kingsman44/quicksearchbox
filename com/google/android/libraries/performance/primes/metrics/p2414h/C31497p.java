package com.google.android.libraries.performance.primes.metrics.p2414h;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.p */
/* compiled from: PG */
final class C31497p implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C31493m f84803a;

    /* renamed from: b */
    private final AtomicReference f84804b;

    public C31497p(C31493m mVar, View view) {
        this.f84803a = mVar;
        this.f84804b = new AtomicReference(view);
    }

    public final boolean onPreDraw() {
        View view = (View) this.f84804b.getAndSet((Object) null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            C19559g.m37302a().postAtFrontOfQueue(new C31495n(this.f84803a));
            C19559g.m37302a().post(new C31496o(this.f84803a));
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onPreDraw", e);
        }
        return true;
    }
}
