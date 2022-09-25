package org.chromium.net.p5647a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: org.chromium.net.a.j */
/* compiled from: PG */
final class C72426j extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public boolean f192637a;

    /* renamed from: b */
    public ByteBuffer f192638b;

    /* renamed from: c */
    public IOException f192639c;

    /* renamed from: d */
    private final C72424h f192640d;

    public C72426j(C72424h hVar) {
        this.f192640d = hVar;
    }

    /* renamed from: a */
    private final void m107110a() {
        if (this.f192637a) {
            IOException iOException = this.f192639c;
            if (iOException != null) {
                throw iOException;
            }
        } else if (!m107111b()) {
            if (this.f192638b == null) {
                this.f192638b = ByteBuffer.allocateDirect(32768);
            }
            ByteBuffer byteBuffer = (ByteBuffer) this.f192638b.clear();
            C72424h hVar = this.f192640d;
            hVar.f192621b.read(this.f192638b);
            hVar.f192620a.mo64156a(hVar.getReadTimeout());
            IOException iOException2 = this.f192639c;
            if (iOException2 == null) {
                ByteBuffer byteBuffer2 = this.f192638b;
                if (byteBuffer2 != null) {
                    ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer2.flip();
                    return;
                }
                return;
            }
            throw iOException2;
        }
    }

    /* renamed from: b */
    private final boolean m107111b() {
        ByteBuffer byteBuffer = this.f192638b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    public final int available() {
        if (this.f192637a) {
            IOException iOException = this.f192639c;
            if (iOException == null) {
                return 0;
            }
            throw iOException;
        } else if (m107111b()) {
            return this.f192638b.remaining();
        } else {
            return 0;
        }
    }

    public final int read() {
        m107110a();
        if (m107111b()) {
            return this.f192638b.get() & 255;
        }
        return -1;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            m107110a();
            if (!m107111b()) {
                return -1;
            }
            int min = Math.min(this.f192638b.limit() - this.f192638b.position(), i2);
            this.f192638b.get(bArr, i, min);
            return min;
        }
    }
}
