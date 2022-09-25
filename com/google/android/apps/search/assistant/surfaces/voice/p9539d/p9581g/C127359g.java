package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.g.g */
/* compiled from: PG */
public final class C127359g implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C119834cb f350722a;

    public C127359g(C119834cb cbVar) {
        this.f350722a = cbVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C119837ce ceVar = (C119837ce) obj;
        if (ceVar == null) {
            return null;
        }
        C119834cb cbVar = this.f350722a;
        C119834cb cbVar2 = ceVar.f333777a;
        if (cbVar2 == null) {
            cbVar2 = C119834cb.f333765b;
        }
        if (!C69664n.m101066l(cbVar2, cbVar)) {
            return ceVar;
        }
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
