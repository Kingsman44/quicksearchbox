package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arr */
/* compiled from: PG */
final class arr implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f21459a;

    /* renamed from: b */
    private final Object f21460b;

    public arr(ars ars) {
        Object[] objArr = new Object[ars.size()];
        Object[] objArr2 = new Object[ars.size()];
        asp a = ars.entrySet().iterator();
        int i = 0;
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f21459a = objArr;
        this.f21460b = objArr2;
    }

    /* renamed from: a */
    static final arq m19426a(int i) {
        return new arq(i);
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        Object obj = this.f21459a;
        if (!(obj instanceof arx)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.f21460b;
            arq a = m19426a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.mo15311b(objArr[i], objArr2[i]);
            }
            return a.mo15310a();
        }
        arx arx = (arx) obj;
        arq a2 = m19426a(arx.size());
        asp a3 = arx.iterator();
        asp a4 = ((arj) this.f21460b).iterator();
        while (a3.hasNext()) {
            a2.mo15311b(a3.next(), a4.next());
        }
        return a2.mo15310a();
    }
}
