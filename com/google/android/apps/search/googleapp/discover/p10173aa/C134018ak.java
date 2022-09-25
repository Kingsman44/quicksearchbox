package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.apps.gsa.sidekick.main.p7197a.p7198a.C91240b;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134243f;
import com.google.android.apps.search.googleapp.discover.p10184f.C134253d;
import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.contrib.work.C46506a;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.ak */
/* compiled from: PG */
public final class C134018ak implements C134074r, C134019al, C134020am {

    /* renamed from: a */
    public static final C59071e f365052a = C59071e.m91331h();

    /* renamed from: b */
    public final AccountId f365053b;

    /* renamed from: c */
    public final C46506a f365054c;

    /* renamed from: d */
    public final C46180e f365055d;

    /* renamed from: e */
    public final C134061e f365056e;

    /* renamed from: f */
    public final C134069m f365057f;

    /* renamed from: g */
    public final C134253d f365058g;

    /* renamed from: h */
    public final C134029av f365059h;

    /* renamed from: i */
    public final Optional f365060i;

    /* renamed from: j */
    public final C69585o f365061j;

    /* renamed from: k */
    public final AtomicBoolean f365062k = new AtomicBoolean(false);

    /* renamed from: l */
    public final boolean f365063l;

    /* renamed from: m */
    public final C39143kr f365064m;

    /* renamed from: n */
    public final C91240b f365065n;

    /* renamed from: o */
    private final boolean f365066o;

    /* renamed from: p */
    private final boolean f365067p;

    /* renamed from: q */
    private final boolean f365068q;

    /* renamed from: r */
    private final C71422aw f365069r;

    /* renamed from: s */
    private final C134243f f365070s;

    public C134018ak(AccountId accountId, C46506a aVar, C46180e eVar, C91240b bVar, C134061e eVar2, C134069m mVar, C134253d dVar, C134029av avVar, Optional optional, boolean z, boolean z2, boolean z3, C134243f fVar, C71422aw awVar, C69585o oVar, C39143kr krVar) {
        Optional optional2 = optional;
        boolean z4 = z;
        boolean z5 = z2;
        C71422aw awVar2 = awVar;
        C69585o oVar2 = oVar;
        C39143kr krVar2 = krVar;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar, "accountWorkManager");
        C69664n.m101061g(bVar, "userFirstEnteredAppReader");
        C69664n.m101061g(optional2, "workSpecInterceptor");
        C69664n.m101061g(awVar2, "lightweightScope");
        C69664n.m101061g(oVar2, "lightweightContext");
        C69664n.m101061g(krVar2, "clientStreamz");
        this.f365053b = accountId;
        this.f365054c = aVar;
        this.f365055d = eVar;
        this.f365065n = bVar;
        this.f365056e = eVar2;
        this.f365057f = mVar;
        this.f365058g = dVar;
        this.f365059h = avVar;
        this.f365060i = optional2;
        this.f365066o = z4;
        this.f365067p = z5;
        this.f365068q = z3;
        this.f365070s = fVar;
        this.f365069r = awVar2;
        this.f365061j = oVar2;
        this.f365064m = krVar2;
        boolean z6 = false;
        this.f365063l = (z4 || z5) ? true : z6;
    }

    /* renamed from: a */
    public final Object mo111512a(C69577g gVar) {
        Object a = C71803m.m105040a(this.f365061j, new C134077u(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: b */
    public final Object mo111513b(C69577g gVar) {
        Object a = C71803m.m105040a(this.f365061j, new C134078v(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: c */
    public final Object mo111514c(C69577g gVar) {
        Object a = C71803m.m105040a(this.f365061j, new C134079w(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: d */
    public final Object mo111515d(C134591i iVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f365061j, new C134080x(this, iVar, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: e */
    public final void mo111516e(boolean z) {
        this.f365062k.set(z);
    }

    /* renamed from: f */
    public final C47633f mo111517f() {
        return C135209c.m219302a(C71663i.m104692e(this.f365069r, (C71424ay) null, new C134011ad(this, (C69577g) null), 3));
    }

    /* renamed from: g */
    public final C47633f mo111518g() {
        return C135209c.m219302a(C71663i.m104692e(this.f365069r, (C71424ay) null, new C134016ai(this, (C69577g) null), 3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111519h(java.lang.String r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134075s
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.discover.aa.s r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134075s) r0
            int r1 = r0.f365226d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f365226d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.aa.s r0 = new com.google.android.apps.search.googleapp.discover.aa.s
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f365224b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f365226d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f365223a
            p5462h.C69714l.m101134b(r6)     // Catch:{ Exception -> 0x0029 }
            goto L_0x006c
        L_0x0029:
            r6 = move-exception
            goto L_0x004e
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.apps.tiktok.contrib.work.a r6 = r4.f365054c     // Catch:{ Exception -> 0x0029 }
            com.google.apps.tiktok.account.AccountId r2 = r4.f365053b     // Catch:{ Exception -> 0x0029 }
            com.google.common.util.concurrent.cx r6 = r6.mo50517a(r2, r5)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "accountWorkManager.cance…countWork(accountId, tag)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)     // Catch:{ Exception -> 0x0029 }
            r0.f365223a = r5     // Catch:{ Exception -> 0x0029 }
            r0.f365226d = r3     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ Exception -> 0x0029 }
            if (r5 != r1) goto L_0x006c
            return r1
        L_0x004e:
            com.google.common.f.e r0 = f365052a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r6 = r0.mo56382g(r6)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 40554(0x9e6a, float:5.6828E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Error cancelling %s tag"
            r6.mo56389s(r0, r5)
        L_0x006c:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134018ak.mo111519h(java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111520i(boolean r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134076t
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.discover.aa.t r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134076t) r0
            int r1 = r0.f365231e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f365231e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.aa.t r0 = new com.google.android.apps.search.googleapp.discover.aa.t
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f365229c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f365231e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            boolean r6 = r0.f365228b
            java.lang.Object r0 = r0.f365227a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0051
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r5.f365068q
            if (r7 == 0) goto L_0x006a
            com.google.android.apps.search.googleapp.discover.e.a.f r7 = r5.f365070s
            r0.f365227a = r5
            r0.f365228b = r6
            r0.f365231e = r3
            h.c.o r2 = r7.f365719b
            com.google.android.apps.search.googleapp.discover.e.a.e r3 = new com.google.android.apps.search.googleapp.discover.e.a.e
            r4 = 0
            r3.<init>(r7, r4)
            java.lang.Object r7 = kotlinx.coroutines.C71803m.m105040a(r2, r3, r0)
            if (r7 == r1) goto L_0x0069
            r0 = r5
        L_0x0051:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == r6) goto L_0x0061
            com.google.android.apps.search.googleapp.discover.aa.ak r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134018ak) r0
            com.google.android.libraries.search.logging.d.kr r6 = r0.f365064m
            r6.mo41721j()
            goto L_0x006a
        L_0x0061:
            com.google.android.apps.search.googleapp.discover.aa.ak r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134018ak) r0
            com.google.android.libraries.search.logging.d.kr r6 = r0.f365064m
            r6.mo41713b()
            goto L_0x006a
        L_0x0069:
            return r1
        L_0x006a:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134018ak.mo111520i(boolean, h.c.g):java.lang.Object");
    }

    /* renamed from: j */
    public final Object mo111521j(C69577g gVar) {
        Object a = C71803m.m105040a(this.f365061j, new C134008aa(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: k */
    public final Object mo111522k(C46586t tVar, C69577g gVar) {
        return C71803m.m105040a(this.f365061j, new C134010ac(this, tVar, (C69577g) null), gVar);
    }

    /* renamed from: l */
    public final Object mo111523l(C69577g gVar) {
        return C71803m.m105040a(this.f365061j, new C134017aj(this, (C69577g) null), gVar);
    }
}
