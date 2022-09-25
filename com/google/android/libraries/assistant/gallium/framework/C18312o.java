package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.search.logging.p3041d.C39141kp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.o */
/* compiled from: PG */
public final /* synthetic */ class C18312o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f51950a;

    public /* synthetic */ C18312o(String str) {
        this.f51950a = str;
    }

    public final void accept(Object obj) {
        String str = this.f51950a;
        int i = GalliumCoreso.f51687b;
        ((C39141kp) obj).mo41694i(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
