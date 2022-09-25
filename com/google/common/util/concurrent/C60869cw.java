package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.common.util.concurrent.cw */
/* compiled from: PG */
abstract class C60869cw extends AtomicReference implements Runnable {

    /* renamed from: a */
    private static final Runnable f164959a = new C60868cv();

    /* renamed from: b */
    private static final Runnable f164960b = new C60868cv();

    /* renamed from: c */
    private final void m92925c(Thread thread) {
        Runnable runnable = (Runnable) get();
        C60867cu cuVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof C60867cu)) {
                if (runnable != f164960b) {
                    break;
                }
            } else {
                cuVar = (C60867cu) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f164960b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(cuVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* renamed from: a */
    public abstract Object mo57287a();

    /* renamed from: b */
    public abstract String mo57288b();

    /* renamed from: d */
    public abstract void mo57290d(Throwable th);

    /* renamed from: e */
    public abstract void mo57291e(Object obj);

    /* renamed from: g */
    public abstract boolean mo57293g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo57350h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            C60867cu cuVar = new C60867cu(this);
            cuVar.mo57346a(Thread.currentThread());
            if (compareAndSet(runnable, cuVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f164959a)) == f164960b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f164959a)) == f164960b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo57293g();
            if (z) {
                try {
                    obj = mo57287a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f164959a)) {
                        m92925c(currentThread);
                    }
                    mo57291e((Object) null);
                    throw th;
                }
            }
            if (!compareAndSet(currentThread, f164959a)) {
                m92925c(currentThread);
            }
            if (z) {
                mo57291e(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f164959a) {
            str = "running=[DONE]";
        } else if (runnable instanceof C60867cu) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo57288b();
    }
}
