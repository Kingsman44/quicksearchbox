package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.android.apps.gsa.nga.engine.au.i;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.az */
/* compiled from: PG */
public final /* synthetic */ class C76582az implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76582az f211822a = new C76582az();

    private /* synthetic */ C76582az() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Object obj2;
        C61762x xVar = ((C61746h) obj).f166798f;
        if (xVar == null) {
            xVar = C61762x.f166835e;
        }
        C62940bt r0 = C62942bv.checkIsLite(i.c);
        xVar.mo58887l(r0);
        Object l = xVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj2 = r0.f169969b;
        } else {
            obj2 = r0.mo58889c(l);
        }
        return Optional.m71637of((i) obj2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
