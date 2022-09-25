package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113255ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41664ad;
import com.google.android.libraries.searchbox.shared.suggestion.C41667ag;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.b */
/* compiled from: PG */
public final /* synthetic */ class C111665b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111671h f310439a;

    /* renamed from: b */
    public final /* synthetic */ C48578al f310440b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f310441c;

    /* renamed from: d */
    public final /* synthetic */ boolean f310442d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f310443e;

    public /* synthetic */ C111665b(C111671h hVar, C48578al alVar, C60870cx cxVar, boolean z, C60870cx cxVar2) {
        this.f310439a = hVar;
        this.f310440b = alVar;
        this.f310441c = cxVar;
        this.f310442d = z;
        this.f310443e = cxVar2;
    }

    public final Object call() {
        C58485gu guVar;
        C111671h hVar = this.f310439a;
        C48578al alVar = this.f310440b;
        C60870cx cxVar = this.f310441c;
        boolean z = this.f310442d;
        C60870cx cxVar2 = this.f310443e;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        if (optional.isEmpty()) {
            guVar = C58485gu.m89845m();
        } else {
            C58976aa aaVar = C58975e.f156826a;
            optional.get();
            C41664ad adVar = (C41664ad) C41667ag.f108943h.createBuilder();
            String str = (String) optional.get();
            adVar.copyOnWrite();
            C41667ag agVar = (C41667ag) adVar.instance;
            str.getClass();
            agVar.f108945a |= 1;
            agVar.f108946b = str;
            adVar.copyOnWrite();
            C41667ag agVar2 = (C41667ag) adVar.instance;
            agVar2.f108947c = 2;
            agVar2.f108945a = 2 | agVar2.f108945a;
            C41667ag agVar3 = (C41667ag) adVar.build();
            C41678d dVar = (C41678d) C41679e.f109005p.createBuilder();
            dVar.copyOnWrite();
            C41679e eVar = (C41679e) dVar.instance;
            agVar3.getClass();
            eVar.f109016j = agVar3;
            eVar.f109007a |= 512;
            C113414ey R = C113415ez.m187750R();
            R.mo100167l(20011);
            R.mo100180y(12100);
            R.mo100177v(C48580an.APP_ACTIONS_SLICE);
            R.mo100161f((C41679e) dVar.build());
            R.mo100175t(C48672ag.TAPAS_SERVER);
            R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
            C113386e eVar2 = (C113386e) R;
            eVar2.f313956d = Optional.m71637of(alVar);
            eVar2.f313968p = C58485gu.m89844l(new C113341cl[]{(C113341cl) hVar.f310455a.mo99182a(alVar).orElse(C113341cl.m187503d(new C113255ah(R.drawable.product_logo_settings_alt_color_36)))});
            guVar = C58485gu.m89846n(R.mo100156a());
        }
        if (!z) {
            return guVar;
        }
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(guVar);
        e.mo55396h((Iterable) C60856cj.m92909r(cxVar2));
        return e.mo55394f();
    }
}
