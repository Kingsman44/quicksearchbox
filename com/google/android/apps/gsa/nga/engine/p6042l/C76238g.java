package com.google.android.apps.gsa.nga.engine.p6042l;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.l.g */
/* compiled from: PG */
public final /* synthetic */ class C76238g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76244m f211251a;

    public /* synthetic */ C76238g(C76244m mVar) {
        this.f211251a = mVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76244m mVar = this.f211251a;
        C58485gu guVar = (C58485gu) obj;
        guVar.size();
        synchronized (mVar.f211261e) {
            mVar.f211262f = (C58528ij) Collection.EL.stream(guVar).map(C76243l.f211256a).collect(C58370cn.f155947b);
        }
        return C118826c.f331422a;
    }
}
