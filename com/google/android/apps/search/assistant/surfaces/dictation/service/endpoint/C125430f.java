package com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint.f */
/* compiled from: PG */
class C125430f extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f345911b;

    /* renamed from: c */
    private final Object f345912c = new Object();

    /* renamed from: d */
    private boolean f345913d = false;

    /* renamed from: b */
    public final C68326i mo106970b() {
        if (this.f345911b == null) {
            synchronized (this.f345912c) {
                if (this.f345911b == null) {
                    this.f345911b = new C68326i(this);
                }
            }
        }
        return this.f345911b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106970b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f345913d) {
            this.f345913d = true;
            mo106970b().mo17653jN();
            AssistantDictationService assistantDictationService = (AssistantDictationService) this;
        }
        super.onCreate();
    }
}
