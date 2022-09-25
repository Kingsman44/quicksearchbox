package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.az */
/* compiled from: PG */
public final /* synthetic */ class C81096az implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C81096az f222216a = new C81096az();

    private /* synthetic */ C81096az() {
    }

    public final Object apply(Object obj) {
        C81237ab abVar = (C81237ab) obj;
        int i = (abVar.f222382a & 16384) != 0 ? abVar.f222403v : 0;
        if (i >= Integer.MAX_VALUE) {
            return abVar;
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a |= 16384;
        abVar2.f222403v = i + 1;
        return (C81237ab) xVar.build();
    }
}
