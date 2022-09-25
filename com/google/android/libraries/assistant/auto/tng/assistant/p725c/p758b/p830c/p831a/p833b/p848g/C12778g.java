package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p848g;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.common.p898b.C13215a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.performer.communication.C35676dk;
import com.google.android.libraries.search.assistant.performer.communication.C35677dl;
import com.google.android.libraries.search.assistant.performer.communication.C35678dm;
import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
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
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.g.g */
/* compiled from: PG */
public final class C12778g implements C35472h {

    /* renamed from: a */
    private static final C59071e f39940a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.g.g");

    /* renamed from: b */
    private final Executor f39941b;

    /* renamed from: c */
    private final C13215a f39942c;

    /* renamed from: d */
    private final C35678dm f39943d;

    /* renamed from: e */
    private final C15481g f39944e;

    /* renamed from: f */
    private final C12801n f39945f;

    public C12778g(Executor executor, C13215a aVar, C35678dm dmVar, C15481g gVar, C12801n nVar) {
        this.f39941b = executor;
        this.f39942c = aVar;
        this.f39943d = dmVar;
        this.f39944e = gVar;
        this.f39945f = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f39944e.mo22352b(C37179a.f97448aT);
        if (!dyVar.f135936b.equals("navigate.FETCH_CURRENT_STATUS")) {
            C59104x c = f39940a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MapStateFetchPerformer");
            ((C59052c) ((C59052c) c).mo56372aa(44453)).mo56386p("Incorrect clientop");
            mo20787b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(new C35469e(dyVar.f135936b));
        }
        C35678dm dmVar = this.f39943d;
        C13215a aVar = this.f39942c;
        Objects.requireNonNull(aVar);
        C35677dl dlVar = C35677dl.f93565a;
        C60870cx g = C60922j.m93044g((C60870cx) new C12775d(aVar).mo6453a(), C47810es.m84963c(dlVar), dmVar.f93567b);
        C35676dk dkVar = C35676dk.f93564a;
        C60870cx g2 = C60846c.m92878g(g, Throwable.class, C47810es.m84963c(dkVar), dmVar.f93567b);
        C60870cx d = this.f39945f.mo20801d(g2);
        C12776e eVar = new C12776e(this);
        return C47638k.m84751b(C60922j.m93044g(d, C47810es.m84963c(eVar), this.f39941b), g2).mo51521b(new C12777f(g2), this.f39941b);
    }

    /* renamed from: b */
    public final void mo20787b(C62722b bVar) {
        C15481g gVar = this.f39944e;
        C37252a c = C37179a.f97449aU.mo40779c();
        c.mo40781e(bVar);
        gVar.mo22353c(c, Optional.empty());
    }
}
