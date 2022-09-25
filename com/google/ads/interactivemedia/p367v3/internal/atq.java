package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atq */
/* compiled from: PG */
final class atq extends AtomicReference implements Runnable {

    /* renamed from: b */
    private static final Runnable f21547b = new atp((byte[]) null);

    /* renamed from: c */
    private static final Runnable f21548c = new atp((byte[]) null);

    /* renamed from: d */
    private static final Runnable f21549d = new atp((byte[]) null);

    /* renamed from: a */
    final /* synthetic */ atw f21550a;

    /* renamed from: e */
    private final Callable f21551e;

    public atq() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15427a() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f21548c)) {
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (((Runnable) getAndSet(f21547b)) == f21549d) {
                    LockSupport.unpark(thread);
                }
            } catch (Throwable th) {
                if (((Runnable) getAndSet(f21547b)) == f21549d) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public boolean mo15428b() {
        return this.f21550a.isDone();
    }

    /* renamed from: c */
    public Object mo15429c() {
        return this.f21551e.call();
    }

    /* renamed from: d */
    public void mo15430d(Object obj, Throwable th) {
        if (th == null) {
            this.f21550a.mo15400n(obj);
        } else {
            this.f21550a.mo15401o(th);
        }
    }

    /* renamed from: e */
    public String mo15431e() {
        return this.f21551e.toString();
    }

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo15428b();
            if (z) {
                try {
                    obj = mo15429c();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f21547b)) {
                        Runnable runnable = (Runnable) get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            Runnable runnable2 = f21548c;
                            if (runnable != runnable2 && runnable != f21549d) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable3 = f21549d;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    mo15430d((Object) null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f21547b)) {
                Runnable runnable4 = (Runnable) get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    Runnable runnable5 = f21548c;
                    if (runnable4 != runnable5 && runnable4 != f21549d) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable6 = f21549d;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = (Runnable) get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                mo15430d(obj, (Throwable) null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f21547b) {
            str = "running=[DONE]";
        } else if (runnable == f21548c) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String e = mo15431e();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(e).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(e);
        return sb2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public atq(atw atw, Callable callable) {
        this();
        this.f21550a = atw;
        aqd.m19282j(callable);
        this.f21551e = callable;
    }
}
