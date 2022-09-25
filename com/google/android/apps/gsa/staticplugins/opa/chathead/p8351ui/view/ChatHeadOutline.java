package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.view.ChatHeadOutline */
/* compiled from: PG */
public class ChatHeadOutline extends View {

    /* renamed from: a */
    public static final int f300844a = Color.parseColor("#9aa0a6");

    /* renamed from: d */
    private static final Duration f300845d = Duration.ofMillis(300);

    /* renamed from: b */
    public boolean f300846b = false;

    /* renamed from: c */
    public ViewPropertyAnimator f300847c;

    static {
        Color.parseColor("#4285f4");
        Duration.ofSeconds(1);
    }

    public ChatHeadOutline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo96511a() {
        if (this.f300846b) {
            this.f300846b = false;
            ViewPropertyAnimator viewPropertyAnimator = this.f300847c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator alpha = animate().alpha(0.0f);
            this.f300847c = alpha;
            alpha.start();
        }
    }

    public final ViewPropertyAnimator animate() {
        return super.animate().setDuration(f300845d.toMillis()).setStartDelay(0).withEndAction(C108180b.f300850a);
    }
}
