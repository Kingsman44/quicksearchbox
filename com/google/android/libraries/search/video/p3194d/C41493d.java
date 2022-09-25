package com.google.android.libraries.search.video.p3194d;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60887da;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;

/* renamed from: com.google.android.libraries.search.video.d.d */
/* compiled from: PG */
final class C41493d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C57143b f108394a;

    /* renamed from: b */
    final /* synthetic */ C60887da f108395b;

    /* renamed from: c */
    final /* synthetic */ C41494e f108396c;

    public C41493d(C41494e eVar, C57143b bVar, C60887da daVar) {
        this.f108396c = eVar;
        this.f108394a = bVar;
        this.f108395b = daVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C41494e.f108397a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AdsReporting");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(53897)).mo56386p("#maybeReportEngagedView(): HTTP request failed.");
        C41494e eVar = this.f108396c;
        eVar.f108400d++;
        eVar.mo44013b(this.f108394a, this.f108395b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int i = ((C61366ah) obj).f165947c;
        if (i == 204) {
            C41494e eVar = this.f108396c;
            eVar.f108399c = true;
            eVar.f108400d = 0;
            C59104x b = C41494e.f108397a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AdsReporting");
            ((C59052c) ((C59052c) b).mo56372aa(53899)).mo56386p("#maybeReportEngagedView(): Successful EV ping");
            return;
        }
        C59104x d = C41494e.f108397a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AdsReporting");
        ((C59052c) ((C59052c) d).mo56372aa(53898)).mo56387q("#maybeReportEngagedView(): status code = %d", i);
        C41494e eVar2 = this.f108396c;
        eVar2.f108400d++;
        eVar2.mo44013b(this.f108394a, this.f108395b);
    }
}
