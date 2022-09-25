package com.airbnb.lottie;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.aj */
/* compiled from: PG */
final class C4832aj extends FutureTask {

    /* renamed from: a */
    final /* synthetic */ C4833ak f15399a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4832aj(C4833ak akVar, Callable callable) {
        super(callable);
        this.f15399a = akVar;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        if (!isCancelled()) {
            try {
                this.f15399a.mo9791c((C4830ah) get());
            } catch (InterruptedException | ExecutionException e) {
                this.f15399a.mo9791c(new C4830ah(e));
            }
        }
    }
}
