package com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.p1269b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.l.b.b.e */
/* compiled from: PG */
public final /* synthetic */ class C16400e implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f48263a;

    public /* synthetic */ C16400e(Map map) {
        this.f48263a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Float) Map.EL.getOrDefault(this.f48263a, (C16170n) obj, Float.valueOf(0.0f));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
