package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18101b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.o */
/* compiled from: PG */
public final /* synthetic */ class C76911o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18101b f212369a;

    public /* synthetic */ C76911o(C18101b bVar) {
        this.f212369a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((C76590bg) obj).mo72265g(C76564ah.f211801a, "expression").map(new C76912p(this.f212369a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
