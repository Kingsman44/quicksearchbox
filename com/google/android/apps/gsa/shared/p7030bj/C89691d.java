package com.google.android.apps.gsa.shared.p7030bj;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.shared.bj.d */
/* compiled from: PG */
public final class C89691d extends InputStream implements InputStreamRetargetInterface, C90991b {

    /* renamed from: a */
    Thread f242819a;

    /* renamed from: b */
    private final InputStream f242820b;

    /* renamed from: c */
    private final C89690c f242821c;

    /* renamed from: d */
    private int f242822d = 0;

    /* renamed from: e */
    private final Object f242823e = new Object();

    /* renamed from: f */
    private boolean f242824f;

    public C89691d(InputStream inputStream, C89690c cVar) {
        inputStream.getClass();
        this.f242820b = inputStream;
        this.f242821c = cVar;
    }

    /* renamed from: f */
    private final void m146071f(IOException iOException) {
        C89690c cVar = this.f242821c;
        if (cVar != null) {
            cVar.mo83591a(iOException);
        }
    }

    /* renamed from: a */
    public final void mo83592a() {
        synchronized (this.f242823e) {
            this.f242824f = true;
            Thread thread = this.f242819a;
            if (thread != null) {
                thread.interrupt();
            }
        }
    }

    public final int available() {
        try {
            return this.f242820b.available();
        } catch (IOException e) {
            m146071f(e);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo83594b() {
        synchronized (this.f242823e) {
            this.f242819a = null;
            Thread.interrupted();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo83595c() {
        synchronized (this.f242823e) {
            if (this.f242824f) {
                return false;
            }
            this.f242819a = Thread.currentThread();
            return true;
        }
    }

    public final void close() {
        try {
            this.f242820b.close();
        } catch (IOException e) {
            m146071f(e);
        }
    }

    /* renamed from: e */
    public final boolean mo83597e() {
        boolean z;
        synchronized (this.f242823e) {
            z = this.f242819a != null;
        }
        return z;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WebViewInputStream");
        fVar.mo85279c("read bytes size").mo85276a(C90752i.m148230d(Integer.valueOf(this.f242822d)));
        synchronized (this.f242823e) {
            if (this.f242824f) {
                fVar.mo85279c("reading canceled").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f242824f)));
            }
        }
        if (mo83597e()) {
            fVar.mo85279c("is being read").mo85276a(C90752i.m148228b(true));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() {
        /*
            r2 = this;
            boolean r0 = r2.mo83595c()
            r1 = -1
            if (r0 == 0) goto L_0x001f
            java.io.InputStream r0 = r2.f242820b     // Catch:{ IOException -> 0x0013 }
            int r0 = r0.read()     // Catch:{ IOException -> 0x0013 }
            r2.mo83594b()
            goto L_0x0020
        L_0x0011:
            r0 = move-exception
            goto L_0x001b
        L_0x0013:
            r0 = move-exception
            r2.m146071f(r0)     // Catch:{ all -> 0x0011 }
            r2.mo83594b()
            goto L_0x001f
        L_0x001b:
            r2.mo83594b()
            throw r0
        L_0x001f:
            r0 = -1
        L_0x0020:
            if (r0 == r1) goto L_0x0028
            int r1 = r2.f242822d
            int r1 = r1 + 1
            r2.f242822d = r1
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7030bj.C89691d.read():int");
    }

    public final long skip(long j) {
        try {
            return this.f242820b.skip(j);
        } catch (IOException e) {
            m146071f(e);
            throw e;
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final synchronized void reset() {
        try {
            this.f242820b.reset();
            this.f242822d = 0;
        } catch (IOException e) {
            m146071f(e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r3) {
        /*
            r2 = this;
            boolean r0 = r2.mo83595c()
            r1 = -1
            if (r0 == 0) goto L_0x001f
            java.io.InputStream r0 = r2.f242820b     // Catch:{ IOException -> 0x0013 }
            int r3 = r0.read(r3)     // Catch:{ IOException -> 0x0013 }
            r2.mo83594b()
            goto L_0x0020
        L_0x0011:
            r3 = move-exception
            goto L_0x001b
        L_0x0013:
            r3 = move-exception
            r2.m146071f(r3)     // Catch:{ all -> 0x0011 }
            r2.mo83594b()
            goto L_0x001f
        L_0x001b:
            r2.mo83594b()
            throw r3
        L_0x001f:
            r3 = -1
        L_0x0020:
            if (r3 == r1) goto L_0x0027
            int r0 = r2.f242822d
            int r0 = r0 + r3
            r2.f242822d = r0
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7030bj.C89691d.read(byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = r2.mo83595c()
            r1 = -1
            if (r0 == 0) goto L_0x001f
            java.io.InputStream r0 = r2.f242820b     // Catch:{ IOException -> 0x0013 }
            int r3 = r0.read(r3, r4, r5)     // Catch:{ IOException -> 0x0013 }
            r2.mo83594b()
            goto L_0x0020
        L_0x0011:
            r3 = move-exception
            goto L_0x001b
        L_0x0013:
            r3 = move-exception
            r2.m146071f(r3)     // Catch:{ all -> 0x0011 }
            r2.mo83594b()
            goto L_0x001f
        L_0x001b:
            r2.mo83594b()
            throw r3
        L_0x001f:
            r3 = -1
        L_0x0020:
            if (r3 == r1) goto L_0x0027
            int r4 = r2.f242822d
            int r4 = r4 + r3
            r2.f242822d = r4
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7030bj.C89691d.read(byte[], int, int):int");
    }
}
