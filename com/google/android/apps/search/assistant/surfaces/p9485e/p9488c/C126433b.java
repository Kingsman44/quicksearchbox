package com.google.android.apps.search.assistant.surfaces.p9485e.p9488c;

import com.google.android.libraries.assistant.p1533o.C18447aj;
import com.google.common.p4552o.C60420po;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.c.b */
/* compiled from: PG */
public abstract class C126433b implements Function {
    /* renamed from: a */
    public final C60420po apply(C18447aj ajVar) {
        C18447aj ajVar2 = C18447aj.UNKNOWN;
        int ordinal = ajVar.ordinal();
        if (ordinal == 0) {
            return C60420po.UNKNOWN;
        }
        if (ordinal == 1) {
            return C60420po.S3_NATIVE;
        }
        if (ordinal == 2) {
            return C60420po.S3_ENDPOINTER_FALLBACK;
        }
        if (ordinal == 3) {
            return C60420po.S3_TRUE_EOQ;
        }
        if (ordinal == 4) {
            return mo107608b();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ajVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public abstract C60420po mo107608b();

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
