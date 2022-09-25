package kotlinx.coroutines.p5573a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71629cb;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C71351ae {
    /* renamed from: a */
    public static final void m103991a(C71363aq aqVar, Throwable th) {
        C69664n.m101061g(aqVar, "<this>");
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C71629cb.m104602a("Channel was consumed, consumer had failed", th);
            }
        }
        aqVar.mo62723u(cancellationException);
    }
}
