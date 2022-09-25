package com.google.android.libraries.assistant.contexttrigger.p1465i;

import android.media.session.MediaController;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.i.c */
/* compiled from: PG */
public final /* synthetic */ class C17745c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C17746d f50968a;

    public /* synthetic */ C17745c(C17746d dVar) {
        this.f50968a = dVar;
    }

    public final void accept(Object obj) {
        ((MediaController) obj).registerCallback(this.f50968a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
