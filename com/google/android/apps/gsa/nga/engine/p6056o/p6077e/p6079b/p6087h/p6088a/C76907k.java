package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18101b;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.k */
/* compiled from: PG */
public final /* synthetic */ class C76907k implements Function {

    /* renamed from: a */
    public final /* synthetic */ Object f212364a;

    /* renamed from: b */
    public final /* synthetic */ C18101b f212365b;

    public /* synthetic */ C76907k(Object obj, C18101b bVar) {
        this.f212364a = obj;
        this.f212365b = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76590bg bgVar = (C76590bg) obj;
        return Optional.m71637of(this.f212364a).map(new C76906j(this.f212365b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
