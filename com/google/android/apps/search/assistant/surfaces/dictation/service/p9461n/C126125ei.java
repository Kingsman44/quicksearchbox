package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.al;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ei */
/* compiled from: PG */
public final /* synthetic */ class C126125ei implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347558a;

    /* renamed from: b */
    public final /* synthetic */ C126140ex f347559b;

    public /* synthetic */ C126125ei(C126141ey eyVar, C126140ex exVar) {
        this.f347558a = eyVar;
        this.f347559b = exVar;
    }

    public final void accept(Object obj) {
        C126141ey eyVar = this.f347558a;
        al alVar = (al) obj;
        if (eyVar.f347589c.mo107377d(this.f347559b)) {
            eyVar.mo107379m(alVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
