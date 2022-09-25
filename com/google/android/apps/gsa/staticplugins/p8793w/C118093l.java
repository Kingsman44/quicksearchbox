package com.google.android.apps.gsa.staticplugins.p8793w;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.l */
/* compiled from: PG */
public final /* synthetic */ class C118093l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117724al f327725a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f327726b;

    public /* synthetic */ C118093l(C117724al alVar, ServiceEventData serviceEventData) {
        this.f327725a = alVar;
        this.f327726b = serviceEventData;
    }

    public final void run() {
        C117724al alVar = this.f327725a;
        ServiceEventData serviceEventData = this.f327726b;
        C58976aa aaVar = C58975e.f156826a;
        if (serviceEventData.mo81913d(Intent.class)) {
            Intent intent = (Intent) serviceEventData.mo81912b(Intent.class);
            Uri data = intent.getData();
            if (C90721ae.f253797f.contains(intent.getPackage()) && data != null && data.isHierarchical() && data.getQueryParameter("gmm") != null && ("sar".equals(data.getQueryParameter("entry")) || alVar.mo103442n())) {
                Long l = alVar.f326756i;
                if (l != null) {
                    intent.putExtra("handover-session-id", l);
                }
                if (alVar.mo103442n()) {
                    intent.putExtra("should-handover-to-agsa", true);
                }
            }
            alVar.f326751d.mo79322d(C89849ae.ASSISTANT_AUTO_START_ACTIVITY_INTENT);
            C58833ax axVar = (C58833ax) alVar.f326752e.mo27525b();
            if (axVar.mo56113h()) {
                ((C100321a) axVar.mo56107c()).mo91880d(intent.toUri(0));
            }
            alVar.f326753f.mo19966a(intent);
        }
    }
}
