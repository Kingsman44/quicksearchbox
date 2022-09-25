package org.chromium.base.task;

import android.os.Process;
import java.util.LinkedList;
import org.chromium.base.TraceEvent;

/* renamed from: org.chromium.base.task.j */
/* compiled from: PG */
public final /* synthetic */ class C72404j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C72406l f192559a;

    public /* synthetic */ C72404j(C72406l lVar) {
        this.f192559a = lVar;
    }

    public final void run() {
        String str;
        C72406l lVar = this.f192559a;
        TraceEvent c = TraceEvent.m107032c(lVar.f192564c);
        try {
            synchronized (lVar.f192567f) {
                LinkedList linkedList = lVar.f192568g;
                if (linkedList != null) {
                    Runnable runnable = (Runnable) linkedList.poll();
                    int i = lVar.f192563b.f192576f;
                    if (i == 1) {
                        Process.setThreadPriority(0);
                    } else if (i != 2) {
                        Process.setThreadPriority(10);
                    } else {
                        Process.setThreadPriority(-1);
                    }
                    runnable.run();
                    if (c != null) {
                        str = c.f192513d;
                    } else {
                        return;
                    }
                } else if (c != null) {
                    str = c.f192513d;
                } else {
                    return;
                }
            }
            TraceEvent.m107031b(str, 0);
        } catch (Throwable th) {
            if (c != null) {
                try {
                    TraceEvent.m107031b(c.f192513d, 0);
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
