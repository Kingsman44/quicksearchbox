package p5488io.grpc.p5533i;

import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70898m;

/* renamed from: io.grpc.i.o */
/* compiled from: PG */
public final class C70876o {

    /* renamed from: a */
    static final boolean f189061a;

    /* renamed from: b */
    static final C70846h f189062b = new C70846h("internal-stub-type", (Object) null);

    /* renamed from: c */
    private static final Logger f189063c = Logger.getLogger(C70876o.class.getName());

    static {
        boolean z = false;
        if (!C58837ba.m90859h(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z = true;
        }
        f189061a = z;
    }

    private C70876o() {
    }

    /* renamed from: a */
    public static C60870cx m103760a(C70898m mVar, Object obj) {
        C70870i iVar = new C70870i(mVar);
        m103765f(mVar, obj, new C70875n(iVar));
        return iVar;
    }

    /* renamed from: b */
    public static C70862aj m103761b(C70898m mVar, C70862aj ajVar, boolean z) {
        C70869h hVar = new C70869h(mVar, z);
        m103766g(mVar, new C70872k(ajVar, hVar));
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e2, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ec, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ed, code lost:
        r5 = r6;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f5, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fc, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fd, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0100, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2 A[ExcHandler: all (th java.lang.Throwable), PHI: r5 
      PHI: (r5v9 boolean) = (r5v1 boolean), (r5v10 boolean), (r5v10 boolean), (r5v10 boolean), (r5v10 boolean) binds: [B:1:0x0016, B:3:0x001a, B:30:0x0067, B:35:0x0077, B:41:0x0086] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0016] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0100  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m103762c(p5488io.grpc.C70888j r4, p5488io.grpc.C70338di r5, p5488io.grpc.C70851i r6, java.lang.Object r7) {
        /*
            io.grpc.i.m r0 = new io.grpc.i.m
            r0.<init>()
            io.grpc.h r1 = f189062b
            io.grpc.i.l r2 = p5488io.grpc.p5533i.C70873l.BLOCKING
            io.grpc.i r6 = r6.mo62569e(r1, r2)
            io.grpc.i r6 = r6.mo62566b(r0)
            io.grpc.m r4 = r4.mo39510a(r5, r6)
            r5 = 0
            com.google.common.util.concurrent.cx r6 = m103760a(r4, r7)     // Catch:{ RuntimeException -> 0x00f4, Error -> 0x00ec, all -> 0x00e2 }
        L_0x001a:
            boolean r7 = r6.isDone()     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            java.lang.String r1 = "Thread interrupted"
            r2 = 0
            r3 = 1
            if (r7 != 0) goto L_0x0067
            p5488io.grpc.p5533i.C70874m.m103755b()     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.Object r7 = r0.poll()     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ InterruptedException -> 0x0057 }
            if (r7 != 0) goto L_0x004b
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ InterruptedException -> 0x0057 }
            r0.f189057b = r7     // Catch:{ InterruptedException -> 0x0057 }
        L_0x0035:
            java.lang.Object r7 = r0.poll()     // Catch:{ all -> 0x0047 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0047 }
            if (r7 != 0) goto L_0x0044
            java.util.concurrent.locks.LockSupport.park(r0)     // Catch:{ all -> 0x0047 }
            p5488io.grpc.p5533i.C70874m.m103755b()     // Catch:{ all -> 0x0047 }
            goto L_0x0035
        L_0x0044:
            r0.f189057b = r2     // Catch:{ InterruptedException -> 0x0057 }
            goto L_0x004b
        L_0x0047:
            r7 = move-exception
            r0.f189057b = r2     // Catch:{ InterruptedException -> 0x0057 }
            throw r7     // Catch:{ InterruptedException -> 0x0057 }
        L_0x004b:
            p5488io.grpc.p5533i.C70874m.m103754a(r7)     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.Object r7 = r0.poll()     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ InterruptedException -> 0x0057 }
            if (r7 != 0) goto L_0x004b
            goto L_0x001a
        L_0x0057:
            r5 = move-exception
            r4.mo27480d(r1, r5)     // Catch:{ RuntimeException -> 0x0064, Error -> 0x0061, all -> 0x005d }
            r5 = 1
            goto L_0x001a
        L_0x005d:
            r4 = move-exception
            r5 = 1
            goto L_0x00fe
        L_0x0061:
            r5 = move-exception
            goto L_0x00ef
        L_0x0064:
            r5 = move-exception
            goto L_0x00f7
        L_0x0067:
            java.lang.Object r7 = p5488io.grpc.p5533i.C70874m.f189055a     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r0.f189057b = r7     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
        L_0x006b:
            java.lang.Object r7 = r0.poll()     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            if (r7 == 0) goto L_0x0077
            p5488io.grpc.p5533i.C70874m.m103754a(r7)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            goto L_0x006b
        L_0x0077:
            java.lang.Object r4 = r6.get()     // Catch:{ InterruptedException -> 0x00ca, ExecutionException -> 0x0085 }
            if (r5 == 0) goto L_0x0084
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L_0x0084:
            return r4
        L_0x0085:
            r6 = move-exception
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            java.lang.String r7 = "t"
            com.google.common.base.C58838bb.m90866a(r6, r7)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r7 = r6
        L_0x0090:
            if (r7 == 0) goto L_0x00b7
            boolean r0 = r7 instanceof p5488io.grpc.StatusException     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            if (r0 != 0) goto L_0x00ab
            boolean r0 = r7 instanceof p5488io.grpc.C70761fa     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            if (r0 != 0) goto L_0x009f
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            goto L_0x0090
        L_0x009f:
            io.grpc.fa r7 = (p5488io.grpc.C70761fa) r7     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.fa r6 = new io.grpc.fa     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.Status r0 = r7.f188571a     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.de r7 = r7.f188572b     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r6.<init>(r0, r7, r3)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            goto L_0x00c9
        L_0x00ab:
            io.grpc.StatusException r7 = (p5488io.grpc.StatusException) r7     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.fa r6 = new io.grpc.fa     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.Status r0 = r7.f186943a     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.de r7 = r7.f186944b     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r6.<init>(r0, r7, r3)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            goto L_0x00c9
        L_0x00b7:
            io.grpc.Status r7 = p5488io.grpc.Status.f186905c     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            java.lang.String r0 = "unexpected exception"
            io.grpc.Status r7 = r7.withDescription(r0)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.Status r6 = r7.mo61678e(r6)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.fa r7 = new io.grpc.fa     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r7.<init>(r6, r2, r3)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r6 = r7
        L_0x00c9:
            throw r6     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
        L_0x00ca:
            r6 = move-exception
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r7.interrupt()     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.Status r7 = p5488io.grpc.Status.f186904b     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.Status r7 = r7.withDescription(r1)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.Status r6 = r7.mo61678e(r6)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            io.grpc.fa r7 = new io.grpc.fa     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            r7.<init>(r6, r2, r3)     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
            throw r7     // Catch:{ RuntimeException -> 0x00e8, Error -> 0x00e4, all -> 0x00e2 }
        L_0x00e2:
            r4 = move-exception
            goto L_0x00fe
        L_0x00e4:
            r6 = move-exception
            r3 = r5
            r5 = r6
            goto L_0x00ef
        L_0x00e8:
            r6 = move-exception
            r3 = r5
            r5 = r6
            goto L_0x00f7
        L_0x00ec:
            r6 = move-exception
            r5 = r6
            r3 = 0
        L_0x00ef:
            java.lang.RuntimeException r4 = m103764e(r4, r5)     // Catch:{ all -> 0x00fc }
            throw r4     // Catch:{ all -> 0x00fc }
        L_0x00f4:
            r6 = move-exception
            r5 = r6
            r3 = 0
        L_0x00f7:
            java.lang.RuntimeException r4 = m103764e(r4, r5)     // Catch:{ all -> 0x00fc }
            throw r4     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r4 = move-exception
            r5 = r3
        L_0x00fe:
            if (r5 == 0) goto L_0x0107
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L_0x0107:
            goto L_0x0109
        L_0x0108:
            throw r4
        L_0x0109:
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5533i.C70876o.m103762c(io.grpc.j, io.grpc.di, io.grpc.i, java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public static void m103763d(C70898m mVar, Object obj, C70862aj ajVar, boolean z) {
        m103765f(mVar, obj, new C70872k(ajVar, new C70869h(mVar, z)));
    }

    /* renamed from: e */
    private static RuntimeException m103764e(C70898m mVar, Throwable th) {
        try {
            mVar.mo27480d((String) null, th);
        } catch (Throwable th2) {
            f189063c.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new AssertionError(th);
        }
    }

    /* renamed from: f */
    private static void m103765f(C70898m mVar, Object obj, C70871j jVar) {
        m103766g(mVar, jVar);
        try {
            mVar.mo27483h(obj);
            mVar.mo27481f();
        } catch (RuntimeException e) {
            throw m103764e(mVar, e);
        } catch (Error e2) {
            throw m103764e(mVar, e2);
        }
    }

    /* renamed from: g */
    private static void m103766g(C70898m mVar, C70871j jVar) {
        mVar.mo27478a(jVar, new C70334de());
        jVar.mo62581e();
    }
}
