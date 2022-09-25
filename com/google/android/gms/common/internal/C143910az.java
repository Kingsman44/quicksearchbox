package com.google.android.gms.common.internal;

import java.util.List;

/* renamed from: com.google.android.gms.common.internal.az */
/* compiled from: PG */
public final class C143910az {
    /* renamed from: a */
    public static final String m233946a(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m233947b(String str, Object obj, List list) {
        String valueOf = String.valueOf(obj);
        list.add(str + "=" + valueOf);
    }
}
