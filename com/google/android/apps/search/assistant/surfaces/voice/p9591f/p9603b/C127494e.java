package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b;

import android.app.KeyguardManager;
import android.os.PowerManager;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.b.e */
/* compiled from: PG */
public final class C127494e {

    /* renamed from: a */
    private final KeyguardManager f351014a;

    /* renamed from: b */
    private final PowerManager f351015b;

    public C127494e(KeyguardManager keyguardManager, PowerManager powerManager) {
        C69664n.m101061g(keyguardManager, "keyguardManager");
        C69664n.m101061g(powerManager, "powerManager");
        this.f351014a = keyguardManager;
        this.f351015b = powerManager;
    }

    /* renamed from: a */
    public final boolean mo108093a() {
        return !this.f351015b.isInteractive() || this.f351014a.isKeyguardLocked();
    }
}
