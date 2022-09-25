package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40451k;
import java.io.File;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.m */
/* compiled from: PG */
final class C40289m {

    /* renamed from: a */
    final /* synthetic */ C40301y f105833a;

    /* renamed from: b */
    private final File f105834b;

    /* renamed from: c */
    private final String f105835c;

    /* renamed from: d */
    private final C40451k f105836d;

    /* renamed from: e */
    private final C40358k f105837e;

    public C40289m(C40301y yVar, File file, String str, C40451k kVar, C40358k kVar2) {
        C69664n.m101061g(file, "cacheFile");
        C69664n.m101061g(str, "url");
        C69664n.m101061g(kVar2, "counters");
        this.f105833a = yVar;
        this.f105834b = file;
        this.f105835c = str;
        this.f105836d = kVar;
        this.f105837e = kVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        throw r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42373a(p5462h.p5466c.C69577g r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40285i
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.rendering.xuikit.c.i r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40285i) r0
            int r1 = r0.f105817d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105817d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.i r0 = new com.google.android.libraries.search.rendering.xuikit.c.i
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f105815b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f105817d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            java.lang.Object r0 = r0.f105814a
            p5462h.C69714l.m101134b(r12)
            goto L_0x0051
        L_0x002a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0032:
            p5462h.C69714l.m101134b(r12)
            com.google.android.libraries.search.rendering.xuikit.d.j.k r12 = r11.f105836d
            java.lang.String r2 = r11.f105835c
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.google.common.util.concurrent.cx r12 = r12.mo42451c(r2, r3, r3, r4)
            java.lang.String r2 = "urlFetcher.get(url)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            r0.f105814a = r11
            r0.f105817d = r4
            java.lang.Object r12 = kotlinx.coroutines.p5578d.C71663i.m104690c(r12, r0)
            if (r12 == r1) goto L_0x0141
            r0 = r11
        L_0x0051:
            com.google.android.libraries.search.rendering.xuikit.d.j.j r12 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40450j) r12
            boolean r1 = r12.mo42448f()
            r2 = 0
            if (r1 == 0) goto L_0x010f
            com.google.protobuf.z r12 = r12.mo42443b()
            java.lang.String r1 = "response.rawData()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)
            r1 = r0
            com.google.android.libraries.search.rendering.xuikit.c.m r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m) r1
            com.google.android.libraries.search.rendering.xuikit.c.y r4 = r1.f105833a
            java.io.File r5 = new java.io.File
            java.io.File r6 = r4.mo42384a()
            com.google.android.libraries.f.a r4 = r4.f105878d
            long r7 = r4.mo26870b()
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "tmp-"
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = "-"
            r9.append(r7)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r6, r4)
            r4 = r0
            com.google.android.libraries.search.rendering.xuikit.c.m r4 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m) r4     // Catch:{ IOException -> 0x00cd }
            com.google.android.libraries.search.rendering.xuikit.c.y r4 = r4.f105833a     // Catch:{ IOException -> 0x00cd }
            java.io.File r4 = r4.mo42384a()     // Catch:{ IOException -> 0x00cd }
            r4.mkdirs()     // Catch:{ IOException -> 0x00cd }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00cd }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00cd }
            r12.mo59046r(r4)     // Catch:{ all -> 0x00c4 }
            r4.flush()     // Catch:{ all -> 0x00c4 }
            java.io.FileDescriptor r12 = r4.getFD()     // Catch:{ all -> 0x00c4 }
            r12.sync()     // Catch:{ all -> 0x00c4 }
            p5462h.p5472e.C69598b.m101013a(r4, r3)     // Catch:{ IOException -> 0x00cd }
            r12 = r0
            com.google.android.libraries.search.rendering.xuikit.c.m r12 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m) r12     // Catch:{ IOException -> 0x00cd }
            java.io.File r12 = r12.f105834b     // Catch:{ IOException -> 0x00cd }
            boolean r2 = r5.renameTo(r12)     // Catch:{ IOException -> 0x00cd }
        L_0x00bb:
            r5.delete()
            com.google.android.libraries.search.rendering.xuikit.c.y r12 = r1.f105833a
            r12.mo42389f()
            goto L_0x013c
        L_0x00c4:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r3 = move-exception
            p5462h.p5472e.C69598b.m101013a(r4, r12)     // Catch:{ IOException -> 0x00cd }
            throw r3     // Catch:{ IOException -> 0x00cd }
        L_0x00cb:
            r12 = move-exception
            goto L_0x0106
        L_0x00cd:
            r12 = move-exception
            com.google.common.f.e r3 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40301y.f105875a     // Catch:{ all -> 0x00cb }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x00cb }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00cb }
            com.google.common.f.aa r4 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q.f106014a     // Catch:{ all -> 0x00cb }
            r6 = r0
            com.google.android.libraries.search.rendering.xuikit.c.m r6 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m) r6     // Catch:{ all -> 0x00cb }
            com.google.android.libraries.search.rendering.xuikit.c.y r6 = r6.f105833a     // Catch:{ all -> 0x00cb }
            com.google.android.libraries.search.rendering.xuikit.d.f.q r6 = r6.f105880f     // Catch:{ all -> 0x00cb }
            com.google.protos.aw.c.a.b.a.b r6 = r6.mo42422a()     // Catch:{ all -> 0x00cb }
            r3.mo56378ag(r4, r6)     // Catch:{ all -> 0x00cb }
            com.google.common.f.x r12 = r3.mo56382g(r12)     // Catch:{ all -> 0x00cb }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = "Could not write to cache file '%s'"
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x00cb }
            r6 = 53316(0xd044, float:7.4712E-41)
            r4.<init>(r6)     // Catch:{ all -> 0x00cb }
            r12.mo56379ah(r4)     // Catch:{ all -> 0x00cb }
            r12.mo56389s(r3, r0)     // Catch:{ all -> 0x00cb }
            com.google.android.libraries.search.rendering.xuikit.c.m r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m) r0     // Catch:{ all -> 0x00cb }
            com.google.android.libraries.search.rendering.xuikit.d.f.k r12 = r0.f105837e     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "PreregisteredResources.DiskCache.Write.FailureCount"
            r12.mo42416c(r0)     // Catch:{ all -> 0x00cb }
            goto L_0x00bb
        L_0x0106:
            r5.delete()
            com.google.android.libraries.search.rendering.xuikit.c.y r0 = r1.f105833a
            r0.mo42389f()
            throw r12
        L_0x010f:
            com.google.common.f.e r1 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40301y.f105875a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r3 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q.f106014a
            com.google.android.libraries.search.rendering.xuikit.c.m r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m) r0
            com.google.android.libraries.search.rendering.xuikit.c.y r4 = r0.f105833a
            com.google.android.libraries.search.rendering.xuikit.d.f.q r4 = r4.f105880f
            com.google.protos.aw.c.a.b.a.b r4 = r4.mo42422a()
            r1.mo56378ag(r3, r4)
            java.lang.String r0 = r0.f105835c
            int r12 = r12.mo42442a()
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 53313(0xd041, float:7.4707E-41)
            r3.<init>(r4)
            r1.mo56379ah(r3)
            java.lang.String r3 = "Fetch of '%s' failed with status %d"
            r1.mo56352E(r3, r0, r12)
        L_0x013c:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L_0x0141:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m.mo42373a(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x00b5=Splitter:B:50:0x00b5, B:39:0x0087=Splitter:B:39:0x0087} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42374b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40286j
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.rendering.xuikit.c.j r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40286j) r0
            int r1 = r0.f105822e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105822e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.j r0 = new com.google.android.libraries.search.rendering.xuikit.c.j
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f105820c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f105822e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r1 = r0.f105819b
            java.lang.Object r0 = r0.f105818a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0032 }
            goto L_0x00b5
        L_0x0032:
            r8 = move-exception
            goto L_0x00c5
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003d:
            java.lang.Object r2 = r0.f105819b
            java.lang.Object r4 = r0.f105818a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0046 }
            r8 = r2
            goto L_0x00a3
        L_0x0046:
            r8 = move-exception
            r1 = r2
        L_0x0048:
            r0 = r4
            goto L_0x00c5
        L_0x004b:
            java.lang.Object r1 = r0.f105819b
            java.lang.Object r0 = r0.f105818a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0032 }
            goto L_0x0087
        L_0x0053:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.rendering.xuikit.c.y r8 = r7.f105833a
            j$.util.concurrent.ConcurrentHashMap r8 = r8.f105881g
            java.io.File r2 = r7.f105834b
            java.lang.Object r6 = r8.get(r2)
            if (r6 != 0) goto L_0x006f
            kotlinx.coroutines.j.m r6 = new kotlinx.coroutines.j.m
            r6.<init>()
            java.lang.Object r8 = r8.putIfAbsent(r2, r6)
            if (r8 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r6 = r8
        L_0x006f:
            r8 = r6
            kotlinx.coroutines.j.b r8 = (kotlinx.coroutines.p5584j.C71788b) r8
            boolean r2 = r8.mo63027d(r7)     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x008b
            r0.f105818a = r7     // Catch:{ all -> 0x00c1 }
            r0.f105819b = r8     // Catch:{ all -> 0x00c1 }
            r0.f105822e = r5     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = r7.mo42375c(r0)     // Catch:{ all -> 0x00c1 }
            if (r0 == r1) goto L_0x008a
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0087:
            com.google.android.libraries.search.rendering.xuikit.c.o r8 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40291o) r8     // Catch:{ all -> 0x0032 }
            goto L_0x00b7
        L_0x008a:
            return r1
        L_0x008b:
            com.google.android.libraries.search.rendering.xuikit.d.f.k r2 = r7.f105837e     // Catch:{ all -> 0x00c1 }
            java.lang.String r5 = "PreregisteredResources.PrefetchRequest.Count"
            com.google.android.libraries.search.rendering.xuikit.c.ag r6 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag.REUSED     // Catch:{ all -> 0x00c1 }
            int r6 = r6.f105768f     // Catch:{ all -> 0x00c1 }
            r2.mo42417d(r5, r6)     // Catch:{ all -> 0x00c1 }
            r0.f105818a = r7     // Catch:{ all -> 0x00c1 }
            r0.f105819b = r8     // Catch:{ all -> 0x00c1 }
            r0.f105822e = r4     // Catch:{ all -> 0x00c1 }
            java.lang.Object r2 = r8.mo63025b(r7, r0)     // Catch:{ all -> 0x00c1 }
            if (r2 == r1) goto L_0x00c0
            r4 = r7
        L_0x00a3:
            r0.f105818a = r4     // Catch:{ all -> 0x00bc }
            r0.f105819b = r8     // Catch:{ all -> 0x00bc }
            r0.f105822e = r3     // Catch:{ all -> 0x00bc }
            r2 = r4
            com.google.android.libraries.search.rendering.xuikit.c.m r2 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m) r2     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r2.mo42376d(r0)     // Catch:{ all -> 0x00bc }
            if (r0 == r1) goto L_0x00bb
            r1 = r8
            r8 = r0
            r0 = r4
        L_0x00b5:
            com.google.android.libraries.search.rendering.xuikit.c.o r8 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40291o) r8     // Catch:{ all -> 0x0032 }
        L_0x00b7:
            r1.mo63026c(r0)
            return r8
        L_0x00bb:
            return r1
        L_0x00bc:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto L_0x0048
        L_0x00c0:
            return r1
        L_0x00c1:
            r0 = move-exception
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x00c5:
            r1.mo63026c(r0)
            goto L_0x00ca
        L_0x00c9:
            throw r8
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m.mo42374b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42375c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40287k
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.rendering.xuikit.c.k r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40287k) r0
            int r1 = r0.f105827e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105827e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.k r0 = new com.google.android.libraries.search.rendering.xuikit.c.k
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f105825c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f105827e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r1 = r0.f105824b
            java.lang.Object r0 = r0.f105823a
            p5462h.C69714l.m101134b(r6)
            goto L_0x006f
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            java.io.File r6 = r5.f105834b
            boolean r6 = r6.exists()
            java.lang.String r2 = "PreregisteredResources.PrefetchRequest.Count"
            if (r6 == 0) goto L_0x0053
            com.google.android.libraries.search.rendering.xuikit.d.f.k r6 = r5.f105837e
            com.google.android.libraries.search.rendering.xuikit.c.ag r0 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag.DISK
            int r0 = r0.f105768f
            r6.mo42417d(r2, r0)
            com.google.android.libraries.search.rendering.xuikit.c.o r6 = new com.google.android.libraries.search.rendering.xuikit.c.o
            com.google.android.libraries.search.rendering.xuikit.c.ag r0 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag.DISK
            java.io.File r1 = r5.f105834b
            r6.<init>(r0, r1)
            goto L_0x0081
        L_0x0053:
            com.google.android.libraries.search.rendering.xuikit.d.f.k r6 = r5.f105837e
            com.google.android.libraries.search.rendering.xuikit.c.ag r4 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag.NETWORK
            int r4 = r4.f105768f
            r6.mo42417d(r2, r4)
            com.google.android.libraries.search.rendering.xuikit.c.ag r6 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag.NETWORK
            java.io.File r2 = r5.f105834b
            r0.f105823a = r2
            r0.f105824b = r6
            r0.f105827e = r3
            java.lang.Object r0 = r5.mo42373a(r0)
            if (r0 == r1) goto L_0x0082
            r1 = r6
            r6 = r0
            r0 = r2
        L_0x006f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r3 == r6) goto L_0x0078
            r0 = 0
        L_0x0078:
            com.google.android.libraries.search.rendering.xuikit.c.o r6 = new com.google.android.libraries.search.rendering.xuikit.c.o
            java.io.File r0 = (java.io.File) r0
            com.google.android.libraries.search.rendering.xuikit.c.ag r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag) r1
            r6.<init>(r1, r0)
        L_0x0081:
            return r6
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m.mo42375c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42376d(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40288l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.libraries.search.rendering.xuikit.c.l r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40288l) r0
            int r1 = r0.f105832e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105832e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.l r0 = new com.google.android.libraries.search.rendering.xuikit.c.l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f105830c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f105832e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r1 = r0.f105829b
            java.lang.Object r0 = r0.f105828a
            p5462h.C69714l.m101134b(r5)
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r5)
            java.io.File r5 = r4.f105834b
            boolean r5 = r5.exists()
            if (r5 == 0) goto L_0x0048
            com.google.android.libraries.search.rendering.xuikit.c.o r5 = new com.google.android.libraries.search.rendering.xuikit.c.o
            com.google.android.libraries.search.rendering.xuikit.c.ag r0 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag.REUSED
            java.io.File r1 = r4.f105834b
            r5.<init>(r0, r1)
            goto L_0x006d
        L_0x0048:
            com.google.android.libraries.search.rendering.xuikit.c.ag r5 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag.REUSED
            java.io.File r2 = r4.f105834b
            r0.f105828a = r2
            r0.f105829b = r5
            r0.f105832e = r3
            java.lang.Object r0 = r4.mo42373a(r0)
            if (r0 == r1) goto L_0x006e
            r1 = r5
            r5 = r0
            r0 = r2
        L_0x005b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r3 == r5) goto L_0x0064
            r0 = 0
        L_0x0064:
            com.google.android.libraries.search.rendering.xuikit.c.o r5 = new com.google.android.libraries.search.rendering.xuikit.c.o
            java.io.File r0 = (java.io.File) r0
            com.google.android.libraries.search.rendering.xuikit.c.ag r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40267ag) r1
            r5.<init>(r1, r0)
        L_0x006d:
            return r5
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40289m.mo42376d(h.c.g):java.lang.Object");
    }
}
