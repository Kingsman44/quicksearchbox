package com.google.android.libraries.lens.view.session.ondevice;

import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.ag */
/* compiled from: PG */
public final /* synthetic */ class C27916ag implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C27920ak f76037a;

    public /* synthetic */ C27916ag(C27920ak akVar) {
        this.f76037a = akVar;
    }

    public final void accept(Object obj) {
        this.f76037a.mo33372a((String) ((Map.Entry) obj).getKey());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
