package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.Thread;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ch */
/* compiled from: PG */
abstract class C90843ch implements Runnable {

    /* renamed from: a */
    private static final C59071e f254017a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.a.ch");

    /* renamed from: a */
    public abstract String mo85176a();

    /* renamed from: b */
    public abstract void mo85177b();

    public final void run() {
        try {
            mo85177b();
        } catch (Error | RuntimeException e) {
            String format = String.format("Unchecked exception happened while running task: %s", new Object[]{mo85176a()});
            C59104x c = f254017a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ExceptionReporter");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11391)).mo56389s("%s", format);
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            C90842cg cgVar = new C90842cg(format);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(e, new Object[]{cgVar});
            } catch (Exception unused) {
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, e);
                return;
            }
            throw e;
        }
    }
}
