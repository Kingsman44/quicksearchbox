package p5488io.grpc.binder.p5522a;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;
import p5488io.grpc.p5525e.C70472eg;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70657lc;

/* renamed from: io.grpc.binder.a.c */
/* compiled from: PG */
public final class C70198c implements C70472eg, C70220y {

    /* renamed from: a */
    public final C70221z f187090a = new C70221z(this);

    /* renamed from: b */
    private final C70567hu f187091b;

    /* renamed from: c */
    private final C58485gu f187092c;

    /* renamed from: d */
    private final C70175a f187093d;

    /* renamed from: e */
    private final C70237q f187094e;

    /* renamed from: f */
    private final C70229i f187095f;

    /* renamed from: g */
    private C70657lc f187096g;

    /* renamed from: h */
    private ScheduledExecutorService f187097h;

    /* renamed from: i */
    private boolean f187098i;

    public C70198c(C70175a aVar, C70567hu huVar, List list, C70237q qVar, C70229i iVar) {
        this.f187093d = aVar;
        this.f187091b = huVar;
        C58838bb.m90866a(list, "streamTracerFactories");
        this.f187092c = C58485gu.m89842j(list);
        C58838bb.m90866a(qVar, "serverSecurityPolicy");
        this.f187094e = qVar;
        this.f187095f = iVar;
    }

    /* renamed from: a */
    public final List mo61815a() {
        return C58485gu.m89846n(this.f187093d);
    }

    /* renamed from: b */
    public final synchronized void mo61816b() {
        if (!this.f187098i) {
            this.f187098i = true;
            this.f187090a.f187183a = null;
            this.f187096g.mo62388b();
            this.f187097h = (ScheduledExecutorService) this.f187091b.mo62163b(this.f187097h);
        }
    }

    /* renamed from: c */
    public final synchronized void mo61817c(C70657lc lcVar) {
        this.f187096g = lcVar;
        this.f187097h = (ScheduledExecutorService) this.f187091b.mo62162a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo61818d(int r6, android.os.Parcel r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            if (r6 != r0) goto L_0x0078
            int r6 = r7.readInt()     // Catch:{ all -> 0x0075 }
            if (r6 <= 0) goto L_0x0078
            android.os.IBinder r6 = r7.readStrongBinder()     // Catch:{ all -> 0x0075 }
            if (r6 == 0) goto L_0x0078
            int r7 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x0075 }
            io.grpc.a r1 = p5488io.grpc.C70256c.m102407a()     // Catch:{ all -> 0x0075 }
            io.grpc.b r2 = p5488io.grpc.C70172bg.f187020b     // Catch:{ all -> 0x0075 }
            io.grpc.binder.a r3 = r5.f187093d     // Catch:{ all -> 0x0075 }
            r1.mo61688b(r2, r3)     // Catch:{ all -> 0x0075 }
            io.grpc.b r2 = p5488io.grpc.C70172bg.f187019a     // Catch:{ all -> 0x0075 }
            io.grpc.binder.a.r r3 = new io.grpc.binder.a.r     // Catch:{ all -> 0x0075 }
            r3.<init>(r7)     // Catch:{ all -> 0x0075 }
            r1.mo61688b(r2, r3)     // Catch:{ all -> 0x0075 }
            io.grpc.b r2 = p5488io.grpc.binder.p5522a.C70206k.f187117f     // Catch:{ all -> 0x0075 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0075 }
            r1.mo61688b(r2, r3)     // Catch:{ all -> 0x0075 }
            io.grpc.b r2 = p5488io.grpc.binder.p5522a.C70206k.f187118g     // Catch:{ all -> 0x0075 }
            io.grpc.binder.a r3 = r5.f187093d     // Catch:{ all -> 0x0075 }
            android.content.Intent r3 = r3.f187028a     // Catch:{ all -> 0x0075 }
            android.content.ComponentName r3 = r3.getComponent()     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x0075 }
            r1.mo61688b(r2, r3)     // Catch:{ all -> 0x0075 }
            io.grpc.b r2 = p5488io.grpc.binder.p5522a.C70206k.f187119h     // Catch:{ all -> 0x0075 }
            io.grpc.binder.i r3 = r5.f187095f     // Catch:{ all -> 0x0075 }
            r1.mo61688b(r2, r3)     // Catch:{ all -> 0x0075 }
            io.grpc.binder.q r2 = r5.f187094e     // Catch:{ all -> 0x0075 }
            io.grpc.b r3 = p5488io.grpc.binder.p5522a.C70210o.f187136a     // Catch:{ all -> 0x0075 }
            io.grpc.binder.a.n r4 = new io.grpc.binder.a.n     // Catch:{ all -> 0x0075 }
            r4.<init>(r7, r2)     // Catch:{ all -> 0x0075 }
            r1.mo61688b(r3, r4)     // Catch:{ all -> 0x0075 }
            io.grpc.b r7 = p5488io.grpc.p5525e.C70452dn.f187762a     // Catch:{ all -> 0x0075 }
            io.grpc.ee r2 = p5488io.grpc.C70700ee.PRIVACY_AND_INTEGRITY     // Catch:{ all -> 0x0075 }
            r1.mo61688b(r7, r2)     // Catch:{ all -> 0x0075 }
            io.grpc.binder.a.j r7 = new io.grpc.binder.a.j     // Catch:{ all -> 0x0075 }
            io.grpc.e.hu r2 = r5.f187091b     // Catch:{ all -> 0x0075 }
            io.grpc.c r1 = r1.mo61687a()     // Catch:{ all -> 0x0075 }
            com.google.common.b.gu r3 = r5.f187092c     // Catch:{ all -> 0x0075 }
            r7.<init>(r2, r1, r3, r6)     // Catch:{ all -> 0x0075 }
            io.grpc.e.lc r6 = r5.f187096g     // Catch:{ all -> 0x0075 }
            io.grpc.e.lg r6 = r6.mo62387a(r7)     // Catch:{ all -> 0x0075 }
            r7.mo61835e(r6)     // Catch:{ all -> 0x0075 }
            monitor-exit(r5)
            return r0
        L_0x0075:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0078:
            monitor-exit(r5)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70198c.mo61818d(int, android.os.Parcel):boolean");
    }

    public final String toString() {
        String obj = this.f187093d.toString();
        return "BinderServer[" + obj + "]";
    }
}
