package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.l */
/* compiled from: PG */
public final /* synthetic */ class C131827l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131829n f360032a;

    public /* synthetic */ C131827l(C131829n nVar) {
        this.f360032a = nVar;
    }

    public final C60870cx apply(Object obj) {
        C131829n nVar = this.f360032a;
        C58485gu guVar = (C58485gu) obj;
        if (!guVar.isEmpty()) {
            return nVar.f360035a.mo110318b((String) guVar.get(0));
        }
        throw new IllegalStateException("No trace files found");
    }
}
