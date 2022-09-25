package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10262g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10263h;
import com.google.assistant.p3861at.C49837av;
import com.google.assistant.p3861at.C49838aw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.aa */
/* compiled from: PG */
public final /* synthetic */ class C10195aa implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C10262g f34619a;

    public /* synthetic */ C10195aa(C10262g gVar) {
        this.f34619a = gVar;
    }

    public final void accept(Object obj) {
        C10262g gVar = this.f34619a;
        String str = (String) obj;
        C49837av avVar = (C49837av) C49838aw.f129504g.createBuilder();
        avVar.copyOnWrite();
        C49838aw awVar = (C49838aw) avVar.instance;
        str.getClass();
        awVar.f129506a |= 8;
        awVar.f129509d = str;
        C49838aw awVar2 = (C49838aw) avVar.build();
        gVar.copyOnWrite();
        C10263h hVar = (C10263h) gVar.instance;
        C10263h hVar2 = C10263h.f34789f;
        awVar2.getClass();
        hVar.f34795e = awVar2;
        hVar.f34791a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
