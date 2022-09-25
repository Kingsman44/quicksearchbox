package com.google.android.libraries.elements.interfaces;

import com.google.protobuf.C62897ae;
import com.google.protos.youtube.elements.C66127bf;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.C66132bk;
import java.io.IOException;
import java.nio.ByteBuffer;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.elements.interfaces.bv */
/* compiled from: PG */
public final class C21279bv {

    /* renamed from: a */
    public static final ByteBuffer f59591a;

    /* renamed from: b */
    public static final C21279bv f59592b;

    /* renamed from: c */
    public final ByteBuffer f59593c;

    /* renamed from: d */
    public final boolean f59594d;

    /* renamed from: e */
    private volatile ByteBuffer f59595e = null;

    static {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
        f59591a = wrap;
        f59592b = new C21279bv(wrap, false);
    }

    private C21279bv(ByteBuffer byteBuffer, boolean z) {
        this.f59593c = byteBuffer.duplicate();
        this.f59594d = z;
    }

    /* renamed from: a */
    public static C21279bv m40117a(ByteBuffer byteBuffer) {
        return byteBuffer == null ? f59592b : new C21279bv(byteBuffer, false);
    }

    /* renamed from: b */
    public static C21279bv m40118b(byte[] bArr) {
        if (bArr == null) {
            return f59592b;
        }
        return new C21279bv(ByteBuffer.wrap(bArr), false);
    }

    /* renamed from: c */
    public static C21279bv m40119c(C66132bk bkVar) {
        if (bkVar == null) {
            return f59592b;
        }
        C66127bf bfVar = (C66127bf) C66128bg.f179829a.createBuilder();
        bfVar.mo58885m(C66132bk.f179835c, bkVar);
        return new C21279bv(ByteBuffer.wrap(((C66128bg) bfVar.build()).toByteArray()), true);
    }

    /* renamed from: d */
    public static C21279bv m40120d(C66128bg bgVar) {
        return m40118b(bgVar.toByteArray());
    }

    /* renamed from: e */
    public final ByteBuffer mo26771e() {
        ByteBuffer duplicate;
        ByteBuffer byteBuffer;
        if (this.f59595e != null) {
            return this.f59595e;
        }
        synchronized (this) {
            if (this.f59595e == null) {
                ByteBuffer duplicate2 = this.f59593c.duplicate();
                try {
                    C62897ae N = C62897ae.m95111N(duplicate2);
                    if (N.mo58661D()) {
                        byteBuffer = f59591a;
                    } else {
                        N.mo58678m();
                        N.mo58675j();
                        duplicate2.position(duplicate2.position() + N.mo58669d());
                        byteBuffer = duplicate2.slice();
                    }
                    this.f59595e = byteBuffer;
                } catch (IOException e) {
                    throw new C21260bc("Error reading extension from model", e);
                }
            }
            duplicate = this.f59595e.duplicate();
        }
        return duplicate;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21279bv)) {
            return false;
        }
        C21279bv bvVar = (C21279bv) obj;
        if (bvVar.f59594d != this.f59594d || !this.f59593c.equals(bvVar.f59593c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f59594d), this.f59593c);
    }
}
