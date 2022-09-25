package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.av */
/* compiled from: PG */
public final /* synthetic */ class C18822av implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C18822av f53015a = new C18822av();

    private /* synthetic */ C18822av() {
    }

    public final void accept(Object obj) {
        C60870cx cxVar = (C60870cx) obj;
        if (!cxVar.isDone()) {
            cxVar.cancel(true);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
