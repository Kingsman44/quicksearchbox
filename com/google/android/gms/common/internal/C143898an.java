package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.api.C143839k;

/* renamed from: com.google.android.gms.common.internal.an */
/* compiled from: PG */
public final class C143898an {

    /* renamed from: a */
    public final SparseIntArray f390102a;

    /* renamed from: b */
    private C143876h f390103b;

    public C143898an() {
        C143875g gVar = C143875g.f389987a;
        throw null;
    }

    /* renamed from: a */
    public final int mo119414a(Context context, C143839k kVar) {
        C143919bh.m233958a(context);
        C143919bh.m233958a(kVar);
        int i = 0;
        if (!kVar.mo119251z()) {
            return 0;
        }
        int a = kVar.mo57744a();
        int b = mo119415b(a);
        if (b == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f390102a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f390102a.keyAt(i2);
                if (keyAt > a && this.f390102a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            b = i == -1 ? this.f390103b.mo119362j(context, a) : i;
            this.f390102a.put(a, b);
        }
        return b;
    }

    /* renamed from: b */
    public final int mo119415b(int i) {
        return this.f390102a.get(i, -1);
    }

    public C143898an(C143876h hVar) {
        this.f390102a = new SparseIntArray();
        C143919bh.m233958a(hVar);
        this.f390103b = hVar;
    }
}
