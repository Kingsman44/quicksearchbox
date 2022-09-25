package com.google.android.libraries.web.contrib.errorpage;

import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.k */
/* compiled from: PG */
public final /* synthetic */ class C43523k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43525m f113643a;

    public /* synthetic */ C43523k(C43525m mVar) {
        this.f113643a = mVar;
    }

    public final void accept(Object obj) {
        C43525m mVar = this.f113643a;
        C43512b bVar = (C43512b) obj;
        mVar.f113647c = bVar;
        Consumer consumer = mVar.f113648d;
        if (consumer != null) {
            consumer.accept(bVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
