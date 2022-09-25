package com.google.p4486ci.p4487a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58838bb;
import java.io.IOException;

/* renamed from: com.google.ci.a.j */
/* compiled from: PG */
final class C58105j implements C58097b {

    /* renamed from: a */
    private final String f155313a;

    /* renamed from: b */
    private final C58097b f155314b;

    /* renamed from: c */
    private C58113r f155315c;

    /* renamed from: d */
    private C58113r f155316d;

    /* renamed from: e */
    private C58113r f155317e;

    /* renamed from: f */
    private long f155318f = 0;

    /* renamed from: g */
    private long f155319g = 0;

    /* renamed from: h */
    private final long f155320h;

    /* renamed from: i */
    private boolean f155321i;

    /* renamed from: j */
    private int f155322j = 1;

    public C58105j(String str, String str2, C58100e eVar, C58097b bVar) {
        this.f155313a = str;
        this.f155314b = bVar;
        str2 = str2 == null ? BuildConfig.FLAVOR : str2;
        this.f155315c = new C58113r("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + "\r\n");
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append("\r\n");
        for (String str3 : eVar.mo54652c()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(eVar.mo54650a(str3));
            sb.append("\r\n");
        }
        if (this.f155314b.mo54644e() >= 0 && eVar.mo54651b("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.f155314b.mo54644e());
            sb.append("\r\n");
        }
        sb.append("\r\n");
        this.f155316d = new C58113r(sb.toString());
        if (bVar.mo54644e() != -1) {
            this.f155317e = m88865j();
            this.f155320h = this.f155315c.mo54644e() + this.f155316d.mo54644e() + bVar.mo54644e() + this.f155317e.mo54644e();
            return;
        }
        this.f155320h = -1;
    }

    /* renamed from: j */
    private final C58113r m88865j() {
        return new C58113r("\r\n--" + this.f155313a + "--");
    }

    /* renamed from: a */
    public final int mo54639a(byte[] bArr, int i, int i2) {
        if (!this.f155321i) {
            C58838bb.m90869d(65536 - i >= i2, "Buffer length must be greater than or equal to desired number of bytes.");
            if (i2 == 0) {
                return 0;
            }
            long j = this.f155318f;
            while (true) {
                long j2 = this.f155318f;
                if (j2 != j) {
                    return (int) (j2 - j);
                }
                int i3 = this.f155322j;
                int i4 = i3 - 1;
                C58097b bVar = null;
                if (i3 != 0) {
                    if (i4 == 0) {
                        bVar = this.f155315c;
                        i3 = 2;
                    } else if (i4 == 1) {
                        bVar = this.f155316d;
                        i3 = 3;
                    } else if (i4 == 2) {
                        bVar = this.f155314b;
                        i3 = 4;
                    } else if (i4 == 3) {
                        if (this.f155317e == null) {
                            this.f155317e = m88865j();
                        }
                        bVar = this.f155317e;
                        i3 = 5;
                    } else if (i4 == 4) {
                        return 0;
                    }
                    this.f155318f += (long) bVar.mo54639a(bArr, i, i2);
                    if (bVar.mo54641c() < Long.MAX_VALUE) {
                        bVar.mo54646g();
                    }
                    if (!bVar.mo54648i()) {
                        this.f155322j = i3;
                    }
                } else {
                    throw null;
                }
            }
        } else {
            throw new IOException("Trying to read from an already-closed stream.");
        }
    }

    /* renamed from: b */
    public final long mo54640b() {
        return this.f155319g;
    }

    /* renamed from: c */
    public final long mo54641c() {
        return Long.MAX_VALUE;
    }

    public final void close() {
        this.f155321i = true;
        this.f155314b.close();
    }

    /* renamed from: d */
    public final long mo54643d() {
        return this.f155318f;
    }

    /* renamed from: e */
    public final long mo54644e() {
        return this.f155320h;
    }

    /* renamed from: f */
    public final long mo54645f(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }

    /* renamed from: g */
    public final void mo54646g() {
        this.f155319g = this.f155318f;
    }

    /* renamed from: h */
    public final void mo54647h() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    /* renamed from: i */
    public final boolean mo54648i() {
        return this.f155322j != 5;
    }
}
