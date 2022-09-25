package androidx.media3.p132b.p133a;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p132b.C2510n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: androidx.media3.b.a.d */
/* compiled from: PG */
public final class C2459d {

    /* renamed from: a */
    public C2510n f6749a;

    /* renamed from: b */
    public long f6750b;

    /* renamed from: c */
    public OutputStream f6751c;

    /* renamed from: d */
    public long f6752d;

    /* renamed from: e */
    public long f6753e;

    /* renamed from: f */
    private final C2457b f6754f;

    /* renamed from: g */
    private File f6755g;

    /* renamed from: h */
    private C2479x f6756h;

    public C2459d(C2457b bVar) {
        this.f6754f = bVar;
    }

    /* renamed from: b */
    public final void mo5876b() {
        OutputStream outputStream = this.f6751c;
        if (outputStream != null) {
            try {
                outputStream.flush();
                C2612ak.m6941X(this.f6751c);
                this.f6751c = null;
                File file = this.f6755g;
                this.f6755g = null;
                this.f6754f.mo5872e(file, this.f6752d);
            } catch (Throwable th) {
                C2612ak.m6941X(this.f6751c);
                this.f6751c = null;
                File file2 = this.f6755g;
                this.f6755g = null;
                file2.delete();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void mo5877c(C2510n nVar) {
        long j = nVar.f6897g;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f6753e, this.f6750b);
        }
        C2457b bVar = this.f6754f;
        String str = nVar.f6898h;
        int i = C2612ak.f7249a;
        this.f6755g = bVar.mo5870c(str, nVar.f6896f + this.f6753e, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f6755g);
        C2479x xVar = this.f6756h;
        if (xVar == null) {
            this.f6756h = new C2479x(fileOutputStream);
        } else {
            xVar.mo5916a(fileOutputStream);
        }
        this.f6751c = this.f6756h;
        this.f6752d = 0;
    }

    /* renamed from: a */
    public final void mo5875a() {
        if (this.f6749a != null) {
            try {
                mo5876b();
            } catch (IOException e) {
                throw new C2458c(e);
            }
        }
    }
}
