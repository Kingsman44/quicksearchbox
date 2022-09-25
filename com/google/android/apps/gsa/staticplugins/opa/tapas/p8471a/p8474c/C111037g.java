package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.p8474c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.C111237c;
import com.google.assistant.p3781ad.p3789d.C48582b;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.c.g */
/* compiled from: PG */
public final /* synthetic */ class C111037g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111039i f309237a;

    /* renamed from: b */
    public final /* synthetic */ C48582b f309238b;

    public /* synthetic */ C111037g(C111039i iVar, C48582b bVar) {
        this.f309237a = iVar;
        this.f309238b = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C111237c) Map.EL.getOrDefault(this.f309237a.f309240a, new C111031a((String) ((Map.Entry) obj).getValue(), this.f309238b), C111237c.f309550d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
