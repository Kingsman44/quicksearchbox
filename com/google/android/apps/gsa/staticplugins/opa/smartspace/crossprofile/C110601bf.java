package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.bf */
/* compiled from: PG */
final class C110601bf implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f308273a;

    /* renamed from: b */
    final /* synthetic */ String f308274b;

    /* renamed from: c */
    final /* synthetic */ C110602bg f308275c;

    public C110601bf(C110602bg bgVar, String str, String str2) {
        this.f308275c = bgVar;
        this.f308273a = str;
        this.f308274b = str2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!this.f308275c.f308281f.mo117184j().mo117170a()) {
            this.f308275c.f308279d.mo109952y(this.f308273a, this.f308274b, "NO_PERMISSION_CROSS_PROFILE_CALL");
            C95883aa.m158983d(this.f308275c.f308278c.mo56226d(), "No permissions to make cross-profile call.", 26611, C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_NO_CROSS_PROFILE_PERMISSIONS_VALUE));
            return;
        }
        this.f308275c.f308279d.mo109952y(this.f308273a, this.f308274b, "FAILED_CROSS_PROFILE_CALL");
        this.f308275c.f308279d.mo109953z(th.getMessage() == null ? "Unknown errors" : th.getMessage());
        C58970a aVar = (C58970a) this.f308275c.f308278c.mo56225c();
        aVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_CROSS_PROFILE_FAILURES_VALUE));
        ((C58970a) ((C58970a) aVar.mo56382g(th)).mo56372aa(26610)).mo56386p("Failed to notify personal profile from work profile.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f308275c.f308279d.mo109952y(this.f308273a, this.f308274b, "SUCCESSFUL_CROSS_PROFILE_CALL");
        ((C58970a) ((C58970a) this.f308275c.f308278c.mo56224b()).mo56372aa(26612)).mo56386p("Notification sent from work profile to personal profile successfully.");
    }
}
