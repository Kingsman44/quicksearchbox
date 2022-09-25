package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.p4017at.p4082j.p4083a.C54398cx;
import com.google.p4017at.p4082j.p4083a.C54402da;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.b.a.d */
/* compiled from: PG */
final class C139991d implements BiFunction {

    /* renamed from: a */
    public static final C139991d f380500a = new C139991d();

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        C54398cx cxVar = (C54398cx) obj;
        C54398cx cxVar2 = (C54398cx) obj2;
        C69664n.m101061g(cxVar, "existing");
        C69664n.m101061g(cxVar2, "newValues");
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C54402da) cxVar2.instance).f142892c));
        cxVar.copyOnWrite();
        ((C54402da) cxVar.instance).mo54115a().putAll(unmodifiableMap);
        return cxVar;
    }
}
