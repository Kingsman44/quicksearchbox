package android.support.p031v4.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.app.ct */
/* compiled from: PG */
final class C0228ct extends Writer {

    /* renamed from: a */
    private final String f862a = "FragmentManager";

    /* renamed from: b */
    private final StringBuilder f863b = new StringBuilder(128);

    /* renamed from: a */
    private final void m546a() {
        if (this.f863b.length() > 0) {
            Log.d(this.f862a, this.f863b.toString());
            StringBuilder sb = this.f863b;
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        m546a();
    }

    public final void flush() {
        m546a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m546a();
            } else {
                this.f863b.append(c);
            }
        }
    }
}
