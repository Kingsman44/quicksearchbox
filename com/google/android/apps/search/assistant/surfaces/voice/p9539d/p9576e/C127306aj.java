package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.apps.search.assistant.libraries.p8972f.p8973a.C119369f;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119424i;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.aj */
/* compiled from: PG */
public final class C127306aj implements C119424i {

    /* renamed from: a */
    public static final C59071e f350602a = C59071e.m91331h();

    /* renamed from: b */
    private final C119369f f350603b;

    /* renamed from: c */
    private final C71422aw f350604c;

    public C127306aj(C119369f fVar, C71422aw awVar) {
        C69664n.m101061g(fVar, "optInContextFetcher");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f350603b = fVar;
        this.f350604c = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo104340a(C18496n nVar) {
        C69664n.m101061g(nVar, "params");
        return C71663i.m104692e(this.f350604c, (C71424ay) null, new C127304ah(this, nVar, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.libraries.assistant.o.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: com.google.android.libraries.assistant.o.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: com.google.android.libraries.assistant.o.n} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e1, code lost:
        p5462h.p5472e.C69598b.m101013a(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e4, code lost:
        throw r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108010b(com.google.android.libraries.assistant.p1533o.C18496n r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127305ai
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.d.e.ai r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127305ai) r0
            int r1 = r0.f350601d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350601d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.e.ai r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.e.ai
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f350599b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350601d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r10 = r0.f350598a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0055
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            p5462h.C69714l.m101134b(r11)
            com.google.android.apps.search.assistant.libraries.f.a.a r11 = new com.google.android.apps.search.assistant.libraries.f.a.a
            r11.<init>()
            r2 = 2
            r11.f332802a = r2
            com.google.android.apps.search.assistant.libraries.f.a.e r11 = r11.mo104306a()
            com.google.android.apps.search.assistant.libraries.f.a.f r2 = r9.f350603b
            com.google.common.util.concurrent.cx r11 = r2.mo104311a(r11)
            java.lang.String r2 = "optInContextFetcher.getC…InContext(fetchingConfig)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            r0.f350598a = r10
            r0.f350601d = r3
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 == r1) goto L_0x0174
        L_0x0055:
            com.google.knowledge.b.m r11 = (com.google.knowledge.p4671b.C61820m) r11
            r0 = r10
            com.google.android.libraries.assistant.o.n r0 = (com.google.android.libraries.assistant.p1533o.C18496n) r0
            com.google.protobuf.cq r1 = r0.f52441b
            java.lang.String r2 = "params.headerList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0066:
            boolean r3 = r1.hasNext()
            java.lang.String r4 = "X-Client-Opt-In-Context"
            r5 = -1
            if (r3 == 0) goto L_0x0080
            java.lang.Object r3 = r1.next()
            com.google.android.libraries.assistant.o.w r3 = (com.google.android.libraries.assistant.p1533o.C18505w) r3
            java.lang.String r3 = r3.f52460a
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r4)
            if (r3 != 0) goto L_0x0081
            int r2 = r2 + 1
            goto L_0x0066
        L_0x0080:
            r2 = -1
        L_0x0081:
            r1 = 0
            if (r2 == r5) goto L_0x00e5
            com.google.protobuf.cq r0 = r0.f52441b
            java.lang.Object r0 = r0.get(r2)
            com.google.android.libraries.assistant.o.w r0 = (com.google.android.libraries.assistant.p1533o.C18505w) r0
            java.lang.String r0 = r0.f52461b
            java.lang.String r3 = "params.headerList[targetHeaderIndex].value"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            java.lang.String r3 = "rawString"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)
            r3 = 11
            byte[] r0 = android.util.Base64.decode(r0, r3)
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)
            java.io.InputStream r0 = r0.mo59041m()
            r3.<init>(r0)
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00ba }
            com.google.knowledge.b.m r6 = com.google.knowledge.p4671b.C61820m.f167020J     // Catch:{ ct -> 0x00ba }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (java.io.InputStream) r3, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x00ba }
            com.google.knowledge.b.m r0 = (com.google.knowledge.p4671b.C61820m) r0     // Catch:{ ct -> 0x00ba }
            goto L_0x00da
        L_0x00b8:
            r10 = move-exception
            goto L_0x00df
        L_0x00ba:
            r0 = move-exception
            com.google.common.f.e r6 = f350602a     // Catch:{ all -> 0x00b8 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x00b8 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00b8 }
            com.google.common.f.x r0 = r6.mo56382g(r0)     // Catch:{ all -> 0x00b8 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = "Failed to parse ClientOptInContext param"
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x00b8 }
            r8 = 37288(0x91a8, float:5.2252E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x00b8 }
            r0.mo56379ah(r7)     // Catch:{ all -> 0x00b8 }
            r0.mo56386p(r6)     // Catch:{ all -> 0x00b8 }
            r0 = r1
        L_0x00da:
            p5462h.p5472e.C69598b.m101013a(r3, r1)
            r1 = r0
            goto L_0x00e6
        L_0x00df:
            throw r10     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r11 = move-exception
            p5462h.p5472e.C69598b.m101013a(r3, r10)
            throw r11
        L_0x00e5:
            r2 = -1
        L_0x00e6:
            com.google.protobuf.bv r10 = (com.google.protobuf.C62942bv) r10
            com.google.protobuf.bn r10 = r10.toBuilder()
            java.lang.String r0 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            com.google.android.libraries.assistant.o.m r10 = (com.google.android.libraries.assistant.p1533o.C18495m) r10
            com.google.android.libraries.assistant.o.p r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            if (r2 != r5) goto L_0x0128
            r10.mo24012b()
            com.google.android.libraries.assistant.o.w r0 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.o.v r0 = (com.google.android.libraries.assistant.p1533o.C18504v) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.libraries.assistant.o.y r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            r0.mo24017c(r4)
            byte[] r11 = r11.toByteArray()
            java.lang.String r1 = "assistantContext.toByteArray()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            java.lang.String r11 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127303ag.m208220a(r11)
            r0.mo24018d(r11)
            com.google.android.libraries.assistant.o.w r11 = r0.mo24015a()
            r10.mo24013c(r11)
            goto L_0x016f
        L_0x0128:
            if (r1 == 0) goto L_0x016f
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.knowledge.b.l r1 = (com.google.knowledge.p4671b.C61819l) r1
            r1.mergeFrom(r11)
            com.google.protobuf.bv r11 = r1.build()
            java.lang.String r1 = "searchContext.toBuilder(…assistantContext).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            com.google.knowledge.b.m r11 = (com.google.knowledge.p4671b.C61820m) r11
            r10.mo24012b()
            com.google.protobuf.a.b r1 = r10.mo24012b()
            java.lang.Object r1 = r1.get(r2)
            com.google.android.libraries.assistant.o.w r1 = (com.google.android.libraries.assistant.p1533o.C18505w) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)
            com.google.android.libraries.assistant.o.v r1 = (com.google.android.libraries.assistant.p1533o.C18504v) r1
            com.google.android.libraries.assistant.o.y r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            byte[] r11 = r11.toByteArray()
            java.lang.String r1 = "mergedContext.toByteArray()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            java.lang.String r11 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127303ag.m208220a(r11)
            r0.mo24018d(r11)
            com.google.android.libraries.assistant.o.w r11 = r0.mo24015a()
            r10.mo24014d(r2, r11)
        L_0x016f:
            com.google.android.libraries.assistant.o.n r10 = r10.mo24011a()
            return r10
        L_0x0174:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127306aj.mo108010b(com.google.android.libraries.assistant.o.n, h.c.g):java.lang.Object");
    }
}
