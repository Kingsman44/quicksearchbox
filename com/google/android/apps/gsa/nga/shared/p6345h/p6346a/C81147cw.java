package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81240ae;
import com.google.android.apps.gsa.nga.shared.p6345h.C81241af;
import com.google.android.apps.gsa.nga.shared.p6345h.C81244ai;
import com.google.android.apps.gsa.nga.shared.p6345h.C81245aj;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.cw */
/* compiled from: PG */
public final /* synthetic */ class C81147cw implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f222268a;

    public /* synthetic */ C81147cw(long j) {
        this.f222268a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f222268a;
        C81241af afVar = (C81241af) obj;
        C81245aj ajVar = afVar.f222414c;
        if (ajVar == null) {
            ajVar = C81245aj.f222421c;
        }
        C81240ae aeVar = (C81240ae) afVar.toBuilder();
        C81244ai aiVar = (C81244ai) ajVar.toBuilder();
        aiVar.copyOnWrite();
        C81245aj ajVar2 = (C81245aj) aiVar.instance;
        ajVar2.f222423a |= 1;
        ajVar2.f222424b = j;
        C81245aj ajVar3 = (C81245aj) aiVar.build();
        aeVar.copyOnWrite();
        C81241af afVar2 = (C81241af) aeVar.instance;
        ajVar3.getClass();
        afVar2.f222414c = ajVar3;
        afVar2.f222412a |= 2;
        return (C81241af) aeVar.build();
    }
}
