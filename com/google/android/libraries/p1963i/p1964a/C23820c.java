package com.google.android.libraries.p1963i.p1964a;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.a.c */
/* compiled from: PG */
public final class C23820c {

    /* renamed from: a */
    public static final /* synthetic */ int f65235a = 0;

    /* renamed from: b */
    private static final C59071e f65236b = C59071e.m91332i("com.google.android.libraries.i.a.c");

    /* renamed from: c */
    private static final ThreadLocal f65237c = new C23819b();

    /* renamed from: a */
    public static Object m44350a(Future future) {
        m44351b();
        return future.get();
    }

    /* renamed from: b */
    public static void m44351b() {
        if (!((Boolean) f65237c.get()).booleanValue()) {
            if (Binder.getCallingPid() != Process.myPid()) {
                Thread currentThread = Thread.currentThread();
                if (!currentThread.getName().startsWith("Binder:")) {
                    StackTraceElement[] stackTrace = currentThread.getStackTrace();
                    int length = stackTrace.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[length];
                        if (Binder.class.getName().equals(stackTraceElement.getClassName()) && "execTransact".equals(stackTraceElement.getMethodName())) {
                            m44353d();
                            return;
                        }
                    }
                } else {
                    m44353d();
                    return;
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException("Cannot block on non-blocking thread: ".concat(String.valueOf(Thread.currentThread().getName())));
            int ordinal = C23822e.f65242d.ordinal();
            if (ordinal == 0) {
                ((C59052c) ((C59052c) ((C59052c) f65236b.mo56225c()).mo56382g(illegalStateException)).mo56372aa(47940)).mo56386p("Cannot block on non-blocking thread");
            } else if (ordinal == 1) {
                StrictMode.noteSlowCall(illegalStateException.getMessage());
            } else if (ordinal == 2) {
                C19559g.m37302a().post(new C23818a(illegalStateException));
                throw illegalStateException;
            }
        }
    }

    /* renamed from: c */
    public static Object m44352c(Future future, TimeUnit timeUnit) {
        m44351b();
        return future.get(3000, timeUnit);
    }

    /* renamed from: d */
    public static void m44353d() {
        f65237c.set(true);
    }
}
