package com.google.common.p4522b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.common.b.ic */
/* compiled from: PG */
final class C58521ic implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C58495hd f156166a;

    public C58521ic(C58495hd hdVar) {
        this.f156166a = hdVar;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        if (this.f156166a.isEmpty()) {
            return C58522id.f156167a;
        }
        ArrayList arrayList = new ArrayList();
        C58800sl lA = this.f156166a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C58520ib.m89987b((C58714pg) entry.getKey(), entry.getValue(), arrayList);
        }
        return C58520ib.m89986a(arrayList);
    }
}
