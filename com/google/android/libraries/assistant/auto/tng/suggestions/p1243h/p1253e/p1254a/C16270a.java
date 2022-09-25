package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.p1254a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C16270a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C123745bl f47902a;

    public /* synthetic */ C16270a(C123745bl blVar) {
        this.f47902a = blVar;
    }

    public final void accept(Object obj) {
        C123745bl blVar = this.f47902a;
        C123730ax axVar = (C123730ax) obj;
        Duration duration = C16280k.f47920a;
        C123743bj bjVar = (C123743bj) C123744bk.f341804l.createBuilder();
        bjVar.copyOnWrite();
        C123744bk bkVar = (C123744bk) bjVar.instance;
        axVar.getClass();
        bkVar.f341809d = axVar;
        bkVar.f341808c = 5;
        blVar.mo106125b(bjVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
