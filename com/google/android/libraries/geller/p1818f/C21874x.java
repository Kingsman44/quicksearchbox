package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.f.x */
/* compiled from: PG */
public final /* synthetic */ class C21874x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21875y f60356a;

    public /* synthetic */ C21874x(C21875y yVar) {
        this.f60356a = yVar;
    }

    public final Object apply(Object obj) {
        C21875y yVar = this.f60356a;
        Void voidR = (Void) obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : yVar.f60360d.entrySet()) {
            hashMap.put((C65753ak) entry.getKey(), ((C21849ce) entry.getValue()).mo27147a());
        }
        return hashMap;
    }
}
