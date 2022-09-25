package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.assistant.p3825an.p3830c.p3831a.C49272ar;
import com.google.assistant.p3825an.p3830c.p3831a.C49273as;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.f.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C89726ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49272ar f242902a;

    public /* synthetic */ C89726ac(C49272ar arVar) {
        this.f242902a = arVar;
    }

    public final void accept(Object obj) {
        C49272ar arVar = this.f242902a;
        String str = (String) obj;
        arVar.copyOnWrite();
        C49273as asVar = (C49273as) arVar.instance;
        C49273as asVar2 = C49273as.f127366d;
        str.getClass();
        asVar.f127368a |= 2;
        asVar.f127370c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
