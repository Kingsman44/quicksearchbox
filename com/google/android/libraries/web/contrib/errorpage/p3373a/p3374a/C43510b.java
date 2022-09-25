package com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a;

import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.a.a.b */
/* compiled from: PG */
public final class C43510b implements C44107h {

    /* renamed from: a */
    public C43512b f113621a;

    /* renamed from: b */
    public Consumer f113622b;

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final void mo46577b(Consumer consumer) {
        this.f113622b = consumer;
        C43512b bVar = this.f113621a;
        if (bVar != null && consumer != null) {
            consumer.accept(bVar);
            this.f113621a = null;
        }
    }
}
