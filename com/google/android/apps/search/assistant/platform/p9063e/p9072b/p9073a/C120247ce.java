package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119692k;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9032d.C119736a;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ce */
/* compiled from: PG */
public final /* synthetic */ class C120247ce implements Function {

    /* renamed from: a */
    public final /* synthetic */ C120252cj f334607a;

    public /* synthetic */ C120247ce(C120252cj cjVar) {
        this.f334607a = cjVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C120222bl blVar = this.f334607a.f334612a;
        Executor executor = (Executor) blVar.f334562a.mo17428b();
        executor.getClass();
        C119692k kVar = (C119692k) blVar.f334563b.mo17428b();
        kVar.getClass();
        C119736a aVar = (C119736a) blVar.f334564c.mo17428b();
        aVar.getClass();
        return new C120221bk(executor, kVar, aVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
