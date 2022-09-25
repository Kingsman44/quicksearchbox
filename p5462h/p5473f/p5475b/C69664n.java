package p5462h.p5473f.p5475b;

import java.util.Arrays;
import p5462h.C69787p;

/* renamed from: h.f.b.n */
/* compiled from: PG */
public final class C69664n {
    private C69664n() {
    }

    /* renamed from: a */
    public static int m101055a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m101056b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    /* renamed from: c */
    public static String m101057c(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return String.valueOf(str).concat(String.valueOf(obj));
    }

    /* renamed from: d */
    public static void m101058d(Object obj) {
        if (obj == null) {
            m101062h();
        }
    }

    /* renamed from: e */
    public static void m101059e(Object obj, String str) {
        if (obj == null) {
            m101063i(str);
        }
    }

    /* renamed from: f */
    public static void m101060f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            m101068n(nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: g */
    public static void m101061g(Object obj, String str) {
        if (obj == null) {
            m101064j(str);
        }
    }

    /* renamed from: h */
    public static void m101062h() {
        NullPointerException nullPointerException = new NullPointerException();
        m101068n(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: i */
    public static void m101063i(String str) {
        NullPointerException nullPointerException = new NullPointerException(str);
        m101068n(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: j */
    public static void m101064j(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        m101068n(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: k */
    public static void m101065k(String str) {
        C69787p pVar = new C69787p("lateinit property " + str + " has not been initialized");
        m101068n(pVar);
        throw pVar;
    }

    /* renamed from: l */
    public static boolean m101066l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: m */
    static void m101067m(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* renamed from: n */
    private static void m101068n(Throwable th) {
        m101067m(th, C69664n.class.getName());
    }
}
