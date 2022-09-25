package com.google.android.apps.search.googleapp.search.p10415i;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.search.googleapp.search.i.ak */
/* compiled from: PG */
final class C137491ak extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    final /* synthetic */ Exception f373957a;

    public C137491ak(Exception exc) {
        this.f373957a = exc;
    }

    public final int read() {
        throw new IOException(this.f373957a);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        throw new IOException(this.f373957a);
    }
}
