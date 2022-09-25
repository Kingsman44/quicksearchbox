package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.b */
/* compiled from: PG */
public final class C16830b extends TimeAnimator {

    /* renamed from: b */
    public static final /* synthetic */ int f49289b = 0;

    /* renamed from: a */
    public C16829a f49290a = null;

    public final void setTimeListener(TimeAnimator.TimeListener timeListener) {
        C16829a aVar = new C16829a(timeListener);
        this.f49290a = aVar;
        super.setTimeListener(aVar);
    }

    public final void start() {
        super.start();
        C16829a aVar = this.f49290a;
        if (aVar != null) {
            aVar.f49287b = 0;
        }
    }
}
