package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.service.voice.AlwaysOnHotwordDetector;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.j */
/* compiled from: PG */
public final /* synthetic */ class C118722j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118724l f331169a;

    /* renamed from: b */
    public final /* synthetic */ AlwaysOnHotwordDetector.EventPayload f331170b;

    public /* synthetic */ C118722j(C118724l lVar, AlwaysOnHotwordDetector.EventPayload eventPayload) {
        this.f331169a = lVar;
        this.f331170b = eventPayload;
    }

    public final void run() {
        this.f331169a.mo103929a(this.f331170b);
    }
}
