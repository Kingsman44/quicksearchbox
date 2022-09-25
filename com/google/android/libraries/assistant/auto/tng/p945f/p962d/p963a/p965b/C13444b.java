package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C13444b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C13454h f41279a;

    /* renamed from: b */
    public final /* synthetic */ C13543s f41280b;

    public /* synthetic */ C13444b(C13454h hVar, C13543s sVar) {
        this.f41279a = hVar;
        this.f41280b = sVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C13454h hVar = this.f41279a;
        Map.Entry entry = (Map.Entry) obj;
        C58485gu guVar = (C58485gu) Collection.EL.stream((Set) entry.getValue()).map(new C13451e(this.f41280b)).collect(C58370cn.f155946a);
        C60870cx a = C47638k.m84752c(guVar).mo51520a(new C13452f(guVar), hVar.f41289b);
        C13453g gVar = new C13453g(entry);
        return C60922j.m93044g(a, C47810es.m84963c(gVar), hVar.f41289b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
