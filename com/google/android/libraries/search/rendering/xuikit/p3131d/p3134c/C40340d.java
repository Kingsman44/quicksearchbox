package com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c;

import com.google.common.p4522b.C58319aq;
import com.google.common.p4522b.C58461fx;
import com.google.common.p4522b.C58692ol;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.c.d */
/* compiled from: PG */
public final class C40340d implements Executor {

    /* renamed from: a */
    public final C58692ol f105951a = new C58461fx();

    /* renamed from: b */
    private final Executor f105952b;

    public C40340d(Executor executor) {
        this.f105952b = executor;
    }

    /* renamed from: a */
    public final void mo42402a(Runnable runnable) {
        synchronized (this.f105951a) {
            this.f105951a.mo54928h(runnable, 0);
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f105951a) {
            ((C58319aq) this.f105951a).mo54931lF(runnable, 1);
        }
        this.f105952b.execute(new C40339c(this, runnable));
    }
}
