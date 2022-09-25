package androidx.media3.extractor.p157d;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.d.e */
/* compiled from: PG */
abstract class C3385e {

    /* renamed from: d */
    protected final C3368bf f10249d;

    protected C3385e(C3368bf bfVar) {
        this.f10249d = bfVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo7368a(C2604ac acVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo7369b(C2604ac acVar, long j);

    /* renamed from: c */
    public final boolean mo7370c(C2604ac acVar, long j) {
        return mo7368a(acVar) && mo7369b(acVar, j);
    }
}
