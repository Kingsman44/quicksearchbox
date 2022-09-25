package com.google.android.apps.search.googleapp.launcher.minusone;

import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.aq */
/* compiled from: PG */
public final /* synthetic */ class C136582aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C137416e f371823a;

    public /* synthetic */ C136582aq(C137416e eVar) {
        this.f371823a = eVar;
    }

    public final void accept(Object obj) {
        C137416e eVar = this.f371823a;
        String str = (String) obj;
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        C137418g gVar2 = C137418g.f373767r;
        str.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
