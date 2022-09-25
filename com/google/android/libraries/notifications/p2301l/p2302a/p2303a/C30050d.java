package com.google.android.libraries.notifications.p2301l.p2302a.p2303a;

import com.google.android.libraries.notifications.p2294i.p2295a.C30018a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.apps.tiktok.account.data.C46165aq;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.C46217l;
import com.google.apps.tiktok.account.data.C46218m;
import com.google.apps.tiktok.account.data.C46319n;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47267g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.notifications.l.a.a.d */
/* compiled from: PG */
public final class C30050d implements C46319n, C46218m, C47267g {

    /* renamed from: a */
    public final C30018a f81306a;

    /* renamed from: b */
    private final C46325t f81307b;

    /* renamed from: c */
    private final C60887da f81308c;

    public C30050d(C30018a aVar, C46325t tVar, C60887da daVar) {
        this.f81306a = aVar;
        this.f81307b = tVar;
        this.f81308c = daVar;
    }

    /* renamed from: d */
    private static final boolean m55763d(C46217l lVar) {
        return "pseudonymous".equals(((C46165aq) lVar).f121091b.f121165j);
    }

    /* renamed from: a */
    public final C60870cx mo22504a(C46217l lVar) {
        if (m55763d(lVar)) {
            C30058b.m55794f("TikTokContrib", "onAccountEnabled called from anonymous account. Registration skipped.", new Object[0]);
        } else {
            C30058b.m55794f("TikTokContrib", "onAccountEnabled called for [%s] (Chime flag enabled [%b])", ((C46165aq) lVar).f121091b.f121161f, true);
            if (!m55763d(lVar)) {
                C46459k.m82829b(this.f81308c.mo19398a(C47810es.m84977q(new C30047a(this, lVar))), "failed to register with Chime", new Object[0]);
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo35387b(C46217l lVar) {
        if (m55763d(lVar)) {
            C30058b.m55794f("TikTokContrib", "onAccountDisabled called from anonymous account. Unregistration skipped.", new Object[0]);
        } else {
            C30058b.m55794f("TikTokContrib", "onAccountDisabled called for [%s] (Chime flag enabled [%b])", ((C46165aq) lVar).f121091b.f121161f, true);
            C46459k.m82829b(this.f81308c.mo19398a(C47810es.m84977q(new C30048b(this, lVar))), "failed to unregister with Chime", new Object[0]);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo35388c(C46215j jVar) {
        this.f81306a.mo35343b(jVar.f121161f);
    }

    /* renamed from: e */
    public final void mo35389e() {
        C30058b.m55794f("TikTokContrib", "onStartupAfterPackageReplaced called (Chime flag enabled [%b]).", true);
        C60856cj.m92911t(this.f81307b.mo50288h(), C47810es.m84974n(new C30049c(this)), this.f81308c);
    }
}
