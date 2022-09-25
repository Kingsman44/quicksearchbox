package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.lens.sdk.avs.C24898o;
import com.google.android.libraries.lens.sdk.avs.data.C24869d;
import com.google.android.libraries.lens.sdk.avs.data.C24873h;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24881p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.f */
/* compiled from: PG */
public final /* synthetic */ class C78590f implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C78583aa f216386a;

    /* renamed from: b */
    public final /* synthetic */ C24898o f216387b;

    /* renamed from: c */
    public final /* synthetic */ C24876k f216388c;

    public /* synthetic */ C78590f(C78583aa aaVar, C24898o oVar, C24876k kVar) {
        this.f216386a = aaVar;
        this.f216387b = oVar;
        this.f216388c = kVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C78583aa aaVar = this.f216386a;
        C24898o oVar = this.f216387b;
        C24876k kVar = this.f216388c;
        cVar.mo5436a(new C78598n(aaVar, oVar), C60826bg.f164896a);
        oVar.mo30127d(new C78609y(aaVar, oVar, kVar, cVar));
        if (!oVar.mo30130g()) {
            cVar.mo5439d(new IllegalStateException("Lens visual search client not connected."));
        }
        C24881p pVar = new C24881p();
        C24869d dVar = new C24869d();
        dVar.mo30071d(1);
        dVar.mo30072e();
        pVar.mo30106d(dVar);
        if (aaVar.f216352l.mo85405j(C90040cs.f248672k)) {
            C58976aa aaVar2 = C58975e.f156826a;
            C24873h hVar = new C24873h();
            hVar.mo30083d();
            pVar.mo30107e(hVar);
            C24881p pVar2 = new C24881p();
            C24869d dVar2 = new C24869d();
            dVar2.mo30071d(1);
            dVar2.mo30072e();
            pVar2.mo30106d(dVar2);
            C24873h hVar2 = new C24873h();
            hVar2.mo30083d();
            pVar2.mo30107e(hVar2);
            oVar.mo30128e(pVar2);
            return "[NGA] fetch query result";
        } else if (!aaVar.f216352l.mo85405j(C90040cs.f248673l)) {
            return "[NGA] fetch query result";
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            new C90873ag(aaVar.f216357q.mo38012a(), aaVar.f216347g, "[NGA]  Fetching accountId in order to use Identified Appflow Logging in AVS", new C78600p(oVar)).mo85223a(C78601q.f216403a);
            return "[NGA] fetch query result";
        }
    }
}
