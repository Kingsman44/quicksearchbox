package com.google.android.apps.gsa.staticplugins.s3request.producers;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.a */
/* compiled from: PG */
final class C116342a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    final /* synthetic */ InputStream f322553a;

    /* renamed from: b */
    final /* synthetic */ C116343b f322554b;

    public C116342a(C116343b bVar, InputStream inputStream) {
        this.f322554b = bVar;
        this.f322553a = inputStream;
    }

    public final void close() {
        this.f322553a.close();
    }

    public final int read() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        int read = this.f322553a.read(bArr);
        if (read != -1) {
            this.f322554b.f322557c += read;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
