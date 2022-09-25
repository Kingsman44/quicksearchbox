package com.google.android.libraries.storage.p3304a.p3307c.p3308a;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.storage.a.c.a.e */
/* compiled from: PG */
public class C42744e extends FilterInputStream implements InputStreamRetargetInterface {
    public C42744e(InputStream inputStream) {
        super(inputStream);
    }

    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
