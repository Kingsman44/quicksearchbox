package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.assistant.p4008y.p4009a.C53554an;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58495hd;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C127759ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f351676a;

    public /* synthetic */ C127759ai(Locale locale) {
        this.f351676a = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = this.f351676a;
        C53593bz bzVar = (C53593bz) obj;
        C58495hd hdVar = C127760aj.f351677a;
        C53554an anVar = bzVar.f140666g;
        if (anVar == null) {
            anVar = C53554an.f140545b;
        }
        return Collection.EL.stream(anVar.f140547a).filter(C127754ad.f351669a).map(new C127755ae(bzVar, locale));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
