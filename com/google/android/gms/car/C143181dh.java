package com.google.android.gms.car;

import android.os.Looper;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.car.dh */
/* compiled from: PG */
public final class C143181dh {

    /* renamed from: a */
    public final boolean f388281a;

    public C143181dh() {
        throw null;
    }

    public C143181dh(byte[] bArr) {
        this.f388281a = false;
    }

    /* renamed from: a */
    public static void m232308a(Looper looper, Runnable runnable) {
        new C144861c(looper).post(runnable);
    }

    /* renamed from: b */
    public static void m232309b(Runnable runnable) {
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            runnable.run();
        } else {
            new C144861c(mainLooper).post(runnable);
        }
    }

    /* renamed from: c */
    public static Object m232310c(Callable callable, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            FutureTask futureTask = new FutureTask(callable);
            m232308a(Looper.getMainLooper(), futureTask);
            try {
                return futureTask.get(1000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (InterruptedException | TimeoutException unused) {
                return obj;
            }
        }
    }
}
