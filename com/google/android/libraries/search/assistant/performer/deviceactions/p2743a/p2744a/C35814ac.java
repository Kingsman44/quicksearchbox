package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.assistant.p3897e.p3921j.C52098fd;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C35814ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ C35817af f93832a;

    /* renamed from: b */
    public final /* synthetic */ Map f93833b;

    /* renamed from: c */
    public final /* synthetic */ C52098fd f93834c;

    public /* synthetic */ C35814ac(C35817af afVar, Map map, C52098fd fdVar) {
        this.f93832a = afVar;
        this.f93833b = map;
        this.f93834c = fdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C35817af afVar = this.f93832a;
        String str = (String) obj;
        return Optional.ofNullable((String) this.f93833b.get(str)).map(new C35869z(afVar, str, this.f93834c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
