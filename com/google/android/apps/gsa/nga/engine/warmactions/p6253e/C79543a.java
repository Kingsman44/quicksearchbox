package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.a */
/* compiled from: PG */
class C79543a implements Function {
    /* renamed from: a */
    public final C89849ae apply(C79562t tVar) {
        C79562t tVar2 = C79562t.CONTEXT_START;
        switch (tVar.ordinal()) {
            case 0:
                return C89849ae.NGA_WARMACTIONS_CONTEXT_START;
            case 1:
                return C89849ae.NGA_WARMACTIONS_SODA_INITIALIZED;
            case 2:
                return C89849ae.NGA_WARMACTIONS_MIC_OPENED;
            case 3:
                return C89849ae.NGA_WARMACTIONS_SODA_START_CAPTURE;
            case 4:
                return C89849ae.NGA_WARMACTIONS_SODA_STOP_CAPTURE;
            case 5:
                return C89849ae.NGA_WARMACTIONS_FINAL_STAGE_VERIFIED;
            case 6:
                return C89849ae.NGA_WARMACTIONS_MIC_CLOSED;
            case 7:
                return C89849ae.NGA_WARMACTIONS_CONTEXT_END;
            case 8:
                return C89849ae.NGA_WARMACTIONS_CONTEXT_TIMEOUT;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(tVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
