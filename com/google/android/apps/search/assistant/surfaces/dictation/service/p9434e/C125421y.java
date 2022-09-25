package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.y */
/* compiled from: PG */
public final /* synthetic */ class C125421y implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C125421y f345895a = new C125421y();

    private /* synthetic */ C125421y() {
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C125374ab.f345782a.mo56225c()).mo56382g(th)).mo56372aa(36513)).mo56386p("Failed to start dictation because starting Oration failed [SD]");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
