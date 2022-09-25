package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58480gp;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.cj */
/* compiled from: PG */
public final /* synthetic */ class C124111cj implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C124114cm f342777a;

    /* renamed from: b */
    public final /* synthetic */ C42839ay f342778b;

    /* renamed from: c */
    public final /* synthetic */ Instant f342779c;

    /* renamed from: d */
    public final /* synthetic */ C53245gt f342780d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f342781e;

    /* renamed from: f */
    public final /* synthetic */ C58480gp f342782f;

    public /* synthetic */ C124111cj(C124114cm cmVar, C42839ay ayVar, Instant instant, C53245gt gtVar, byte[] bArr, C58480gp gpVar) {
        this.f342777a = cmVar;
        this.f342778b = ayVar;
        this.f342779c = instant;
        this.f342780d = gtVar;
        this.f342781e = bArr;
        this.f342782f = gpVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x0020=Splitter:B:9:0x0020, B:29:0x0075=Splitter:B:29:0x0075} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r14) {
        /*
            r13 = this;
            com.google.android.apps.search.assistant.platform.pcp.i.cm r0 = r13.f342777a
            com.google.android.libraries.storage.b.ay r1 = r13.f342778b
            j$.time.Instant r2 = r13.f342779c
            com.google.assistant.s.a.gt r3 = r13.f342780d
            byte[] r4 = r13.f342781e
            com.google.common.b.gp r5 = r13.f342782f
            android.database.Cursor r1 = r14.mo45932d(r1)     // Catch:{ InterruptedException -> 0x0076 }
            boolean r6 = r1.moveToNext()     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "data_content"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0056 }
            if (r6 >= 0) goto L_0x0024
            if (r1 == 0) goto L_0x0085
        L_0x0020:
            r1.close()     // Catch:{ InterruptedException -> 0x0076 }
            goto L_0x0085
        L_0x0024:
            byte[] r8 = r1.getBlob(r6)     // Catch:{ all -> 0x0056 }
            com.google.assistant.s.a.j r6 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = "weather_current"
            long r11 = r2.toEpochMilli()     // Catch:{ all -> 0x0056 }
            r6 = 7
            r9 = 0
            r10 = 0
            com.google.android.apps.search.assistant.platform.pcp.f.bk r6 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae.m202972f(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0056 }
            com.google.android.apps.search.assistant.platform.pcp.i.co r7 = r0.f342791g     // Catch:{ all -> 0x0056 }
            int r8 = r6.f341808c     // Catch:{ all -> 0x0056 }
            r9 = 11
            if (r8 != r9) goto L_0x0044
            java.lang.Object r6 = r6.f341809d     // Catch:{ all -> 0x0056 }
            com.google.assistant.s.a.gt r6 = (com.google.assistant.p3994s.p3995a.C53245gt) r6     // Catch:{ all -> 0x0056 }
            goto L_0x0046
        L_0x0044:
            com.google.assistant.s.a.gt r6 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n     // Catch:{ all -> 0x0056 }
        L_0x0046:
            boolean r2 = r7.mo106294a(r6, r3, r2)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0053
            r0.mo106292d(r3, r4, r14, r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0053
        L_0x0050:
            r0.mo106292d(r3, r4, r14, r5)     // Catch:{ all -> 0x0056 }
        L_0x0053:
            if (r1 == 0) goto L_0x0085
            goto L_0x0020
        L_0x0056:
            r14 = move-exception
            if (r1 == 0) goto L_0x0075
            r1.close()     // Catch:{ all -> 0x005d }
            goto L_0x0075
        L_0x005d:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0075 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0075 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x0075 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0075 }
            r2[r5] = r1     // Catch:{ Exception -> 0x0075 }
            r3.invoke(r14, r2)     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            throw r14     // Catch:{ InterruptedException -> 0x0076 }
        L_0x0076:
            r14 = move-exception
            com.google.common.f.a.d r0 = r0.f342789e
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "#SaveWeatherIfNotStale failed"
            r2 = 35417(0x8a59, float:4.963E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56382g(r14)).mo56372aa(r2)).mo56386p(r1)
        L_0x0085:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9339i.C124111cj.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
