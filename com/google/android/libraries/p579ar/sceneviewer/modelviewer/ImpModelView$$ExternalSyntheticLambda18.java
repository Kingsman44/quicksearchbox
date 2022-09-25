package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda18 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda18 implements Function {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda18 INSTANCE = new ImpModelView$$ExternalSyntheticLambda18();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda18() {
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(ImpModelView.nGetMode(((Long) obj).longValue()));
    }

    public /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
