package com.google.android.libraries.web.profile;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.b */
/* compiled from: PG */
public final class C44061b {
    /* renamed from: a */
    public static final Profile m77793a(C43271v vVar, boolean z, AccountId accountId, C44082a aVar) {
        String str;
        C69664n.m101061g(vVar, "webImplementation");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar, "restricted");
        boolean z2 = vVar == C43271v.WEB_VIEW;
        if (z2) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "account_" + accountId.mo50068a();
        }
        return new Profile(str, vVar, z & (!z2), accountId);
    }
}
