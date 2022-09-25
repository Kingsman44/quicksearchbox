package com.google.android.libraries.search.assistant.p2868z.p2869a.p2870a;

import com.google.assistant.p3861at.acz;
import com.google.assistant.p3861at.aet;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.p5209a.C66531b;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.z.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C37153c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C37153c f96747a = new C37153c();

    private /* synthetic */ C37153c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Object obj2;
        C66611ci ciVar = (C66611ci) obj;
        C62940bt r0 = C62942bv.checkIsLite(C66531b.f180948f);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C66531b.f180948f);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l);
            }
            aet aet = (aet) obj2;
            if ((aet.f129132a & 2) != 0) {
                acz acz = aet.f129134c;
                if (acz == null) {
                    acz = acz.f129010n;
                }
                return Optional.m71637of(acz);
            }
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
