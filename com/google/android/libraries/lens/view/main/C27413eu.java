package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.p2148l.C27221a;
import com.google.android.libraries.lens.view.p2148l.C27226f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.sampleimages.C27697a;
import com.google.android.libraries.lens.view.sampleimages.C27698b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58833ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.main.eu */
/* compiled from: PG */
final class C27413eu implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75050a;

    public C27413eu(C27384dt dtVar) {
        this.f75050a = dtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C27697a aVar = (C27697a) bVar;
        C27384dt dtVar = this.f75050a;
        if (dtVar.f74923aS != null) {
            if (!dtVar.f74949as.mo56113h()) {
                dtVar.f74949as = C58833ax.m90834k(dtVar.f74892N.mo31203a().mo31185d());
            }
            C56306df dfVar = C56306df.AUTO_FILTER;
            if (C27698b.MATH.equals(aVar.f75627b)) {
                dfVar = C56306df.EDUCATION;
            } else if (aVar.f75627b.f75638j) {
                dfVar = C56306df.TRANSLATE;
            }
            dtVar.mo32952q().mo31225f(dfVar, false);
        }
        C27226f i = C27228h.m50544i();
        C27221a aVar2 = (C27221a) i;
        aVar2.f74418b = C58833ax.m90833j(aVar.f75626a);
        aVar2.f74420d = C58833ax.m90834k(C24226r.SAMPLE_IMAGES);
        dtVar.f74928aX = i.mo32662a();
        dtVar.mo32926M();
        return C47392e.f123115a;
    }
}
