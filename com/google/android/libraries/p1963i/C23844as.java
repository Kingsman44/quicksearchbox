package com.google.android.libraries.p1963i;

import android.os.Build;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.i.as */
/* compiled from: PG */
final class C23844as {

    /* renamed from: a */
    private static final boolean f65289a;

    static {
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Build.CPU_ABI.equals(strArr[i])) {
                z = true;
                break;
            }
            i++;
        }
        f65289a = z;
    }

    /* renamed from: a */
    public static Object m44393a(Future future, long j, TimeUnit timeUnit) {
        if (!f65289a || (future instanceof C60873d) || (future instanceof C23843ar) || TimeUnit.NANOSECONDS.convert(j, timeUnit) <= 2147483647999999999L || future.isDone()) {
            future.get(j, timeUnit);
        }
        long nanos = timeUnit.toNanos(j);
        while (true) {
            try {
                return future.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
            } catch (TimeoutException unused) {
                nanos = (System.nanoTime() + nanos) - System.nanoTime();
            }
        }
    }

    /* renamed from: b */
    public static RunnableScheduledFuture m44394b(RunnableScheduledFuture runnableScheduledFuture) {
        return f65289a ? new C23843ar(runnableScheduledFuture) : runnableScheduledFuture;
    }
}
