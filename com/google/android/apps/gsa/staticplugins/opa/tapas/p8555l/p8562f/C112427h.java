package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8562f;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112189o;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import dagger.C68214a;
import java.util.Map;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.f.h */
/* compiled from: PG */
public final class C112427h {

    /* renamed from: a */
    public final C68214a f311911a;

    /* renamed from: b */
    private final C86124t f311912b;

    /* renamed from: c */
    private final C112189o f311913c;

    public C112427h(C68214a aVar, C86124t tVar, C112189o oVar) {
        this.f311911a = aVar;
        this.f311912b = tVar;
        this.f311913c = oVar;
    }

    /* renamed from: a */
    public final C58485gu mo99517a(C48674ai aiVar, Map map) {
        C58485gu guVar;
        C112189o oVar = this.f311913c;
        if (aiVar == C48674ai.INTENT_LAUNCHER) {
            guVar = oVar.f311486f.mo79749o(C90063do.f249506en);
        } else {
            guVar = oVar.f311486f.mo79749o(C90063do.f249505em);
        }
        return C58485gu.m89836F(Comparator.EL.reversed(Comparator.EL.thenComparing(Comparator.CC.comparing(new C112423d((C58495hd) IntStream.CC.range(0, guVar.size()).boxed().collect(C58370cn.m89403c(new C112420a(guVar), new C112421b(guVar), C112422c.f311905a)))), Comparator.CC.comparing(mo99518b()))), map.values());
    }

    /* renamed from: b */
    public final Function mo99518b() {
        if (this.f311912b.mo79746e(C90063do.f249553fh)) {
            return C112424e.f311907a;
        }
        return C112425f.f311908a;
    }
}
