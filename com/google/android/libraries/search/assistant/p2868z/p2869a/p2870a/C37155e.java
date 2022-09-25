package com.google.android.libraries.search.assistant.p2868z.p2869a.p2870a;

import com.google.assistant.p3861at.C50137ly;
import com.google.assistant.p3861at.act;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.p5209a.C66531b;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.z.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C37155e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C37155e f96752a = new C37155e();

    private /* synthetic */ C37155e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Object obj2;
        C66611ci ciVar = (C66611ci) obj;
        C62940bt r0 = C62942bv.checkIsLite(C66531b.f180944b);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C66531b.f180944b);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l);
            }
            C50137ly lyVar = (C50137ly) obj2;
            if ((lyVar.f130341a & 1) != 0) {
                act act = lyVar.f130342b;
                if (act == null) {
                    act = act.f128872P;
                }
                return Optional.m71637of(act);
            }
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
