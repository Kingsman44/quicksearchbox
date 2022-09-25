package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.search.global.C145900d;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.v */
/* compiled from: PG */
public final /* synthetic */ class C84455v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229844a;

    /* renamed from: b */
    public final /* synthetic */ C91043j f229845b;

    public /* synthetic */ C84455v(C84425ag agVar, C91043j jVar) {
        this.f229844a = agVar;
        this.f229845b = jVar;
    }

    public final void run() {
        C84425ag agVar = this.f229844a;
        C91043j jVar = this.f229845b;
        C84421ac acVar = agVar.f229720c;
        C58976aa aaVar = C58975e.f156826a;
        GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr = null;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            try {
                C143851w wVar = acVar.f229707a.f229712c;
                GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request = new GetGlobalSearchSourcesCall$Request();
                getGlobalSearchSourcesCall$Request.f394459a = true;
                GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = (GetGlobalSearchSourcesCall$Response) wVar.mo119159d(new C145900d(getGlobalSearchSourcesCall$Request, wVar)).mo117317b(C84425ag.f229719b, TimeUnit.MILLISECONDS);
                if (!getGlobalSearchSourcesCall$Response.f394460a.mo119097c()) {
                    C59104x c = C84425ag.f229718a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                    ((C59052c) ((C59052c) c).mo56372aa(9296)).mo56389s("Got error status from getGlobalSearchSources: %s", getGlobalSearchSourcesCall$Response.f394460a.f389622h);
                } else {
                    getGlobalSearchSourcesCall$GlobalSearchSourceArr = getGlobalSearchSourcesCall$Response.f394461b;
                }
            } catch (RuntimeException e) {
                C59104x c2 = C84425ag.f229718a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(9297)).mo56386p("Exception when calling getGlobalSearchSources");
            }
        }
        jVar.mo17709a(getGlobalSearchSourcesCall$GlobalSearchSourceArr);
    }
}
