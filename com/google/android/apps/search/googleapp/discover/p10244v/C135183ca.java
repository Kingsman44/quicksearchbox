package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c;
import com.google.common.p4580v.C60950i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.ca */
/* compiled from: PG */
public final class C135183ca {

    /* renamed from: b */
    private static final Duration f368225b;

    /* renamed from: a */
    public final C60950i f368226a;

    /* renamed from: c */
    private final C135158bc f368227c;

    /* renamed from: d */
    private final boolean f368228d;

    /* renamed from: e */
    private final C71788b f368229e = new C71799m();

    /* renamed from: f */
    private final C135157bb f368230f;

    /* renamed from: g */
    private C135161bf f368231g;

    /* renamed from: h */
    private C135161bf f368232h;

    static {
        Duration ofSeconds = Duration.ofSeconds(30);
        C69664n.m101060f(ofSeconds, "ofSeconds(30)");
        f368225b = ofSeconds;
    }

    public C135183ca(C60950i iVar, C135158bc bcVar, boolean z) {
        C69664n.m101061g(iVar, "timeSource");
        this.f368226a = iVar;
        this.f368227c = bcVar;
        this.f368228d = z;
        this.f368230f = bcVar.mo112136a(C134752c.f366921a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096 A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x00a4=Splitter:B:47:0x00a4, B:41:0x009a=Splitter:B:41:0x009a} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112150a(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.discover.p10244v.C135178bw
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.discover.v.bw r0 = (com.google.android.apps.search.googleapp.discover.p10244v.C135178bw) r0
            int r1 = r0.f368208g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368208g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.v.bw r0 = new com.google.android.apps.search.googleapp.discover.v.bw
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f368206e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368208g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r1 = r0.f368205d
            java.lang.Object r2 = r0.f368204c
            java.lang.Object r3 = r0.f368203b
            java.lang.Object r0 = r0.f368202a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0033 }
            goto L_0x0086
        L_0x0033:
            r8 = move-exception
            goto L_0x00a4
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003e:
            java.lang.Object r2 = r0.f368204c
            java.lang.Object r4 = r0.f368203b
            java.lang.Object r6 = r0.f368202a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0049 }
            r8 = r4
            goto L_0x0066
        L_0x0049:
            r8 = move-exception
            goto L_0x00af
        L_0x004c:
            p5462h.C69714l.m101134b(r8)
            java.lang.String r8 = "readLastInteraction"
            com.google.apps.tiktok.tracing.bi r8 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r8)
            kotlinx.coroutines.j.b r2 = r7.f368229e     // Catch:{ all -> 0x00ac }
            r0.f368202a = r7     // Catch:{ all -> 0x00ac }
            r0.f368203b = r8     // Catch:{ all -> 0x00ac }
            r0.f368204c = r2     // Catch:{ all -> 0x00ac }
            r0.f368208g = r4     // Catch:{ all -> 0x00ac }
            java.lang.Object r4 = r2.mo63025b(r5, r0)     // Catch:{ all -> 0x00ac }
            if (r4 == r1) goto L_0x00ab
            r6 = r7
        L_0x0066:
            r4 = r6
            com.google.android.apps.search.googleapp.discover.v.ca r4 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r4     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.search.googleapp.discover.v.bf r4 = r4.f368231g     // Catch:{ all -> 0x00a1 }
            if (r4 != 0) goto L_0x008f
            r4 = r6
            com.google.android.apps.search.googleapp.discover.v.ca r4 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r4     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.search.googleapp.discover.v.bb r4 = r4.f368230f     // Catch:{ all -> 0x00a1 }
            r0.f368202a = r6     // Catch:{ all -> 0x00a1 }
            r0.f368203b = r8     // Catch:{ all -> 0x00a1 }
            r0.f368204c = r2     // Catch:{ all -> 0x00a1 }
            r0.f368205d = r6     // Catch:{ all -> 0x00a1 }
            r0.f368208g = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r4.mo112134c(r0)     // Catch:{ all -> 0x00a1 }
            if (r0 == r1) goto L_0x008e
            r3 = r8
            r8 = r0
            r0 = r6
            r1 = r0
        L_0x0086:
            com.google.android.apps.search.googleapp.discover.v.bf r8 = (com.google.android.apps.search.googleapp.discover.p10244v.C135161bf) r8     // Catch:{ all -> 0x0033 }
            com.google.android.apps.search.googleapp.discover.v.ca r1 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r1     // Catch:{ all -> 0x0033 }
            r1.f368231g = r8     // Catch:{ all -> 0x0033 }
            r6 = r0
            goto L_0x0090
        L_0x008e:
            return r1
        L_0x008f:
            r3 = r8
        L_0x0090:
            com.google.android.apps.search.googleapp.discover.v.ca r6 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r6     // Catch:{ all -> 0x0033 }
            com.google.android.apps.search.googleapp.discover.v.bf r8 = r6.f368231g     // Catch:{ all -> 0x0033 }
            if (r8 == 0) goto L_0x0099
            com.google.android.apps.search.googleapp.discover.s.bo r8 = r8.f368147a     // Catch:{ all -> 0x0033 }
            goto L_0x009a
        L_0x0099:
            r8 = r5
        L_0x009a:
            r2.mo63026c(r5)     // Catch:{ all -> 0x00a8 }
            p5462h.p5472e.C69598b.m101013a(r3, r5)
            return r8
        L_0x00a1:
            r0 = move-exception
            r3 = r8
            r8 = r0
        L_0x00a4:
            r2.mo63026c(r5)     // Catch:{ all -> 0x00a8 }
            throw r8     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r8 = move-exception
            r4 = r3
            goto L_0x00af
        L_0x00ab:
            return r1
        L_0x00ac:
            r0 = move-exception
            r4 = r8
            r8 = r0
        L_0x00af:
            throw r8     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135183ca.mo112150a(h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.apps.search.googleapp.discover.v.ca} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112151b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10244v.C135180by
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.discover.v.by r0 = (com.google.android.apps.search.googleapp.discover.p10244v.C135180by) r0
            int r1 = r0.f368214e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368214e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.v.by r0 = new com.google.android.apps.search.googleapp.discover.v.by
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f368212c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368214e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r1 = r0.f368211b
            java.lang.Object r0 = r0.f368210a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            p5462h.C69714l.m101134b(r6)
            kotlinx.coroutines.j.b r6 = r5.f368229e
            r0.f368210a = r5
            r0.f368211b = r6
            r0.f368214e = r3
            java.lang.Object r0 = r6.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x005b
            r0 = r5
            r1 = r6
        L_0x0047:
            r6 = r0
            com.google.android.apps.search.googleapp.discover.v.ca r6 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r6     // Catch:{ all -> 0x0056 }
            r6.f368232h = r4     // Catch:{ all -> 0x0056 }
            com.google.android.apps.search.googleapp.discover.v.ca r0 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r0     // Catch:{ all -> 0x0056 }
            r0.f368231g = r4     // Catch:{ all -> 0x0056 }
            r1.mo63026c(r4)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0056:
            r6 = move-exception
            r1.mo63026c(r4)
            throw r6
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135183ca.mo112151b(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: h.f.a.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: h.f.a.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: h.f.a.l} */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ all -> 0x014d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1 A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3 A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5 A[Catch:{ all -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100 A[Catch:{ all -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0102 A[Catch:{ all -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010d A[Catch:{ all -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010f A[Catch:{ all -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0142 A[SYNTHETIC, Splitter:B:80:0x0142] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112152c(java.lang.String r19, p5462h.p5473f.p5474a.C69626l r20, p5462h.p5466c.C69577g r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            boolean r2 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10244v.C135181bz
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.googleapp.discover.v.bz r2 = (com.google.android.apps.search.googleapp.discover.p10244v.C135181bz) r2
            int r3 = r2.f368221g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f368221g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.googleapp.discover.v.bz r2 = new com.google.android.apps.search.googleapp.discover.v.bz
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f368219e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f368221g
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0068
            if (r4 == r8) goto L_0x0055
            if (r4 == r6) goto L_0x0042
            if (r4 != r5) goto L_0x003a
            java.lang.Object r2 = r2.f368215a
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0038 }
            r3 = r7
            goto L_0x013b
        L_0x0038:
            r0 = move-exception
            goto L_0x0052
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r4 = r2.f368218d
            java.lang.Object r6 = r2.f368217c
            java.lang.Object r9 = r2.f368216b
            java.lang.Object r10 = r2.f368215a
            com.google.android.apps.search.googleapp.discover.v.ca r10 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r10
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x009d
        L_0x0050:
            r0 = move-exception
            r2 = r4
        L_0x0052:
            r3 = r7
            goto L_0x0150
        L_0x0055:
            java.lang.Object r4 = r2.f368218d
            java.lang.Object r9 = r2.f368217c
            java.lang.Object r10 = r2.f368216b
            java.lang.Object r11 = r2.f368215a
            com.google.android.apps.search.googleapp.discover.v.ca r11 = (com.google.android.apps.search.googleapp.discover.p10244v.C135183ca) r11
            p5462h.C69714l.m101134b(r0)
            r17 = r10
            r10 = r4
            r4 = r17
            goto L_0x0083
        L_0x0068:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = r1.f368229e
            r2.f368215a = r1
            r4 = r19
            r2.f368216b = r4
            r9 = r20
            r2.f368217c = r9
            r2.f368218d = r0
            r2.f368221g = r8
            java.lang.Object r10 = r0.mo63025b(r7, r2)
            if (r10 == r3) goto L_0x0154
            r10 = r0
            r11 = r1
        L_0x0083:
            com.google.android.apps.search.googleapp.discover.v.bf r0 = r11.f368231g     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x00aa
            com.google.android.apps.search.googleapp.discover.v.bb r0 = r11.f368230f     // Catch:{ all -> 0x014d }
            r2.f368215a = r11     // Catch:{ all -> 0x014d }
            r2.f368216b = r4     // Catch:{ all -> 0x014d }
            r2.f368217c = r9     // Catch:{ all -> 0x014d }
            r2.f368218d = r10     // Catch:{ all -> 0x014d }
            r2.f368221g = r6     // Catch:{ all -> 0x014d }
            java.lang.Object r0 = r0.mo112134c(r2)     // Catch:{ all -> 0x014d }
            if (r0 == r3) goto L_0x00a9
            r6 = r9
            r9 = r4
            r4 = r10
            r10 = r11
        L_0x009d:
            com.google.android.apps.search.googleapp.discover.v.bf r0 = (com.google.android.apps.search.googleapp.discover.p10244v.C135161bf) r0     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x00a3
            r11 = r10
            goto L_0x00ad
        L_0x00a3:
            com.google.android.apps.search.googleapp.discover.v.ai r0 = new com.google.android.apps.search.googleapp.discover.v.ai     // Catch:{ all -> 0x0050 }
            r0.<init>()     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x00a9:
            return r3
        L_0x00aa:
            r6 = r9
            r9 = r4
            r4 = r10
        L_0x00ad:
            java.lang.String r10 = r0.f368148b     // Catch:{ all -> 0x014a }
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r9)     // Catch:{ all -> 0x014a }
            if (r10 == 0) goto L_0x0142
            com.google.android.apps.search.googleapp.discover.s.bo r0 = r0.f368147a     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = r6.mo5761a(r0)     // Catch:{ all -> 0x014a }
            com.google.android.apps.search.googleapp.discover.s.bo r0 = (com.google.android.apps.search.googleapp.discover.p10214s.C134577bo) r0     // Catch:{ all -> 0x014a }
            com.google.android.apps.search.googleapp.discover.v.bf r6 = new com.google.android.apps.search.googleapp.discover.v.bf     // Catch:{ all -> 0x014a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x014a }
            r6.<init>(r0, r9)     // Catch:{ all -> 0x014a }
            r11.f368231g = r6     // Catch:{ all -> 0x014a }
            com.google.android.apps.search.googleapp.discover.v.bf r9 = r11.f368232h     // Catch:{ all -> 0x014a }
            if (r9 == 0) goto L_0x0117
            com.google.android.apps.search.googleapp.discover.s.bo r9 = r9.f368147a     // Catch:{ all -> 0x014a }
            if (r9 != 0) goto L_0x00cf
            goto L_0x0117
        L_0x00cf:
            j$.time.Instant r10 = com.google.android.apps.search.googleapp.discover.p10214s.C134582bt.m218299a(r0)     // Catch:{ all -> 0x014a }
            j$.time.Instant r12 = com.google.android.apps.search.googleapp.discover.p10214s.C134582bt.m218299a(r9)     // Catch:{ all -> 0x014a }
            j$.time.Duration r13 = p3186j$.time.Duration.between(r12, r10)     // Catch:{ all -> 0x014a }
            boolean r13 = r13.isNegative()     // Catch:{ all -> 0x014a }
            if (r13 == 0) goto L_0x00e3
        L_0x00e1:
            r10 = 1
            goto L_0x00f1
        L_0x00e3:
            j$.time.Duration r10 = p3186j$.time.Duration.between(r12, r10)     // Catch:{ all -> 0x014a }
            j$.time.Duration r12 = f368225b     // Catch:{ all -> 0x014a }
            int r10 = r10.compareTo((p3186j$.time.Duration) r12)     // Catch:{ all -> 0x014a }
            if (r10 <= 0) goto L_0x00f0
            goto L_0x00e1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            boolean r12 = r11.f368228d     // Catch:{ all -> 0x014a }
            if (r12 == 0) goto L_0x0102
            long r14 = r0.f366515c     // Catch:{ all -> 0x014a }
            long r7 = r9.f366515c     // Catch:{ all -> 0x014a }
            long r14 = r14 - r7
            r7 = 2
            int r16 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r16 < 0) goto L_0x0102
            r7 = 1
            goto L_0x0103
        L_0x0102:
            r7 = 0
        L_0x0103:
            if (r12 == 0) goto L_0x010f
            long r14 = r0.f366516d     // Catch:{ all -> 0x014a }
            long r8 = r9.f366516d     // Catch:{ all -> 0x014a }
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x010f
            r8 = 1
            goto L_0x0110
        L_0x010f:
            r8 = 0
        L_0x0110:
            if (r10 != 0) goto L_0x0117
            if (r7 != 0) goto L_0x0117
            if (r8 != 0) goto L_0x0117
            goto L_0x0139
        L_0x0117:
            r11.f368232h = r6     // Catch:{ all -> 0x014a }
            com.google.android.apps.search.googleapp.discover.v.bb r0 = r11.f368230f     // Catch:{ all -> 0x014a }
            r2.f368215a = r4     // Catch:{ all -> 0x014a }
            r7 = 0
            r2.f368216b = r7     // Catch:{ all -> 0x014a }
            r2.f368217c = r7     // Catch:{ all -> 0x014a }
            r2.f368218d = r7     // Catch:{ all -> 0x014a }
            r2.f368221g = r5     // Catch:{ all -> 0x014a }
            com.google.android.apps.search.googleapp.discover.v.ab r5 = r0.f368136b     // Catch:{ all -> 0x014a }
            com.google.android.apps.search.googleapp.discover.v.ay r7 = new com.google.android.apps.search.googleapp.discover.v.ay     // Catch:{ all -> 0x014a }
            r7.<init>(r6, r0)     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = r5.mo112130b(r7, r2)     // Catch:{ all -> 0x014a }
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x014a }
            if (r0 == r2) goto L_0x0137
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x014a }
        L_0x0137:
            if (r0 == r3) goto L_0x0141
        L_0x0139:
            r2 = r4
            r3 = 0
        L_0x013b:
            r2.mo63026c(r3)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0141:
            return r3
        L_0x0142:
            com.google.android.apps.search.googleapp.discover.v.bs r0 = new com.google.android.apps.search.googleapp.discover.v.bs     // Catch:{ all -> 0x014a }
            java.lang.String r2 = "The given session ID does not match the persisted one."
            r0.<init>(r2)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            r2 = r4
            goto L_0x014f
        L_0x014d:
            r0 = move-exception
            r2 = r10
        L_0x014f:
            r3 = 0
        L_0x0150:
            r2.mo63026c(r3)
            throw r0
        L_0x0154:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135183ca.mo112152c(java.lang.String, h.f.a.l, h.c.g):java.lang.Object");
    }
}
