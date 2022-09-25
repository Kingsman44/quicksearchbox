package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10258c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10261f;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.assistant.p3861at.C49838aw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.e */
/* compiled from: PG */
public final /* synthetic */ class C10387e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10387e f35092a = new C10387e();

    private /* synthetic */ C10387e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C10258c cVar = (C10258c) C10261f.f34784d.createBuilder();
        C49838aw awVar = ((C10273r) obj).f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        cVar.copyOnWrite();
        C10261f fVar = (C10261f) cVar.instance;
        awVar.getClass();
        fVar.f34787b = awVar;
        fVar.f34786a |= 1;
        return (C10261f) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
