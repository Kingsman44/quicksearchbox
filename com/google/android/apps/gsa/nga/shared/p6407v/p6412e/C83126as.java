package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80439s;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80442v;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.as */
/* compiled from: PG */
public final /* synthetic */ class C83126as implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C83126as f226737a = new C83126as();

    private /* synthetic */ C83126as() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80442v vVar = (C80442v) obj;
        C80439s sVar = (C80439s) C80442v.f220789e.createBuilder();
        int i = vVar.f220791a;
        Objects.requireNonNull(vVar);
        C83114ag agVar = new C83114ag(vVar);
        Objects.requireNonNull(sVar);
        boolean z = true;
        C83080bg.m132478b(1 == (i & 1), agVar, new C83115ah(sVar));
        boolean z2 = (vVar.f220791a & 4) != 0;
        Objects.requireNonNull(vVar);
        C83116ai aiVar = new C83116ai(vVar);
        Objects.requireNonNull(sVar);
        C83080bg.m132478b(z2, aiVar, new C83117aj(sVar));
        if ((vVar.f220791a & 8) == 0) {
            z = false;
        }
        Objects.requireNonNull(vVar);
        C83118ak akVar = new C83118ak(vVar);
        Objects.requireNonNull(sVar);
        C83080bg.m132478b(z, akVar, new C83120am(sVar));
        return (C80442v) sVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
