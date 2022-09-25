package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.ac */
/* compiled from: PG */
public final /* synthetic */ class C75875ac implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C75875ac f210516a = new C75875ac();

    private /* synthetic */ C75875ac() {
    }

    public final void accept(Object obj) {
        C60870cx cxVar = (C60870cx) obj;
        int i = C75876ad.f210517d;
        if (!cxVar.isDone()) {
            cxVar.cancel(true);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
