package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.common.p4522b.C58373cq;
import com.google.common.p4522b.C58443ff;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.j */
/* compiled from: PG */
final class C90850j extends C58443ff implements C60888db {

    /* renamed from: a */
    public final String f254030a;

    /* renamed from: b */
    public final C90476a f254031b;

    /* renamed from: c */
    private final C60888db f254032c;

    public C90850j(String str, C60888db dbVar, C90476a aVar) {
        this.f254030a = str;
        this.f254032c = dbVar;
        this.f254031b = aVar;
    }

    /* renamed from: a */
    public final C60870cx submit(Runnable runnable) {
        return this.f254032c.mo19398a(new C90848h(this, runnable));
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f254032c.awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public final C60870cx submit(Callable callable) {
        return this.f254032c.mo19399b(new C90849i(this, callable));
    }

    /* renamed from: c */
    public final C60870cx submit(Runnable runnable, Object obj) {
        return this.f254032c.mo19400c(new C90848h(this, runnable), obj);
    }

    /* renamed from: d */
    public final C60872cz schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f254032c.mo29164d(new C90848h(this, runnable), j, timeUnit);
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f254032c.mo29165e(new C90849i(this, callable), j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f254032c.execute(new C90848h(this, runnable));
    }

    /* renamed from: f */
    public final C60872cz scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f254032c.mo29166f(new C90848h(this, runnable), j, j2, timeUnit);
    }

    /* renamed from: g */
    public final C60872cz scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f254032c.mo29167g(new C90848h(this, runnable), j, j2, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f254032c;
    }

    public final List invokeAll(Collection collection) {
        return this.f254032c.invokeAll(new C58373cq(collection, new C90847g(this)));
    }

    public final Object invokeAny(Collection collection) {
        return this.f254032c.invokeAny(new C58373cq(collection, new C90847g(this)));
    }

    public final boolean isShutdown() {
        return this.f254032c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f254032c.isTerminated();
    }

    public final void shutdown() {
        this.f254032c.shutdown();
    }

    public final List shutdownNow() {
        return this.f254032c.shutdownNow();
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f254032c.invokeAll(new C58373cq(collection, new C90847g(this)), j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f254032c.invokeAny(new C58373cq(collection, new C90847g(this)), j, timeUnit);
    }
}
