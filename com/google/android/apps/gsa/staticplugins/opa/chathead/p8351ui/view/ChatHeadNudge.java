package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.view.ChatHeadNudge */
/* compiled from: PG */
public class ChatHeadNudge extends View {

    /* renamed from: a */
    public static final Duration f300841a = Duration.ofSeconds(2);

    /* renamed from: b */
    public static final Duration f300842b = Duration.ofSeconds(1);

    /* renamed from: c */
    public ObjectAnimator f300843c;

    public ChatHeadNudge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo96509a(View view) {
        setX((view.getX() + ((float) (view.getWidth() / 2))) - ((float) (getWidth() / 2)));
        setY((view.getY() + ((float) (view.getHeight() / 2))) - ((float) (getHeight() / 2)));
    }

    /* renamed from: b */
    public final void mo96510b() {
        if (getVisibility() == 0) {
            animate().alpha(0.0f).setDuration(f300842b.toMillis()).withEndAction(new C108179a(this)).start();
        }
    }
}
