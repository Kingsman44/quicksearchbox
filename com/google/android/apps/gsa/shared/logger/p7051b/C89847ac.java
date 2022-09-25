package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58758qx;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.ac */
/* compiled from: PG */
final class C89847ac {

    /* renamed from: a */
    public final NavigableSet f243180a = new TreeSet();

    /* renamed from: b */
    public final Map f243181b = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C58541iw mo83682a() {
        return C58541iw.m90069T(this.f243180a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C58541iw mo83683b(C22804a aVar, C22804a aVar2) {
        NavigableSet subSet = this.f243180a.subSet(aVar, true, aVar2, true);
        C58495hd hdVar = aVar2.f62789d;
        if (hdVar.isEmpty()) {
            return C58541iw.m90069T(subSet);
        }
        return C58541iw.m90069T(C58758qx.m90650h(subSet, new C89845aa(hdVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized C58541iw mo83684c(C22804a aVar) {
        return C58541iw.m90069T(this.f243180a.headSet(aVar, true));
    }
}
