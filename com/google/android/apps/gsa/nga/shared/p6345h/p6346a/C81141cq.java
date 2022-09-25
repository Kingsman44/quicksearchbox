package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6345h.C81240ae;
import com.google.android.apps.gsa.nga.shared.p6345h.C81241af;
import com.google.android.apps.gsa.nga.shared.p6345h.C81324t;
import com.google.android.apps.gsa.nga.shared.p6345h.C81326v;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.cq */
/* compiled from: PG */
public final /* synthetic */ class C81141cq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f222262a;

    public /* synthetic */ C81141cq(C58833ax axVar) {
        this.f222262a = axVar;
    }

    public final Object apply(Object obj) {
        C81241af afVar = (C81241af) obj;
        String str = (String) this.f222262a.mo56109e(BuildConfig.FLAVOR);
        C81326v vVar = afVar.f222416e;
        if (vVar == null) {
            vVar = C81326v.f222601b;
        }
        C81240ae aeVar = (C81240ae) afVar.toBuilder();
        C81324t tVar = (C81324t) vVar.toBuilder();
        str.getClass();
        tVar.copyOnWrite();
        C81326v vVar2 = (C81326v) tVar.instance;
        C62995dn dnVar = vVar2.f222603a;
        if (!dnVar.f170058b) {
            vVar2.f222603a = dnVar.mo58980a();
        }
        vVar2.f222603a.put(str, true);
        aeVar.copyOnWrite();
        C81241af afVar2 = (C81241af) aeVar.instance;
        C81326v vVar3 = (C81326v) tVar.build();
        vVar3.getClass();
        afVar2.f222416e = vVar3;
        afVar2.f222412a |= 16;
        return (C81241af) aeVar.build();
    }
}
