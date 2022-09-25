package org.chromium.net.p5647a;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* renamed from: org.chromium.net.a.k */
/* compiled from: PG */
abstract class C72427k extends OutputStream {

    /* renamed from: d */
    public IOException f192641d;

    /* renamed from: e */
    public boolean f192642e;

    /* renamed from: f */
    public boolean f192643f;

    /* renamed from: a */
    public abstract UploadDataProvider mo64120a();

    /* renamed from: b */
    public abstract void mo64121b();

    /* renamed from: c */
    public abstract void mo64122c();

    public void close() {
        this.f192642e = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo64153d() {
        IOException iOException = this.f192641d;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo64154e() {
        if (this.f192643f) {
            mo64153d();
            throw new IOException("Writing after request completed.");
        } else if (this.f192642e) {
            throw new IOException("Stream has been closed.");
        }
    }
}
