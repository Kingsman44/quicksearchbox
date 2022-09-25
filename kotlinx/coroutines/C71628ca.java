package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71708ap;

/* renamed from: kotlinx.coroutines.ca */
/* compiled from: PG */
public final class C71628ca {

    /* renamed from: a */
    public static final C71708ap f191071a = new C71708ap("REMOVED_TASK");

    /* renamed from: b */
    public static final C71708ap f191072b = new C71708ap("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m104601a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
