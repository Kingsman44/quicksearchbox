package com.google.android.libraries.search.rendering.xuikit.bubbles.view;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.view.a */
/* compiled from: PG */
public final class C40259a extends CoordinatorLayout {

    /* renamed from: i */
    public Runnable f105752i;

    public C40259a(Context context) {
        super(context);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f105752i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
