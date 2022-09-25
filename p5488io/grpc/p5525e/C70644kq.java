package p5488io.grpc.p5525e;

import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70243bn;
import p5488io.grpc.C70244bo;

/* renamed from: io.grpc.e.kq */
/* compiled from: PG */
final class C70644kq implements C70657lc {

    /* renamed from: a */
    final /* synthetic */ C70652ky f188317a;

    public C70644kq(C70652ky kyVar) {
        this.f188317a = kyVar;
    }

    /* renamed from: a */
    public final C70661lg mo62387a(C70660lf lfVar) {
        synchronized (this.f188317a.f188349l) {
            this.f188317a.f188351n.add(lfVar);
        }
        C70651kx kxVar = new C70651kx(this.f188317a, lfVar);
        if (kxVar.f188338c.f188346i != Long.MAX_VALUE) {
            kxVar.f188337b = kxVar.f188336a.mo61995p().schedule(new C70649kv(kxVar), kxVar.f188338c.f188346i, TimeUnit.MILLISECONDS);
        } else {
            kxVar.f188337b = new FutureTask(new C70645kr(), (Object) null);
        }
        C70652ky kyVar = kxVar.f188338c;
        C70244bo boVar = kyVar.f188354q;
        C70244bo.m102392b((C70243bn) boVar.f187241g.get(Long.valueOf(C70244bo.m102391a(kyVar))), kxVar.f188336a);
        return kxVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 >= r0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r5 = (p5488io.grpc.p5525e.C70660lf) r2.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r3 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r5.mo61837lJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r5.mo61838m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r1 = r6.f188317a.f188349l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0 = r6.f188317a;
        r0.f188350m = true;
        r0.mo62397e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r0 = r2.size();
        r1 = 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62388b() {
        /*
            r6 = this;
            io.grpc.e.ky r0 = r6.f188317a
            java.lang.Object r0 = r0.f188349l
            monitor-enter(r0)
            io.grpc.e.ky r1 = r6.f188317a     // Catch:{ all -> 0x0046 }
            boolean r2 = r1.f188348k     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x000d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0046 }
            java.util.Set r1 = r1.f188351n     // Catch:{ all -> 0x0046 }
            r2.<init>(r1)     // Catch:{ all -> 0x0046 }
            io.grpc.e.ky r1 = r6.f188317a     // Catch:{ all -> 0x0046 }
            io.grpc.Status r3 = r1.f188347j     // Catch:{ all -> 0x0046 }
            r4 = 1
            r1.f188348k = r4     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            int r0 = r2.size()
            r1 = 0
        L_0x0021:
            if (r1 >= r0) goto L_0x0035
            java.lang.Object r5 = r2.get(r1)
            io.grpc.e.lf r5 = (p5488io.grpc.p5525e.C70660lf) r5
            if (r3 != 0) goto L_0x002f
            r5.mo61837lJ()
            goto L_0x0032
        L_0x002f:
            r5.mo61838m(r3)
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0035:
            io.grpc.e.ky r0 = r6.f188317a
            java.lang.Object r1 = r0.f188349l
            monitor-enter(r1)
            io.grpc.e.ky r0 = r6.f188317a     // Catch:{ all -> 0x0043 }
            r0.f188350m = r4     // Catch:{ all -> 0x0043 }
            r0.mo62397e()     // Catch:{ all -> 0x0043 }
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            throw r0
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0049:
            throw r1
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70644kq.mo62388b():void");
    }
}
