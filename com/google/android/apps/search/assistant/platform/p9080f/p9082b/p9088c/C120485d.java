package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import java.io.EOFException;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.d */
/* compiled from: PG */
final class C120485d implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C32534ai f335079a;

    public C120485d(C32534ai aiVar) {
        this.f335079a = aiVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C33461o oVar = (C33461o) obj;
        this.f335079a.mo38135c(new EOFException("Utterance ended"));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
