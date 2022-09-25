package p5488io.p5490b.p5497e.p5513j;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5495c.C69812e;

/* renamed from: io.b.e.j.f */
/* compiled from: PG */
public final class C70085f {

    /* renamed from: a */
    public static final Throwable f186815a = new C70084e();

    /* renamed from: a */
    public static RuntimeException m101984a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public static String m101985b(long j, TimeUnit timeUnit) {
        String lowerCase = timeUnit.toString().toLowerCase();
        return "The source did not signal an event for " + j + " " + lowerCase + " and has been terminated.";
    }

    /* renamed from: c */
    public static Throwable m101986c(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f186815a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: d */
    public static boolean m101987d(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        while (true) {
            Throwable th3 = (Throwable) atomicReference.get();
            if (th3 == f186815a) {
                return false;
            }
            if (th3 == null) {
                th2 = th;
            } else {
                th2 = new C69812e(Arrays.asList(new Throwable[]{th3, th}));
            }
            while (true) {
                if (atomicReference.compareAndSet(th3, th2)) {
                    return true;
                }
                if (atomicReference.get() != th3) {
                }
            }
        }
    }
}
