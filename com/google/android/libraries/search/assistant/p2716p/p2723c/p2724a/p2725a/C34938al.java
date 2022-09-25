package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.p4152bb.p4153a.C55065eo;
import com.google.p4152bb.p4153a.C55082fe;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.al */
/* compiled from: PG */
public final /* synthetic */ class C34938al implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C55065eo f92605a;

    public /* synthetic */ C34938al(C55065eo eoVar) {
        this.f92605a = eoVar;
    }

    public final void accept(Object obj) {
        C55065eo eoVar = this.f92605a;
        String str = (String) obj;
        eoVar.copyOnWrite();
        C55082fe feVar = (C55082fe) eoVar.instance;
        C55082fe feVar2 = C55082fe.f144912z;
        str.getClass();
        feVar.f144914a |= 8;
        feVar.f144919f = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
