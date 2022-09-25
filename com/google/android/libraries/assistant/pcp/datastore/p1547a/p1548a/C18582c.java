package com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58472gh;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C18582c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18582c f52606a = new C18582c();

    private /* synthetic */ C18582c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return new C58472gh((C53306j) entry.getKey(), ((Optional) entry.getValue()).map(C18588i.f52612a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
