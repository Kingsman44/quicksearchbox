package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.r */
/* compiled from: PG */
public final /* synthetic */ class C81227r implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C81227r f222369a = new C81227r();

    private /* synthetic */ C81227r() {
    }

    public final Object apply(Object obj) {
        C81237ab abVar = (C81237ab) obj;
        int i = (abVar.f222382a & 4096) != 0 ? abVar.f222401t : 0;
        if (i >= Integer.MAX_VALUE) {
            return abVar;
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a |= 4096;
        abVar2.f222401t = i + 1;
        xVar.copyOnWrite();
        C81237ab abVar3 = (C81237ab) xVar.instance;
        abVar3.f222382a |= 16384;
        abVar3.f222403v = 0;
        return (C81237ab) xVar.build();
    }
}
