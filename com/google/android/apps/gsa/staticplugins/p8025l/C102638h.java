package com.google.android.apps.gsa.staticplugins.p8025l;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.h */
/* compiled from: PG */
final class C102638h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C102639i f286462a;

    public C102638h(C102639i iVar) {
        this.f286462a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C102639i.f286463a.mo56226d()).mo56382g(th)).mo56372aa(14005)).mo56386p("failed to fetch fluid action response");
        this.f286462a.f286465c.mo83702b(C89849ae.OPA_FLUID_ACTION_FLOW_CANCEL);
        this.f286462a.mo93351e();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            this.f286462a.f286465c.mo83702b(C89849ae.OPA_FLUID_ACTION_FLOW_SUCCESS);
            this.f286462a.f286464b.mo28212l("fluidActionsAssistantResponse", new C102637g(this, axVar));
            return;
        }
        this.f286462a.f286465c.mo83702b(C89849ae.OPA_FLUID_ACTION_FLOW_CANCEL);
        this.f286462a.mo93351e();
    }
}
