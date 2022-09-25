package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;

/* renamed from: com.google.android.apps.gsa.speech.e.c.o */
/* compiled from: PG */
public final class C92278o {
    /* renamed from: a */
    public static void m151529a(C58833ax axVar, C89849ae aeVar, long j, C89859i iVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(j));
        if (axVar.mo56113h()) {
            C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
            int b = ((C90528t) axVar.mo56107c()).mo79844b();
            eVar.copyOnWrite();
            C59770f fVar2 = (C59770f) eVar.instance;
            fVar2.f161503a |= 1;
            fVar2.f161504b = b;
            int i = ((C90528t) axVar.mo56107c()).f253082c;
            eVar.copyOnWrite();
            C59770f fVar3 = (C59770f) eVar.instance;
            fVar3.f161503a |= 2;
            fVar3.f161505c = i;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.mo57008e((C59770f) eVar.build());
            fVar.f246203c = (C59687cb) ajVar.build();
        }
        iVar.mo74236a(fVar.mo83699a());
    }
}
