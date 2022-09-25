package com.google.android.apps.search.assistant.verticals.contextdebug;

import com.google.android.apps.search.assistant.verticals.contextdebug.p10039b.C132030a;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10039b.C132031b;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.r */
/* compiled from: PG */
public final /* synthetic */ class C132048r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C132030a f360417a;

    public /* synthetic */ C132048r(C132030a aVar) {
        this.f360417a = aVar;
    }

    public final void accept(Object obj) {
        C132030a aVar = this.f360417a;
        C50540h hVar = (C50540h) obj;
        aVar.copyOnWrite();
        C132031b bVar = (C132031b) aVar.instance;
        C132031b bVar2 = C132031b.f360388c;
        hVar.getClass();
        bVar.f360391b = hVar;
        bVar.f360390a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
