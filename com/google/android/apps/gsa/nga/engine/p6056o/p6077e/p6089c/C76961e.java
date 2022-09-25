package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.g.b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.e */
/* compiled from: PG */
public final /* synthetic */ class C76961e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f212479a;

    public /* synthetic */ C76961e(Intent intent) {
        this.f212479a = intent;
    }

    public final void accept(Object obj) {
        this.f212479a.putExtra("com.google.assistant.extra.CAMERA_FLASH_MODE", ((b) obj).c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
