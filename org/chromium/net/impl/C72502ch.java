package org.chromium.net.impl;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* renamed from: org.chromium.net.impl.ch */
/* compiled from: PG */
public final class C72502ch implements Executor {

    /* renamed from: a */
    private final Executor f192916a;

    public C72502ch(Executor executor) {
        this.f192916a = executor;
    }

    public final void execute(Runnable runnable) {
        C72501cg cgVar = new C72501cg(runnable, Thread.currentThread());
        this.f192916a.execute(cgVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = cgVar.f192914b;
        if (inlineExecutionProhibitedException == null) {
            cgVar.f192913a = null;
            return;
        }
        throw inlineExecutionProhibitedException;
    }
}
