package androidx.media3.extractor.p163j.p167d;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3482c;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.d.f */
/* compiled from: PG */
final class C3492f implements C3482c {

    /* renamed from: a */
    private final List f10879a;

    /* renamed from: b */
    private final List f10880b;

    public C3492f(List list, List list2) {
        this.f10879a = list;
        this.f10880b = list2;
    }

    /* renamed from: a */
    public final int mo7193a() {
        return this.f10880b.size();
    }

    /* renamed from: b */
    public final int mo7194b(long j) {
        int au = C2612ak.m6971au(this.f10880b, Long.valueOf(j));
        if (au < this.f10880b.size()) {
            return au;
        }
        return -1;
    }

    /* renamed from: d */
    public final List mo7195d(long j) {
        int b = C2612ak.m6977b(this.f10880b, Long.valueOf(j), true, false);
        if (b == -1) {
            return Collections.emptyList();
        }
        return (List) this.f10879a.get(b);
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        boolean z = true;
        C2601a.m6830b(i >= 0);
        if (i >= this.f10880b.size()) {
            z = false;
        }
        C2601a.m6830b(z);
        return ((Long) this.f10880b.get(i)).longValue();
    }
}
