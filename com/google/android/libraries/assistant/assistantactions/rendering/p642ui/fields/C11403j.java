package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.j */
/* compiled from: PG */
public final class C11403j implements TimeAnimator.TimeListener {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderField f37142a;

    public C11403j(AudioRecorderField audioRecorderField) {
        this.f37142a = audioRecorderField;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        this.f37142a.f36900b.setText(AudioRecorderField.m26976a(j));
    }
}
