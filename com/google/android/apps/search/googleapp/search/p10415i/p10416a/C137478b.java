package com.google.android.apps.search.googleapp.search.p10415i.p10416a;

import android.net.Uri;
import com.google.protobuf.C63087y;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.search.googleapp.search.i.a.b */
/* compiled from: PG */
final class C137478b extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    final /* synthetic */ Uri f373923a;

    /* renamed from: b */
    final /* synthetic */ C63087y f373924b;

    /* renamed from: c */
    final /* synthetic */ C137479c f373925c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137478b(C137479c cVar, InputStream inputStream, Uri uri, C63087y yVar) {
        super(inputStream);
        this.f373925c = cVar;
        this.f373923a = uri;
        this.f373924b = yVar;
    }

    public final int read() {
        int read = this.in.read();
        if (read == -1) {
            this.f373925c.mo113775c(this.f373923a, this.f373924b.mo59165b());
        } else {
            this.f373924b.write(read);
        }
        return read;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            this.f373925c.mo113775c(this.f373923a, this.f373924b.mo59165b());
        } else {
            this.f373924b.write(bArr, i, read);
        }
        return read;
    }
}
