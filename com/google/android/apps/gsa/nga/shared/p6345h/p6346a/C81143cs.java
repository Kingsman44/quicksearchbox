package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81240ae;
import com.google.android.apps.gsa.nga.shared.p6345h.C81241af;
import com.google.android.apps.gsa.nga.shared.p6345h.C81271bb;
import com.google.android.apps.gsa.nga.shared.p6345h.C81272bc;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.cs */
/* compiled from: PG */
public final /* synthetic */ class C81143cs implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C81143cs f222264a = new C81143cs();

    private /* synthetic */ C81143cs() {
    }

    public final Object apply(Object obj) {
        C81241af afVar = (C81241af) obj;
        C81272bc bcVar = afVar.f222413b;
        if (bcVar == null) {
            bcVar = C81272bc.f222473e;
        }
        C81240ae aeVar = (C81240ae) afVar.toBuilder();
        C81271bb bbVar = (C81271bb) bcVar.toBuilder();
        int i = bcVar.f222478d;
        bbVar.copyOnWrite();
        C81272bc bcVar2 = (C81272bc) bbVar.instance;
        bcVar2.f222475a |= 4;
        bcVar2.f222478d = i + 1;
        C81272bc bcVar3 = (C81272bc) bbVar.build();
        aeVar.copyOnWrite();
        C81241af afVar2 = (C81241af) aeVar.instance;
        bcVar3.getClass();
        afVar2.f222413b = bcVar3;
        afVar2.f222412a |= 1;
        return (C81241af) aeVar.build();
    }
}
