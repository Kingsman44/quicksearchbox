package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.x */
/* compiled from: PG */
public final /* synthetic */ class C81233x implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C81233x f222375a = new C81233x();

    private /* synthetic */ C81233x() {
    }

    public final Object apply(Object obj) {
        C81237ab abVar = (C81237ab) obj;
        int i = (abVar.f222382a & C89885b.S3REQUEST_VALUE) != 0 ? abVar.f222406y : 0;
        if (i >= Integer.MAX_VALUE) {
            return abVar;
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a = 131072 | abVar2.f222382a;
        abVar2.f222406y = i + 1;
        xVar.copyOnWrite();
        C81237ab abVar3 = (C81237ab) xVar.instance;
        abVar3.f222382a |= C89885b.HTTP_VALUE;
        abVar3.f222407z = 0;
        return (C81237ab) xVar.build();
    }
}
