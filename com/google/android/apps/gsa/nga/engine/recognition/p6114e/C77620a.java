package com.google.android.apps.gsa.nga.engine.recognition.p6114e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5922i.C74921n;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.e.a */
/* compiled from: PG */
public final /* synthetic */ class C77620a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77557aj f213841a;

    public /* synthetic */ C77620a(C77557aj ajVar) {
        this.f213841a = ajVar;
    }

    public final void accept(Object obj) {
        String.format("Received query <%s>", new Object[]{this.f213841a.mo72660x()});
        ((C74921n) obj).mo71299a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
