package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.assistant.p4016z.C53691ap;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.n */
/* compiled from: PG */
public final /* synthetic */ class C130719n implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C130725t f357900a;

    /* renamed from: b */
    public final /* synthetic */ C21850cf f357901b;

    public /* synthetic */ C130719n(C130725t tVar, C21850cf cfVar) {
        this.f357900a = tVar;
        this.f357901b = cfVar;
    }

    public final void accept(Object obj, Object obj2) {
        C130725t tVar = this.f357900a;
        C21850cf cfVar = this.f357901b;
        C53691ap apVar = (C53691ap) obj;
        C130712h hVar = (C130712h) obj2;
        String str = (String) C130725t.f357910a.get(apVar);
        if (str != null && cfVar.mo27153c().contains(str)) {
            hVar.mo109803b(new C130722q(tVar, apVar));
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
