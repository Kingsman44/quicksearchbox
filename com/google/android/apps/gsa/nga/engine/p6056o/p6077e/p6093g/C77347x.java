package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.p5913am.p5922i.C74922o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.x */
/* compiled from: PG */
public final /* synthetic */ class C77347x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f213308a;

    public /* synthetic */ C77347x(Intent intent) {
        this.f213308a = intent;
    }

    public final void accept(Object obj) {
        Intent intent = this.f213308a;
        int i = C77349z.f213309e;
        intent.getPackage();
        intent.getAction();
        intent.getDataString();
        ((C74922o) obj).mo71302b();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
