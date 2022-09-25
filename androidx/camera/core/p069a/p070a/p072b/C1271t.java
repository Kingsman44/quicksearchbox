package androidx.camera.core.p069a.p070a.p072b;

import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.p104d.p105a.C2153a;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.a.a.b.t */
/* compiled from: PG */
final class C1271t implements C60870cx {

    /* renamed from: a */
    List f3674a;

    /* renamed from: b */
    List f3675b;

    /* renamed from: c */
    C2164c f3676c;

    /* renamed from: d */
    private final boolean f3677d;

    /* renamed from: e */
    private final AtomicInteger f3678e;

    /* renamed from: f */
    private final C60870cx f3679f = C2169h.m6027a(new C1268q(this));

    public C1271t(List list, boolean z, Executor executor) {
        this.f3674a = list;
        this.f3675b = new ArrayList(list.size());
        this.f3677d = z;
        this.f3678e = new AtomicInteger(list.size());
        mo4106b(new C1269r(this), C1238a.m3410a());
        if (!this.f3674a.isEmpty()) {
            for (int i = 0; i < this.f3674a.size(); i++) {
                this.f3675b.add((Object) null);
            }
            List list2 = this.f3674a;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C60870cx cxVar = (C60870cx) list2.get(i2);
                cxVar.mo4106b(new C1270s(this, i2, cxVar), executor);
            }
            return;
        }
        this.f3676c.mo5437b(new ArrayList(this.f3675b));
    }

    /* renamed from: c */
    private final void m3441c() {
        List<C60870cx> list = this.f3674a;
        if (list != null && !isDone()) {
            for (C60870cx cxVar : list) {
                while (true) {
                    if (!cxVar.isDone()) {
                        try {
                            cxVar.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.f3677d) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00da */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4124a(int r8, java.util.concurrent.Future r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Less than 0 remaining futures"
            java.util.List r1 = r7.f3675b
            boolean r2 = r7.isDone()
            if (r2 != 0) goto L_0x012d
            if (r1 != 0) goto L_0x000e
            goto L_0x012d
        L_0x000e:
            r2 = 0
            r3 = 1
            r4 = 0
            boolean r5 = r9.isDone()     // Catch:{ CancellationException -> 0x00da, ExecutionException -> 0x00a6, RuntimeException -> 0x0076, Error -> 0x004a }
            java.lang.String r6 = "Tried to set value from future which is not done"
            androidx.core.p097i.C1974i.m5315c(r5, r6)     // Catch:{ CancellationException -> 0x00da, ExecutionException -> 0x00a6, RuntimeException -> 0x0076, Error -> 0x004a }
            java.lang.Object r9 = androidx.camera.core.p069a.p070a.p072b.C1263l.m3435g(r9)     // Catch:{ CancellationException -> 0x00da, ExecutionException -> 0x00a6, RuntimeException -> 0x0076, Error -> 0x004a }
            r1.set(r8, r9)     // Catch:{ CancellationException -> 0x00da, ExecutionException -> 0x00a6, RuntimeException -> 0x0076, Error -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r8 = r7.f3678e
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            androidx.core.p097i.C1974i.m5315c(r3, r0)
            if (r8 != 0) goto L_0x0106
            java.util.List r8 = r7.f3675b
            if (r8 == 0) goto L_0x003f
            androidx.d.a.c r9 = r7.f3676c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r9.mo5437b(r0)
            return
        L_0x003f:
            boolean r8 = r7.isDone()
            androidx.core.p097i.C1974i.m5315c(r8, r2)
            return
        L_0x0047:
            r8 = move-exception
            goto L_0x0107
        L_0x004a:
            r8 = move-exception
            androidx.d.a.c r9 = r7.f3676c     // Catch:{ all -> 0x0047 }
            r9.mo5439d(r8)     // Catch:{ all -> 0x0047 }
            java.util.concurrent.atomic.AtomicInteger r8 = r7.f3678e
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            androidx.core.p097i.C1974i.m5315c(r3, r0)
            if (r8 != 0) goto L_0x0106
            java.util.List r8 = r7.f3675b
            if (r8 == 0) goto L_0x006e
            androidx.d.a.c r9 = r7.f3676c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r9.mo5437b(r0)
            return
        L_0x006e:
            boolean r8 = r7.isDone()
            androidx.core.p097i.C1974i.m5315c(r8, r2)
            return
        L_0x0076:
            r8 = move-exception
            boolean r9 = r7.f3677d     // Catch:{ all -> 0x0047 }
            if (r9 == 0) goto L_0x0080
            androidx.d.a.c r9 = r7.f3676c     // Catch:{ all -> 0x0047 }
            r9.mo5439d(r8)     // Catch:{ all -> 0x0047 }
        L_0x0080:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.f3678e
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r3 = 0
        L_0x008a:
            androidx.core.p097i.C1974i.m5315c(r3, r0)
            if (r8 != 0) goto L_0x0106
            java.util.List r8 = r7.f3675b
            if (r8 == 0) goto L_0x009e
            androidx.d.a.c r9 = r7.f3676c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r9.mo5437b(r0)
            return
        L_0x009e:
            boolean r8 = r7.isDone()
            androidx.core.p097i.C1974i.m5315c(r8, r2)
            return
        L_0x00a6:
            r8 = move-exception
            boolean r9 = r7.f3677d     // Catch:{ all -> 0x0047 }
            if (r9 == 0) goto L_0x00b4
            androidx.d.a.c r9 = r7.f3676c     // Catch:{ all -> 0x0047 }
            java.lang.Throwable r8 = r8.getCause()     // Catch:{ all -> 0x0047 }
            r9.mo5439d(r8)     // Catch:{ all -> 0x0047 }
        L_0x00b4:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.f3678e
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            androidx.core.p097i.C1974i.m5315c(r3, r0)
            if (r8 != 0) goto L_0x0106
            java.util.List r8 = r7.f3675b
            if (r8 == 0) goto L_0x00d2
            androidx.d.a.c r9 = r7.f3676c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r9.mo5437b(r0)
            return
        L_0x00d2:
            boolean r8 = r7.isDone()
            androidx.core.p097i.C1974i.m5315c(r8, r2)
            return
        L_0x00da:
            boolean r8 = r7.f3677d     // Catch:{ all -> 0x0047 }
            if (r8 == 0) goto L_0x00e1
            r7.cancel(r4)     // Catch:{ all -> 0x0047 }
        L_0x00e1:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.f3678e
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            androidx.core.p097i.C1974i.m5315c(r3, r0)
            if (r8 != 0) goto L_0x0106
            java.util.List r8 = r7.f3675b
            if (r8 == 0) goto L_0x00ff
            androidx.d.a.c r9 = r7.f3676c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r9.mo5437b(r0)
            return
        L_0x00ff:
            boolean r8 = r7.isDone()
            androidx.core.p097i.C1974i.m5315c(r8, r2)
        L_0x0106:
            return
        L_0x0107:
            java.util.concurrent.atomic.AtomicInteger r9 = r7.f3678e
            int r9 = r9.decrementAndGet()
            if (r9 < 0) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r3 = 0
        L_0x0111:
            androidx.core.p097i.C1974i.m5315c(r3, r0)
            if (r9 != 0) goto L_0x012c
            java.util.List r9 = r7.f3675b
            if (r9 == 0) goto L_0x0125
            androidx.d.a.c r0 = r7.f3676c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            r0.mo5437b(r1)
            goto L_0x012c
        L_0x0125:
            boolean r9 = r7.isDone()
            androidx.core.p097i.C1974i.m5315c(r9, r2)
        L_0x012c:
            throw r8
        L_0x012d:
            boolean r8 = r7.f3677d
            java.lang.String r9 = "Future was done before all dependencies completed"
            androidx.core.p097i.C1974i.m5315c(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.p070a.p072b.C1271t.mo4124a(int, java.util.concurrent.Future):void");
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        ((C2168g) this.f3679f).f6144b.mo4106b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        List<C60870cx> list = this.f3674a;
        if (list != null) {
            for (C60870cx cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.f3679f.cancel(z);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        m3441c();
        return (List) ((C2168g) this.f3679f).f6144b.get();
    }

    public final boolean isCancelled() {
        return ((C2168g) this.f3679f).f6144b.value instanceof C2153a.C2155b;
    }

    public final boolean isDone() {
        return ((C2168g) this.f3679f).f6144b.isDone();
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (List) ((C2168g) this.f3679f).f6144b.get(j, timeUnit);
    }
}
