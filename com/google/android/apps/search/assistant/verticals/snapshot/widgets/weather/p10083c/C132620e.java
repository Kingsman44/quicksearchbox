package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c;

import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.common.p4522b.C58480gp;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.e */
/* compiled from: PG */
public final /* synthetic */ class C132620e implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C132624i f361929a;

    /* renamed from: b */
    public final /* synthetic */ C42839ay f361930b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f361931c;

    public /* synthetic */ C132620e(C132624i iVar, C42839ay ayVar, C58480gp gpVar) {
        this.f361929a = iVar;
        this.f361930b = ayVar;
        this.f361931c = gpVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r14) {
        /*
            r13 = this;
            java.lang.String r0 = "WeatherWidgetToPcpWriter"
            com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.i r1 = r13.f361929a
            com.google.android.libraries.storage.b.ay r2 = r13.f361930b
            com.google.common.b.gp r3 = r13.f361931c
            android.database.Cursor r2 = r14.mo45932d(r2)     // Catch:{ InterruptedException -> 0x00b9 }
            r4 = 1
            boolean r5 = r2.moveToNext()     // Catch:{ all -> 0x009a }
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = "data_content"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ all -> 0x009a }
            byte[] r8 = r2.getBlob(r5)     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.j r5 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN     // Catch:{ all -> 0x009a }
            java.lang.String r7 = "weather_current"
            com.google.common.v.i r5 = r1.f361945g     // Catch:{ all -> 0x009a }
            j$.time.Instant r5 = r5.mo57444a()     // Catch:{ all -> 0x009a }
            long r11 = r5.toEpochMilli()     // Catch:{ all -> 0x009a }
            r6 = 7
            r9 = 0
            r10 = 0
            com.google.android.apps.search.assistant.platform.pcp.f.bk r5 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae.m202972f(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x009a }
            int r6 = r5.f341808c     // Catch:{ all -> 0x009a }
            r7 = 11
            if (r6 != r7) goto L_0x003d
            java.lang.Object r5 = r5.f341809d     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.gt r5 = (com.google.assistant.p3994s.p3995a.C53245gt) r5     // Catch:{ all -> 0x009a }
            goto L_0x003f
        L_0x003d:
            com.google.assistant.s.a.gt r5 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n     // Catch:{ all -> 0x009a }
        L_0x003f:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x009a }
            int r6 = r5.f139568b     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.gg r6 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN     // Catch:{ all -> 0x009a }
            int r6 = r5.f139568b     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.gg r6 = com.google.assistant.p3994s.p3995a.C53232gg.m86789a(r6)     // Catch:{ all -> 0x009a }
            if (r6 != 0) goto L_0x004f
            com.google.assistant.s.a.gg r6 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN     // Catch:{ all -> 0x009a }
        L_0x004f:
            com.google.assistant.s.a.gg r7 = com.google.assistant.p3994s.p3995a.C53232gg.WEATHER_WIDGET     // Catch:{ all -> 0x009a }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x009a }
            if (r6 == 0) goto L_0x0094
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.gc r5 = (com.google.assistant.p3994s.p3995a.C53228gc) r5     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.gg r6 = com.google.assistant.p3994s.p3995a.C53232gg.WEATHER_WIDGET_POST_REMOVE     // Catch:{ all -> 0x009a }
            r5.copyOnWrite()     // Catch:{ all -> 0x009a }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.gt r7 = (com.google.assistant.p3994s.p3995a.C53245gt) r7     // Catch:{ all -> 0x009a }
            int r6 = r6.f139522g     // Catch:{ all -> 0x009a }
            r7.f139568b = r6     // Catch:{ all -> 0x009a }
            int r6 = r7.f139567a     // Catch:{ all -> 0x009a }
            r6 = r6 | r4
            r7.f139567a = r6     // Catch:{ all -> 0x009a }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x009a }
            com.google.assistant.s.a.gt r5 = (com.google.assistant.p3994s.p3995a.C53245gt) r5     // Catch:{ all -> 0x009a }
            r1.mo110844c(r5, r14, r3)     // Catch:{ all -> 0x009a }
            goto L_0x0094
        L_0x0079:
            com.google.common.f.e r14 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132624i.f361939a     // Catch:{ all -> 0x009a }
            com.google.common.f.x r14 = r14.mo56224b()     // Catch:{ all -> 0x009a }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x009a }
            r14.mo56378ag(r1, r0)     // Catch:{ all -> 0x009a }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x009a }
            r1 = 39770(0x9b5a, float:5.573E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r1)     // Catch:{ all -> 0x009a }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "No weather data found."
            r14.mo56386p(r1)     // Catch:{ all -> 0x009a }
        L_0x0094:
            if (r2 == 0) goto L_0x00cd
            r2.close()     // Catch:{ InterruptedException -> 0x00b9 }
            goto L_0x00cd
        L_0x009a:
            r14 = move-exception
            if (r2 == 0) goto L_0x00b8
            r2.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00b8
        L_0x00a1:
            r1 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00b8 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r5 = 0
            r2[r5] = r3     // Catch:{ Exception -> 0x00b8 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r6, r2)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00b8 }
            r3[r5] = r1     // Catch:{ Exception -> 0x00b8 }
            r2.invoke(r14, r3)     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            throw r14     // Catch:{ InterruptedException -> 0x00b9 }
        L_0x00b9:
            r14 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132624i.f361939a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r0)
            java.lang.String r0 = "#updateDataOrigin failed"
            r2 = 39771(0x9b5b, float:5.5731E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r14)).mo56372aa(r2)).mo56386p(r0)
        L_0x00cd:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132620e.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
