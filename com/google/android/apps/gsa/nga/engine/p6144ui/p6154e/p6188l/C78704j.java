package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78251c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.LongFunction;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.j */
/* compiled from: PG */
public final /* synthetic */ class C78704j implements LongFunction {

    /* renamed from: a */
    public final /* synthetic */ C78251c[] f216633a;

    public /* synthetic */ C78704j(C78251c[] cVarArr) {
        this.f216633a = cVarArr;
    }

    public final Object apply(long j) {
        C78251c[] cVarArr = this.f216633a;
        C59071e eVar = C78711q.f216649a;
        if (j < 0 || j >= ((long) cVarArr.length)) {
            return C78251c.DISABLED;
        }
        return cVarArr[(int) j];
    }
}
