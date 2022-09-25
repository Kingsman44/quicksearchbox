package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58574kb;
import com.google.common.p4522b.C58584kl;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.t */
/* compiled from: PG */
public final /* synthetic */ class C10402t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58584kl f35107a;

    /* renamed from: b */
    public final /* synthetic */ Set f35108b;

    /* renamed from: c */
    public final /* synthetic */ int f35109c;

    public /* synthetic */ C10402t(C58584kl klVar, Set set, int i) {
        this.f35107a = klVar;
        this.f35108b = set;
        this.f35109c = i;
    }

    public final void accept(Object obj) {
        C58584kl klVar = this.f35107a;
        Set set = this.f35108b;
        int i = this.f35109c;
        for (C10273r rVar : new C58574kb(klVar, (C49838aw) obj)) {
            if (set.size() < i && !set.contains(rVar)) {
                set.add(rVar);
                return;
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
