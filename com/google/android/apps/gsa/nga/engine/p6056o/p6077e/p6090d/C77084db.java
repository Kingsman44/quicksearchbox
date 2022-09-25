package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.db */
/* compiled from: PG */
public final /* synthetic */ class C77084db implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C80913i f212745a;

    /* renamed from: b */
    public final /* synthetic */ C80913i f212746b;

    public /* synthetic */ C77084db(C80913i iVar, C80913i iVar2) {
        this.f212745a = iVar;
        this.f212746b = iVar2;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C80913i iVar = this.f212745a;
        C80913i iVar2 = this.f212746b;
        Optional optional = (Optional) obj;
        long longValue = ((Long) ((C58485gu) iVar.mo74714i()).get(0)).longValue();
        af afVar = (af) iVar2.mo74714i();
        if (optional.isPresent()) {
            return Optional.m71637of(new C77127h(longValue, (C74851z) optional.get(), afVar));
        }
        ((C58970a) ((C58970a) C77089dg.f212747a.mo56224b()).mo56372aa(3819)).mo56386p("AUM failed to resolve contact endpoint");
        return Optional.empty();
    }
}
