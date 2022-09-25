package com.google.android.apps.gsa.nga.shared.p6352l.p6353a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.d */
/* compiled from: PG */
final class C81370d extends C81381o {

    /* renamed from: a */
    private final C80267v f222710a;

    /* renamed from: b */
    private final C80265t f222711b;

    /* renamed from: c */
    private final int f222712c;

    public C81370d(C80267v vVar, int i, C80265t tVar) {
        this.f222710a = vVar;
        this.f222712c = i;
        this.f222711b = tVar;
    }

    /* renamed from: a */
    public final C80265t mo75046a() {
        return this.f222711b;
    }

    /* renamed from: b */
    public final C80267v mo75047b() {
        return this.f222710a;
    }

    /* renamed from: c */
    public final int mo75048c() {
        return this.f222712c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81381o) {
            C81381o oVar = (C81381o) obj;
            if (this.f222710a.equals(oVar.mo75047b())) {
                int i = this.f222712c;
                int c = oVar.mo75048c();
                if (i != 0) {
                    return i == c && this.f222711b.equals(oVar.mo75046a());
                }
                throw null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.f222710a.hashCode() ^ 1000003) * 1000003;
        int i = this.f222712c;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ this.f222711b.hashCode();
        }
        throw null;
    }
}
