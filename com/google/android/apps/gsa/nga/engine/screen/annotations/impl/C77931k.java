package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.engine.screen.annotations.impl.ScreenAnnotationEngineImpl;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60812at;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.k */
/* compiled from: PG */
public final /* synthetic */ class C77931k implements C60803ak {

    /* renamed from: a */
    public final /* synthetic */ ScreenAnnotationEngineImpl f214669a;

    /* renamed from: b */
    public final /* synthetic */ Executor f214670b;

    public /* synthetic */ C77931k(ScreenAnnotationEngineImpl screenAnnotationEngineImpl, Executor executor) {
        this.f214669a = screenAnnotationEngineImpl;
        this.f214670b = executor;
    }

    /* renamed from: a */
    public final Object mo23284a(C60812at atVar) {
        ScreenAnnotationEngineImpl screenAnnotationEngineImpl = this.f214669a;
        Executor executor = this.f214670b;
        ScreenAnnotationEngineImpl.NativeScreenContent nativeScreenContent = new ScreenAnnotationEngineImpl.NativeScreenContent(screenAnnotationEngineImpl.f214632d);
        atVar.mo57268a(nativeScreenContent, executor);
        return nativeScreenContent;
    }
}
