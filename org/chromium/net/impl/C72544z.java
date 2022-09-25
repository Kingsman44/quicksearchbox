package org.chromium.net.impl;

import org.chromium.base.C72387m;

/* renamed from: org.chromium.net.impl.z */
/* compiled from: PG */
final class C72544z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUploadDataStream f193054a;

    public C72544z(CronetUploadDataStream cronetUploadDataStream) {
        this.f193054a = cronetUploadDataStream;
    }

    public final void run() {
        try {
            this.f193054a.f192700c.mo64174b();
            this.f193054a.f192699b.f192966a.close();
        } catch (Exception e) {
            C72387m.m107041b(CronetUploadDataStream.f192698a, "Exception thrown when closing", e);
        }
    }
}
