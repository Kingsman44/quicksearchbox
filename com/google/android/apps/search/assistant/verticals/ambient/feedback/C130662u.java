package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import com.google.assistant.p3781ad.p3782a.p3783a.C48476b;
import com.google.assistant.p3781ad.p3782a.p3783a.C48477c;
import com.google.assistant.p4016z.C53691ap;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.u */
/* compiled from: PG */
public final /* synthetic */ class C130662u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48476b f357817a;

    public /* synthetic */ C130662u(C48476b bVar) {
        this.f357817a = bVar;
    }

    public final void accept(Object obj) {
        C48476b bVar = this.f357817a;
        bVar.copyOnWrite();
        C48477c cVar = (C48477c) bVar.instance;
        C48477c cVar2 = C48477c.f125220d;
        cVar.f125223b = ((C53691ap) obj).f140936l;
        cVar.f125222a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
