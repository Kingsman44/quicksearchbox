package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82486gz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82716pm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82717pn;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C103060f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C103076v f287682a;

    public /* synthetic */ C103060f(C103076v vVar) {
        this.f287682a = vVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C83305i iVar = this.f287682a.f287708e;
        C82716pm c = C82717pn.m132233c();
        ((C82486gz) c).f225387b = "COORDINATOR_TRACKING_ERROR_READ_STATE_FAILED";
        iVar.mo75579d(c.mo76438a());
        ((C58970a) ((C58970a) ((C58970a) C103076v.f287703a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(21442)).mo56386p("[NGA Pie] usecaseStore.readState call failed.");
    }
}
