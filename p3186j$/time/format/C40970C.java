package p3186j$.time.format;

import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.C */
public final class C40970C {

    /* renamed from: a */
    public static final C40970C f107295a = new C40970C();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C40970C() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo43252a(char c) {
        int i = c - '0';
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40970C)) {
            return false;
        }
        ((C40970C) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
