package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.function.BiFunction;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C80893ah implements Callable {

    /* renamed from: a */
    public final /* synthetic */ BiFunction f221856a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f221857b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f221858c;

    public /* synthetic */ C80893ah(BiFunction biFunction, C60870cx cxVar, C60870cx cxVar2) {
        this.f221856a = biFunction;
        this.f221857b = cxVar;
        this.f221858c = cxVar2;
    }

    public final Object call() {
        return this.f221856a.apply(C60856cj.m92909r(this.f221857b), C60856cj.m92909r(this.f221858c));
    }
}
