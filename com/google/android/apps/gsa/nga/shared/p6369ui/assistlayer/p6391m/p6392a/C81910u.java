package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.airbnb.lottie.LottieAnimationView;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.u */
/* compiled from: PG */
public final /* synthetic */ class C81910u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f223981a;

    public /* synthetic */ C81910u(int i) {
        this.f223981a = i;
    }

    public final void accept(Object obj) {
        int i = this.f223981a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        int i2 = 8;
        if (i != 68) {
            if (i == 206) {
                i = 206;
            } else {
                i2 = 0;
            }
        }
        lottieAnimationView.setVisibility(i2);
        lottieAnimationView.f15138d.mo9763g(i);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
