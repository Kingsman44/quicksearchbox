package com.google.android.apps.gsa.speech.audio.p7265c;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.speech.audio.c.b */
/* compiled from: PG */
public final /* synthetic */ class C92163b implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C92163b f256941a = new C92163b();

    private /* synthetic */ C92163b() {
    }

    public final void accept(Object obj) {
        ((C60870cx) obj).cancel(false);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
