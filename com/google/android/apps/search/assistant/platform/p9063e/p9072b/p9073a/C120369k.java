package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C120369k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51188c f334864a;

    public /* synthetic */ C120369k(C51188c cVar) {
        this.f334864a = cVar;
    }

    public final void accept(Object obj) {
        C51188c cVar = this.f334864a;
        C54188e eVar = (C54188e) obj;
        cVar.copyOnWrite();
        C51189d dVar = (C51189d) cVar.instance;
        C51189d dVar2 = C51189d.f133247h;
        eVar.getClass();
        dVar.f133251c = eVar;
        dVar.f133249a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
