package com.google.common.util.concurrent;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* renamed from: com.google.common.util.concurrent.y */
/* compiled from: PG */
final class C60937y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Closeable f165051a;

    public C60937y(Closeable closeable) {
        this.f165051a = closeable;
    }

    public final void run() {
        try {
            this.f165051a.close();
        } catch (IOException | RuntimeException e) {
            C60817ay.f164883a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture$11", "run", "thrown by close()", e);
        }
    }
}
