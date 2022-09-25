package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C76297ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f211335a;

    public /* synthetic */ C76297ah(Intent intent) {
        this.f211335a = intent;
    }

    public final void accept(Object obj) {
        Intent intent = this.f211335a;
        C76303an anVar = (C76303an) obj;
        anVar.f211346b.mo74728a(C89094c.NGA_SCREENSHOT);
        anVar.f211345a.startActivity(intent);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
