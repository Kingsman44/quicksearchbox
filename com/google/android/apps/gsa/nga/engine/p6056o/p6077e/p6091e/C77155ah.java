package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ah */
/* compiled from: PG */
public final /* synthetic */ class C77155ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76590bg f212929a;

    public /* synthetic */ C77155ah(C76590bg bgVar) {
        this.f212929a = bgVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76590bg bgVar = this.f212929a;
        C51446i iVar = (C51446i) obj;
        Duration duration = C77160am.f212935a;
        Optional map = bgVar.mo72265g(C76564ah.f211801a, C77149ab.f212918b).filter(C77150ac.f212921a).map(C77151ad.f212922a);
        Objects.requireNonNull(iVar);
        return (C51446i) map.map(new C77152ae(iVar)).orElse(iVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
