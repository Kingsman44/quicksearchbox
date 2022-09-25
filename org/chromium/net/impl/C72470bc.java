package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: org.chromium.net.impl.bc */
/* compiled from: PG */
public abstract class C72470bc extends UploadDataSink {

    /* renamed from: a */
    public final AtomicInteger f192830a = new AtomicInteger(3);

    /* renamed from: b */
    public final UploadDataProvider f192831b;

    /* renamed from: c */
    public ByteBuffer f192832c;

    /* renamed from: d */
    public long f192833d;

    /* renamed from: e */
    public long f192834e;

    /* renamed from: f */
    private final Executor f192835f;

    /* renamed from: g */
    private final Executor f192836g;

    public C72470bc(Executor executor, Executor executor2, UploadDataProvider uploadDataProvider) {
        this.f192835f = new C72463aw(this, executor);
        this.f192836g = executor2;
        this.f192831b = uploadDataProvider;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo64215a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Runnable mo64216b(C72500cf cfVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Runnable mo64217c(C72500cf cfVar);

    /* renamed from: d */
    public final void mo64218d(C72500cf cfVar) {
        try {
            this.f192835f.execute(mo64217c(cfVar));
        } catch (RejectedExecutionException e) {
            mo64221g(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo64219e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo64220f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo64221g(Throwable th);

    /* renamed from: h */
    public final void mo64222h() {
        this.f192836g.execute(mo64216b(new C72468ba(this)));
    }

    public final void onReadError(Exception exc) {
        mo64221g(exc);
    }

    public final void onReadSucceeded(boolean z) {
        if (this.f192830a.compareAndSet(0, 2)) {
            this.f192836g.execute(mo64216b(new C72465ay(this, z)));
            return;
        }
        int i = this.f192830a.get();
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + i);
    }

    public final void onRewindError(Exception exc) {
        mo64221g(exc);
    }

    public final void onRewindSucceeded() {
        if (this.f192830a.compareAndSet(1, 2)) {
            mo64222h();
            return;
        }
        int i = this.f192830a.get();
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + i);
    }
}
