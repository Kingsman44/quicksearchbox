package com.google.android.libraries.web.webview.p3471a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.base.p3348b.p3351c.C43246b;
import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43979a;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43980b;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43981c;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43984e;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.a.z */
/* compiled from: PG */
public final class C44342z implements C43984e {

    /* renamed from: d */
    private static final C59071e f115311d = C59071e.m91331h();

    /* renamed from: a */
    public final C44325i f115312a;

    /* renamed from: b */
    public final C71788b f115313b;

    /* renamed from: c */
    public final C43246b f115314c;

    /* renamed from: e */
    private final AccountId f115315e;

    /* renamed from: f */
    private final C44074i f115316f;

    /* renamed from: g */
    private final C44070e f115317g;

    /* renamed from: h */
    private final C43979a f115318h;

    /* renamed from: i */
    private final C43981c f115319i;

    /* renamed from: j */
    private final C42876ab f115320j;

    /* renamed from: k */
    private final C69585o f115321k;

    public C44342z(AccountId accountId, Executor executor, C44074i iVar, C44070e eVar, C43979a aVar, C43981c cVar, C44325i iVar2, C42876ab abVar, C71788b bVar, C43246b bVar2, C69585o oVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(eVar, "profileManagerFactory");
        C69664n.m101061g(aVar, "webAccountStateRegistries");
        C69664n.m101061g(cVar, "webAccountStateRegistry");
        C69664n.m101061g(iVar2, "webViewDataOwnerChangeListenerRegistry");
        C69664n.m101061g(abVar, "accountInfoProtoDataStore");
        C69664n.m101061g(bVar, "mutex");
        C69664n.m101061g(bVar2, "accountScopedRequestRequirements");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f115315e = accountId;
        this.f115316f = iVar;
        this.f115317g = eVar;
        this.f115318h = aVar;
        this.f115319i = cVar;
        this.f115312a = iVar2;
        this.f115320j = abVar;
        this.f115313b = bVar;
        this.f115314c = bVar2;
        this.f115321k = oVar;
    }

    /* renamed from: f */
    private final Object m78289f(int i, C69577g gVar) {
        C60870cx a = this.f115320j.mo46039a(new C44341y(i, this), C60826bg.f164896a);
        C69664n.m101060f(a, "private suspend fun upda…     )\n      .await()\n  }");
        Object c = C71663i.m104690c(a, gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* renamed from: a */
    public final Object mo46982a(C69577g gVar) {
        if (this.f115319i.mo46978a() == C43980b.OWNER) {
            return C69788q.f186170a;
        }
        Object a = C71803m.m105040a(this.f115321k, new C44335s(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46983b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.web.webview.p3471a.C44339w
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.web.webview.a.w r0 = (com.google.android.libraries.web.webview.p3471a.C44339w) r0
            int r1 = r0.f115303e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115303e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.webview.a.w r0 = new com.google.android.libraries.web.webview.a.w
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f115301c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f115303e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f115299a
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0066
        L_0x002f:
            r8 = move-exception
            goto L_0x0079
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f115300b
            java.lang.Object r4 = r0.f115299a
            com.google.android.libraries.web.webview.a.z r4 = (com.google.android.libraries.web.webview.p3471a.C44342z) r4
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0057
        L_0x0044:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r7.f115313b
            r0.f115299a = r7
            r0.f115300b = r8
            r0.f115303e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r4 = r7
        L_0x0057:
            r0.f115299a = r8     // Catch:{ all -> 0x0075 }
            r0.f115300b = r5     // Catch:{ all -> 0x0075 }
            r0.f115303e = r3     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r4.mo47228e(r0)     // Catch:{ all -> 0x0075 }
            if (r0 == r1) goto L_0x0074
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0066:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x002f }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x002f }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x002f }
            r0.mo63026c(r5)
            return r8
        L_0x0074:
            return r1
        L_0x0075:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0079:
            r0.mo63026c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3471a.C44342z.mo46983b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r8 != r1) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (((com.google.android.libraries.web.webview.p3471a.C44342z) r2).m78289f(r8, r0) == r1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065 A[Catch:{ all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[Catch:{ all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47226c(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.web.webview.p3471a.C44336t
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.web.webview.a.t r0 = (com.google.android.libraries.web.webview.p3471a.C44336t) r0
            int r1 = r0.f115293d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115293d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.webview.a.t r0 = new com.google.android.libraries.web.webview.a.t
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f115291b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f115293d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r6) goto L_0x0048
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            p5462h.C69714l.m101134b(r8)
            goto L_0x00c5
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f115290a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0040 }
            goto L_0x00c5
        L_0x0040:
            r8 = move-exception
            goto L_0x0098
        L_0x0042:
            java.lang.Object r2 = r0.f115290a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0040 }
            goto L_0x007f
        L_0x0048:
            java.lang.Object r2 = r0.f115290a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0040 }
            goto L_0x005d
        L_0x004e:
            p5462h.C69714l.m101134b(r8)
            r0.f115290a = r7     // Catch:{ all -> 0x0096 }
            r0.f115293d = r6     // Catch:{ all -> 0x0096 }
            java.lang.Object r8 = r7.mo47228e(r0)     // Catch:{ all -> 0x0096 }
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r7
        L_0x005d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0040 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0040 }
            if (r8 == 0) goto L_0x0068
            h.q r8 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0040 }
            return r8
        L_0x0068:
            r8 = r2
            com.google.android.libraries.web.webview.a.z r8 = (com.google.android.libraries.web.webview.p3471a.C44342z) r8     // Catch:{ all -> 0x0040 }
            com.google.android.libraries.web.profile.a.a.a.a r8 = r8.f115318h     // Catch:{ all -> 0x0040 }
            com.google.android.libraries.web.webview.a.u r6 = com.google.android.libraries.web.webview.p3471a.C44337u.f115294a     // Catch:{ all -> 0x0040 }
            r8.mo46977a(r6)     // Catch:{ all -> 0x0040 }
            r0.f115290a = r2     // Catch:{ all -> 0x0040 }
            r0.f115293d = r5     // Catch:{ all -> 0x0040 }
            r8 = r2
            com.google.android.libraries.web.webview.a.z r8 = (com.google.android.libraries.web.webview.p3471a.C44342z) r8     // Catch:{ all -> 0x0040 }
            java.lang.Object r8 = r8.mo47227d(r0)     // Catch:{ all -> 0x0040 }
            if (r8 == r1) goto L_0x0095
        L_0x007f:
            r8 = r2
            com.google.android.libraries.web.webview.a.z r8 = (com.google.android.libraries.web.webview.p3471a.C44342z) r8     // Catch:{ all -> 0x0040 }
            com.google.apps.tiktok.account.AccountId r8 = r8.f115315e     // Catch:{ all -> 0x0040 }
            int r8 = r8.mo50068a()     // Catch:{ all -> 0x0040 }
            r0.f115290a = r2     // Catch:{ all -> 0x0040 }
            r0.f115293d = r4     // Catch:{ all -> 0x0040 }
            r4 = r2
            com.google.android.libraries.web.webview.a.z r4 = (com.google.android.libraries.web.webview.p3471a.C44342z) r4     // Catch:{ all -> 0x0040 }
            java.lang.Object r8 = r4.m78289f(r8, r0)     // Catch:{ all -> 0x0040 }
            if (r8 != r1) goto L_0x00c5
        L_0x0095:
            return r1
        L_0x0096:
            r8 = move-exception
            r2 = r7
        L_0x0098:
            com.google.common.f.e r4 = f115311d
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.x r8 = r4.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 54210(0xd3c2, float:7.5964E-41)
            r4.<init>(r5)
            r8.mo56379ah(r4)
            java.lang.String r4 = "Failure in synchronizeAccount"
            r8.mo56386p(r4)
            r8 = 0
            r0.f115290a = r8
            r0.f115293d = r3
            com.google.android.libraries.web.webview.a.z r2 = (com.google.android.libraries.web.webview.p3471a.C44342z) r2
            r8 = -1
            java.lang.Object r8 = r2.m78289f(r8, r0)
            if (r8 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3471a.C44342z.mo47226c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47227d(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.web.webview.p3471a.C44338v
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.web.webview.a.v r0 = (com.google.android.libraries.web.webview.p3471a.C44338v) r0
            int r1 = r0.f115298d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115298d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.webview.a.v r0 = new com.google.android.libraries.web.webview.a.v
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f115296b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f115298d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r0 = r0.f115295a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0076
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0034:
            java.lang.Object r2 = r0.f115295a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0050
        L_0x003a:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.web.profile.i r8 = r7.f115316f
            com.google.android.libraries.web.base.v r2 = com.google.android.libraries.web.base.C43271v.WEB_VIEW
            com.google.common.util.concurrent.cx r8 = r8.mo47042b(r2)
            r0.f115295a = r7
            r0.f115298d = r4
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 == r1) goto L_0x0082
            r2 = r7
        L_0x0050:
            com.google.android.libraries.web.profile.Profile r8 = (com.google.android.libraries.web.profile.Profile) r8
            r4 = r2
            com.google.android.libraries.web.webview.a.z r4 = (com.google.android.libraries.web.webview.p3471a.C44342z) r4
            com.google.android.libraries.web.profile.e r4 = r4.f115317g
            com.google.android.libraries.web.profile.f r8 = r4.mo47027a(r8)
            com.google.android.libraries.web.shared.c.a r4 = com.google.android.libraries.web.shared.p3443c.C44082a.f114755a
            com.google.android.libraries.web.profile.d r5 = com.google.android.libraries.web.profile.C44069d.COOKIES_AND_SITE_DATA
            com.google.android.libraries.web.profile.d r6 = com.google.android.libraries.web.profile.C44069d.CACHE
            java.util.EnumSet r5 = java.util.EnumSet.of(r5, r6)
            java.lang.String r6 = "of(ProfileDataType.COOKI…A, ProfileDataType.CACHE)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f115295a = r2
            r0.f115298d = r3
            java.lang.Object r8 = r8.mo47032e(r4, r5, r0)
            if (r8 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r0 = r2
        L_0x0076:
            com.google.android.libraries.web.webview.a.z r0 = (com.google.android.libraries.web.webview.p3471a.C44342z) r0
            com.google.android.libraries.web.profile.a.a.a.c r8 = r0.f115319i
            com.google.android.libraries.web.profile.a.a.a.b r0 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43980b.OWNER
            r8.mo46979b(r0)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3471a.C44342z.mo47227d(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47228e(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.web.webview.p3471a.C44340x
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.web.webview.a.x r0 = (com.google.android.libraries.web.webview.p3471a.C44340x) r0
            int r1 = r0.f115308e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115308e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.webview.a.x r0 = new com.google.android.libraries.web.webview.a.x
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f115306c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f115308e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            int r1 = r0.f115305b
            java.lang.Object r0 = r0.f115304a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0074
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.web.profile.a.a.a.c r7 = r6.f115319i
            com.google.android.libraries.web.profile.a.a.a.b r7 = r7.mo46978a()
            com.google.android.libraries.web.profile.a.a.a.b r2 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43980b.UNKNOWN
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x0054
            if (r7 == r4) goto L_0x0089
            r0 = 2
            if (r7 != r0) goto L_0x004c
            r3 = 1
            goto L_0x0089
        L_0x004c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r0 = "All enum cases must be handled."
            r7.<init>(r0)
            throw r7
        L_0x0054:
            com.google.apps.tiktok.account.AccountId r7 = r6.f115315e
            int r7 = r7.mo50068a()
            com.google.android.libraries.storage.protostore.ab r2 = r6.f115320j
            com.google.common.util.concurrent.cx r2 = r2.mo46042d()
            java.lang.String r5 = "accountInfoProtoDataStore.getData()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            r0.f115304a = r6
            r0.f115305b = r7
            r0.f115308e = r4
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r0 == r1) goto L_0x008e
            r1 = r7
            r7 = r0
            r0 = r6
        L_0x0074:
            com.google.android.libraries.web.webview.a.e r7 = (com.google.android.libraries.web.webview.p3471a.C44321e) r7
            int r7 = r7.f115247b
            if (r1 != r7) goto L_0x007b
            r3 = 1
        L_0x007b:
            com.google.android.libraries.web.webview.a.z r0 = (com.google.android.libraries.web.webview.p3471a.C44342z) r0
            com.google.android.libraries.web.profile.a.a.a.c r7 = r0.f115319i
            if (r3 == 0) goto L_0x0084
            com.google.android.libraries.web.profile.a.a.a.b r0 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43980b.OWNER
            goto L_0x0086
        L_0x0084:
            com.google.android.libraries.web.profile.a.a.a.b r0 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43980b.NOT_OWNER
        L_0x0086:
            r7.mo46979b(r0)
        L_0x0089:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3471a.C44342z.mo47228e(h.c.g):java.lang.Object");
    }
}
