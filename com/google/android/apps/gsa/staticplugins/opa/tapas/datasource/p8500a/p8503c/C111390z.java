package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.z */
/* compiled from: PG */
public final /* synthetic */ class C111390z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111346ao f309930a;

    /* renamed from: b */
    public final /* synthetic */ boolean f309931b;

    /* renamed from: c */
    public final /* synthetic */ C49301bt f309932c;

    /* renamed from: d */
    public final /* synthetic */ C113405ep f309933d;

    /* renamed from: e */
    public final /* synthetic */ Map f309934e;

    public /* synthetic */ C111390z(C111346ao aoVar, boolean z, C49301bt btVar, C113405ep epVar, Map map) {
        this.f309930a = aoVar;
        this.f309931b = z;
        this.f309932c = btVar;
        this.f309933d = epVar;
        this.f309934e = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111346ao aoVar = this.f309930a;
        boolean z = this.f309931b;
        C49301bt btVar = this.f309932c;
        C113405ep epVar = this.f309933d;
        Map map = this.f309934e;
        C49270ap apVar = (C49270ap) obj;
        if (z) {
            C121537f fVar = C111346ao.f309834b;
            C60870cx a = ((C113167by) aoVar.f309840h.mo27525b()).mo99893a("buildSuggestionWrapper", new C111333ab(aoVar, btVar, epVar, apVar, map));
            fVar.mo105244m("buildSuggestionWrapperLightweight", a);
            return a;
        }
        C121537f fVar2 = C111346ao.f309834b;
        C60870cx b = aoVar.mo99109b(btVar, epVar, apVar, map);
        fVar2.mo105244m("buildSuggestionWrapper", b);
        return b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
