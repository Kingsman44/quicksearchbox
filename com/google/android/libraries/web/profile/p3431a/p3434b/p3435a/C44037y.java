package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.anc;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43981c;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44041d;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44042e;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44044g;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44045h;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44046i;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44048k;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44050m;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.a.b.a.y */
/* compiled from: PG */
public final class C44037y implements C44041d {

    /* renamed from: g */
    private static final C59071e f114651g = C59071e.m91331h();

    /* renamed from: a */
    public final Profile f114652a;

    /* renamed from: b */
    public final AccountId f114653b;

    /* renamed from: c */
    public final C46175b f114654c;

    /* renamed from: d */
    public final C69585o f114655d;

    /* renamed from: e */
    public final C44051c f114656e;

    /* renamed from: f */
    public final C71788b f114657f;

    /* renamed from: h */
    private final Context f114658h;

    /* renamed from: i */
    private final C44065d f114659i;

    /* renamed from: j */
    private final C44016d f114660j;

    /* renamed from: k */
    private final C43981c f114661k;

    /* renamed from: l */
    private final C71422aw f114662l;

    /* renamed from: m */
    private final boolean f114663m;

    /* renamed from: n */
    private final C43997aj f114664n;

    public C44037y(Profile profile, AccountId accountId, C46175b bVar, Context context, C44065d dVar, C44016d dVar2, C43981c cVar, C69585o oVar, C71422aw awVar, C44058f fVar, anc anc, C69464a aVar, C69464a aVar2) {
        C71788b bVar2;
        C69664n.m101061g(profile, "profile");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(context, "appContext");
        C69664n.m101061g(cVar, "webAccountStateRegistry");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(fVar, "cookieManagerFactory");
        C69664n.m101061g(anc, "persistentStateManagerFactory");
        C69664n.m101061g(aVar, "webLayerMutex");
        this.f114652a = profile;
        this.f114653b = accountId;
        this.f114654c = bVar;
        this.f114658h = context;
        this.f114659i = dVar;
        this.f114660j = dVar2;
        this.f114661k = cVar;
        this.f114655d = oVar;
        this.f114662l = awVar;
        this.f114663m = C43271v.WEB_VIEW == profile.f114484b;
        this.f114656e = fVar.mo47022b(profile);
        C68214a a = C68219e.m98518a(anc.f197998a.a.b.f200512kw);
        anh anh = anc.f197998a.b;
        this.f114664n = new C43997aj(profile, (AccountId) anc.f197998a.b.f198239e.mo17428b(), (C21370a) anc.f197998a.a.i.mo17428b(), (C69585o) anc.f197998a.a.G.mo17428b(), (Executor) anc.f197998a.a.n.mo17428b(), a, anh.f198111be, anh.f198112bf);
        if (C43271v.WEB_VIEW == profile.f114484b) {
            bVar2 = (C71788b) aVar2.mo17428b();
        } else {
            bVar2 = (C71788b) aVar.mo17428b();
        }
        C69664n.m101060f(bVar2, "if (WebImplementation.WE…webLayerMutex.get()\n    }");
        this.f114657f = bVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.google.android.libraries.web.profile.a.b.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.libraries.web.profile.a.b.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: com.google.android.libraries.web.profile.a.b.a.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: com.google.android.libraries.web.profile.a.b.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: com.google.android.libraries.web.profile.a.b.a.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: com.google.android.libraries.web.profile.a.b.a.y} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        if (r9 == r1) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        if (r9 != r1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
        if (r2.mo46986b(r5, r0) != r1) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010e, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m77737k(com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y r8, p5462h.p5466c.C69577g r9) {
        /*
            boolean r0 = r9 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44030r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.web.profile.a.b.a.r r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44030r) r0
            int r1 = r0.f114626d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114626d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.r r0 = new com.google.android.libraries.web.profile.a.b.a.r
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f114625c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114626d
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0063
            if (r2 == r7) goto L_0x005d
            if (r2 == r6) goto L_0x0057
            if (r2 == r5) goto L_0x0051
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r8 = r0.f114624b
            java.lang.Object r0 = r0.f114623a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0038 }
            goto L_0x010d
        L_0x0038:
            r8 = r0
            goto L_0x010f
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            java.lang.Object r8 = r0.f114624b
            java.lang.Object r2 = r0.f114623a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x004e }
            r9 = r8
            r8 = r2
            goto L_0x00ea
        L_0x004e:
            r8 = r2
            goto L_0x010f
        L_0x0051:
            java.lang.Object r8 = r0.f114623a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x010f }
            goto L_0x00bc
        L_0x0057:
            java.lang.Object r8 = r0.f114623a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x010f }
            goto L_0x009c
        L_0x005d:
            java.lang.Object r8 = r0.f114623a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x010f }
            goto L_0x007f
        L_0x0063:
            p5462h.C69714l.m101134b(r9)
            boolean r9 = r8.f114663m     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x007f
            com.google.android.libraries.web.profile.a.b.a.aj r9 = r8.f114664n     // Catch:{ all -> 0x010f }
            r0.f114623a = r8     // Catch:{ all -> 0x010f }
            r0.f114626d = r7     // Catch:{ all -> 0x010f }
            com.google.android.libraries.web.profile.a.b.a.ad r2 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43991ad.f114508a     // Catch:{ all -> 0x010f }
            java.lang.Object r9 = r9.mo46988d(r2, r0)     // Catch:{ all -> 0x010f }
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x010f }
            if (r9 == r2) goto L_0x007c
            h.q r9 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x010f }
        L_0x007c:
            if (r9 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r9 = r8
            com.google.android.libraries.web.profile.a.b.a.y r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r9     // Catch:{ all -> 0x010f }
            com.google.apps.tiktok.account.data.b r9 = r9.f114654c     // Catch:{ all -> 0x010f }
            r2 = r8
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ all -> 0x010f }
            com.google.apps.tiktok.account.AccountId r2 = r2.f114653b     // Catch:{ all -> 0x010f }
            com.google.common.util.concurrent.cx r9 = r9.mo50246c(r2)     // Catch:{ all -> 0x010f }
            java.lang.String r2 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ all -> 0x010f }
            r0.f114623a = r8     // Catch:{ all -> 0x010f }
            r0.f114626d = r6     // Catch:{ all -> 0x010f }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)     // Catch:{ all -> 0x010f }
            if (r9 == r1) goto L_0x010e
        L_0x009c:
            com.google.apps.tiktok.account.data.a r9 = (com.google.apps.tiktok.account.data.C46108a) r9     // Catch:{ all -> 0x010f }
            com.google.apps.tiktok.account.data.j r9 = r9.mo50210b()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.f121165j     // Catch:{ all -> 0x010f }
            java.lang.String r2 = "google"
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r2)     // Catch:{ all -> 0x010f }
            if (r9 != 0) goto L_0x00af
            com.google.android.libraries.web.profile.a.b.g r8 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_INVALID_ACCOUNT_TYPE     // Catch:{ all -> 0x010f }
            return r8
        L_0x00af:
            r0.f114623a = r8     // Catch:{ all -> 0x010f }
            r0.f114626d = r5     // Catch:{ all -> 0x010f }
            r9 = r8
            com.google.android.libraries.web.profile.a.b.a.y r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r9     // Catch:{ all -> 0x010f }
            java.lang.Object r9 = r9.mo47000h(r0)     // Catch:{ all -> 0x010f }
            if (r9 == r1) goto L_0x010e
        L_0x00bc:
            com.google.android.libraries.web.profile.a.b.g r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44044g) r9     // Catch:{ all -> 0x010f }
            r2 = r8
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ all -> 0x010f }
            com.google.android.libraries.web.profile.a.a.a.c r2 = r2.f114661k     // Catch:{ all -> 0x010f }
            int[] r5 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44017e.f114579a     // Catch:{ all -> 0x010f }
            int r6 = r9.ordinal()     // Catch:{ all -> 0x010f }
            r5 = r5[r6]     // Catch:{ all -> 0x010f }
            if (r5 != r7) goto L_0x00d0
            com.google.android.libraries.web.profile.a.a.a.d r5 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.SIGNED_IN     // Catch:{ all -> 0x010f }
            goto L_0x00d2
        L_0x00d0:
            com.google.android.libraries.web.profile.a.a.a.d r5 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.FETCH_FAILED     // Catch:{ all -> 0x010f }
        L_0x00d2:
            r2.mo46980c(r5)     // Catch:{ all -> 0x010f }
            r2 = r8
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ all -> 0x010f }
            com.google.android.libraries.web.profile.a.b.a.aj r2 = r2.f114664n     // Catch:{ all -> 0x010f }
            com.google.android.libraries.web.profile.a.b.a.av r5 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43998ak.m77672c(r9)     // Catch:{ all -> 0x010f }
            r0.f114623a = r8     // Catch:{ all -> 0x010f }
            r0.f114624b = r9     // Catch:{ all -> 0x010f }
            r0.f114626d = r4     // Catch:{ all -> 0x010f }
            java.lang.Object r2 = r2.mo46986b(r5, r0)     // Catch:{ all -> 0x010f }
            if (r2 == r1) goto L_0x010e
        L_0x00ea:
            r2 = r8
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ all -> 0x010f }
            boolean r2 = r2.f114663m     // Catch:{ all -> 0x010f }
            if (r2 == 0) goto L_0x010c
            com.google.android.libraries.web.profile.a.b.g r2 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.SUCCESS     // Catch:{ all -> 0x010f }
            if (r9 == r2) goto L_0x00f9
            com.google.android.libraries.web.profile.a.b.g r2 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_INVALID_COOKIES     // Catch:{ all -> 0x010f }
            if (r9 != r2) goto L_0x010c
        L_0x00f9:
            r2 = r8
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ all -> 0x010f }
            com.google.android.libraries.web.profile.a.b.a.aj r2 = r2.f114664n     // Catch:{ all -> 0x010f }
            r0.f114623a = r8     // Catch:{ all -> 0x010f }
            r0.f114624b = r9     // Catch:{ all -> 0x010f }
            r0.f114626d = r3     // Catch:{ all -> 0x010f }
            java.lang.Object r8 = r2.mo46987c(r0)     // Catch:{ all -> 0x010f }
            if (r8 == r1) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            return r1
        L_0x010c:
            r8 = r9
        L_0x010d:
            return r8
        L_0x010e:
            return r1
        L_0x010f:
            com.google.android.libraries.web.profile.a.b.a.y r8 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r8
            com.google.android.libraries.web.profile.a.a.a.c r8 = r8.f114661k
            com.google.android.libraries.web.profile.a.a.a.d r9 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.FETCH_FAILED
            r8.mo46980c(r9)
            com.google.android.libraries.web.profile.a.b.g r8 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_UNCAUGHT_THROWABLE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.m77737k(com.google.android.libraries.web.profile.a.b.a.y, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r9 != r1) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m77738m(com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y r7, boolean r8, p5462h.p5466c.C69577g r9) {
        /*
            boolean r0 = r9 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44032t
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.web.profile.a.b.a.t r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44032t) r0
            int r1 = r0.f114635e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114635e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.t r0 = new com.google.android.libraries.web.profile.a.b.a.t
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f114634d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114635e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r6) goto L_0x0045
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r7 = r0.f114631a
            com.google.android.libraries.web.profile.a.b.m r7 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44050m) r7
            p5462h.C69714l.m101134b(r9)
            goto L_0x00a9
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            java.lang.Object r7 = r0.f114632b
            java.lang.Object r8 = r0.f114631a
            com.google.android.libraries.web.profile.a.b.a.y r8 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r8
            p5462h.C69714l.m101134b(r9)
            goto L_0x008c
        L_0x0045:
            boolean r8 = r0.f114633c
            java.lang.Object r7 = r0.f114631a
            com.google.android.libraries.web.profile.a.b.a.y r7 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r7
            p5462h.C69714l.m101134b(r9)
            goto L_0x0063
        L_0x004f:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.web.profile.a.b.a.v r9 = new com.google.android.libraries.web.profile.a.b.a.v
            r9.<init>(r7, r3)
            r0.f114631a = r7
            r0.f114633c = r8
            r0.f114635e = r6
            java.lang.Object r9 = kotlinx.coroutines.C71423ax.m104196a(r9, r0)
            if (r9 == r1) goto L_0x00aa
        L_0x0063:
            com.google.android.libraries.web.profile.a.b.m r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44050m) r9
            com.google.android.libraries.web.profile.a.a.a.c r2 = r7.f114661k
            com.google.android.libraries.web.profile.a.b.m r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.VALID
            if (r9 != r6) goto L_0x006e
            com.google.android.libraries.web.profile.a.a.a.d r8 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.SIGNED_IN
            goto L_0x0075
        L_0x006e:
            if (r8 == 0) goto L_0x0073
            com.google.android.libraries.web.profile.a.a.a.d r8 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.FETCHING
            goto L_0x0075
        L_0x0073:
            com.google.android.libraries.web.profile.a.a.a.d r8 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.SIGNED_OUT
        L_0x0075:
            r2.mo46980c(r8)
            com.google.android.libraries.web.profile.a.b.a.aj r8 = r7.f114664n
            com.google.android.libraries.web.profile.a.b.a.av r2 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43998ak.m77673d(r9)
            r0.f114631a = r7
            r0.f114632b = r9
            r0.f114635e = r5
            java.lang.Object r8 = r8.mo46986b(r2, r0)
            if (r8 == r1) goto L_0x00aa
            r8 = r7
            r7 = r9
        L_0x008c:
            boolean r9 = r8.f114663m
            if (r9 == 0) goto L_0x00a9
            r9 = r7
            com.google.android.libraries.web.profile.a.b.m r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44050m) r9
            boolean r9 = r8.m77740q(r9)
            if (r9 != 0) goto L_0x00a9
            com.google.android.libraries.web.profile.a.b.a.aj r8 = r8.f114664n
            r0.f114631a = r7
            r0.f114632b = r3
            r0.f114635e = r4
            java.lang.Object r8 = r8.mo46987c(r0)
            if (r8 == r1) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            return r1
        L_0x00a9:
            return r7
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.m77738m(com.google.android.libraries.web.profile.a.b.a.y, boolean, h.c.g):java.lang.Object");
    }

    /* renamed from: p */
    public static final C44046i m77739p() {
        C44045h hVar = (C44045h) C44046i.f114685d.createBuilder();
        C69664n.m101060f(hVar, "newBuilder()");
        C44048k a = C69664n.m101061g(hVar, "builder");
        a.mo47010b(C44050m.VALID_INCOGNITO);
        return a.mo47009a();
    }

    /* renamed from: q */
    private final boolean m77740q(C44050m mVar) {
        C44044g gVar = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        C44050m mVar2 = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        switch (mVar.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final C60870cx mo46989a() {
        return C71663i.m104692e(this.f114662l, C71424ay.UNDISPATCHED, new C44025m(this, (C69577g) null), 1);
    }

    /* renamed from: b */
    public final C60870cx mo46990b() {
        return C71663i.m104692e(this.f114662l, C71424ay.UNDISPATCHED, new C44027o(this, (C69577g) null), 1);
    }

    /* renamed from: c */
    public final Object mo46991c(C69577g gVar) {
        if (this.f114652a.f114485c) {
            return C44044g.ERROR_INCOGNITO;
        }
        return C71803m.m105040a(this.f114655d, new C44024l(this, (C69577g) null), gVar);
    }

    /* renamed from: d */
    public final Object mo46992d(C44042e eVar, C69577g gVar) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46997e(com.google.common.p4522b.C58487gw r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44018f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.web.profile.a.b.a.f r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44018f) r0
            int r1 = r0.f114582c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114582c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.f r0 = new com.google.android.libraries.web.profile.a.b.a.f
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f114580a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114582c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)     // Catch:{ h -> 0x0044 }
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.web.profile.a.b.a.h r6 = new com.google.android.libraries.web.profile.a.b.a.h     // Catch:{ h -> 0x0044 }
            r2 = 0
            r6.<init>(r5, r4, r2)     // Catch:{ h -> 0x0044 }
            r0.f114582c = r3     // Catch:{ h -> 0x0044 }
            java.lang.Object r5 = kotlinx.coroutines.C71423ax.m104196a(r6, r0)     // Catch:{ h -> 0x0044 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.google.android.libraries.web.profile.a.b.g r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.SUCCESS     // Catch:{ h -> 0x0044 }
            return r5
        L_0x0044:
            com.google.android.libraries.web.profile.a.b.g r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_INVALID_COOKIES
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo46997e(com.google.common.b.gw, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46998f(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44021i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.web.profile.a.b.a.i r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44021i) r0
            int r1 = r0.f114592c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114592c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.i r0 = new com.google.android.libraries.web.profile.a.b.a.i
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f114590a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114592c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x003e
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.web.profile.a.c r6 = r5.f114656e
            r0.f114592c = r3
            java.lang.String r2 = "https://www.google.com"
            java.lang.Object r6 = r6.mo47015d(r2, r0)
            if (r6 == r1) goto L_0x0098
        L_0x003e:
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L_0x004c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        L_0x004c:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r2 = ";"
            r0[r1] = r2
            java.util.List r6 = p5462h.p5483m.C69764m.m101188E(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x005a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "SAPISID="
            boolean r2 = p5462h.p5483m.C69764m.m101234m(r0, r2)
            if (r2 != 0) goto L_0x007e
            java.lang.String r2 = "__Secure-1PAPISID="
            boolean r2 = p5462h.p5483m.C69764m.m101234m(r0, r2)
            if (r2 != 0) goto L_0x007e
            java.lang.String r2 = "__Secure-3PAPISID="
            boolean r2 = p5462h.p5483m.C69764m.m101234m(r0, r2)
            if (r2 == 0) goto L_0x005a
        L_0x007e:
            int r6 = r0.length()
            r2 = 61
            r4 = 6
            int r0 = p5462h.p5483m.C69764m.m101185B(r0, r2, r1, r4)
            int r0 = r0 + r3
            if (r6 <= r0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r3 = 0
        L_0x008e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L_0x0093:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo46998f(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46999g(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44022j
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.web.profile.a.b.a.j r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44022j) r0
            int r1 = r0.f114595c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114595c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.j r0 = new com.google.android.libraries.web.profile.a.b.a.j
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f114593a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114595c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r8)
            goto L_0x006c
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x002f:
            p5462h.C69714l.m101134b(r8)
            android.content.Context r8 = r7.f114658h
            java.lang.String r8 = r8.getPackageName()
            com.google.android.libraries.web.profile.b.d r2 = r7.f114659i
            com.google.android.libraries.web.profile.Profile r4 = r7.f114652a
            com.google.android.libraries.web.profile.b.c r2 = r2.mo47024a(r4)
            com.google.frameworks.client.data.android.ae r4 = new com.google.frameworks.client.data.android.ae
            r4.<init>()
            java.lang.String r5 = "POST"
            r4.mo57933b(r5)
            java.lang.String r5 = "Origin"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            java.lang.String r6 = "https://www.google.com"
            r4.mo57932a(r5, r6)
            java.lang.String r5 = "https://accounts.google.com/ListAccounts?source=webx:"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r5.concat(r8)
            com.google.common.util.concurrent.cx r8 = r2.mo47023a(r8, r4)
            r0.f114595c = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 != r1) goto L_0x006c
            return r1
        L_0x006c:
            java.lang.String r0 = "profileHttpClientFactory…N)\n      )\n      .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo46999g(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[PHI: r6 
      PHI: (r6v4 java.lang.Object) = (r6v7 java.lang.Object), (r6v1 java.lang.Object) binds: [B:25:0x0060, B:11:?] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47000h(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44023k
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.web.profile.a.b.a.k r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44023k) r0
            int r1 = r0.f114600e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114600e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.k r0 = new com.google.android.libraries.web.profile.a.b.a.k
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f114598c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114600e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r6)     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            goto L_0x0063
        L_0x002a:
            r6 = move-exception
            goto L_0x006b
        L_0x002c:
            r6 = move-exception
            goto L_0x0077
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f114597b
            java.lang.Object r4 = r0.f114596a
            p5462h.C69714l.m101134b(r6)     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            goto L_0x0051
        L_0x003e:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.web.profile.a.b.a.d r6 = r5.f114660j     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            r0.f114596a = r5     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            r0.f114597b = r5     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            r0.f114600e = r4     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            java.lang.Object r6 = r6.mo46996a(r0)     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            if (r6 == r1) goto L_0x0064
            r2 = r5
            r4 = r2
        L_0x0051:
            com.google.common.b.gw r6 = (com.google.common.p4522b.C58487gw) r6     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            r0.f114596a = r4     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            r4 = 0
            r0.f114597b = r4     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            r0.f114600e = r3     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            java.lang.Object r6 = r2.mo46997e(r6, r0)     // Catch:{ u -> 0x002c, UserRecoverableAuthException -> 0x002a, IOException -> 0x0068, e -> 0x0065 }
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r6
        L_0x0064:
            return r1
        L_0x0065:
            com.google.android.libraries.web.profile.a.b.g r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_GENERIC_AUTH_ERROR
            return r6
        L_0x0068:
            com.google.android.libraries.web.profile.a.b.g r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_RETRY
            return r6
        L_0x006b:
            android.content.Intent r6 = r6.mo117772a()
            if (r6 != 0) goto L_0x0074
            com.google.android.libraries.web.profile.a.b.g r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_AUTH_USER_RECOVERABLE_WITHOUT_INTENT
            goto L_0x0076
        L_0x0074:
            com.google.android.libraries.web.profile.a.b.g r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_AUTH_USER_RECOVERABLE_WITH_INTENT
        L_0x0076:
            return r6
        L_0x0077:
            java.lang.String r6 = r6.f387824a
            java.lang.String r0 = "recoveryUrl"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0087
            com.google.android.libraries.web.profile.a.b.g r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_AUTH_RECOVERABLE_WITHOUT_URL
            goto L_0x0089
        L_0x0087:
            com.google.android.libraries.web.profile.a.b.g r6 = com.google.android.libraries.web.profile.p3431a.p3434b.C44044g.ERROR_AUTH_RECOVERABLE_WITH_URL
        L_0x0089:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo47000h(h.c.g):java.lang.Object");
    }

    /* renamed from: i */
    public final Object mo47001i(C69577g gVar) {
        if (this.f114652a.f114485c) {
            return m77739p();
        }
        return C71803m.m105040a(this.f114655d, new C44026n(this, (C69577g) null), gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47002j(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44029q
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.web.profile.a.b.a.q r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44029q) r0
            int r1 = r0.f114622d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114622d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.q r0 = new com.google.android.libraries.web.profile.a.b.a.q
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f114620b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114622d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f114619a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0050
        L_0x0029:
            r6 = move-exception
            goto L_0x005c
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.web.profile.a.a.a.c r6 = r5.f114661k
            com.google.android.libraries.web.profile.a.a.a.d r2 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.FETCHING
            r6.mo46980c(r2)
            java.lang.String r6 = "GaiaCookieManager#refreshCookies"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r6)
            r0.f114619a = r6     // Catch:{ all -> 0x0058 }
            r0.f114622d = r3     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = m77737k(r5, r0)     // Catch:{ all -> 0x0058 }
            if (r0 == r1) goto L_0x0057
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0050:
            com.google.android.libraries.web.profile.a.b.g r6 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44044g) r6     // Catch:{ all -> 0x0029 }
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return r6
        L_0x0057:
            return r1
        L_0x0058:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x005c:
            throw r6     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo47002j(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47003l(boolean r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44031s
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.web.profile.a.b.a.s r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44031s) r0
            int r1 = r0.f114630d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114630d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.s r0 = new com.google.android.libraries.web.profile.a.b.a.s
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f114628b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114630d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f114627a
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0049
        L_0x0029:
            r7 = move-exception
            goto L_0x0055
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            java.lang.String r7 = "GaiaCookieManager#verifyCookies"
            com.google.apps.tiktok.tracing.bi r7 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r7)
            r0.f114627a = r7     // Catch:{ all -> 0x0051 }
            r0.f114630d = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r6 = m77738m(r5, r6, r0)     // Catch:{ all -> 0x0051 }
            if (r6 == r1) goto L_0x0050
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0049:
            com.google.android.libraries.web.profile.a.b.m r7 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44050m) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r6, r0)
            return r7
        L_0x0050:
            return r1
        L_0x0051:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0055:
            throw r7     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo47003l(boolean, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: com.google.android.libraries.web.profile.a.b.a.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v33, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee A[Catch:{ all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47004n(boolean r13, com.google.android.libraries.web.profile.p3431a.p3434b.C44042e r14, p5462h.p5466c.C69577g r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44035w
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.libraries.web.profile.a.b.a.w r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44035w) r0
            int r1 = r0.f114646f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114646f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.w r0 = new com.google.android.libraries.web.profile.a.b.a.w
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f114644d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114646f
            java.lang.String r3 = "newBuilder()"
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x006f
            if (r2 == r7) goto L_0x005f
            if (r2 == r6) goto L_0x0054
            if (r2 == r5) goto L_0x0046
            if (r2 != r4) goto L_0x003e
            java.lang.Object r13 = r0.f114643c
            com.google.android.libraries.web.profile.a.b.m r13 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44050m) r13
            java.lang.Object r14 = r0.f114642b
            java.lang.Object r0 = r0.f114641a
            p5462h.C69714l.m101134b(r15)     // Catch:{ all -> 0x003b }
            goto L_0x0108
        L_0x003b:
            r13 = move-exception
            goto L_0x015b
        L_0x003e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0046:
            java.lang.Object r14 = r0.f114642b
            java.lang.Object r13 = r0.f114641a
            p5462h.C69714l.m101134b(r15)     // Catch:{ all -> 0x004f }
            goto L_0x00e3
        L_0x004f:
            r15 = move-exception
            r0 = r13
            r13 = r15
            goto L_0x015b
        L_0x0054:
            java.lang.Object r13 = r0.f114642b
            java.lang.Object r14 = r0.f114641a
            p5462h.C69714l.m101134b(r15)
            r11 = r14
            r14 = r13
            r13 = r11
            goto L_0x00a7
        L_0x005f:
            java.lang.Object r13 = r0.f114643c
            com.google.android.libraries.web.profile.a.b.a.aj r13 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43997aj) r13
            java.lang.Object r14 = r0.f114642b
            java.lang.Object r2 = r0.f114641a
            p5462h.C69714l.m101134b(r15)
            r11 = r15
            r15 = r14
            r14 = r2
            r2 = r11
            goto L_0x0087
        L_0x006f:
            p5462h.C69714l.m101134b(r15)
            if (r13 == 0) goto L_0x00b3
            com.google.android.libraries.web.profile.a.b.a.aj r13 = r12.f114664n
            r0.f114641a = r12
            r0.f114642b = r14
            r0.f114643c = r13
            r0.f114646f = r7
            java.lang.Object r15 = r12.mo46998f(r0)
            if (r15 == r1) goto L_0x00b2
            r2 = r15
            r15 = r14
            r14 = r12
        L_0x0087:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.f114641a = r14
            r0.f114642b = r15
            r8 = 0
            r0.f114643c = r8
            r0.f114646f = r6
            h.c.o r9 = r13.f114522b
            com.google.android.libraries.web.profile.a.b.a.ag r10 = new com.google.android.libraries.web.profile.a.b.a.ag
            r10.<init>(r13, r2, r8)
            java.lang.Object r13 = kotlinx.coroutines.C71803m.m105040a(r9, r10, r0)
            if (r13 == r1) goto L_0x00b2
            r11 = r15
            r15 = r13
            r13 = r14
            r14 = r11
        L_0x00a7:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            r15 = 0
            goto L_0x00b5
        L_0x00b2:
            return r1
        L_0x00b3:
            r13 = r12
        L_0x00b4:
            r15 = 1
        L_0x00b5:
            if (r15 != 0) goto L_0x00cf
            if (r14 == 0) goto L_0x00c7
            boolean r13 = r14.mo42505f()
            if (r13 == 0) goto L_0x00c7
            r14.mo42504e()
            com.google.android.libraries.web.profile.a.b.m r13 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.ALREADY_VERIFIED_RECENTLY
            r14.mo42501b(r13)
        L_0x00c7:
            com.google.android.libraries.web.profile.a.b.i r13 = com.google.android.libraries.web.profile.p3431a.p3434b.C44046i.f114685d
            java.lang.String r14 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            return r13
        L_0x00cf:
            if (r14 == 0) goto L_0x00d4
            r14.mo42504e()     // Catch:{ all -> 0x004f }
        L_0x00d4:
            r0.f114641a = r13     // Catch:{ all -> 0x004f }
            r0.f114642b = r14     // Catch:{ all -> 0x004f }
            r0.f114646f = r5     // Catch:{ all -> 0x004f }
            r15 = r13
            com.google.android.libraries.web.profile.a.b.a.y r15 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r15     // Catch:{ all -> 0x004f }
            java.lang.Object r15 = r15.mo47003l(r7, r0)     // Catch:{ all -> 0x004f }
            if (r15 == r1) goto L_0x015a
        L_0x00e3:
            com.google.android.libraries.web.profile.a.b.m r15 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44050m) r15     // Catch:{ all -> 0x004f }
            r2 = r13
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ all -> 0x004f }
            boolean r2 = r2.m77740q(r15)     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x013e
            if (r14 == 0) goto L_0x00f3
            r14.mo42500a(r15)     // Catch:{ all -> 0x004f }
        L_0x00f3:
            r0.f114641a = r13     // Catch:{ all -> 0x004f }
            r0.f114642b = r14     // Catch:{ all -> 0x004f }
            r0.f114643c = r15     // Catch:{ all -> 0x004f }
            r0.f114646f = r4     // Catch:{ all -> 0x004f }
            r2 = r13
            com.google.android.libraries.web.profile.a.b.a.y r2 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r2     // Catch:{ all -> 0x004f }
            java.lang.Object r0 = r2.mo47002j(r0)     // Catch:{ all -> 0x004f }
            if (r0 == r1) goto L_0x013d
            r11 = r0
            r0 = r13
            r13 = r15
            r15 = r11
        L_0x0108:
            com.google.android.libraries.web.profile.a.b.g r15 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44044g) r15     // Catch:{ all -> 0x003b }
            if (r14 == 0) goto L_0x010f
            r14.mo42503d(r15)     // Catch:{ all -> 0x003b }
        L_0x010f:
            com.google.android.libraries.web.profile.a.b.i r1 = com.google.android.libraries.web.profile.p3431a.p3434b.C44046i.f114685d     // Catch:{ all -> 0x003b }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x003b }
            com.google.android.libraries.web.profile.a.b.h r1 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44045h) r1     // Catch:{ all -> 0x003b }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x003b }
            com.google.android.libraries.web.profile.a.b.k r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")     // Catch:{ all -> 0x003b }
            r1.mo47010b(r13)     // Catch:{ all -> 0x003b }
            java.lang.String r13 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r13)     // Catch:{ all -> 0x003b }
            com.google.android.libraries.web.profile.a.b.h r13 = r1.f114690a     // Catch:{ all -> 0x003b }
            r13.copyOnWrite()     // Catch:{ all -> 0x003b }
            com.google.protobuf.bv r13 = r13.instance     // Catch:{ all -> 0x003b }
            com.google.android.libraries.web.profile.a.b.i r13 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44046i) r13     // Catch:{ all -> 0x003b }
            int r15 = r15.f114684m     // Catch:{ all -> 0x003b }
            r13.f114689c = r15     // Catch:{ all -> 0x003b }
            int r15 = r13.f114687a     // Catch:{ all -> 0x003b }
            r15 = r15 | r6
            r13.f114687a = r15     // Catch:{ all -> 0x003b }
            com.google.android.libraries.web.profile.a.b.i r13 = r1.mo47009a()     // Catch:{ all -> 0x003b }
            return r13
        L_0x013d:
            return r1
        L_0x013e:
            if (r14 == 0) goto L_0x0143
            r14.mo42501b(r15)     // Catch:{ all -> 0x004f }
        L_0x0143:
            com.google.android.libraries.web.profile.a.b.i r0 = com.google.android.libraries.web.profile.p3431a.p3434b.C44046i.f114685d     // Catch:{ all -> 0x004f }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x004f }
            com.google.android.libraries.web.profile.a.b.h r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44045h) r0     // Catch:{ all -> 0x004f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ all -> 0x004f }
            com.google.android.libraries.web.profile.a.b.k r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")     // Catch:{ all -> 0x004f }
            r0.mo47010b(r15)     // Catch:{ all -> 0x004f }
            com.google.android.libraries.web.profile.a.b.i r13 = r0.mo47009a()     // Catch:{ all -> 0x004f }
            return r13
        L_0x015a:
            return r1
        L_0x015b:
            com.google.android.libraries.web.profile.a.b.a.y r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r0
            com.google.android.libraries.web.profile.a.a.a.c r15 = r0.f114661k
            kotlinx.coroutines.b.du r15 = r15.f114492a
            java.lang.Object r15 = r15.mo62784e()
            com.google.android.libraries.web.profile.a.a.a.d r15 = (com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d) r15
            com.google.android.libraries.web.profile.a.a.a.d r1 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.FETCHING
            if (r15 != r1) goto L_0x0172
            com.google.android.libraries.web.profile.a.a.a.c r15 = r0.f114661k
            com.google.android.libraries.web.profile.a.a.a.d r0 = com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43983d.FETCH_FAILED
            r15.mo46980c(r0)
        L_0x0172:
            if (r14 == 0) goto L_0x0177
            r14.mo42502c()
        L_0x0177:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo47004n(boolean, com.google.android.libraries.web.profile.a.b.e, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[Catch:{ ac -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC, Splitter:B:21:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47005o(com.google.apps.tiktok.account.data.C46108a r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44036x
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.web.profile.a.b.a.x r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44036x) r0
            int r1 = r0.f114650d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114650d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.x r0 = new com.google.android.libraries.web.profile.a.b.a.x
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f114648b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114650d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f114647a
            p5462h.C69714l.m101134b(r6)     // Catch:{ ac -> 0x00d0 }
            goto L_0x003e
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            r0.f114647a = r5     // Catch:{ ac -> 0x00d0 }
            r0.f114650d = r3     // Catch:{ ac -> 0x00d0 }
            java.lang.Object r6 = r4.mo46999g(r0)     // Catch:{ ac -> 0x00d0 }
            if (r6 == r1) goto L_0x00cf
        L_0x003e:
            com.google.frameworks.client.data.android.ah r6 = (com.google.frameworks.client.data.android.C61366ah) r6     // Catch:{ ac -> 0x00d0 }
            int r0 = r6.f165947c     // Catch:{ ac -> 0x00d0 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x004a
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.ERROR_SERVER_ERROR     // Catch:{ ac -> 0x00d0 }
            goto L_0x00ce
        L_0x004a:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00ad }
            java.nio.charset.Charset r1 = p3186j$.nio.charset.StandardCharsets.UTF_8     // Catch:{ JSONException -> 0x00ad }
            java.nio.ByteBuffer r6 = r6.f165946b     // Catch:{ JSONException -> 0x00ad }
            java.nio.CharBuffer r6 = r1.decode(r6)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x00ad }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x00ad }
            int r6 = r0.length()     // Catch:{ JSONException -> 0x00ad }
            r1 = 2
            if (r6 >= r1) goto L_0x0065
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.INVALID_NO_ACCOUNTS     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00ce
        L_0x0065:
            org.json.JSONArray r6 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x00ad }
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00ad }
            if (r0 != 0) goto L_0x0072
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.INVALID_NO_ACCOUNTS     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00ce
        L_0x0072:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00ad }
            if (r0 <= r3) goto L_0x007b
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.INVALID_MULTIPLE_ACCOUNTS     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00ce
        L_0x007b:
            r0 = 0
            org.json.JSONArray r6 = r6.getJSONArray(r0)     // Catch:{ JSONException -> 0x00ad }
            r0 = 10
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x00ad }
            com.google.apps.tiktok.account.data.a r5 = (com.google.apps.tiktok.account.data.C46108a) r5     // Catch:{ JSONException -> 0x00ad }
            com.google.apps.tiktok.account.data.j r5 = r5.mo50210b()     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r5 = r5.f121157b     // Catch:{ JSONException -> 0x00ad }
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r5)     // Catch:{ JSONException -> 0x00ad }
            if (r5 != 0) goto L_0x0097
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.INVALID_ACCOUNT_MISMATCH     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00ce
        L_0x0097:
            r5 = 9
            java.lang.Object r5 = r6.get(r5)     // Catch:{ JSONException -> 0x00ad }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x00ad }
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)     // Catch:{ JSONException -> 0x00ad }
            if (r5 != 0) goto L_0x00aa
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.INVALID_COOKIES     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00ce
        L_0x00aa:
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.VALID     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00ce
        L_0x00ad:
            r5 = move-exception
            com.google.common.f.e r6 = f114651g     // Catch:{ ac -> 0x00d0 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ ac -> 0x00d0 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ ac -> 0x00d0 }
            com.google.common.f.x r5 = r6.mo56382g(r5)     // Catch:{ ac -> 0x00d0 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ ac -> 0x00d0 }
            java.lang.String r6 = "Error while parsing ListAccounts server response"
            com.google.common.f.n r0 = new com.google.common.f.n     // Catch:{ ac -> 0x00d0 }
            r1 = 54159(0xd38f, float:7.5893E-41)
            r0.<init>(r1)     // Catch:{ ac -> 0x00d0 }
            r5.mo56379ah(r0)     // Catch:{ ac -> 0x00d0 }
            r5.mo56386p(r6)     // Catch:{ ac -> 0x00d0 }
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.ERROR_SERVER_ERROR     // Catch:{ ac -> 0x00d0 }
        L_0x00ce:
            return r5
        L_0x00cf:
            return r1
        L_0x00d0:
            com.google.android.libraries.web.profile.a.b.m r5 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.ERROR_NETWORK_ERROR
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y.mo47005o(com.google.apps.tiktok.account.data.a, h.c.g):java.lang.Object");
    }
}
