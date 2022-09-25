package com.android.p270g;

import android.util.Pair;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.android.g.h */
/* compiled from: PG */
public final class C5150h {
    /* renamed from: a */
    public static X509Certificate[][] m14065a(String str) {
        Pair pair;
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, C33259r.f88929b);
        try {
            if (randomAccessFile.length() < 22) {
                pair = null;
            } else {
                pair = C5151i.m14078b(randomAccessFile, 0);
                if (pair == null) {
                    pair = C5151i.m14078b(randomAccessFile, 65535);
                }
            }
            if (pair != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) pair.first;
                long longValue = ((Long) pair.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new C5147e("ZIP64 APK not supported");
                    }
                }
                C5151i.m14079c(byteBuffer2);
                long a = C5151i.m14077a(byteBuffer2, byteBuffer2.position() + 16);
                if (a < longValue) {
                    C5151i.m14079c(byteBuffer2);
                    if (a + C5151i.m14077a(byteBuffer2, byteBuffer2.position() + 12) != longValue) {
                        throw new C5147e("ZIP Central Directory is not immediately followed by End of Central Directory");
                    } else if (a >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        String str2 = "APK Signing Block offset out of range: ";
                        String str3 = "APK Signing Block size out of range: ";
                        randomAccessFile.seek(a - ((long) allocate.capacity()));
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                            String str4 = str2;
                            long j2 = allocate.getLong(0);
                            if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                                throw new C5147e(str3 + j2);
                            }
                            int i = (int) (8 + j2);
                            long j3 = a - ((long) i);
                            if (j3 >= 0) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(i);
                                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                randomAccessFile.seek(j3);
                                long j4 = a;
                                randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                long j5 = allocate2.getLong(0);
                                if (j5 == j2) {
                                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                    byteBuffer = (ByteBuffer) create.first;
                                    long longValue2 = ((Long) create.second).longValue();
                                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                        int capacity = byteBuffer.capacity() - 24;
                                        if (capacity >= 8) {
                                            int capacity2 = byteBuffer.capacity();
                                            if (capacity <= byteBuffer.capacity()) {
                                                limit = byteBuffer.limit();
                                                position = byteBuffer.position();
                                                byteBuffer.position(0);
                                                byteBuffer.limit(capacity);
                                                byteBuffer.position(8);
                                                ByteBuffer slice = byteBuffer.slice();
                                                slice.order(byteBuffer.order());
                                                byteBuffer.position(0);
                                                byteBuffer.limit(limit);
                                                byteBuffer.position(position);
                                                int i2 = 0;
                                                while (slice.hasRemaining()) {
                                                    i2++;
                                                    if (slice.remaining() >= 8) {
                                                        long j6 = slice.getLong();
                                                        if (j6 < 4 || j6 > 2147483647L) {
                                                            throw new C5147e("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                                                        }
                                                        int i3 = (int) j6;
                                                        int position2 = slice.position() + i3;
                                                        if (i3 > slice.remaining()) {
                                                            throw new C5147e("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                                                        } else if (slice.getInt() == 1896449818) {
                                                            X509Certificate[][] k = m14075k(randomAccessFile.getChannel(), new C5146d(m14069e(slice, i3 - 4), longValue2, j4, longValue, byteBuffer2));
                                                            randomAccessFile.close();
                                                            try {
                                                                randomAccessFile.close();
                                                            } catch (IOException unused) {
                                                            }
                                                            return k;
                                                        } else {
                                                            long j7 = j4;
                                                            slice.position(position2);
                                                            j4 = j7;
                                                        }
                                                    } else {
                                                        throw new C5147e("Insufficient data to read size of APK Signing Block entry #" + i2);
                                                    }
                                                }
                                                throw new C5147e("No APK Signature Scheme v2 block in APK Signing Block");
                                            }
                                            throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                        }
                                        throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                    }
                                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                }
                                throw new C5147e("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j2);
                            }
                            throw new C5147e(str4 + j3);
                        }
                        throw new C5147e("No APK Signing Block before ZIP Central Directory");
                    } else {
                        throw new C5147e("APK too small for APK Signing Block. ZIP Central Directory offset: " + a);
                    }
                } else {
                    throw new C5147e("ZIP Central Directory offset out of range: " + a + ". ZIP End of Central Directory offset: " + longValue);
                }
            } else {
                throw new C5147e("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static int m14066b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    /* renamed from: c */
    private static int m14067c(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i))));
        }
    }

    /* renamed from: d */
    private static String m14068d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    /* renamed from: e */
    private static ByteBuffer m14069e(ByteBuffer byteBuffer, int i) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: f */
    private static ByteBuffer m14070f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m14069e(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + remaining);
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining2);
        }
    }

    /* renamed from: g */
    private static void m14071g(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        long j4 = j;
        if (!map.isEmpty()) {
            C5145c cVar = new C5145c(fileChannel, 0, j);
            C5145c cVar2 = new C5145c(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            C5151i.m14079c(duplicate);
            int position = duplicate.position() + 16;
            if (j4 < 0 || j4 > 4294967295L) {
                throw new IllegalArgumentException("uint32 value of out range: " + j4);
            }
            duplicate.putInt(duplicate.position() + position, (int) j4);
            C5143a aVar = new C5143a(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] j5 = m14074j(iArr, new C5144b[]{cVar, cVar2, aVar});
                while (i < size) {
                    int i3 = iArr[i];
                    Map map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), j5[i])) {
                        i++;
                    } else {
                        throw new SecurityException(m14068d(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: h */
    private static byte[] m14072h(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + remaining);
        }
    }

    /* renamed from: i */
    private static X509Certificate[] m14073i(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair pair;
        ByteBuffer f = m14070f(byteBuffer);
        ByteBuffer f2 = m14070f(byteBuffer);
        byte[] h = m14072h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (f2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer f3 = m14070f(f2);
                if (f3.remaining() >= 8) {
                    int i3 = f3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (!(i3 == 513 || i3 == 514 || i3 == 769)) {
                        switch (i3) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i != -1) {
                        int c = m14067c(i3);
                        int c2 = m14067c(i);
                        if (c != 1) {
                            if (c2 != 1) {
                            }
                        }
                    }
                    bArr2 = m14072h(f3);
                    i = i3;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException("Failed to parse signature record #" + i2, e);
            }
        }
        if (i != -1) {
            if (i == 513 || i == 514) {
                str = "EC";
            } else if (i != 769) {
                switch (i) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i))));
                }
            } else {
                str = "DSA";
            }
            if (i == 513) {
                pair = Pair.create("SHA256withECDSA", (Object) null);
            } else if (i == 514) {
                pair = Pair.create("SHA512withECDSA", (Object) null);
            } else if (i != 769) {
                switch (i) {
                    case 257:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", (Object) null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", (Object) null);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i))));
                }
            } else {
                pair = Pair.create("SHA256withDSA", (Object) null);
            }
            String str2 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(h));
                Signature instance = Signature.getInstance(str2);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(f);
                if (instance.verify(bArr2)) {
                    f.clear();
                    ByteBuffer f4 = m14070f(f);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (f4.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer f5 = m14070f(f4);
                            if (f5.remaining() >= 8) {
                                int i5 = f5.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr = m14072h(f5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            throw new IOException("Failed to parse digest record #" + i4, e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int c3 = m14067c(i);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(c3), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer f6 = m14070f(f);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (f6.hasRemaining()) {
                                i6++;
                                byte[] h2 = m14072h(f6);
                                try {
                                    arrayList3.add(new C5148f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(h2)), h2));
                                } catch (CertificateException e3) {
                                    throw new SecurityException("Failed to decode certificate #" + i6, e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(h, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(m14068d(c3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                throw new SecurityException("Failed to verify " + str2 + " signature", e4);
            }
        } else if (i2 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    /* renamed from: j */
    private static byte[][] m14074j(int[] iArr, C5144b[] bVarArr) {
        long j;
        int i;
        int length;
        int[] iArr2 = iArr;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (bVarArr[i2].mo10195a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i4 = 0;
            while (true) {
                length = iArr2.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m14066b(iArr2[i4]) * i3) + 5)];
                bArr2[0] = 90;
                m14076l(i3, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i5 = 0;
            while (i5 < iArr2.length) {
                String d = m14068d(iArr2[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(d);
                    i5++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(d.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                C5144b bVar = bVarArr[i6];
                long j4 = j2;
                int i9 = i6;
                long a = bVar.mo10195a();
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    m14076l(min, bArr3);
                    for (int i10 = 0; i10 < length; i10++) {
                        messageDigestArr[i10].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        bVar.mo10196b(messageDigestArr, j5, min);
                        int i11 = 0;
                        while (i11 < iArr2.length) {
                            int i12 = iArr2[i11];
                            C5144b bVar2 = bVar;
                            byte[] bArr4 = bArr[i11];
                            int b = m14066b(i12);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i11];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i7 * b) + 5, b);
                            if (digest == b) {
                                i11++;
                                bVar = bVar2;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        C5144b bVar3 = bVar;
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j6 = (long) min;
                        long j7 = j5 + j6;
                        a -= j6;
                        i7++;
                        j2 = 0;
                        j = 1048576;
                        long j8 = j7;
                        bVar = bVar3;
                        j4 = j8;
                        bArr3 = bArr3;
                    } catch (IOException e2) {
                        throw new DigestException("Failed to digest chunk #" + i7 + " of section #" + i8, e2);
                    }
                }
                byte[] bArr6 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                i8++;
                i6 = i9 + 1;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i13 = 0;
            while (i13 < iArr2.length) {
                int i14 = iArr2[i13];
                byte[] bArr8 = bArr[i13];
                String d2 = m14068d(i14);
                try {
                    bArr7[i13] = MessageDigest.getInstance(d2).digest(bArr8);
                    i13++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(d2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        throw new DigestException("Too many chunks: " + j3);
    }

    /* renamed from: k */
    private static X509Certificate[][] m14075k(FileChannel fileChannel, C5146d dVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer f = m14070f(dVar.f16351a);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m14073i(m14070f(f), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m14071g(hashMap, fileChannel, dVar.f16352b, dVar.f16353c, dVar.f16354d, dVar.f16355e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* renamed from: l */
    private static void m14076l(int i, byte[] bArr) {
        bArr[1] = (byte) (i & PrivateKeyType.INVALID);
        bArr[2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[3] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        bArr[4] = (byte) (i >> 24);
    }
}
