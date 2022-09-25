package com.google.android.apps.gsa.shared.p7195y;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.shared.y.b */
/* compiled from: PG */
final class C91195b extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public final InputStream f254579a;

    /* renamed from: b */
    private C58833ax f254580b = C58836b.f156633a;

    /* renamed from: c */
    private int f254581c;

    public C91195b(InputStream inputStream) {
        this.f254579a = inputStream;
    }

    /* renamed from: a */
    private final void m149037a() {
        if (!this.f254580b.mo56113h()) {
            this.f254580b = C58833ax.m90834k(Integer.valueOf(new DataInputStream(this.f254579a).readInt()));
        }
    }

    /* renamed from: b */
    private final void m149038b(int i) {
        int i2;
        if (i >= 0) {
            this.f254581c += i;
            return;
        }
        int intValue = ((Integer) this.f254580b.mo56107c()).intValue();
        if (intValue == -1) {
            if (this.f254581c > 0) {
                intValue = -1;
            } else {
                throw new IOException("Streams with unknown length are expected to be non-empty");
            }
        }
        if (intValue != -1 && (i2 = this.f254581c) != intValue) {
            throw new IOException(String.format("Invalid length. Expected %d but read %d", new Object[]{Integer.valueOf(intValue), Integer.valueOf(i2)}));
        }
    }

    public final int available() {
        m149037a();
        return this.f254579a.available();
    }

    public final void close() {
        this.f254579a.close();
    }

    public final synchronized void mark(int i) {
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        m149037a();
        int read = this.f254579a.read();
        m149038b(read >= 0 ? 1 : -1);
        return read;
    }

    public final synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    public final long skip(long j) {
        m149037a();
        return this.f254579a.skip(j);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        m149037a();
        int read = this.f254579a.read(bArr);
        m149038b(read);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        m149037a();
        int read = this.f254579a.read(bArr, i, i2);
        m149038b(read);
        return read;
    }
}
