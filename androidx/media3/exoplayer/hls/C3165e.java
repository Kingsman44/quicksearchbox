package androidx.media3.exoplayer.hls;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.hls.e */
/* compiled from: PG */
final class C3165e extends LinkedHashMap {
    public C3165e() {
        super(5, 1.0f, false);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
