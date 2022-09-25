package com.google.android.libraries.mdi.p2210b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4537i.C59290o;
import com.google.common.p4537i.C59294s;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.mdi.b.a */
/* compiled from: PG */
public final class C28596a {

    /* renamed from: a */
    private static final C59290o f77803a = C59294s.m92132b();

    /* renamed from: b */
    private static final TimeZone f77804b = DesugarTimeZone.getTimeZone("America/Los_Angeles");

    /* renamed from: c */
    private final C21370a f77805c;

    /* renamed from: d */
    private final String f77806d;

    /* renamed from: e */
    private final int f77807e;

    /* renamed from: f */
    private final Set f77808f = new HashSet();

    /* renamed from: g */
    private volatile long f77809g;

    public C28596a(C21370a aVar, String str, int i) {
        this.f77805c = aVar;
        this.f77806d = str;
        this.f77807e = i;
        this.f77809g = m53489b();
    }

    /* renamed from: b */
    private final long m53489b() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f77804b);
        gregorianCalendar.setTimeInMillis(this.f77805c.mo26870b());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r0 != false) goto L_0x00ad;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4552o.p4566l.C60124ap mo34273a(java.lang.String r10) {
        /*
            r9 = this;
            int r0 = r9.f77807e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = r9.m53489b()
            java.lang.String r0 = r9.f77806d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = "|"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "|"
            r4.append(r0)
            r4.append(r10)
            java.lang.String r0 = r4.toString()
            com.google.common.i.o r4 = f77803a
            com.google.common.i.n r0 = r4.mo56760b(r0)
            int r4 = r9.f77807e
            long r5 = r0.mo56773c()
            long r7 = (long) r4
            long r5 = r5 % r7
            r7 = 0
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x00ad
            long r4 = r9.f77809g
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0044
            goto L_0x005d
        L_0x0044:
            monitor-enter(r9)
            long r4 = r9.f77809g     // Catch:{ all -> 0x00aa }
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0052
            r9.f77809g = r2     // Catch:{ all -> 0x00aa }
            java.util.Set r4 = r9.f77808f     // Catch:{ all -> 0x00aa }
            r4.clear()     // Catch:{ all -> 0x00aa }
        L_0x0052:
            java.util.Set r4 = r9.f77808f     // Catch:{ all -> 0x00aa }
            boolean r0 = r4.add(r0)     // Catch:{ all -> 0x00aa }
            r0 = r0 ^ r6
            monitor-exit(r9)     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x005d
            goto L_0x00ad
        L_0x005d:
            com.google.common.o.l.ap r0 = com.google.common.p4552o.p4566l.C60124ap.f162605f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.l.ao r0 = (com.google.common.p4552o.p4566l.C60123ao) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.l.ap r1 = (com.google.common.p4552o.p4566l.C60124ap) r1
            int r4 = r1.f162607a
            r4 = r4 | r6
            r1.f162607a = r4
            r1.f162608b = r10
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.common.o.l.ap r10 = (com.google.common.p4552o.p4566l.C60124ap) r10
            int r1 = r10.f162607a
            r1 = r1 | 2
            r10.f162607a = r1
            r10.f162609c = r2
            int r10 = r9.f77807e
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.l.ap r1 = (com.google.common.p4552o.p4566l.C60124ap) r1
            int r2 = r1.f162607a
            r2 = r2 | 4
            r1.f162607a = r2
            long r2 = (long) r10
            r1.f162610d = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.common.o.l.ap r10 = (com.google.common.p4552o.p4566l.C60124ap) r10
            int r1 = r10.f162607a
            r1 = r1 | 8
            r10.f162607a = r1
            r10.f162611e = r6
            com.google.protobuf.bv r10 = r0.build()
            com.google.common.o.l.ap r10 = (com.google.common.p4552o.p4566l.C60124ap) r10
            return r10
        L_0x00aa:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00aa }
            throw r10
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.p2210b.C28596a.mo34273a(java.lang.String):com.google.common.o.l.ap");
    }
}
