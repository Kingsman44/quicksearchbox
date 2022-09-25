package androidx.core.p098j;

/* renamed from: androidx.core.j.cn */
/* compiled from: PG */
public final class C2080cn {
    /* renamed from: a */
    static int m5714a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
    }
}
