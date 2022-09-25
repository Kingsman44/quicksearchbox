package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.o */
/* compiled from: PG */
public final class C105078o {
    /* renamed from: a */
    public static void m174319a(View view, int i, int i2, int i3, int i4, Runnable runnable) {
        view.setVisibility(0);
        if (C2043bi.m5569aw(view)) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, (float) i3, (float) i4);
            createCircularReveal.setDuration(100);
            if (runnable != null) {
                createCircularReveal.addListener(new C105077n(runnable));
            }
            createCircularReveal.start();
        }
    }

    /* renamed from: b */
    public static void m174320b(View view, Runnable runnable) {
        if (view.isLaidOut()) {
            runnable.run();
            return;
        }
        view.addOnLayoutChangeListener(new C105076m(runnable));
        if (view.getVisibility() == 8) {
            view.setVisibility(4);
        }
    }
}
