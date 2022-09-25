package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import android.content.Context;
import androidx.work.C4377aa;
import androidx.work.C4378ab;
import androidx.work.C4382af;
import androidx.work.C4383ag;
import androidx.work.C4631l;
import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.android.libraries.privatetelemetry.tqcobalt.jni.C32026a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32012f;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.C32021d;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32031d;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32039l;
import com.google.android.p10713e.C142538d;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
public final class LogWriter extends C4378ab {

    /* renamed from: a */
    public static final C59071e f86065a = C59071e.m91332i("com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogWriter");

    /* renamed from: b */
    public static final C4377aa f86066b = new C4645z(C4632m.f14549a);

    /* renamed from: g */
    public final C32012f f86067g;

    /* renamed from: h */
    public final String f86068h;

    /* renamed from: i */
    public final C32026a f86069i;

    /* renamed from: j */
    public final C32027a f86070j;

    /* renamed from: k */
    private final C32021d f86071k;

    /* renamed from: l */
    private final ExecutorService f86072l;

    /* renamed from: m */
    private final C32039l f86073m;

    /* renamed from: n */
    private final C21370a f86074n;

    public LogWriter(Context context, WorkerParameters workerParameters, C32021d dVar, String str, C32026a aVar, ExecutorService executorService, C31639g gVar, C32031d dVar2, C21370a aVar2) {
        super(context, workerParameters);
        this.f86071k = dVar;
        C32012f a = dVar.mo37787a();
        this.f86067g = a;
        this.f86068h = str;
        this.f86069i = aVar;
        this.f86070j = new C32027a(context, a);
        this.f86072l = executorService;
        this.f86073m = new C32039l(gVar, executorService);
        this.f86074n = aVar2;
    }

    /* renamed from: c */
    public static C4383ag m59690c(C142538d dVar, int i, String str) {
        HashMap hashMap = new HashMap();
        C4631l.m13032c("com.google.android.libraries.privatetelemetry.tqcobalt.worker.METRIC_PARAMS", dVar.toByteArray(), hashMap);
        hashMap.put("com.google.android.libraries.privatetelemetry.tqcobalt.worker.METRIC_TYPE", i != 1 ? "INTEGER" : "OCCURRENCE");
        C4632m a = C4631l.m13030a(hashMap);
        C4382af afVar = new C4382af(LogWriter.class);
        afVar.mo9341f(a);
        afVar.mo9338c(str);
        return (C4383ag) afVar.mo9337b();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010b A[Catch:{ Exception -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo9297b() {
        /*
            r11 = this;
            com.google.common.f.e r0 = f86065a
            com.google.common.f.x r1 = r0.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 50503(0xc547, float:7.077E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.libraries.privatetelemetry.tqcobalt.d.f r2 = r11.f86067g
            int r2 = r2.mo37777a()
            com.google.android.libraries.privatetelemetry.tqcobalt.d.f r3 = r11.f86067g
            long r3 = r3.mo37778b()
            java.lang.String r5 = "Cobalt: start logging metric for customerId = %d, projectId = %d"
            r1.mo56394x(r5, r2, r3)
            com.google.android.libraries.privatetelemetry.tqcobalt.e.d r1 = r11.f86071k
            boolean r1 = r1.mo37790d()
            if (r1 == 0) goto L_0x0214
            androidx.work.WorkerParameters r1 = r11.f14000d
            androidx.work.m r1 = r1.f13989b
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r3 = "com.google.android.libraries.privatetelemetry.tqcobalt.worker.METRIC_PARAMS"
            boolean r1 = r1.mo9568c(r3, r2)
            if (r1 == 0) goto L_0x0201
            androidx.work.WorkerParameters r1 = r11.f14000d
            androidx.work.m r1 = r1.f13989b
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r4 = "com.google.android.libraries.privatetelemetry.tqcobalt.worker.METRIC_TYPE"
            boolean r1 = r1.mo9568c(r4, r2)
            if (r1 == 0) goto L_0x01ee
            androidx.work.WorkerParameters r0 = r11.f14000d     // Catch:{ IllegalArgumentException -> 0x01d0 }
            androidx.work.m r0 = r0.f13989b     // Catch:{ IllegalArgumentException -> 0x01d0 }
            java.lang.String r0 = r0.mo9567b(r4)     // Catch:{ IllegalArgumentException -> 0x01d0 }
            int r1 = r0.hashCode()     // Catch:{ IllegalArgumentException -> 0x01d0 }
            r2 = 3
            r5 = 2
            r6 = 4
            r7 = 0
            r8 = 1
            switch(r1) {
                case -2122000943: goto L_0x0083;
                case -1838656495: goto L_0x0079;
                case -1618932450: goto L_0x006f;
                case 216797508: goto L_0x0065;
                case 1999208305: goto L_0x005b;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x008d
        L_0x005b:
            java.lang.String r1 = "CUSTOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 4
            goto L_0x008e
        L_0x0065:
            java.lang.String r1 = "HISTOGRAM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 3
            goto L_0x008e
        L_0x006f:
            java.lang.String r1 = "INTEGER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x0079:
            java.lang.String r1 = "STRING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 2
            goto L_0x008e
        L_0x0083:
            java.lang.String r1 = "OCCURRENCE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 0
            goto L_0x008e
        L_0x008d:
            r0 = -1
        L_0x008e:
            r1 = 5
            if (r0 == 0) goto L_0x00a5
            if (r0 == r8) goto L_0x00a3
            if (r0 == r5) goto L_0x00a6
            if (r0 == r2) goto L_0x00a1
            if (r0 != r6) goto L_0x009b
            r2 = 5
            goto L_0x00a6
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01d0 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x01d0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01d0 }
        L_0x00a1:
            r2 = 4
            goto L_0x00a6
        L_0x00a3:
            r2 = 2
            goto L_0x00a6
        L_0x00a5:
            r2 = 1
        L_0x00a6:
            androidx.work.WorkerParameters r0 = r11.f14000d     // Catch:{ Exception -> 0x01ba }
            androidx.work.m r0 = r0.f13989b     // Catch:{ Exception -> 0x01ba }
            byte[] r0 = r0.mo9569d(r3)     // Catch:{ Exception -> 0x01ba }
            java.lang.Object r0 = p3186j$.util.Objects.requireNonNull(r0)     // Catch:{ Exception -> 0x01ba }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x01ba }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x01ba }
            com.google.android.e.d r4 = com.google.android.p10713e.C142538d.f386774q     // Catch:{ Exception -> 0x01ba }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ Exception -> 0x01ba }
            com.google.android.e.d r0 = (com.google.android.p10713e.C142538d) r0     // Catch:{ Exception -> 0x01ba }
            int r3 = r0.f386778c     // Catch:{ Exception -> 0x01ba }
            if (r3 <= 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x00c6:
            r3 = 0
        L_0x00c7:
            java.lang.String r4 = "customer id must be set"
            com.google.common.base.C58838bb.m90869d(r3, r4)     // Catch:{ Exception -> 0x01ba }
            long r3 = r0.f386779d     // Catch:{ Exception -> 0x01ba }
            r9 = 0
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d6
            r3 = 1
            goto L_0x00d7
        L_0x00d6:
            r3 = 0
        L_0x00d7:
            java.lang.String r4 = "project id must be set"
            com.google.common.base.C58838bb.m90869d(r3, r4)     // Catch:{ Exception -> 0x01ba }
            long r3 = r0.f386780e     // Catch:{ Exception -> 0x01ba }
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e4
            r3 = 1
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            java.lang.String r4 = "metric id must be set"
            com.google.common.base.C58838bb.m90869d(r3, r4)     // Catch:{ Exception -> 0x01ba }
            if (r2 != r8) goto L_0x0103
            int r3 = r0.f386776a     // Catch:{ Exception -> 0x01ba }
            r4 = 11
            if (r3 != r4) goto L_0x00fb
            java.lang.Object r3 = r0.f386777b     // Catch:{ Exception -> 0x01ba }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x01ba }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x01ba }
            goto L_0x00fc
        L_0x00fb:
            r3 = r9
        L_0x00fc:
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r3 = 0
            goto L_0x0104
        L_0x0103:
            r3 = 1
        L_0x0104:
            java.lang.String r4 = "occurrence count can't be negative"
            com.google.common.base.C58838bb.m90869d(r3, r4)     // Catch:{ Exception -> 0x01ba }
            if (r2 != r6) goto L_0x0114
            int r3 = r0.f386776a     // Catch:{ Exception -> 0x01ba }
            r4 = 14
            if (r3 != r4) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r3 = 0
            goto L_0x0115
        L_0x0114:
            r3 = 1
        L_0x0115:
            java.lang.String r4 = "histogram value must be set"
            com.google.common.base.C58838bb.m90869d(r3, r4)     // Catch:{ Exception -> 0x01ba }
            if (r2 != r1) goto L_0x0122
            int r1 = r0.f386776a     // Catch:{ Exception -> 0x01ba }
            r3 = 15
            if (r1 != r3) goto L_0x0123
        L_0x0122:
            r7 = 1
        L_0x0123:
            java.lang.String r1 = "custom value must be set"
            com.google.common.base.C58838bb.m90869d(r7, r1)     // Catch:{ Exception -> 0x01ba }
            com.google.android.libraries.privatetelemetry.tqcobalt.d.f r1 = r11.f86067g
            int r1 = r1.mo37777a()
            com.google.android.libraries.privatetelemetry.tqcobalt.d.f r3 = r11.f86067g
            long r3 = r3.mo37778b()
            j$.util.concurrent.ConcurrentHashMap r5 = com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32031d.f86083a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.util.Pair r1 = android.util.Pair.create(r1, r3)
            boolean r1 = r5.containsKey(r1)
            if (r1 == 0) goto L_0x016d
            com.google.android.libraries.privatetelemetry.tqcobalt.d.f r1 = r11.f86067g
            int r1 = r1.mo37777a()
            com.google.android.libraries.privatetelemetry.tqcobalt.d.f r3 = r11.f86067g
            long r3 = r3.mo37778b()
            j$.util.concurrent.ConcurrentHashMap r5 = com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32031d.f86083a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.util.Pair r1 = android.util.Pair.create(r1, r3)
            java.lang.Object r1 = r5.get(r1)
            com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.e r1 = (com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32032e) r1
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01ae
        L_0x016d:
            com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.l r1 = r11.f86073m
            com.google.android.libraries.privatetelemetry.tqcobalt.d.f r3 = r11.f86067g
            java.util.List r3 = r3.mo37780d()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r3)
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.libraries.phenotype.client.a.g r4 = r1.f86091b
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.j r5 = new com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.j
            r5.<init>(r4)
            j$.util.stream.Stream r3 = r3.map(r5)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r3 = r3.collect(r4)
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
            com.google.common.util.concurrent.cf r4 = com.google.common.util.concurrent.C60856cj.m92892a(r3)
            com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.k r5 = new com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.k
            r5.<init>(r1, r3)
            java.util.concurrent.ExecutorService r1 = r1.f86092c
            com.google.common.util.concurrent.cx r1 = r4.mo57334a(r5, r1)
            com.google.android.libraries.privatetelemetry.tqcobalt.worker.c r3 = new com.google.android.libraries.privatetelemetry.tqcobalt.worker.c
            r3.<init>(r11, r0)
            java.util.concurrent.ExecutorService r4 = r11.f86072l
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r3, r4)
        L_0x01ae:
            com.google.android.libraries.privatetelemetry.tqcobalt.worker.d r3 = new com.google.android.libraries.privatetelemetry.tqcobalt.worker.d
            r3.<init>(r11, r2, r0)
            java.util.concurrent.ExecutorService r0 = r11.f86072l
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r1, r3, r0)
            return r0
        L_0x01ba:
            r0 = move-exception
            com.google.common.f.e r1 = f86065a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Cobalt: provided partial CobaltServiceParams is incorrect"
            r3 = 50504(0xc548, float:7.0771E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            androidx.work.aa r0 = f86066b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x01d0:
            r0 = move-exception
            com.google.common.f.e r1 = f86065a
            com.google.common.f.x r1 = r1.mo56225c()
            androidx.work.WorkerParameters r2 = r11.f14000d
            androidx.work.m r2 = r2.f13989b
            java.lang.String r2 = r2.mo9567b(r4)
            r3 = 50505(0xc549, float:7.0773E-41)
            java.lang.String r4 = "Provided metric type isn't supported: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r4, r2)
            androidx.work.aa r0 = f86066b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x01ee:
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Cobalt: there is no value for metric type key = '%s'"
            r2 = 50506(0xc54a, float:7.0774E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r4)
            androidx.work.aa r0 = f86066b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0201:
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Cobalt: there is no value for metric params key = '%s'"
            r2 = 50507(0xc54b, float:7.0775E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r3)
            androidx.work.aa r0 = f86066b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0214:
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Cobalt: logger is disabled, canceling this task"
            r2 = 50508(0xc54c, float:7.0777E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            androidx.work.WorkerParameters r0 = r11.f14000d
            androidx.work.m r0 = r0.f13989b
            com.google.android.libraries.f.a r1 = r11.f86074n
            long r1 = r1.mo26870b()
            long r0 = r0.mo9572l(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            androidx.work.C4631l.m13034e(r0, r2)
            androidx.work.m r0 = androidx.work.C4631l.m13030a(r2)
            androidx.work.z r1 = new androidx.work.z
            r1.<init>(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogWriter.mo9297b():com.google.common.util.concurrent.cx");
    }
}
