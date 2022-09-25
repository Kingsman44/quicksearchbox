package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.p */
/* compiled from: PG */
public final /* synthetic */ class C76604p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C62917ay f211851a;

    public /* synthetic */ C76604p(C62917ay ayVar) {
        this.f211851a = ayVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61762x xVar = (C61762x) obj;
        C62940bt r0 = C62942bv.checkIsLite(this.f211851a);
        xVar.mo58887l(r0);
        Object l = xVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            return r0.f169969b;
        }
        return r0.mo58889c(l);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
