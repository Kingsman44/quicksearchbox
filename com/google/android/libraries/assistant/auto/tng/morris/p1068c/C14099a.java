package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.a */
/* compiled from: PG */
public final /* synthetic */ class C14099a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C37252a f42771a;

    public /* synthetic */ C14099a(C37252a aVar) {
        this.f42771a = aVar;
    }

    public final void accept(Object obj) {
        C37252a aVar = this.f42771a;
        int i = C14136f.f42847b;
        aVar.mo40791o(((Duration) obj).toNanos());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
