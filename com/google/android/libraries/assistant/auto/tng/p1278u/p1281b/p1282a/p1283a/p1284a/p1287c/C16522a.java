package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a.p1287c;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14868db;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14871de;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C16522a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C14871de f48510a;

    public /* synthetic */ C16522a(C14871de deVar) {
        this.f48510a = deVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C14871de deVar = this.f48510a;
        C12991i iVar = (C12991i) obj;
        if (deVar.f44754a == null) {
            C14868db dbVar = new C14868db(deVar);
            deVar.f44754a = C60856cj.m92904m(C47810es.m84978r(dbVar), deVar.f44755b);
        }
        return deVar.f44754a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
