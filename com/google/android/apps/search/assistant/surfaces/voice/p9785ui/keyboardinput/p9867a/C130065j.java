package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.google.frameworks.client.data.android.C61531o;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.j */
/* compiled from: PG */
public final class C130065j implements C130057b {

    /* renamed from: a */
    public final C130068m f356661a;

    /* renamed from: b */
    public final C71422aw f356662b;

    /* renamed from: c */
    private final C61531o f356663c;

    /* renamed from: d */
    private final C130073r f356664d;

    public C130065j(C130068m mVar, C61531o oVar, C130073r rVar, C71422aw awVar) {
        C69664n.m101061g(oVar, "httpClient");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f356661a = mVar;
        this.f356663c = oVar;
        this.f356664d = rVar;
        this.f356662b = awVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.frameworks.client.data.android.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: com.google.frameworks.client.data.android.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: com.google.frameworks.client.data.android.ae} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010b A[LOOP:1: B:22:0x0105->B:24:0x010b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109477a(java.lang.String r7, java.util.Map r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130058c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130058c) r0
            int r1 = r0.f356641d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f356641d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.c r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.c
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f356639b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f356641d
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            java.lang.Object r7 = r0.f356638a
            p5462h.C69714l.m101134b(r9)
            goto L_0x00fb
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.m r9 = r6.f356661a
            android.content.Context r9 = r9.f356668b
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r3]
            float r9 = r9.density
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r5 = 0
            r4[r5] = r9
            java.lang.String r9 = "%.1f"
            java.lang.String r9 = java.lang.String.format(r2, r9, r4)
            if (r9 == 0) goto L_0x012d
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.a r2 = new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.a
            r2.<init>(r9)
            java.lang.String r9 = "query"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r9)
            java.lang.String r9 = "cgiParams"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r9)
            android.net.Uri$Builder r9 = new android.net.Uri$Builder
            r9.<init>()
            java.lang.String r4 = "https"
            android.net.Uri$Builder r9 = r9.scheme(r4)
            java.lang.String r4 = "www.google.com"
            android.net.Uri$Builder r9 = r9.authority(r4)
            java.lang.String r4 = "complete"
            android.net.Uri$Builder r9 = r9.appendPath(r4)
            java.lang.String r4 = "search"
            android.net.Uri$Builder r9 = r9.appendPath(r4)
            com.google.common.b.hd r8 = (com.google.common.p4522b.C58495hd) r8
            com.google.common.b.ij r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x008c:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r8.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r9.appendQueryParameter(r5, r4)
            goto L_0x008c
        L_0x00a8:
            java.lang.String r8 = "client"
            java.lang.String r4 = r2.f356636a
            r9.appendQueryParameter(r8, r4)
            java.lang.String r8 = "oe"
            java.lang.String r4 = "utf-8"
            android.net.Uri$Builder r8 = r9.appendQueryParameter(r8, r4)
            java.lang.String r9 = "xhr"
            java.lang.String r4 = "t"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r9, r4)
            java.lang.String r9 = "dpr"
            java.lang.String r2 = r2.f356637b
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r9, r2)
            java.lang.String r9 = "q"
            android.net.Uri$Builder r7 = r8.appendQueryParameter(r9, r7)
            java.lang.String r8 = "xssi"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r8, r4)
            android.net.Uri r7 = r7.build()
            java.lang.String r8 = "builder\n      .appendQue…SSI_VALUE)\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            com.google.frameworks.client.data.android.ae r8 = new com.google.frameworks.client.data.android.ae
            r8.<init>()
            java.lang.String r7 = r7.toString()
            r7.getClass()
            r8.f165930a = r7
            r0.f356638a = r8
            r0.f356641d = r3
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.i r7 = new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.i
            r9 = 0
            r7.<init>(r6, r9)
            java.lang.Object r9 = kotlinx.coroutines.C71423ax.m104196a(r7, r0)
            if (r9 == r1) goto L_0x012c
            r7 = r8
        L_0x00fb:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r8 = r9.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0105:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0124
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r0 = r9.getKey()
            com.google.frameworks.client.data.android.ad r0 = (com.google.frameworks.client.data.android.C61362ad) r0
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r1 = r7
            com.google.frameworks.client.data.android.ae r1 = (com.google.frameworks.client.data.android.C61363ae) r1
            r1.mo57932a(r0, r9)
            goto L_0x0105
        L_0x0124:
            com.google.frameworks.client.data.android.ag r8 = new com.google.frameworks.client.data.android.ag
            com.google.frameworks.client.data.android.ae r7 = (com.google.frameworks.client.data.android.C61363ae) r7
            r8.<init>(r7)
            return r8
        L_0x012c:
            return r1
        L_0x012d:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Null devicePixelRatioParameter"
            r7.<init>(r8)
            goto L_0x0136
        L_0x0135:
            throw r7
        L_0x0136:
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130065j.mo109477a(java.lang.String, java.util.Map, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r8 == r1) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109478b(java.lang.String r6, java.util.Map r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130060e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130060e) r0
            int r1 = r0.f356649d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f356649d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.e
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f356647b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f356649d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r6 = r0.f356646a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0062
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f356646a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0048
        L_0x003a:
            p5462h.C69714l.m101134b(r8)
            r0.f356646a = r5
            r0.f356649d = r4
            java.lang.Object r8 = r5.mo109477a(r6, r7, r0)
            if (r8 == r1) goto L_0x012d
            r6 = r5
        L_0x0048:
            com.google.frameworks.client.data.android.ag r8 = (com.google.frameworks.client.data.android.C61365ag) r8
            r7 = r6
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.j r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130065j) r7
            com.google.frameworks.client.data.android.o r7 = r7.f356663c
            com.google.common.util.concurrent.cx r7 = r7.mo42484a(r8)
            java.lang.String r8 = "httpClient.makeRequest(httpRequest)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r0.f356646a = r6
            r0.f356649d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r8 == r1) goto L_0x012d
        L_0x0062:
            com.google.frameworks.client.data.android.ah r8 = (com.google.frameworks.client.data.android.C61366ah) r8
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.j r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130065j) r6
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.r r6 = r6.f356664d
            java.lang.String r6 = "CompleteServerResponseParser parse"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r6)
            java.nio.ByteBuffer r7 = r8.f165946b     // Catch:{ ct -> 0x00e9 }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00e9 }
            com.google.at.h.d.a.ar r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54229ar.f142352d     // Catch:{ ct -> 0x00e9 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r0, (java.nio.ByteBuffer) r7, (com.google.protobuf.C62921ba) r8)     // Catch:{ ct -> 0x00e9 }
            com.google.at.h.d.a.ar r7 = (com.google.p4017at.p4060h.p4073d.p4074a.C54229ar) r7     // Catch:{ ct -> 0x00e9 }
            com.google.protobuf.cq r7 = r7.f142355b     // Catch:{ all -> 0x00e7 }
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.o r8 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130070o.f356672a     // Catch:{ all -> 0x00e7 }
            j$.util.stream.Stream r7 = r7.filter(r8)     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.p r8 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130071p.f356673a     // Catch:{ all -> 0x00e7 }
            j$.util.stream.Stream r7 = r7.map(r8)     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.q r8 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130072q.f356674a     // Catch:{ all -> 0x00e7 }
            j$.util.stream.Collector r8 = p3186j$.util.stream.Collectors.toCollection(r8)     // Catch:{ all -> 0x00e7 }
            java.lang.Object r7 = r7.collect(r8)     // Catch:{ all -> 0x00e7 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.aj r8 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130089aj.f356708f     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.ai r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130088ai) r8     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.al r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130091al.f356716b     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.ak r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130090ak) r0     // Catch:{ all -> 0x00e7 }
            r0.copyOnWrite()     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.al r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130091al) r1     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.cq r2 = r1.f356718a     // Catch:{ all -> 0x00e7 }
            boolean r3 = r2.mo58948c()     // Catch:{ all -> 0x00e7 }
            if (r3 != 0) goto L_0x00bf
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)     // Catch:{ all -> 0x00e7 }
            r1.f356718a = r2     // Catch:{ all -> 0x00e7 }
        L_0x00bf:
            com.google.protobuf.cq r1 = r1.f356718a     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r1)     // Catch:{ all -> 0x00e7 }
            r8.copyOnWrite()     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.bv r7 = r8.instance     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.aj r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130089aj) r7     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.al r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130091al) r0     // Catch:{ all -> 0x00e7 }
            r0.getClass()     // Catch:{ all -> 0x00e7 }
            r7.f356712c = r0     // Catch:{ all -> 0x00e7 }
            r7.f356711b = r4     // Catch:{ all -> 0x00e7 }
            com.google.protobuf.bv r7 = r8.build()     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.aj r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130089aj) r7     // Catch:{ all -> 0x00e7 }
            r6.close()
            java.lang.String r6 = "responseParser.parseServ…estResponse(httpResponse)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            return r7
        L_0x00e7:
            r7 = move-exception
            goto L_0x0111
        L_0x00e9:
            r7 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130073r.f356675a     // Catch:{ all -> 0x00e7 }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x00e7 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00e7 }
            com.google.common.f.aa r0 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b     // Catch:{ all -> 0x00e7 }
            r1 = 145773063(0x8b05207, float:1.0611899E-33)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e7 }
            r8.mo56378ag(r0, r1)     // Catch:{ all -> 0x00e7 }
            com.google.common.f.x r8 = r8.mo56382g(r7)     // Catch:{ all -> 0x00e7 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00e7 }
            r0 = 38695(0x9727, float:5.4223E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r0)     // Catch:{ all -> 0x00e7 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00e7 }
            r8.mo56384n()     // Catch:{ all -> 0x00e7 }
            throw r7     // Catch:{ all -> 0x00e7 }
        L_0x0111:
            r6.close()     // Catch:{ all -> 0x0115 }
            goto L_0x012c
        L_0x0115:
            r6 = move-exception
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x012c }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r1 = 0
            r8[r1] = r0     // Catch:{ Exception -> 0x012c }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r2 = "addSuppressed"
            java.lang.reflect.Method r8 = r0.getDeclaredMethod(r2, r8)     // Catch:{ Exception -> 0x012c }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x012c }
            r0[r1] = r6     // Catch:{ Exception -> 0x012c }
            r8.invoke(r7, r0)     // Catch:{ Exception -> 0x012c }
        L_0x012c:
            throw r7
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130065j.mo109478b(java.lang.String, java.util.Map, h.c.g):java.lang.Object");
    }
}
