package com.google.android.apps.gsa.shared.util;

import com.google.android.apps.gsa.shared.util.p7159c.C90946l;
import com.google.common.base.C58881cr;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.util.bk */
/* compiled from: PG */
final class C90767bk implements Runnable, C90946l {

    /* renamed from: a */
    private final Object f253858a;

    /* renamed from: b */
    private final Method f253859b;

    /* renamed from: c */
    private final Object[] f253860c;

    /* renamed from: d */
    private final Class f253861d;

    /* renamed from: e */
    private final C58881cr f253862e;

    public C90767bk(Object obj, Method method, Object[] objArr, Class cls) {
        this.f253858a = obj;
        this.f253859b = method;
        this.f253860c = objArr;
        this.f253861d = cls;
        this.f253862e = new C90766bj(obj.getClass(), method);
    }

    /* renamed from: fL */
    public final C58881cr mo85105fL() {
        return this.f253862e;
    }

    public final void run() {
        try {
            this.f253859b.invoke(this.f253858a, this.f253860c);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new IllegalStateException(cause);
            }
        } catch (IllegalArgumentException e3) {
            String valueOf = String.valueOf(this.f253859b);
            String valueOf2 = String.valueOf(this.f253858a.getClass());
            Object[] objArr = this.f253860c;
            ArrayList arrayList = new ArrayList();
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        arrayList.add("null");
                    } else {
                        arrayList.add(obj.getClass().toString());
                    }
                }
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to call [" + valueOf + "] on delegate of type [" + valueOf2 + "] with argument list " + arrayList.toString() + " for dynamic proxy of type [" + this.f253861d.toString() + "]");
            illegalArgumentException.initCause(e3);
            throw illegalArgumentException;
        }
    }

    public final String toString() {
        return ((C90766bj) this.f253862e).mo6453a();
    }
}
