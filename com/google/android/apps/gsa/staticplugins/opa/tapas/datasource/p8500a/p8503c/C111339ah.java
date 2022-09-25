package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C111339ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111346ao f309824a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f309825b;

    /* renamed from: c */
    public final /* synthetic */ Map f309826c;

    public /* synthetic */ C111339ah(C111346ao aoVar, C113405ep epVar, Map map) {
        this.f309824a = aoVar;
        this.f309825b = epVar;
        this.f309826c = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111346ao aoVar = this.f309824a;
        C113405ep epVar = this.f309825b;
        Map map = this.f309826c;
        C49301bt btVar = (C49301bt) obj;
        if (aoVar.f309837e.mo79746e(C90063do.f249488eV)) {
            C121537f fVar = C111346ao.f309834b;
            C60870cx a = ((C113167by) aoVar.f309840h.mo27525b()).mo99893a("fetchSuggestionsFromDiscoveryInfo", new C111332aa(aoVar, btVar, epVar, map));
            fVar.mo105244m("fetchSuggestionsFromDiscoveryInfoLightweight", a);
            return a;
        }
        C121537f fVar2 = C111346ao.f309834b;
        C60870cx f = aoVar.mo99111f(btVar, epVar, map);
        fVar2.mo105244m("fetchSuggestionsFromDiscoveryInfo", f);
        return f;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
