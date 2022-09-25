package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78241b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.LongFunction;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.g */
/* compiled from: PG */
public final /* synthetic */ class C78701g implements LongFunction {

    /* renamed from: a */
    public final /* synthetic */ C78241b[] f216630a;

    public /* synthetic */ C78701g(C78241b[] bVarArr) {
        this.f216630a = bVarArr;
    }

    public final Object apply(long j) {
        C78241b[] bVarArr = this.f216630a;
        C59071e eVar = C78711q.f216649a;
        if (j < 0 || j >= ((long) bVarArr.length)) {
            return C78241b.CHIP_EXPANDED;
        }
        return bVarArr[(int) j];
    }
}
