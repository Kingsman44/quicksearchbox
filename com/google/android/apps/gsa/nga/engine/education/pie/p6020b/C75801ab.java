package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C75801ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C75808ai f210368a;

    /* renamed from: b */
    public final /* synthetic */ C80201av f210369b;

    public /* synthetic */ C75801ab(C75808ai aiVar, C80201av avVar) {
        this.f210368a = aiVar;
        this.f210369b = avVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C75808ai aiVar = this.f210368a;
        C80201av avVar = this.f210369b;
        ((C58970a) ((C58970a) ((C58970a) C75808ai.f210379a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(3364)).mo56386p("Failed to update Pie eligibility");
        aiVar.f210382d.mo74236a(C75808ai.m122179c(C89849ae.PIE_ELIGIBILITY_REQUEST_FAILURE, avVar));
    }
}
