package androidx.media3.extractor.p163j.p168e;

import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3482c;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.e.b */
/* compiled from: PG */
final class C3495b implements C3482c {

    /* renamed from: a */
    private final C2567c[] f10885a;

    /* renamed from: b */
    private final long[] f10886b;

    public C3495b(C2567c[] cVarArr, long[] jArr) {
        this.f10885a = cVarArr;
        this.f10886b = jArr;
    }

    /* renamed from: a */
    public final int mo7193a() {
        return this.f10886b.length;
    }

    /* renamed from: b */
    public final int mo7194b(long j) {
        int av = C2612ak.m6972av(this.f10886b, j, false);
        if (av < this.f10886b.length) {
            return av;
        }
        return -1;
    }

    /* renamed from: d */
    public final List mo7195d(long j) {
        int aw = C2612ak.m6973aw(this.f10886b, j, false);
        if (aw == -1 || this.f10885a[aw] == C2567c.f7082a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.f10885a[aw]);
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        boolean z = true;
        C2601a.m6830b(i >= 0);
        if (i >= this.f10886b.length) {
            z = false;
        }
        C2601a.m6830b(z);
        return this.f10886b[i];
    }
}
