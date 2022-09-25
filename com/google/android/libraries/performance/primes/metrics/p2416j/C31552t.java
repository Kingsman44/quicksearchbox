package com.google.android.libraries.performance.primes.metrics.p2416j;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.t */
/* compiled from: PG */
final class C31552t extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ C31553u f84959a;

    public C31552t(C31553u uVar) {
        this.f84959a = uVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        String str;
        long id = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            str = "UI Thread";
        } else {
            str = "Thread: ".concat(String.valueOf(Thread.currentThread().getName()));
        }
        C31543k kVar = new C31543k(str, id, 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(kVar);
        this.f84959a.f84961b.incrementAndGet();
        this.f84959a.f84963d.put(kVar, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}
