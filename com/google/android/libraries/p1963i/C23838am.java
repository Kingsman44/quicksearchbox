package com.google.android.libraries.p1963i;

import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.android.libraries.i.am */
/* compiled from: PG */
final class C23838am implements Runnable {

    /* renamed from: a */
    final int f65259a;

    /* renamed from: b */
    Thread f65260b;

    /* renamed from: c */
    volatile Thread f65261c;

    /* renamed from: d */
    C23837al f65262d;

    /* renamed from: e */
    int f65263e;

    /* renamed from: f */
    long f65264f;

    /* renamed from: g */
    volatile long f65265g;

    /* renamed from: h */
    final /* synthetic */ C23839an f65266h;

    /* renamed from: i */
    volatile int f65267i = 2;

    public C23838am(C23839an anVar, int i) {
        this.f65266h = anVar;
        this.f65259a = i;
    }

    /* renamed from: d */
    private final void m44379d() {
        if (this.f65266h.f65277j) {
            long j = this.f65264f + 1;
            this.f65264f = j;
            this.f65265g = j;
        }
    }

    /* renamed from: a */
    public final void mo29186a() {
        if (this.f65260b != null) {
            this.f65266h.f65273f.incrementAndGet();
        }
        this.f65260b = null;
        this.f65261c = null;
        this.f65267i = 3;
        this.f65266h.f65282o.countDown();
    }

    /* renamed from: b */
    public final void mo29187b() {
        this.f65266h.f65276i.newThread(this).start();
    }

    /* renamed from: c */
    public final void mo29188c(C23837al alVar) {
        int i = this.f65263e;
        if (i < 5) {
            alVar.f65257a = this.f65262d;
            alVar.f65258b = this.f65259a;
            this.f65262d = alVar;
            this.f65263e = i + 1;
        }
    }

    public final void run() {
        boolean z;
        int i;
        int i2;
        Thread currentThread = Thread.currentThread();
        this.f65260b = currentThread;
        this.f65261c = currentThread;
        if (!this.f65266h.f65275h.get()) {
            loop0:
            while (true) {
                C23837al alVar = (C23837al) this.f65266h.f65270c.poll();
                if (alVar != null) {
                    this.f65266h.mo29190a();
                    Runnable runnable = (Runnable) alVar.f65257a;
                    mo29188c(alVar);
                    try {
                        this.f65266h.f65278k.run();
                        runnable.run();
                        this.f65266h.f65279l.run();
                        m44379d();
                        Thread.interrupted();
                        if (this.f65266h.f65274g) {
                            break;
                        }
                    } catch (Error | RuntimeException e) {
                        if (this.f65266h.f65275h.get()) {
                            mo29186a();
                        } else {
                            mo29187b();
                        }
                        throw e;
                    } catch (Throwable th) {
                        m44379d();
                        throw th;
                    }
                } else {
                    this.f65267i = 2;
                    C23839an anVar = this.f65266h;
                    C23837al alVar2 = null;
                    while (true) {
                        C23837al alVar3 = (C23837al) anVar.f65283p.get();
                        Object obj = alVar3.f65257a;
                        z = false;
                        if (obj == C23839an.f65268a) {
                            int i3 = alVar3.f65258b;
                            if (i3 == 0) {
                                i = 3;
                                break;
                            } else if (C23836ak.m44378a(anVar.f65283p, alVar3, anVar.f65281n[i3 - 1])) {
                                if (alVar2 != null) {
                                    mo29188c(alVar2);
                                }
                            }
                        } else if (obj != C23839an.f65269b || (i2 = alVar3.f65258b) <= 0) {
                            if (alVar2 == null) {
                                alVar2 = this.f65262d;
                                if (alVar2 == null) {
                                    alVar2 = new C23837al(this.f65266h.f65280m[0], this.f65259a);
                                } else {
                                    this.f65262d = (C23837al) alVar2.f65257a;
                                    this.f65263e--;
                                }
                            }
                            alVar2.f65257a = alVar3;
                            if (C23836ak.m44378a(anVar.f65283p, alVar3, alVar2)) {
                                i = 2;
                                break;
                            }
                        } else {
                            if (C23836ak.m44378a(anVar.f65283p, alVar3, anVar.f65280m[i2 - 1])) {
                                if (alVar2 != null) {
                                    mo29188c(alVar2);
                                }
                            }
                        }
                    }
                    i = 1;
                    int i4 = i - 1;
                    if (i4 != 0) {
                        if (i4 == 2) {
                            this.f65267i = 3;
                            break;
                        }
                        while (true) {
                            LockSupport.park(this.f65266h);
                            int i5 = this.f65267i;
                            int i6 = i5 - 1;
                            if (i5 == 0) {
                                throw null;
                            } else if (i6 != 0) {
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        break loop0;
                                    }
                                } else {
                                    z |= Thread.interrupted();
                                }
                            } else if (z) {
                                this.f65260b.interrupt();
                            }
                        }
                    } else {
                        this.f65267i = 1;
                    }
                }
            }
            mo29186a();
            return;
        }
        mo29186a();
    }
}
