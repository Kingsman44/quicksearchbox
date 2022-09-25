package org.chromium.base.task;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.chromium.base.ThreadUtils;

/* renamed from: org.chromium.base.task.h */
/* compiled from: PG */
public final class C72402h {

    /* renamed from: a */
    private final Map f192558a = new HashMap();

    /* renamed from: b */
    private final synchronized C72397c m107055b() {
        FutureTask futureTask;
        try {
            futureTask = new FutureTask(C72401g.f192557a);
            if (ThreadUtils.m107029b()) {
                futureTask.run();
            } else {
                ThreadUtils.m107028a().post(futureTask);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted waiting for callable", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("Error occurred waiting for callable", e2);
        }
        return (C72397c) futureTask.get();
    }

    /* renamed from: a */
    public final synchronized void mo63864a(C72407m mVar, Runnable runnable) {
        C72403i iVar = (C72403i) this.f192558a.get(mVar);
        if (iVar == null) {
            if (mVar.f192581k) {
                iVar = m107055b();
            } else {
                iVar = new C72406l(mVar);
            }
            this.f192558a.put(mVar, iVar);
        }
        iVar.mo63859a(runnable);
    }
}
