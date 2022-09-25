package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.os.ConditionVariable;
import android.speech.tts.TextToSpeech;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.ab */
/* compiled from: PG */
final class C84571ab implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f230155a;

    /* renamed from: b */
    final /* synthetic */ ConditionVariable f230156b;

    public C84571ab(AtomicBoolean atomicBoolean, ConditionVariable conditionVariable) {
        this.f230155a = atomicBoolean;
        this.f230156b = conditionVariable;
    }

    public final void onInit(int i) {
        if (i == 0) {
            this.f230155a.set(true);
        } else {
            this.f230155a.set(false);
        }
        this.f230156b.open();
    }
}
