package androidx.media3.extractor.p158e;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3338am;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.e.d */
/* compiled from: PG */
final class C3391d extends C3338am {

    /* renamed from: b */
    private final long f10273b;

    public C3391d(C3327ab abVar, long j) {
        super(abVar);
        C2601a.m6830b(((C3627q) abVar).f11566c >= j);
        this.f10273b = j;
    }

    /* renamed from: d */
    public final long mo7311d() {
        return ((C3627q) this.f10071a).f11565b - this.f10273b;
    }

    /* renamed from: e */
    public final long mo7312e() {
        return super.mo7312e() - this.f10273b;
    }

    /* renamed from: f */
    public final long mo7313f() {
        return ((C3627q) this.f10071a).f11566c - this.f10273b;
    }
}
