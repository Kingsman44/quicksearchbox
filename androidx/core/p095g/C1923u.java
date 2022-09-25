package androidx.core.p095g;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.g.u */
/* compiled from: PG */
public final class C1923u {
    /* renamed from: a */
    public static Object m5181a(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
