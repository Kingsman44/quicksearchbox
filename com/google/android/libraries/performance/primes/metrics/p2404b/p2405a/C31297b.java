package com.google.android.libraries.performance.primes.metrics.p2404b.p2405a;

import com.google.common.base.C58817ah;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.a.b */
/* compiled from: PG */
public final class C31297b {

    /* renamed from: a */
    static final long f84279a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public final C58817ah f84280b = new C31296a(this);

    /* renamed from: c */
    public volatile boolean f84281c = false;

    /* renamed from: d */
    private final C58872ci f84282d;

    /* renamed from: e */
    private volatile Process f84283e;

    public C31297b(C58889cz czVar) {
        this.f84282d = new C58872ci(czVar);
    }

    /* renamed from: a */
    public final void mo37005a(String str) {
        if (!str.isEmpty()) {
            if (this.f84283e != null) {
                try {
                    if (this.f84283e.exitValue() != 0) {
                        this.f84281c = true;
                        this.f84283e = null;
                    }
                } catch (IllegalThreadStateException unused) {
                    return;
                }
            }
            if (!this.f84281c) {
                synchronized (this) {
                    C58872ci ciVar = this.f84282d;
                    if (!ciVar.f156708a || ciVar.mo56158a(TimeUnit.MILLISECONDS) >= f84279a) {
                        this.f84282d.mo56160e();
                        this.f84282d.mo56161f();
                        this.f84283e = (Process) this.f84280b.apply(str);
                    }
                }
            }
        }
    }
}
