package p5488io.grpc.p5525e;

import com.google.common.base.C58913w;
import com.google.common.p4541l.C59326i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70251bv;
import p5488io.grpc.C70334de;

/* renamed from: io.grpc.e.lv */
/* compiled from: PG */
public final class C70676lv {

    /* renamed from: a */
    private static final Logger f188404a = Logger.getLogger(C70676lv.class.getName());

    /* renamed from: b */
    private static final byte[] f188405b = "-bin".getBytes(C58913w.f156752a);

    private C70676lv() {
    }

    /* renamed from: a */
    public static byte[][] m103338a(C70334de deVar) {
        int length;
        byte[][] g = C70251bv.m102404g(deVar);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = g.length;
            if (i >= length) {
                break;
            }
            byte[] bArr = g[i];
            byte[] bArr2 = g[i + 1];
            if (m103340c(bArr, f188405b)) {
                g[i2] = bArr;
                g[i2 + 1] = C70251bv.f187250b.mo56837l(bArr2, bArr2.length).getBytes(C58913w.f156752a);
            } else {
                for (byte b : bArr2) {
                    if (b < 32 || b > 126) {
                        String str = new String(bArr, C58913w.f156752a);
                        f188404a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
                        break;
                    }
                }
                g[i2] = bArr;
                g[i2 + 1] = bArr2;
            }
            i2 += 2;
            i += 2;
        }
        if (i2 == length) {
            return g;
        }
        return (byte[][]) Arrays.copyOfRange(g, 0, i2);
    }

    /* renamed from: b */
    public static byte[][] m103339b(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (m103340c(bArr2, f188405b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr4 = bArr[i];
                            byte[] bArr5 = bArr[i + 1];
                            if (m103340c(bArr4, f188405b)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr5.length;
                                    if (i4 > length) {
                                        break;
                                    }
                                    if (i4 == length || bArr5[i4] == 44) {
                                        byte[] k = C59326i.f157516d.mo56836k(new String(bArr5, i5, i4 - i5, C58913w.f156752a));
                                        arrayList.add(bArr4);
                                        arrayList.add(k);
                                        i5 = i4 + 1;
                                    }
                                    i4++;
                                }
                            } else {
                                arrayList.add(bArr4);
                                arrayList.add(bArr5);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = C59326i.f157516d.mo56836k(new String(bArr3, C58913w.f156752a));
            }
            i += 2;
        }
        return bArr;
    }

    /* renamed from: c */
    private static boolean m103340c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
