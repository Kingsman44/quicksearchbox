package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda17 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda17 implements Function {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda17 INSTANCE = new ImpModelView$$ExternalSyntheticLambda17();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda17() {
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(ImpModelView.nIsModelShown(((Long) obj).longValue()));
    }

    public /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
