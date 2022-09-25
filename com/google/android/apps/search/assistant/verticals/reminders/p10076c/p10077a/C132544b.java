package com.google.android.apps.search.assistant.verticals.reminders.p10076c.p10077a;

import com.google.protos.p4985f.p5002e.C64834c;
import com.google.protos.p4985f.p5002e.C64835d;
import com.google.protos.p4985f.p5002e.C64840i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C132544b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64834c f361722a;

    public /* synthetic */ C132544b(C64834c cVar) {
        this.f361722a = cVar;
    }

    public final void accept(Object obj) {
        C64834c cVar = this.f361722a;
        cVar.copyOnWrite();
        C64835d dVar = (C64835d) cVar.instance;
        C64835d dVar2 = C64835d.f175689d;
        dVar.f175692b = ((C64840i) obj).f175719j;
        dVar.f175691a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
