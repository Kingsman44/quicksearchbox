package com.google.android.apps.search.transcription.p10670f;

import com.google.common.util.concurrent.C60872cz;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.transcription.f.aq */
/* compiled from: PG */
public final /* synthetic */ class C141798aq implements UnaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C141798aq f384817a = new C141798aq();

    private /* synthetic */ C141798aq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60872cz czVar = (C60872cz) obj;
        if (czVar == null) {
            return null;
        }
        czVar.cancel(true);
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
