package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125751p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.bb */
/* compiled from: PG */
public final /* synthetic */ class C126215bb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126223bj f347784a;

    /* renamed from: b */
    public final /* synthetic */ String f347785b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f347786c;

    public /* synthetic */ C126215bb(C126223bj bjVar, String str, C58485gu guVar) {
        this.f347784a = bjVar;
        this.f347785b = str;
        this.f347786c = guVar;
    }

    public final C60870cx apply(Object obj) {
        C126223bj bjVar = this.f347784a;
        String str = this.f347785b;
        C58485gu guVar = this.f347786c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return bjVar.mo107467d(str, guVar);
        }
        ((C125751p) optional.get()).f346565c.mo107031a();
        ((C125751p) optional.get()).f346564b.size();
        int a = ((C125751p) optional.get()).f346565c.mo107031a();
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            ((C59052c) ((C59052c) C126223bj.f347801a.mo56224b()).mo56372aa(36948)).mo56386p("Got fulfillment from NLU [SD]");
            return bjVar.mo107466c(str, (C125751p) optional.get());
        } else if (i == 1) {
            ((C59052c) ((C59052c) C126223bj.f347801a.mo56224b()).mo56372aa(36950)).mo56386p("Got query-agnostic fulfillment [SD]");
            return C60922j.m93045h(bjVar.mo107467d(str, guVar), C47810es.m84966f(new C126219bf(bjVar, optional)), bjVar.f347811k);
        } else if (i == 2) {
            ((C59052c) ((C59052c) C126223bj.f347801a.mo56224b()).mo56372aa(36949)).mo56386p("Got emoji fulfillment [SD]");
            return bjVar.mo107466c(str, (C125751p) optional.get());
        } else {
            throw new AssertionError();
        }
    }
}
