package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.nga.shared.p6350k.C81343c;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.p3926e.C52052k;
import com.google.assistant.p3897e.p3921j.p3926e.C52054m;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.n */
/* compiled from: PG */
public final /* synthetic */ class C93224n implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C93224n f259975a = new C93224n();

    private /* synthetic */ C93224n() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C81343c cVar = (C81343c) obj;
        C58974d dVar = C93225o.f259976a;
        C52052k kVar = (C52052k) C52054m.f136620c.createBuilder();
        if (cVar == C81343c.ACTION_ONBOARDING_FAILED_TO_FINISH) {
            kVar.copyOnWrite();
            C52054m mVar = (C52054m) kVar.instance;
            mVar.f136623b = 2;
            mVar.f136622a |= 1;
        } else {
            kVar.copyOnWrite();
            C52054m mVar2 = (C52054m) kVar.instance;
            mVar2.f136623b = 1;
            mVar2.f136622a |= 1;
        }
        return C22402a.m41821a("execute_action_result", "assistant.api.client_op.ui.ExecuteActionOnWebsiteResult", (C52054m) kVar.build());
    }
}
