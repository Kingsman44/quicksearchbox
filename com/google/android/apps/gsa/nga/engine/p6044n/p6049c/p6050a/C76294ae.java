package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.am.v.d;
import com.google.android.apps.gsa.nga.engine.p5913am.p5940v.C74969c;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C76294ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri f211332a;

    public /* synthetic */ C76294ae(Uri uri) {
        this.f211332a = uri;
    }

    public final void accept(Object obj) {
        Uri uri = this.f211332a;
        C76303an anVar = (C76303an) obj;
        anVar.f211346b.mo74728a(C89094c.NGA_SCREENSHOT);
        d dVar = anVar.f211347c;
        dVar.d.mo28212l("[NGA] ScreenshotHelper.deleteScreenshot", new C74969c(dVar, uri));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
