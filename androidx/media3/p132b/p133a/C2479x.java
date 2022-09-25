package androidx.media3.p132b.p133a;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: androidx.media3.b.a.x */
/* compiled from: PG */
final class C2479x extends BufferedOutputStream {

    /* renamed from: a */
    private boolean f6816a;

    public C2479x(OutputStream outputStream) {
        super(outputStream, 20480);
    }

    /* renamed from: a */
    public final void mo5916a(OutputStream outputStream) {
        C2601a.m6832d(this.f6816a);
        this.out = outputStream;
        this.count = 0;
        this.f6816a = false;
    }

    public final void close() {
        this.f6816a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            int i = C2612ak.f7249a;
            throw th;
        }
    }
}
