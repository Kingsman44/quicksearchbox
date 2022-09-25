package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58837ba;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.j */
/* compiled from: PG */
public final /* synthetic */ class C116861j implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C116863l f324335a;

    public /* synthetic */ C116861j(C116863l lVar) {
        this.f324335a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C116863l lVar = this.f324335a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return optional;
        }
        return Optional.m71637of(lVar.f324341e.mo28209i(lVar.f324339c.a(C58837ba.m90858g(lVar.f324338b.mo79659F()), C65753ak.APP_ACTIONS, (String) null, C63662ac.f172144a, C49301bt.f127423f), "AppShortcutsResponseFetcher.maptoPackageName", C116862k.f324336a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
