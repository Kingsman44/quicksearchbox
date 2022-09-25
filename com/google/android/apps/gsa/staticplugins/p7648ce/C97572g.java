package com.google.android.apps.gsa.staticplugins.p7648ce;

import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87800ea;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87802ec;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4522b.C58322at;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.g */
/* compiled from: PG */
public final /* synthetic */ class C97572g implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C97573h f272581a;

    public /* synthetic */ C97572g(C97573h hVar) {
        this.f272581a = hVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C97573h hVar = this.f272581a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (hVar.f272585c.mo54919w(a)) {
            for (C97554am amVar : ((C58322at) hVar.f272585c).mo54986h(a)) {
                try {
                    C87802ec ecVar = (C87802ec) serviceEventData.mo81918e(C87800ea.f237591a);
                    if (ecVar != null) {
                        C97565ax axVar = amVar.f272488a;
                        axVar.f272547h.mo57356n(ecVar.f237594a);
                    }
                } catch (RemoteException e) {
                    C59104x c = C97573h.f272582a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SSNowdevClient");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(22125)).mo56386p("Failure in handling service event");
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
