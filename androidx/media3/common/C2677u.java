package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.u */
/* compiled from: PG */
public final class C2677u {

    /* renamed from: a */
    public final SparseBooleanArray f7443a;

    public C2677u(SparseBooleanArray sparseBooleanArray) {
        this.f7443a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo6352a(int i) {
        C2601a.m6834f(i, this.f7443a.size());
        return this.f7443a.keyAt(i);
    }

    /* renamed from: b */
    public final boolean mo6353b(int... iArr) {
        for (int i : iArr) {
            if (this.f7443a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2677u)) {
            return false;
        }
        int i = C2612ak.f7249a;
        return this.f7443a.equals(((C2677u) obj).f7443a);
    }

    public final int hashCode() {
        int i = C2612ak.f7249a;
        return this.f7443a.hashCode();
    }
}
