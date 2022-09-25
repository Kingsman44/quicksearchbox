package com.google.android.libraries.p2460r.p2469c;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.NetError;

/* renamed from: com.google.android.libraries.r.c.n */
/* compiled from: PG */
final class C32136n {

    /* renamed from: a */
    public final SparseArray f86295a;

    /* renamed from: b */
    private final SparseIntArray f86296b;

    public C32136n() {
        SparseArray sparseArray = new SparseArray();
        this.f86295a = sparseArray;
        sparseArray.put(1, new ArrayList());
        sparseArray.put(2, new ArrayList());
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f86296b = sparseIntArray;
        sparseIntArray.put(1, -1074534);
        sparseIntArray.put(2, NetError.ERR_WS_THROTTLE_QUEUE_TOO_LARGE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37936a(int i, C57404cb cbVar, String str) {
        ((List) this.f86295a.get(i)).add(new C32135m(cbVar, str));
    }
}
