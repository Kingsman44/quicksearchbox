package com.google.android.libraries.assistant.pcp.datastore.p1549b.p1550a;

import com.google.android.libraries.assistant.pcp.p1578m.C18966ag;
import com.google.android.libraries.assistant.pcp.p1578m.C18970ak;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58472gh;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C18592c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18592c f52616a = new C18592c();

    private /* synthetic */ C18592c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C18966ag agVar;
        Map.Entry entry = (Map.Entry) obj;
        C53306j a = C53306j.m86809a(((Integer) entry.getKey()).intValue());
        C18970ak akVar = (C18970ak) entry.getValue();
        if (akVar.f53296a != 2 || !((Boolean) akVar.f53297b).booleanValue()) {
            if (akVar.f53296a == 1) {
                agVar = (C18966ag) akVar.f53297b;
            } else {
                agVar = C18966ag.f53290b;
            }
            optional = Optional.m71637of(agVar);
        } else {
            optional = Optional.empty();
        }
        return new C58472gh(a, optional);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
