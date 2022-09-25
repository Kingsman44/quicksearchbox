package com.google.android.libraries.performance.primes;

import android.app.Activity;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.android.libraries.performance.primes.p2398c.C31222d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.performance.primes.bj */
/* compiled from: PG */
final class C31191bj implements Executor, C31209a.C31213d {

    /* renamed from: a */
    private final C31220b f84093a;

    /* renamed from: b */
    private Runnable f84094b;

    /* renamed from: c */
    private boolean f84095c;

    /* renamed from: d */
    private boolean f84096d;

    public C31191bj(C31220b bVar) {
        this.f84093a = bVar;
    }

    /* renamed from: b */
    private final void m58185b(Runnable runnable) {
        if (!this.f84096d) {
            this.f84096d = true;
            runnable.run();
        }
    }

    /* renamed from: a */
    public final void mo36926a(Activity activity) {
        this.f84093a.f84117a.mo36958b(this);
        synchronized (this) {
            Runnable runnable = this.f84094b;
            if (runnable != null) {
                m58185b(runnable);
                this.f84094b = null;
            } else {
                this.f84095c = true;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this) {
            if (!this.f84095c) {
                C31222d dVar = this.f84093a.f84117a.f84133a;
                int i = C31222d.f84120c;
                if (dVar.f84122b.get() <= 0) {
                    this.f84094b = runnable;
                }
            }
            m58185b(runnable);
        }
    }
}
