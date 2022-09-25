package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.h */
/* compiled from: PG */
final class C11401h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderField f37140a;

    public C11401h(AudioRecorderField audioRecorderField) {
        this.f37140a = audioRecorderField;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f37140a.f36900b.setText(AudioRecorderField.m26976a(valueAnimator.getCurrentPlayTime()));
    }
}
