package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.view.session.ondevice.C27796a;
import com.google.android.libraries.lens.view.session.ondevice.C27970h;
import com.google.android.libraries.lens.view.session.ondevice.C27971i;
import com.google.android.libraries.lens.view.session.ondevice.C28012u;
import com.google.android.libraries.lens.view.session.ondevice.C28014w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4172bg.p4174b.C55719h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.be */
/* compiled from: PG */
final class C27875be implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56244ay f75971a;

    /* renamed from: b */
    final /* synthetic */ C27877bg f75972b;

    public C27875be(C27877bg bgVar, C56244ay ayVar) {
        this.f75972b = bgVar;
        this.f75971a = ayVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56382g(th)).mo56372aa(50032)).mo56386p("Failed to get DetectionBoxes result");
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C28014w wVar = this.f75972b.f75981g;
        C56244ay ayVar = this.f75971a;
        C27970h n = C27971i.m52077n();
        ((C27796a) n).f75835f = C27877bg.m51907b((C55719h) obj);
        wVar.f76228a.f76239b.execute(C47810es.m84977q(new C28012u(wVar, ayVar, n.mo33307a())));
    }
}
