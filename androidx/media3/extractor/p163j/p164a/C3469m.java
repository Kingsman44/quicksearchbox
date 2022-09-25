package androidx.media3.extractor.p163j.p164a;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.p163j.C3482c;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.a.m */
/* compiled from: PG */
final class C3469m implements C3482c {

    /* renamed from: a */
    private final List f10776a;

    public C3469m(List list) {
        this.f10776a = list;
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
        return j >= 0 ? this.f10776a : Collections.emptyList();
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        C2601a.m6830b(i == 0);
        return 0;
    }
}
