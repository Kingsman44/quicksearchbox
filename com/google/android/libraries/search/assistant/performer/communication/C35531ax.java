package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ax */
/* compiled from: PG */
public final /* synthetic */ class C35531ax implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f93305a;

    public /* synthetic */ C35531ax(Intent intent) {
        this.f93305a = intent;
    }

    public final void accept(Object obj) {
        this.f93305a.putExtra("android.intent.extra.STREAM", ((C35545bd) obj).mo39695a()).addFlags(1);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
