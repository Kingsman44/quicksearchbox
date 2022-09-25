package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fx */
/* compiled from: PG */
public final /* synthetic */ class C104059fx implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f289535a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f289536b;

    public /* synthetic */ C104059fx(C60870cx cxVar, C60870cx cxVar2) {
        this.f289535a = cxVar;
        this.f289536b = cxVar2;
    }

    public final Object call() {
        return (C58528ij) Stream.CC.concat(Collection.EL.stream((C58485gu) C60856cj.m92909r(this.f289535a)).map(C104061fz.f289538a), Collection.EL.stream((C58485gu) C60856cj.m92909r(this.f289536b)).map(C104063ga.f289540a)).collect(C58370cn.f155947b);
    }
}
