package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71643cp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.d */
/* compiled from: PG */
final class C120729d implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C71643cp f335785a;

    public C120729d(C71643cp cpVar) {
        this.f335785a = cpVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C33461o oVar = (C33461o) obj;
        this.f335785a.mo62723u(new CancellationException("Utterance cancelled."));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
