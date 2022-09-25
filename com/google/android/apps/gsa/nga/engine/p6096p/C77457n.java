package com.google.android.apps.gsa.nga.engine.p6096p;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65845n;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.n */
/* compiled from: PG */
public final /* synthetic */ class C77457n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77457n f213483a = new C77457n();

    private /* synthetic */ C77457n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            C63070h hVar = ((C65768az) obj).f178799e;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            return Stream.CC.m71935of((C65845n) C62942bv.parseFrom((C62942bv) C65845n.f178992c, hVar.f170218b, C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) C77467x.f213494a.mo56225c()).mo56382g(e)).mo56372aa(3885)).mo56386p("Skip invalid entry");
            return Stream.CC.m71936of((T[]) new C65845n[0]);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
