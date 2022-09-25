package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import android.os.PowerManager;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.g */
/* compiled from: PG */
final class C127089g implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C127097o f349944a;

    public C127089g(C127097o oVar) {
        this.f349944a = oVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
        if (wakeLock == null || !wakeLock.isHeld()) {
            Object systemService = this.f349944a.f349971d.getSystemService("power");
            C69664n.m101059e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(268435482, "UiControllerService::WakeLock");
            newWakeLock.acquire(C127097o.f349967a.toMillis());
            return newWakeLock;
        }
        Duration duration = C127097o.f349967a;
        return wakeLock;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
