package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.search.logging.p3041d.C39141kp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.z */
/* compiled from: PG */
public final /* synthetic */ class C18323z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f51964a;

    public /* synthetic */ C18323z(String str) {
        this.f51964a = str;
    }

    public final void accept(Object obj) {
        String str = this.f51964a;
        int i = GalliumIpc.f51688h;
        ((C39141kp) obj).mo41694i(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
