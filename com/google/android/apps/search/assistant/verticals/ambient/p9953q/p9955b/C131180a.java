package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9955b;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131194a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131195b;
import com.google.assistant.p3886c.C50794cr;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.b.a */
/* compiled from: PG */
public final /* synthetic */ class C131180a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C131194a f358775a;

    public /* synthetic */ C131180a(C131194a aVar) {
        this.f358775a = aVar;
    }

    public final void accept(Object obj) {
        C131194a aVar = this.f358775a;
        aVar.copyOnWrite();
        C131195b bVar = (C131195b) aVar.instance;
        C131195b bVar2 = C131195b.f358800f;
        bVar.f358803b = ((C50794cr) obj).f132222T;
        bVar.f358802a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
