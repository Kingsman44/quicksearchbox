package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134216e;
import com.google.android.apps.search.googleapp.discover.p10181d.C134217f;
import com.google.android.apps.search.googleapp.discover.p10199k.C134455a;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.android.libraries.search.p2992d.C38299j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59071e;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj;
import com.google.protobuf.C62921ba;
import java.util.UUID;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.bl */
/* compiled from: PG */
public final class C134980bl {

    /* renamed from: f */
    private static final C59071e f367548f = C59071e.m91331h();

    /* renamed from: a */
    public final String f367549a;

    /* renamed from: b */
    public final C134217f f367550b;

    /* renamed from: c */
    public final C134983bo f367551c;

    /* renamed from: d */
    public final C69585o f367552d;

    /* renamed from: e */
    public final C134941ab f367553e;

    /* renamed from: g */
    private final AccountId f367554g;

    /* renamed from: h */
    private final C46175b f367555h;

    /* renamed from: i */
    private final C134455a f367556i;

    /* renamed from: j */
    private final C38299j f367557j;

    /* renamed from: k */
    private final C39143kr f367558k;

    public C134980bl(C134942ac acVar, String str, C134217f fVar, C134983bo boVar, C69585o oVar, AccountId accountId, C46175b bVar, C134455a aVar, C38299j jVar, C39143kr krVar) {
        C69664n.m101061g(fVar, "delegatingFeedRequestLoggerFactory");
        C69664n.m101061g(boVar, "feedClientDebuggable");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(krVar, "clientStreamz");
        this.f367549a = str;
        this.f367550b = fVar;
        this.f367551c = boVar;
        this.f367552d = oVar;
        this.f367554g = accountId;
        this.f367555h = bVar;
        this.f367556i = aVar;
        this.f367557j = jVar;
        this.f367558k = krVar;
        C57309dj djVar = C57309dj.f152970a;
        C61531o oVar2 = (C61531o) acVar.f367402a.mo17428b();
        oVar2.getClass();
        C62921ba baVar = (C62921ba) acVar.f367403b.mo17428b();
        baVar.getClass();
        C69585o oVar3 = (C69585o) acVar.f367404c.mo17428b();
        oVar3.getClass();
        C32221c cVar = (C32221c) acVar.f367405d.mo17428b();
        cVar.getClass();
        C135101fu fuVar = (C135101fu) acVar.f367406e.mo17428b();
        fuVar.getClass();
        djVar.getClass();
        this.f367553e = new C134941ab(oVar2, baVar, oVar3, cVar, fuVar, djVar);
    }

    /* renamed from: a */
    public final Object mo112097a(C57303dd ddVar, String str, UUID uuid, C57259bn bnVar, C69577g gVar) {
        return C71803m.m105040a(this.f367552d, new C134972bd(this, uuid, bnVar, ddVar, str, (C69577g) null), gVar);
    }

    /* renamed from: b */
    public final Object mo112098b(C57303dd ddVar, String str, C134216e eVar, C57259bn bnVar, C69577g gVar) {
        return C71803m.m105040a(this.f367552d, new C134974bf(this, eVar, str, bnVar, ddVar, (C69577g) null), gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112099c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C134975bg
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.discover.u.bg r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134975bg) r0
            int r1 = r0.f367528d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f367528d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.bg r0 = new com.google.android.apps.search.googleapp.discover.u.bg
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f367526b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f367528d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f367525a
            p5462h.C69714l.m101134b(r5)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.apps.tiktok.account.data.b r5 = r4.f367555h
            com.google.apps.tiktok.account.AccountId r2 = r4.f367554g
            com.google.common.util.concurrent.cx r5 = r5.mo50246c(r2)
            java.lang.String r2 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f367525a = r4
            r0.f367528d = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x006f
            r0 = r4
        L_0x004c:
            com.google.apps.tiktok.account.data.a r5 = (com.google.apps.tiktok.account.data.C46108a) r5
            com.google.apps.tiktok.account.data.j r5 = r5.mo50210b()
            java.lang.String r5 = r5.f121165j
            java.lang.String r1 = "google"
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r5)
            if (r5 == 0) goto L_0x005f
            com.google.android.apps.search.googleapp.discover.u.bc r5 = com.google.android.apps.search.googleapp.discover.p10238u.C134971bc.USER_SIGNED_IN
            return r5
        L_0x005f:
            com.google.android.apps.search.googleapp.discover.u.bl r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r0
            com.google.android.apps.search.googleapp.discover.k.a r5 = r0.f367556i
            boolean r5 = r5.mo111786a()
            if (r5 == 0) goto L_0x006c
            com.google.android.apps.search.googleapp.discover.u.bc r5 = com.google.android.apps.search.googleapp.discover.p10238u.C134971bc.USER_SIGNED_OUT_SIGNED_OUT_FEED_ENABLED
            goto L_0x006e
        L_0x006c:
            com.google.android.apps.search.googleapp.discover.u.bc r5 = com.google.android.apps.search.googleapp.discover.p10238u.C134971bc.USER_SIGNED_OUT_SIGNED_OUT_FEED_DISABLED
        L_0x006e:
            return r5
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C134980bl.mo112099c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112100d(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C134976bh
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.discover.u.bh r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134976bh) r0
            int r1 = r0.f367532d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f367532d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.bh r0 = new com.google.android.apps.search.googleapp.discover.u.bh
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f367530b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f367532d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f367529a
            p5462h.C69714l.m101134b(r5)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.d.j r5 = r4.f367557j
            com.google.common.util.concurrent.cx r5 = r5.mo17428b()
            r0.f367529a = r4
            r0.f367532d = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x0077
            r0 = r4
        L_0x0045:
            com.google.common.base.ax r5 = (com.google.common.base.C58833ax) r5
            java.lang.Object r5 = r5.mo56111f()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0050
            return r5
        L_0x0050:
            com.google.common.f.e r5 = f367548f
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 40395(0x9dcb, float:5.6605E-41)
            r1.<init>(r2)
            r5.mo56379ah(r1)
            java.lang.String r1 = "AuthHeader is absent for signed in user"
            r5.mo56386p(r1)
            com.google.android.apps.search.googleapp.discover.u.bl r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r0
            com.google.android.libraries.search.logging.d.kr r5 = r0.f367558k
            java.lang.String r0 = "FEED"
            r5.mo41719h(r0)
            com.google.android.apps.search.googleapp.discover.u.b.a r5 = new com.google.android.apps.search.googleapp.discover.u.b.a
            r5.<init>()
            throw r5
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C134980bl.mo112100d(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.google.android.apps.search.googleapp.discover.u.bb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.bv.e.b.c.a.dd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.apps.search.googleapp.discover.u.bl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.google.android.apps.search.googleapp.discover.u.bl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.google.bv.e.b.c.a.dd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.google.android.apps.search.googleapp.discover.u.bb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.google.android.apps.search.googleapp.discover.u.bb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.google.bv.e.b.c.a.dd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: com.google.android.apps.search.googleapp.discover.u.bl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112101e(com.google.android.apps.search.googleapp.discover.p10238u.C135109h r8, com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd r9, java.lang.String r10, com.google.android.apps.search.googleapp.discover.p10238u.C134970bb r11, p5462h.p5466c.C69577g r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C134977bi
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.googleapp.discover.u.bi r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134977bi) r0
            int r1 = r0.f367539g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f367539g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.bi r0 = new com.google.android.apps.search.googleapp.discover.u.bi
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.f367537e
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f367539g
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0041
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            p5462h.C69714l.m101134b(r12)
            goto L_0x00b2
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            java.lang.Object r11 = r6.f367536d
            java.lang.Object r10 = r6.f367535c
            java.lang.Object r9 = r6.f367534b
            java.lang.Object r8 = r6.f367533a
            p5462h.C69714l.m101134b(r12)
            goto L_0x008f
        L_0x0041:
            p5462h.C69714l.m101134b(r12)
            boolean r8 = r8 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C135080f
            if (r8 != 0) goto L_0x0066
            com.google.common.f.e r8 = f367548f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r10 = 40397(0x9dcd, float:5.6608E-41)
            r9.<init>(r10)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Server requested signed out user to refresh auth."
            r8.mo56386p(r9)
            com.google.android.libraries.search.logging.d.kr r8 = r7.f367558k
            r8.mo41725n(r3)
            return r4
        L_0x0066:
            com.google.common.f.e r8 = f367548f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r12 = new com.google.common.f.n
            r1 = 40396(0x9dcc, float:5.6607E-41)
            r12.<init>(r1)
            r8.mo56379ah(r12)
            java.lang.String r12 = "Server requested auth refresh. Refreshing authentication and retrying request."
            r8.mo56386p(r12)
            r6.f367533a = r7
            r6.f367534b = r9
            r6.f367535c = r10
            r6.f367536d = r11
            r6.f367539g = r3
            java.lang.Object r12 = r7.mo112103g(r6)
            if (r12 == r0) goto L_0x00b3
            r8 = r7
        L_0x008f:
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0095
            return r4
        L_0x0095:
            r6.f367533a = r4
            r6.f367534b = r4
            r6.f367535c = r4
            r6.f367536d = r4
            r6.f367539g = r2
            r1 = r8
            com.google.android.apps.search.googleapp.discover.u.bl r1 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r1
            r2 = r9
            com.google.bv.e.b.c.a.dd r2 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd) r2
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            r4 = r11
            com.google.android.apps.search.googleapp.discover.u.bb r4 = (com.google.android.apps.search.googleapp.discover.p10238u.C134970bb) r4
            java.lang.Object r12 = r1.mo112102f(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L_0x00b2
            return r0
        L_0x00b2:
            return r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C134980bl.mo112101e(com.google.android.apps.search.googleapp.discover.u.h, com.google.bv.e.b.c.a.dd, java.lang.String, com.google.android.apps.search.googleapp.discover.u.bb, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ Exception -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[Catch:{ Exception -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112102f(com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd r9, java.lang.String r10, com.google.android.apps.search.googleapp.discover.p10238u.C134970bb r11, java.lang.String r12, p5462h.p5466c.C69577g r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C134978bj
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.googleapp.discover.u.bj r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134978bj) r0
            int r1 = r0.f367543d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f367543d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.bj r0 = new com.google.android.apps.search.googleapp.discover.u.bj
            r0.<init>(r8, r13)
        L_0x0018:
            r7 = r0
            java.lang.Object r13 = r7.f367541b
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f367543d
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            java.lang.Object r9 = r7.f367540a
            p5462h.C69714l.m101134b(r13)     // Catch:{ Exception -> 0x002a }
            goto L_0x0050
        L_0x002a:
            r10 = move-exception
            goto L_0x00a1
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            p5462h.C69714l.m101134b(r13)
            com.google.android.apps.search.googleapp.discover.u.ab r1 = r8.f367553e     // Catch:{ Exception -> 0x009e }
            java.lang.String r3 = r8.f367549a     // Catch:{ Exception -> 0x009e }
            com.google.android.apps.search.googleapp.discover.u.f r6 = new com.google.android.apps.search.googleapp.discover.u.f     // Catch:{ Exception -> 0x009e }
            r6.<init>(r12)     // Catch:{ Exception -> 0x009e }
            r7.f367540a = r8     // Catch:{ Exception -> 0x009e }
            r7.f367543d = r2     // Catch:{ Exception -> 0x009e }
            r2 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r13 = r1.mo112082a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x009e }
            if (r13 != r0) goto L_0x004f
            return r0
        L_0x004f:
            r9 = r8
        L_0x0050:
            com.google.android.apps.search.googleapp.discover.u.fv r13 = (com.google.android.apps.search.googleapp.discover.p10238u.C135102fv) r13     // Catch:{ Exception -> 0x002a }
            com.google.protobuf.MessageLite r10 = r13.f367969a     // Catch:{ Exception -> 0x002a }
            com.google.bv.e.b.c.a.dj r10 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj) r10     // Catch:{ Exception -> 0x002a }
            boolean r11 = r13.f367970b     // Catch:{ Exception -> 0x002a }
            if (r11 == 0) goto L_0x007c
            com.google.common.f.e r11 = f367548f     // Catch:{ Exception -> 0x002a }
            com.google.common.f.x r11 = r11.mo56226d()     // Catch:{ Exception -> 0x002a }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ Exception -> 0x002a }
            java.lang.String r12 = "Second request still had auth header."
            com.google.common.f.n r13 = new com.google.common.f.n     // Catch:{ Exception -> 0x002a }
            r0 = 40400(0x9dd0, float:5.6612E-41)
            r13.<init>(r0)     // Catch:{ Exception -> 0x002a }
            r11.mo56379ah(r13)     // Catch:{ Exception -> 0x002a }
            r11.mo56386p(r12)     // Catch:{ Exception -> 0x002a }
            r11 = r9
            com.google.android.apps.search.googleapp.discover.u.bl r11 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r11     // Catch:{ Exception -> 0x002a }
            com.google.android.libraries.search.logging.d.kr r11 = r11.f367558k     // Catch:{ Exception -> 0x002a }
            r12 = 5
            r11.mo41725n(r12)     // Catch:{ Exception -> 0x002a }
            goto L_0x00c8
        L_0x007c:
            com.google.common.f.e r11 = f367548f     // Catch:{ Exception -> 0x002a }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ Exception -> 0x002a }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ Exception -> 0x002a }
            java.lang.String r12 = "Second request succeeded with no auth header."
            com.google.common.f.n r13 = new com.google.common.f.n     // Catch:{ Exception -> 0x002a }
            r0 = 40398(0x9dce, float:5.661E-41)
            r13.<init>(r0)     // Catch:{ Exception -> 0x002a }
            r11.mo56379ah(r13)     // Catch:{ Exception -> 0x002a }
            r11.mo56386p(r12)     // Catch:{ Exception -> 0x002a }
            r11 = r9
            com.google.android.apps.search.googleapp.discover.u.bl r11 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r11     // Catch:{ Exception -> 0x002a }
            com.google.android.libraries.search.logging.d.kr r11 = r11.f367558k     // Catch:{ Exception -> 0x002a }
            r12 = 6
            r11.mo41725n(r12)     // Catch:{ Exception -> 0x002a }
            goto L_0x00c8
        L_0x009e:
            r9 = move-exception
            r10 = r9
            r9 = r8
        L_0x00a1:
            com.google.common.f.e r11 = f367548f
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.x r10 = r11.mo56382g(r10)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.n r11 = new com.google.common.f.n
            r12 = 40399(0x9dcf, float:5.6611E-41)
            r11.<init>(r12)
            r10.mo56379ah(r11)
            java.lang.String r11 = "Second request failed."
            r10.mo56386p(r11)
            com.google.android.apps.search.googleapp.discover.u.bl r9 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r9
            com.google.android.libraries.search.logging.d.kr r9 = r9.f367558k
            r10 = 4
            r9.mo41725n(r10)
            r10 = 0
        L_0x00c8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C134980bl.mo112102f(com.google.bv.e.b.c.a.dd, java.lang.String, com.google.android.apps.search.googleapp.discover.u.bb, java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112103g(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C134979bk
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.discover.u.bk r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134979bk) r0
            int r1 = r0.f367547d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f367547d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.bk r0 = new com.google.android.apps.search.googleapp.discover.u.bk
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f367545b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f367547d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f367544a
            p5462h.C69714l.m101134b(r6)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0050
        L_0x0029:
            r6 = move-exception
            goto L_0x007e
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.d.j r6 = r5.f367557j     // Catch:{ Exception -> 0x007c }
            com.google.android.libraries.search.d.g r2 = r6.f101467a     // Catch:{ Exception -> 0x007c }
            java.util.Set r4 = r6.f101468b     // Catch:{ Exception -> 0x007c }
            com.google.common.util.concurrent.cx r2 = r2.mo41362a(r4, r3)     // Catch:{ Exception -> 0x007c }
            com.google.common.util.concurrent.cx r6 = r6.mo41364c(r2)     // Catch:{ Exception -> 0x007c }
            r0.f367544a = r5     // Catch:{ Exception -> 0x007c }
            r0.f367547d = r3     // Catch:{ Exception -> 0x007c }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ Exception -> 0x007c }
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r0 = r5
        L_0x0050:
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r6 = r6.mo56111f()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0029 }
            if (r6 != 0) goto L_0x00a5
            com.google.common.f.e r1 = f367548f     // Catch:{ Exception -> 0x0029 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ Exception -> 0x0029 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "Attempted refresh of auth header returned null."
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ Exception -> 0x0029 }
            r4 = 40401(0x9dd1, float:5.6614E-41)
            r3.<init>(r4)     // Catch:{ Exception -> 0x0029 }
            r1.mo56379ah(r3)     // Catch:{ Exception -> 0x0029 }
            r1.mo56386p(r2)     // Catch:{ Exception -> 0x0029 }
            r1 = r0
            com.google.android.apps.search.googleapp.discover.u.bl r1 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r1     // Catch:{ Exception -> 0x0029 }
            com.google.android.libraries.search.logging.d.kr r1 = r1.f367558k     // Catch:{ Exception -> 0x0029 }
            r2 = 3
            r1.mo41725n(r2)     // Catch:{ Exception -> 0x0029 }
            goto L_0x00a5
        L_0x007c:
            r6 = move-exception
            r0 = r5
        L_0x007e:
            com.google.common.f.e r1 = f367548f
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.x r6 = r1.mo56382g(r6)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 40402(0x9dd2, float:5.6615E-41)
            r1.<init>(r2)
            r6.mo56379ah(r1)
            java.lang.String r1 = "Attempted refresh of auth header failed."
            r6.mo56386p(r1)
            com.google.android.apps.search.googleapp.discover.u.bl r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134980bl) r0
            com.google.android.libraries.search.logging.d.kr r6 = r0.f367558k
            r0 = 2
            r6.mo41725n(r0)
            r6 = 0
        L_0x00a5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C134980bl.mo112103g(h.c.g):java.lang.Object");
    }
}
