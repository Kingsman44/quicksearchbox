package com.google.android.apps.search.assistant.verticals.automation.routines.p10031f.p10032a;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131841b;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10023b.p10024a.C131848a;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10023b.p10024a.C131849b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3861at.aff;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.f.a.i */
/* compiled from: PG */
public final /* synthetic */ class C131888i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131893n f360145a;

    /* renamed from: b */
    public final /* synthetic */ boolean f360146b;

    /* renamed from: c */
    public final /* synthetic */ aff f360147c;

    public /* synthetic */ C131888i(C131893n nVar, boolean z, aff aff) {
        this.f360145a = nVar;
        this.f360146b = z;
        this.f360147c = aff;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C131893n nVar = this.f360145a;
        boolean z = this.f360146b;
        aff aff = this.f360147c;
        if (z) {
            C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
            double d = aff.f129153c;
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155252a = d;
            double d2 = aff.f129154d;
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155253b = d2;
            return C60856cj.m92900i((C58079k) jVar.build());
        }
        C59052c cVar = (C59052c) C131893n.f360160a.mo56226d();
        cVar.mo56374ac(30, TimeUnit.SECONDS);
        ((C59052c) cVar.mo56372aa(39481)).mo56386p("Lat-lng not provided from Routines Settings so attempting geocoding");
        String str = aff.f129152b;
        C131849b bVar = nVar.f360164e;
        C131841b bVar2 = nVar.f360161b.f360072f;
        if (bVar2 == null) {
            bVar2 = C131841b.f360050b;
        }
        return C47633f.m84733g(C47633f.m84733g(bVar.f360077a.mo19399b(C47810es.m84978r(new C131848a(bVar, str, bVar2.f360052a)))).mo51513e(Throwable.class, new C131885f(), nVar.f360163d).mo51515h(new C131886g(str), nVar.f360163d)).mo51515h(C131887h.f360144a, nVar.f360163d);
    }
}
