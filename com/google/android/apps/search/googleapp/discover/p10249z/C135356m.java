package com.google.android.apps.search.googleapp.discover.p10249z;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.p10181d.C134199ad;
import com.google.android.apps.search.googleapp.discover.p10181d.C134205aj;
import com.google.android.apps.search.googleapp.discover.p10237t.C134935k;
import com.google.android.apps.search.googleapp.discover.p10238u.C135108ga;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.m */
/* compiled from: PG */
public final class C135356m implements C135358o {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f368789a = C59071e.m91331h();

    /* renamed from: b */
    private final C134199ad f368790b;

    /* renamed from: c */
    private final C134205aj f368791c;

    /* renamed from: d */
    private final C135108ga f368792d;

    /* renamed from: e */
    private final C134935k f368793e;

    /* renamed from: f */
    private final C135294aa f368794f;

    /* renamed from: g */
    private final C46778cv f368795g;

    /* renamed from: h */
    private final C71788b f368796h = new C71799m();

    /* renamed from: i */
    private final ConcurrentHashMap f368797i = new ConcurrentHashMap();

    /* renamed from: j */
    private String f368798j = BuildConfig.FLAVOR;

    public C135356m(C71422aw awVar, Executor executor, C134199ad adVar, C134205aj ajVar, C135108ga gaVar, C134935k kVar, C135294aa aaVar, C46778cv cvVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(adVar, "nextPageAppFlowLogger");
        C69664n.m101061g(ajVar, "requestAppFlowLogger");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f368790b = adVar;
        this.f368791c = ajVar;
        this.f368792d = gaVar;
        this.f368793e = kVar;
        this.f368794f = aaVar;
        this.f368795g = cvVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.apps.search.googleapp.discover.z.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.apps.search.googleapp.discover.z.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.google.android.apps.search.googleapp.discover.z.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo112287a(com.google.android.apps.search.googleapp.discover.p10249z.C135359p r8, java.util.UUID r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135354k
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.discover.z.k r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135354k) r0
            int r1 = r0.f368780g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368780g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.k r0 = new com.google.android.apps.search.googleapp.discover.z.k
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f368778e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368780g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p5462h.C69714l.m101134b(r10)
            goto L_0x00b5
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.f368777d
            java.lang.Object r9 = r0.f368776c
            java.lang.Object r2 = r0.f368775b
            java.lang.Object r4 = r0.f368774a
            p5462h.C69714l.m101134b(r10)
            r10 = r8
            r8 = r2
            goto L_0x0058
        L_0x0042:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r10 = r7.f368796h
            r0.f368774a = r7
            r0.f368775b = r8
            r0.f368776c = r9
            r0.f368777d = r10
            r0.f368780g = r4
            java.lang.Object r2 = r10.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x00be
            r4 = r7
        L_0x0058:
            r2 = r4
            com.google.android.apps.search.googleapp.discover.z.m r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r2     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = r2.f368798j     // Catch:{ all -> 0x00b9 }
            r6 = r8
            com.google.android.apps.search.googleapp.discover.z.p r6 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r6     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = r6.f368800b     // Catch:{ all -> 0x00b9 }
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r6)     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x007a
            r2 = r4
            com.google.android.apps.search.googleapp.discover.z.m r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r2     // Catch:{ all -> 0x00b9 }
            j$.util.concurrent.ConcurrentHashMap r2 = r2.f368797i     // Catch:{ all -> 0x00b9 }
            r2.clear()     // Catch:{ all -> 0x00b9 }
            r2 = r8
            com.google.android.apps.search.googleapp.discover.z.p r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r2     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = r2.f368800b     // Catch:{ all -> 0x00b9 }
            r6 = r4
            com.google.android.apps.search.googleapp.discover.z.m r6 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r6     // Catch:{ all -> 0x00b9 }
            r6.f368798j = r2     // Catch:{ all -> 0x00b9 }
        L_0x007a:
            r10.mo63026c(r5)
            com.google.android.apps.search.googleapp.discover.z.p r8 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r8
            com.google.android.apps.search.googleapp.discover.s.ak r10 = r8.f368799a
            java.lang.String r10 = r10.f366409d
            java.lang.String r2 = "token.streamToken.contentId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            com.google.android.apps.search.googleapp.discover.z.m r4 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r4
            j$.util.concurrent.ConcurrentHashMap r2 = r4.f368797i
            boolean r2 = r2.containsKey(r10)
            if (r2 != 0) goto L_0x00b6
            j$.util.concurrent.ConcurrentHashMap r2 = r4.f368797i
            com.google.android.apps.search.googleapp.discover.z.j r6 = com.google.android.apps.search.googleapp.discover.p10249z.C135353j.REQUESTING
            r2.put(r10, r6)
            com.google.apps.tiktok.dataservice.cv r10 = r4.f368795g
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60866ct.f164955a
            com.google.apps.tiktok.dataservice.ai r6 = com.google.android.apps.search.googleapp.discover.p10248y.C135255f.f368471a
            r10.mo50787a(r2, r6)
            r0.f368774a = r5
            r0.f368775b = r5
            r0.f368776c = r5
            r0.f368777d = r5
            r0.f368780g = r3
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r10 = r4.mo112288b(r8, r9, r0)
            if (r10 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            return r10
        L_0x00b6:
            com.google.android.apps.search.googleapp.discover.z.f r8 = com.google.android.apps.search.googleapp.discover.p10249z.C135349f.f368768a
            return r8
        L_0x00b9:
            r8 = move-exception
            r10.mo63026c(r5)
            throw r8
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135356m.mo112287a(com.google.android.apps.search.googleapp.discover.z.p, java.util.UUID, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.android.apps.search.googleapp.discover.z.p} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0163 A[Catch:{ all -> 0x01a5, all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017a A[Catch:{ all -> 0x01a5, all -> 0x01ae }] */
    /* renamed from: b */
    public final java.lang.Object mo112288b(com.google.android.apps.search.googleapp.discover.p10249z.C135359p r20, java.util.UUID r21, p5462h.p5466c.C69577g r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            r0 = r22
            boolean r4 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135355l
            if (r4 == 0) goto L_0x001b
            r4 = r0
            com.google.android.apps.search.googleapp.discover.z.l r4 = (com.google.android.apps.search.googleapp.discover.p10249z.C135355l) r4
            int r5 = r4.f368788h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f368788h = r5
            goto L_0x0020
        L_0x001b:
            com.google.android.apps.search.googleapp.discover.z.l r4 = new com.google.android.apps.search.googleapp.discover.z.l
            r4.<init>(r1, r0)
        L_0x0020:
            java.lang.Object r0 = r4.f368786f
            h.c.a.a r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r6 = r4.f368788h
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x0087
            if (r6 == r9) goto L_0x006a
            if (r6 == r8) goto L_0x0054
            if (r6 != r7) goto L_0x004c
            java.lang.Object r2 = r4.f368785e
            java.lang.Object r3 = r4.f368784d
            java.lang.Object r5 = r4.f368783c
            java.lang.Object r6 = r4.f368782b
            java.lang.Object r4 = r4.f368781a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0046 }
            r8 = r4
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r5
            goto L_0x0153
        L_0x0046:
            r0 = move-exception
            r2 = r6
            r6 = r3
            r3 = r5
            goto L_0x01be
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0054:
            java.lang.Object r3 = r4.f368784d
            java.lang.Object r2 = r4.f368783c
            java.lang.Object r6 = r4.f368782b
            java.lang.Object r8 = r4.f368781a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0067 }
            r18 = r3
            r3 = r2
            r2 = r6
            r6 = r18
            goto L_0x0128
        L_0x0067:
            r0 = move-exception
            r4 = r8
            goto L_0x007f
        L_0x006a:
            java.lang.Object r3 = r4.f368784d
            java.lang.Object r2 = r4.f368783c
            java.lang.Object r6 = r4.f368782b
            java.lang.Object r9 = r4.f368781a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x007d }
            r18 = r3
            r3 = r2
            r2 = r6
            r6 = r18
            goto L_0x00eb
        L_0x007d:
            r0 = move-exception
            r4 = r9
        L_0x007f:
            r18 = r3
            r3 = r2
            r2 = r6
            r6 = r18
            goto L_0x01be
        L_0x0087:
            p5462h.C69714l.m101134b(r0)
            java.lang.String r0 = "S#requestToken"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r0)
            com.google.android.apps.search.googleapp.discover.d.ad r0 = r1.f368790b     // Catch:{ all -> 0x01bc }
            java.lang.Object r11 = r0.f365549b     // Catch:{ all -> 0x01bc }
            monitor-enter(r11)     // Catch:{ all -> 0x01bc }
            java.util.Map r12 = r0.f365550c     // Catch:{ all -> 0x01b9 }
            com.google.android.apps.search.googleapp.discover.d.s r13 = new com.google.android.apps.search.googleapp.discover.d.s     // Catch:{ all -> 0x01b9 }
            r13.<init>(r0)     // Catch:{ all -> 0x01b9 }
            p3186j$.util.Map.EL.computeIfPresent(r12, r3, r13)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r11)     // Catch:{ all -> 0x01b9 }
            r4.f368781a = r1     // Catch:{ all -> 0x01bc }
            r4.f368782b = r2     // Catch:{ all -> 0x01bc }
            r4.f368783c = r3     // Catch:{ all -> 0x01bc }
            r4.f368784d = r6     // Catch:{ all -> 0x01bc }
            r4.f368788h = r9     // Catch:{ all -> 0x01bc }
            com.google.android.apps.search.googleapp.discover.d.ad r0 = r1.f368790b     // Catch:{ all -> 0x01bc }
            java.lang.Object r9 = r0.f365549b     // Catch:{ all -> 0x01bc }
            monitor-enter(r9)     // Catch:{ all -> 0x01bc }
            java.util.Map r0 = r0.f365550c     // Catch:{ all -> 0x01b6 }
            com.google.android.apps.search.googleapp.discover.d.ab r11 = com.google.android.apps.search.googleapp.discover.p10181d.C134197ab.f365542a     // Catch:{ all -> 0x01b6 }
            p3186j$.util.Map.EL.computeIfPresent(r0, r3, r11)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r9)     // Catch:{ all -> 0x01b6 }
            com.google.android.apps.search.googleapp.discover.d.aj r0 = r1.f368791c     // Catch:{ all -> 0x01bc }
            java.lang.String r9 = "requestId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r9)     // Catch:{ all -> 0x01bc }
            com.google.android.libraries.search.b.i.g r9 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97770aB     // Catch:{ all -> 0x01bc }
            java.lang.String r11 = "DISCOVER_NEXT_PAGE_FEED_REQUEST_START"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r11)     // Catch:{ all -> 0x01bc }
            r0.mo111615a(r3, r9)     // Catch:{ all -> 0x01bc }
            com.google.android.apps.search.googleapp.discover.u.ga r0 = r1.f368792d     // Catch:{ all -> 0x01bc }
            com.google.android.apps.search.googleapp.discover.s.ak r9 = r2.f368799a     // Catch:{ all -> 0x01bc }
            int r11 = r9.f366407b     // Catch:{ all -> 0x01bc }
            r12 = 5
            if (r11 != r12) goto L_0x00d6
            java.lang.Object r9 = r9.f366408c     // Catch:{ all -> 0x01bc }
            com.google.bv.e.b.c.a.dp r9 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp) r9     // Catch:{ all -> 0x01bc }
            goto L_0x00d8
        L_0x00d6:
            com.google.bv.e.b.c.a.dp r9 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp.f152986c     // Catch:{ all -> 0x01bc }
        L_0x00d8:
            java.lang.String r11 = "token.streamToken.nextPageToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r11)     // Catch:{ all -> 0x01bc }
            h.c.o r11 = r0.f367991g     // Catch:{ all -> 0x01bc }
            com.google.android.apps.search.googleapp.discover.u.fx r12 = new com.google.android.apps.search.googleapp.discover.u.fx     // Catch:{ all -> 0x01bc }
            r12.<init>(r0, r3, r9, r10)     // Catch:{ all -> 0x01bc }
            java.lang.Object r0 = kotlinx.coroutines.C71803m.m105040a(r11, r12, r4)     // Catch:{ all -> 0x01bc }
            if (r0 == r5) goto L_0x01b5
            r9 = r1
        L_0x00eb:
            com.google.bv.e.b.c.a.dj r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj) r0     // Catch:{ all -> 0x01b2 }
            r11 = r9
            com.google.android.apps.search.googleapp.discover.z.m r11 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r11     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.discover.z.aa r14 = r11.f368794f     // Catch:{ all -> 0x01b2 }
            r11 = r2
            com.google.android.apps.search.googleapp.discover.z.p r11 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r11     // Catch:{ all -> 0x01b2 }
            java.lang.String r11 = r11.f368800b     // Catch:{ all -> 0x01b2 }
            r12 = r9
            com.google.android.apps.search.googleapp.discover.z.m r12 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r12     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.discover.t.k r12 = r12.f368793e     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.discover.t.a r13 = r12.mo112080a(r0)     // Catch:{ all -> 0x01b2 }
            r0 = r2
            com.google.android.apps.search.googleapp.discover.z.p r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r0     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.discover.streamui.h.f r15 = r0.f368801c     // Catch:{ all -> 0x01b2 }
            r4.f368781a = r9     // Catch:{ all -> 0x01b2 }
            r4.f368782b = r2     // Catch:{ all -> 0x01b2 }
            r4.f368783c = r3     // Catch:{ all -> 0x01b2 }
            r4.f368784d = r6     // Catch:{ all -> 0x01b2 }
            r4.f368788h = r8     // Catch:{ all -> 0x01b2 }
            h.c.o r0 = r14.f368539d     // Catch:{ all -> 0x01b2 }
            com.google.android.apps.search.googleapp.discover.z.z r8 = new com.google.android.apps.search.googleapp.discover.z.z     // Catch:{ all -> 0x01b2 }
            r17 = 0
            r12 = r8
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01b2 }
            java.lang.Object r0 = kotlinx.coroutines.C71803m.m105040a(r0, r8, r4)     // Catch:{ all -> 0x01b2 }
            h.c.a.a r8 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x01b2 }
            if (r0 == r8) goto L_0x0125
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x01b2 }
        L_0x0125:
            if (r0 == r5) goto L_0x01b1
            r8 = r9
        L_0x0128:
            r0 = r8
            com.google.android.apps.search.googleapp.discover.z.m r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r0     // Catch:{ all -> 0x01ae }
            com.google.android.apps.search.googleapp.discover.d.ad r0 = r0.f368790b     // Catch:{ all -> 0x01ae }
            java.lang.Object r9 = r0.f365549b     // Catch:{ all -> 0x01ae }
            monitor-enter(r9)     // Catch:{ all -> 0x01ae }
            java.util.Map r11 = r0.f365550c     // Catch:{ all -> 0x01ab }
            com.google.android.apps.search.googleapp.discover.d.t r12 = new com.google.android.apps.search.googleapp.discover.d.t     // Catch:{ all -> 0x01ab }
            r12.<init>(r0)     // Catch:{ all -> 0x01ab }
            p3186j$.util.Map.EL.computeIfPresent(r11, r3, r12)     // Catch:{ all -> 0x01ab }
            monitor-exit(r9)     // Catch:{ all -> 0x01ab }
            r0 = r8
            com.google.android.apps.search.googleapp.discover.z.m r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r0     // Catch:{ all -> 0x01ae }
            kotlinx.coroutines.j.b r0 = r0.f368796h     // Catch:{ all -> 0x01ae }
            r4.f368781a = r8     // Catch:{ all -> 0x01ae }
            r4.f368782b = r2     // Catch:{ all -> 0x01ae }
            r4.f368783c = r3     // Catch:{ all -> 0x01ae }
            r4.f368784d = r6     // Catch:{ all -> 0x01ae }
            r4.f368785e = r0     // Catch:{ all -> 0x01ae }
            r4.f368788h = r7     // Catch:{ all -> 0x01ae }
            java.lang.Object r4 = r0.mo63025b(r10, r4)     // Catch:{ all -> 0x01ae }
            if (r4 == r5) goto L_0x01aa
            r4 = r0
        L_0x0153:
            r0 = r8
            com.google.android.apps.search.googleapp.discover.z.m r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r0     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = r0.f368798j     // Catch:{ all -> 0x01a5 }
            r5 = r2
            com.google.android.apps.search.googleapp.discover.z.p r5 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r5     // Catch:{ all -> 0x01a5 }
            java.lang.String r5 = r5.f368800b     // Catch:{ all -> 0x01a5 }
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r5)     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x017a
            r0 = r8
            com.google.android.apps.search.googleapp.discover.z.m r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r0     // Catch:{ all -> 0x01a5 }
            j$.util.concurrent.ConcurrentHashMap r0 = r0.f368797i     // Catch:{ all -> 0x01a5 }
            r5 = r2
            com.google.android.apps.search.googleapp.discover.z.p r5 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r5     // Catch:{ all -> 0x01a5 }
            com.google.android.apps.search.googleapp.discover.s.ak r5 = r5.f368799a     // Catch:{ all -> 0x01a5 }
            java.lang.String r5 = r5.f366409d     // Catch:{ all -> 0x01a5 }
            java.lang.String r7 = "token.streamToken.contentId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)     // Catch:{ all -> 0x01a5 }
            com.google.android.apps.search.googleapp.discover.z.j r7 = com.google.android.apps.search.googleapp.discover.p10249z.C135353j.COMPLETED     // Catch:{ all -> 0x01a5 }
            r0.put(r5, r7)     // Catch:{ all -> 0x01a5 }
            goto L_0x019c
        L_0x017a:
            com.google.common.f.e r0 = f368789a     // Catch:{ all -> 0x01a5 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01a5 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01a5 }
            java.lang.String r5 = "Session ID changed between request and response; old %s new %s"
            r7 = r2
            com.google.android.apps.search.googleapp.discover.z.p r7 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r7     // Catch:{ all -> 0x01a5 }
            java.lang.String r7 = r7.f368800b     // Catch:{ all -> 0x01a5 }
            r9 = r8
            com.google.android.apps.search.googleapp.discover.z.m r9 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r9     // Catch:{ all -> 0x01a5 }
            java.lang.String r9 = r9.f368798j     // Catch:{ all -> 0x01a5 }
            com.google.common.f.n r11 = new com.google.common.f.n     // Catch:{ all -> 0x01a5 }
            r12 = 40444(0x9dfc, float:5.6674E-41)
            r11.<init>(r12)     // Catch:{ all -> 0x01a5 }
            r0.mo56379ah(r11)     // Catch:{ all -> 0x01a5 }
            r0.mo56354G(r5, r7, r9)     // Catch:{ all -> 0x01a5 }
        L_0x019c:
            r4.mo63026c(r10)     // Catch:{ all -> 0x01ae }
            com.google.android.apps.search.googleapp.discover.z.h r0 = com.google.android.apps.search.googleapp.discover.p10249z.C135351h.f368770a     // Catch:{ all -> 0x01ae }
            p5462h.p5472e.C69598b.m101013a(r6, r10)
            return r0
        L_0x01a5:
            r0 = move-exception
            r4.mo63026c(r10)     // Catch:{ all -> 0x01ae }
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x01aa:
            return r5
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01ab }
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            r4 = r8
            goto L_0x01be
        L_0x01b1:
            return r5
        L_0x01b2:
            r0 = move-exception
            r4 = r9
            goto L_0x01be
        L_0x01b5:
            return r5
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x01b9:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01b9 }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            r4 = r1
        L_0x01be:
            r5 = r4
            com.google.android.apps.search.googleapp.discover.z.m r5 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r5     // Catch:{ all -> 0x01fb }
            com.google.android.apps.search.googleapp.discover.d.ad r5 = r5.f368790b     // Catch:{ all -> 0x01fb }
            java.lang.Object r7 = r5.f365549b     // Catch:{ all -> 0x01fb }
            monitor-enter(r7)     // Catch:{ all -> 0x01fb }
            java.util.Map r8 = r5.f365550c     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.search.googleapp.discover.d.z r9 = new com.google.android.apps.search.googleapp.discover.d.z     // Catch:{ all -> 0x01f8 }
            r9.<init>(r5)     // Catch:{ all -> 0x01f8 }
            p3186j$.util.Map.EL.computeIfPresent(r8, r3, r9)     // Catch:{ all -> 0x01f8 }
            monitor-exit(r7)     // Catch:{ all -> 0x01f8 }
            r3 = r4
            com.google.android.apps.search.googleapp.discover.z.m r3 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r3     // Catch:{ all -> 0x01fb }
            j$.util.concurrent.ConcurrentHashMap r3 = r3.f368797i     // Catch:{ all -> 0x01fb }
            com.google.android.apps.search.googleapp.discover.z.p r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135359p) r2     // Catch:{ all -> 0x01fb }
            com.google.android.apps.search.googleapp.discover.s.ak r2 = r2.f368799a     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = r2.f366409d     // Catch:{ all -> 0x01fb }
            r3.remove(r2)     // Catch:{ all -> 0x01fb }
            com.google.android.apps.search.googleapp.discover.z.m r4 = (com.google.android.apps.search.googleapp.discover.p10249z.C135356m) r4     // Catch:{ all -> 0x01fb }
            com.google.apps.tiktok.dataservice.cv r2 = r4.f368795g     // Catch:{ all -> 0x01fb }
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x01fb }
            com.google.apps.tiktok.dataservice.ai r4 = com.google.android.apps.search.googleapp.discover.p10248y.C135255f.f368471a     // Catch:{ all -> 0x01fb }
            r2.mo50787a(r3, r4)     // Catch:{ all -> 0x01fb }
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x01fb }
            if (r2 != 0) goto L_0x01f7
            com.google.android.apps.search.googleapp.discover.z.g r2 = new com.google.android.apps.search.googleapp.discover.z.g     // Catch:{ all -> 0x01fb }
            r2.<init>(r0)     // Catch:{ all -> 0x01fb }
            p5462h.p5472e.C69598b.m101013a(r6, r10)
            return r2
        L_0x01f7:
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01f8:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01f8 }
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r6, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135356m.mo112288b(com.google.android.apps.search.googleapp.discover.z.p, java.util.UUID, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final boolean mo112289c(C135359p pVar) {
        return this.f368797i.get(pVar.f368799a.f366409d) == C135353j.REQUESTING;
    }
}
