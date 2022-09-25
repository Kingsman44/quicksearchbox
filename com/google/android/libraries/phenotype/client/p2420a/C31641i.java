package com.google.android.libraries.phenotype.client.p2420a;

import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.phenotype.client.a.i */
/* compiled from: PG */
public final /* synthetic */ class C31641i implements C146025e {
    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        ExperimentTokens experimentTokens = (ExperimentTokens) abVar.mo122488g();
        C31635c cVar = (C31635c) C31636d.f85117i.createBuilder();
        String str = experimentTokens.f393993f;
        cVar.copyOnWrite();
        C31636d dVar = (C31636d) cVar.instance;
        str.getClass();
        dVar.f85119a |= 1;
        dVar.f85120b = str;
        byte[] bArr = experimentTokens.f393994g;
        if (bArr != null) {
            cVar.mo37286a(C63088z.m96139A(bArr));
        }
        byte[][] bArr2 = experimentTokens.f394000m;
        if (bArr2 != null) {
            for (byte[] bArr3 : bArr2) {
                if (bArr3 != null) {
                    cVar.mo37286a(C63088z.m96139A(bArr3));
                }
            }
        }
        byte[][] bArr4 = experimentTokens.f393995h;
        if (bArr4 != null) {
            for (byte[] A : bArr4) {
                C63088z A2 = C63088z.m96139A(A);
                cVar.copyOnWrite();
                C31636d dVar2 = (C31636d) cVar.instance;
                C62971cq cqVar = dVar2.f85122d;
                if (!cqVar.mo58948c()) {
                    dVar2.f85122d = C62942bv.mutableCopy(cqVar);
                }
                dVar2.f85122d.add(A2);
            }
        }
        byte[][] bArr5 = experimentTokens.f393996i;
        if (bArr5 != null) {
            for (byte[] A3 : bArr5) {
                C63088z A4 = C63088z.m96139A(A3);
                cVar.copyOnWrite();
                C31636d dVar3 = (C31636d) cVar.instance;
                C62971cq cqVar2 = dVar3.f85123e;
                if (!cqVar2.mo58948c()) {
                    dVar3.f85123e = C62942bv.mutableCopy(cqVar2);
                }
                dVar3.f85123e.add(A4);
            }
        }
        byte[][] bArr6 = experimentTokens.f393997j;
        if (bArr6 != null) {
            for (byte[] A5 : bArr6) {
                C63088z A6 = C63088z.m96139A(A5);
                cVar.copyOnWrite();
                C31636d dVar4 = (C31636d) cVar.instance;
                C62971cq cqVar3 = dVar4.f85124f;
                if (!cqVar3.mo58948c()) {
                    dVar4.f85124f = C62942bv.mutableCopy(cqVar3);
                }
                dVar4.f85124f.add(A6);
            }
        }
        byte[][] bArr7 = experimentTokens.f393998k;
        if (bArr7 != null) {
            for (byte[] A7 : bArr7) {
                C63088z A8 = C63088z.m96139A(A7);
                cVar.copyOnWrite();
                C31636d dVar5 = (C31636d) cVar.instance;
                C62971cq cqVar4 = dVar5.f85125g;
                if (!cqVar4.mo58948c()) {
                    dVar5.f85125g = C62942bv.mutableCopy(cqVar4);
                }
                dVar5.f85125g.add(A8);
            }
        }
        int[] iArr = experimentTokens.f393999l;
        if (iArr != null) {
            for (int i : iArr) {
                cVar.copyOnWrite();
                C31636d dVar6 = (C31636d) cVar.instance;
                C62961ch chVar = dVar6.f85126h;
                if (!chVar.mo58948c()) {
                    dVar6.f85126h = C62942bv.mutableCopy(chVar);
                }
                dVar6.f85126h.mo58916g(i);
            }
        }
        return (C31636d) cVar.build();
    }
}
