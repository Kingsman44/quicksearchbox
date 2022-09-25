package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.x */
/* compiled from: PG */
public final /* synthetic */ class C120884x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C120844ak f336097a;

    /* renamed from: b */
    public final /* synthetic */ C120861ba f336098b;

    public /* synthetic */ C120884x(C120844ak akVar, C120861ba baVar) {
        this.f336097a = akVar;
        this.f336098b = baVar;
    }

    public final void accept(Object obj) {
        C120844ak akVar = this.f336097a;
        C33461o oVar = (C33461o) obj;
        this.f336098b.f336064b.mo19974a(C37176a.f97177gd);
        akVar.f336028j.mo104948e(C120510g.UTTERANCE_SHUTDOWN);
        akVar.f336029k.mo20121a();
        akVar.f336028j.mo104949f();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
