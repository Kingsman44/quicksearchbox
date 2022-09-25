package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58584kl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.s */
/* compiled from: PG */
public final /* synthetic */ class C10401s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58584kl f35106a;

    public /* synthetic */ C10401s(C58584kl klVar) {
        this.f35106a = klVar;
    }

    public final void accept(Object obj) {
        C58584kl klVar = this.f35106a;
        C10273r rVar = (C10273r) obj;
        int i = C10383ae.f35085a;
        C49838aw awVar = rVar.f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        klVar.mo55583a(awVar, rVar, (C58581ki) null);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
