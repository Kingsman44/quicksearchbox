package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.bs */
/* compiled from: PG */
public final /* synthetic */ class C81116bs implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C81116bs f222238a = new C81116bs();

    private /* synthetic */ C81116bs() {
    }

    public final Object apply(Object obj) {
        C81237ab abVar = (C81237ab) obj;
        int i = (abVar.f222382a & C89885b.HTTP_VALUE) != 0 ? abVar.f222407z : 0;
        if (i >= Integer.MAX_VALUE) {
            return abVar;
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a = 262144 | abVar2.f222382a;
        abVar2.f222407z = i + 1;
        return (C81237ab) xVar.build();
    }
}
