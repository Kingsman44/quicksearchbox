package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80255j;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.f */
/* compiled from: PG */
public final /* synthetic */ class C103088f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C103093k f287729a;

    /* renamed from: b */
    public final /* synthetic */ Optional f287730b;

    public /* synthetic */ C103088f(C103093k kVar, Optional optional) {
        this.f287729a = kVar;
        this.f287730b = optional;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C103093k kVar = this.f287729a;
        Optional optional = this.f287730b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) C103093k.f287734a.mo56226d()).mo56372aa(21417)).mo56386p("[NGA Pie] Couldn't get PrimaryAccountName.");
            return;
        }
        kVar.f287737d.mo28211k(kVar.f287738e.c((String) axVar.mo56107c(), C65753ak.PIE_ASSISTANT_USAGE_STATS, (String) null, C63662ac.f172144a, C80255j.f220187c), "[NGA] checkUsageStatsAndScheduleNotification", new C103090h(kVar, (C103092j) optional.get()));
    }
}
