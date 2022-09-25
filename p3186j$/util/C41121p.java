package p3186j$.util;

import java.util.Map;
import java.util.Set;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;

/* renamed from: j$.util.p */
final class C41121p extends C41113h {

    /* renamed from: c */
    static Map f107700c = new C41121p(new Object[0]);

    /* renamed from: a */
    final Object[] f107701a;

    /* renamed from: b */
    final int f107702b;

    static {
        if (f107700c == null) {
        }
    }

    C41121p(Object... objArr) {
        if ((objArr.length & 1) == 0) {
            this.f107702b = objArr.length >> 1;
            this.f107701a = new Object[(((objArr.length * 2) + 1) & -2)];
            int i = 0;
            while (i < objArr.length) {
                Object requireNonNull = Objects.requireNonNull(objArr[i]);
                Object requireNonNull2 = Objects.requireNonNull(objArr[i + 1]);
                int a = m71735a(requireNonNull);
                if (a < 0) {
                    int i2 = -(a + 1);
                    Object[] objArr2 = this.f107701a;
                    objArr2[i2] = requireNonNull;
                    objArr2[i2 + 1] = requireNonNull2;
                    i += 2;
                } else {
                    throw new IllegalArgumentException("duplicate key: ".concat(String.valueOf(requireNonNull)));
                }
            }
            return;
        }
        throw new InternalError("length is odd");
    }

    /* renamed from: a */
    private int m71735a(Object obj) {
        int hashCode = obj.hashCode();
        Object[] objArr = this.f107701a;
        int d = C40947a.m71100d(hashCode, objArr.length >> 1) << 1;
        while (true) {
            Object obj2 = objArr[d];
            if (obj2 == null) {
                return (-d) - 1;
            }
            if (obj.equals(obj2)) {
                return d;
            }
            d += 2;
            if (d == objArr.length) {
                d = 0;
            }
        }
    }

    public final boolean containsKey(Object obj) {
        Objects.requireNonNull(obj);
        return this.f107702b > 0 && m71735a(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        int i = 1;
        while (true) {
            Object[] objArr = this.f107701a;
            if (i >= objArr.length) {
                return false;
            }
            Object obj2 = objArr[i];
            if (obj2 != null && obj.equals(obj2)) {
                return true;
            }
            i += 2;
        }
    }

    public final Set entrySet() {
        return new C41119n(this);
    }

    public final Object get(Object obj) {
        if (this.f107702b == 0) {
            Objects.requireNonNull(obj);
            return null;
        }
        int a = m71735a(obj);
        if (a < 0) {
            return null;
        }
        return this.f107701a[a + 1];
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f107701a;
            if (i >= objArr.length) {
                return i2;
            }
            Object obj = objArr[i];
            if (obj != null) {
                i2 += objArr[i + 1].hashCode() ^ obj.hashCode();
            }
            i += 2;
        }
    }

    public final int size() {
        return this.f107702b;
    }
}
