package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.g.e */
/* compiled from: PG */
public final class C127357e implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C119834cb f350719a;

    public C127357e(C119834cb cbVar) {
        this.f350719a = cbVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C127356d dVar = (C127356d) obj;
        if (dVar == null) {
            return null;
        }
        if (!C69664n.m101066l(dVar.f350717a, this.f350719a)) {
            return dVar;
        }
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
