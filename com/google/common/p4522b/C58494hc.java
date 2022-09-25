package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Map;

/* renamed from: com.google.common.b.hc */
/* compiled from: PG */
class C58494hc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f156127a;

    /* renamed from: b */
    private final Object f156128b;

    public C58494hc(C58495hd hdVar) {
        Object[] objArr = new Object[hdVar.size()];
        Object[] objArr2 = new Object[hdVar.size()];
        C58800sl lA = hdVar.entrySet().iterator();
        int i = 0;
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f156127a = objArr;
        this.f156128b = objArr2;
    }

    /* renamed from: a */
    public C58490gz mo55366a(int i) {
        return new C58490gz(i);
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        Object obj = this.f156127a;
        if (!(obj instanceof C58528ij)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.f156128b;
            C58490gz a = mo55366a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.mo55429h(objArr[i], objArr2[i]);
            }
            return a.mo55363c();
        }
        C58528ij ijVar = (C58528ij) obj;
        C58490gz a2 = mo55366a(ijVar.size());
        C58800sl lA = ijVar.iterator();
        C58800sl lA2 = ((C58471gg) this.f156128b).iterator();
        while (lA.hasNext()) {
            a2.mo55429h(lA.next(), lA2.next());
        }
        return a2.mo55363c();
    }
}
