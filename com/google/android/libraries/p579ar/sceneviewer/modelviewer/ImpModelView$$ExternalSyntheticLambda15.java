package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda15 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda15 implements Function {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda15 INSTANCE = new ImpModelView$$ExternalSyntheticLambda15();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda15() {
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(ImpModelView.nAreOcclusionsAvailable(((Long) obj).longValue()));
    }

    public /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
