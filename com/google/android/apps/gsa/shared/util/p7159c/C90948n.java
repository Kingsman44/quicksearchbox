package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.shared.util.c.n */
/* compiled from: PG */
public final class C90948n extends C90949o {

    /* renamed from: c */
    private final Object f254147c = new Object();

    /* renamed from: d */
    private final Thread f254148d;

    /* renamed from: e */
    private boolean f254149e;

    /* renamed from: f */
    private boolean f254150f;

    public C90948n(Thread thread) {
        this.f254148d = thread;
    }

    /* renamed from: a */
    public final void mo85243a() {
        synchronized (this.f254147c) {
            if (this.f254150f) {
                C58838bb.m90883r(Thread.currentThread() == this.f254148d);
                Thread.interrupted();
                this.f254150f = false;
            }
            this.f254149e = true;
        }
    }

    /* renamed from: b */
    public final void mo85244b() {
        synchronized (this.f254147c) {
            if (!this.f254149e) {
                if (!this.f254148d.isInterrupted()) {
                    this.f254148d.interrupt();
                    this.f254150f = true;
                }
                this.f254149e = true;
            }
        }
    }
}
