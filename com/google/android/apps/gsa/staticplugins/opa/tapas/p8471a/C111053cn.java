package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112131q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113192cw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cn */
/* compiled from: PG */
public final class C111053cn {

    /* renamed from: g */
    public static final /* synthetic */ int f309260g = 0;

    /* renamed from: h */
    private static final C121537f f309261h = C121537f.m200840b("TapasAppActionsGellerFetcher", C121511c.f337208a);

    /* renamed from: i */
    private static final C59071e f309262i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.a.cn");

    /* renamed from: a */
    public final C86124t f309263a;

    /* renamed from: b */
    public final C22871g f309264b;

    /* renamed from: c */
    public final C113206m f309265c;

    /* renamed from: d */
    public final C68214a f309266d;

    /* renamed from: e */
    public final C111248k f309267e;

    /* renamed from: f */
    public final C113192cw f309268f;

    /* renamed from: j */
    private final C68214a f309269j;

    public C111053cn(C86124t tVar, C22871g gVar, C113192cw cwVar, C113206m mVar, C68214a aVar, C68214a aVar2, C111248k kVar) {
        this.f309263a = tVar;
        this.f309264b = gVar;
        this.f309268f = cwVar;
        this.f309265c = mVar;
        this.f309266d = aVar;
        this.f309269j = aVar2;
        this.f309267e = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo99036a(String str, Optional optional) {
        C121537f fVar = f309261h;
        C121492b a = fVar.mo105233a("runInitialDownloaderForGeller");
        C112131q qVar = (C112131q) this.f309269j.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        int i = 3;
        if (qVar.f311377b.mo79746e(C90063do.f249315bH) && qVar.mo99413e("tapas_setting_first_run_geller")) {
            if (!qVar.mo99411c()) {
                qVar.mo99410b("tapas_setting_first_run_geller");
            } else if (!qVar.f311378c.a(false)) {
                C59104x d = C112131q.f311376a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasSync");
                ((C59052c) ((C59052c) d).mo56372aa(27582)).mo56386p("Failed to trigger geller sync task");
                qVar.mo99410b("tapas_setting_first_run_geller");
                i = 2;
            } else {
                C59104x b = C112131q.f311376a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "TapasSync");
                ((C59052c) ((C59052c) b).mo56372aa(27581)).mo56386p("Geller sync success!");
                i = 1;
            }
        }
        int i2 = i - 1;
        if (i2 == 0 || i2 == 2) {
            a.mo105191d();
        } else {
            C59104x d2 = f309262i.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AppActionsFetcher");
            ((C59052c) ((C59052c) d2).mo56372aa(27084)).mo56386p("#fetch: initial downloading for geller resulted in an error.");
            a.mo105190c();
        }
        C60870cx b2 = this.f309268f.f313526a.b(str, C65753ak.APP_ACTIONS);
        C60870cx j = this.f309264b.mo28210j(b2, "read keys from geller", new C111041cb(this, optional, str));
        fVar.mo105244m("readAppActionsFromGeller", j);
        C60870cx h = C60922j.m93045h(j, new C111042cc(this), C60826bg.f164896a);
        return C60856cj.m92895d(h, b2).mo57334a(new C111043cd(this, h, b2), C60826bg.f164896a);
    }
}
