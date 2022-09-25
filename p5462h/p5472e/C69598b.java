package p5462h.p5472e;

import java.io.Closeable;
import p5462h.C69465a;

/* renamed from: h.e.b */
/* compiled from: PG */
public final class C69598b {
    /* renamed from: a */
    public static final void m101013a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C69465a.m100953a(th, th2);
        }
    }
}
