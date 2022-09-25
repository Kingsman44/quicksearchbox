package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.apps.tiktok.tracing.C47810es;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.an */
/* compiled from: PG */
public final /* synthetic */ class C119957an implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119966aw f334048a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f334049b;

    public /* synthetic */ C119957an(C119966aw awVar, C2164c cVar) {
        this.f334048a = awVar;
        this.f334049b = cVar;
    }

    public final void accept(Object obj) {
        C119966aw awVar = this.f334048a;
        awVar.f334071f.execute(C47810es.m84977q(new C119959ap(awVar, (C33461o) obj, this.f334049b)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
