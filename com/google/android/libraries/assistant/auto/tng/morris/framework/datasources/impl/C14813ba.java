package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14309el;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ba */
/* compiled from: PG */
public final /* synthetic */ class C14813ba implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14820bh f44614a;

    public /* synthetic */ C14813ba(C14820bh bhVar) {
        this.f44614a = bhVar;
    }

    public final Object apply(Object obj) {
        C14820bh bhVar = this.f44614a;
        Throwable th = (Throwable) obj;
        C59104x c = C14820bh.f44628a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45555)).mo56386p("getMediaItemsViaSubscriptionToNode failure");
        if (th instanceof TimeoutException) {
            bhVar.mo21755f(C14309el.MEDIA_BROWSE_SUBSCRIPTION_TIME_OUT);
        } else {
            bhVar.mo21755f(C14309el.MEDIA_BROWSE_TREE_STATUS_UNKNOWN);
        }
        bhVar.mo21756j();
        return C14782b.SUCCESS;
    }
}
