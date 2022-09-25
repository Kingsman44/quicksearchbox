package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.search.core.aj.e */
/* compiled from: PG */
public final class C84545e extends InputStream implements InputStreamRetargetInterface, C90991b {

    /* renamed from: a */
    final /* synthetic */ C84547g f230077a;

    /* renamed from: b */
    private int f230078b;

    /* renamed from: c */
    private int f230079c;

    /* renamed from: d */
    private InputStream f230080d;

    /* renamed from: e */
    private int f230081e;

    public C84545e(C84547g gVar) {
        this.f230077a = gVar;
        new AtomicInteger();
    }

    public final int available() {
        return this.f230079c;
    }

    public final void close() {
        this.f230078b = -1;
        this.f230080d = null;
        this.f230079c = 0;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ChunkInputStream");
        fVar.mo85279c("buffer").mo85276a(C90752i.m148229c(this.f230077a.mo78272b()));
        fVar.mo85279c("read bytes").mo85276a(C90752i.m148230d(Integer.valueOf(this.f230081e)));
        fVar.mo85279c("stream").mo85276a(C90752i.m148229c(this.f230080d == null ? "null" : "non-null"));
        fVar.mo85279c("next chunk").mo85276a(C90752i.m148230d(Integer.valueOf(this.f230078b)));
        fVar.mo85279c("available bytes").mo85276a(C90752i.m148230d(Integer.valueOf(this.f230079c)));
    }

    public final int read() {
        while (m135215a()) {
            int read = this.f230080d.read();
            if (read >= 0) {
                this.f230081e++;
                return read;
            }
            this.f230080d = null;
        }
        return -1;
    }

    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && m135215a()) {
            long skip = this.f230080d.skip(j - j2);
            j2 += skip;
            if (skip == 0) {
                this.f230080d = null;
            }
        }
        return j2;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2 && m135215a()) {
            int read = this.f230080d.read(bArr, i + i3, i2 - i3);
            if (read <= 0) {
                this.f230080d = null;
            } else {
                i3 += read;
            }
        }
        this.f230081e += i3;
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    /* renamed from: a */
    private final boolean m135215a() {
        C84550j jVar;
        C84550j jVar2;
        if (this.f230080d != null) {
            return true;
        }
        while (true) {
            try {
                if (this.f230078b == -1) {
                    jVar = null;
                } else {
                    synchronized (this.f230077a.f230084b) {
                        while (this.f230078b >= this.f230077a.f230085c.size()) {
                            this.f230077a.f230084b.wait();
                        }
                        jVar2 = (C84550j) this.f230077a.f230085c.get(this.f230078b);
                        if (jVar2 == null) {
                            this.f230078b = -1;
                            this.f230079c = 0;
                        } else {
                            List list = this.f230077a.f230086d;
                            this.f230079c = ((Integer) list.get(list.size() - 1)).intValue() - ((Integer) this.f230077a.f230086d.get(this.f230078b)).intValue();
                            this.f230078b++;
                        }
                    }
                    jVar = jVar2;
                }
                if (jVar instanceof C84552l) {
                    this.f230080d = ((C84552l) jVar).mo78278c();
                    return true;
                } else if (jVar instanceof C84546f) {
                    Exception c = ((C84546f) jVar).f230082a.mo79845c();
                    throw (c instanceof IOException ? (IOException) c : new IOException(c));
                } else if (jVar == null) {
                    return false;
                } else {
                    ((C59052c) ((C59052c) C84547g.f230083a.mo56225c()).mo56372aa(9415)).mo56386p("Unknown chunk in stream");
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                ((C59052c) ((C59052c) C84547g.f230083a.mo56226d()).mo56372aa(9416)).mo56386p("Interrupted while getting next stream");
                return false;
            }
        }
        while (true) {
        }
    }
}
