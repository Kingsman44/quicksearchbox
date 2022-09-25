package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80701cc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.f */
/* compiled from: PG */
public final /* synthetic */ class C81895f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223961a;

    public /* synthetic */ C81895f(C81889aq aqVar) {
        this.f223961a = aqVar;
    }

    public final void accept(Object obj) {
        float f;
        C81889aq aqVar = this.f223961a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        float f2 = (float) (-aqVar.f223939x);
        if (((C80701cc) aqVar.f223920e.mo75154g().mo76657c()).mo74441d()) {
            f = 0.0f;
        } else {
            f = aqVar.f223938w;
        }
        lottieAnimationView.setTranslationY(f2 + f);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
