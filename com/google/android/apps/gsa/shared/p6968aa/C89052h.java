package com.google.android.apps.gsa.shared.p6968aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58838bb;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.shared.aa.h */
/* compiled from: PG */
public final class C89052h implements C90991b {

    /* renamed from: a */
    public final Object f241337a = new Object();

    /* renamed from: b */
    public final Queue f241338b = new ArrayDeque();

    /* renamed from: c */
    public final AtomicInteger f241339c = new AtomicInteger(0);

    /* renamed from: d */
    public final AtomicInteger f241340d = new AtomicInteger(0);

    /* renamed from: e */
    public final AtomicInteger f241341e = new AtomicInteger(0);

    /* renamed from: f */
    public final AtomicInteger f241342f = new AtomicInteger(0);

    /* renamed from: g */
    public final Map f241343g = null;

    /* renamed from: h */
    private final Object f241344h = new Object();

    /* renamed from: i */
    private final Queue f241345i = new ArrayDeque();

    /* renamed from: j */
    private final AtomicInteger f241346j = new AtomicInteger(0);

    /* renamed from: k */
    private final AtomicInteger f241347k = new AtomicInteger(0);

    /* renamed from: l */
    private final AtomicInteger f241348l = new AtomicInteger(0);

    /* renamed from: m */
    private final AtomicInteger f241349m = new AtomicInteger(0);

    /* renamed from: n */
    private final AtomicInteger f241350n = new AtomicInteger(0);

    /* renamed from: o */
    private final AtomicInteger f241351o = new AtomicInteger(0);

    /* renamed from: a */
    public final C89051g mo83028a(ByteBuffer byteBuffer) {
        C58838bb.m90868c(byteBuffer.isDirect());
        boolean z = true;
        C58838bb.m90868c(byteBuffer.position() > 0);
        if (byteBuffer.limit() != 32768) {
            z = false;
        }
        C58838bb.m90868c(z);
        byteBuffer.flip();
        this.f241350n.incrementAndGet();
        this.f241351o.addAndGet(byteBuffer.remaining());
        return new C89051g(this, byteBuffer, false);
    }

    /* renamed from: b */
    public final ByteBuffer mo83029b() {
        ByteBuffer byteBuffer;
        synchronized (this.f241344h) {
            byteBuffer = (ByteBuffer) this.f241345i.poll();
        }
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(32768);
        }
        C58838bb.m90884s(byteBuffer.isDirect(), BuildConfig.FLAVOR);
        boolean z = true;
        C58838bb.m90884s(byteBuffer.capacity() == 32768, BuildConfig.FLAVOR);
        C58838bb.m90884s(byteBuffer.position() == 0, BuildConfig.FLAVOR);
        if (byteBuffer.limit() != 32768) {
            z = false;
        }
        C58838bb.m90884s(z, BuildConfig.FLAVOR);
        this.f241346j.incrementAndGet();
        return byteBuffer;
    }

    /* renamed from: c */
    public final void mo83030c(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() != 32768 || !byteBuffer.isDirect()) {
            this.f241349m.incrementAndGet();
        } else {
            this.f241348l.incrementAndGet();
        }
    }

    /* renamed from: e */
    public final void mo83031e(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() != 32768 || !byteBuffer.isDirect()) {
            this.f241349m.incrementAndGet();
            return;
        }
        byteBuffer.clear();
        synchronized (this.f241344h) {
            if (this.f241345i.size() < 28) {
                this.f241345i.add(byteBuffer);
                this.f241347k.incrementAndGet();
            } else {
                this.f241348l.incrementAndGet();
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        int size;
        int size2;
        fVar.mo85291r("ChunkPool");
        synchronized (this.f241344h) {
            size = this.f241345i.size();
        }
        fVar.mo85293t("Buffers: %d in pool, %d obtained, %d recycled, %d discarded, %d invalid.", C90752i.m148230d(Integer.valueOf(size)), C90752i.m148230d(Integer.valueOf(this.f241346j.get())), C90752i.m148230d(Integer.valueOf(this.f241347k.get())), C90752i.m148230d(Integer.valueOf(this.f241348l.get())), C90752i.m148230d(Integer.valueOf(this.f241349m.get())));
        synchronized (this.f241337a) {
            size2 = this.f241338b.size();
        }
        fVar.mo85293t("Arrays: %d in pool, %d obtained, %d recycled, %d discarded, %d invalid.", C90752i.m148230d(Integer.valueOf(size2)), C90752i.m148230d(Integer.valueOf(this.f241339c.get())), C90752i.m148230d(Integer.valueOf(this.f241340d.get())), C90752i.m148230d(Integer.valueOf(this.f241341e.get())), C90752i.m148230d(Integer.valueOf(this.f241342f.get())));
        double d = (double) this.f241351o.get();
        double d2 = (double) this.f241350n.get();
        Double.isNaN(d2);
        Double.isNaN(d);
        fVar.mo85293t("Chunks: %d, %.2f utilization rate.", C90752i.m148230d(Integer.valueOf(this.f241350n.get())), C90752i.m148230d(Double.valueOf(d / (d2 * 32768.0d))));
    }
}
