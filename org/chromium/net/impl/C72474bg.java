package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.impl.bg */
/* compiled from: PG */
final class C72474bg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f192842a;

    /* renamed from: b */
    final /* synthetic */ C72499ce f192843b;

    public C72474bg(C72499ce ceVar, ByteBuffer byteBuffer) {
        this.f192843b = ceVar;
        this.f192842a = byteBuffer;
    }

    public final void run() {
        C72499ce ceVar = this.f192843b;
        ceVar.f192894c.execute(new C72485br(ceVar, new C72473bf(this)));
    }
}
