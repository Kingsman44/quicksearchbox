package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.l */
/* compiled from: PG */
public final /* synthetic */ class C14882l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14935x f44779a;

    public /* synthetic */ C14882l(C14935x xVar) {
        this.f44779a = xVar;
    }

    public final Object apply(Object obj) {
        C14935x xVar = this.f44779a;
        if (!((Boolean) obj).booleanValue()) {
            C59104x c = C14935x.f44872a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45511)).mo56386p("Failed to register display for destination suggestions");
            xVar.mo21858f();
            return C14782b.FAILED;
        }
        xVar.f44880i = xVar.f44875d.mo29164d(new C14880j(xVar), 10, TimeUnit.SECONDS);
        return C14782b.SUCCESS;
    }
}
