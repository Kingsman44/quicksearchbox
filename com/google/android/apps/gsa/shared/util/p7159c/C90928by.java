package com.google.android.apps.gsa.shared.util.p7159c;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4453d.C57957c;
import com.google.p4449cd.p4453d.C57958d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.shared.util.c.by */
/* compiled from: PG */
public final class C90928by {
    /* renamed from: a */
    public static String m148528a(C57958d dVar, C57938a aVar, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (aVar != null) {
            sb.append(aVar);
            sb.append(",");
        }
        C57957c cVar = dVar.f155001a;
        if (cVar.f155000f) {
            sb.append(dVar.mo54564b());
        } else {
            Class a = dVar.mo54563a();
            StringBuilder sb2 = new StringBuilder();
            if (a != null) {
                C58480gp e = C58485gu.m89837e();
                C90940f.m148553c(e, a);
                e.mo55395g(a);
                C58485gu f = e.mo55394f();
                int i = ((C58724pq) f).f156474d;
                String str2 = BuildConfig.FLAVOR;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj = f.get(i2);
                    if (obj instanceof Class) {
                        str = C90940f.m148551a((Class) obj).getName();
                    } else if (obj instanceof Method) {
                        Method method = (Method) obj;
                        String name = C90940f.m148551a(method.getDeclaringClass()).getName();
                        Class[] parameterTypes = method.getParameterTypes();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(method.getName());
                        sb3.append('(');
                        if (parameterTypes.length > 0) {
                            sb3.append(parameterTypes[0].getName());
                            for (int i3 = 1; i3 < parameterTypes.length; i3++) {
                                sb3.append(',');
                                sb3.append(parameterTypes[i3].getName());
                            }
                        }
                        sb3.append(')');
                        str = name + "." + sb3.toString();
                    } else {
                        str = obj instanceof Constructor ? String.valueOf(C90940f.m148551a(((Constructor) obj).getDeclaringClass()).getName()).concat(".<init>") : obj == null ? "null" : obj.toString();
                    }
                    if (!str.equals("Runnable") && !str.equals("Callable")) {
                        sb2.append(str2);
                        sb2.append(str);
                        str2 = "-";
                    }
                }
            }
            sb.append(sb2);
        }
        if (z) {
            sb.append(" (");
            sb.append(cVar.f154999e);
            sb.append(" task)");
        }
        return sb.toString();
    }
}
