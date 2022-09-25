package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C14162c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C14168i f42909a;

    public /* synthetic */ C14162c(C14168i iVar) {
        this.f42909a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C14168i iVar = this.f42909a;
        String str = (String) ((Map.Entry) obj).getKey();
        long j = 0;
        if (iVar.f42920a.containsKey(str)) {
            j = ((C14167h) iVar.f42920a.get(str)).f42915b.orElse(0);
        }
        return Long.valueOf(j);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
