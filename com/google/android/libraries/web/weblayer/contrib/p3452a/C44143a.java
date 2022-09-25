package com.google.android.libraries.web.weblayer.contrib.p3452a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import java.io.File;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.a */
/* compiled from: PG */
public final /* synthetic */ class C44143a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C44161s f114879a;

    public /* synthetic */ C44143a(C44161s sVar) {
        this.f114879a = sVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C44161s sVar = this.f114879a;
        C44151i iVar = new C44151i((File) obj);
        return C60856cj.m92904m(C47810es.m84978r(iVar), sVar.f114908e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
