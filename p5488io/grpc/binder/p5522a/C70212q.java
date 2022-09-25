package p5488io.grpc.binder.p5522a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: io.grpc.binder.a.q */
/* compiled from: PG */
final class C70212q {

    /* renamed from: a */
    public static final int f187143a;

    /* renamed from: b */
    private static final Queue f187144b;

    static {
        int max = Math.max(16384, 8192);
        f187143a = max;
        f187144b = new LinkedBlockingQueue(C89885b.S3REQUEST_VALUE / max);
    }

    /* renamed from: a */
    static void m102335a(byte[] bArr) {
        if (bArr.length == f187143a) {
            f187144b.offer(bArr);
        }
    }

    /* renamed from: b */
    static byte[] m102336b(int i) {
        byte[] bArr;
        if (i != f187143a || (bArr = (byte[]) f187144b.poll()) == null) {
            return new byte[i];
        }
        return bArr;
    }
}
