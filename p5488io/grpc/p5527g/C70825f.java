package p5488io.grpc.p5527g;

import com.google.common.base.C58838bb;
import java.io.IOException;
import java.net.Socket;
import p5488io.grpc.p5525e.C70633kf;
import p5488io.p5489a.C69792b;
import p5589m.C71828e;
import p5589m.C71845v;

/* renamed from: io.grpc.g.f */
/* compiled from: PG */
final class C70825f implements C71845v {

    /* renamed from: a */
    public final Object f188882a = new Object();

    /* renamed from: b */
    public final C71828e f188883b = new C71828e();

    /* renamed from: c */
    public final C70826g f188884c;

    /* renamed from: d */
    public boolean f188885d = false;

    /* renamed from: e */
    public boolean f188886e = false;

    /* renamed from: f */
    public C71845v f188887f;

    /* renamed from: g */
    public Socket f188888g;

    /* renamed from: h */
    public int f188889h;

    /* renamed from: i */
    public int f188890i;

    /* renamed from: j */
    private final C70633kf f188891j;

    /* renamed from: k */
    private boolean f188892k = false;

    /* renamed from: l */
    private boolean f188893l;

    public C70825f(C70633kf kfVar, C70826g gVar) {
        C58838bb.m90866a(kfVar, "executor");
        this.f188891j = kfVar;
        this.f188884c = gVar;
    }

    public final void close() {
        if (!this.f188892k) {
            this.f188892k = true;
            this.f188891j.execute(new C70822c(this));
        }
    }

    public final void flush() {
        if (!this.f188892k) {
            int i = C69792b.f186180a;
            synchronized (this.f188882a) {
                if (!this.f188886e) {
                    this.f188886e = true;
                    this.f188891j.execute(new C70821b(this));
                    return;
                }
                return;
            }
        }
        throw new IOException("closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r8 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.f188888g.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.f188884c.mo62539a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        r6.f188891j.execute(new p5488io.grpc.p5527g.C70770a(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return;
     */
    /* renamed from: mq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62538mq(p5589m.C71828e r7, long r8) {
        /*
            r6 = this;
            boolean r0 = r6.f188892k
            if (r0 != 0) goto L_0x005e
            int r0 = p5488io.p5489a.C69792b.f186180a
            java.lang.Object r0 = r6.f188882a     // Catch:{ all -> 0x005c }
            monitor-enter(r0)     // Catch:{ all -> 0x005c }
            m.e r1 = r6.f188883b     // Catch:{ all -> 0x0059 }
            r1.mo62538mq(r7, r8)     // Catch:{ all -> 0x0059 }
            int r7 = r6.f188890i     // Catch:{ all -> 0x0059 }
            int r8 = r6.f188889h     // Catch:{ all -> 0x0059 }
            int r7 = r7 + r8
            r6.f188890i = r7     // Catch:{ all -> 0x0059 }
            r8 = 0
            r6.f188889h = r8     // Catch:{ all -> 0x0059 }
            boolean r9 = r6.f188893l     // Catch:{ all -> 0x0059 }
            r1 = 1
            if (r9 != 0) goto L_0x0025
            r9 = 10000(0x2710, float:1.4013E-41)
            if (r7 <= r9) goto L_0x0025
            r6.f188893l = r1     // Catch:{ all -> 0x0059 }
            r8 = 1
            goto L_0x003c
        L_0x0025:
            boolean r7 = r6.f188885d     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x0057
            boolean r7 = r6.f188886e     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x0057
            m.e r7 = r6.f188883b     // Catch:{ all -> 0x0059 }
            long r2 = r7.mo63067f()     // Catch:{ all -> 0x0059 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            r6.f188885d = r1     // Catch:{ all -> 0x0059 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x004c
            java.net.Socket r7 = r6.f188888g     // Catch:{ IOException -> 0x0045 }
            r7.close()     // Catch:{ IOException -> 0x0045 }
            return
        L_0x0045:
            r7 = move-exception
            io.grpc.g.g r8 = r6.f188884c     // Catch:{ all -> 0x005c }
            r8.mo62539a(r7)     // Catch:{ all -> 0x005c }
            return
        L_0x004c:
            io.grpc.e.kf r7 = r6.f188891j     // Catch:{ all -> 0x005c }
            io.grpc.g.a r8 = new io.grpc.g.a     // Catch:{ all -> 0x005c }
            r8.<init>(r6)     // Catch:{ all -> 0x005c }
            r7.execute(r8)     // Catch:{ all -> 0x005c }
            return
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            return
        L_0x0059:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            throw r7     // Catch:{ all -> 0x005c }
        L_0x005c:
            r7 = move-exception
            throw r7
        L_0x005e:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.C70825f.mo62538mq(m.e, long):void");
    }
}
