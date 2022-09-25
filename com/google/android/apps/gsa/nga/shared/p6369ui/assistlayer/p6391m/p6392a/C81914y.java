package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import android.graphics.RectF;
import com.airbnb.lottie.LottieAnimationView;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.y */
/* compiled from: PG */
public final /* synthetic */ class C81914y implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81914y f223985a = new C81914y();

    private /* synthetic */ C81914y() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        return new RectF((float) lottieAnimationView.getLeft(), (float) lottieAnimationView.getTop(), (float) lottieAnimationView.getRight(), (float) lottieAnimationView.getBottom());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
