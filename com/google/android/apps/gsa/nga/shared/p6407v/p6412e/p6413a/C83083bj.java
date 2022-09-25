package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82984hs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.bj */
/* compiled from: PG */
public final class C83083bj implements Function {

    /* renamed from: a */
    private final C83076bc f226693a;

    public C83083bj(C83076bc bcVar) {
        this.f226693a = bcVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C82988hw hwVar = (C82988hw) obj;
        C82984hs hsVar = (C82984hs) C82988hw.f226443y.createBuilder();
        boolean z = (hwVar.f226448b & 512) != 0;
        Objects.requireNonNull(hwVar);
        C83081bh bhVar = new C83081bh(hwVar);
        Objects.requireNonNull(hsVar);
        C83080bg.m132479c(z, bhVar, new C83082bi(hsVar), this.f226693a);
        return (C82988hw) hsVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
