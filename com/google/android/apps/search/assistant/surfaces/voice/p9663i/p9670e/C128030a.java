package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9670e;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.e.a */
/* compiled from: PG */
public final class C128030a {

    /* renamed from: a */
    public final PowerManager f352310a;

    /* renamed from: b */
    public final KeyguardManager f352311b;

    public C128030a(Context context) {
        this.f352310a = (PowerManager) Objects.requireNonNull((PowerManager) context.getSystemService(PowerManager.class));
        this.f352311b = (KeyguardManager) Objects.requireNonNull((KeyguardManager) context.getSystemService(KeyguardManager.class));
    }
}
