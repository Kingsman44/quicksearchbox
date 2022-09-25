package androidx.media3.extractor.p163j.p170g;

import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.p163j.C3482c;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.g.b */
/* compiled from: PG */
final class C3510b implements C3482c {

    /* renamed from: a */
    public static final C3510b f10965a = new C3510b();

    /* renamed from: b */
    private final List f10966b;

    private C3510b() {
        this.f10966b = Collections.emptyList();
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
        return j >= 0 ? this.f10966b : Collections.emptyList();
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        C2601a.m6830b(i == 0);
        return 0;
    }

    public C3510b(C2567c cVar) {
        this.f10966b = Collections.singletonList(cVar);
    }
}
