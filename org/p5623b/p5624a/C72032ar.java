package org.p5623b.p5624a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: org.b.a.ar */
/* compiled from: PG */
final class C72032ar extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final C72016ab f191788a;

    /* renamed from: b */
    private boolean f191789b = true;

    /* renamed from: c */
    private InputStream f191790c;

    public C72032ar(C72016ab abVar) {
        this.f191788a = abVar;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read() {
        C72092e a;
        if (this.f191790c == null) {
            if (!this.f191789b || (a = this.f191788a.mo63223a()) == null) {
                return -1;
            }
            if (a instanceof C72105r) {
                this.f191789b = false;
                this.f191790c = ((C72105r) a).mo63238e();
            } else {
                throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(a.getClass()))));
            }
        }
        while (true) {
            int read = this.f191790c.read();
            if (read >= 0) {
                return read;
            }
            C72092e a2 = this.f191788a.mo63223a();
            if (a2 == null) {
                this.f191790c = null;
                return -1;
            } else if (a2 instanceof C72105r) {
                this.f191790c = ((C72105r) a2).mo63238e();
            } else {
                throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(a2.getClass()))));
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        C72092e a;
        int i3 = 0;
        if (this.f191790c == null) {
            if (!this.f191789b || (a = this.f191788a.mo63223a()) == null) {
                return -1;
            }
            if (a instanceof C72105r) {
                this.f191789b = false;
                this.f191790c = ((C72105r) a).mo63238e();
            } else {
                throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(a.getClass()))));
            }
        }
        while (true) {
            int read = this.f191790c.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                C72092e a2 = this.f191788a.mo63223a();
                if (a2 == null) {
                    this.f191790c = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                } else if (a2 instanceof C72105r) {
                    this.f191790c = ((C72105r) a2).mo63238e();
                } else {
                    throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(a2.getClass()))));
                }
            }
        }
    }
}
