package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* compiled from: PG */
public class ThreadUtils {

    /* renamed from: a */
    private static final Object f192508a = new Object();

    /* renamed from: b */
    private static Handler f192509b;

    /* renamed from: a */
    public static Handler m107028a() {
        boolean z;
        synchronized (f192508a) {
            if (f192509b == null) {
                f192509b = new Handler(Looper.getMainLooper());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            TraceEvent.f192511b.set(true);
            if (TraceEvent.f192510a) {
                C72370aa.m107034a();
            }
        }
        return f192509b;
    }

    /* renamed from: b */
    public static boolean m107029b() {
        return m107028a().getLooper() == Looper.myLooper();
    }

    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }
}
