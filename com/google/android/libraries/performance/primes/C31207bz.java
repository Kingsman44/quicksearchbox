package com.google.android.libraries.performance.primes;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.performance.primes.bz */
/* compiled from: PG */
public final class C31207bz {

    /* renamed from: a */
    final List f84111a = new ArrayList();

    /* renamed from: b */
    public volatile boolean f84112b;

    /* renamed from: a */
    public final synchronized void mo36937a() {
        if (!this.f84112b) {
            this.f84112b = true;
            synchronized (this.f84111a) {
                for (C31226ca a : this.f84111a) {
                    try {
                        a.mo36959a();
                    } catch (RuntimeException unused) {
                    }
                }
                this.f84111a.clear();
            }
        }
    }
}
