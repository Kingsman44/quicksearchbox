package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.aa.g */
/* compiled from: PG */
public final class C89051g {

    /* renamed from: a */
    public static final C89051g f241328a = new C89051g();

    /* renamed from: c */
    private static final C59071e f241329c = C59071e.m91332i("com.google.android.apps.gsa.shared.aa.g");

    /* renamed from: b */
    public final int f241330b;

    /* renamed from: d */
    private final Object f241331d;

    /* renamed from: e */
    private C89052h f241332e;

    /* renamed from: f */
    private ByteBuffer f241333f;

    /* renamed from: g */
    private final C90457d f241334g;

    /* renamed from: h */
    private final boolean f241335h;

    /* renamed from: i */
    private volatile RuntimeException f241336i;

    private C89051g() {
        this.f241331d = new Object();
        this.f241330b = 3;
        this.f241332e = null;
        this.f241333f = null;
        this.f241334g = null;
        this.f241335h = false;
    }

    public C89051g(C90457d dVar) {
        this.f241331d = new Object();
        this.f241330b = 2;
        this.f241332e = null;
        this.f241333f = null;
        dVar.getClass();
        this.f241334g = dVar;
        this.f241335h = false;
    }

    /* renamed from: a */
    public final int mo83020a() {
        int remaining;
        int i = this.f241330b;
        boolean z = false;
        if (i == 1) {
            synchronized (this.f241331d) {
                if (this.f241333f != null) {
                    z = true;
                }
                C58838bb.m90884s(z, "Chunk already released.");
                remaining = this.f241333f.remaining();
            }
            return remaining;
        } else if (i == 2 || i == 3) {
            return 0;
        } else {
            throw new AssertionError("Unexpected chunk type: " + i);
        }
    }

    /* renamed from: c */
    public final int mo83022c(ByteBuffer byteBuffer) {
        int a;
        boolean z = true;
        if (this.f241330b != 1) {
            z = false;
        }
        C58838bb.m90883r(z);
        synchronized (this.f241331d) {
            a = C89049e.m144833a(this.f241333f, byteBuffer);
        }
        return a;
    }

    /* renamed from: d */
    public final C90457d mo83023d() {
        C58838bb.m90883r(this.f241330b == 2);
        return this.f241334g;
    }

    /* renamed from: e */
    public final void mo83024e() {
        ByteBuffer byteBuffer;
        C89052h hVar;
        boolean z = true;
        if (this.f241330b == 1) {
            synchronized (this.f241331d) {
                C58838bb.m90883r(this.f241333f != null);
                if (this.f241332e == null) {
                    z = false;
                }
                C58838bb.m90883r(z);
                byteBuffer = this.f241333f;
                hVar = this.f241332e;
                this.f241333f = null;
                this.f241332e = null;
            }
            hVar.mo83031e(byteBuffer);
            this.f241336i = null;
        }
    }

    /* renamed from: f */
    public final void mo83025f(WritableByteChannel writableByteChannel) {
        boolean z = true;
        if (this.f241330b != 1) {
            z = false;
        }
        C58838bb.m90883r(z);
        synchronized (this.f241331d) {
            writableByteChannel.write(this.f241333f);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f241335h && this.f241336i != null) {
                ((C59052c) ((C59052c) ((C59052c) f241329c.mo56226d()).mo56382g(this.f241336i)).mo56372aa(10633)).mo56386p("finalize() without release().");
            }
        } finally {
            super.finalize();
        }
    }

    public final String toString() {
        String format;
        int i = this.f241330b;
        if (i == 1) {
            synchronized (this.f241331d) {
                format = this.f241333f != null ? String.format(Locale.US, "Chunk(pos=%d, remaining=%d)", new Object[]{Integer.valueOf(this.f241333f.position()), Integer.valueOf(this.f241333f.remaining())}) : "Chunk(released)";
            }
            return format;
        } else if (i != 2) {
            return i != 3 ? "Chunk(unknown type)" : "Chunk(EOF)";
        } else {
            String valueOf = String.valueOf(this.f241334g);
            return "Chunk(" + valueOf + ")";
        }
    }

    public C89051g(C89052h hVar, ByteBuffer byteBuffer, boolean z) {
        this.f241331d = new Object();
        boolean z2 = true;
        this.f241330b = 1;
        hVar.getClass();
        this.f241332e = hVar;
        byteBuffer.getClass();
        this.f241333f = byteBuffer;
        C58838bb.m90868c(byteBuffer.isDirect());
        C58838bb.m90868c(byteBuffer.position() != 0 ? false : z2);
        C58838bb.m90868c(byteBuffer.hasRemaining());
        this.f241334g = null;
        this.f241335h = z;
        if (z) {
            this.f241336i = new RuntimeException("Chunk leaked.");
        }
    }

    /* renamed from: b */
    public final int mo83021b(byte[] bArr, int i, int i2) {
        int min;
        int i3 = this.f241330b;
        boolean z = true;
        if (i3 == 1) {
            synchronized (this.f241331d) {
                if (this.f241333f == null) {
                    z = false;
                }
                C58838bb.m90884s(z, "Chunk already released.");
                ByteBuffer byteBuffer = this.f241333f;
                min = Math.min(byteBuffer.remaining(), i2);
                byteBuffer.get(bArr, i, min);
            }
            return min;
        } else if (i3 == 2) {
            throw this.f241334g;
        } else if (i3 == 3) {
            return -1;
        } else {
            throw new AssertionError("Unexpected chunk type: " + i3);
        }
    }
}
