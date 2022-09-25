package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a;

import com.google.android.libraries.assistant.p1594s.p1597b.C19152am;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C121418g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C121418g f337071a = new C121418g();

    private /* synthetic */ C121418g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C19152am amVar = (C19152am) obj;
        C48670ae a = C48670ae.m85256a(amVar.f53642b);
        if (a == null) {
            a = C48670ae.SUGGESTION_GROUP_FALLBACK;
        }
        return new C121416e(a, Integer.valueOf(amVar.f53643c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
