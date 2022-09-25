package com.google.android.apps.search.assistant.verticals.ambient.p9905c;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3886c.C50794cr;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b */
/* compiled from: PG */
public final /* synthetic */ class C130554b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130583d f357610a;

    public /* synthetic */ C130554b(C130583d dVar) {
        this.f357610a = dVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130583d dVar = this.f357610a;
        C83739ak akVar = (C83739ak) obj;
        Map map = dVar.f357673b;
        C50794cr a = C50794cr.m85938a(akVar.f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return ((C130551a) Map.EL.getOrDefault(map, Integer.valueOf(a.f132222T), dVar.f357674c)).mo109724a(akVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
