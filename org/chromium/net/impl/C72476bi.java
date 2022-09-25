package org.chromium.net.impl;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

/* renamed from: org.chromium.net.impl.bi */
/* compiled from: PG */
final class C72476bi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72499ce f192845a;

    public C72476bi(C72499ce ceVar) {
        this.f192845a = ceVar;
    }

    public final void run() {
        ReadableByteChannel readableByteChannel = this.f192845a.f192905n;
        if (readableByteChannel != null) {
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f192845a.f192905n = null;
        }
    }
}
