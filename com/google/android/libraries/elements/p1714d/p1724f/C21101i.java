package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62893aa;
import com.google.protobuf.C62897ae;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p5488io.p5490b.C70092f;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5519k.C70115c;

/* renamed from: com.google.android.libraries.elements.d.f.i */
/* compiled from: PG */
public final class C21101i {
    /* renamed from: a */
    static C70120l m39636a(C21099g gVar, int i, C58495hd hdVar, C21232ab abVar, C70120l lVar) {
        if (hdVar.isEmpty()) {
            return new C70115c(gVar.mo26153b(i));
        }
        try {
            C58490gz gzVar = new C58490gz(4);
            HashMap hashMap = new HashMap();
            byte[] bArr = gVar.f59137a;
            int i2 = C62897ae.f169827g;
            C62897ae O = C62897ae.m95112O(bArr, 0, bArr.length);
            while (!O.mo58661D()) {
                int m = O.mo58678m();
                int i3 = m >>> 3;
                if ((m & 7) == 2) {
                    hashMap.put(Integer.valueOf(i3), ((C62893aa) O).mo58665H(((C62893aa) O).mo58675j()));
                } else {
                    O.mo58663F(m);
                }
            }
            C58800sl lA = hdVar.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                String str = (String) entry.getKey();
                byte[] bArr2 = (byte[]) hashMap.get(Integer.valueOf(((Integer) entry.getValue()).intValue()));
                if (bArr2 == null) {
                    bArr2 = C21258ba.f59581a;
                }
                gzVar.mo55429h(str, bArr2);
            }
            C58495hd f = gzVar.mo55427f(true);
            C58528ij<String> w = hdVar.keySet();
            ArrayList arrayList = new ArrayList(w.size());
            for (String str2 : w) {
                C21094b bVar = new C21094b(str2);
                if (lVar == null || !"/environment".equals(str2)) {
                    arrayList.add(abVar.mo26139b(str2).mo61652l(bVar));
                } else {
                    arrayList.add(lVar.mo61652l(C21095c.f59129a).mo61652l(bVar));
                }
            }
            return C70120l.m102046e(arrayList, new C21100h(f), C70092f.f186825a).mo61652l(new C21098f(i, hdVar, gVar));
        } catch (IOException e) {
            throw new C21260bc("Failed to process default model", e);
        }
    }
}
