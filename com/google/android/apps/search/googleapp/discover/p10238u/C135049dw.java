package com.google.android.apps.search.googleapp.discover.p10238u;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.sidekick.main.p7197a.p7198a.C91240b;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b.C133963k;
import com.google.android.apps.search.googleapp.discover.p10238u.p10239a.p10240a.C134939a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57286cn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71803m;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.dw */
/* compiled from: PG */
public final class C135049dw {

    /* renamed from: a */
    public final C69585o f367760a;

    /* renamed from: b */
    public final C135032df f367761b;

    /* renamed from: c */
    public final C135123v f367762c;

    /* renamed from: d */
    public final C133665d f367763d;

    /* renamed from: e */
    public final C133963k f367764e;

    /* renamed from: f */
    public final C69464a f367765f;

    /* renamed from: g */
    public final C21370a f367766g;

    /* renamed from: h */
    public final C134939a f367767h;

    /* renamed from: i */
    public final C39143kr f367768i;

    /* renamed from: j */
    public final C91240b f367769j;

    /* renamed from: k */
    private final C46175b f367770k;

    /* renamed from: l */
    private final AccountId f367771l;

    public C135049dw(C69585o oVar, C135032df dfVar, C135123v vVar, C133665d dVar, C133963k kVar, C69464a aVar, C134939a aVar2, C91240b bVar, C46175b bVar2, AccountId accountId, C21370a aVar3, C39143kr krVar) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(dVar, "userAgentHelper");
        C69664n.m101061g(aVar, "capabilities");
        C69664n.m101061g(aVar2, "feedDebugParamsReader");
        C69664n.m101061g(bVar, "userFirstEnteredAppReader");
        C69664n.m101061g(bVar2, "accountDataService");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar3, "clock");
        C69664n.m101061g(krVar, "clientStreamz");
        this.f367760a = oVar;
        this.f367761b = dfVar;
        this.f367762c = vVar;
        this.f367763d = dVar;
        this.f367764e = kVar;
        this.f367765f = aVar;
        this.f367767h = aVar2;
        this.f367769j = bVar;
        this.f367770k = bVar2;
        this.f367771l = accountId;
        this.f367766g = aVar3;
        this.f367768i = krVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m219004c(C135049dw dwVar, C57259bn bnVar, C57340w wVar, C134991bw bwVar, C57252bg bgVar, String str, C57286cn cnVar, C69577g gVar, int i) {
        int i2 = i;
        return dwVar.mo112110b(bnVar, wVar, (i2 & 4) != 0 ? C135035di.f367707a : bwVar, (i2 & 8) != 0 ? null : bgVar, false, (i2 & 32) != 0 ? BuildConfig.FLAVOR : str, (i2 & 128) != 0 ? null : cnVar, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112109a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C135048dv
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.discover.u.dv r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C135048dv) r0
            int r1 = r0.f367759c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f367759c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.dv r0 = new com.google.android.apps.search.googleapp.discover.u.dv
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f367757a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f367759c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0048
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.apps.tiktok.account.data.b r5 = r4.f367770k
            com.google.apps.tiktok.account.AccountId r2 = r4.f367771l
            com.google.common.util.concurrent.cx r5 = r5.mo50246c(r2)
            java.lang.String r2 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f367759c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            com.google.apps.tiktok.account.data.a r5 = (com.google.apps.tiktok.account.data.C46108a) r5
            com.google.apps.tiktok.account.data.j r5 = r5.mo50210b()
            java.lang.String r5 = r5.f121165j
            java.lang.String r0 = "google"
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135049dw.mo112109a(h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo112110b(C57259bn bnVar, C57340w wVar, C134991bw bwVar, C57252bg bgVar, boolean z, String str, C57286cn cnVar, C69577g gVar) {
        return C71423ax.m104196a(new C135044dr(this, bwVar, bnVar, cnVar, bgVar, wVar, z, str, (C69577g) null), gVar);
    }

    /* renamed from: d */
    public final Object mo112111d(C57259bn bnVar, C57340w wVar, C134991bw bwVar, C57252bg bgVar, String str, C57286cn cnVar, C69577g gVar) {
        return C71803m.m105040a(this.f367760a, new C135046dt(this, bnVar, wVar, bwVar, bgVar, str, cnVar, (C69577g) null), gVar);
    }
}
