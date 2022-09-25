package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1250b;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16331ae;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C16245a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C16331ae f47852a;

    public /* synthetic */ C16245a(C16331ae aeVar) {
        this.f47852a = aeVar;
    }

    public final void accept(Object obj) {
        C16331ae aeVar = this.f47852a;
        String str = (String) obj;
        aeVar.copyOnWrite();
        C16333ag agVar = (C16333ag) aeVar.instance;
        C16333ag agVar2 = C16333ag.f48074n;
        str.getClass();
        agVar.f48076a |= 2;
        agVar.f48078c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
