package com.google.android.apps.gsa.shared.p6983ah;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.shared.ah.f */
/* compiled from: PG */
public final /* synthetic */ class C89149f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C89150g f241680a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f241681b;

    /* renamed from: c */
    public final /* synthetic */ int f241682c;

    public /* synthetic */ C89149f(C89150g gVar, int i, C58833ax axVar) {
        this.f241680a = gVar;
        this.f241682c = i;
        this.f241681b = axVar;
    }

    public final void run() {
        C89150g gVar = this.f241680a;
        int i = this.f241682c;
        C58833ax axVar = this.f241681b;
        C89151h hVar = (C89151h) C89154k.f241700e.createBuilder();
        hVar.copyOnWrite();
        C89154k kVar = (C89154k) hVar.instance;
        kVar.f241704c = i - 1;
        kVar.f241702a |= 2;
        if (axVar.mo56113h()) {
            long longValue = ((Long) axVar.mo56107c()).longValue();
            hVar.copyOnWrite();
            C89154k kVar2 = (C89154k) hVar.instance;
            kVar2.f241702a |= 1;
            kVar2.f241703b = longValue;
        }
        gVar.f241690f = (C89154k) hVar.build();
        gVar.f241688d.mo5708l(gVar.f241690f);
    }
}
