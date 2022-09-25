package com.google.android.apps.search.assistant.verticals.p9880a.p9890f;

import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.assistant.p3825an.p3830c.p3831a.C49341r;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.f.b */
/* compiled from: PG */
public final /* synthetic */ class C130385b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49267am f357320a;

    public /* synthetic */ C130385b(C49267am amVar) {
        this.f357320a = amVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49267am amVar = this.f357320a;
        int i = C130390g.f357325a;
        return Optional.ofNullable((C49341r) ((Map) obj).get(amVar.f127350c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
