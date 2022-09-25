package com.google.android.libraries.search.video.players;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.video.players.d */
/* compiled from: PG */
public final /* synthetic */ class C41569d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C41571f f108676a;

    public /* synthetic */ C41569d(C41571f fVar) {
        this.f108676a = fVar;
    }

    public final void accept(Object obj) {
        C41571f fVar = this.f108676a;
        if (((Boolean) obj).booleanValue()) {
            fVar.f108680a.mo44087j();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
