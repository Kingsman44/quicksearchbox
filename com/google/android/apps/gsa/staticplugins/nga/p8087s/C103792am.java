package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import com.google.android.apps.gsa.nga.shared.p6345h.C81278bi;
import com.google.android.apps.gsa.nga.shared.p6345h.C81280bk;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.am */
/* compiled from: PG */
public final /* synthetic */ class C103792am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f289008a;

    public /* synthetic */ C103792am(boolean z) {
        this.f289008a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f289008a;
        C81278bi biVar = (C81278bi) ((C81280bk) obj).toBuilder();
        biVar.copyOnWrite();
        C81280bk bkVar = (C81280bk) biVar.instance;
        bkVar.f222498a |= 8;
        bkVar.f222502e = z;
        return (C81280bk) biVar.build();
    }
}
