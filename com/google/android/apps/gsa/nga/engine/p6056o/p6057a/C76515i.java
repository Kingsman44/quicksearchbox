package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.i */
/* compiled from: PG */
public final /* synthetic */ class C76515i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76515i f211729a = new C76515i();

    private /* synthetic */ C76515i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52076ei eiVar;
        C52083ep epVar = (C52083ep) obj;
        C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        C51809dy dyVar = eiVar.f136668c;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        dyVar.getClass();
        gVar.f220648b = dyVar;
        gVar.f220647a = 1;
        return (C80394g) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
