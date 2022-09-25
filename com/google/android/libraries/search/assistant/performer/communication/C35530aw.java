package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.aw */
/* compiled from: PG */
public final /* synthetic */ class C35530aw implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f93304a;

    public /* synthetic */ C35530aw(Intent intent) {
        this.f93304a = intent;
    }

    public final void accept(Object obj) {
        this.f93304a.putExtra("FOCUS_ON_FIELD", (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
