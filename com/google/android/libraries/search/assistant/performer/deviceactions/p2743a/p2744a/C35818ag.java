package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.assistant.p3897e.p3921j.C52098fd;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C35818ag implements Function {

    /* renamed from: a */
    public final /* synthetic */ C35823al f93844a;

    /* renamed from: b */
    public final /* synthetic */ Map f93845b;

    /* renamed from: c */
    public final /* synthetic */ C52098fd f93846c;

    public /* synthetic */ C35818ag(C35823al alVar, Map map, C52098fd fdVar) {
        this.f93844a = alVar;
        this.f93845b = map;
        this.f93846c = fdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C35823al alVar = this.f93844a;
        String str = (String) obj;
        return Optional.ofNullable((String) this.f93845b.get(str)).map(new C35819ah(alVar, str, this.f93846c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
