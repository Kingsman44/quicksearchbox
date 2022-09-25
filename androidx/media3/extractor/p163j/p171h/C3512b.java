package androidx.media3.extractor.p163j.p171h;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.p163j.C3482c;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.h.b */
/* compiled from: PG */
final class C3512b implements C3482c {

    /* renamed from: a */
    private final List f10968a;

    public C3512b(List list) {
        this.f10968a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public final int mo7193a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo7194b(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: d */
    public final List mo7195d(long j) {
        return j >= 0 ? this.f10968a : Collections.emptyList();
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        C2601a.m6830b(i == 0);
        return 0;
    }
}
