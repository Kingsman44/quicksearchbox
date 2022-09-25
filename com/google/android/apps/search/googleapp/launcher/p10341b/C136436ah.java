package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.content.Intent;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.ah */
/* compiled from: PG */
public final /* synthetic */ class C136436ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f371439a;

    public /* synthetic */ C136436ah(Intent intent) {
        this.f371439a = intent;
    }

    public final void accept(Object obj) {
        C59071e eVar = C136439ak.f371445a;
        this.f371439a.putExtra("source", (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
