package com.google.android.apps.search.googleapp.compliance;

import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.compliance.n */
/* compiled from: PG */
public final class C133647n implements C45987ay {

    /* renamed from: a */
    private static final C59071e f364054a = C59071e.m91332i("com.google.android.apps.search.googleapp.compliance.n");

    /* renamed from: b */
    private final ComplianceTransparentActivity f364055b;

    /* renamed from: c */
    private final C28310af f364056c;

    /* renamed from: d */
    private final C28306ab f364057d;

    public C133647n(ComplianceTransparentActivity complianceTransparentActivity, C45989b bVar, C133155c cVar, C28310af afVar, C28306ab abVar) {
        this.f364055b = complianceTransparentActivity;
        this.f364056c = afVar;
        this.f364057d = abVar;
        cVar.mo110998a(complianceTransparentActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        if (this.f364055b.f727a.f739a.f744e.f634a.mo671c("LOCATION_CONSENT") == null) {
            AccountId accountId = awVar.f120815a.f120816a;
            C133622c cVar = new C133622c();
            C68324h.m98669f(cVar);
            C47247a.m84047b(cVar, accountId);
            cVar.showNow(this.f364055b.f727a.f739a.f744e, "LOCATION_CONSENT");
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f364054a.mo56226d()).mo56382g(th)).mo56372aa(40059)).mo56386p("#onAccountError");
        this.f364055b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f364057d;
        ComplianceTransparentActivity complianceTransparentActivity = this.f364055b;
        C28313c a = this.f364056c.mo33805a(C28427h.m53115a(131820));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(131818));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(complianceTransparentActivity.findViewById(16908290), a);
    }
}
