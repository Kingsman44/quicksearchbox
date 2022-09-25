package com.google.android.libraries.p10923ac.p10971e.p10972a;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ac.e.a.a */
/* compiled from: PG */
public final class C147331a implements Runnable {

    /* renamed from: a */
    public final SettableFuture f397716a = new SettableFuture();

    /* renamed from: b */
    private final Callable f397717b;

    public C147331a(Callable callable) {
        this.f397717b = callable;
    }

    public final void run() {
        try {
            this.f397716a.mo57356n(this.f397717b.call());
        } catch (Throwable th) {
            this.f397716a.mo57357o(th);
        }
    }
}
