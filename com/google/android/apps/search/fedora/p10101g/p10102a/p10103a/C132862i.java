package com.google.android.apps.search.fedora.p10101g.p10102a.p10103a;

import com.google.android.apps.search.fedora.p10096d.p10098b.C132758c;
import com.google.android.apps.search.fedora.p10096d.p10098b.C132762g;
import com.google.android.apps.search.fedora.p10096d.p10098b.C132764i;
import com.google.android.apps.search.fedora.p10096d.p10098b.C132766k;
import com.google.android.apps.search.fedora.p10096d.p10098b.C132768m;
import com.google.android.apps.search.fedora.p10100f.C132838e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.fedora.g.a.a.i */
/* compiled from: PG */
public final class C132862i extends C132758c {

    /* renamed from: a */
    public static final C59071e f362472a = C59071e.m91332i("com.google.android.apps.search.fedora.g.a.a.i");

    /* renamed from: b */
    public final C132838e f362473b;

    /* renamed from: c */
    public final C132870q f362474c;

    /* renamed from: d */
    private final C60887da f362475d;

    /* renamed from: e */
    private final C47632e f362476e = new C47632e();

    public C132862i(C132838e eVar, C60887da daVar, C132870q qVar) {
        this.f362473b = eVar;
        this.f362475d = daVar;
        this.f362474c = qVar;
    }

    /* renamed from: b */
    public final void mo110901b(C132762g gVar, C70862aj ajVar) {
        C60870cx b = this.f362476e.mo51512b(new C132854a(this, gVar), this.f362475d);
        C132860g gVar2 = new C132860g(ajVar);
        C60856cj.m92911t(b, C47810es.m84974n(gVar2), this.f362475d);
    }

    /* renamed from: c */
    public final void mo110902c(C132764i iVar, C70862aj ajVar) {
        C59104x b = f362472a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraSettingsServer");
        ((C59052c) ((C59052c) b).mo56372aa(39869)).mo56389s("Setting FedHotOptInEnabled to %s", Boolean.valueOf(iVar.f362212b));
        C60870cx b2 = this.f362476e.mo51512b(new C132856c(this, iVar), this.f362475d);
        C132858e eVar = new C132858e(ajVar);
        C60856cj.m92911t(b2, C47810es.m84974n(eVar), this.f362475d);
    }

    /* renamed from: d */
    public final void mo110903d(C132766k kVar, C70862aj ajVar) {
        C59104x b = f362472a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraSettingsServer");
        ((C59052c) ((C59052c) b).mo56372aa(39870)).mo56389s("Setting SheldonOptInEnabled to %s", Boolean.valueOf(kVar.f362216b));
        C60870cx b2 = this.f362476e.mo51512b(new C132857d(this, kVar), this.f362475d);
        C132859f fVar = new C132859f(ajVar);
        C60856cj.m92911t(b2, C47810es.m84974n(fVar), this.f362475d);
    }

    /* renamed from: e */
    public final void mo110904e(C132768m mVar, C70862aj ajVar) {
        C59104x b = f362472a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraSettingsServer");
        ((C59052c) ((C59052c) b).mo56372aa(39871)).mo56389s("Setting UnintendedOptInEnabled to %s", Boolean.valueOf(mVar.f362219a));
        C60870cx b2 = this.f362476e.mo51512b(new C132855b(this, mVar), this.f362475d);
        C132861h hVar = new C132861h(ajVar);
        C60856cj.m92911t(b2, C47810es.m84974n(hVar), this.f362475d);
    }
}
