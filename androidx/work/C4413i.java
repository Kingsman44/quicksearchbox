package androidx.work;

import androidx.work.impl.utils.p209a.C4568b;
import java.util.concurrent.CancellationException;

/* renamed from: androidx.work.i */
/* compiled from: PG */
public final /* synthetic */ class C4413i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CoroutineWorker f14089a;

    public /* synthetic */ C4413i(CoroutineWorker coroutineWorker) {
        this.f14089a = coroutineWorker;
    }

    public final void run() {
        CoroutineWorker coroutineWorker = this.f14089a;
        if (coroutineWorker.f13983a.f14444d instanceof C4568b) {
            coroutineWorker.f13984b.mo62723u((CancellationException) null);
        }
    }
}
