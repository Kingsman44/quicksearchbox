package com.google.android.libraries.gsa.p1876k;

import android.os.Looper;
import androidx.annotation.C0826b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.gsa.k.h */
/* compiled from: PG */
public final class C22872h {

    /* renamed from: a */
    private static final C59071e f62932a = C59071e.m91332i("com.google.android.libraries.gsa.k.h");

    /* renamed from: b */
    private static final ThreadLocal f62933b = new ThreadLocal();

    /* renamed from: c */
    private static final C22846a f62934c = new C22846a();

    /* renamed from: d */
    private static final int f62935d = 1;

    /* renamed from: e */
    private static final int f62936e = 1;

    /* renamed from: a */
    public static Class m42741a(Class cls) {
        ThreadLocal threadLocal = f62933b;
        Class cls2 = (Class) threadLocal.get();
        threadLocal.set(cls);
        return cls2;
    }

    /* renamed from: b */
    public static void m42742b(Class cls) {
        if (!m42744d(cls)) {
            String concat = "Current thread does not allow ".concat(String.valueOf(String.valueOf(cls)));
            IllegalStateException illegalStateException = new IllegalStateException(concat);
            int i = f62936e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                ((C59052c) ((C59052c) ((C59052c) f62932a.mo56225c()).mo56382g(illegalStateException)).mo56372aa(48626)).mo56389s("%s", concat);
                throw illegalStateException;
            }
        }
    }

    @Deprecated
    /* renamed from: c */
    public static void m42743c(Class cls) {
        if (!m42744d(cls)) {
            String concat = "Current thread is not ".concat(cls.toString());
            IllegalStateException illegalStateException = new IllegalStateException(concat);
            int i = f62936e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                ((C59052c) ((C59052c) ((C59052c) f62932a.mo56225c()).mo56382g(illegalStateException)).mo56372aa(48628)).mo56389s("%s", concat);
                throw illegalStateException;
            }
        }
    }

    /* renamed from: d */
    public static boolean m42744d(Class cls) {
        Class cls2 = (Class) f62933b.get();
        Class<C0826b> cls3 = null;
        if (Looper.getMainLooper() == Looper.myLooper() && f62935d == 1) {
            cls3 = C0826b.class;
        }
        if (!cls.equals(cls2) && !cls.equals(cls3)) {
            C22846a aVar = f62934c;
            if (aVar.mo28198a(cls2).contains(cls) || aVar.mo28198a(cls3).contains(cls)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
