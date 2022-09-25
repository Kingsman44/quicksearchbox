package org.chromium.net.impl;

import org.chromium.net.InlineExecutionProhibitedException;

/* renamed from: org.chromium.net.impl.cg */
/* compiled from: PG */
final class C72501cg implements Runnable {

    /* renamed from: a */
    public Thread f192913a;

    /* renamed from: b */
    public InlineExecutionProhibitedException f192914b;

    /* renamed from: c */
    private final Runnable f192915c;

    public C72501cg(Runnable runnable, Thread thread) {
        this.f192915c = runnable;
        this.f192913a = thread;
    }

    public final void run() {
        if (Thread.currentThread() == this.f192913a) {
            this.f192914b = new InlineExecutionProhibitedException();
        } else {
            this.f192915c.run();
        }
    }
}
