package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.u */
/* compiled from: PG */
final class C110655u implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f308338a;

    /* renamed from: b */
    final /* synthetic */ String f308339b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f308340c;

    /* renamed from: d */
    final /* synthetic */ C110656v f308341d;

    public C110655u(C110656v vVar, String str, String str2, SettableFuture settableFuture) {
        this.f308341d = vVar;
        this.f308338a = str;
        this.f308339b = str2;
        this.f308340c = settableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!this.f308341d.f308349h.mo117184j().mo117170a()) {
            this.f308341d.f308347f.mo109952y(this.f308338a, this.f308339b, "NO_PERMISSION_CROSS_PROFILE_CALL");
            C95883aa.m158983d(this.f308341d.f308345d.mo56226d(), "No permissions to make cross-profile call.", 26590, C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_NO_CROSS_PROFILE_PERMISSIONS_VALUE));
        } else {
            this.f308341d.f308347f.mo109952y(this.f308338a, this.f308339b, "FAILED_CROSS_PROFILE_CALL");
            this.f308341d.f308347f.mo109953z(th.getMessage() == null ? "Unknown errors" : th.getMessage());
            C58970a aVar = (C58970a) this.f308341d.f308345d.mo56226d();
            aVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_CROSS_PROFILE_FAILURES_VALUE));
            ((C58970a) ((C58970a) aVar.mo56382g(th)).mo56372aa(26589)).mo56386p("Failed to get primary cards from work profile");
        }
        this.f308340c.mo57356n(C58485gu.m89845m());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        this.f308341d.f308347f.mo109952y(this.f308338a, this.f308339b, "SUCCESSFUL_CROSS_PROFILE_CALL");
        if (list != null) {
            ((C58970a) ((C58970a) this.f308341d.f308345d.mo56224b()).mo56372aa(26591)).mo56387q("Get primary cards from work profile successfully, data size = %s", list.size());
            list = (List) Collection.EL.stream(list).map(new C110653s(this.f308341d)).map(new C110654t(this.f308341d)).collect(C58370cn.f155946a);
        }
        this.f308340c.mo57356n(list);
    }
}
