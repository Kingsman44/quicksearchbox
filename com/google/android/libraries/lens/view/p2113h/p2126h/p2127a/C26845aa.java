package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.aa */
/* compiled from: PG */
final class C26845aa implements RejectedExecutionHandler {

    /* renamed from: a */
    private final RejectedExecutionHandler f73147a;

    public C26845aa(RejectedExecutionHandler rejectedExecutionHandler) {
        this.f73147a = rejectedExecutionHandler;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown()) {
            ((C58970a) ((C58970a) C26846ab.f73148a.mo56226d()).mo56372aa(49249)).mo56386p("***** glExecutor: Already shutdown, ignoring new task.");
            C59081b.m91349a(C58979ad.MEDIUM, "stack size");
            return;
        }
        this.f73147a.rejectedExecution(runnable, threadPoolExecutor);
    }
}
