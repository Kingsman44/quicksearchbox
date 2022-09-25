package com.google.apps.tiktok.experiments.phenotype;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.libraries.p1963i.C23850ay;
import com.google.android.libraries.p1963i.C23851az;
import com.google.android.libraries.p1963i.C23861bb;
import com.google.android.libraries.p1963i.C23863bd;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.cq */
/* compiled from: PG */
public final class C46977cq {

    /* renamed from: a */
    public final Queue f122489a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final Executor f122490b;

    /* renamed from: c */
    private final AtomicReference f122491c = new AtomicReference();

    /* renamed from: d */
    private final C46972cl f122492d = new C46972cl();

    /* renamed from: e */
    private Throwable f122493e;

    public C46977cq(Executor executor) {
        C69664n.m101061g(executor, "blockingExecutor");
        this.f122490b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo50957a(C60930r rVar) {
        return C60856cj.m92904m(C47810es.m84978r(new C46973cm(this, C47810es.m84965e(rVar))), this.f122490b);
    }

    /* renamed from: b */
    public final Object mo50958b(C60930r rVar) {
        boolean z;
        C60870cx n = C60856cj.m92905n(rVar, new C46976cp(this));
        Thread thread = C23863bd.f65308a;
        Thread currentThread = Thread.currentThread();
        C69664n.m101060f(currentThread, "currentThread()");
        C23851az a = C23861bb.m44418a(currentThread);
        if (!a.f65298d) {
            a.f65298d = true;
            z = true;
        } else {
            z = false;
        }
        int a2 = a.f65297c ? C23850ay.m44397a(a.f65299e.get()) : Process.getThreadPriority(a.f65296b);
        C46970cj cjVar = new C46970cj(a2, a, this.f122492d);
        while (!n.isDone()) {
            AtomicReference atomicReference = this.f122491c;
            while (true) {
                if (atomicReference.compareAndSet((Object) null, cjVar)) {
                    this.f122492d.mo50952a(a.f65295a);
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                    boolean interrupted = Thread.interrupted();
                    do {
                        try {
                            Runnable runnable = (Runnable) this.f122489a.poll();
                            if (runnable != null) {
                                try {
                                    runnable.run();
                                } catch (RuntimeException e) {
                                    this.f122493e = e;
                                    this.f122490b.execute(C47810es.m84977q(new C46974cn(e)));
                                } catch (Error e2) {
                                    this.f122493e = e2;
                                    this.f122490b.execute(C47810es.m84977q(new C46975co(e2)));
                                }
                                interrupted |= Thread.interrupted();
                            } else if (!n.isDone()) {
                                String str = "Expected " + n + " to be done, as no runnables were queued";
                                if (this.f122493e == null) {
                                    throw new IllegalStateException(str);
                                }
                                throw new ExecutionException(str, this.f122493e);
                            }
                        } catch (Throwable th) {
                            this.f122492d.mo50952a((Thread) null);
                            this.f122491c.set((Object) null);
                            cjVar.mo50946a();
                            if (z) {
                                a.mo29228d();
                                a.mo29227c();
                            }
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            StrictMode.setThreadPolicy(threadPolicy);
                            if (interrupted) {
                                a.f65295a.interrupt();
                            }
                            throw th;
                        }
                    } while (!n.isDone());
                    this.f122492d.mo50952a((Thread) null);
                    this.f122491c.set((Object) null);
                    cjVar.mo50946a();
                    if (z) {
                        a.mo29228d();
                        a.mo29227c();
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    StrictMode.setThreadPolicy(threadPolicy);
                    if (interrupted) {
                        a.f65295a.interrupt();
                    }
                } else if (atomicReference.get() != null) {
                    C46970cj cjVar2 = (C46970cj) this.f122491c.get();
                    if (cjVar2 == null) {
                        continue;
                    } else if (!C69664n.m101066l(cjVar2.f122481a, a)) {
                        while (true) {
                            int i = cjVar2.get();
                            if (C46971ck.m83624b(i) || (i >> 2) <= a2) {
                                break;
                            }
                            int i2 = (a2 + a2) | 1;
                            int i3 = i2 + i2;
                            if (cjVar2.compareAndSet(i, i3)) {
                                if (!C46971ck.m83623a(i)) {
                                    cjVar2.f122481a.mo29226b(a2);
                                    int i4 = a2;
                                    while (true) {
                                        if (C46971ck.m83624b(i3)) {
                                            int i5 = i3 >> 2;
                                            int i6 = i5 + i5;
                                            if (cjVar2.compareAndSet(i3, (i6 + i6) | 1)) {
                                                LockSupport.unpark(cjVar2.f122481a.f65295a);
                                                break;
                                            }
                                        } else {
                                            int i7 = i3 >> 2;
                                            if (i4 > i7) {
                                                cjVar2.f122481a.mo29226b(i7);
                                                i4 = i7;
                                            }
                                            int i8 = i4 + i4;
                                            if (cjVar2.compareAndSet(i3, i8 + i8)) {
                                                break;
                                            }
                                        }
                                        i3 = cjVar2.get();
                                    }
                                }
                            }
                        }
                        C60856cj.m92910s(cjVar2.f122482b);
                    } else {
                        throw new IllegalStateException("Reentrant call would deadlock!");
                    }
                }
            }
        }
        return C60856cj.m92909r(n);
    }

    /* renamed from: c */
    public final void mo50959c(Runnable runnable) {
        C69664n.m101061g(runnable, C33259r.f88929b);
        this.f122489a.add(runnable);
    }
}
