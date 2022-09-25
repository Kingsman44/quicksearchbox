package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105447q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105448r;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dq */
/* compiled from: PG */
final class C105570dq implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C105574du f294501a;

    public C105570dq(C105574du duVar) {
        this.f294501a = duVar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        C105447q qVar = this.f294501a.f294512a;
        ((C105448r) qVar).f294064a.mo28345s("onExpanded", "ReactionEventsDispatcher", new Bundle());
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
