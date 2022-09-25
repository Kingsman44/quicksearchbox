package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.search.p3055n.p3085h.C39774g;
import com.google.android.libraries.search.p3055n.p3085h.C39775h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.n.g.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C39719ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C39774g f104528a;

    public /* synthetic */ C39719ab(C39774g gVar) {
        this.f104528a = gVar;
    }

    public final void accept(Object obj) {
        C39774g gVar = this.f104528a;
        String str = (String) obj;
        gVar.copyOnWrite();
        C39775h hVar = (C39775h) gVar.instance;
        C39775h hVar2 = C39775h.f104621f;
        str.getClass();
        hVar.f104623a |= 4;
        hVar.f104626d = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
