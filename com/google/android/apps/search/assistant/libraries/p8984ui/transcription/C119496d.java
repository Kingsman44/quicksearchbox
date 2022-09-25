package com.google.android.apps.search.assistant.libraries.p8984ui.transcription;

import android.animation.ValueAnimator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.transcription.d */
/* compiled from: PG */
public final /* synthetic */ class C119496d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ValueAnimator f333098a;

    public /* synthetic */ C119496d(ValueAnimator valueAnimator) {
        this.f333098a = valueAnimator;
    }

    public final void accept(Object obj) {
        ValueAnimator valueAnimator = this.f333098a;
        int i = C119497e.f333099b;
        ((C119498f) obj).f333102a = valueAnimator.getAnimatedFraction();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
