package com.google.p5238v.p5239a.p5259m;

import java.lang.reflect.Array;
import java.math.BigInteger;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.v.a.m.af */
/* compiled from: PG */
final class C67833af {

    /* renamed from: a */
    static final long[] f183934a;

    /* renamed from: b */
    static final long[] f183935b;

    /* renamed from: c */
    static final long[] f183936c;

    /* renamed from: d */
    static final C67895y[][] f183937d = ((C67895y[][]) Array.newInstance(C67895y.class, new int[]{32, 8}));

    /* renamed from: e */
    static final C67895y[] f183938e = new C67895y[8];

    /* renamed from: f */
    private static final BigInteger f183939f;

    /* renamed from: g */
    private static final BigInteger f183940g;

    /* renamed from: h */
    private static final BigInteger f183941h;

    /* renamed from: i */
    private static final BigInteger f183942i;

    static {
        BigInteger subtract = BigInteger.valueOf(2).pow(PrivateKeyType.INVALID).subtract(BigInteger.valueOf(19));
        f183939f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(subtract)).mod(subtract);
        f183940g = mod;
        BigInteger mod2 = BigInteger.valueOf(2).multiply(mod).mod(subtract);
        f183941h = mod2;
        BigInteger modPow = BigInteger.valueOf(2).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), subtract);
        f183942i = modPow;
        C67832ae aeVar = new C67832ae();
        aeVar.f183933b = BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(subtract)).mod(subtract);
        BigInteger bigInteger = aeVar.f183933b;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        aeVar.f183932a = modPow2;
        f183934a = C67848au.m98039l(m97998c(mod));
        f183935b = C67848au.m98039l(m97998c(mod2));
        f183936c = C67848au.m98039l(m97998c(modPow));
        C67832ae aeVar2 = aeVar;
        for (int i = 0; i < 32; i++) {
            C67832ae aeVar3 = aeVar2;
            for (int i2 = 0; i2 < 8; i2++) {
                f183937d[i][i2] = m97996a(aeVar3);
                aeVar3 = m97997b(aeVar3, aeVar2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                aeVar2 = m97997b(aeVar2, aeVar2);
            }
        }
        C67832ae b = m97997b(aeVar, aeVar);
        for (int i4 = 0; i4 < 8; i4++) {
            f183938e[i4] = m97996a(aeVar);
            aeVar = m97997b(aeVar, b);
        }
    }

    /* renamed from: a */
    private static C67895y m97996a(C67832ae aeVar) {
        BigInteger add = aeVar.f183933b.add(aeVar.f183932a);
        BigInteger bigInteger = f183939f;
        return new C67895y(C67848au.m98039l(m97998c(add.mod(bigInteger))), C67848au.m98039l(m97998c(aeVar.f183933b.subtract(aeVar.f183932a).mod(bigInteger))), C67848au.m98039l(m97998c(f183941h.multiply(aeVar.f183932a).multiply(aeVar.f183933b).mod(bigInteger))));
    }

    /* renamed from: b */
    private static C67832ae m97997b(C67832ae aeVar, C67832ae aeVar2) {
        C67832ae aeVar3 = new C67832ae();
        BigInteger multiply = f183940g.multiply(aeVar.f183932a.multiply(aeVar2.f183932a).multiply(aeVar.f183933b).multiply(aeVar2.f183933b));
        BigInteger bigInteger = f183939f;
        BigInteger mod = multiply.mod(bigInteger);
        aeVar3.f183932a = aeVar.f183932a.multiply(aeVar2.f183933b).add(aeVar2.f183932a.multiply(aeVar.f183933b)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        aeVar3.f183933b = aeVar.f183933b.multiply(aeVar2.f183933b).add(aeVar.f183932a.multiply(aeVar2.f183932a)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return aeVar3;
    }

    /* renamed from: c */
    private static byte[] m97998c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = (32 - i) - 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
