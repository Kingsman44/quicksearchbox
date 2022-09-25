package com.google.android.libraries.web.contrib.googlesignin.internal;

import com.google.android.apps.gsa.binaries.satin.app.anj;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44040c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.googlesignin.internal.i */
/* compiled from: PG */
public final class C43596i implements C47352j {

    /* renamed from: c */
    private static final C59071e f113803c = C59071e.m91331h();

    /* renamed from: a */
    public final AccountId f113804a;

    /* renamed from: b */
    public final C46175b f113805b;

    /* renamed from: d */
    private final C43271v f113806d;

    /* renamed from: e */
    private final boolean f113807e;

    /* renamed from: f */
    private final C44040c f113808f;

    /* renamed from: g */
    private final C44058f f113809g;

    /* renamed from: h */
    private final C44074i f113810h;

    /* renamed from: i */
    private final Optional f113811i;

    /* renamed from: j */
    private final C71422aw f113812j;

    /* renamed from: k */
    private final anj f113813k;

    public C43596i(C43271v vVar, boolean z, AccountId accountId, C46175b bVar, C44040c cVar, anj anj, C44058f fVar, C44074i iVar, Optional optional, Optional optional2, Optional optional3, C71422aw awVar) {
        C69664n.m101061g(vVar, "webImplementation");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(anj, "zwiebackCookieManagerFactory");
        C69664n.m101061g(fVar, "cookieManagerFactory");
        C69664n.m101061g(optional, "enableWVCookieRefreshSyncletOptional");
        C69664n.m101061g(optional2, "enableWLCookieRefreshSyncletOptional");
        C69664n.m101061g(optional3, "syncletLogger");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f113806d = vVar;
        this.f113807e = z;
        this.f113804a = accountId;
        this.f113805b = bVar;
        this.f113808f = cVar;
        this.f113813k = anj;
        this.f113809g = fVar;
        this.f113810h = iVar;
        this.f113811i = optional3;
        this.f113812j = awVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.libraries.web.profile.Profile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.libraries.web.profile.Profile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.libraries.web.profile.Profile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077 A[Catch:{ Exception -> 0x002e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46643a(p5462h.p5466c.C69577g r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.libraries.web.contrib.googlesignin.internal.C43588a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.libraries.web.contrib.googlesignin.internal.a r0 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43588a) r0
            int r1 = r0.f113785e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113785e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.contrib.googlesignin.internal.a r0 = new com.google.android.libraries.web.contrib.googlesignin.internal.a
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f113783c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f113785e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            p5462h.C69714l.m101134b(r14)     // Catch:{ Exception -> 0x002e }
            goto L_0x0100
        L_0x002e:
            r14 = move-exception
            goto L_0x00e2
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0039:
            java.lang.Object r2 = r0.f113782b
            java.lang.Object r4 = r0.f113781a
            p5462h.C69714l.m101134b(r14)     // Catch:{ Exception -> 0x002e }
            goto L_0x007c
        L_0x0041:
            java.lang.Object r2 = r0.f113781a
            p5462h.C69714l.m101134b(r14)     // Catch:{ Exception -> 0x002e }
            goto L_0x005e
        L_0x0047:
            p5462h.C69714l.m101134b(r14)
            com.google.android.libraries.web.profile.i r14 = r13.f113810h     // Catch:{ Exception -> 0x002e }
            com.google.android.libraries.web.base.v r2 = r13.f113806d     // Catch:{ Exception -> 0x002e }
            com.google.common.util.concurrent.cx r14 = r14.mo47042b(r2)     // Catch:{ Exception -> 0x002e }
            r0.f113781a = r13     // Catch:{ Exception -> 0x002e }
            r0.f113785e = r5     // Catch:{ Exception -> 0x002e }
            java.lang.Object r14 = kotlinx.coroutines.p5578d.C71663i.m104690c(r14, r0)     // Catch:{ Exception -> 0x002e }
            if (r14 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r2 = r13
        L_0x005e:
            com.google.android.libraries.web.profile.Profile r14 = (com.google.android.libraries.web.profile.Profile) r14     // Catch:{ Exception -> 0x002e }
            r5 = r2
            com.google.android.libraries.web.contrib.googlesignin.internal.i r5 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43596i) r5     // Catch:{ Exception -> 0x002e }
            com.google.android.libraries.web.profile.a.f r5 = r5.f113809g     // Catch:{ Exception -> 0x002e }
            com.google.android.libraries.web.profile.a.c r5 = r5.mo47022b(r14)     // Catch:{ Exception -> 0x002e }
            r0.f113781a = r2     // Catch:{ Exception -> 0x002e }
            r0.f113782b = r14     // Catch:{ Exception -> 0x002e }
            r0.f113785e = r4     // Catch:{ Exception -> 0x002e }
            java.lang.String r4 = "https://www.google.com"
            java.lang.Object r4 = r5.mo47015d(r4, r0)     // Catch:{ Exception -> 0x002e }
            if (r4 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r12 = r2
            r2 = r14
            r14 = r4
            r4 = r12
        L_0x007c:
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x002e }
            java.lang.String r5 = "NID="
            boolean r5 = p5462h.p5483m.C69764m.m101234m(r14, r5)     // Catch:{ Exception -> 0x002e }
            if (r5 != 0) goto L_0x0100
            java.lang.String r5 = "; NID="
            r6 = 0
            boolean r14 = p5462h.p5483m.C69764m.m101205y(r14, r5, r6)     // Catch:{ Exception -> 0x002e }
            if (r14 != 0) goto L_0x0100
            com.google.android.libraries.web.contrib.googlesignin.internal.i r4 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43596i) r4     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.anj r14 = r4.f113813k     // Catch:{ Exception -> 0x002e }
            com.google.android.libraries.web.profile.a.d.a.c r11 = new com.google.android.libraries.web.profile.a.d.a.c     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqd r4 = r14.f199088a     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.anh r4 = r4.b     // Catch:{ Exception -> 0x002e }
            com.google.android.libraries.web.profile.b.d r6 = r4.mo66368gw()     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqd r4 = r14.f199088a     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r4.a     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.asp r4 = r4.a     // Catch:{ Exception -> 0x002e }
            com.google.android.libraries.web.base.b r7 = r4.mo68453ht()     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqd r4 = r14.f199088a     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.anh r4 = r4.b     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqe r4 = r4.f198027a     // Catch:{ Exception -> 0x002e }
            java.util.Map r8 = r4.mo67047hh()     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqd r4 = r14.f199088a     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r4.a     // Catch:{ Exception -> 0x002e }
            g.a.a r4 = r4.H     // Catch:{ Exception -> 0x002e }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ Exception -> 0x002e }
            r9 = r4
            kotlinx.coroutines.aw r9 = (kotlinx.coroutines.C71422aw) r9     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqd r14 = r14.f199088a     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.aqy r14 = r14.a     // Catch:{ Exception -> 0x002e }
            com.google.android.apps.gsa.binaries.satin.app.ars r14 = r14.b     // Catch:{ Exception -> 0x002e }
            g.a.a r14 = r14.f199934aA     // Catch:{ Exception -> 0x002e }
            java.lang.Object r14 = r14.mo17428b()     // Catch:{ Exception -> 0x002e }
            r10 = r14
            h.c.o r10 = (p5462h.p5466c.C69585o) r10     // Catch:{ Exception -> 0x002e }
            r5 = r2
            com.google.android.libraries.web.profile.Profile r5 = (com.google.android.libraries.web.profile.Profile) r5     // Catch:{ Exception -> 0x002e }
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x002e }
            r14 = 0
            r0.f113781a = r14     // Catch:{ Exception -> 0x002e }
            r0.f113782b = r14     // Catch:{ Exception -> 0x002e }
            r0.f113785e = r3     // Catch:{ Exception -> 0x002e }
            java.lang.Object r14 = r11.mo47020a(r0)     // Catch:{ Exception -> 0x002e }
            if (r14 != r1) goto L_0x0100
            return r1
        L_0x00e2:
            com.google.common.f.e r0 = f113803c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r14 = r0.mo56382g(r14)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 54087(0xd347, float:7.5792E-41)
            r0.<init>(r1)
            r14.mo56379ah(r0)
            java.lang.String r0 = "Failed to fetch Zwieback cookie"
            r14.mo56386p(r0)
        L_0x0100:
            h.q r14 = p5462h.C69788q.f186170a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.googlesignin.internal.C43596i.mo46643a(h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (this.f113807e) {
            C71803m.m105043d(this.f113812j, (C69585o) null, (C71424ay) null, new C43594g(this, (C69577g) null), 3);
        }
        C60870cx j = C60856cj.m92901j(C71663i.m104692e(this.f113812j, (C71424ay) null, new C43595h(this, (C69577g) null), 3));
        C69664n.m101060f(j, "override fun sync(): Lis…   null\n      }\n    )\n  }");
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46644c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.web.contrib.googlesignin.internal.C43589b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.web.contrib.googlesignin.internal.b r0 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43589b) r0
            int r1 = r0.f113789d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113789d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.contrib.googlesignin.internal.b r0 = new com.google.android.libraries.web.contrib.googlesignin.internal.b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f113787b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f113789d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = r0.f113786a
            p5462h.C69714l.m101134b(r6)     // Catch:{ Exception -> 0x002c }
            goto L_0x0075
        L_0x002c:
            r6 = move-exception
            goto L_0x008a
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f113786a
            p5462h.C69714l.m101134b(r6)     // Catch:{ Exception -> 0x003c }
            goto L_0x005c
        L_0x003c:
            r6 = move-exception
            r0 = r2
            goto L_0x008a
        L_0x003f:
            p5462h.C69714l.m101134b(r6)
            j$.util.Optional r6 = r5.f113811i
            com.google.android.libraries.web.contrib.googlesignin.internal.c r2 = com.google.android.libraries.web.contrib.googlesignin.internal.C43590c.f113790a
            r6.ifPresent(r2)
            com.google.android.libraries.web.profile.i r6 = r5.f113810h     // Catch:{ Exception -> 0x0088 }
            com.google.android.libraries.web.base.v r2 = r5.f113806d     // Catch:{ Exception -> 0x0088 }
            com.google.common.util.concurrent.cx r6 = r6.mo47042b(r2)     // Catch:{ Exception -> 0x0088 }
            r0.f113786a = r5     // Catch:{ Exception -> 0x0088 }
            r0.f113789d = r4     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ Exception -> 0x0088 }
            if (r6 == r1) goto L_0x0087
            r2 = r5
        L_0x005c:
            com.google.android.libraries.web.profile.Profile r6 = (com.google.android.libraries.web.profile.Profile) r6     // Catch:{ Exception -> 0x003c }
            r4 = r2
            com.google.android.libraries.web.contrib.googlesignin.internal.i r4 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43596i) r4     // Catch:{ Exception -> 0x003c }
            com.google.android.libraries.web.profile.a.b.c r4 = r4.f113808f     // Catch:{ Exception -> 0x003c }
            com.google.android.libraries.web.profile.a.b.d r6 = r4.mo47007a(r6)     // Catch:{ Exception -> 0x003c }
            r0.f113786a = r2     // Catch:{ Exception -> 0x003c }
            r0.f113789d = r3     // Catch:{ Exception -> 0x003c }
            r3 = r2
            com.google.android.libraries.web.contrib.googlesignin.internal.i r3 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43596i) r3     // Catch:{ Exception -> 0x003c }
            java.lang.Object r6 = r3.mo46645d(r6, r0)     // Catch:{ Exception -> 0x003c }
            if (r6 == r1) goto L_0x0087
            r0 = r2
        L_0x0075:
            com.google.android.libraries.web.profile.a.b.g r6 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44044g) r6     // Catch:{ Exception -> 0x002c }
            r1 = r0
            com.google.android.libraries.web.contrib.googlesignin.internal.i r1 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43596i) r1     // Catch:{ Exception -> 0x002c }
            j$.util.Optional r1 = r1.f113811i     // Catch:{ Exception -> 0x002c }
            com.google.android.libraries.web.contrib.googlesignin.internal.d r2 = new com.google.android.libraries.web.contrib.googlesignin.internal.d     // Catch:{ Exception -> 0x002c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x002c }
            r1.ifPresent(r2)     // Catch:{ Exception -> 0x002c }
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0087:
            return r1
        L_0x0088:
            r6 = move-exception
            r0 = r5
        L_0x008a:
            com.google.android.libraries.web.contrib.googlesignin.internal.i r0 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43596i) r0
            j$.util.Optional r0 = r0.f113811i
            com.google.android.libraries.web.contrib.googlesignin.internal.e r1 = com.google.android.libraries.web.contrib.googlesignin.internal.C43592e.f113792a
            r0.ifPresent(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.googlesignin.internal.C43596i.mo46644c(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.google.android.libraries.web.profile.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.google.android.libraries.web.profile.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.google.android.libraries.web.profile.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.google.android.libraries.web.profile.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: com.google.android.libraries.web.profile.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.google.android.libraries.web.profile.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.google.android.libraries.web.profile.a.b.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[SYNTHETIC, Splitter:B:18:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:32:0x006c, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46645d(com.google.android.libraries.web.profile.p3431a.p3434b.C44041d r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.web.contrib.googlesignin.internal.C43593f
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.web.contrib.googlesignin.internal.f r0 = (com.google.android.libraries.web.contrib.googlesignin.internal.C43593f) r0
            int r1 = r0.f113798f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113798f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.contrib.googlesignin.internal.f r0 = new com.google.android.libraries.web.contrib.googlesignin.internal.f
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f113796d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f113798f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r10)
            goto L_0x006f
        L_0x002a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0032:
            int r9 = r0.f113795c
            int r2 = r0.f113794b
            java.lang.Object r5 = r0.f113793a
            p5462h.C69714l.m101134b(r10)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0056
        L_0x003c:
            p5462h.C69714l.m101134b(r10)
            r10 = 0
            r10 = r9
            r9 = 0
            r2 = 2
        L_0x0043:
            if (r9 >= r2) goto L_0x0063
            r0.f113793a = r10     // Catch:{ Exception -> 0x005f }
            r0.f113794b = r2     // Catch:{ Exception -> 0x005f }
            r0.f113795c = r9     // Catch:{ Exception -> 0x005f }
            r0.f113798f = r4     // Catch:{ Exception -> 0x005f }
            java.lang.Object r5 = r10.mo46991c(r0)     // Catch:{ Exception -> 0x005f }
            if (r5 == r1) goto L_0x005e
            r7 = r5
            r5 = r10
            r10 = r7
        L_0x0056:
            com.google.android.libraries.web.profile.a.b.g r10 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44044g) r10     // Catch:{ Exception -> 0x0060 }
            com.google.android.libraries.web.profile.a.b.g r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_RETRY     // Catch:{ Exception -> 0x0060 }
            if (r10 != r6) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            return r10
        L_0x005e:
            return r1
        L_0x005f:
            r5 = r10
        L_0x0060:
            r10 = r5
            int r9 = r9 + r4
            goto L_0x0043
        L_0x0063:
            r9 = 0
            r0.f113793a = r9
            r0.f113798f = r3
            java.lang.Object r10 = r10.mo46991c(r0)
            if (r10 != r1) goto L_0x006f
            return r1
        L_0x006f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.googlesignin.internal.C43596i.mo46645d(com.google.android.libraries.web.profile.a.b.d, h.c.g):java.lang.Object");
    }
}
