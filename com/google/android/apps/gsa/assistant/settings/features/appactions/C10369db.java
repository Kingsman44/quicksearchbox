package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10278w;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10279x;
import com.google.assistant.p3861at.C49838aw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.db */
/* compiled from: PG */
public final /* synthetic */ class C10369db implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10369db f35055a = new C10369db();

    private /* synthetic */ C10369db() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C10273r rVar = (C10273r) obj;
        C10278w wVar = (C10278w) C10279x.f34833d.createBuilder();
        C49838aw awVar = rVar.f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        String str = awVar.f129507b;
        wVar.copyOnWrite();
        C10279x xVar = (C10279x) wVar.instance;
        str.getClass();
        xVar.f34835a |= 1;
        xVar.f34836b = str;
        long j = rVar.f34822d;
        wVar.copyOnWrite();
        C10279x xVar2 = (C10279x) wVar.instance;
        xVar2.f34835a |= 2;
        xVar2.f34837c = j;
        return (C10279x) wVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
