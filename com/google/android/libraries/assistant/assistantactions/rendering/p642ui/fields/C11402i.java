package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.i */
/* compiled from: PG */
final class C11402i extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderField f37141a;

    public C11402i(AudioRecorderField audioRecorderField) {
        this.f37141a = audioRecorderField;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f37141a.mo19812d();
        this.f37141a.mo19814f(3);
    }
}
