package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.Profile;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import kotlinx.coroutines.p5578d.C71663i;
import p5460g.p5461a.C69464a;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.a.b.a.aj */
/* compiled from: PG */
public final class C43997aj {

    /* renamed from: a */
    public final AccountId f114521a;

    /* renamed from: b */
    public final C69585o f114522b;

    /* renamed from: c */
    public final C68214a f114523c;

    /* renamed from: d */
    public final boolean f114524d;

    /* renamed from: e */
    private final C21370a f114525e;

    /* renamed from: f */
    private final Executor f114526f;

    /* renamed from: g */
    private final C42876ab f114527g;

    public C43997aj(Profile profile, AccountId accountId, C21370a aVar, C69585o oVar, Executor executor, C68214a aVar2, C69464a aVar3, C69464a aVar4) {
        C42876ab abVar;
        C69664n.m101061g(profile, "profile");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(aVar2, "webViewLastVerifiedOrRefreshedAccountState");
        C69664n.m101061g(aVar3, "persistentStateWebViewAccountStore");
        C69664n.m101061g(aVar4, "persistentStateWebLayerAccountStore");
        this.f114521a = accountId;
        this.f114525e = aVar;
        this.f114522b = oVar;
        this.f114526f = executor;
        this.f114523c = aVar2;
        boolean z = profile.f114484b == C43271v.WEB_VIEW;
        this.f114524d = z;
        if (z) {
            Object b = aVar3.mo17428b();
            C69664n.m101060f(b, "{\n      persistentStateW…wAccountStore.get()\n    }");
            abVar = (C42876ab) b;
        } else {
            Object b2 = aVar4.mo17428b();
            C69664n.m101060f(b2, "{\n      persistentStateW…rAccountStore.get()\n    }");
            abVar = (C42876ab) b2;
        }
        this.f114527g = abVar;
    }

    /* renamed from: e */
    private final long m77665e() {
        return this.f114525e.mo26870b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46985a(boolean r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43992ae
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.web.profile.a.b.a.ae r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43992ae) r0
            int r1 = r0.f114513e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114513e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.profile.a.b.a.ae r0 = new com.google.android.libraries.web.profile.a.b.a.ae
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f114511c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f114513e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            boolean r8 = r0.f114510b
            java.lang.Object r0 = r0.f114509a
            p5462h.C69714l.m101134b(r9)
            goto L_0x004e
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.storage.protostore.ab r9 = r7.f114527g
            com.google.common.util.concurrent.cx r9 = r9.mo46042d()
            java.lang.String r2 = "persistentStateAccountStore.getData()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f114509a = r7
            r0.f114510b = r8
            r0.f114513e = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x009a
            r0 = r7
        L_0x004e:
            com.google.android.libraries.web.profile.a.b.a.aw r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44010aw) r9
            long r1 = r9.f114565b
            int r1 = r9.f114566c
            com.google.android.libraries.web.profile.a.b.a.av r1 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44009av.UNDEFINED
            long r1 = r9.f114565b
            com.google.android.libraries.web.profile.a.b.a.aj r0 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43997aj) r0
            long r4 = r0.m77665e()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0095
            int r1 = r9.f114566c
            com.google.android.libraries.web.profile.a.b.a.av r1 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44009av.m77693a(r1)
            if (r1 != 0) goto L_0x006c
            com.google.android.libraries.web.profile.a.b.a.av r1 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44009av.UNDEFINED
        L_0x006c:
            com.google.android.libraries.web.profile.a.b.a.av r2 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44009av.NEVER
            r4 = 0
            if (r1 != r2) goto L_0x0076
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L_0x0076:
            if (r8 != 0) goto L_0x007d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L_0x007d:
            long r0 = r0.m77665e()
            java.lang.String r8 = "data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r8)
            long r8 = com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43998ak.m77671b(r9)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r3 = 0
        L_0x0090:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L_0x0095:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C43997aj.mo46985a(boolean, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo46986b(C44009av avVar, C69577g gVar) {
        if (avVar == C44009av.NONE) {
            return C69788q.f186170a;
        }
        C60870cx a = this.f114527g.mo46039a(new C43993af(avVar, m77665e()), this.f114526f);
        C69664n.m101060f(a, "delayType: DelayType) {\n…ghtweightExecutor\n      )");
        Object c = C71663i.m104690c(a, gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* renamed from: c */
    public final Object mo46987c(C69577g gVar) {
        Object d = mo46988d(new C43995ah(this.f114521a.mo50068a()), gVar);
        return d == C69554a.COROUTINE_SUSPENDED ? d : C69788q.f186170a;
    }

    /* renamed from: d */
    public final Object mo46988d(C69626l lVar, C69577g gVar) {
        C60870cx a = ((C42876ab) this.f114523c.mo27525b()).mo46039a(new C43996ai(lVar), this.f114526f);
        C69664n.m101060f(a, "block: WebViewLastVerifi…} }, lightweightExecutor)");
        Object c = C71663i.m104690c(a, gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }
}
