package com.google.android.apps.gsa.search.core.p6775c.p6776a;

import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88015m;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88042n;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88069o;
import com.google.android.apps.gsa.shared.logger.p7065j.C89930a;
import com.google.p4500cm.p4518d.C58186c;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.search.core.c.a.a */
/* compiled from: PG */
public final class C85678a implements C89930a {

    /* renamed from: a */
    final /* synthetic */ C85679b f231631a;

    public C85678a(C85679b bVar) {
        this.f231631a = bVar;
    }

    /* renamed from: a */
    public final void mo79249a(C58186c cVar, boolean z) {
        C87681ai aiVar = this.f231631a.f231636d;
        C88489j jVar = new C88489j(C87739bu.ACTION_VE_LOGGING_EVENT);
        C62940bt btVar = C88015m.f238017a;
        C88042n nVar = (C88042n) C88069o.f238120d.createBuilder();
        nVar.copyOnWrite();
        C88069o oVar = (C88069o) nVar.instance;
        oVar.f238122a |= 1;
        oVar.f238123b = z;
        nVar.copyOnWrite();
        C88069o oVar2 = (C88069o) nVar.instance;
        cVar.getClass();
        oVar2.f238124c = cVar;
        oVar2.f238122a |= 2;
        jVar.mo82014b(btVar, (C88069o) nVar.build());
        aiVar.mo81937i(jVar.mo82013a());
    }
}
