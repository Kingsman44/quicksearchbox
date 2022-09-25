package com.google.android.apps.search.fedora.p10100f;

import com.google.android.apps.search.fedora.p10099e.C132770aa;
import com.google.android.apps.search.fedora.p10099e.C132771ab;
import com.google.android.apps.search.fedora.p10099e.C132772ac;
import com.google.android.apps.search.fedora.p10099e.C132773ad;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.fedora.f.i */
/* compiled from: PG */
public final /* synthetic */ class C132842i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f362446a;

    public /* synthetic */ C132842i(C63042fg fgVar) {
        this.f362446a = fgVar;
    }

    public final Object apply(Object obj) {
        C63042fg fgVar = this.f362446a;
        C132773ad adVar = (C132773ad) obj;
        C132771ab abVar = adVar.f362230d;
        if (abVar == null) {
            abVar = C132771ab.f362221c;
        }
        C132770aa aaVar = (C132770aa) abVar.toBuilder();
        aaVar.copyOnWrite();
        C132771ab abVar2 = (C132771ab) aaVar.instance;
        fgVar.getClass();
        abVar2.f362224b = fgVar;
        abVar2.f362223a |= 1;
        C132771ab abVar3 = (C132771ab) aaVar.build();
        C132772ac acVar = (C132772ac) adVar.toBuilder();
        acVar.copyOnWrite();
        C132773ad adVar2 = (C132773ad) acVar.instance;
        abVar3.getClass();
        adVar2.f362230d = abVar3;
        adVar2.f362227a |= 4;
        return (C132773ad) acVar.build();
    }
}
