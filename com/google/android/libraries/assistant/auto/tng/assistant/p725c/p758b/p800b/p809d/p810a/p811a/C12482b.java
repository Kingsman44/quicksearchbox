package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13017ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.b */
/* compiled from: PG */
public final class C12482b implements C12502v {
    /* renamed from: a */
    public final Class mo20631a() {
        return C13017ae.class;
    }

    /* renamed from: b */
    public final void mo20632b(C13059e eVar, MessageLite messageLite) {
        C12501u.m28606a(this, messageLite);
        C13017ae aeVar = (C13017ae) messageLite;
        if ((((C13060f) eVar.instance).f40538a & 8) == 0 && (aeVar.f40436a & 1) != 0) {
            C16662b bVar = aeVar.f40437b;
            if (bVar == null) {
                bVar = C16662b.f48800l;
            }
            eVar.copyOnWrite();
            C13060f fVar = (C13060f) eVar.instance;
            bVar.getClass();
            fVar.f40542e = bVar;
            fVar.f40538a |= 8;
        }
    }
}
