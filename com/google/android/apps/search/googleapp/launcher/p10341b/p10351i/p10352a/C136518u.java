package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.animation.ObjectAnimator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.u */
/* compiled from: PG */
public final /* synthetic */ class C136518u implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C136518u f371646a = new C136518u();

    private /* synthetic */ C136518u() {
    }

    public final void accept(Object obj) {
        ObjectAnimator objectAnimator = (ObjectAnimator) obj;
        objectAnimator.removeAllListeners();
        objectAnimator.cancel();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
