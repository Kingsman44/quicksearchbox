package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62903ak;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.f.o */
/* compiled from: PG */
final class C21107o implements C69822d {

    /* renamed from: a */
    private final int f59146a;

    /* renamed from: b */
    private final C58495hd f59147b;

    /* renamed from: c */
    private final C21279bv f59148c;

    public C21107o(int i, C58495hd hdVar, C21279bv bvVar) {
        this.f59146a = i;
        this.f59147b = hdVar;
        this.f59148c = bvVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25875a(Object obj) {
        C58495hd hdVar = this.f59147b;
        HashMap hashMap = new HashMap();
        C58800sl lA = ((C58495hd) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            Integer num = (Integer) hdVar.get(entry.getKey());
            num.getClass();
            hashMap.put(Integer.valueOf(num.intValue()), new C21106n((C58833ax) entry.getValue()));
        }
        C21279bv bvVar = this.f59148c;
        int i = this.f59146a;
        C62897ae N = C62897ae.m95111N(bvVar.mo26771e());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C62903ak akVar = new C62903ak(byteArrayOutputStream, 4096);
        for (int i2 = 0; i2 < 13; i2++) {
            akVar.mo58760Y((byte) 0);
        }
        while (!N.mo58661D()) {
            int m = N.mo58678m();
            int i3 = m >>> 3;
            int i4 = m & 7;
            if (i4 == 0) {
                akVar.mo58781x(i3, N.mo58687v());
            } else if (i4 == 1) {
                akVar.mo58768k(i3, N.mo58680o());
            } else if (i4 == 2) {
                C21106n nVar = (C21106n) hashMap.remove(Integer.valueOf(i3));
                if (nVar == null) {
                    akVar.mo58763aa(i3, N.mo58688w());
                } else {
                    N.mo58663F(m);
                    nVar.mo26155a(m, akVar);
                }
            } else if (i4 == 5) {
                akVar.mo58766i(i3, N.mo58672g());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((C21106n) entry2.getValue()).mo26155a((((Integer) entry2.getKey()).intValue() << 3) | 2, akVar);
        }
        akVar.mo58759X();
        int i5 = akVar.f169839d - 13;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        C62903ak akVar2 = new C62903ak(byteArrayOutputStream2, 4096);
        akVar2.mo58780w((i << 3) | 2);
        akVar2.mo58780w(i5);
        akVar2.mo58759X();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int i6 = 13 - length;
        System.arraycopy(byteArray, 0, byteArray2, i6, length);
        return C21279bv.m40117a(ByteBuffer.wrap(byteArray2, i6, i5 + length));
    }
}
