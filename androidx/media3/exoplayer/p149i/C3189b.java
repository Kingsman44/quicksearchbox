package androidx.media3.exoplayer.p149i;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.p163j.C3482c;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.i.b */
/* compiled from: PG */
final class C3189b implements C3482c {

    /* renamed from: a */
    private final long f9540a;

    /* renamed from: b */
    private final C58485gu f9541b;

    public C3189b(long j, C58485gu guVar) {
        this.f9540a = j;
        this.f9541b = guVar;
    }

    /* renamed from: a */
    public final int mo7193a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo7194b(long j) {
        return this.f9540a > j ? 0 : -1;
    }

    /* renamed from: d */
    public final List mo7195d(long j) {
        return j >= this.f9540a ? this.f9541b : C58485gu.m89845m();
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        C2601a.m6830b(i == 0);
        return this.f9540a;
    }
}
