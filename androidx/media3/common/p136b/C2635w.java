package androidx.media3.common.p136b;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.media3.common.b.w */
/* compiled from: PG */
public final class C2635w {
    /* renamed from: a */
    public static void m7053a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: b */
    public static void m7054b(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
