package com.google.android.apps.search.assistant.verticals.automation.routines.p10034g;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131858a;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131860c;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131861d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.g.b */
/* compiled from: PG */
public final /* synthetic */ class C131896b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C131858a f360169a;

    public /* synthetic */ C131896b(C131858a aVar) {
        this.f360169a = aVar;
    }

    public final void accept(Object obj) {
        C131858a aVar = this.f360169a;
        C131860c cVar = (C131860c) obj;
        aVar.copyOnWrite();
        C131861d dVar = (C131861d) aVar.instance;
        C131861d dVar2 = C131861d.f360092d;
        cVar.getClass();
        dVar.f360096c = cVar;
        dVar.f360094a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
