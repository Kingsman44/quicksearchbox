package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60829bj;
import com.google.common.util.concurrent.C60870cx;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ax */
/* compiled from: PG */
public class C90805ax extends FutureTask implements C60870cx {

    /* renamed from: a */
    private static final C59071e f253927a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.a.ax");

    /* renamed from: b */
    private final Object f253928b;

    /* renamed from: c */
    private final C60829bj f253929c = new C60829bj();

    public C90805ax(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f253928b = runnable;
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f253929c.mo57297a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f253929c.mo57298b();
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        if ((th instanceof RuntimeException) || (th instanceof Error)) {
            String obj = this.f253928b.toString();
            ((C59052c) ((C59052c) ((C59052c) f253927a.mo56225c()).mo56382g(th)).mo56372aa(11385)).mo56389s("Unchecked exception running task: %s", obj);
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, new RuntimeException("Unchecked exception running task: ".concat(String.valueOf(obj)), th));
            }
        }
        super.setException(th);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f253928b);
        return "TaskRunnerFutureTask[" + valueOf + "]";
    }

    public C90805ax(Callable callable) {
        super(callable);
        this.f253928b = callable;
    }
}
