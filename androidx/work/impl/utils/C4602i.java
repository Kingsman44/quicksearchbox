package androidx.work.impl.utils;

import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.utils.i */
/* compiled from: PG */
public final /* synthetic */ class C4602i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C4604k f14498a;

    public /* synthetic */ C4602i(C4604k kVar) {
        this.f14498a = kVar;
    }

    public final Object call() {
        return Integer.valueOf(C4605l.m12997a(this.f14498a.f14500a, "next_alarm_manager_id"));
    }
}
