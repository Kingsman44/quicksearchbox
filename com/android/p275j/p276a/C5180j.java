package com.android.p275j.p276a;

import java.io.FilterInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.android.j.a.j */
/* compiled from: PG */
public final class C5180j extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final HttpURLConnection f16458a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5180j(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.io.InputStream r0 = r2.getErrorStream()
        L_0x0009:
            r1.<init>(r0)
            r1.f16458a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p275j.p276a.C5180j.<init>(java.net.HttpURLConnection):void");
    }

    public final void close() {
        super.close();
        this.f16458a.disconnect();
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
