package com.google.android.libraries.assistant.contexttrigger.p1465i;

import android.media.session.MediaController;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.i.e */
/* compiled from: PG */
public final /* synthetic */ class C17747e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C17748f f50973a;

    public /* synthetic */ C17747e(C17748f fVar) {
        this.f50973a = fVar;
    }

    public final void accept(Object obj) {
        ((MediaController) obj).unregisterCallback(this.f50973a.f50976c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
