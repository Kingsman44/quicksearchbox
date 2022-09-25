package com.google.p5238v.p5239a.p5246d;

import com.google.p5238v.p5239a.C67539aj;
import com.google.p5238v.p5239a.p5255j.C67668ay;
import com.google.p5238v.p5239a.p5255j.C67680bj;
import com.google.p5238v.p5239a.p5255j.C67684bn;
import com.google.p5238v.p5239a.p5255j.C67690bt;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67725da;
import com.google.p5238v.p5239a.p5259m.C67836ai;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.v.a.d.k */
/* compiled from: PG */
final class C67581k {
    /* renamed from: a */
    public static void m97737a(C67684bn bnVar) {
        C67690bt btVar = bnVar.f183667a;
        if (btVar == null) {
            btVar = C67690bt.f183681d;
        }
        int b = C67698ca.m97840b(btVar.f183683a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        C67836ai.m98011l(m97739c(b));
        C67690bt btVar2 = bnVar.f183667a;
        if (btVar2 == null) {
            btVar2 = C67690bt.f183681d;
        }
        int b2 = C67701cd.m97842b(btVar2.f183684b);
        if (b2 != 0) {
            i = b2;
        }
        m97738b(i);
        int b3 = C67668ay.m97837b(bnVar.f183669c);
        if (b3 != 0 && b3 == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        C67680bj bjVar = bnVar.f183668b;
        if (bjVar == null) {
            bjVar = C67680bj.f183659b;
        }
        C67725da daVar = bjVar.f183661a;
        if (daVar == null) {
            daVar = C67725da.f183749d;
        }
        C67539aj.m97627b(daVar);
    }

    /* renamed from: b */
    public static String m97738b(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(C67701cd.m97841a(i))));
    }

    /* renamed from: c */
    public static int m97739c(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(C67698ca.m97839a(i))));
    }

    /* renamed from: d */
    public static int m97740d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(C67668ay.m97836a(i))));
            }
        }
        return i3;
    }
}
