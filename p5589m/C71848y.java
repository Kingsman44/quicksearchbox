package p5589m;

import java.io.InterruptedIOException;

/* renamed from: m.y */
/* compiled from: PG */
public class C71848y {
    /* renamed from: a */
    public static void m105225a() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
