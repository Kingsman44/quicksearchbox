package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8386b;
import com.google.p386ak.p394d.C8387c;
import java.util.BitSet;

/* renamed from: com.google.ak.b.a.an */
/* compiled from: PG */
final class C8285an extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        BitSet bitSet = new BitSet();
        aVar.mo17119j();
        int r = aVar.mo17127r();
        int i = 0;
        while (r != 2) {
            int i2 = r - 1;
            if (i2 == 5 || i2 == 6) {
                int c = aVar.mo17111c();
                if (c == 0) {
                    continue;
                    i++;
                    r = aVar.mo17127r();
                } else if (c != 1) {
                    throw new C8406v("Invalid bitset value " + c + ", expected 0 or 1; at path " + aVar.mo17113d(true));
                }
            } else if (i2 != 7) {
                throw new C8406v("Invalid bitset value type: " + C8386b.m23197a(r) + "; at path " + aVar.mo17113d(false));
            } else if (!aVar.mo17126q()) {
                i++;
                r = aVar.mo17127r();
            }
            bitSet.set(i);
            i++;
            r = aVar.mo17127r();
        }
        aVar.mo17121l();
        return bitSet;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        cVar.mo17131c();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            cVar.mo17139i(bitSet.get(i) ? 1 : 0);
        }
        cVar.mo17134e();
    }
}
