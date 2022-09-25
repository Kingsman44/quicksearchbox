package com.google.p4449cd.p4462i;

import com.google.p4449cd.p4453d.C57956b;
import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4454e.C57969i;
import java.util.concurrent.Executor;

/* renamed from: com.google.cd.i.b */
/* compiled from: PG */
public final /* synthetic */ class C58043b implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C57969i f155176a;

    /* renamed from: b */
    public final /* synthetic */ Executor f155177b;

    public /* synthetic */ C58043b(C57969i iVar, Executor executor) {
        this.f155176a = iVar;
        this.f155177b = executor;
    }

    public final void execute(Runnable runnable) {
        C57969i iVar = this.f155176a;
        Executor executor = this.f155177b;
        C57958d a = C57956b.m88623a();
        a.getClass();
        iVar.mo54575e(a);
        executor.execute(new C58044c(a, runnable));
    }
}
