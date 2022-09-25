package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* renamed from: org.chromium.net.impl.bf */
/* compiled from: PG */
final class C72473bf implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ C72474bg f192841a;

    public C72473bf(C72474bg bgVar) {
        this.f192841a = bgVar;
    }

    /* renamed from: a */
    public final void mo64214a() {
        int i;
        C72474bg bgVar = this.f192841a;
        ReadableByteChannel readableByteChannel = bgVar.f192843b.f192905n;
        if (readableByteChannel == null) {
            i = -1;
        } else {
            i = readableByteChannel.read(bgVar.f192842a);
        }
        C72474bg bgVar2 = this.f192841a;
        C72499ce ceVar = bgVar2.f192843b;
        ByteBuffer byteBuffer = bgVar2.f192842a;
        if (i != -1) {
            C72495ca caVar = ceVar.f192893b;
            caVar.mo64239a(new C72490bw(caVar, ceVar.f192906o, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel2 = ceVar.f192905n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (ceVar.f192898g.compareAndSet(5, 7)) {
            ceVar.mo64249j();
            C72495ca caVar2 = ceVar.f192893b;
            caVar2.f192879b.execute(new C72492by(caVar2, ceVar.f192906o));
        }
    }
}
