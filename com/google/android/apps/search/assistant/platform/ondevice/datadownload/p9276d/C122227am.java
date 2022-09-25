package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.am */
/* compiled from: PG */
public final /* synthetic */ class C122227am implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C122227am f338961a = new C122227am();

    private /* synthetic */ C122227am() {
    }

    public final void accept(Object obj) {
        ((C60870cx) obj).cancel(true);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
