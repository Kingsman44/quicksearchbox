package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.cb */
/* compiled from: PG */
public final class C71629cb {
    /* renamed from: a */
    public static final CancellationException m104602a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
