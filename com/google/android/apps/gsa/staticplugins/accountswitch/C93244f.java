package com.google.android.apps.gsa.staticplugins.accountswitch;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.accountswitch.f */
/* compiled from: PG */
final class C93244f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C93245g f260012a;

    public C93244f(C93245g gVar) {
        this.f260012a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C93245g.f260013a.mo56225c()).mo56382g(th)).mo56372aa(13476)).mo56386p("Failed to switch tiktok account");
        Consumer consumer = this.f260012a.f260014b;
        if (consumer != null) {
            consumer.accept(false);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        Consumer consumer = this.f260012a.f260014b;
        if (consumer != null) {
            consumer.accept(true);
        }
    }
}
