package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9175b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9175b.p9176a.C121195c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48680ao;
import com.google.assistant.p3781ad.p3789d.p3791b.C48682aq;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C121197c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C121199e f336704a;

    public /* synthetic */ C121197c(C121199e eVar) {
        this.f336704a = eVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48682aq aqVar = (C48682aq) obj;
        C121201g gVar = this.f336704a.f336708c;
        C48680ao aoVar = aqVar.f125951b;
        if (aoVar == null) {
            aoVar = C48680ao.f125940f;
        }
        Map map = gVar.f336711b;
        C48580an b = C48580an.m85241b(aoVar.f125945d);
        if (b == null) {
            b = C48580an.UNKNOWN;
        }
        if (!map.containsKey(b)) {
            return Optional.empty();
        }
        Map map2 = gVar.f336711b;
        C48580an b2 = C48580an.m85241b(aoVar.f125945d);
        if (b2 == null) {
            b2 = C48580an.UNKNOWN;
        }
        return ((C121195c) map2.get(b2)).mo105079a(aqVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
