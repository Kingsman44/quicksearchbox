package org.p5623b.p5624a;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: org.b.a.cf */
/* compiled from: PG */
abstract class C72088cf extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: b */
    protected final InputStream f191907b;

    /* renamed from: c */
    public final int f191908c;

    public C72088cf(InputStream inputStream, int i) {
        this.f191907b = inputStream;
        this.f191908c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63276b() {
        InputStream inputStream = this.f191907b;
        if (inputStream instanceof C72085cc) {
            C72085cc ccVar = (C72085cc) inputStream;
            ccVar.f191900a = true;
            ccVar.mo63267a();
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
