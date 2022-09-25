package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13010a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13037ay;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13038b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.x */
/* compiled from: PG */
public final class C12504x implements C12502v {
    /* renamed from: a */
    public final Class mo20631a() {
        return C13037ay.class;
    }

    /* renamed from: b */
    public final void mo20632b(C13059e eVar, MessageLite messageLite) {
        C12501u.m28606a(this, messageLite);
        C13037ay ayVar = (C13037ay) messageLite;
        C13038b bVar = ((C13060f) eVar.instance).f40539b;
        if (bVar == null) {
            bVar = C13038b.f40471d;
        }
        C13010a aVar = (C13010a) bVar.toBuilder();
        aVar.copyOnWrite();
        C13038b bVar2 = (C13038b) aVar.instance;
        ayVar.getClass();
        bVar2.f40475c = ayVar;
        bVar2.f40473a |= 2;
        eVar.copyOnWrite();
        C13060f fVar = (C13060f) eVar.instance;
        C13038b bVar3 = (C13038b) aVar.build();
        bVar3.getClass();
        fVar.f40539b = bVar3;
        fVar.f40538a |= 1;
    }
}
