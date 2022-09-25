package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a.C13669b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.e.f */
/* compiled from: PG */
public final /* synthetic */ class C13687f implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C13688g f41767a;

    public /* synthetic */ C13687f(C13688g gVar) {
        this.f41767a = gVar;
    }

    public final void accept(Object obj, Object obj2) {
        C13688g gVar = this.f41767a;
        String str = (String) obj;
        C13684c cVar = (C13684c) obj2;
        if (!Boolean.valueOf(cVar.f41758e.get()).booleanValue()) {
            C59104x b = C13688g.f41768a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "UAAReqResManager");
            ((C59052c) ((C59052c) b).mo56372aa(44960)).mo56386p("#registerDataSender, starting a completer");
            C13669b bVar = gVar.f41772e;
            bVar.getClass();
            cVar.mo21220c(bVar);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
