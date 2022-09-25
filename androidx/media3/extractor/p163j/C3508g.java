package androidx.media3.extractor.p163j;

import androidx.media3.p134c.C2530h;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.g */
/* compiled from: PG */
public abstract class C3508g extends C2530h implements C3482c {

    /* renamed from: d */
    private C3482c f10956d;

    /* renamed from: e */
    private long f10957e;

    /* renamed from: e */
    public final void mo7447e(long j, C3482c cVar, long j2) {
        this.f6960b = j;
        this.f10956d = cVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f10957e = j;
    }

    /* renamed from: fg */
    public final void mo5953fg() {
        this.f6941a = 0;
        this.f10956d = null;
    }

    /* renamed from: a */
    public final int mo7193a() {
        C3482c cVar = this.f10956d;
        cVar.getClass();
        return cVar.mo7193a();
    }

    /* renamed from: b */
    public final int mo7194b(long j) {
        C3482c cVar = this.f10956d;
        cVar.getClass();
        return cVar.mo7194b(j - this.f10957e);
    }

    /* renamed from: d */
    public final List mo7195d(long j) {
        C3482c cVar = this.f10956d;
        cVar.getClass();
        return cVar.mo7195d(j - this.f10957e);
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        C3482c cVar = this.f10956d;
        cVar.getClass();
        return cVar.mo7196ff(i) + this.f10957e;
    }
}
