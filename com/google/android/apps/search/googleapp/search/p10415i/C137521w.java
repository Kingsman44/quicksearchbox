package com.google.android.apps.search.googleapp.search.p10415i;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.googleapp.search.i.w */
/* compiled from: PG */
public final class C137521w extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: d */
    private static final C63088z f374038d = C63088z.m96143E(BuildConfig.FLAVOR);

    /* renamed from: a */
    public int f374039a = 0;

    /* renamed from: b */
    public C63088z f374040b = C63088z.f170246b;

    /* renamed from: c */
    public volatile Throwable f374041c;

    /* renamed from: e */
    private final BlockingQueue f374042e = new LinkedBlockingQueue();

    /* renamed from: f */
    private boolean f374043f;

    /* renamed from: c */
    private final int m223398c(Supplier supplier) {
        if (this.f374041c != null) {
            throw new IOException(this.f374041c);
        } else if (this.f374043f) {
            return -1;
        } else {
            if (this.f374039a < this.f374040b.mo59031d()) {
                return ((Integer) supplier.get()).intValue();
            }
            try {
                C63088z zVar = (C63088z) this.f374042e.take();
                this.f374040b = zVar;
                this.f374039a = 0;
                if (zVar != f374038d) {
                    return ((Integer) supplier.get()).intValue();
                }
                if (this.f374041c == null) {
                    this.f374043f = true;
                    return -1;
                }
                throw new IOException(this.f374041c);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo113791a(Collection collection) {
        this.f374042e.addAll(collection);
    }

    public final int available() {
        return this.f374040b.mo59031d() - this.f374039a;
    }

    /* renamed from: b */
    public final void mo113793b() {
        this.f374042e.add(f374038d);
    }

    public final int read() {
        return m223398c(new C137520v(this));
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        return m223398c(new C137519u(this, i2, bArr, i));
    }
}
