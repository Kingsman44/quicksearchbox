package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.c */
/* compiled from: PG */
public final /* synthetic */ class C96729c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C96730d f270563a;

    public /* synthetic */ C96729c(C96730d dVar) {
        this.f270563a = dVar;
    }

    public final void accept(Object obj) {
        C96730d dVar = this.f270563a;
        C87684al alVar = new C87684al(C88244um.LENS_SERVICE_SDK_SERVICE_EVENT);
        alVar.mo81966c((Bundle) obj);
        ServiceEventData a = alVar.mo81964a();
        C86697a aVar = dVar.f270566c;
        if (aVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            ((C86775r) aVar).f234383e.mo80379b(a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
