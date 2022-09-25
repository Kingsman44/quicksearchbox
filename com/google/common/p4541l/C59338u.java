package com.google.common.p4541l;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.l.u */
/* compiled from: PG */
final class C59338u implements C59340w {

    /* renamed from: a */
    static final C59338u f157524a = new C59338u();

    /* renamed from: a */
    public final void mo56857a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = C59337t.f157523a;
        Level level = Level.WARNING;
        new StringBuilder("Suppressing exception thrown when closing ").append(closeable);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
    }
}
