package com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.search.integrations.p3018c.C38502a;
import com.google.apps.tiktok.p3640f.p3641a.p3642a.C47073a;
import com.google.apps.tiktok.p3640f.p3641a.p3642a.C47078f;
import com.google.apps.tiktok.p3640f.p3641a.p3642a.C47079g;
import com.google.apps.tiktok.p3640f.p3641a.p3642a.C47082j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.p4529a.C58982a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4629b.C61312i;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.frameworks.client.a.a.a.a.g */
/* compiled from: PG */
public final class C61292g extends C58982a {

    /* renamed from: b */
    public static final /* synthetic */ int f165777b = 0;

    /* renamed from: c */
    private static final long f165778c = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: a */
    public final Context f165779a;

    /* renamed from: d */
    private final C61293h f165780d;

    /* renamed from: e */
    private final C69464a f165781e;

    /* renamed from: f */
    private final C61298m f165782f = new C61298m(f165778c);

    /* renamed from: g */
    private final C69464a f165783g;

    public C61292g(Context context, C61293h hVar, C69464a aVar, int i, String str) {
        super((String) null);
        this.f165779a = context;
        this.f165780d = hVar;
        this.f165783g = aVar;
        this.f165781e = new C61289d(context, i, str, aVar);
    }

    /* renamed from: e */
    private final void m93800e(C61312i iVar, C60870cx cxVar) {
        C60870cx cxVar2;
        C47082j jVar = (C47082j) this.f165780d;
        C47079g gVar = jVar.f122680c;
        long serializedSize = (long) iVar.getSerializedSize();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -86400000 + elapsedRealtime;
        if (j > 0) {
            C47078f fVar = (C47078f) gVar.f122675a.peek();
            while (fVar != null && fVar.mo51003b() <= j) {
                if (gVar.f122675a.remove(fVar)) {
                    gVar.f122676b.addAndGet(-fVar.mo51002a());
                }
                fVar = (C47078f) gVar.f122675a.peek();
            }
        }
        long j2 = gVar.f122676b.get();
        int i = 0;
        while (true) {
            if (i >= 10 || j2 + serializedSize >= 1048576) {
                Log.w("TikTokClientLogging", "Log rate too high, dropping logs.");
                cxVar2 = C60856cj.m92900i(false);
            } else {
                j2 = gVar.f122676b.get();
                if (gVar.f122676b.compareAndSet(j2, j2 + serializedSize)) {
                    gVar.f122675a.offer(new C47073a(elapsedRealtime, serializedSize));
                    C61295j jVar2 = jVar.f122678a;
                    cxVar2 = C60856cj.m92900i(true);
                    break;
                }
                i++;
            }
        }
        Log.w("TikTokClientLogging", "Log rate too high, dropping logs.");
        cxVar2 = C60856cj.m92900i(false);
        C60856cj.m92911t(cxVar2, C47810es.m84974n(new C61291f(this, cxVar, iVar)), C60826bg.f164896a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0107, code lost:
        r3 = r1.f165780d;
        r4 = ((com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61289d) r1.f165781e).mo57897a();
        r3 = ((com.google.apps.tiktok.p3640f.p3641a.p3642a.C47082j) r3).f122678a;
        r4 = r4.mo57900c(r0, 2, p5304e.p5305a.p5306a.p5446y.p5447a.C69368r.f185533a.mo61034b().mo61035a(r3.f165784a));
        r5 = (java.lang.Throwable) com.google.frameworks.client.p4624a.p4625a.C61302c.m93814b(r0, com.google.common.p4526f.C59090j.f157047a);
        r6 = (com.google.android.libraries.search.integrations.p3018c.C38502a) r3.f165785b.mo17428b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0140, code lost:
        if (r20.mo56309l().intValue() < Integer.MAX_VALUE) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0144, code lost:
        if ((r5 instanceof com.google.common.p4526f.C59099s) != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0146, code lost:
        r0 = ((com.google.frameworks.client.p4624a.p4629b.C61312i) r4.instance).f165823f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014c, code lost:
        if (r0 != null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014e, code lost:
        r0 = com.google.common.p4552o.p4566l.C60110ab.f162553j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0150, code lost:
        r0 = (com.google.common.p4552o.p4566l.C60109aa) r0.toBuilder();
        r3 = (com.google.android.libraries.search.integrations.p3018c.C38502a) r3.f165785b.mo17428b();
        r3 = com.google.common.p4552o.p4568n.C60287a.m92559b(new com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61294i(r5));
        r0.copyOnWrite();
        r5 = (com.google.common.p4552o.p4566l.C60110ab) r0.instance;
        r3 = (com.google.common.p4552o.p4566l.C60120al) r3.build();
        r3.getClass();
        r5.f162563i = r3;
        r5.f162555a |= 1024;
        r0 = (com.google.common.p4552o.p4566l.C60110ab) r0.build();
        r4.copyOnWrite();
        r3 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r4.instance;
        r0.getClass();
        r3.f165823f = r0;
        r3.f165818a |= 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0197, code lost:
        r0 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r4.build();
        r3 = com.google.apps.tiktok.tracing.C47831fm.m85026u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a5, code lost:
        if (r3.isEmpty() != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a7, code lost:
        r0 = (com.google.frameworks.client.p4624a.p4629b.C61310g) r0.toBuilder();
        r4 = (com.google.frameworks.client.p4624a.p4629b.C61306c) com.google.frameworks.client.p4624a.p4629b.C61307d.f165806b.createBuilder();
        r4.copyOnWrite();
        r5 = (com.google.frameworks.client.p4624a.p4629b.C61307d) r4.instance;
        r6 = r5.f165808a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c2, code lost:
        if (r6.mo58948c() != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c4, code lost:
        r5.f165808a = com.google.protobuf.C62942bv.mutableCopy(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ca, code lost:
        com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r5.f165808a);
        r0.copyOnWrite();
        r3 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r0.instance;
        r4 = (com.google.frameworks.client.p4624a.p4629b.C61307d) r4.build();
        r4.getClass();
        r3.f165824g = r4;
        r3.f165818a |= 64;
        r0 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r0.build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ed, code lost:
        m93800e(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f2, code lost:
        r5.mo57892d().getAndIncrement();
        r0 = r1.f165782f;
        r2 = new java.util.ArrayList();
        r0.f165790d.drainTo(r2);
        r0 = com.google.common.p4522b.C58485gu.m89842j(r2);
        r2 = r0.size();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x020e, code lost:
        if (r11 >= r2) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0210, code lost:
        r3 = (com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61297l) r0.get(r11);
        r4 = r3.mo57891c();
        r7 = r3.mo57892d().get();
        r4.copyOnWrite();
        r5 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r4.instance;
        r9 = com.google.frameworks.client.p4624a.p4629b.C61312i.f165816i;
        r5.f165818a |= 2;
        r5.f165820c = r7;
        m93800e((com.google.frameworks.client.p4624a.p4629b.C61312i) r4.build(), r3.mo57890b());
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0242, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36921a(com.google.common.p4526f.p4528b.C59031f r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            com.google.frameworks.client.a.a.a.a.h r2 = r1.f165780d
            com.google.apps.tiktok.f.a.a.j r2 = (com.google.apps.tiktok.p3640f.p3641a.p3642a.C47082j) r2
            com.google.frameworks.client.a.a.a.a.j r3 = r2.f122678a
            com.google.common.f.aa r3 = com.google.frameworks.client.p4624a.p4625a.p4626a.C61285a.f165760a
            java.lang.Object r3 = com.google.frameworks.client.p4624a.p4625a.C61302c.m93814b(r0, r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0017
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            goto L_0x001f
        L_0x0017:
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
        L_0x001f:
            boolean r4 = r3.mo56113h()
            if (r4 == 0) goto L_0x0026
            goto L_0x005b
        L_0x0026:
            dagger.a r3 = r2.f122679b
            java.lang.Object r3 = r3.mo27525b()
            com.google.apps.tiktok.account.data.a.f r3 = (com.google.apps.tiktok.account.data.p3611a.C46128f) r3
            com.google.common.base.ax r3 = r3.f121020b
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0059
            com.google.apps.tiktok.tracing.bk r3 = com.google.apps.tiktok.account.C46059b.f120916a
            com.google.apps.tiktok.tracing.bj r3 = com.google.apps.tiktok.tracing.C47831fm.m85008c(r3)
            boolean r4 = r3.mo51420b()
            if (r4 == 0) goto L_0x0059
            dagger.a r2 = r2.f122679b
            java.lang.Object r2 = r2.mo27525b()
            com.google.apps.tiktok.account.data.a.f r2 = (com.google.apps.tiktok.account.data.p3611a.C46128f) r2
            java.lang.Object r3 = r3.mo51419a()
            com.google.apps.tiktok.account.AccountId r3 = (com.google.apps.tiktok.account.AccountId) r3
            com.google.common.util.concurrent.cx r2 = r2.mo50219i(r3)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x005b
        L_0x0059:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
        L_0x005b:
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60866ct.f164955a
            java.lang.Object r2 = r3.mo56109e(r2)
            com.google.common.util.concurrent.cx r2 = (com.google.common.util.concurrent.C60870cx) r2
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong
            r9 = 0
            r8.<init>(r9)
            g.a.a r3 = r1.f165781e
            com.google.frameworks.client.a.a.a.a.d r3 = (com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61289d) r3
            com.google.frameworks.client.a.a.c r3 = r3.mo17428b()
            r4 = 3
            r11 = 0
            com.google.frameworks.client.a.b.g r4 = r3.mo57900c(r0, r4, r11)
            if (r4 == 0) goto L_0x024e
            long r6 = r20.mo56303d()
            if (r2 == 0) goto L_0x0246
            com.google.frameworks.client.a.a.a.a.a r12 = new com.google.frameworks.client.a.a.a.a.a
            r3 = r12
            r5 = r2
            r3.<init>(r4, r5, r6, r8)
            com.google.frameworks.client.a.a.a.a.m r3 = r1.f165782f
            com.google.common.f.o r4 = r20.mo56304e()
            monitor-enter(r3)
            long r5 = r12.f165762a     // Catch:{ all -> 0x0243 }
            long r7 = r3.f165788b     // Catch:{ all -> 0x0243 }
            r13 = 1000(0x3e8, float:1.401E-42)
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a1
            java.util.LinkedHashMap r7 = r3.f165789c     // Catch:{ all -> 0x0243 }
            int r7 = r7.size()     // Catch:{ all -> 0x0243 }
            if (r7 >= r13) goto L_0x00a1
            goto L_0x00f6
        L_0x00a1:
            java.util.LinkedHashMap r7 = r3.f165789c     // Catch:{ all -> 0x0243 }
            java.util.Collection r7 = r7.values()     // Catch:{ all -> 0x0243 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0243 }
            long r14 = r3.f165787a     // Catch:{ all -> 0x0243 }
            long r14 = r8.toNanos(r14)     // Catch:{ all -> 0x0243 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0243 }
            java.util.LinkedHashMap r8 = r3.f165789c     // Catch:{ all -> 0x0243 }
            int r8 = r8.size()     // Catch:{ all -> 0x0243 }
        L_0x00b9:
            boolean r16 = r7.hasNext()     // Catch:{ all -> 0x0243 }
            if (r16 == 0) goto L_0x00f6
            java.lang.Object r16 = r7.next()     // Catch:{ all -> 0x0243 }
            r11 = r16
            com.google.frameworks.client.a.a.a.a.l r11 = (com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61297l) r11     // Catch:{ all -> 0x0243 }
            long r17 = r11.mo57889a()     // Catch:{ all -> 0x0243 }
            long r17 = r17 + r14
            int r16 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r16 < 0) goto L_0x00dc
            if (r8 <= r13) goto L_0x00d4
            goto L_0x00dc
        L_0x00d4:
            long r5 = r11.mo57889a()     // Catch:{ all -> 0x0243 }
            long r5 = r5 + r14
            r3.f165788b = r5     // Catch:{ all -> 0x0243 }
            goto L_0x00f6
        L_0x00dc:
            java.util.concurrent.atomic.AtomicLong r16 = r11.mo57892d()     // Catch:{ all -> 0x0243 }
            long r17 = r16.get()     // Catch:{ all -> 0x0243 }
            int r16 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r16 <= 0) goto L_0x00ed
            java.util.concurrent.LinkedBlockingQueue r9 = r3.f165790d     // Catch:{ all -> 0x0243 }
            r9.add(r11)     // Catch:{ all -> 0x0243 }
        L_0x00ed:
            r7.remove()     // Catch:{ all -> 0x0243 }
            int r8 = r8 + -1
            r9 = 0
            r11 = 0
            goto L_0x00b9
        L_0x00f6:
            java.util.LinkedHashMap r5 = r3.f165789c     // Catch:{ all -> 0x0243 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0243 }
            com.google.frameworks.client.a.a.a.a.l r5 = (com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61297l) r5     // Catch:{ all -> 0x0243 }
            r6 = 2
            if (r5 != 0) goto L_0x01f1
            java.util.LinkedHashMap r5 = r3.f165789c     // Catch:{ all -> 0x0243 }
            r5.put(r4, r12)     // Catch:{ all -> 0x0243 }
            monitor-exit(r3)     // Catch:{ all -> 0x0243 }
            com.google.frameworks.client.a.a.a.a.h r3 = r1.f165780d
            g.a.a r4 = r1.f165781e
            com.google.frameworks.client.a.a.a.a.d r4 = (com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61289d) r4
            com.google.frameworks.client.a.a.c r4 = r4.mo17428b()
            com.google.apps.tiktok.f.a.a.j r3 = (com.google.apps.tiktok.p3640f.p3641a.p3642a.C47082j) r3
            com.google.frameworks.client.a.a.a.a.j r3 = r3.f122678a
            android.content.Context r5 = r3.f165784a
            e.a.a.y.a.r r7 = p5304e.p5305a.p5306a.p5446y.p5447a.C69368r.f185533a
            e.a.a.y.a.s r7 = r7.mo6453a()
            boolean r5 = r7.mo61035a(r5)
            com.google.frameworks.client.a.b.g r4 = r4.mo57900c(r0, r6, r5)
            com.google.common.f.aa r5 = com.google.common.p4526f.C59090j.f157047a
            java.lang.Object r5 = com.google.frameworks.client.p4624a.p4625a.C61302c.m93814b(r0, r5)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            g.a.a r6 = r3.f165785b
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.libraries.search.integrations.c.a r6 = (com.google.android.libraries.search.integrations.p3018c.C38502a) r6
            java.util.logging.Level r0 = r20.mo56309l()
            int r0 = r0.intValue()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r0 < r6) goto L_0x0197
            boolean r0 = r5 instanceof com.google.common.p4526f.C59099s
            if (r0 != 0) goto L_0x0197
            com.google.protobuf.bv r0 = r4.instance
            com.google.frameworks.client.a.b.i r0 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r0
            com.google.common.o.l.ab r0 = r0.f165823f
            if (r0 != 0) goto L_0x0150
            com.google.common.o.l.ab r0 = com.google.common.p4552o.p4566l.C60110ab.f162553j
        L_0x0150:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.common.o.l.aa r0 = (com.google.common.p4552o.p4566l.C60109aa) r0
            com.google.frameworks.client.a.a.a.a.i r6 = new com.google.frameworks.client.a.a.a.a.i
            g.a.a r3 = r3.f165785b
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.libraries.search.integrations.c.a r3 = (com.google.android.libraries.search.integrations.p3018c.C38502a) r3
            r6.<init>(r5)
            com.google.common.o.l.ag r3 = com.google.common.p4552o.p4568n.C60287a.m92559b(r6)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.common.o.l.ab r5 = (com.google.common.p4552o.p4566l.C60110ab) r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.l.al r3 = (com.google.common.p4552o.p4566l.C60120al) r3
            r3.getClass()
            r5.f162563i = r3
            int r3 = r5.f162555a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r5.f162555a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.l.ab r0 = (com.google.common.p4552o.p4566l.C60110ab) r0
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.frameworks.client.a.b.i r3 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r3
            r0.getClass()
            r3.f165823f = r0
            int r0 = r3.f165818a
            r0 = r0 | 32
            r3.f165818a = r0
        L_0x0197:
            com.google.protobuf.bv r0 = r4.build()
            com.google.frameworks.client.a.b.i r0 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r0
            java.util.List r3 = com.google.apps.tiktok.tracing.C47831fm.m85026u()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x01ed
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.frameworks.client.a.b.g r0 = (com.google.frameworks.client.p4624a.p4629b.C61310g) r0
            com.google.frameworks.client.a.b.d r4 = com.google.frameworks.client.p4624a.p4629b.C61307d.f165806b
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.frameworks.client.a.b.c r4 = (com.google.frameworks.client.p4624a.p4629b.C61306c) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.frameworks.client.a.b.d r5 = (com.google.frameworks.client.p4624a.p4629b.C61307d) r5
            com.google.protobuf.cq r6 = r5.f165808a
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x01ca
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f165808a = r6
        L_0x01ca:
            com.google.protobuf.cq r5 = r5.f165808a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r5)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.frameworks.client.a.b.i r3 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r3
            com.google.protobuf.bv r4 = r4.build()
            com.google.frameworks.client.a.b.d r4 = (com.google.frameworks.client.p4624a.p4629b.C61307d) r4
            r4.getClass()
            r3.f165824g = r4
            int r4 = r3.f165818a
            r4 = r4 | 64
            r3.f165818a = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.frameworks.client.a.b.i r0 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r0
        L_0x01ed:
            r1.m93800e(r0, r2)
            return
        L_0x01f1:
            monitor-exit(r3)     // Catch:{ all -> 0x0243 }
            java.util.concurrent.atomic.AtomicLong r0 = r5.mo57892d()
            r0.getAndIncrement()
            com.google.frameworks.client.a.a.a.a.m r0 = r1.f165782f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = r0.f165790d
            r0.drainTo(r2)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r2)
            int r2 = r0.size()
            r11 = 0
        L_0x020e:
            if (r11 >= r2) goto L_0x0242
            java.lang.Object r3 = r0.get(r11)
            com.google.frameworks.client.a.a.a.a.l r3 = (com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61297l) r3
            com.google.frameworks.client.a.b.g r4 = r3.mo57891c()
            java.util.concurrent.atomic.AtomicLong r5 = r3.mo57892d()
            long r7 = r5.get()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.frameworks.client.a.b.i r5 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r5
            com.google.frameworks.client.a.b.i r9 = com.google.frameworks.client.p4624a.p4629b.C61312i.f165816i
            int r9 = r5.f165818a
            r9 = r9 | r6
            r5.f165818a = r9
            r5.f165820c = r7
            com.google.protobuf.bv r4 = r4.build()
            com.google.frameworks.client.a.b.i r4 = (com.google.frameworks.client.p4624a.p4629b.C61312i) r4
            com.google.common.util.concurrent.cx r3 = r3.mo57890b()
            r1.m93800e(r4, r3)
            int r11 = r11 + 1
            goto L_0x020e
        L_0x0242:
            return
        L_0x0243:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0243 }
            throw r0
        L_0x0246:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null account"
            r0.<init>(r2)
            throw r0
        L_0x024e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null eventBuilder"
            r0.<init>(r2)
            goto L_0x0257
        L_0x0256:
            throw r0
        L_0x0257:
            goto L_0x0256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a.C61292g.mo36921a(com.google.common.f.b.f):void");
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        C38502a aVar = (C38502a) this.f165783g.mo17428b();
        return level.intValue() >= Level.SEVERE.intValue();
    }

    /* renamed from: c */
    public final void mo36923c(RuntimeException runtimeException, C59031f fVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }
}
