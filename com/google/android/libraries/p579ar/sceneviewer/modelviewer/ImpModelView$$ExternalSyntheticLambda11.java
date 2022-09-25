package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView$$ExternalSyntheticLambda11 */
/* compiled from: PG */
public final /* synthetic */ class ImpModelView$$ExternalSyntheticLambda11 implements BiFunction {
    public static final /* synthetic */ ImpModelView$$ExternalSyntheticLambda11 INSTANCE = new ImpModelView$$ExternalSyntheticLambda11();

    private /* synthetic */ ImpModelView$$ExternalSyntheticLambda11() {
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(ImpModelView.nSetMode(((Long) obj).longValue(), ((Integer) obj2).intValue()));
    }
}
