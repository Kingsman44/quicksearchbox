package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.x */
/* compiled from: PG */
final class C72542x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUploadDataStream f193052a;

    public C72542x(CronetUploadDataStream cronetUploadDataStream) {
        this.f193052a = cronetUploadDataStream;
    }

    public final void run() {
        synchronized (this.f193052a.f192704g) {
            CronetUploadDataStream cronetUploadDataStream = this.f193052a;
            if (cronetUploadDataStream.f192705h != 0) {
                cronetUploadDataStream.mo64167a(3);
                CronetUploadDataStream cronetUploadDataStream2 = this.f193052a;
                if (cronetUploadDataStream2.f192703f != null) {
                    cronetUploadDataStream2.f192706i = 0;
                    try {
                        this.f193052a.f192700c.mo64174b();
                        CronetUploadDataStream cronetUploadDataStream3 = this.f193052a;
                        C72520cz czVar = cronetUploadDataStream3.f192699b;
                        czVar.f192966a.read(cronetUploadDataStream3, cronetUploadDataStream3.f192703f);
                    } catch (Exception e) {
                        this.f193052a.mo64168b(e);
                    }
                } else {
                    throw new IllegalStateException("Unexpected readData call. Buffer is null");
                }
            }
        }
    }
}
