package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.f */
/* compiled from: PG */
public abstract class C76594f {
    /* renamed from: h */
    public static C76593e m123238h() {
        C76541a aVar = new C76541a();
        C76592d dVar = C76592d.f211840a;
        Optional empty = Optional.empty();
        if (dVar != null) {
            aVar.f211764a = dVar;
            aVar.mo72246e(empty);
            aVar.mo72245d(C80379i.f220555h);
            return aVar;
        }
        throw new NullPointerException("Null intentPredicate");
    }

    /* renamed from: a */
    public abstract C80379i mo72249a();

    /* renamed from: b */
    public abstract C58485gu mo72250b();

    /* renamed from: c */
    public abstract C58495hd mo72251c();

    /* renamed from: d */
    public abstract Optional mo72252d();

    /* renamed from: e */
    public abstract Optional mo72253e();

    /* renamed from: f */
    public abstract Supplier mo72255f();

    /* renamed from: g */
    public abstract int mo72256g();
}
