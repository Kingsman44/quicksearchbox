package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.base.C72387m;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import p000J.C0000N;

/* compiled from: PG */
public final class CronetUploadDataStream extends UploadDataSink {

    /* renamed from: a */
    public static final String f192698a = "CronetUploadDataStream";

    /* renamed from: b */
    public final C72520cz f192699b;

    /* renamed from: c */
    public final CronetUrlRequest f192700c;

    /* renamed from: d */
    public long f192701d;

    /* renamed from: e */
    public long f192702e;

    /* renamed from: f */
    public ByteBuffer f192703f;

    /* renamed from: g */
    public final Object f192704g = new Object();

    /* renamed from: h */
    public long f192705h;

    /* renamed from: i */
    public int f192706i = 3;

    /* renamed from: j */
    private final Executor f192707j;

    /* renamed from: k */
    private long f192708k;

    /* renamed from: l */
    private final Runnable f192709l = new C72542x(this);

    /* renamed from: m */
    private boolean f192710m;

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.f192707j = executor;
        this.f192699b = new C72520cz(uploadDataProvider);
        this.f192700c = cronetUrlRequest;
    }

    /* renamed from: d */
    private final void m107133d() {
        synchronized (this.f192704g) {
            if (this.f192706i == 0) {
                this.f192710m = true;
                return;
            }
            long j = this.f192705h;
            if (j != 0) {
                C0000N.MMW1G0N1(j);
                this.f192705h = 0;
                mo64169c(new C72544z(this));
            }
        }
    }

    /* renamed from: e */
    private final void m107134e() {
        synchronized (this.f192704g) {
            if (this.f192706i == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            } else if (this.f192710m) {
                m107133d();
            }
        }
    }

    /* renamed from: a */
    public final void mo64167a(int i) {
        int i2 = this.f192706i;
        if (i2 != i) {
            throw new IllegalStateException("Expected " + i + ", but was " + i2);
        }
    }

    /* renamed from: b */
    public final void mo64168b(Throwable th) {
        int i;
        synchronized (this.f192704g) {
            i = this.f192706i;
            if (i != 3) {
                this.f192706i = 3;
                this.f192703f = null;
                m107134e();
            } else {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
        }
        if (i == 2) {
            try {
                this.f192699b.f192966a.close();
            } catch (Exception e) {
                C72387m.m107041b(f192698a, "Failure closing data provider", e);
            }
        }
        this.f192700c.mo64178f(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo64169c(Runnable runnable) {
        try {
            this.f192707j.execute(runnable);
        } catch (Throwable th) {
            this.f192700c.mo64178f(th);
        }
    }

    public final void onReadError(Exception exc) {
        synchronized (this.f192704g) {
            mo64167a(0);
            mo64168b(exc);
        }
    }

    public final void onReadSucceeded(boolean z) {
        synchronized (this.f192704g) {
            mo64167a(0);
            if (this.f192708k == ((long) this.f192703f.limit())) {
                if (z) {
                    if (this.f192701d >= 0) {
                        throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    }
                }
                int position = this.f192703f.position();
                long j = this.f192702e - ((long) position);
                this.f192702e = j;
                if (j < 0) {
                    long j2 = this.f192701d;
                    if (j2 >= 0) {
                        throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(j2 - j), Long.valueOf(j2)}));
                    }
                }
                ByteBuffer byteBuffer = (ByteBuffer) this.f192703f.position(0);
                this.f192703f = null;
                this.f192706i = 3;
                m107134e();
                long j3 = this.f192705h;
                if (j3 != 0) {
                    C0000N.MpWH3VIr(j3, this, position, z);
                    return;
                }
                return;
            }
            throw new IllegalStateException("ByteBuffer limit changed");
        }
    }

    public final void onRewindError(Exception exc) {
        synchronized (this.f192704g) {
            mo64167a(1);
            mo64168b(exc);
        }
    }

    public final void onRewindSucceeded() {
        synchronized (this.f192704g) {
            mo64167a(1);
            this.f192706i = 3;
            this.f192702e = this.f192701d;
            long j = this.f192705h;
            if (j != 0) {
                C0000N.MFpRjSMv(j, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onUploadDataStreamDestroyed() {
        m107133d();
    }

    /* access modifiers changed from: package-private */
    public void readData(ByteBuffer byteBuffer) {
        this.f192703f = byteBuffer;
        this.f192708k = (long) byteBuffer.limit();
        mo64169c(this.f192709l);
    }

    /* access modifiers changed from: package-private */
    public void rewind() {
        mo64169c(new C72543y(this));
    }
}
