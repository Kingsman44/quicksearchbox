package com.google.android.apps.gsa.nga.engine.education.p6016a;

import com.google.assistant.p4008y.p4009a.C53554an;
import com.google.assistant.p4008y.p4009a.C53593bz;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.v */
/* compiled from: PG */
public final /* synthetic */ class C75671v implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f210041a;

    public /* synthetic */ C75671v(Locale locale) {
        this.f210041a = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = this.f210041a;
        C53593bz bzVar = (C53593bz) obj;
        C53554an anVar = bzVar.f140666g;
        if (anVar == null) {
            anVar = C53554an.f140545b;
        }
        return Collection.EL.stream(anVar.f140547a).filter(C75661l.f210026a).map(new C75662m(bzVar, locale));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
