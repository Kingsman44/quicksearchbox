package com.google.android.apps.search.googleapp.search.srp.p10435e;

import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.search.googleapp.p10533v.p10534a.C139853b;
import com.google.android.apps.search.googleapp.search.p10404a.C137389j;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.p10418j.C137531e;
import com.google.android.libraries.kids.p1982a.p1983a.C24030j;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.p3402d.C43758a;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43984e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.common.p4526f.p4527a.C58974d;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.x */
/* compiled from: PG */
public final class C137799x {

    /* renamed from: l */
    public static final /* synthetic */ int f374878l = 0;

    /* renamed from: m */
    private static final C58974d f374879m = C58974d.m91135i("BaselineRequestData");

    /* renamed from: a */
    public final Context f374880a;

    /* renamed from: b */
    public final boolean f374881b;

    /* renamed from: c */
    public final boolean f374882c;

    /* renamed from: d */
    public final C137389j f374883d;

    /* renamed from: e */
    public final C137396a f374884e;

    /* renamed from: f */
    public final C139853b f374885f;

    /* renamed from: g */
    public final C69585o f374886g;

    /* renamed from: h */
    public final C137531e f374887h;

    /* renamed from: i */
    public final C43758a f374888i;

    /* renamed from: j */
    public final C38553h f374889j;

    /* renamed from: k */
    public final C27683a f374890k;

    /* renamed from: n */
    private final AccountId f374891n;

    /* renamed from: o */
    private final C71422aw f374892o;

    /* renamed from: p */
    private final C46128f f374893p;

    /* renamed from: q */
    private final C24030j f374894q;

    /* renamed from: r */
    private final boolean f374895r;

    /* renamed from: s */
    private final C43984e f374896s;

    /* renamed from: t */
    private final C46401p f374897t;

    public C137799x(Context context, boolean z, boolean z2, C137389j jVar, AccountId accountId, C137396a aVar, C139853b bVar, C69585o oVar, C71422aw awVar, C46128f fVar, C24030j jVar2, boolean z3, C137531e eVar, InstanceStateStoreFactory instanceStateStoreFactory, C27683a aVar2, C43984e eVar2, C43758a aVar3, C38553h hVar) {
        AccountId accountId2 = accountId;
        C137396a aVar4 = aVar;
        C69585o oVar2 = oVar;
        C71422aw awVar2 = awVar;
        C46128f fVar2 = fVar;
        InstanceStateStoreFactory instanceStateStoreFactory2 = instanceStateStoreFactory;
        C27683a aVar5 = aVar2;
        C38553h hVar2 = hVar;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId2, "accountId");
        C69664n.m101061g(aVar4, "agsaClassicSearchData");
        C69664n.m101061g(oVar2, "backgroundContext");
        C69664n.m101061g(awVar2, "lightweightScope");
        C69664n.m101061g(fVar2, "gcoreAccountName");
        C69664n.m101061g(instanceStateStoreFactory2, "instanceStateStoreFactory");
        C69664n.m101061g(aVar5, "lensEligibilityChecker");
        C69664n.m101061g(hVar2, "fragmentIncognitoChecker");
        this.f374880a = context;
        this.f374881b = z;
        this.f374882c = z2;
        this.f374883d = jVar;
        this.f374891n = accountId2;
        this.f374884e = aVar4;
        this.f374885f = bVar;
        this.f374886g = oVar2;
        this.f374892o = awVar2;
        this.f374893p = fVar2;
        this.f374894q = jVar2;
        this.f374895r = z3;
        this.f374887h = eVar;
        this.f374890k = aVar5;
        this.f374896s = eVar2;
        this.f374888i = aVar3;
        this.f374889j = hVar2;
        this.f374897t = instanceStateStoreFactory2.mo50325a("BaselineRequestDataCache", C137768as.f374783c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113958a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.srp.p10435e.C137784i
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.srp.e.i r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137784i) r0
            int r1 = r0.f374831c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f374831c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.srp.e.i r0 = new com.google.android.apps.search.googleapp.search.srp.e.i
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f374829a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f374831c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.googleapp.search.srp.e.r r5 = new com.google.android.apps.search.googleapp.search.srp.e.r
            r2 = 0
            r5.<init>(r4, r2)
            r0.f374831c = r3
            java.lang.Object r5 = kotlinx.coroutines.C71423ax.m104196a(r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.String r0 = "private suspend fun base…arams(params).build()\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x.mo113958a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113959b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.search.srp.p10435e.C137794s
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.search.srp.e.s r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137794s) r0
            int r1 = r0.f374860d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f374860d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.srp.e.s r0 = new com.google.android.apps.search.googleapp.search.srp.e.s
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f374858b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f374860d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f374857a
            p5462h.C69714l.m101134b(r6)
            goto L_0x005e
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.apps.tiktok.cache.p r6 = r5.f374897t
            com.google.protobuf.at r2 = com.google.protobuf.C62912at.f169862a
            com.google.apps.tiktok.cache.ah r6 = r6.mo50378a(r2)
            if (r6 == 0) goto L_0x0053
            java.lang.Object r2 = r6.f121384a
            com.google.android.apps.search.googleapp.search.srp.e.as r4 = com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as.f374783c
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r4)
            if (r2 == 0) goto L_0x0049
            goto L_0x0053
        L_0x0049:
            java.lang.Object r6 = r6.f121384a
            java.lang.String r0 = "result.value()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            com.google.android.apps.search.googleapp.search.srp.e.as r6 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as) r6
            goto L_0x0069
        L_0x0053:
            r0.f374857a = r5
            r0.f374860d = r3
            java.lang.Object r6 = r5.mo113958a(r0)
            if (r6 == r1) goto L_0x006a
            r0 = r5
        L_0x005e:
            com.google.android.apps.search.googleapp.search.srp.e.as r6 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as) r6
            com.google.android.apps.search.googleapp.search.srp.e.x r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x) r0
            com.google.apps.tiktok.cache.p r0 = r0.f374897t
            com.google.protobuf.at r1 = com.google.protobuf.C62912at.f169862a
            r0.mo50381d(r1, r6)
        L_0x0069:
            return r6
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x.mo113959b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113960c(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.search.srp.p10435e.C137795t
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.search.srp.e.t r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137795t) r0
            int r1 = r0.f374865e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f374865e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.srp.e.t r0 = new com.google.android.apps.search.googleapp.search.srp.e.t
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f374863c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f374865e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r1 = r0.f374862b
            java.lang.Object r0 = r0.f374861a
            p5462h.C69714l.m101134b(r7)
            goto L_0x007a
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0036:
            java.lang.Object r2 = r0.f374861a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0052
        L_0x003c:
            p5462h.C69714l.m101134b(r7)
            r0.f374861a = r6
            r0.f374865e = r4
            com.google.apps.tiktok.account.data.a.f r7 = r6.f374893p
            com.google.apps.tiktok.account.AccountId r2 = r6.f374891n
            com.google.common.util.concurrent.cx r7 = r7.mo50215b(r2)
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 == r1) goto L_0x009b
            r2 = r6
        L_0x0052:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x005d
            java.lang.Integer r7 = new java.lang.Integer
            r0 = 0
            r7.<init>(r0)
            return r7
        L_0x005d:
            r4 = r2
            com.google.android.apps.search.googleapp.search.srp.e.x r4 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x) r4
            com.google.android.apps.search.googleapp.search.b.a r4 = r4.f374884e
            com.google.common.util.concurrent.cx r4 = r4.mo103985e(r7)
            java.lang.String r5 = "agsaClassicSearchData.ge…nicornStatus(accountName)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r0.f374861a = r2
            r0.f374862b = r7
            r0.f374865e = r3
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r4, r0)
            if (r0 == r1) goto L_0x009b
            r1 = r7
            r7 = r0
            r0 = r2
        L_0x007a:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x007f
            goto L_0x0095
        L_0x007f:
            int r2 = r7.intValue()
            if (r2 != 0) goto L_0x0095
            com.google.android.apps.search.googleapp.search.srp.e.x r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x) r0
            kotlinx.coroutines.aw r2 = r0.f374892o
            com.google.android.apps.search.googleapp.search.srp.e.u r3 = new com.google.android.apps.search.googleapp.search.srp.e.u
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            r3.<init>(r0, r1, r4)
            r0 = 3
            kotlinx.coroutines.C71803m.m105043d(r2, r4, r4, r3, r0)
        L_0x0095:
            java.lang.String r0 = "unicornStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            return r7
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x.mo113960c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0) != r1) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113961d(java.lang.String r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.search.srp.p10435e.C137797v
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.search.srp.e.v r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137797v) r0
            int r1 = r0.f374873e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f374873e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.srp.e.v r0 = new com.google.android.apps.search.googleapp.search.srp.e.v
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f374871c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f374873e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x002a }
            goto L_0x008f
        L_0x002a:
            r6 = move-exception
            goto L_0x007c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f374870b
            java.lang.Object r2 = r0.f374869a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x002a }
            goto L_0x0059
        L_0x003c:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.kids.a.a.j r7 = r5.f374894q     // Catch:{ Exception -> 0x002a }
            com.google.apps.tiktok.account.AccountId r2 = r5.f374891n     // Catch:{ Exception -> 0x002a }
            com.google.common.util.concurrent.cx r7 = r7.mo29426a(r2, r4)     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "supervisedAccounts.getSupervisionInfo(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)     // Catch:{ Exception -> 0x002a }
            r0.f374869a = r5     // Catch:{ Exception -> 0x002a }
            r0.f374870b = r6     // Catch:{ Exception -> 0x002a }
            r0.f374873e = r4     // Catch:{ Exception -> 0x002a }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)     // Catch:{ Exception -> 0x002a }
            if (r7 == r1) goto L_0x007b
            r2 = r5
        L_0x0059:
            com.google.android.libraries.kids.a.a.k r7 = (com.google.android.libraries.kids.p1982a.p1983a.C24031k) r7     // Catch:{ Exception -> 0x002a }
            com.google.android.apps.search.googleapp.search.srp.e.x r2 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x) r2     // Catch:{ Exception -> 0x002a }
            com.google.android.apps.search.googleapp.search.b.a r2 = r2.f374884e     // Catch:{ Exception -> 0x002a }
            boolean r7 = r7.mo29422c()     // Catch:{ Exception -> 0x002a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x002a }
            com.google.common.util.concurrent.cx r6 = r2.mo103990j(r7, r6)     // Catch:{ Exception -> 0x002a }
            java.lang.String r7 = "agsaClassicSearchData.up…o.isUnicorn, accountName)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ Exception -> 0x002a }
            r7 = 0
            r0.f374869a = r7     // Catch:{ Exception -> 0x002a }
            r0.f374870b = r7     // Catch:{ Exception -> 0x002a }
            r0.f374873e = r3     // Catch:{ Exception -> 0x002a }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ Exception -> 0x002a }
            if (r6 != r1) goto L_0x008f
        L_0x007b:
            return r1
        L_0x007c:
            com.google.common.f.a.d r7 = f374879m
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7
            com.google.common.f.x r6 = r7.mo56382g(r6)
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            java.lang.String r7 = "fail to refresh unicorn status"
            r6.mo56386p(r7)
        L_0x008f:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x.mo113961d(java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113962e(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.search.srp.p10435e.C137798w
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.search.srp.e.w r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137798w) r0
            int r1 = r0.f374877d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f374877d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.srp.e.w r0 = new com.google.android.apps.search.googleapp.search.srp.e.w
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f374875b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f374877d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0088
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            java.lang.Object r2 = r0.f374874a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0048
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.web.profile.a.a.a.e r8 = r7.f374896s
            r0.f374874a = r7
            r0.f374877d = r4
            java.lang.Object r8 = r8.mo46983b(r0)
            if (r8 == r1) goto L_0x008e
            r2 = r7
        L_0x0048:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x008b
            com.google.common.f.a.d r8 = f374879m
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            com.google.common.f.aa r4 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            java.lang.Integer r5 = new java.lang.Integer
            r6 = 149904833(0x8ef5dc1, float:1.4406331E-33)
            r5.<init>(r6)
            r8.mo56378ag(r4, r5)
            java.lang.String r4 = "Found stale cookie, remove all cookies"
            r8.mo56386p(r4)
            com.google.android.apps.search.googleapp.search.srp.e.x r2 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x) r2
            boolean r8 = r2.f374895r
            r4 = 0
            if (r8 != 0) goto L_0x007b
            android.webkit.CookieManager r8 = android.webkit.CookieManager.getInstance()
            r8.removeAllCookies(r4)
            r8.flush()
        L_0x007b:
            com.google.android.libraries.web.profile.a.a.a.e r8 = r2.f374896s
            r0.f374874a = r4
            r0.f374877d = r3
            java.lang.Object r8 = r8.mo46982a(r0)
            if (r8 != r1) goto L_0x0088
            return r1
        L_0x0088:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x008b:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10435e.C137799x.mo113962e(h.c.g):java.lang.Object");
    }

    /* renamed from: f */
    public final String mo113963f() {
        try {
            return String.valueOf(Settings.Global.getInt(this.f374880a.getContentResolver(), "boot_count"));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }
}
