package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18101b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.q */
/* compiled from: PG */
public final /* synthetic */ class C76913q implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f212371a;

    /* renamed from: b */
    public final /* synthetic */ C18101b f212372b;

    public /* synthetic */ C76913q(String str, C18101b bVar) {
        this.f212371a = str;
        this.f212372b = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f212371a;
        return ((C76590bg) obj).mo72265g(C76564ah.f211801a, str).map(C76908l.f212366a).map(new C76909m(this.f212372b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
