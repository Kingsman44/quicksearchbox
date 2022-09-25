package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13032at;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.w */
/* compiled from: PG */
public final class C12503w implements C12502v {
    /* renamed from: a */
    public final Class mo20631a() {
        return C13033au.class;
    }

    /* renamed from: b */
    public final void mo20632b(C13059e eVar, MessageLite messageLite) {
        C12501u.m28606a(this, messageLite);
        C13033au auVar = (C13033au) messageLite;
        eVar.copyOnWrite();
        C13060f fVar = (C13060f) eVar.instance;
        C13060f fVar2 = C13060f.f40536l;
        auVar.getClass();
        fVar.f40540c = auVar;
        fVar.f40538a |= 2;
        if ((((C13060f) eVar.instance).f40538a & 8) != 0 && auVar.f40464a == 1) {
            C13032at atVar = (C13032at) auVar.f40465b;
            if (((atVar.f40459a & 1) != 0 && !atVar.f40460b.isEmpty()) || ((atVar.f40459a & 2) != 0 && !atVar.f40461c.isEmpty())) {
                C16627a aVar = (C16627a) C16662b.f48800l.createBuilder();
                aVar.copyOnWrite();
                C16662b bVar = (C16662b) aVar.instance;
                bVar.f48802a = 1 | bVar.f48802a;
                bVar.f48803b = false;
                eVar.copyOnWrite();
                C13060f fVar3 = (C13060f) eVar.instance;
                C16662b bVar2 = (C16662b) aVar.build();
                bVar2.getClass();
                fVar3.f40542e = bVar2;
                fVar3.f40538a |= 8;
            }
        }
    }
}
