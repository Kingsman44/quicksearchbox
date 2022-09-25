package com.google.android.apps.gsa.shared.monet;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87991lc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88010lv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88011lw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.libraries.gsa.monet.p1886a.C22952q;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.shared.monet.p */
/* compiled from: PG */
final class C90345p implements C22952q {

    /* renamed from: a */
    final /* synthetic */ C90354y f252297a;

    /* renamed from: b */
    final /* synthetic */ C90347r f252298b;

    public C90345p(C90347r rVar, C90354y yVar) {
        this.f252298b = rVar;
        this.f252297a = yVar;
    }

    /* renamed from: a */
    public final void mo28325a() {
        this.f252298b.f252321o.mo57356n(C118826c.f331422a);
        C90354y yVar = this.f252297a;
        if (yVar.f252345d && !yVar.f252347f) {
            long d = yVar.f252343b.mo26872d();
            long j = yVar.f252346e;
            C87680ah ahVar = yVar.f252342a;
            C88489j jVar = new C88489j(C87739bu.MONET_CLIENT_EVENT);
            C62940bt btVar = C87987kz.f237952a;
            C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
            C88010lv lvVar = (C88010lv) C88011lw.f238004e.createBuilder();
            int i = yVar.f252344c.f330812sk;
            lvVar.copyOnWrite();
            C88011lw lwVar = (C88011lw) lvVar.instance;
            lwVar.f238006a |= 1;
            lwVar.f238009d = i;
            lvVar.copyOnWrite();
            C88011lw lwVar2 = (C88011lw) lvVar.instance;
            lwVar2.f238007b = 2;
            lwVar2.f238008c = Long.valueOf(d - j);
            lcVar.copyOnWrite();
            C88012lx lxVar = (C88012lx) lcVar.instance;
            C88011lw lwVar3 = (C88011lw) lvVar.build();
            lwVar3.getClass();
            lxVar.f238014c = lwVar3;
            lxVar.f238013b = 8;
            jVar.mo82014b(btVar, (C88012lx) lcVar.build());
            ahVar.mo81961c(jVar.mo82013a());
            yVar.f252347f = true;
        }
    }
}
