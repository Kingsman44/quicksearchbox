package com.google.android.apps.gsa.nga.engine.warmactions.p6250c;

import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79553k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79562t;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.c.o */
/* compiled from: PG */
public final class C79490o extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public final C77566as f218183a;

    /* renamed from: b */
    private final InputStream f218184b;

    /* renamed from: c */
    private final Runnable f218185c;

    /* renamed from: d */
    private final C79553k f218186d;

    /* renamed from: e */
    private final AtomicBoolean f218187e = new AtomicBoolean(false);

    public C79490o(InputStream inputStream, Runnable runnable, C77566as asVar, C79553k kVar) {
        this.f218184b = inputStream;
        this.f218185c = runnable;
        this.f218183a = asVar;
        this.f218186d = kVar;
    }

    public final void close() {
        if (this.f218187e.compareAndSet(false, true)) {
            this.f218184b.close();
            ((C79492q) this.f218185c).f218188a.mo74097c();
            this.f218186d.mo74135a(C79562t.MIC_CLOSED);
        }
    }

    public final int read() {
        return this.f218184b.read();
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return this.f218184b.read(bArr);
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.f218184b.read(bArr, i, i2);
    }
}
