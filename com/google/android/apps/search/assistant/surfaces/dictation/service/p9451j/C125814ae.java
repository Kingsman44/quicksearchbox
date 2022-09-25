package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119265aa;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119304z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125385am;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.ae */
/* compiled from: PG */
public final /* synthetic */ class C125814ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f346738a;

    public /* synthetic */ C125814ae(C70862aj ajVar) {
        this.f346738a = ajVar;
    }

    public final void accept(Object obj) {
        C70862aj ajVar = this.f346738a;
        C125385am amVar = (C125385am) obj;
        C119304z zVar = (C119304z) C119265aa.f332604c.createBuilder();
        long j = amVar.f345822a;
        zVar.copyOnWrite();
        ((C119265aa) zVar.instance).f332606a = j;
        long j2 = amVar.f345823b;
        zVar.copyOnWrite();
        ((C119265aa) zVar.instance).f332607b = j2;
        ajVar.mo20123c((C119265aa) zVar.build());
        ajVar.mo20121a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
