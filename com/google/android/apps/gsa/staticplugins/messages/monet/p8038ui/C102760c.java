package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.view.animation.Animation;
import com.google.common.p4552o.C60572uw;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.c */
/* compiled from: PG */
final class C102760c implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ GmmIntentFuseUiView f286865a;

    /* renamed from: b */
    final /* synthetic */ C102778u f286866b;

    public C102760c(GmmIntentFuseUiView gmmIntentFuseUiView, C102778u uVar) {
        this.f286865a = gmmIntentFuseUiView;
        this.f286866b = uVar;
    }

    public final void onAnimationEnd(Animation animation) {
        GmmIntentFuseUiView gmmIntentFuseUiView = this.f286865a;
        if (!gmmIntentFuseUiView.f286858g) {
            gmmIntentFuseUiView.mo93413a();
            this.f286866b.f286889a.f286891b.mo93412f(C60572uw.STATUS_FINISHED);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
