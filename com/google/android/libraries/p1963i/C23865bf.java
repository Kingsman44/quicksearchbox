package com.google.android.libraries.p1963i;

import com.evernote.android.state.BuildConfig;
import java.lang.Thread;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.android.libraries.i.bf */
/* compiled from: PG */
public final class C23865bf extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23865bf(java.lang.Thread r2) {
        /*
            r1 = this;
            java.lang.String r0 = m44421a(r2)
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            r1.<init>(r0)
            r1.setStackTrace(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1963i.C23865bf.<init>(java.lang.Thread):void");
    }

    /* renamed from: a */
    public static String m44421a(Thread thread) {
        String str;
        Object blocker = LockSupport.getBlocker(thread);
        Thread.State state = thread.getState();
        String thread2 = thread.toString();
        String str2 = BuildConfig.FLAVOR;
        if (state == null) {
            str = str2;
        } else {
            str = " in state ".concat(state.toString());
        }
        if (blocker != null) {
            str2 = " blocked on ".concat(String.valueOf(blocker.toString()));
        }
        return thread2 + str + str2;
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
