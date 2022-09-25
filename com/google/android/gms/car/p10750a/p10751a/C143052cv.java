package com.google.android.gms.car.p10750a.p10751a;

import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.car.C143139bw;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.gms.car.a.a.cv */
/* compiled from: PG */
public final class C143052cv extends C143139bw {

    /* renamed from: a */
    private final Queue f388130a = new ArrayDeque();

    public C143052cv() {
        new C144861c(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final synchronized void mo118003a(Intent intent) {
        if (C143316a.m232515e("GH.PrxyActStartHndlr", 4)) {
            C143316a.m232514d(4, "GH.PrxyActStartHndlr", (Throwable) null, "Trying to send processAndStart but there is no registered CarActivityStartProcessor. Queuing intent: %s", intent);
        }
        this.f388130a.add(intent);
    }

    /* renamed from: b */
    public final synchronized void mo118004b() {
        if (C143316a.m232515e("GH.PrxyActStartHndlr", 3)) {
            C143316a.m232514d(3, "GH.PrxyActStartHndlr", (Throwable) null, "Clearing local CarActivityStartListener %s", null);
        }
    }
}
