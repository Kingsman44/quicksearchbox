package com.google.p5238v.p5239a.p5259m;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.v.a.m.ai */
/* compiled from: PG */
public final class C67836ai {
    /* renamed from: a */
    public static int m98000a(EllipticCurve ellipticCurve) {
        return (m98001b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: b */
    public static BigInteger m98001b(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: c */
    public static KeyPair m98002c(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C67838ak.f183953f.mo59993a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: d */
    public static void m98003d(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger b = m98001b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(b) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(b) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: e */
    static void m98004e(ECPublicKey eCPublicKey) {
        m98003d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    /* renamed from: f */
    public static void m98005f(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r3 = r11[r4 + 2] & 255;
        r7 = r4 + 3;
        r8 = r7 + r3;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m98006g(byte[] r11) {
        /*
            int r0 = r11.length
            r1 = 8
            r2 = 0
            if (r0 >= r1) goto L_0x0007
            return r2
        L_0x0007:
            byte r1 = r11[r2]
            r3 = 48
            if (r1 == r3) goto L_0x000e
            return r2
        L_0x000e:
            r1 = 1
            byte r3 = r11[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 129(0x81, float:1.81E-43)
            r5 = 2
            r6 = 128(0x80, float:1.794E-43)
            if (r3 != r4) goto L_0x0023
            byte r3 = r11[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 < r6) goto L_0x0022
            r4 = 2
            goto L_0x0028
        L_0x0022:
            return r2
        L_0x0023:
            if (r3 == r6) goto L_0x0086
            if (r3 > r4) goto L_0x0086
            r4 = 1
        L_0x0028:
            int r7 = r0 + -1
            int r7 = r7 - r4
            if (r3 == r7) goto L_0x002e
            return r2
        L_0x002e:
            int r3 = r4 + 1
            byte r3 = r11[r3]
            if (r3 == r5) goto L_0x0035
            return r2
        L_0x0035:
            int r3 = r4 + 2
            byte r3 = r11[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r7 = r4 + 3
            int r8 = r7 + r3
            int r9 = r8 + 1
            if (r9 < r0) goto L_0x0044
            return r2
        L_0x0044:
            if (r3 != 0) goto L_0x0047
            return r2
        L_0x0047:
            byte r7 = r11[r7]
            r10 = r7 & 255(0xff, float:3.57E-43)
            if (r10 < r6) goto L_0x004e
            return r2
        L_0x004e:
            if (r3 <= r1) goto L_0x005c
            if (r7 != 0) goto L_0x005c
            int r7 = r4 + 4
            byte r7 = r11[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 < r6) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            return r2
        L_0x005c:
            byte r7 = r11[r8]
            if (r7 == r5) goto L_0x0061
            return r2
        L_0x0061:
            byte r7 = r11[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r8 + r5
            int r8 = r8 + r7
            if (r8 == r0) goto L_0x006a
            return r2
        L_0x006a:
            if (r7 != 0) goto L_0x006d
            return r2
        L_0x006d:
            int r0 = r4 + 5
            int r0 = r0 + r3
            byte r0 = r11[r0]
            r5 = r0 & 255(0xff, float:3.57E-43)
            if (r5 < r6) goto L_0x0077
            return r2
        L_0x0077:
            if (r7 <= r1) goto L_0x0085
            if (r0 != 0) goto L_0x0085
            int r4 = r4 + 6
            int r4 = r4 + r3
            byte r11 = r11[r4]
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 >= r6) goto L_0x0085
            return r2
        L_0x0085:
            return r1
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5259m.C67836ai.m98006g(byte[]):boolean");
    }

    /* renamed from: h */
    public static byte[] m98007h(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        m98005f(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        m98003d(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) C67838ak.f183954g.mo59993a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) C67838ak.f183952e.mo59993a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger3 = new BigInteger(1, generateSecret);
            if (bigInteger3.signum() == -1 || bigInteger3.compareTo(m98001b(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger b = m98001b(curve);
            BigInteger mod = bigInteger3.multiply(bigInteger3).add(curve.getA()).multiply(bigInteger3).add(curve.getB()).mod(b);
            if (b.signum() == 1) {
                BigInteger mod2 = mod.mod(b);
                if (mod2.equals(BigInteger.ZERO)) {
                    bigInteger = BigInteger.ZERO;
                } else {
                    if (!b.testBit(0) || !b.testBit(1)) {
                        bigInteger2 = null;
                        if (b.testBit(0) && !b.testBit(1)) {
                            BigInteger bigInteger4 = BigInteger.ONE;
                            BigInteger shiftRight = b.subtract(BigInteger.ONE).shiftRight(1);
                            int i = 0;
                            while (true) {
                                BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(b);
                                if (mod3.equals(BigInteger.ZERO)) {
                                    bigInteger = bigInteger4;
                                    break;
                                }
                                BigInteger modPow = mod3.modPow(shiftRight, b);
                                if (modPow.add(BigInteger.ONE).equals(b)) {
                                    BigInteger shiftRight2 = b.add(BigInteger.ONE).shiftRight(1);
                                    BigInteger bigInteger5 = BigInteger.ONE;
                                    BigInteger bigInteger6 = bigInteger4;
                                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                        BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                        BigInteger mod4 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(b).multiply(mod3)).mod(b);
                                        BigInteger mod5 = multiply.add(multiply).mod(b);
                                        if (shiftRight2.testBit(bitLength)) {
                                            BigInteger mod6 = mod4.multiply(bigInteger4).add(mod5.multiply(mod3)).mod(b);
                                            bigInteger5 = bigInteger4.multiply(mod5).add(mod4).mod(b);
                                            bigInteger6 = mod6;
                                        } else {
                                            BigInteger bigInteger7 = mod5;
                                            bigInteger6 = mod4;
                                            bigInteger5 = bigInteger7;
                                        }
                                    }
                                    bigInteger2 = bigInteger6;
                                } else if (modPow.equals(BigInteger.ONE)) {
                                    bigInteger4 = bigInteger4.add(BigInteger.ONE);
                                    i++;
                                    if (i == 128) {
                                        if (!b.isProbablePrime(80)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        }
                    } else {
                        bigInteger2 = mod2.modPow(b.add(BigInteger.ONE).shiftRight(2), b);
                    }
                    if (bigInteger2 != null) {
                        if (bigInteger2.multiply(bigInteger2).mod(b).compareTo(mod2) != 0) {
                            throw new GeneralSecurityException("Could not find a modular square root");
                        }
                    }
                    bigInteger = bigInteger2;
                }
                if (!bigInteger.testBit(0)) {
                    b.subtract(bigInteger).mod(b);
                }
                return generateSecret;
            }
            throw new InvalidAlgorithmParameterException("p must be positive");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000e  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m98008i(byte[] r5) {
        /*
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r5.length
            if (r1 >= r2) goto L_0x000c
            byte r3 = r5[r1]
            if (r3 != 0) goto L_0x000c
            int r1 = r1 + 1
            goto L_0x0002
        L_0x000c:
            if (r1 != r2) goto L_0x0010
            int r1 = r2 + -1
        L_0x0010:
            byte r3 = r5[r1]
            r4 = 128(0x80, float:1.794E-43)
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0018
            r0 = 1
        L_0x0018:
            int r2 = r2 - r1
            int r3 = r2 + r0
            byte[] r3 = new byte[r3]
            java.lang.System.arraycopy(r5, r1, r3, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5259m.C67836ai.m98008i(byte[]):byte[]");
    }

    /* renamed from: j */
    public static ECPrivateKey m98009j(int i, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) C67838ak.f183954g.mo59993a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m98011l(i)));
    }

    /* renamed from: k */
    public static ECPublicKey m98010k(int i, byte[] bArr, byte[] bArr2) {
        ECParameterSpec l = m98011l(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m98003d(eCPoint, l.getCurve());
        return (ECPublicKey) ((KeyFactory) C67838ak.f183954g.mo59993a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, l));
    }

    /* renamed from: m */
    public static byte[] m98012m(EllipticCurve ellipticCurve, int i, ECPoint eCPoint) {
        m98003d(eCPoint, ellipticCurve);
        int a = m98000a(ellipticCurve);
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 2;
            if (i2 != 2) {
                int i3 = a + 1;
                byte[] bArr = new byte[i3];
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                int length = byteArray.length;
                System.arraycopy(byteArray, 0, bArr, i3 - length, length);
                if (true == eCPoint.getAffineY().testBit(0)) {
                    b = 3;
                }
                bArr[0] = b;
                return bArr;
            }
            int i4 = a + a;
            byte[] bArr2 = new byte[i4];
            byte[] byteArray2 = eCPoint.getAffineX().toByteArray();
            int length2 = byteArray2.length;
            if (length2 > a) {
                byteArray2 = Arrays.copyOfRange(byteArray2, length2 - a, length2);
            }
            byte[] byteArray3 = eCPoint.getAffineY().toByteArray();
            int length3 = byteArray3.length;
            if (length3 > a) {
                byteArray3 = Arrays.copyOfRange(byteArray3, length3 - a, length3);
            }
            int length4 = byteArray3.length;
            System.arraycopy(byteArray3, 0, bArr2, i4 - length4, length4);
            int length5 = byteArray2.length;
            System.arraycopy(byteArray2, 0, bArr2, a - length5, length5);
            return bArr2;
        }
        int i5 = a + a + 1;
        byte[] bArr3 = new byte[i5];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        int length6 = byteArray5.length;
        System.arraycopy(byteArray5, 0, bArr3, i5 - length6, length6);
        int length7 = byteArray4.length;
        System.arraycopy(byteArray4, 0, bArr3, (a + 1) - length7, length7);
        bArr3[0] = 4;
        return bArr3;
    }

    /* renamed from: n */
    public static ECPublicKey m98013n(ECParameterSpec eCParameterSpec, byte[] bArr) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int a = m98000a(curve);
        int length = bArr.length;
        if (length != a + a + 1) {
            throw new GeneralSecurityException("invalid point size");
        } else if (bArr[0] == 4) {
            int i = a + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length)));
            m98003d(eCPoint, curve);
            return (ECPublicKey) ((KeyFactory) C67838ak.f183954g.mo59993a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
        } else {
            throw new GeneralSecurityException("invalid point format");
        }
    }

    /* renamed from: o */
    private static ECParameterSpec m98014o(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: l */
    public static ECParameterSpec m98011l(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return m98014o("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 != 1) {
            return m98014o("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        return m98014o("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }
}
