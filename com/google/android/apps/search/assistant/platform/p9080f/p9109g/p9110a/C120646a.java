package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.common.p4552o.C60420po;
import com.google.speech.p5218j.C67098kz;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.a */
/* compiled from: PG */
class C120646a implements Function {
    /* renamed from: a */
    public final C60420po apply(C67098kz kzVar) {
        C67098kz kzVar2 = C67098kz.UNKNOWN;
        switch (kzVar.ordinal()) {
            case 0:
                return C60420po.UNKNOWN;
            case 1:
                return C60420po.S3_NATIVE;
            case 2:
                return C60420po.S3_ENDPOINTER_FALLBACK;
            case 3:
                return C60420po.S3_TRUE_EOQ;
            case 4:
                return C60420po.SODA_ENDPOINTER_FALLBACK;
            case 5:
                return C60420po.SODA_TRUE_EOQ;
            case 6:
                return C60420po.SODA_NATIVE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(kzVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
