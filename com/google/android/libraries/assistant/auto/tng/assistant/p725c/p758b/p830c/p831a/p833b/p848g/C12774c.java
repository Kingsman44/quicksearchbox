package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p848g;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.p2782r.C36379e;
import com.google.android.libraries.search.assistant.performer.communication.C35666da;
import com.google.android.libraries.search.assistant.performer.communication.C35761g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.g.c */
/* compiled from: PG */
public final class C12774c implements C35472h {

    /* renamed from: a */
    private static final C59071e f39929a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.g.c");

    /* renamed from: b */
    private final Executor f39930b;

    /* renamed from: c */
    private final C35666da f39931c;

    /* renamed from: d */
    private final C36197b f39932d;

    /* renamed from: e */
    private final C35470f f39933e;

    /* renamed from: f */
    private final C12801n f39934f;

    /* renamed from: g */
    private final C15481g f39935g;

    /* renamed from: h */
    private final C36379e f39936h;

    public C12774c(Executor executor, C35666da daVar, C36197b bVar, C35470f fVar, C12801n nVar, C15481g gVar, C36379e eVar) {
        this.f39930b = executor;
        this.f39931c = daVar;
        this.f39932d = bVar;
        this.f39933e = fVar;
        this.f39934f = nVar;
        this.f39935g = gVar;
        this.f39936h = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        this.f39935g.mo22352b(C37179a.f97446aR);
        C58976aa aaVar = C58975e.f156826a;
        if (!dyVar.f135936b.equals("precise_user_location.GET")) {
            C59104x c = f39929a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "StaticLocationFetcher");
            ((C59052c) ((C59052c) c).mo56372aa(44451)).mo56386p("Incorrect clientop");
            mo20786b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(new C35469e(dyVar.f135936b));
        }
        C35666da daVar = this.f39931c;
        C35761g gVar = new C35761g();
        C35470f fVar = this.f39933e;
        if (fVar != null) {
            gVar.f93687b = fVar;
            C36197b bVar = this.f39932d;
            if (bVar != null) {
                gVar.f93686a = bVar;
                C36379e eVar = this.f39936h;
                if (eVar != null) {
                    gVar.f93688c = eVar;
                    C60870cx a = daVar.mo39784a(gVar.mo39726a());
                    C60870cx d = this.f39934f.mo20801d(a);
                    C12772a aVar = new C12772a(this);
                    return C47638k.m84751b(C60922j.m93044g(d, C47810es.m84963c(aVar), this.f39930b), a).mo51521b(new C12773b(a), this.f39930b);
                }
                throw new NullPointerException("Null locationService");
            }
            throw new NullPointerException("Null permissionsRequester");
        }
        throw new NullPointerException("Null contextIntentStarter");
    }

    /* renamed from: b */
    public final void mo20786b(C62722b bVar) {
        C15481g gVar = this.f39935g;
        C37252a c = C37179a.f97447aS.mo40779c();
        c.mo40781e(bVar);
        gVar.mo22353c(c, Optional.empty());
    }
}
