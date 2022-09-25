package androidx.media3.exoplayer.hls.p148a;

import java.io.BufferedReader;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: androidx.media3.exoplayer.hls.a.r */
/* compiled from: PG */
final class C3150r {

    /* renamed from: a */
    private final BufferedReader f9317a;

    /* renamed from: b */
    private final Queue f9318b;

    /* renamed from: c */
    private String f9319c;

    public C3150r(Queue queue, BufferedReader bufferedReader) {
        this.f9318b = queue;
        this.f9317a = bufferedReader;
    }

    /* renamed from: a */
    public final String mo7148a() {
        if (mo7149b()) {
            String str = this.f9319c;
            this.f9319c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final boolean mo7149b() {
        String trim;
        if (this.f9319c != null) {
            return true;
        }
        if (this.f9318b.isEmpty()) {
            do {
                String readLine = this.f9317a.readLine();
                this.f9319c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f9319c = trim;
            } while (trim.isEmpty());
            return true;
        }
        String str = (String) this.f9318b.poll();
        str.getClass();
        this.f9319c = str;
        return true;
    }
}
