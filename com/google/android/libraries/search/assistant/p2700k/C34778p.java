package com.google.android.libraries.search.assistant.p2700k;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.k.p */
/* compiled from: PG */
public final class C34778p {

    /* renamed from: c */
    private static final C59071e f92290c = C59071e.m91331h();

    /* renamed from: a */
    public final C34761b f92291a;

    /* renamed from: b */
    public final Set f92292b;

    /* renamed from: d */
    private final C34786x f92293d;

    /* renamed from: e */
    private final AccountId f92294e;

    /* renamed from: f */
    private final C46175b f92295f;

    /* renamed from: g */
    private final C34772j f92296g;

    public C34778p(C34786x xVar, AccountId accountId, C46175b bVar, C34761b bVar2, C34772j jVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        this.f92293d = xVar;
        this.f92294e = accountId;
        this.f92295f = bVar;
        this.f92291a = bVar2;
        this.f92296g = jVar;
        Set set = xVar.f92312a;
        if (!set.isEmpty()) {
            this.f92292b = set;
            return;
        }
        throw new IllegalStateException("GmsCore requires oauth scope to be provided.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39500a(com.google.frameworks.client.data.android.p4632a.C61333a r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.libraries.search.assistant.p2700k.C34774l
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.assistant.k.l r0 = (com.google.android.libraries.search.assistant.p2700k.C34774l) r0
            int r1 = r0.f92273g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f92273g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.k.l r0 = new com.google.android.libraries.search.assistant.k.l
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f92271e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f92273g
            java.lang.String r3 = "account.id()"
            java.lang.String r4 = "google"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r6) goto L_0x0041
            if (r2 != r5) goto L_0x0039
            java.lang.Object r10 = r0.f92270d
            java.lang.Object r2 = r0.f92269c
            java.lang.Object r4 = r0.f92268b
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r6 = r0.f92267a
            p5462h.C69714l.m101134b(r11)
            goto L_0x010d
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0041:
            java.lang.Object r10 = r0.f92268b
            com.google.android.libraries.search.assistant.k.b.c r10 = (com.google.android.libraries.search.assistant.p2700k.p2702b.C34764c) r10
            java.lang.Object r2 = r0.f92267a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0075
        L_0x004b:
            p5462h.C69714l.m101134b(r11)
            java.lang.String r10 = r10.mo57904e()
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r4)
            if (r10 == 0) goto L_0x0118
            com.google.android.libraries.search.assistant.k.x r10 = r9.f92293d
            com.google.android.libraries.search.assistant.k.b.c r10 = r10.f92314c
            com.google.apps.tiktok.account.data.b r11 = r9.f92295f
            com.google.common.util.concurrent.cx r11 = r11.mo50248e()
            java.lang.String r2 = "accountDataService.enabledAccounts"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            r0.f92267a = r9
            r0.f92268b = r10
            r0.f92273g = r6
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r2 = r9
        L_0x0075:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L_0x007b
            h.a.am r11 = p5462h.p5463a.C69496am.f185918a
        L_0x007b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0084:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r11.next()
            r8 = r7
            com.google.apps.tiktok.account.data.a r8 = (com.google.apps.tiktok.account.data.C46108a) r8
            com.google.apps.tiktok.account.data.j r8 = r8.mo50210b()
            java.lang.String r8 = r8.f121165j
            boolean r8 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r4)
            if (r8 == 0) goto L_0x0084
            r6.add(r7)
            goto L_0x0084
        L_0x00a1:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r4 = r6.iterator()
        L_0x00aa:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00d3
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.google.apps.tiktok.account.data.a r7 = (com.google.apps.tiktok.account.data.C46108a) r7
            r8 = r10
            com.google.android.libraries.search.assistant.k.b.b r8 = (com.google.android.libraries.search.assistant.p2700k.p2702b.C34763b) r8
            h.f.a.l r8 = r8.f92247a
            com.google.apps.tiktok.account.AccountId r7 = r7.mo50209a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            java.lang.Object r7 = r8.mo5761a(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00aa
            r11.add(r6)
            goto L_0x00aa
        L_0x00d3:
            java.util.ArrayList r10 = new java.util.ArrayList
            r4 = 10
            int r4 = p5462h.p5463a.C69540x.m100804k(r11, r4)
            r10.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
            r6 = r2
            r2 = r11
        L_0x00e4:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0115
            java.lang.Object r11 = r2.next()
            com.google.apps.tiktok.account.data.a r11 = (com.google.apps.tiktok.account.data.C46108a) r11
            r4 = r6
            com.google.android.libraries.search.assistant.k.p r4 = (com.google.android.libraries.search.assistant.p2700k.C34778p) r4
            com.google.android.libraries.search.assistant.k.j r4 = r4.f92296g
            com.google.apps.tiktok.account.AccountId r11 = r11.mo50209a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)
            r0.f92267a = r6
            r0.f92268b = r10
            r0.f92269c = r2
            r0.f92270d = r10
            r0.f92273g = r5
            java.lang.Object r11 = r4.mo39496a(r11, r0)
            if (r11 == r1) goto L_0x0114
            r4 = r10
        L_0x010d:
            com.google.frameworks.client.data.android.a.a r11 = (com.google.frameworks.client.data.android.p4632a.C61333a) r11
            r10.add(r11)
            r10 = r4
            goto L_0x00e4
        L_0x0114:
            return r1
        L_0x0115:
            java.util.List r10 = (java.util.List) r10
            goto L_0x011a
        L_0x0118:
            h.a.am r10 = p5462h.p5463a.C69496am.f185918a
        L_0x011a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2700k.C34778p.mo39500a(com.google.frameworks.client.data.android.a.a, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39501b(com.google.frameworks.client.data.android.p4632a.C61333a r19, p5462h.p5466c.C69577g r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.google.android.libraries.search.assistant.p2700k.C34775m
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.libraries.search.assistant.k.m r2 = (com.google.android.libraries.search.assistant.p2700k.C34775m) r2
            int r3 = r2.f92277d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f92277d = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.k.m r2 = new com.google.android.libraries.search.assistant.k.m
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f92275b
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f92277d
            r5 = 1
            if (r4 == 0) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            java.lang.Object r2 = r2.f92274a
            p5462h.C69714l.m101134b(r1)
            goto L_0x0106
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            p5462h.C69714l.m101134b(r1)
            com.google.android.libraries.search.assistant.k.x r1 = r0.f92293d
            j$.time.Duration r1 = r1.f92313b
            int r4 = p5462h.p5484n.C69779a.f186156a
            long r6 = r1.getSeconds()
            h.n.d r4 = p5462h.p5484n.C69782d.SECONDS
            long r6 = p5462h.p5484n.C69781c.m101248c(r6, r4)
            int r1 = r1.getNano()
            h.n.d r4 = p5462h.p5484n.C69782d.NANOSECONDS
            long r8 = p5462h.p5484n.C69781c.m101247b(r1, r4)
            boolean r1 = p5462h.p5484n.C69779a.m101242f(r6)
            if (r1 == 0) goto L_0x0070
            boolean r1 = p5462h.p5484n.C69779a.m101239c(r8)
            if (r1 != 0) goto L_0x00ee
            long r8 = r8 ^ r6
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 < 0) goto L_0x0068
            goto L_0x00ee
        L_0x0068:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Summing infinite durations of different signs yields an undefined result."
            r1.<init>(r2)
            throw r1
        L_0x0070:
            boolean r1 = p5462h.p5484n.C69779a.m101242f(r8)
            if (r1 == 0) goto L_0x0079
            r6 = r8
            goto L_0x00ee
        L_0x0079:
            int r1 = (int) r6
            r1 = r1 & r5
            int r4 = (int) r8
            r4 = r4 & r5
            if (r1 != r4) goto L_0x00db
            long r10 = r6 >> r5
            long r8 = r8 >> r5
            long r12 = r10 + r8
            boolean r1 = p5462h.p5484n.C69779a.m101241e(r6)
            r6 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 == 0) goto L_0x00ac
            h.j.f r1 = new h.j.f
            r8 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r10 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r1.<init>(r8, r10)
            boolean r1 = r1.mo61422b(r12)
            if (r1 == 0) goto L_0x00a6
            long r12 = r12 + r12
            int r1 = p5462h.p5484n.C69780b.f186159a
            goto L_0x00d9
        L_0x00a6:
            long r12 = r12 / r6
            long r12 = p5462h.p5484n.C69781c.m101246a(r12)
            goto L_0x00d9
        L_0x00ac:
            h.j.f r1 = new h.j.f
            r8 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r10 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r1.<init>(r8, r10)
            boolean r1 = r1.mo61422b(r12)
            if (r1 == 0) goto L_0x00c7
            long r12 = r12 * r6
            long r12 = r12 + r12
            int r1 = p5462h.p5484n.C69780b.f186159a
            goto L_0x00d9
        L_0x00c7:
            r14 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r16 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r6 = p5462h.p5480j.C69699g.m101120b(r12, r14, r16)
            long r12 = p5462h.p5484n.C69781c.m101246a(r6)
        L_0x00d9:
            r6 = r12
            goto L_0x00ee
        L_0x00db:
            boolean r1 = p5462h.p5484n.C69779a.m101240d(r6)
            if (r1 == 0) goto L_0x00e8
            long r6 = r6 >> r5
            long r8 = r8 >> r5
            long r6 = p5462h.p5484n.C69779a.m101243g(r6, r8)
            goto L_0x00ee
        L_0x00e8:
            long r8 = r8 >> r5
            long r6 = r6 >> r5
            long r6 = p5462h.p5484n.C69779a.m101243g(r8, r6)
        L_0x00ee:
            com.google.android.libraries.search.assistant.k.n r1 = new com.google.android.libraries.search.assistant.k.n
            r4 = 0
            r8 = r19
            r1.<init>(r0, r8, r4)
            r2.f92274a = r0
            r2.f92277d = r5
            long r4 = kotlinx.coroutines.C71608bi.m104549a(r6)
            java.lang.Object r1 = kotlinx.coroutines.C71745ea.m104929a(r4, r1, r2)
            if (r1 != r3) goto L_0x0105
            return r3
        L_0x0105:
            r2 = r0
        L_0x0106:
            com.google.frameworks.client.data.android.a.h r1 = (com.google.frameworks.client.data.android.p4632a.C61347h) r1
            com.google.android.libraries.search.assistant.k.a r3 = com.google.android.libraries.search.assistant.p2700k.C34757a.PERSONAL
            com.google.android.libraries.search.assistant.k.p r2 = (com.google.android.libraries.search.assistant.p2700k.C34778p) r2
            java.util.Set r2 = r2.f92292b
            com.google.android.libraries.search.assistant.k.k r4 = new com.google.android.libraries.search.assistant.k.k
            r4.<init>(r1, r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2700k.C34778p.mo39501b(com.google.frameworks.client.data.android.a.a, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39502c(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.libraries.search.assistant.p2700k.C34777o
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.assistant.k.o r0 = (com.google.android.libraries.search.assistant.p2700k.C34777o) r0
            int r1 = r0.f92289i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f92289i = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.k.o r0 = new com.google.android.libraries.search.assistant.k.o
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f92287g
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f92289i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r2 = r0.f92286f
            java.lang.Object r4 = r0.f92285e
            java.lang.Object r5 = r0.f92284d
            java.lang.Object r6 = r0.f92283c
            java.lang.Object r7 = r0.f92282b
            java.lang.Object r8 = r0.f92281a
            p5462h.C69714l.m101134b(r11)
            goto L_0x00c9
        L_0x003a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0042:
            java.lang.Object r2 = r0.f92282b
            java.lang.Object r4 = r0.f92281a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0077
        L_0x004a:
            java.lang.Object r2 = r0.f92281a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0062
        L_0x0050:
            p5462h.C69714l.m101134b(r11)
            com.google.android.libraries.search.assistant.k.j r11 = r10.f92296g
            com.google.apps.tiktok.account.AccountId r2 = r10.f92294e
            r0.f92281a = r10
            r0.f92289i = r5
            java.lang.Object r11 = r11.mo39496a(r2, r0)
            if (r11 == r1) goto L_0x00fe
            r2 = r10
        L_0x0062:
            com.google.frameworks.client.data.android.a.a r11 = (com.google.frameworks.client.data.android.p4632a.C61333a) r11
            r0.f92281a = r2
            r0.f92282b = r11
            r0.f92289i = r4
            r4 = r2
            com.google.android.libraries.search.assistant.k.p r4 = (com.google.android.libraries.search.assistant.p2700k.C34778p) r4
            java.lang.Object r4 = r4.mo39500a(r11, r0)
            if (r4 == r1) goto L_0x00fe
            r9 = r2
            r2 = r11
            r11 = r4
            r4 = r9
        L_0x0077:
            java.util.List r11 = (java.util.List) r11
            com.google.common.f.e r5 = f92290c
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 50641(0xc5d1, float:7.0963E-41)
            r6.<init>(r7)
            r5.mo56379ah(r6)
            java.lang.String r6 = "Providing credentials for %s; the primary is %s."
            r5.mo56354G(r6, r11, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = p5462h.p5463a.C69540x.m100804k(r11, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r11.iterator()
            r7 = r2
            r8 = r4
            r2 = r5
            r4 = r6
            r6 = r11
        L_0x00a5:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00d1
            java.lang.Object r11 = r4.next()
            com.google.frameworks.client.data.android.a.a r11 = (com.google.frameworks.client.data.android.p4632a.C61333a) r11
            r0.f92281a = r8
            r0.f92282b = r7
            r0.f92283c = r6
            r0.f92284d = r2
            r0.f92285e = r4
            r0.f92286f = r2
            r0.f92289i = r3
            r5 = r8
            com.google.android.libraries.search.assistant.k.p r5 = (com.google.android.libraries.search.assistant.p2700k.C34778p) r5
            java.lang.Object r11 = r5.mo39501b(r11, r0)
            if (r11 == r1) goto L_0x00d0
            r5 = r2
        L_0x00c9:
            com.google.android.libraries.search.assistant.k.k r11 = (com.google.android.libraries.search.assistant.p2700k.C34773k) r11
            r2.add(r11)
            r2 = r5
            goto L_0x00a5
        L_0x00d0:
            return r1
        L_0x00d1:
            java.util.Iterator r11 = r6.iterator()
            r0 = 0
        L_0x00d6:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00f7
            java.lang.Object r1 = r11.next()
            com.google.frameworks.client.data.android.a.a r1 = (com.google.frameworks.client.data.android.p4632a.C61333a) r1
            r3 = r7
            com.google.frameworks.client.data.android.a.a r3 = (com.google.frameworks.client.data.android.p4632a.C61333a) r3
            java.lang.String r3 = r3.mo57903d()
            java.lang.String r1 = r1.mo57903d()
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r1)
            if (r1 == 0) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            int r0 = r0 + 1
            goto L_0x00d6
        L_0x00f7:
            r0 = -1
        L_0x00f8:
            com.google.android.libraries.search.assistant.k.r r11 = new com.google.android.libraries.search.assistant.k.r
            r11.<init>(r2, r0)
            return r11
        L_0x00fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2700k.C34778p.mo39502c(h.c.g):java.lang.Object");
    }
}
