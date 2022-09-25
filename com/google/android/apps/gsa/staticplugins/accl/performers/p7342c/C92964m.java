package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.m */
/* compiled from: PG */
public final /* synthetic */ class C92964m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92970s f259321a;

    public /* synthetic */ C92964m(C92970s sVar) {
        this.f259321a = sVar;
    }

    public final Object apply(Object obj) {
        C92970s sVar = this.f259321a;
        TimeoutException timeoutException = (TimeoutException) obj;
        sVar.f259331c.mo19974a(C37182a.f98255y.mo40805c(C62722b.DEADLINE_EXCEEDED));
        ((C59052c) ((C59052c) C92970s.f259329a.mo56226d()).mo56372aa(13234)).mo56386p("AssistData future timeout");
        return sVar.mo87493b(C52235kf.DEADLINE_EXCEEDED, "AssistData future timeout");
    }
}
