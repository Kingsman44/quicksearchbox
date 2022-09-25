package com.google.android.libraries.social.populous.p3295d;

import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.d.h */
/* compiled from: PG */
public final class C42374h {

    /* renamed from: a */
    public final Set f111115a = new HashSet();

    /* renamed from: b */
    public final C58526ih f111116b = new C58526ih();

    /* renamed from: c */
    public int f111117c;

    /* renamed from: d */
    public int f111118d;

    /* renamed from: e */
    private final Map f111119e = new HashMap();

    /* renamed from: f */
    private final Set f111120f = new HashSet();

    /* renamed from: b */
    public final void mo45359b(C42321ct ctVar) {
        this.f111120f.add(ctVar);
        this.f111115a.remove(ctVar);
    }

    /* renamed from: c */
    public final void mo45360c(Collection collection) {
        this.f111120f.addAll(collection);
        this.f111115a.removeAll(collection);
    }

    /* renamed from: d */
    public final void mo45361d(Collection collection) {
        this.f111115a.addAll(collection);
    }

    /* renamed from: e */
    public final void mo45362e(C42321ct ctVar, C42405ab abVar) {
        this.f111119e.put(ctVar, abVar);
        this.f111115a.remove(ctVar);
    }

    /* renamed from: a */
    public final C42375i mo45358a() {
        int i = this.f111117c;
        if (i != 0) {
            int i2 = this.f111118d;
            if (i2 != 0) {
                return new C42375i(i, i2, C58495hd.m89898l(this.f111119e), C58528ij.m90006F(this.f111120f), C58528ij.m90006F(this.f111115a), this.f111116b.mo55486f());
            }
            throw null;
        }
        throw null;
    }
}
