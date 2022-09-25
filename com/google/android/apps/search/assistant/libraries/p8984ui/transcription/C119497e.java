package com.google.android.apps.search.assistant.libraries.p8984ui.transcription;

import android.animation.ValueAnimator;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.transcription.e */
/* compiled from: PG */
final class C119497e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b */
    public static final /* synthetic */ int f333099b = 0;

    /* renamed from: a */
    final /* synthetic */ TranscriptionView f333100a;

    /* renamed from: c */
    private final List f333101c;

    public C119497e(TranscriptionView transcriptionView) {
        this.f333100a = transcriptionView;
        this.f333101c = transcriptionView.mo104401a();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f333100a.mo104402b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        Collection.EL.stream(this.f333101c).forEach(new C119496d(valueAnimator));
        this.f333100a.invalidate();
    }
}
