package org.chromium.net.impl;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: org.chromium.net.impl.cb */
/* compiled from: PG */
final class C72496cb extends C72470bc {

    /* renamed from: f */
    public final HttpURLConnection f192882f;

    /* renamed from: g */
    final /* synthetic */ C72499ce f192883g;

    /* renamed from: h */
    private final AtomicBoolean f192884h = new AtomicBoolean(false);

    /* renamed from: i */
    private WritableByteChannel f192885i;

    /* renamed from: j */
    private OutputStream f192886j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72496cb(C72499ce ceVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, C72520cz czVar) {
        super(executor, executor2, czVar);
        this.f192883g = ceVar;
        this.f192882f = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64215a(ByteBuffer byteBuffer) {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            i += this.f192885i.write(byteBuffer);
        }
        this.f192886j.flush();
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Runnable mo64216b(C72500cf cfVar) {
        return new C72485br(this.f192883g, cfVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Runnable mo64217c(C72500cf cfVar) {
        return new C72472be(this.f192883g, cfVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo64219e() {
        mo64242i();
        this.f192883g.mo64250k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo64220f() {
        if (this.f192885i == null) {
            this.f192883g.f192903l = 10;
            this.f192882f.setDoOutput(true);
            this.f192882f.connect();
            this.f192883g.f192903l = 12;
            OutputStream outputStream = this.f192882f.getOutputStream();
            this.f192886j = outputStream;
            this.f192885i = Channels.newChannel(outputStream);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo64221g(Throwable th) {
        this.f192883g.mo64247f(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo64242i() {
        if (this.f192885i != null && this.f192884h.compareAndSet(false, true)) {
            this.f192885i.close();
        }
    }
}
