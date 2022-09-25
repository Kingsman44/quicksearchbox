package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.android.p10712d.C142329bh;
import com.google.android.p10712d.C142330bi;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.bi */
/* compiled from: PG */
public final class C124643bi extends C62934bn implements C63001dt {
    public C124643bi() {
        super(C124644bj.f343868n);
    }

    /* renamed from: a */
    public final void mo106573a(C142330bi biVar) {
        C142330bi biVar2;
        copyOnWrite();
        C124644bj bjVar = (C124644bj) this.instance;
        C124644bj bjVar2 = C124644bj.f343868n;
        biVar.getClass();
        C142330bi biVar3 = bjVar.f343881l;
        if (!(biVar3 == null || biVar3 == (biVar2 = C142330bi.f386146h))) {
            C142329bh bhVar = (C142329bh) biVar2.createBuilder(biVar3);
            bhVar.mergeFrom(biVar);
            biVar = (C142330bi) bhVar.buildPartial();
        }
        bjVar.f343881l = biVar;
        bjVar.f343870a |= 1024;
    }
}
