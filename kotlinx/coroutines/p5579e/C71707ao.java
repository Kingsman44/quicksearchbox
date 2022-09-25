package kotlinx.coroutines.p5579e;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlinx.coroutines.C71401ah;
import kotlinx.coroutines.C71600ba;
import p5462h.C69685i;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: kotlinx.coroutines.e.ao */
/* compiled from: PG */
public final class C71707ao {

    /* renamed from: a */
    private static final String f191174a;

    /* renamed from: b */
    private static final String f191175b;

    static {
        Object obj;
        Object obj2;
        try {
            obj = Class.forName("h.c.b.a.a").getCanonicalName();
        } catch (Throwable th) {
            obj = C69714l.m101133a(th);
        }
        if (C69702k.m101124a(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f191174a = (String) obj;
        try {
            obj2 = Class.forName("kotlinx.coroutines.e.ao").getCanonicalName();
        } catch (Throwable th2) {
            obj2 = C69714l.m101133a(th2);
        }
        if (C69702k.m101124a(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f191175b = (String) obj2;
    }

    /* renamed from: a */
    public static final Throwable m104840a(Throwable th, C69566d dVar) {
        C69685i iVar;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause != null && C69664n.m101066l(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    iVar = new C69685i(th, (Object[]) new StackTraceElement[0]);
                    break;
                } else if (m104843d(stackTrace[i2])) {
                    iVar = new C69685i(cause, stackTrace);
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            iVar = new C69685i(th, (Object[]) new StackTraceElement[0]);
        }
        Throwable th2 = (Throwable) iVar.f186052a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) iVar.f186053b;
        Throwable g = m104846g(th2);
        if (g == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement eL = dVar.mo61335eL();
        if (eL != null) {
            arrayDeque.add(eL);
        }
        while (true) {
            if (true != (dVar instanceof C69566d)) {
                dVar = null;
            }
            if (dVar != null && (dVar = dVar.mo61336eM()) != null) {
                StackTraceElement eL2 = dVar.mo61335eL();
                if (eL2 != null) {
                    arrayDeque.add(eL2);
                }
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            int length2 = stackTraceElementArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i3 = -1;
                    break;
                } else if (m104843d(stackTraceElementArr[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = i3 + 1;
            int length3 = stackTraceElementArr.length - 1;
            if (i4 <= length3) {
                while (true) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[length3];
                    StackTraceElement stackTraceElement2 = (StackTraceElement) arrayDeque.getLast();
                    if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C69664n.m101066l(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C69664n.m101066l(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C69664n.m101066l(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr[length3]);
                    if (length3 == i4) {
                        break;
                    }
                    length3--;
                }
            }
        }
        arrayDeque.addFirst(m104844e());
        StackTraceElement[] stackTrace2 = th2.getStackTrace();
        int f = m104845f(stackTrace2, f191174a);
        if (f == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            g.setStackTrace((StackTraceElement[]) array);
        } else {
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[(arrayDeque.size() + f)];
            for (int i5 = 0; i5 < f; i5++) {
                stackTraceElementArr2[i5] = stackTrace2[i5];
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr2[i + f] = (StackTraceElement) it.next();
                i++;
            }
            g.setStackTrace(stackTraceElementArr2);
        }
        return g;
    }

    /* renamed from: b */
    public static final Throwable m104841b(Throwable th) {
        Throwable g;
        StackTraceElement stackTraceElement;
        if (!C71600ba.f191037b || (g = m104846g(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = g.getStackTrace();
        int length = stackTrace.length;
        int f = m104845f(stackTrace, f191175b);
        int i = f + 1;
        int f2 = m104845f(stackTrace, f191174a);
        int i2 = (length - f) - (f2 == -1 ? 0 : length - f2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = m104844e();
            } else {
                stackTraceElement = stackTrace[(i + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        g.setStackTrace(stackTraceElementArr);
        return g;
    }

    /* renamed from: c */
    public static final Throwable m104842c(Throwable th) {
        C69664n.m101061g(th, "exception");
        Throwable cause = th.getCause();
        if (cause != null && C69664n.m101066l(cause.getClass(), th.getClass())) {
            for (StackTraceElement d : th.getStackTrace()) {
                if (m104843d(d)) {
                    return cause;
                }
            }
        }
        return th;
    }

    /* renamed from: d */
    public static final boolean m104843d(StackTraceElement stackTraceElement) {
        C69664n.m101061g(stackTraceElement, "<this>");
        return C69764m.m101234m(stackTraceElement.getClassName(), "\b\b\b");
    }

    /* renamed from: e */
    public static final StackTraceElement m104844e() {
        return new StackTraceElement("\b\b\b(Coroutine boundary", "\b", "\b", -1);
    }

    /* renamed from: f */
    private static final int m104845f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C69664n.m101066l(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static final Throwable m104846g(Throwable th) {
        Throwable a = C71736r.m104896a(th);
        if (a == null) {
            return null;
        }
        if ((th instanceof C71401ah) || C69664n.m101066l(a.getMessage(), th.getMessage())) {
            return a;
        }
        return null;
    }
}
