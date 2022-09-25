package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.p7554bs.p7560f.p7561a.C96724a;
import com.google.android.apps.gsa.staticplugins.p7554bs.p7560f.p7561a.C96726b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.EnumSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.g */
/* compiled from: PG */
public final class C96733g {

    /* renamed from: a */
    private static final C59071e f270590a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bs.f.g");

    /* renamed from: b */
    private static final C58528ij f270591b = C58476gl.m89803b(EnumSet.of(C88244um.LENS_SERVICE_API_VERSION, new C88244um[]{C88244um.LENS_SERVICE_RESPONSE_PENDING_INTENT, C88244um.LENS_SERVICE_LENS_VIEW_SERVICE_EVENT, C88244um.LENS_SERVICE_SESSION_STARTED}));

    /* renamed from: c */
    private final C96724a f270592c;

    public C96733g(C96724a aVar) {
        this.f270592c = aVar;
    }

    /* renamed from: a */
    public final void mo90332a(ServiceEventData serviceEventData) {
        C58528ij ijVar = f270591b;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        C58838bb.m90869d(ijVar.contains(a), "dispatchServiceEvent can only be used with LENS_SERVICE_* events");
        C58833ax b = C58833ax.m90833j(((C96734h) this.f270592c.f270555a.mo27525b()).f270595a).mo56106b(C96726b.f270557a);
        if (!b.mo56113h()) {
            C59104x d = f270590a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ServiceEventDispatcher");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(20868);
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            cVar.mo56389s("No client attached: %s", a2);
            return;
        }
        ((C87682aj) b.mo56107c()).mo19965fM(serviceEventData);
    }
}
