package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58585km;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.b */
/* compiled from: PG */
public final /* synthetic */ class C10384b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58585km f35089a;

    public /* synthetic */ C10384b(C58585km kmVar) {
        this.f35089a = kmVar;
    }

    public final void accept(Object obj) {
        C58585km kmVar = this.f35089a;
        C10273r rVar = (C10273r) obj;
        C49838aw awVar = rVar.f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        C49826ak akVar = rVar.f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        kmVar.mo54920x(awVar, akVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
