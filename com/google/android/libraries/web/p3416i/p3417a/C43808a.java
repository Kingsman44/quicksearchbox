package com.google.android.libraries.web.p3416i.p3417a;

import com.google.android.libraries.web.p3353c.C43363h;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.i.a.a */
/* compiled from: PG */
public final class C43808a extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public volatile C43363h f114226a = null;

    /* renamed from: b */
    private final Function f114227b;

    public C43808a(InputStream inputStream, Function function) {
        super(inputStream);
        this.f114227b = function;
    }

    public final int read() {
        try {
            return super.read();
        } catch (IOException e) {
            this.f114226a = (C43363h) this.f114227b.apply(e);
            throw e;
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            this.f114226a = (C43363h) this.f114227b.apply(e);
            throw e;
        }
    }
}
