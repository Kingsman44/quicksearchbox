package p5488io.grpc;

import com.google.common.base.C58913w;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: io.grpc.ez */
/* compiled from: PG */
final class C70721ez implements C70333dd {

    /* renamed from: a */
    private static final byte[] f188459a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: c */
    private static boolean m103405c(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo62024a(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length) {
                return new String(bArr, 0);
            }
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < length)) {
                ByteBuffer allocate = ByteBuffer.allocate(length);
                int i2 = 0;
            } else {
                i++;
            }
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(length);
        int i22 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i22 >= length2) {
                return new String(allocate2.array(), 0, allocate2.position(), C58913w.f156754c);
            }
            if (bArr[i22] == 37 && i22 + 2 < length2) {
                try {
                    allocate2.put((byte) Integer.parseInt(new String(bArr, i22 + 1, 2, C58913w.f156752a), 16));
                    i22 += 3;
                } catch (NumberFormatException unused) {
                }
            }
            allocate2.put(bArr[i22]);
            i22++;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ byte[] mo62025b(Object obj) {
        byte[] bytes = ((String) obj).getBytes(C58913w.f156754c);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            if (m103405c(bytes[i])) {
                byte[] bArr = new byte[(((length - i) * 3) + i)];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    byte b = bytes[i];
                    if (m103405c(b)) {
                        bArr[i2] = 37;
                        byte[] bArr2 = f188459a;
                        bArr[i2 + 1] = bArr2[(b >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b;
                        i2++;
                    }
                    i++;
                }
                return Arrays.copyOf(bArr, i2);
            }
            i++;
        }
    }
}
