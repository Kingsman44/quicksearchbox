package com.google.android.apps.search.googleapp.incognito.education;

import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.incognito.education.k */
/* compiled from: PG */
public final class C136268k implements C45987ay {

    /* renamed from: c */
    private static final C59071e f371079c = C59071e.m91332i("com.google.android.apps.search.googleapp.incognito.education.k");

    /* renamed from: a */
    public final IncognitoTransparentActivity f371080a;

    /* renamed from: b */
    public final C133148g f371081b;

    /* renamed from: d */
    private final C45989b f371082d;

    public C136268k(IncognitoTransparentActivity incognitoTransparentActivity, C45989b bVar, C133155c cVar, C133148g gVar) {
        this.f371080a = incognitoTransparentActivity;
        this.f371082d = bVar;
        this.f371081b = gVar;
        cVar.mo110998a(incognitoTransparentActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        if (this.f371080a.f727a.f739a.f744e.f634a.mo671c("INCOGNITO_EDUCATION") == null) {
            C136261d.m221395a(awVar.f120815a.f120816a).showNow(this.f371080a.f727a.f739a.f744e, "INCOGNITO_EDUCATION");
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f371079c.mo56226d()).mo56382g(th)).mo56372aa(40705)).mo56386p("#onAccountError");
        this.f371080a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
