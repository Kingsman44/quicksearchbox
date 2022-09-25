package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.ba */
/* compiled from: PG */
public final class C126320ba {

    /* renamed from: a */
    private final PowerManager f347982a;

    /* renamed from: b */
    private final KeyguardManager f347983b;

    public C126320ba(Context context) {
        this.f347982a = (PowerManager) Objects.requireNonNull((PowerManager) context.getSystemService(PowerManager.class));
        this.f347983b = (KeyguardManager) Objects.requireNonNull((KeyguardManager) context.getSystemService(KeyguardManager.class));
    }

    /* renamed from: a */
    public final boolean mo107530a() {
        return this.f347982a.isInteractive() && !this.f347983b.isKeyguardLocked();
    }
}
