package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view;

import android.animation.ObjectAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.view.a */
/* compiled from: PG */
public final /* synthetic */ class C108179a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ChatHeadNudge f300849a;

    public /* synthetic */ C108179a(ChatHeadNudge chatHeadNudge) {
        this.f300849a = chatHeadNudge;
    }

    public final void run() {
        ChatHeadNudge chatHeadNudge = this.f300849a;
        chatHeadNudge.setVisibility(4);
        ObjectAnimator objectAnimator = chatHeadNudge.f300843c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
