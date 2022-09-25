package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.g.c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.o */
/* compiled from: PG */
public final /* synthetic */ class C76971o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f212489a;

    public /* synthetic */ C76971o(Intent intent) {
        this.f212489a = intent;
    }

    public final void accept(Object obj) {
        Intent intent = this.f212489a;
        c cVar = (c) obj;
        if (cVar == c.g) {
            intent.putExtra("com.google.assistant.extra.OPEN_IN_VIDEO_MODE", true);
        } else {
            intent.putExtra("com.google.assistant.extra.CAMERA_MODE", cVar.h);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
