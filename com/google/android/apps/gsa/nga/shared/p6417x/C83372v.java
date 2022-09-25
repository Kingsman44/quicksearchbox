package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.v */
/* compiled from: PG */
final class C83372v extends C83352b {

    /* renamed from: f */
    final /* synthetic */ Function f227226f;

    /* renamed from: g */
    final /* synthetic */ C58528ij f227227g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83372v(Class cls, C58528ij ijVar, Function function, C58528ij ijVar2) {
        super(cls, ijVar);
        this.f227226f = function;
        this.f227227g = ijVar2;
    }

    /* renamed from: b */
    public final Object mo76654b() {
        return this.f227226f.apply((C58485gu) Collection.EL.stream(this.f227227g).map(C83371u.f227225a).collect(C58370cn.f155946a));
    }
}
