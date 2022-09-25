package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import com.google.assistant.p3825an.p3830c.p3831a.C49272ar;
import com.google.assistant.p3825an.p3830c.p3831a.C49273as;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.z */
/* compiled from: PG */
public final /* synthetic */ class C130465z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49272ar f357429a;

    public /* synthetic */ C130465z(C49272ar arVar) {
        this.f357429a = arVar;
    }

    public final void accept(Object obj) {
        C49272ar arVar = this.f357429a;
        String str = (String) obj;
        arVar.copyOnWrite();
        C49273as asVar = (C49273as) arVar.instance;
        C49273as asVar2 = C49273as.f127366d;
        str.getClass();
        asVar.f127368a |= 1;
        asVar.f127369b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
