package com.google.android.apps.gsa.staticplugins.opa.p8348c.p8349a;

import android.content.Context;
import com.google.android.apps.gsa.opa.C83609f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36872a;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36905d;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a.C36886j;
import com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a.C36899w;
import com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a.C36900x;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2847b.C36972g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.c.a.k */
/* compiled from: PG */
public final class C108126k implements C83609f {

    /* renamed from: a */
    private static final C59071e f300746a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.c.a.k");

    /* renamed from: b */
    private final C11059d f300747b;

    /* renamed from: c */
    private final C145948p f300748c;

    /* renamed from: d */
    private final C86124t f300749d;

    /* renamed from: e */
    private final C37215b f300750e;

    /* renamed from: f */
    private final C69464a f300751f;

    /* renamed from: g */
    private final C36886j f300752g;

    /* renamed from: h */
    private final C36972g f300753h;

    public C108126k(C86124t tVar, C36886j jVar, C11059d dVar, C36972g gVar, C145948p pVar, C37215b bVar, C69464a aVar) {
        this.f300752g = jVar;
        this.f300747b = dVar;
        this.f300753h = gVar;
        this.f300748c = pVar;
        this.f300749d = tVar;
        this.f300750e = bVar;
        this.f300751f = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo76968a() {
        ((C59052c) ((C59052c) f300746a.mo56224b()).mo56372aa(23628)).mo56386p("Kicking off  clock context reader.");
        C36905d e = C36906e.m65602e();
        C36872a aVar = (C36872a) e;
        aVar.f96026a = C58528ij.m90006F(C58528ij.m90006F(this.f300749d.mo79745c(C90066dr.f249669L)));
        aVar.f96027b = C58528ij.m90006F(C58528ij.m90006F(this.f300749d.mo79745c(C90066dr.f249670M)));
        e.mo40433b(this.f300749d.mo79746e(C90126fx.f251739oW));
        aVar.f96028c = C58528ij.m90006F(C58528ij.m90006F(((C65603f) this.f300751f.mo17428b()).f178307a));
        C36906e a = e.mo40432a();
        C36886j jVar = this.f300752g;
        C11059d dVar = this.f300747b;
        C36972g gVar = this.f300753h;
        C145948p pVar = this.f300748c;
        C37215b bVar = this.f300750e;
        C36900x xVar = jVar.f96045a;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) xVar.f96089a.mo17428b();
        scheduledExecutorService.getClass();
        Context context = (Context) xVar.f96090b.mo17428b();
        context.getClass();
        C21370a aVar2 = (C21370a) xVar.f96091c.mo17428b();
        aVar2.getClass();
        dVar.getClass();
        gVar.getClass();
        pVar.getClass();
        bVar.getClass();
        return new C36899w(scheduledExecutorService, context, aVar2, dVar, gVar, pVar, bVar).mo40445b(a);
    }
}
