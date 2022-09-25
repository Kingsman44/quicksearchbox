package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105447q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105448r;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dl */
/* compiled from: PG */
final class C105565dl extends AnimatorListenerAdapter {

    /* renamed from: a */
    boolean f294495a = true;

    /* renamed from: b */
    final /* synthetic */ C105574du f294496b;

    public C105565dl(C105574du duVar) {
        this.f294496b = duVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f294495a = false;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f294495a) {
            this.f294496b.mo94918h(true);
            C105447q qVar = this.f294496b.f294512a;
            ((C105448r) qVar).f294064a.mo28345s("onCollapsedMore", "ReactionEventsDispatcher", new Bundle());
        }
    }
}
