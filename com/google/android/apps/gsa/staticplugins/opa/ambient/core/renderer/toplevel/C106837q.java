package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.util.Pair;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.q */
/* compiled from: PG */
public final /* synthetic */ class C106837q implements Function {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297712a;

    public /* synthetic */ C106837q(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297712a = topLevelRendererHelper;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Pair pair = (Pair) obj;
        try {
            return (Optional) C60856cj.m92909r((C60870cx) pair.second);
        } catch (ExecutionException unused) {
            ((C58970a) ((C58970a) this.f297712a.f297684a.mo56226d()).mo56372aa(23321)).mo56389s("Failed to get childUseCase %s", ((C50701am) pair.first).name());
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
