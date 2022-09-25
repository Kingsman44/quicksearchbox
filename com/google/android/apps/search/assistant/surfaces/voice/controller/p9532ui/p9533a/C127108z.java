package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.z */
/* compiled from: PG */
public final class C127108z {

    /* renamed from: a */
    public static final Duration f349991a = Duration.ofMillis(300);

    /* renamed from: b */
    public final PowerManager f349992b;

    /* renamed from: c */
    public final AtomicInteger f349993c = new AtomicInteger(0);

    /* renamed from: d */
    public final AtomicBoolean f349994d = new AtomicBoolean(false);

    /* renamed from: e */
    public final C71788b f349995e = new C71799m();

    /* renamed from: f */
    public C71816z f349996f;

    public C127108z(PowerManager powerManager) {
        C69664n.m101061g(powerManager, "powerManager");
        this.f349992b = powerManager;
    }
}
