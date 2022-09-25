package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import android.app.usage.UsageStats;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.ac */
/* compiled from: PG */
public final /* synthetic */ class C10381ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f35084a;

    public /* synthetic */ C10381ac(C58495hd hdVar) {
        this.f35084a = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58495hd hdVar = this.f35084a;
        C10273r rVar = (C10273r) obj;
        int i = C10383ae.f35085a;
        C49838aw awVar = rVar.f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        String str = awVar.f129507b;
        return new C10393k(rVar, hdVar.containsKey(str) ? ((UsageStats) hdVar.get(str)).getTotalTimeInForeground() : 0);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
