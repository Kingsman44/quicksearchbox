package androidx.work.impl.utils;

import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.utils.j */
/* compiled from: PG */
public final /* synthetic */ class C4603j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C4604k f14499a;

    public /* synthetic */ C4603j(C4604k kVar) {
        this.f14499a = kVar;
    }

    public final Object call() {
        C4604k kVar = this.f14499a;
        int a = C4605l.m12997a(kVar.f14500a, "next_job_scheduler_id");
        if (a < 0) {
            C4605l.m12998b(kVar.f14500a, "next_job_scheduler_id", 1);
            a = 0;
        }
        return Integer.valueOf(a);
    }
}
