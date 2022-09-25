package com.google.android.libraries.p1635au;

import com.google.frameworks.client.p4630b.C61318a;
import com.google.frameworks.client.p4630b.C61319b;
import com.google.frameworks.client.p4630b.C61320c;
import com.google.frameworks.client.p4630b.C61321d;
import com.google.frameworks.client.p4630b.C61326i;
import com.google.frameworks.client.p4630b.C61327j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.au.g */
/* compiled from: PG */
final class C19570g implements C19565b {

    /* renamed from: a */
    double[] f54477a = new double[5];

    /* renamed from: b */
    int f54478b = 0;

    /* renamed from: a */
    public final C61327j mo24820a() {
        C61318a aVar = (C61318a) C61321d.f165842b.createBuilder();
        for (int i = 0; i < this.f54478b; i++) {
            C61319b bVar = (C61319b) C61320c.f165837d.createBuilder();
            double d = this.f54477a[i];
            bVar.copyOnWrite();
            C61320c cVar = (C61320c) bVar.instance;
            cVar.f165839a |= 1;
            cVar.f165840b = d;
            bVar.copyOnWrite();
            C61320c cVar2 = (C61320c) bVar.instance;
            cVar2.f165839a |= 2;
            cVar2.f165841c = 1;
            aVar.copyOnWrite();
            C61321d dVar = (C61321d) aVar.instance;
            C61320c cVar3 = (C61320c) bVar.build();
            cVar3.getClass();
            C62971cq cqVar = dVar.f165844a;
            if (!cqVar.mo58948c()) {
                dVar.f165844a = C62942bv.mutableCopy(cqVar);
            }
            dVar.f165844a.add(cVar3);
        }
        C61326i iVar = (C61326i) C61327j.f165849c.createBuilder();
        iVar.copyOnWrite();
        C61327j jVar = (C61327j) iVar.instance;
        C61321d dVar2 = (C61321d) aVar.build();
        dVar2.getClass();
        jVar.f165852b = dVar2;
        jVar.f165851a = 3;
        return (C61327j) iVar.build();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo24821b(Object obj) {
        Double d = (Double) obj;
        int i = this.f54478b + 1;
        double[] dArr = this.f54477a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (-2147483639 + i2 > 0) {
                if (i >= 0) {
                    i2 = 2147483639;
                    if (i > 2147483639) {
                        i2 = Integer.MAX_VALUE;
                    }
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.f54477a = Arrays.copyOf(dArr, i2);
        }
        this.f54477a[this.f54478b] = d.doubleValue();
        this.f54478b++;
    }

    public final String toString() {
        return ", count = " + this.f54478b + ", value =" + Arrays.toString(this.f54477a);
    }
}
