package com.google.android.libraries.p10923ac.p10925b.p10945l;

import com.google.common.base.C58838bb;
import com.google.common.base.C58887cx;
import com.google.common.p4541l.C59341x;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.libraries.ac.b.l.f */
/* compiled from: PG */
public final class C147172f implements Closeable {

    /* renamed from: a */
    private final C59341x f397357a = C59341x.m92227a();

    /* renamed from: b */
    private boolean f397358b = false;

    /* renamed from: a */
    public final RuntimeException mo123994a(Throwable th, Class cls) {
        synchronized (this.f397357a) {
            C59341x xVar = this.f397357a;
            th.getClass();
            xVar.f157528b = th;
            C58887cx.m90979f(th, IOException.class);
            C58887cx.m90980g(th);
            C58887cx.m90979f(th, cls);
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public final void mo123995b(Closeable closeable) {
        C58838bb.m90866a(closeable, "Can't register null resource to AsyncCloser!");
        synchronized (this.f397357a) {
            if (!this.f397358b) {
                this.f397357a.mo56859c(closeable);
            } else {
                try {
                    closeable.close();
                    e = null;
                } catch (IOException e) {
                    e = e;
                }
                throw new IOException("Can't register Closeable to already closed AsyncCloser!", e);
            }
        }
    }

    public final void close() {
        synchronized (this.f397357a) {
            this.f397357a.close();
            this.f397358b = true;
        }
    }
}
