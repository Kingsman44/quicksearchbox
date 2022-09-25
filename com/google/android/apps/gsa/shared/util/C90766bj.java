package com.google.android.apps.gsa.shared.util;

import com.google.common.base.C58881cr;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.shared.util.bj */
/* compiled from: PG */
final class C90766bj implements C58881cr {

    /* renamed from: a */
    private final Class f253856a;

    /* renamed from: b */
    private final Method f253857b;

    public C90766bj(Class cls, Method method) {
        this.f253856a = cls;
        this.f253857b = method;
    }

    /* renamed from: b */
    public final String mo6453a() {
        StringBuilder sb = new StringBuilder("ThreadChanger: ");
        sb.append(this.f253856a.getSimpleName());
        sb.append(".");
        sb.append(this.f253857b.getName());
        sb.append("(");
        Class[] parameterTypes = this.f253857b.getParameterTypes();
        int length = parameterTypes.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Class cls = parameterTypes[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getSimpleName());
            i++;
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }
}
