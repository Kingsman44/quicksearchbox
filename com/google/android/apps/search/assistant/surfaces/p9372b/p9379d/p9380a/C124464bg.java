package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.gsa.nga.engine.p6038j.C76193h;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C124464bg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124475br f343486a;

    /* renamed from: b */
    public final /* synthetic */ C76193h f343487b;

    public /* synthetic */ C124464bg(C124475br brVar, C76193h hVar) {
        this.f343486a = brVar;
        this.f343487b = hVar;
    }

    public final void accept(Object obj) {
        ((Optional) obj).ifPresent(new C124465bh(this.f343486a, this.f343487b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
