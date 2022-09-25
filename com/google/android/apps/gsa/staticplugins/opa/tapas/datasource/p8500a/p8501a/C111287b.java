package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8501a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111054d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113260am;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113421fb;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C111287b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111296k f309686a;

    /* renamed from: b */
    public final /* synthetic */ String f309687b;

    /* renamed from: c */
    public final /* synthetic */ String f309688c;

    /* renamed from: d */
    public final /* synthetic */ Map f309689d;

    /* renamed from: e */
    public final /* synthetic */ double f309690e;

    /* renamed from: f */
    public final /* synthetic */ String f309691f;

    public /* synthetic */ C111287b(C111296k kVar, String str, String str2, Map map, double d, String str3) {
        this.f309686a = kVar;
        this.f309687b = str;
        this.f309688c = str2;
        this.f309689d = map;
        this.f309690e = d;
        this.f309691f = str3;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111296k kVar = this.f309686a;
        String str = this.f309687b;
        String str2 = this.f309688c;
        Map map = this.f309689d;
        double d = this.f309690e;
        String str3 = this.f309691f;
        C113414ey q = kVar.mo100187q();
        q.mo100164i(str);
        q.mo100180y(12050);
        q.mo100177v(C48580an.APP_DONATION);
        q.mo100167l(10001);
        C111054d dVar = kVar.f309715i;
        double doubleValue = ((Double) Map.EL.getOrDefault(map, str2, Double.valueOf(C59203do.f157270a))).doubleValue();
        double b = dVar.mo99038b(str2);
        C58976aa aaVar = C58975e.f156826a;
        q.mo100174s(dVar.f309270a.mo79747m(C90063do.f249275aU) + (dVar.f309270a.mo79747m(C90063do.f249237J) * doubleValue) + (dVar.f309270a.mo79747m(C90063do.f249239L) * d) + (dVar.f309270a.mo79747m(C90063do.f249238K) * b));
        C113260am amVar = new C113260am();
        amVar.f313623a = Optional.m71637of(str3);
        amVar.f313624b = Optional.m71637of(str2);
        q.mo100158c(amVar.mo99950a());
        q.mo100179x((C113421fb) obj);
        return q.mo100156a();
    }
}
