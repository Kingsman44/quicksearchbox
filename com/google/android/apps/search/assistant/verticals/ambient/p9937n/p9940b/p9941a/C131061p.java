package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.p */
/* compiled from: PG */
public final /* synthetic */ class C131061p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C131071z f358498a;

    /* renamed from: b */
    public final /* synthetic */ C130701b f358499b;

    public /* synthetic */ C131061p(C131071z zVar, C130701b bVar) {
        this.f358498a = zVar;
        this.f358499b = bVar;
    }

    public final void accept(Object obj) {
        C131071z zVar = this.f358498a;
        C130701b bVar = this.f358499b;
        zVar.f358522k.mo109918ap((Duration) obj, bVar.mo109797h());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
