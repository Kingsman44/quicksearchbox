package com.google.android.apps.search.googleapp.discover.p10249z;

import android.content.Context;
import com.google.android.apps.gsa.sidekick.main.p7214j.p7215a.C91445b;
import com.google.android.apps.search.googleapp.discover.p10199k.C134455a;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.gms.common.C143875g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.au */
/* compiled from: PG */
public final class C135314au {

    /* renamed from: a */
    public final C135200t f368651a;

    /* renamed from: b */
    public final C135335bi f368652b;

    /* renamed from: c */
    public final C135356m f368653c;

    /* renamed from: d */
    public final C135298ae f368654d;

    /* renamed from: e */
    public final C69585o f368655e;

    /* renamed from: f */
    private final C46175b f368656f;

    /* renamed from: g */
    private final AccountId f368657g;

    /* renamed from: h */
    private final C134455a f368658h;

    /* renamed from: i */
    private final C135337c f368659i;

    /* renamed from: j */
    private final C143875g f368660j;

    /* renamed from: k */
    private final Context f368661k;

    /* renamed from: l */
    private final C91445b f368662l;

    public C135314au(C46175b bVar, AccountId accountId, C91445b bVar2, C135200t tVar, C135335bi biVar, C135356m mVar, C134455a aVar, C135337c cVar, C143875g gVar, Context context, C135298ae aeVar, C69585o oVar, C71422aw awVar) {
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar2, "discoverEnabledReader");
        C69664n.m101061g(mVar, "paginationRequester");
        C69664n.m101061g(gVar, "googleApiAvailability");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f368656f = bVar;
        this.f368657g = accountId;
        this.f368662l = bVar2;
        this.f368651a = tVar;
        this.f368652b = biVar;
        this.f368653c = mVar;
        this.f368658h = aVar;
        this.f368659i = cVar;
        this.f368660j = gVar;
        this.f368661k = context;
        this.f368654d = aeVar;
        this.f368655e = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112252a(java.lang.String r9, java.lang.String r10, int r11, com.google.android.apps.search.googleapp.discover.p10249z.C135327ba r12, p3186j$.time.Instant r13, com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q r14, p5462h.p5466c.C69577g r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135306am
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.apps.search.googleapp.discover.z.am r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135306am) r0
            int r1 = r0.f368617d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368617d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.am r0 = new com.google.android.apps.search.googleapp.discover.z.am
            r0.<init>(r8, r15)
        L_0x0018:
            r7 = r0
            java.lang.Object r15 = r7.f368615b
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f368617d
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            java.lang.Object r10 = r7.f368614a
            p5462h.C69714l.m101134b(r15)
            goto L_0x0046
        L_0x002a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0032:
            p5462h.C69714l.m101134b(r15)
            r7.f368614a = r10
            r7.f368617d = r2
            com.google.android.apps.search.googleapp.discover.z.bi r1 = r8.f368652b
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r15 = r1.mo112270d(r2, r3, r4, r5, r6, r7)
            if (r15 == r0) goto L_0x0059
        L_0x0046:
            com.google.android.apps.search.googleapp.discover.z.az r15 = (com.google.android.apps.search.googleapp.discover.p10249z.C135319az) r15
            com.google.android.apps.search.googleapp.discover.z.ab r9 = r15.f368672c
            java.lang.String r9 = r9.f368545d
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r10)
            if (r9 == 0) goto L_0x0053
            return r15
        L_0x0053:
            com.google.android.apps.search.googleapp.discover.z.a.h r9 = new com.google.android.apps.search.googleapp.discover.z.a.h
            r9.<init>()
            throw r9
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135314au.mo112252a(java.lang.String, java.lang.String, int, com.google.android.apps.search.googleapp.discover.z.ba, j$.time.Instant, com.google.android.apps.search.googleapp.discover.streamui.h.q, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo112253b(C135050dx dxVar, C134766q qVar, C69577g gVar) {
        return C71803m.m105040a(this.f368655e, new C135310aq(this, qVar, dxVar, (C69577g) null), gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.apps.search.googleapp.discover.z.au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: h.f.a.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011b A[PHI: r13 
      PHI: (r13v2 java.lang.Object) = (r13v7 java.lang.Object), (r13v1 java.lang.Object) binds: [B:42:0x0118, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112254c(com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q r11, p5462h.p5473f.p5474a.C69630p r12, p5462h.p5466c.C69577g r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135311ar
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.googleapp.discover.z.ar r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135311ar) r0
            int r1 = r0.f368642f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368642f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.ar r0 = new com.google.android.apps.search.googleapp.discover.z.ar
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f368640d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368642f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r6) goto L_0x0049
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0039
            if (r2 == r3) goto L_0x0034
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0034:
            p5462h.C69714l.m101134b(r13)
            goto L_0x00fb
        L_0x0039:
            p5462h.C69714l.m101134b(r13)
            goto L_0x011b
        L_0x003e:
            java.lang.Object r11 = r0.f368639c
            java.lang.Object r12 = r0.f368638b
            java.lang.Object r2 = r0.f368637a
            p5462h.C69714l.m101134b(r13)
            goto L_0x00bf
        L_0x0049:
            java.lang.Object r12 = r0.f368639c
            java.lang.Object r11 = r0.f368638b
            java.lang.Object r2 = r0.f368637a
            p5462h.C69714l.m101134b(r13)
            goto L_0x007f
        L_0x0053:
            p5462h.C69714l.m101134b(r13)
            com.google.android.gms.common.g r13 = r10.f368660j
            android.content.Context r2 = r10.f368661k
            r7 = 12600000(0xc042c0, float:1.765636E-38)
            int r13 = r13.mo119362j(r2, r7)
            if (r13 != 0) goto L_0x011d
            com.google.apps.tiktok.account.data.b r13 = r10.f368656f
            com.google.apps.tiktok.account.AccountId r2 = r10.f368657g
            com.google.common.util.concurrent.cx r13 = r13.mo50246c(r2)
            java.lang.String r2 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            r0.f368637a = r10
            r0.f368638b = r11
            r0.f368639c = r12
            r0.f368642f = r6
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x011c
            r2 = r10
        L_0x007f:
            com.google.apps.tiktok.account.data.a r13 = (com.google.apps.tiktok.account.data.C46108a) r13
            r6 = r2
            com.google.android.apps.search.googleapp.discover.z.au r6 = (com.google.android.apps.search.googleapp.discover.p10249z.C135314au) r6
            com.google.android.apps.search.googleapp.discover.k.a r7 = r6.f368658h
            boolean r7 = r7.mo111786a()
            if (r7 != 0) goto L_0x00a8
            java.lang.String r7 = "account"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.apps.tiktok.account.data.j r13 = r13.mo50210b()
            java.lang.String r13 = r13.f121165j
            java.lang.String r7 = "pseudonymous"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r7)
            if (r13 != 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            com.google.android.apps.search.googleapp.discover.z.a.e r11 = new com.google.android.apps.search.googleapp.discover.z.a.e
            com.google.android.apps.search.googleapp.discover.z.a.c r12 = com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135279c.f368527a
            r11.<init>(r12)
            throw r11
        L_0x00a8:
            com.google.android.apps.gsa.sidekick.main.j.a.b r13 = r6.f368662l
            com.google.common.util.concurrent.cx r13 = r13.mo85803a()
            r0.f368637a = r2
            r0.f368638b = r11
            r0.f368639c = r12
            r0.f368642f = r5
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x011c
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x00bf:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            java.lang.String r5 = "isDiscoverEnabled"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r5)
            boolean r13 = r13.booleanValue()
            r5 = 0
            if (r13 != 0) goto L_0x0103
            r13 = r2
            com.google.android.apps.search.googleapp.discover.z.au r13 = (com.google.android.apps.search.googleapp.discover.p10249z.C135314au) r13
            com.google.android.apps.search.googleapp.discover.z.c r6 = r13.f368659i
            com.google.protobuf.cj r7 = new com.google.protobuf.cj
            com.google.protobuf.ch r6 = r6.f368736a
            com.google.protobuf.ci r8 = com.google.android.apps.search.googleapp.discover.p10249z.C135337c.f368733b
            r7.<init>(r6, r8)
            com.google.android.apps.search.googleapp.discover.streamui.h.q r12 = (com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q) r12
            com.google.android.apps.search.googleapp.discover.streamui.h.g r6 = r12.f366953b
            com.google.bv.e.m r6 = r6.f366935i
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x00e8
            goto L_0x0103
        L_0x00e8:
            com.google.android.apps.search.googleapp.discover.v.t r11 = r13.f368651a
            com.google.android.apps.search.googleapp.discover.streamui.h.f r12 = r12.f366954c
            r0.f368637a = r5
            r0.f368638b = r5
            r0.f368639c = r5
            r0.f368642f = r3
            java.lang.Object r11 = r11.mo112155c(r12, r0)
            if (r11 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            com.google.android.apps.search.googleapp.discover.z.a.e r11 = new com.google.android.apps.search.googleapp.discover.z.a.e
            com.google.android.apps.search.googleapp.discover.z.a.a r12 = com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135277a.f368525a
            r11.<init>(r12)
            throw r11
        L_0x0103:
            com.google.android.apps.search.googleapp.discover.z.au r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135314au) r2
            h.c.o r12 = r2.f368655e
            com.google.android.apps.search.googleapp.discover.z.as r13 = new com.google.android.apps.search.googleapp.discover.z.as
            r13.<init>(r11, r5)
            r0.f368637a = r5
            r0.f368638b = r5
            r0.f368639c = r5
            r0.f368642f = r4
            java.lang.Object r13 = kotlinx.coroutines.C71803m.m105040a(r12, r13, r0)
            if (r13 != r1) goto L_0x011b
            return r1
        L_0x011b:
            return r13
        L_0x011c:
            return r1
        L_0x011d:
            com.google.android.apps.search.googleapp.discover.z.a.e r11 = new com.google.android.apps.search.googleapp.discover.z.a.e
            com.google.android.apps.search.googleapp.discover.z.a.b r12 = new com.google.android.apps.search.googleapp.discover.z.a.b
            r12.<init>(r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135314au.mo112254c(com.google.android.apps.search.googleapp.discover.streamui.h.q, h.f.a.p, h.c.g):java.lang.Object");
    }
}
