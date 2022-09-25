package com.google.android.libraries.storage.p3304a.p3312f;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3307c.C42739a;
import com.google.android.libraries.storage.p3304a.p3307c.C42759l;
import com.google.android.libraries.storage.p3304a.p3307c.C42760m;
import com.google.android.libraries.storage.p3304a.p3307c.C42761n;
import com.google.android.libraries.storage.p3304a.p3307c.C42762o;
import com.google.android.libraries.storage.p3304a.p3307c.C42765r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.libraries.storage.a.f.e */
/* compiled from: PG */
public final class C42781e implements C42797g {

    /* renamed from: a */
    public boolean f112047a;

    /* renamed from: b */
    private final boolean f112048b;

    /* renamed from: c */
    private final boolean f112049c;

    public C42781e(boolean z, boolean z2) {
        this.f112048b = z;
        this.f112049c = z2;
    }

    /* renamed from: b */
    public static C42781e m75547b() {
        return new C42781e(false, false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        C42761n nVar;
        Closeable closeable;
        FileChannel channel;
        C42760m mVar;
        C42765r rVar;
        Uri build = fVar.f112042e.buildUpon().path(String.valueOf(fVar.f112043f.getPath()).concat(".lock")).fragment(BuildConfig.FLAVOR).build();
        C42780d dVar = null;
        if (this.f112047a) {
            Semaphore a = fVar.f112039b.mo45826c().mo45866a(build.toString());
            if (true != a.tryAcquire()) {
                a = null;
            }
            C42762o oVar = new C42762o(a);
            try {
                Semaphore semaphore = oVar.f112022a;
                if (semaphore != null) {
                    oVar.f112022a = null;
                    nVar = new C42761n(semaphore);
                    oVar.close();
                } else {
                    oVar.close();
                    nVar = null;
                }
            } catch (Throwable th) {
                C42759l.m75532a(th, th);
            }
        } else {
            Semaphore a2 = fVar.f112039b.mo45826c().mo45866a(build.toString());
            try {
                a2.acquire();
                C42762o oVar2 = new C42762o(a2);
                try {
                    Semaphore semaphore2 = oVar2.f112022a;
                    oVar2.f112022a = null;
                    nVar = new C42761n(semaphore2);
                    oVar2.close();
                } catch (Throwable th2) {
                    C42759l.m75532a(th, th2);
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        C42765r rVar2 = new C42765r(nVar);
        try {
            if (rVar2.f112024a != null) {
                if (!this.f112048b) {
                    closeable = fVar.f112039b.mo45828g(build);
                } else if (this.f112049c) {
                    closeable = fVar.f112039b.mo45814e(build);
                } else {
                    closeable = (Closeable) fVar.f112038a.mo45889c(build, new C42786j());
                }
                C42765r rVar3 = new C42765r(closeable);
                try {
                    Closeable closeable2 = rVar3.f112024a;
                    if (closeable2 instanceof C42739a) {
                        channel = ((C42739a) closeable2).mo45845b();
                    } else if (closeable2 instanceof RandomAccessFile) {
                        channel = ((RandomAccessFile) closeable2).getChannel();
                    } else {
                        throw new IOException("Lock stream not convertible to FileChannel");
                    }
                    FileChannel fileChannel = channel;
                    if (this.f112047a) {
                        fVar.f112039b.mo45826c();
                        try {
                            FileLock tryLock = fileChannel.tryLock(0, Long.MAX_VALUE, this.f112048b);
                            mVar = tryLock == null ? null : new C42760m(tryLock);
                        } catch (IOException unused) {
                        }
                    } else {
                        fVar.f112039b.mo45826c();
                        mVar = new C42760m(fileChannel.lock(0, Long.MAX_VALUE, this.f112048b));
                    }
                    rVar = new C42765r(mVar);
                    if (rVar.f112024a == null) {
                        rVar.close();
                    } else {
                        Closeable closeable3 = rVar2.f112024a;
                        rVar2.f112024a = null;
                        Closeable closeable4 = rVar3.f112024a;
                        rVar3.f112024a = null;
                        Closeable closeable5 = rVar.f112024a;
                        rVar.f112024a = null;
                        dVar = new C42780d(closeable3, closeable4, closeable5);
                        rVar.close();
                    }
                    rVar3.close();
                } catch (Throwable th3) {
                    rVar3.close();
                    throw th3;
                }
            }
            rVar2.close();
            return dVar;
        } catch (Throwable th4) {
            try {
                rVar2.close();
            } catch (Throwable th5) {
                C42779c.m75546a(th4, th5);
            }
            throw th4;
        }
        throw th;
        throw th;
        throw th;
    }
}
