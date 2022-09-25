package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ai */
/* compiled from: PG */
public final /* synthetic */ class C131956ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131958ak f360282a;

    public /* synthetic */ C131956ai(C131958ak akVar) {
        this.f360282a = akVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f360282a.f360285b.mo41433d(C65753ak.ASSISTANT_SETTINGS, (String) obj, C63662ac.f172144a, 1, C65849r.f179002c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
