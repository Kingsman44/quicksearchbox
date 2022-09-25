package com.google.android.libraries.search.assistant.invocation.p2641k.p2642a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71109fa;

/* renamed from: com.google.android.libraries.search.assistant.invocation.k.a.b */
/* compiled from: PG */
class C33916b implements Function {
    /* renamed from: a */
    public final C71109fa apply(C34043bf bfVar) {
        C34043bf bfVar2 = C34043bf.ENTRYPOINT_UNKNOWN;
        switch (bfVar.ordinal()) {
            case 0:
                return C71109fa.ENTRYPOINT_UNKNOWN;
            case 1:
                return C71109fa.ENTRYPOINT_SELF_INVOCATION;
            case 2:
                return C71109fa.ENTRYPOINT_LEGACY_HOTWORD;
            case 3:
                return C71109fa.ENTRYPOINT_HDM_HOTWORD;
            case 4:
                return C71109fa.ENTRYPOINT_SESSION;
            case 5:
                return C71109fa.ENTRYPOINT_LEGACY_PROGRAMMATIC;
            case 6:
                return C71109fa.ENTRYPOINT_QUICK_PHRASE;
            case 7:
                return C71109fa.ENTRYPOINT_TEST;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(bfVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
