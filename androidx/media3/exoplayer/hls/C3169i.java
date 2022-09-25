package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.p148a.C3142j;
import androidx.media3.exoplayer.p145h.p147b.C3046b;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.hls.i */
/* compiled from: PG */
final class C3169i extends C3046b {

    /* renamed from: c */
    private final List f9394c;

    /* renamed from: d */
    private final long f9395d;

    public C3169i(long j, List list) {
        super(0, (long) (list.size() - 1));
        this.f9395d = j;
        this.f9394c = list;
    }

    /* renamed from: a */
    public final long mo6838a() {
        mo6980c();
        C3142j jVar = (C3142j) this.f9394c.get((int) this.f8824a);
        return this.f9395d + jVar.f9263g + jVar.f9261e;
    }

    /* renamed from: b */
    public final long mo6839b() {
        mo6980c();
        return this.f9395d + ((C3142j) this.f9394c.get((int) this.f8824a)).f9263g;
    }
}
