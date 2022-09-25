package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;

/* renamed from: androidx.media3.exoplayer.hls.f */
/* compiled from: PG */
final class C3166f {

    /* renamed from: a */
    public final LinkedHashMap f9389a = new C3165e();

    /* renamed from: a */
    public final byte[] mo7165a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f9389a.get(uri);
    }

    /* renamed from: b */
    public final void mo7166b(Uri uri, byte[] bArr) {
        LinkedHashMap linkedHashMap = this.f9389a;
        uri.getClass();
        byte[] bArr2 = (byte[]) linkedHashMap.put(uri, bArr);
    }
}
