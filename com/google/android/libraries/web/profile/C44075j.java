package com.google.android.libraries.web.profile;

import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3613b.C46177b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.j */
/* compiled from: PG */
public final class C44075j {

    /* renamed from: a */
    private final AccountId f114743a;

    /* renamed from: b */
    private final C46177b f114744b;

    public C44075j(AccountId accountId, C46177b bVar) {
        C69664n.m101061g(accountId, "accountId");
        this.f114743a = accountId;
        this.f114744b = bVar;
    }

    /* renamed from: a */
    public final Profile mo47043a(C43271v vVar) {
        C69664n.m101061g(vVar, "webImplementation");
        return C44061b.m77793a(vVar, this.f114744b.mo41484a(), this.f114743a, C44082a.f114755a);
    }
}
