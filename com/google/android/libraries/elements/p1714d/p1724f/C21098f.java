package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62893aa;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62903ak;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.f.f */
/* compiled from: PG */
final class C21098f implements C69822d {

    /* renamed from: a */
    private final int f59133a;

    /* renamed from: b */
    private final C58495hd f59134b;

    /* renamed from: c */
    private final C21099g f59135c;

    public C21098f(int i, C58495hd hdVar, C21099g gVar) {
        this.f59133a = i;
        this.f59134b = hdVar;
        this.f59135c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25875a(Object obj) {
        C58495hd hdVar = this.f59134b;
        HashMap hashMap = new HashMap();
        C58800sl lA = ((C58495hd) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            Integer num = (Integer) hdVar.get(entry.getKey());
            num.getClass();
            hashMap.put(Integer.valueOf(num.intValue()), new C21096d((byte[]) entry.getValue()));
        }
        byte[] bArr = this.f59135c.f59137a;
        int i = C62897ae.f169827g;
        C62897ae O = C62897ae.m95112O(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C62903ak akVar = new C62903ak(byteArrayOutputStream, 4096);
        while (!O.mo58661D()) {
            int m = O.mo58678m();
            int i2 = m >>> 3;
            int i3 = m & 7;
            if (i3 == 0) {
                akVar.mo58781x(i2, ((C62893aa) O).mo58683r());
            } else if (i3 == 1) {
                akVar.mo58768k(i2, ((C62893aa) O).mo58682q());
            } else if (i3 == 2) {
                C21096d dVar = (C21096d) hashMap.remove(Integer.valueOf(i2));
                if (dVar == null) {
                    akVar.mo58763aa(i2, O.mo58688w());
                } else {
                    O.mo58663F(m);
                    dVar.mo26151a(m, akVar);
                }
            } else if (i3 == 5) {
                akVar.mo58766i(i2, ((C62893aa) O).mo58674i());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((C21096d) entry2.getValue()).mo26151a((((Integer) entry2.getKey()).intValue() << 3) | 2, akVar);
        }
        akVar.mo58759X();
        return new C21099g(byteArrayOutputStream.toByteArray()).mo26153b(this.f59133a);
    }
}
