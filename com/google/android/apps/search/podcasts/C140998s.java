package com.google.android.apps.search.podcasts;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.podcasts.s */
/* compiled from: PG */
final class C140998s implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f382794a;

    /* renamed from: b */
    final /* synthetic */ Runnable f382795b;

    public C140998s(View view, Runnable runnable) {
        this.f382794a = view;
        this.f382795b = runnable;
    }

    public final void onGlobalLayout() {
        this.f382794a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f382795b.run();
    }
}
