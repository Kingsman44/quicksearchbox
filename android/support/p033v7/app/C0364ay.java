package android.support.p033v7.app;

import java.util.concurrent.Executor;

/* renamed from: android.support.v7.app.ay */
/* compiled from: PG */
final class C0364ay implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
